package org.computate.spinechamp.model.finalfour;

import io.vertx.core.Future;
import io.vertx.core.Promise;
import io.vertx.core.json.JsonObject;
import java.time.ZonedDateTime;
import java.util.Optional;

import org.computate.spinechamp.request.SiteRequest;

/**
 * Translate: false
 **/
public class FinalFourEnUSApiServiceImpl extends FinalFourEnUSGenApiServiceImpl {

  @Override
  public Future<FinalFour> sqlPOSTFinalFour(FinalFour o, Boolean inheritPrimaryKey) {
    Promise<FinalFour> promise = Promise.promise();
    try {
      SiteRequest siteRequest = o.getSiteRequest_();
      JsonObject jsonObject = siteRequest.getJsonObject();
      String guesserId = jsonObject.getString(FinalFour.varJsonFinalFour(FinalFour.VAR_guesserId, false));
      Integer year = Integer.parseInt(jsonObject.getString(FinalFour.varJsonFinalFour(FinalFour.VAR_year, false), Integer.toString(ZonedDateTime.now().getYear())));
      jsonObject.put(FinalFour.varJsonFinalFour(FinalFour.VAR_bracketId, false), FinalFour.toId(String.format("%s-%s", guesserId, year)));
      return super.sqlPOSTFinalFour(o, inheritPrimaryKey).onSuccess(o2 -> {
        promise.complete(o2);
      }).onFailure(ex -> {
        promise.tryFail(ex);
      });
    } catch(Exception ex) {
      LOG.error(String.format("sqlPOSTFinalFour failed. "), ex);
      promise.tryFail(ex);
    }
    return promise.future();
  }

  @Override
  public Future<FinalFour> sqlPATCHFinalFour(FinalFour o, Boolean inheritPrimaryKey) {
    Promise<FinalFour> promise = Promise.promise();
    try {
      SiteRequest siteRequest = o.getSiteRequest_();
      JsonObject jsonObject = siteRequest.getJsonObject();
      String guesserId = Optional.ofNullable(jsonObject.getString(FinalFour.varJsonFinalFour(FinalFour.VAR_guesserId, true))).orElse(o.getGuesserId());
      Integer year = Integer.parseInt(Optional.ofNullable(jsonObject.getString(FinalFour.varJsonFinalFour(FinalFour.VAR_year, true))).orElse(Optional.ofNullable(o.getYear()).map(y -> y.toString()).orElse(Integer.toString(ZonedDateTime.now().getYear()))));
      jsonObject.put(FinalFour.varJsonFinalFour(FinalFour.VAR_bracketId, true), FinalFour.toId(String.format("%s-%s", guesserId, year)));
      return super.sqlPATCHFinalFour(o, inheritPrimaryKey).onSuccess(o2 -> {
        promise.complete(o2);
      }).onFailure(ex -> {
        promise.tryFail(ex);
      });
    } catch(Exception ex) {
      LOG.error(String.format("sqlPOSTFinalFour failed. "), ex);
      promise.tryFail(ex);
    }
    return promise.future();
  }
}
