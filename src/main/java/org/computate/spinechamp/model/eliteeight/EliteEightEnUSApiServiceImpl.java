package org.computate.spinechamp.model.eliteeight;

import io.vertx.core.Future;
import io.vertx.core.Promise;
import io.vertx.core.json.JsonObject;
import java.time.ZonedDateTime;
import java.util.Optional;

import org.computate.spinechamp.request.SiteRequest;

/**
 * Translate: false
 **/
public class EliteEightEnUSApiServiceImpl extends EliteEightEnUSGenApiServiceImpl {

  @Override
  public Future<EliteEight> sqlPOSTEliteEight(EliteEight o, Boolean inheritPrimaryKey) {
    Promise<EliteEight> promise = Promise.promise();
    try {
      SiteRequest siteRequest = o.getSiteRequest_();
      JsonObject jsonObject = siteRequest.getJsonObject();
      String guesserId = jsonObject.getString(EliteEight.varJsonEliteEight(EliteEight.VAR_guesserId, false));
      Integer year = Integer.parseInt(jsonObject.getString(EliteEight.varJsonEliteEight(EliteEight.VAR_year, false), Integer.toString(ZonedDateTime.now().getYear())));
      jsonObject.put(EliteEight.varJsonEliteEight(EliteEight.VAR_bracketId, false), EliteEight.toId(String.format("%s-%s", guesserId, year)));
      return super.sqlPOSTEliteEight(o, inheritPrimaryKey).onSuccess(o2 -> {
        promise.complete(o2);
      }).onFailure(ex -> {
        promise.tryFail(ex);
      });
    } catch(Exception ex) {
      LOG.error(String.format("sqlPOSTEliteEight failed. "), ex);
      promise.tryFail(ex);
    }
    return promise.future();
  }

  @Override
  public Future<EliteEight> sqlPATCHEliteEight(EliteEight o, Boolean inheritPrimaryKey) {
    Promise<EliteEight> promise = Promise.promise();
    try {
      SiteRequest siteRequest = o.getSiteRequest_();
      JsonObject jsonObject = siteRequest.getJsonObject();
      String guesserId = Optional.ofNullable(jsonObject.getString(EliteEight.varJsonEliteEight(EliteEight.VAR_guesserId, true))).orElse(o.getGuesserId());
      Integer year = Integer.parseInt(Optional.ofNullable(jsonObject.getString(EliteEight.varJsonEliteEight(EliteEight.VAR_year, true))).orElse(Optional.ofNullable(o.getYear()).map(y -> y.toString()).orElse(Integer.toString(ZonedDateTime.now().getYear()))));
      jsonObject.put(EliteEight.varJsonEliteEight(EliteEight.VAR_bracketId, true), EliteEight.toId(String.format("%s-%s", guesserId, year)));
      return super.sqlPATCHEliteEight(o, inheritPrimaryKey).onSuccess(o2 -> {
        promise.complete(o2);
      }).onFailure(ex -> {
        promise.tryFail(ex);
      });
    } catch(Exception ex) {
      LOG.error(String.format("sqlPOSTEliteEight failed. "), ex);
      promise.tryFail(ex);
    }
    return promise.future();
  }
}
