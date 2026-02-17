package org.computate.spinechamp.model.guesser;

import io.vertx.ext.auth.authorization.AuthorizationProvider;
import io.vertx.ext.auth.oauth2.OAuth2Auth;
import io.vertx.ext.web.client.WebClient;
import io.vertx.core.Future;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import io.vertx.core.WorkerExecutor;
import io.vertx.core.json.JsonObject;
import io.vertx.sqlclient.Pool;

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
public class GuesserEnUSApiServiceImpl extends GuesserEnUSGenApiServiceImpl {

  @Override
  public Future<Guesser> sqlPOSTGuesser(Guesser o, Boolean inheritPrimaryKey) {
    Promise<Guesser> promise = Promise.promise();
    try {
      SiteRequest siteRequest = o.getSiteRequest_();
      JsonObject jsonObject = siteRequest.getJsonObject();
      jsonObject.put(Guesser.VAR_guesserId, Guesser.toId(jsonObject.getString(Guesser.VAR_name)));
      return super.sqlPOSTGuesser(o, inheritPrimaryKey).onSuccess(o2 -> {
        promise.complete(o2);
      }).onFailure(ex -> {
        promise.tryFail(ex);
      });
    } catch(Exception ex) {
      LOG.error(String.format("sqlPOSTGuesser failed. "), ex);
      promise.tryFail(ex);
    }
    return promise.future();
  }
}
