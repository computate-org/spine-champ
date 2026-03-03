package org.computate.spinechamp.model.championship;

import io.vertx.core.Future;
import io.vertx.core.Promise;
import io.vertx.core.json.JsonObject;
import java.time.ZonedDateTime;
import java.util.Optional;

import org.computate.spinechamp.request.SiteRequest;

/**
 * Translate: false
 **/
public class ChampionshipEnUSApiServiceImpl extends ChampionshipEnUSGenApiServiceImpl {

  @Override
  public Future<Championship> sqlPOSTChampionship(Championship o, Boolean inheritPrimaryKey) {
    Promise<Championship> promise = Promise.promise();
    try {
      SiteRequest siteRequest = o.getSiteRequest_();
      JsonObject jsonObject = siteRequest.getJsonObject();
      String guesserId = jsonObject.getString(Championship.varJsonChampionship(Championship.VAR_guesserId, false));
      Integer year = Integer.parseInt(jsonObject.getString(Championship.varJsonChampionship(Championship.VAR_year, false), Integer.toString(ZonedDateTime.now().getYear())));
      jsonObject.put(Championship.varJsonChampionship(Championship.VAR_bracketId, false), Championship.toId(String.format("%s-%s", guesserId, year)));
      return super.sqlPOSTChampionship(o, inheritPrimaryKey).onSuccess(o2 -> {
        promise.complete(o2);
      }).onFailure(ex -> {
        promise.tryFail(ex);
      });
    } catch(Exception ex) {
      LOG.error(String.format("sqlPOSTChampionship failed. "), ex);
      promise.tryFail(ex);
    }
    return promise.future();
  }

  @Override
  public Future<Championship> sqlPATCHChampionship(Championship o, Boolean inheritPrimaryKey) {
    Promise<Championship> promise = Promise.promise();
    try {
      SiteRequest siteRequest = o.getSiteRequest_();
      JsonObject jsonObject = siteRequest.getJsonObject();
      String guesserId = Optional.ofNullable(jsonObject.getString(Championship.varJsonChampionship(Championship.VAR_guesserId, true))).orElse(o.getGuesserId());
      Integer year = Integer.parseInt(Optional.ofNullable(jsonObject.getString(Championship.varJsonChampionship(Championship.VAR_year, true))).orElse(Optional.ofNullable(o.getYear()).map(y -> y.toString()).orElse(Integer.toString(ZonedDateTime.now().getYear()))));
      jsonObject.put(Championship.varJsonChampionship(Championship.VAR_bracketId, true), Championship.toId(String.format("%s-%s", guesserId, year)));
      return super.sqlPATCHChampionship(o, inheritPrimaryKey).onSuccess(o2 -> {
        promise.complete(o2);
      }).onFailure(ex -> {
        promise.tryFail(ex);
      });
    } catch(Exception ex) {
      LOG.error(String.format("sqlPOSTChampionship failed. "), ex);
      promise.tryFail(ex);
    }
    return promise.future();
  }
}
