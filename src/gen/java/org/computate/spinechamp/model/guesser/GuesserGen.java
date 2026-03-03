package org.computate.spinechamp.model.guesser;

import org.computate.spinechamp.request.SiteRequest;
import org.computate.spinechamp.model.BaseModel;
import io.vertx.core.json.JsonObject;
import java.util.Date;
import java.util.Set;
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
import java.lang.String;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import org.computate.vertx.search.list.SearchList;
import org.computate.search.tool.SearchTool;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.response.solr.SolrResponse;

/**
 * <ol>
<h3>Suggestions that can generate more code for you: </h3> * </ol>
 * <li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class GuesserGen into the class Guesser. 
 * </li><li>You can add a class comment "Rows: 100" if you wish the Guesser API to return more or less than 10 records by default. 
 * In this case, the API will return 100 records from the API instead of 10 by default. 
 * Each API has built in pagination of the search records to ensure a user can query all the data a page at a time without running the application out of memory. 
 * </li>
 * <h3>About the Guesser class and it's generated class GuesserGen&lt;BaseModel&gt;: </h3>extends GuesserGen
 * <p>
 * This Java class extends a generated Java class GuesserGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.guesser.Guesser">Find the class Guesser in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends GuesserGen<BaseModel>
 * <p>This <code>class Guesser extends GuesserGen&lt;BaseModel&gt;</code>, which means it extends a newly generated GuesserGen. 
 * The generated <code>class GuesserGen extends BaseModel</code> which means that Guesser extends GuesserGen which extends BaseModel. 
 * This generated inheritance is a powerful feature that allows a lot of boiler plate code to be created for you automatically while still preserving inheritance through the power of Java Generic classes. 
 * </p>
 * <h2>Api: true</h2>
 * <p>This class contains a comment <b>"Api: true"</b>, which means this class will have Java Vert.x API backend code generated for these objects. 
 * </p>
 * <h2>ApiTag.enUS: true</h2>
 * <p>This class contains a comment <b>"ApiTag: guessers"</b>, which groups all of the OpenAPIs for Guesser objects under the tag "guessers". 
 * </p>
 * <h2>ApiUri.enUS: /en-us/api/guesser</h2>
 * <p>This class contains a comment <b>"ApiUri: /en-us/api/guesser"</b>, which defines the base API URI for Guesser objects as "/en-us/api/guesser" in the OpenAPI spec. 
 * </p>
 * <h2>Color: null</h2>
 * <h2>Indexed: true</h2>
 * <p>This class contains a comment <b>"Indexed: true"</b>, which means this class will be indexed in the search engine. 
 * Every protected void method that begins with "_" that is marked to be searched with a comment like "Indexed: true", "Stored: true", or "DocValues: true" will be indexed in the search engine. 
 * </p>
 * <h2>{@inheritDoc}</h2>
 * <p>By adding a class comment "{@inheritDoc}", the Guesser class will inherit the helpful inherited class comments from the super class GuesserGen. 
 * </p>
 * <h2>Rows: null</h2>
 * <h2>Order: 6</h2>
 * <p>This class contains a comment <b>"Order: 6"</b>, which means this class will be sorted by the given number 6 ascending when code that relates to multiple classes at the same time is generated. 
 * </p>
 * <h2>SqlOrder: 6</h2>
 * <p>This class contains a comment <b>"SqlOrder: 6"</b>, which means this class will be sorted by the given number 6 ascending when SQL code to create and drop the tables is generated. 
 * </p>
 * <h2>Model: true</h2>
 * <p>This class contains a comment <b>"Model: true"</b>, which means this class will be stored in the database. 
 * Every protected void method that begins with "_" that contains a "Persist: true" comment will be a persisted field in the database table. 
 * </p>
 * <h2>Page: true</h2>
 * <p>This class contains a comment <b>"Page: true"</b>, which means this class will have webpage code generated for these objects. 
 * Java Vert.x backend API code, Handlebars HTML template frontend code, and JavaScript code will all generated and can be extended. 
 * This creates a new Java class org.computate.spinechamp.model.guesser.GuesserPage. 
 * </p>
 * <h2>SuperPage.enUS: PageLayout</h2>
 * <p>This class contains a comment <b>"SuperPage.enUS: PageLayout"</b>, which identifies the Java super class of the page code by it's class simple name "PageLayout". 
 * This means that the newly created class org.computate.spinechamp.model.guesser.GuesserPage extends org.computate.spinechamp.page.PageLayout. 
 * </p>
 * <h2>Promise: true</h2>
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the Guesser Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * <h2>AName.enUS: a guesser</h2>
 * <p>This class contains a comment <b>"AName.enUS: a guesser"</b>, which identifies the language context to describe a Guesser as "a guesser". 
 * </p>
 * <p>
 * Delete the class Guesser in Solr: 
 * <pre>
 * curl -k 'https://solr.apps-crc.testing/solr/computate/update?commitWithin=1000&amp;overwrite=true&amp;wt=json' -X POST -H 'Content-type: text/xml' -u "admin:$(oc -n solr get secret/solr-solrcloud-security-bootstrap -o jsonpath={.data.admin} | base64 -d)" --data-raw '&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.guesser.Guesser&lt;/query&gt;&lt;/delete&gt;'
 * </pre>
 * </p>
 * <p>
 * Delete  the package org.computate.spinechamp.model.guesser in Solr: 
 * <pre>
 * curl -k 'https://solr.apps-crc.testing/solr/computate/update?commitWithin=1000&amp;overwrite=true&amp;wt=json' -X POST -H 'Content-type: text/xml' -u "admin:$(oc -n solr get secret/solr-solrcloud-security-bootstrap -o jsonpath={.data.admin} | base64 -d)" --data-raw '&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.spinechamp.model.guesser&lt;/query&gt;&lt;/delete&gt;'
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
public abstract class GuesserGen<DEV> extends BaseModel {
  protected static final Logger LOG = LoggerFactory.getLogger(Guesser.class);

  public static final String Description_enUS = "a person guessing on a tournament. ";
  public static final String AName_enUS = "a guesser";
  public static final String This_enUS = "this ";
  public static final String ThisName_enUS = "this guesser";
  public static final String A_enUS = "a ";
  public static final String TheName_enUS = "the guesser";
  public static final String SingularName_enUS = "guesser";
  public static final String PluralName_enUS = "guessers";
  public static final String NameActual_enUS = "current guesser";
  public static final String AllName_enUS = "all guessers";
  public static final String SearchAllNameBy_enUS = "search guessers by ";
  public static final String SearchAllName_enUS = "search guessers";
  public static final String Title_enUS = "guessers";
  public static final String ThePluralName_enUS = "the guessers";
  public static final String NoNameFound_enUS = "no guesser found";
  public static final String ApiUri_enUS = "/en-us/api/guesser";
  public static final String ApiUriSearchPage_enUS = "/en-us/search/guesser";
  public static final String ApiUriEditPage_enUS = "/en-us/edit/guesser/{guesserId}";
  public static final String OfName_enUS = "of guesser";
  public static final String ANameAdjective_enUS = "a guesser";
  public static final String NameAdjectiveSingular_enUS = "guesser";
  public static final String NameAdjectivePlural_enUS = "guessers";
  public static final String Search_enUS_OpenApiUri = "/en-us/api/guesser";
  public static final String Search_enUS_StringFormatUri = "/en-us/api/guesser";
  public static final String Search_enUS_StringFormatUrl = "%s/en-us/api/guesser";
  public static final String GET_enUS_OpenApiUri = "/en-us/api/guesser/{guesserId}";
  public static final String GET_enUS_StringFormatUri = "/en-us/api/guesser/%s";
  public static final String GET_enUS_StringFormatUrl = "%s/en-us/api/guesser/%s";
  public static final String PATCH_enUS_OpenApiUri = "/en-us/api/guesser";
  public static final String PATCH_enUS_StringFormatUri = "/en-us/api/guesser";
  public static final String PATCH_enUS_StringFormatUrl = "%s/en-us/api/guesser";
  public static final String POST_enUS_OpenApiUri = "/en-us/api/guesser";
  public static final String POST_enUS_StringFormatUri = "/en-us/api/guesser";
  public static final String POST_enUS_StringFormatUrl = "%s/en-us/api/guesser";
  public static final String DELETE_enUS_OpenApiUri = "/en-us/api/guesser/{guesserId}";
  public static final String DELETE_enUS_StringFormatUri = "/en-us/api/guesser/%s";
  public static final String DELETE_enUS_StringFormatUrl = "%s/en-us/api/guesser/%s";
  public static final String PUTImport_enUS_OpenApiUri = "/en-us/api/guesser-import";
  public static final String PUTImport_enUS_StringFormatUri = "/en-us/api/guesser-import";
  public static final String PUTImport_enUS_StringFormatUrl = "%s/en-us/api/guesser-import";
  public static final String SearchPage_enUS_OpenApiUri = "/en-us/search/guesser";
  public static final String SearchPage_enUS_StringFormatUri = "/en-us/search/guesser";
  public static final String SearchPage_enUS_StringFormatUrl = "%s/en-us/search/guesser";
  public static final String EditPage_enUS_OpenApiUri = "/en-us/edit/guesser/{guesserId}";
  public static final String EditPage_enUS_StringFormatUri = "/en-us/edit/guesser/%s";
  public static final String EditPage_enUS_StringFormatUrl = "%s/en-us/edit/guesser/%s";
  public static final String DELETEFilter_enUS_OpenApiUri = "/en-us/api/guesser";
  public static final String DELETEFilter_enUS_StringFormatUri = "/en-us/api/guesser";
  public static final String DELETEFilter_enUS_StringFormatUrl = "%s/en-us/api/guesser";

  public static final String Icon = "<i class=\"fa-regular fa-buildings\"></i>";

	//////////
  // name //
	//////////


  /**
   *  The entity name
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String name;

  /**
   * <br> The entity name
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.guesser.Guesser&fq=entiteVar_enUS_indexed_string:name">Find the entity name in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _name(Wrap<String> w);

  public String getName() {
    return name;
  }
  public void setName(String o) {
    this.name = Guesser.staticSetName(siteRequest_, o);
  }
  public static String staticSetName(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected Guesser nameInit() {
    Wrap<String> nameWrap = new Wrap<String>().var("name");
    if(name == null) {
      _name(nameWrap);
      Optional.ofNullable(nameWrap.getO()).ifPresent(o -> {
        setName(o);
      });
    }
    return (Guesser)this;
  }

  public static String staticSearchName(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrName(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqName(SiteRequest siteRequest_, String o) {
    return Guesser.staticSearchName(siteRequest_, Guesser.staticSetName(siteRequest_, o)).toString();
  }

  public String sqlName() {
    return name;
  }

  public static String staticJsonName(String name) {
    return name;
  }

	///////////////
  // guesserId //
	///////////////


  /**
   *  The entity guesserId
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String guesserId;

  /**
   * <br> The entity guesserId
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.guesser.Guesser&fq=entiteVar_enUS_indexed_string:guesserId">Find the entity guesserId in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _guesserId(Wrap<String> w);

  public String getGuesserId() {
    return guesserId;
  }
  public void setGuesserId(String o) {
    this.guesserId = Guesser.staticSetGuesserId(siteRequest_, o);
  }
  public static String staticSetGuesserId(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected Guesser guesserIdInit() {
    Wrap<String> guesserIdWrap = new Wrap<String>().var("guesserId");
    if(guesserId == null) {
      _guesserId(guesserIdWrap);
      Optional.ofNullable(guesserIdWrap.getO()).ifPresent(o -> {
        setGuesserId(o);
      });
    }
    return (Guesser)this;
  }

  public static String staticSearchGuesserId(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrGuesserId(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqGuesserId(SiteRequest siteRequest_, String o) {
    return Guesser.staticSearchGuesserId(siteRequest_, Guesser.staticSetGuesserId(siteRequest_, o)).toString();
  }

  public String sqlGuesserId() {
    return guesserId;
  }

  public static String staticJsonGuesserId(String guesserId) {
    return guesserId;
  }

	/////////////////
  // description //
	/////////////////


  /**
   *  The entity description
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String description;

  /**
   * <br> The entity description
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.guesser.Guesser&fq=entiteVar_enUS_indexed_string:description">Find the entity description in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _description(Wrap<String> w);

  public String getDescription() {
    return description;
  }
  public void setDescription(String o) {
    this.description = Guesser.staticSetDescription(siteRequest_, o);
  }
  public static String staticSetDescription(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected Guesser descriptionInit() {
    Wrap<String> descriptionWrap = new Wrap<String>().var("description");
    if(description == null) {
      _description(descriptionWrap);
      Optional.ofNullable(descriptionWrap.getO()).ifPresent(o -> {
        setDescription(o);
      });
    }
    return (Guesser)this;
  }

  public static String staticSearchDescription(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrDescription(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqDescription(SiteRequest siteRequest_, String o) {
    return Guesser.staticSearchDescription(siteRequest_, Guesser.staticSetDescription(siteRequest_, o)).toString();
  }

  public String sqlDescription() {
    return description;
  }

  public static String staticJsonDescription(String description) {
    return description;
  }

  //////////////
  // initDeep //
  //////////////

  public Future<GuesserGen<DEV>> promiseDeepGuesser(SiteRequest siteRequest_) {
    setSiteRequest_(siteRequest_);
    return promiseDeepGuesser();
  }

  public Future<GuesserGen<DEV>> promiseDeepGuesser() {
    Promise<GuesserGen<DEV>> promise = Promise.promise();
    Promise<Void> promise2 = Promise.promise();
    promiseGuesser(promise2);
    promise2.future().onSuccess(a -> {
      super.promiseDeepBaseModel(siteRequest_).onSuccess(b -> {
        promise.complete(this);
      }).onFailure(ex -> {
        promise.fail(ex);
      });
    }).onFailure(ex -> {
      promise.fail(ex);
    });
    return promise.future();
  }

  public Future<Void> promiseGuesser(Promise<Void> promise) {
    Future.future(a -> a.complete()).compose(a -> {
      Promise<Void> promise2 = Promise.promise();
      try {
        nameInit();
        guesserIdInit();
        descriptionInit();
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

  @Override public Future<? extends GuesserGen<DEV>> promiseDeepForClass(SiteRequest siteRequest_) {
    return promiseDeepGuesser(siteRequest_);
  }

  /////////////////
  // siteRequest //
  /////////////////

  public void siteRequestGuesser(SiteRequest siteRequest_) {
      super.siteRequestBaseModel(siteRequest_);
  }

  public void siteRequestForClass(SiteRequest siteRequest_) {
    siteRequestGuesser(siteRequest_);
  }

  /////////////
  // obtain //
  /////////////

  @Override public Object obtainForClass(String var) {
    String[] vars = StringUtils.split(var, ".");
    Object o = null;
    for(String v : vars) {
      if(o == null)
        o = obtainGuesser(v);
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
  public Object obtainGuesser(String var) {
    Guesser oGuesser = (Guesser)this;
    switch(var) {
      case "name":
        return oGuesser.name;
      case "guesserId":
        return oGuesser.guesserId;
      case "description":
        return oGuesser.description;
      default:
        return super.obtainBaseModel(var);
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
        o = relateGuesser(v, val);
      else if(o instanceof BaseModel) {
        BaseModel baseModel = (BaseModel)o;
        o = baseModel.relateForClass(v, val);
      }
    }
    return o != null;
  }
  public Object relateGuesser(String var, Object val) {
    Guesser oGuesser = (Guesser)this;
    switch(var) {
      default:
        return super.relateBaseModel(var, val);
    }
  }

  ///////////////
  // staticSet //
  ///////////////

  public static Object staticSetForClass(String entityVar, SiteRequest siteRequest_, String v, Guesser o) {
    return staticSetGuesser(entityVar,  siteRequest_, v, o);
  }
  public static Object staticSetGuesser(String entityVar, SiteRequest siteRequest_, String v, Guesser o) {
    switch(entityVar) {
    case "name":
      return Guesser.staticSetName(siteRequest_, v);
    case "guesserId":
      return Guesser.staticSetGuesserId(siteRequest_, v);
    case "description":
      return Guesser.staticSetDescription(siteRequest_, v);
      default:
        return BaseModel.staticSetBaseModel(entityVar,  siteRequest_, v, o);
    }
  }

  //////////////////
  // staticSearch //
  //////////////////

  public static Future<Guesser> fqGuesser(SiteRequest siteRequest, String var, Object val) {
    Promise<Guesser> promise = Promise.promise();
    try {
      if(val == null) {
        promise.complete();
      } else {
        SearchList<Guesser> searchList = new SearchList<Guesser>();
        searchList.setStore(true);
        searchList.q("*:*");
        searchList.setC(Guesser.class);
        searchList.fq(String.format("%s:", Guesser.varIndexedGuesser(var)) + SearchTool.escapeQueryChars(val.toString()));
        searchList.promiseDeepForClass(siteRequest).onSuccess(a -> {
          try {
            promise.complete(searchList.getList().stream().findFirst().orElse(null));
          } catch(Throwable ex) {
            LOG.error("Error while querying the guesser", ex);
            promise.fail(ex);
          }
        }).onFailure(ex -> {
          LOG.error("Error while querying the guesser", ex);
          promise.fail(ex);
        });
      }
    } catch(Throwable ex) {
      LOG.error("Error while querying the guesser", ex);
      promise.fail(ex);
    }
    return promise.future();
  }

  public static Object staticSearchForClass(String entityVar, SiteRequest siteRequest_, Object o) {
    return staticSearchGuesser(entityVar,  siteRequest_, o);
  }
  public static Object staticSearchGuesser(String entityVar, SiteRequest siteRequest_, Object o) {
    switch(entityVar) {
    case "name":
      return Guesser.staticSearchName(siteRequest_, (String)o);
    case "guesserId":
      return Guesser.staticSearchGuesserId(siteRequest_, (String)o);
    case "description":
      return Guesser.staticSearchDescription(siteRequest_, (String)o);
      default:
        return BaseModel.staticSearchBaseModel(entityVar,  siteRequest_, o);
    }
  }

  ///////////////////
  // staticSearchStr //
  ///////////////////

  public static String staticSearchStrForClass(String entityVar, SiteRequest siteRequest_, Object o) {
    return staticSearchStrGuesser(entityVar,  siteRequest_, o);
  }
  public static String staticSearchStrGuesser(String entityVar, SiteRequest siteRequest_, Object o) {
    switch(entityVar) {
    case "name":
      return Guesser.staticSearchStrName(siteRequest_, (String)o);
    case "guesserId":
      return Guesser.staticSearchStrGuesserId(siteRequest_, (String)o);
    case "description":
      return Guesser.staticSearchStrDescription(siteRequest_, (String)o);
      default:
        return BaseModel.staticSearchStrBaseModel(entityVar,  siteRequest_, o);
    }
  }

  //////////////////
  // staticSearchFq //
  //////////////////

  public static String staticSearchFqForClass(String entityVar, SiteRequest siteRequest_, String o) {
    return staticSearchFqGuesser(entityVar,  siteRequest_, o);
  }
  public static String staticSearchFqGuesser(String entityVar, SiteRequest siteRequest_, String o) {
    switch(entityVar) {
    case "name":
      return Guesser.staticSearchFqName(siteRequest_, o);
    case "guesserId":
      return Guesser.staticSearchFqGuesserId(siteRequest_, o);
    case "description":
      return Guesser.staticSearchFqDescription(siteRequest_, o);
      default:
        return BaseModel.staticSearchFqBaseModel(entityVar,  siteRequest_, o);
    }
  }

  /////////////
  // persist //
  /////////////

  @Override public boolean persistForClass(String var, Object val) {
    String[] vars = StringUtils.split(var, ".");
    Object o = null;
    if(val != null) {
      for(String v : vars) {
        if(o == null)
          o = persistGuesser(v, val);
        else if(o instanceof BaseModel) {
          BaseModel oBaseModel = (BaseModel)o;
          o = oBaseModel.persistForClass(v, val);
        }
      }
    }
    return o != null;
  }
  public Object persistGuesser(String var, Object val) {
    String varLower = var.toLowerCase();
      if("name".equals(varLower)) {
        if(val instanceof String) {
          setName((String)val);
        }
        saves.add("name");
        return val;
      } else if("guesserid".equals(varLower)) {
        if(val instanceof String) {
          setGuesserId((String)val);
        }
        saves.add("guesserId");
        return val;
      } else if("description".equals(varLower)) {
        if(val instanceof String) {
          setDescription((String)val);
        }
        saves.add("description");
        return val;
    } else {
      return super.persistBaseModel(var, val);
    }
  }

  /////////////
  // populate //
  /////////////

  @Override public void populateForClass(SolrResponse.Doc doc) {
    populateGuesser(doc);
  }
  public void populateGuesser(SolrResponse.Doc doc) {
    Guesser oGuesser = (Guesser)this;
    saves = Optional.ofNullable((ArrayList<String>)doc.get("saves_docvalues_strings")).orElse(new ArrayList<String>());
    if(saves != null) {

      if(saves.contains("name")) {
        String name = (String)doc.get("name_docvalues_string");
        if(name != null)
          oGuesser.setName(name);
      }

      if(saves.contains("guesserId")) {
        String guesserId = (String)doc.get("guesserId_docvalues_string");
        if(guesserId != null)
          oGuesser.setGuesserId(guesserId);
      }

      if(saves.contains("description")) {
        String description = (String)doc.get("description_docvalues_string");
        if(description != null)
          oGuesser.setDescription(description);
      }
    }

    super.populateBaseModel(doc);
  }

  public void indexGuesser(JsonObject doc) {
    if(name != null) {
      doc.put("name_docvalues_string", name);
    }
    if(guesserId != null) {
      doc.put("guesserId_docvalues_string", guesserId);
    }
    if(description != null) {
      doc.put("description_docvalues_string", description);
    }
    super.indexBaseModel(doc);

	}

  public static String varStoredGuesser(String entityVar) {
    switch(entityVar) {
      case "name":
        return "name_docvalues_string";
      case "guesserId":
        return "guesserId_docvalues_string";
      case "description":
        return "description_docvalues_string";
      default:
        return BaseModel.varStoredBaseModel(entityVar);
    }
  }

  public static String varIndexedGuesser(String entityVar) {
    switch(entityVar) {
      case "name":
        return "name_docvalues_string";
      case "guesserId":
        return "guesserId_docvalues_string";
      case "description":
        return "description_docvalues_string";
      default:
        return BaseModel.varIndexedBaseModel(entityVar);
    }
  }

  public static String searchVarGuesser(String searchVar) {
    switch(searchVar) {
      case "name_docvalues_string":
        return "name";
      case "guesserId_docvalues_string":
        return "guesserId";
      case "description_docvalues_string":
        return "description";
      default:
        return BaseModel.searchVarBaseModel(searchVar);
    }
  }

  public static String varSearchGuesser(String entityVar) {
    switch(entityVar) {
      default:
        return BaseModel.varSearchBaseModel(entityVar);
    }
  }

  public static String varSuggestedGuesser(String entityVar) {
    switch(entityVar) {
      default:
        return BaseModel.varSuggestedBaseModel(entityVar);
    }
  }

  /////////////
  // store //
  /////////////

  @Override public void storeForClass(SolrResponse.Doc doc) {
    storeGuesser(doc);
  }
  public void storeGuesser(SolrResponse.Doc doc) {
    Guesser oGuesser = (Guesser)this;
    SiteRequest siteRequest = oGuesser.getSiteRequest_();

    oGuesser.setName(Optional.ofNullable(doc.get("name_docvalues_string")).map(v -> v.toString()).orElse(null));
    oGuesser.setGuesserId(Optional.ofNullable(doc.get("guesserId_docvalues_string")).map(v -> v.toString()).orElse(null));
    oGuesser.setDescription(Optional.ofNullable(doc.get("description_docvalues_string")).map(v -> v.toString()).orElse(null));

    super.storeBaseModel(doc);
  }

  //////////////////
  // apiRequest //
  //////////////////

  public void apiRequestGuesser() {
    ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(r -> r.getApiRequest_()).orElse(null);
    Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
    if(o != null && o instanceof Guesser) {
      Guesser original = (Guesser)o;
      if(!Objects.equals(name, original.getName()))
        apiRequest.addVars("name");
      if(!Objects.equals(guesserId, original.getGuesserId()))
        apiRequest.addVars("guesserId");
      if(!Objects.equals(description, original.getDescription()))
        apiRequest.addVars("description");
      super.apiRequestBaseModel();
    }
  }

  //////////////
  // toString //
  //////////////

  @Override public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(super.toString());
    sb.append(Optional.ofNullable(name).map(v -> "name: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(guesserId).map(v -> "guesserId: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(description).map(v -> "description: \"" + v + "\"\n" ).orElse(""));
    return sb.toString();
  }

  public static final String CLASS_SIMPLE_NAME = "Guesser";
  public static final String CLASS_CANONICAL_NAME = "org.computate.spinechamp.model.guesser.Guesser";
  public static final String CLASS_AUTH_RESOURCE = "GUESSER";
  public static final String CLASS_API_ADDRESS_Guesser = "spine-champ-enUS-Guesser";
  public static String getClassApiAddress() {
    return CLASS_API_ADDRESS_Guesser;
  }
  public static final String VAR_name = "name";
  public static final String SET_name = "setName";
  public static final String VAR_guesserId = "guesserId";
  public static final String SET_guesserId = "setGuesserId";
  public static final String VAR_description = "description";
  public static final String SET_description = "setDescription";

  public static List<String> varsQForClass() {
    return Guesser.varsQGuesser(new ArrayList<String>());
  }
  public static List<String> varsQGuesser(List<String> vars) {
    BaseModel.varsQBaseModel(vars);
    return vars;
  }

  public static List<String> varsFqForClass() {
    return Guesser.varsFqGuesser(new ArrayList<String>());
  }
  public static List<String> varsFqGuesser(List<String> vars) {
    vars.add(VAR_name);
    vars.add(VAR_description);
    BaseModel.varsFqBaseModel(vars);
    return vars;
  }

  public static List<String> varsRangeForClass() {
    return Guesser.varsRangeGuesser(new ArrayList<String>());
  }
  public static List<String> varsRangeGuesser(List<String> vars) {
    BaseModel.varsRangeBaseModel(vars);
    return vars;
  }

  public static final String DISPLAY_NAME_name = "guesser name";
  public static final String DISPLAY_NAME_guesserId = "guesser ID";
  public static final String DISPLAY_NAME_description = "description";

  @Override
  public String idForClass() {
    return guesserId;
  }

  @Override
  public String titleForClass() {
    return objectTitle;
  }

  @Override
  public String nameForClass() {
    return name;
  }

  @Override
  public String classNameAdjectiveSingularForClass() {
    return Guesser.NameAdjectiveSingular_enUS;
  }

  @Override
  public String descriptionForClass() {
    return description;
  }

  @Override
  public String enUSStringFormatUrlEditPageForClass() {
    return "%s/en-us/edit/guesser/%s";
  }

  public static String varJsonForClass(String var, Boolean patch) {
    return Guesser.varJsonGuesser(var, patch);
  }
  public static String varJsonGuesser(String var, Boolean patch) {
    switch(var) {
    case VAR_name:
      return patch ? SET_name : VAR_name;
    case VAR_guesserId:
      return patch ? SET_guesserId : VAR_guesserId;
    case VAR_description:
      return patch ? SET_description : VAR_description;
    default:
      return BaseModel.varJsonBaseModel(var, patch);
    }
  }

  public static String displayNameForClass(String var) {
    return Guesser.displayNameGuesser(var);
  }
  public static String displayNameGuesser(String var) {
    switch(var) {
    case VAR_name:
      return DISPLAY_NAME_name;
    case VAR_guesserId:
      return DISPLAY_NAME_guesserId;
    case VAR_description:
      return DISPLAY_NAME_description;
    default:
      return BaseModel.displayNameBaseModel(var);
    }
  }

  public static String descriptionGuesser(String var) {
    if(var == null)
      return null;
    switch(var) {
    case VAR_name:
      return "The name of this guesser";
    case VAR_guesserId:
      return "The ID of this guesser";
    case VAR_description:
      return "A description of this guesser";
      default:
        return BaseModel.descriptionBaseModel(var);
    }
  }

  public static String classSimpleNameGuesser(String var) {
    switch(var) {
    case VAR_name:
      return "String";
    case VAR_guesserId:
      return "String";
    case VAR_description:
      return "String";
      default:
        return BaseModel.classSimpleNameBaseModel(var);
    }
  }

  public static Integer htmColumnGuesser(String var) {
    switch(var) {
    case VAR_name:
      return 1;
    case VAR_description:
      return 3;
      default:
        return BaseModel.htmColumnBaseModel(var);
    }
  }

  public static Integer htmRowGuesser(String var) {
    switch(var) {
    case VAR_name:
      return 3;
    case VAR_description:
      return 3;
      default:
        return BaseModel.htmRowBaseModel(var);
    }
  }

  public static Integer htmCellGuesser(String var) {
    switch(var) {
    case VAR_name:
      return 1;
    case VAR_description:
      return 4;
      default:
        return BaseModel.htmCellBaseModel(var);
    }
  }

  public static Integer lengthMinGuesser(String var) {
    switch(var) {
      default:
        return BaseModel.lengthMinBaseModel(var);
    }
  }

  public static Integer lengthMaxGuesser(String var) {
    switch(var) {
      default:
        return BaseModel.lengthMaxBaseModel(var);
    }
  }

  public static Integer maxGuesser(String var) {
    switch(var) {
      default:
        return BaseModel.maxBaseModel(var);
    }
  }

  public static Integer minGuesser(String var) {
    switch(var) {
      default:
        return BaseModel.minBaseModel(var);
    }
  }
}
