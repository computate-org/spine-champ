package org.computate.spinechamp.model.team;

import io.vertx.core.Future;
import io.vertx.core.Promise;
import io.vertx.core.json.JsonObject;

import io.vertx.core.Future;
import io.vertx.core.MultiMap;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import io.vertx.core.eventbus.DeliveryOptions;
import io.vertx.core.http.HttpResponseExpectation;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.auth.authentication.UsernamePasswordCredentials;

import java.net.URLEncoder;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.computate.search.tool.SearchTool;
import org.computate.vertx.config.ComputateConfigKeys;
import org.computate.vertx.request.ComputateSiteRequest;
import org.computate.vertx.search.list.SearchList;
import org.computate.spinechamp.config.ConfigKeys;
import org.computate.spinechamp.request.SiteRequest;

/**
 * Translate: false
 **/
public class TeamEnUSApiServiceImpl extends TeamEnUSGenApiServiceImpl {

  public Future<Void> importTeam(JsonObject teamData, String classSimpleName, String classApiAddress, String teamAbbreviation) {
    Promise<Void> promise = Promise.promise();
    try {
      String teamName = teamData.getString(Team.VAR_name);
      String teamRegion = teamData.getString(Team.VAR_region);
      String teamId = Team.toId(teamAbbreviation);
      JsonObject body = new JsonObject();
      body.put(Team.VAR_pk, teamId);
      body.put(Team.VAR_name, teamName);
      body.put(Team.VAR_region, teamRegion);
      body.put(Team.VAR_abbreviation, teamAbbreviation);
      body.put(Team.VAR_teamId, teamId);

      JsonObject pageParams = new JsonObject();
      pageParams.put("body", body);
      pageParams.put("path", new JsonObject());
      pageParams.put("cookie", new JsonObject());
      pageParams.put("query", new JsonObject().put("softCommit", true).put("q", "*:*").put("var", new JsonArray().add("refresh:false")));
      pageParams.put("scopes", new JsonArray().add("GET").add("POST").add("PATCH").add("PUT"));
      JsonObject pageContext = new JsonObject().put("params", pageParams);
      JsonObject pageRequest = new JsonObject().put("context", pageContext);

      vertx.eventBus().request(classApiAddress, pageRequest, new DeliveryOptions()
          .setSendTimeout(config.getLong(ComputateConfigKeys.VERTX_MAX_EVENT_LOOP_EXECUTE_TIME) * 1000)
          .addHeader("action", String.format("putimport%sFuture", classSimpleName))
          ).onSuccess(message -> {
        LOG.info(String.format("Imported %s Team", teamAbbreviation));
        promise.complete();
      }).onFailure(ex -> {
        LOG.error(String.format(importDataFail, classSimpleName), ex);
        promise.fail(ex);
      });
    } catch(Exception ex) {
      LOG.error(String.format(importDataFail, classSimpleName), ex);
      promise.fail(ex);
    }
    return promise.future();
  }

  protected Future<Void> importTeamsFromEnv(Path pagePath, Vertx vertx, ComputateSiteRequest siteRequest, String classCanonicalName, String classSimpleName, String classApiAddress, String classAuthResource, String varPageId, String varUserUrl, String varDownload) {
    Promise<Void> promise = Promise.promise();
    try {
      String templatePath = String.format("%s/json/teams.json", config.getString(ConfigKeys.STATIC_PATH));
      vertx.fileSystem().readFile(templatePath).onSuccess(buffer -> {
        try {
          JsonObject teamsBody = new JsonObject(buffer);
          JsonArray teamsJson = teamsBody.getJsonArray("teams");
          List<Future<?>> futures = new ArrayList<>();
          teamsJson.stream().map(o -> (JsonObject)o).forEach(teamData -> {
            String abbreviation = teamData.getString("abbrev");
            futures.add(Future.future(promise1 -> {
              importTeam(teamData, Team.CLASS_SIMPLE_NAME, Team.CLASS_API_ADDRESS_Team, abbreviation).onComplete(b -> {
                promise1.complete();
              }).onFailure(ex -> {
                LOG.error(String.format(importDataFail, Team.CLASS_SIMPLE_NAME), ex);
                promise1.fail(ex);
              });
            }));
          });
          Future.all(futures).onSuccess(b -> {
            promise.complete();
          }).onFailure(ex -> {
            LOG.error(String.format(importDataFail, Team.CLASS_SIMPLE_NAME), ex);
            promise.fail(ex);
          });
        } catch(Exception ex) {
          LOG.error(String.format("Failed to import teams from file: %s", templatePath), ex);
          promise.fail(ex);
        }
      }).onFailure(ex -> {
        LOG.error(String.format("Failed to import teams from file: %s", templatePath), ex);
        promise.fail(ex);
      });
    } catch(Throwable ex) {
      LOG.error(String.format(importDataFail, Team.CLASS_SIMPLE_NAME), ex);
      promise.fail(ex);
    }
    return promise.future();
  }

  @Override
  public Future<Void> importData(Path pagePath, Vertx vertx, ComputateSiteRequest siteRequest, String classCanonicalName,
      String classSimpleName, String classApiAddress, String classAuthResource, String varPageId, String varUserUrl, String varDownload) {
    Promise<Void> promise = Promise.promise();
    importTeamsFromEnv(pagePath, vertx, siteRequest, classCanonicalName, classSimpleName, classApiAddress, classAuthResource, varPageId, varUserUrl, varDownload).onSuccess(a -> {
      promise.complete();
    }).onFailure(ex -> {
      LOG.error(String.format(importDataFail, classSimpleName), ex);
      promise.fail(ex);
    });
    return promise.future();
  }
}
