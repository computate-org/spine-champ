package org.computate.spinechamp.model.sweetsixteen;

import io.vertx.ext.auth.authorization.AuthorizationProvider;
import io.vertx.ext.auth.oauth2.OAuth2Auth;
import io.vertx.ext.web.client.WebClient;
import io.vertx.core.Future;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import io.vertx.core.WorkerExecutor;
import io.vertx.core.json.JsonObject;
import io.vertx.sqlclient.Pool;

import java.time.ZonedDateTime;

import org.computate.spinechamp.request.SiteRequest;
import org.computate.vertx.openapi.ComputateOAuth2AuthHandlerImpl;
import io.vertx.kafka.client.producer.KafkaProducer;
import io.vertx.mqtt.MqttClient;
import io.vertx.amqp.AmqpSender;
import io.vertx.rabbitmq.RabbitMQClient;
import com.hubspot.jinjava.Jinjava;

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
      String guesserId = jsonObject.getString(SweetSixteen.VAR_guesserId);
      Integer year = Integer.parseInt(jsonObject.getString(SweetSixteen.VAR_year, Integer.toString(ZonedDateTime.now().getYear())));
      jsonObject.put(SweetSixteen.VAR_bracketId, SweetSixteen.toId(String.format("%s-%s", guesserId, year)));
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
}
