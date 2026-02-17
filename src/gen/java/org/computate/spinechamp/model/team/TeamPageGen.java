package org.computate.spinechamp.model.team;

import org.computate.spinechamp.request.SiteRequest;
import org.computate.spinechamp.model.team.TeamGenPage;
import org.computate.spinechamp.model.BaseModel;
import org.computate.vertx.api.ApiRequest;
import org.computate.spinechamp.config.ConfigKeys;
import java.util.Optional;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.computate.search.serialize.ComputateLocalDateSerializer;
import org.computate.search.serialize.ComputateLocalDateDeserializer;
import org.computate.search.serialize.ComputateZonedDateTimeSerializer;
import org.computate.search.serialize.ComputateZonedDateTimeDeserializer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import java.math.MathContext;
import org.apache.commons.lang3.math.NumberUtils;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.math.RoundingMode;
import java.util.Map;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;

/**
 * <ol>
<h3>Suggestions that can generate more code for you: </h3> * </ol>
 * <li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these TeamPage objects in a RESTful API. 
 * </li><li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class TeamPageGen into the class TeamPage. 
 * </li>
 * <h3>About the TeamPage class and it's generated class TeamPageGen&lt;TeamGenPage&gt;: </h3>extends TeamPageGen
 * <p>
 * This Java class extends a generated Java class TeamPageGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.team.TeamPage">Find the class TeamPage in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends TeamPageGen<TeamGenPage>
 * <p>This <code>class TeamPage extends TeamPageGen&lt;TeamGenPage&gt;</code>, which means it extends a newly generated TeamPageGen. 
 * The generated <code>class TeamPageGen extends TeamGenPage</code> which means that TeamPage extends TeamPageGen which extends TeamGenPage. 
 * This generated inheritance is a powerful feature that allows a lot of boiler plate code to be created for you automatically while still preserving inheritance through the power of Java Generic classes. 
 * </p>
 * <h2>Api: true</h2>
 * <h2>ApiTag.enUS: true</h2>
 * <h2>ApiUri.enUS: null</h2>
 * <h2>Color: null</h2>
 * <h2>Indexed: true</h2>
 * <h2>{@inheritDoc}</h2>
 * <p>By adding a class comment "{@inheritDoc}", the TeamPage class will inherit the helpful inherited class comments from the super class TeamPageGen. 
 * </p>
 * <h2>Rows: null</h2>
 * <h2>Model: true</h2>
 * <h2>Page: true</h2>
 * <h2>SuperPage.enUS: null</h2>
 * <h2>Promise: true</h2>
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the TeamPage Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
 * </p>
 * <p>
 *   Adding protected void methods beginning with an underscore with a Promise as the only parameter will automatically set `Promise: true`. 
 * </p>
 * <p>
 *   <pre>
 *   
 *   	protected void _promiseBefore(Promise&lt;Void&gt; promise) {
 *   		promise.complete();
 *   	}
 *   </pre>
 * </p>
 * <p>
 *   Java classes with the `Model: true` will automatically set `Promise: true`. 
 * </p>
 * <p>
 *   If a super class of this Java class with `Model: true`, then the child class will also inherit `Promise: true`. 
 * </p>
 * <h2>AName.enUS: null</h2>
 * <p>
 * Delete the class TeamPage in Solr: 
 * <pre>
 * curl -k 'https://solr.apps-crc.testing/solr/computate/update?commitWithin=1000&amp;overwrite=true&amp;wt=json' -X POST -H 'Content-type: text/xml' -u "admin:$(oc -n solr get secret/solr-solrcloud-security-bootstrap -o jsonpath={.data.admin} | base64 -d)" --data-raw '&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.team.TeamPage&lt;/query&gt;&lt;/delete&gt;'
 * </pre>
 * </p>
 * <p>
 * Delete  the package org.computate.spinechamp.model.team in Solr: 
 * <pre>
 * curl -k 'https://solr.apps-crc.testing/solr/computate/update?commitWithin=1000&amp;overwrite=true&amp;wt=json' -X POST -H 'Content-type: text/xml' -u "admin:$(oc -n solr get secret/solr-solrcloud-security-bootstrap -o jsonpath={.data.admin} | base64 -d)" --data-raw '&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.spinechamp.model.team&lt;/query&gt;&lt;/delete&gt;'
 * </pre>
 * </p>
 * <p>
 * Delete  the project spine-champ in Solr: 
 * <pre>
 * curl -k 'https://solr.apps-crc.testing/solr/computate/update?commitWithin=1000&amp;overwrite=true&amp;wt=json' -X POST -H 'Content-type: text/xml' -u "admin:$(oc -n solr get secret/solr-solrcloud-security-bootstrap -o jsonpath={.data.admin} | base64 -d)" --data-raw '&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:spine\-champ&lt;/query&gt;&lt;/delete&gt;'
 * </pre>
 * </p>
 * Generated: true
 **/
public abstract class TeamPageGen<DEV> extends TeamGenPage {
  protected static final Logger LOG = LoggerFactory.getLogger(TeamPage.class);

  //////////////
  // initDeep //
  //////////////

  public Future<TeamPageGen<DEV>> promiseDeepTeamPage(SiteRequest siteRequest_) {
    setSiteRequest_(siteRequest_);
    return promiseDeepTeamPage();
  }

  public Future<TeamPageGen<DEV>> promiseDeepTeamPage() {
    Promise<TeamPageGen<DEV>> promise = Promise.promise();
    Promise<Void> promise2 = Promise.promise();
    promiseTeamPage(promise2);
    promise2.future().onSuccess(a -> {
      super.promiseDeepTeamGenPage(siteRequest_).onSuccess(b -> {
        promise.complete(this);
      }).onFailure(ex -> {
        promise.fail(ex);
      });
    }).onFailure(ex -> {
      promise.fail(ex);
    });
    return promise.future();
  }

  public Future<Void> promiseTeamPage(Promise<Void> promise) {
    Future.future(a -> a.complete()).compose(a -> {
      Promise<Void> promise2 = Promise.promise();
      try {
        promise2.complete();
      } catch(Exception ex) {
        promise2.fail(ex);
      }
      return promise2.future();
    }).onSuccess(a -> {
      promise.complete();
    }).onFailure(ex -> {
      promise.fail(ex);
    });
    return promise.future();
  }

  @Override public Future<? extends TeamPageGen<DEV>> promiseDeepForClass(SiteRequest siteRequest_) {
    return promiseDeepTeamPage(siteRequest_);
  }

  /////////////////
  // siteRequest //
  /////////////////

  public void siteRequestTeamPage(SiteRequest siteRequest_) {
      super.siteRequestTeamGenPage(siteRequest_);
  }

  public void siteRequestForClass(SiteRequest siteRequest_) {
    siteRequestTeamPage(siteRequest_);
  }

  /////////////
  // obtain //
  /////////////

  @Override public Object obtainForClass(String var) {
    String[] vars = StringUtils.split(var, ".");
    Object o = null;
    for(String v : vars) {
      if(o == null)
        o = obtainTeamPage(v);
      else if(o instanceof BaseModel) {
        BaseModel baseModel = (BaseModel)o;
        o = baseModel.obtainForClass(v);
      }
      else if(o instanceof Map) {
        Map<?, ?> map = (Map<?, ?>)o;
        o = map.get(v);
      }
    }
    return o;
  }
  public Object obtainTeamPage(String var) {
    TeamPage oTeamPage = (TeamPage)this;
    switch(var) {
      default:
        return super.obtainTeamGenPage(var);
    }
  }

  ///////////////
  // relate //
  ///////////////

  @Override public boolean relateForClass(String var, Object val) {
    String[] vars = StringUtils.split(var, ".");
    Object o = null;
    for(String v : vars) {
      if(o == null)
        o = relateTeamPage(v, val);
      else if(o instanceof BaseModel) {
        BaseModel baseModel = (BaseModel)o;
        o = baseModel.relateForClass(v, val);
      }
    }
    return o != null;
  }
  public Object relateTeamPage(String var, Object val) {
    TeamPage oTeamPage = (TeamPage)this;
    switch(var) {
      default:
        return super.relateTeamGenPage(var, val);
    }
  }

  ///////////////
  // staticSet //
  ///////////////

  public static Object staticSetForClass(String entityVar, SiteRequest siteRequest_, String v, TeamPage o) {
    return staticSetTeamPage(entityVar,  siteRequest_, v, o);
  }
  public static Object staticSetTeamPage(String entityVar, SiteRequest siteRequest_, String v, TeamPage o) {
    switch(entityVar) {
      default:
        return TeamGenPage.staticSetTeamGenPage(entityVar,  siteRequest_, v, o);
    }
  }

  ////////////////
  // staticSearch //
  ////////////////

  public static Object staticSearchForClass(String entityVar, SiteRequest siteRequest_, Object o) {
    return staticSearchTeamPage(entityVar,  siteRequest_, o);
  }
  public static Object staticSearchTeamPage(String entityVar, SiteRequest siteRequest_, Object o) {
    switch(entityVar) {
      default:
        return TeamGenPage.staticSearchTeamGenPage(entityVar,  siteRequest_, o);
    }
  }

  ///////////////////
  // staticSearchStr //
  ///////////////////

  public static String staticSearchStrForClass(String entityVar, SiteRequest siteRequest_, Object o) {
    return staticSearchStrTeamPage(entityVar,  siteRequest_, o);
  }
  public static String staticSearchStrTeamPage(String entityVar, SiteRequest siteRequest_, Object o) {
    switch(entityVar) {
      default:
        return TeamGenPage.staticSearchStrTeamGenPage(entityVar,  siteRequest_, o);
    }
  }

  //////////////////
  // staticSearchFq //
  //////////////////

  public static String staticSearchFqForClass(String entityVar, SiteRequest siteRequest_, String o) {
    return staticSearchFqTeamPage(entityVar,  siteRequest_, o);
  }
  public static String staticSearchFqTeamPage(String entityVar, SiteRequest siteRequest_, String o) {
    switch(entityVar) {
      default:
        return TeamGenPage.staticSearchFqTeamGenPage(entityVar,  siteRequest_, o);
    }
  }

  //////////////
  // toString //
  //////////////

  @Override public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(super.toString());
    return sb.toString();
  }

  public static final String CLASS_SIMPLE_NAME = "TeamPage";
  public static final String CLASS_CANONICAL_NAME = "org.computate.spinechamp.model.team.TeamPage";
  public static final String CLASS_AUTH_RESOURCE = "";


  @Override
  public String idForClass() {
    return null;
  }

  @Override
  public String titleForClass() {
    return null;
  }

  @Override
  public String nameForClass() {
    return null;
  }

  @Override
  public String classNameAdjectiveSingularForClass() {
    return null;
  }

  @Override
  public String descriptionForClass() {
    return null;
  }

  @Override
  public String enUSStringFormatUrlEditPageForClass() {
    return null;
  }

  @Override
  public String enUSStringFormatUrlDisplayPageForClass() {
    return null;
  }

  @Override
  public String enUSStringFormatUrlUserPageForClass() {
    return null;
  }

  @Override
  public String enUSStringFormatUrlDownloadForClass() {
    return null;
  }

  public static String displayNameForClass(String var) {
    return TeamPage.displayNameTeamPage(var);
  }
  public static String displayNameTeamPage(String var) {
    switch(var) {
    default:
      return TeamGenPage.displayNameTeamGenPage(var);
    }
  }

  public static String descriptionTeamPage(String var) {
    if(var == null)
      return null;
    switch(var) {
      default:
        return TeamGenPage.descriptionTeamGenPage(var);
    }
  }

  public static String classSimpleNameTeamPage(String var) {
    switch(var) {
      default:
        return TeamGenPage.classSimpleNameTeamGenPage(var);
    }
  }

  public static Integer htmColumnTeamPage(String var) {
    switch(var) {
      default:
        return TeamGenPage.htmColumnTeamGenPage(var);
    }
  }

  public static Integer htmRowTeamPage(String var) {
    switch(var) {
      default:
        return TeamGenPage.htmRowTeamGenPage(var);
    }
  }

  public static Integer htmCellTeamPage(String var) {
    switch(var) {
      default:
        return TeamGenPage.htmCellTeamGenPage(var);
    }
  }

  public static Integer lengthMinTeamPage(String var) {
    switch(var) {
      default:
        return TeamGenPage.lengthMinTeamGenPage(var);
    }
  }

  public static Integer lengthMaxTeamPage(String var) {
    switch(var) {
      default:
        return TeamGenPage.lengthMaxTeamGenPage(var);
    }
  }

  public static Integer maxTeamPage(String var) {
    switch(var) {
      default:
        return TeamGenPage.maxTeamGenPage(var);
    }
  }

  public static Integer minTeamPage(String var) {
    switch(var) {
      default:
        return TeamGenPage.minTeamGenPage(var);
    }
  }
}
