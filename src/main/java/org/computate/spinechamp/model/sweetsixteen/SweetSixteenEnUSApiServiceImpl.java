package org.computate.spinechamp.model.sweetsixteen;

import io.vertx.core.Future;
import io.vertx.core.Promise;
import io.vertx.core.json.JsonObject;
import java.time.ZonedDateTime;
import java.util.Optional;

import org.computate.spinechamp.request.SiteRequest;

/**
 * Translate: false
 **/
public class SweetSixteenEnUSApiServiceImpl extends SweetSixteenEnUSGenApiServiceImpl {

  @Override
  public Future<SweetSixteen> sqlPOSTSweetSixteen(SweetSixteen o, Boolean inheritPrimaryKey) {
    Promise<SweetSixteen> promise = Promise.promise();
    try {
      SiteRequest siteRequest = o.getSiteRequest_();
      JsonObject jsonObject = siteRequest.getJsonObject();
      String guesserId = jsonObject.getString(SweetSixteen.varJsonSweetSixteen(SweetSixteen.VAR_guesserId, false));
      Integer year = Integer.parseInt(jsonObject.getString(SweetSixteen.varJsonSweetSixteen(SweetSixteen.VAR_year, false), Integer.toString(ZonedDateTime.now().getYear())));
      jsonObject.put(SweetSixteen.varJsonSweetSixteen(SweetSixteen.VAR_bracketId, false), SweetSixteen.toId(String.format("%s-%s", guesserId, year)));
      return super.sqlPOSTSweetSixteen(o, inheritPrimaryKey).onSuccess(o2 -> {
        promise.complete(o2);
      }).onFailure(ex -> {
        promise.tryFail(ex);
      });
    } catch(Exception ex) {
      LOG.error(String.format("sqlPOSTSweetSixteen failed. "), ex);
      promise.tryFail(ex);
    }
    return promise.future();
  }

  @Override
  public Future<SweetSixteen> sqlPATCHSweetSixteen(SweetSixteen o, Boolean inheritPrimaryKey) {
    Promise<SweetSixteen> promise = Promise.promise();
    try {
      SiteRequest siteRequest = o.getSiteRequest_();
      JsonObject jsonObject = siteRequest.getJsonObject();
      String guesserId = Optional.ofNullable(jsonObject.getString(SweetSixteen.varJsonSweetSixteen(SweetSixteen.VAR_guesserId, true))).orElse(o.getGuesserId());
      Integer year = Integer.parseInt(Optional.ofNullable(jsonObject.getString(SweetSixteen.varJsonSweetSixteen(SweetSixteen.VAR_year, true))).orElse(Optional.ofNullable(o.getYear()).map(y -> y.toString()).orElse(Integer.toString(ZonedDateTime.now().getYear()))));
      jsonObject.put(SweetSixteen.varJsonSweetSixteen(SweetSixteen.VAR_bracketId, true), SweetSixteen.toId(String.format("%s-%s", guesserId, year)));
      return super.sqlPATCHSweetSixteen(o, inheritPrimaryKey).onSuccess(o2 -> {
        promise.complete(o2);
      }).onFailure(ex -> {
        promise.tryFail(ex);
      });
    } catch(Exception ex) {
      LOG.error(String.format("sqlPOSTSweetSixteen failed. "), ex);
      promise.tryFail(ex);
    }
    return promise.future();
  }
}
