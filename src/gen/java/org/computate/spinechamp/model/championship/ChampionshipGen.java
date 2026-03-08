package org.computate.spinechamp.model.championship;

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
import org.computate.vertx.search.list.SearchList;
import org.computate.spinechamp.model.finalfour.FinalFour;
import org.computate.vertx.serialize.vertx.JsonObjectDeserializer;
import org.computate.spinechamp.model.championship.Championship;
import java.lang.String;
import org.computate.spinechamp.model.guesser.Guesser;
import java.lang.Integer;
import org.computate.spinechamp.model.team.Team;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import org.computate.search.tool.SearchTool;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.response.solr.SolrResponse;

/**
 * <ol>
<h3>Suggestions that can generate more code for you: </h3> * </ol>
 * <li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class ChampionshipGen into the class Championship. 
 * </li><li>You can add a class comment "Rows: 100" if you wish the Championship API to return more or less than 10 records by default. 
 * In this case, the API will return 100 records from the API instead of 10 by default. 
 * Each API has built in pagination of the search records to ensure a user can query all the data a page at a time without running the application out of memory. 
 * </li>
 * <h3>About the Championship class and it's generated class ChampionshipGen&lt;BaseModel&gt;: </h3>extends ChampionshipGen
 * <p>
 * This Java class extends a generated Java class ChampionshipGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.championship.Championship">Find the class Championship in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends ChampionshipGen<BaseModel>
 * <p>This <code>class Championship extends ChampionshipGen&lt;BaseModel&gt;</code>, which means it extends a newly generated ChampionshipGen. 
 * The generated <code>class ChampionshipGen extends BaseModel</code> which means that Championship extends ChampionshipGen which extends BaseModel. 
 * This generated inheritance is a powerful feature that allows a lot of boiler plate code to be created for you automatically while still preserving inheritance through the power of Java Generic classes. 
 * </p>
 * <h2>Api: true</h2>
 * <p>This class contains a comment <b>"Api: true"</b>, which means this class will have Java Vert.x API backend code generated for these objects. 
 * </p>
 * <h2>ApiTag.enUS: true</h2>
 * <p>This class contains a comment <b>"ApiTag: championship brackets"</b>, which groups all of the OpenAPIs for Championship objects under the tag "championship brackets". 
 * </p>
 * <h2>ApiUri.enUS: /en-us/api/championship</h2>
 * <p>This class contains a comment <b>"ApiUri: /en-us/api/championship"</b>, which defines the base API URI for Championship objects as "/en-us/api/championship" in the OpenAPI spec. 
 * </p>
 * <h2>Color: null</h2>
 * <h2>Indexed: true</h2>
 * <p>This class contains a comment <b>"Indexed: true"</b>, which means this class will be indexed in the search engine. 
 * Every protected void method that begins with "_" that is marked to be searched with a comment like "Indexed: true", "Stored: true", or "DocValues: true" will be indexed in the search engine. 
 * </p>
 * <h2>{@inheritDoc}</h2>
 * <p>By adding a class comment "{@inheritDoc}", the Championship class will inherit the helpful inherited class comments from the super class ChampionshipGen. 
 * </p>
 * <h2>Rows: null</h2>
 * <h2>Order: 10</h2>
 * <p>This class contains a comment <b>"Order: 10"</b>, which means this class will be sorted by the given number 10 ascending when code that relates to multiple classes at the same time is generated. 
 * </p>
 * <h2>SqlOrder: 7</h2>
 * <p>This class contains a comment <b>"SqlOrder: 7"</b>, which means this class will be sorted by the given number 7 ascending when SQL code to create and drop the tables is generated. 
 * </p>
 * <h2>Model: true</h2>
 * <p>This class contains a comment <b>"Model: true"</b>, which means this class will be stored in the database. 
 * Every protected void method that begins with "_" that contains a "Persist: true" comment will be a persisted field in the database table. 
 * </p>
 * <h2>Page: true</h2>
 * <p>This class contains a comment <b>"Page: true"</b>, which means this class will have webpage code generated for these objects. 
 * Java Vert.x backend API code, Handlebars HTML template frontend code, and JavaScript code will all generated and can be extended. 
 * This creates a new Java class org.computate.spinechamp.model.championship.ChampionshipPage. 
 * </p>
 * <h2>SuperPage.enUS: PageLayout</h2>
 * <p>This class contains a comment <b>"SuperPage.enUS: PageLayout"</b>, which identifies the Java super class of the page code by it's class simple name "PageLayout". 
 * This means that the newly created class org.computate.spinechamp.model.championship.ChampionshipPage extends org.computate.spinechamp.page.PageLayout. 
 * </p>
 * <h2>Promise: true</h2>
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the Championship Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * <h2>AName.enUS: a championship bracket</h2>
 * <p>This class contains a comment <b>"AName.enUS: a championship bracket"</b>, which identifies the language context to describe a Championship as "a championship bracket". 
 * </p>
 * <p>
 * Delete the class Championship in Solr: 
 * <pre>
 * curl -k 'https://solr.apps-crc.testing/solr/computate/update?commitWithin=1000&amp;overwrite=true&amp;wt=json' -X POST -H 'Content-type: text/xml' -u "admin:$(oc -n solr get secret/solr-solrcloud-security-bootstrap -o jsonpath={.data.admin} | base64 -d)" --data-raw '&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.championship.Championship&lt;/query&gt;&lt;/delete&gt;'
 * </pre>
 * </p>
 * <p>
 * Delete  the package org.computate.spinechamp.model.championship in Solr: 
 * <pre>
 * curl -k 'https://solr.apps-crc.testing/solr/computate/update?commitWithin=1000&amp;overwrite=true&amp;wt=json' -X POST -H 'Content-type: text/xml' -u "admin:$(oc -n solr get secret/solr-solrcloud-security-bootstrap -o jsonpath={.data.admin} | base64 -d)" --data-raw '&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.spinechamp.model.championship&lt;/query&gt;&lt;/delete&gt;'
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
public abstract class ChampionshipGen<DEV> extends BaseModel {
  protected static final Logger LOG = LoggerFactory.getLogger(Championship.class);

  public static final String Description_enUS = "A predicted tournament with 2 teams. ";
  public static final String AName_enUS = "a championship bracket";
  public static final String This_enUS = "this ";
  public static final String ThisName_enUS = "this championship bracket";
  public static final String A_enUS = "a ";
  public static final String TheName_enUS = "the championship bracket";
  public static final String SingularName_enUS = "championship bracket";
  public static final String PluralName_enUS = "championship brackets";
  public static final String NameActual_enUS = "current championship bracket";
  public static final String AllName_enUS = "all championship brackets";
  public static final String SearchAllNameBy_enUS = "search championship brackets by ";
  public static final String SearchAllName_enUS = "search championship brackets";
  public static final String Title_enUS = "championship brackets";
  public static final String ThePluralName_enUS = "the championship brackets";
  public static final String NoNameFound_enUS = "no championship bracket found";
  public static final String ApiUri_enUS = "/en-us/api/championship";
  public static final String ApiUriSearchPage_enUS = "/en-us/search/championship";
  public static final String ApiUriEditPage_enUS = "/en-us/edit/championship/{bracketId}";
  public static final String OfName_enUS = "of championship bracket";
  public static final String ANameAdjective_enUS = "a championship bracket";
  public static final String NameAdjectiveSingular_enUS = "championship bracket";
  public static final String NameAdjectivePlural_enUS = "championship brackets";
  public static final String Search_enUS_OpenApiUri = "/en-us/api/championship";
  public static final String Search_enUS_StringFormatUri = "/en-us/api/championship";
  public static final String Search_enUS_StringFormatUrl = "%s/en-us/api/championship";
  public static final String GET_enUS_OpenApiUri = "/en-us/api/championship/{bracketId}";
  public static final String GET_enUS_StringFormatUri = "/en-us/api/championship/%s";
  public static final String GET_enUS_StringFormatUrl = "%s/en-us/api/championship/%s";
  public static final String PATCH_enUS_OpenApiUri = "/en-us/api/championship";
  public static final String PATCH_enUS_StringFormatUri = "/en-us/api/championship";
  public static final String PATCH_enUS_StringFormatUrl = "%s/en-us/api/championship";
  public static final String POST_enUS_OpenApiUri = "/en-us/api/championship";
  public static final String POST_enUS_StringFormatUri = "/en-us/api/championship";
  public static final String POST_enUS_StringFormatUrl = "%s/en-us/api/championship";
  public static final String DELETE_enUS_OpenApiUri = "/en-us/api/championship/{bracketId}";
  public static final String DELETE_enUS_StringFormatUri = "/en-us/api/championship/%s";
  public static final String DELETE_enUS_StringFormatUrl = "%s/en-us/api/championship/%s";
  public static final String PUTImport_enUS_OpenApiUri = "/en-us/api/championship-import";
  public static final String PUTImport_enUS_StringFormatUri = "/en-us/api/championship-import";
  public static final String PUTImport_enUS_StringFormatUrl = "%s/en-us/api/championship-import";
  public static final String SearchPage_enUS_OpenApiUri = "/en-us/search/championship";
  public static final String SearchPage_enUS_StringFormatUri = "/en-us/search/championship";
  public static final String SearchPage_enUS_StringFormatUrl = "%s/en-us/search/championship";
  public static final String EditPage_enUS_OpenApiUri = "/en-us/edit/championship/{bracketId}";
  public static final String EditPage_enUS_StringFormatUri = "/en-us/edit/championship/%s";
  public static final String EditPage_enUS_StringFormatUrl = "%s/en-us/edit/championship/%s";
  public static final String DELETEFilter_enUS_OpenApiUri = "/en-us/api/championship";
  public static final String DELETEFilter_enUS_StringFormatUri = "/en-us/api/championship";
  public static final String DELETEFilter_enUS_StringFormatUrl = "%s/en-us/api/championship";

  public static final String Icon = "<i class=\"fa-regular fa-buildings\"></i>";

	///////////////////////////
  // actualFinalFourSearch //
	///////////////////////////


  /**
   *  The entity actualFinalFourSearch
   *	 is defined as null before being initialized. 
   */
  @JsonIgnore
  @JsonInclude(Include.NON_NULL)
  protected SearchList<FinalFour> actualFinalFourSearch;

  /**
   * <br> The entity actualFinalFourSearch
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.championship.Championship&fq=entiteVar_enUS_indexed_string:actualFinalFourSearch">Find the entity actualFinalFourSearch in Solr</a>
   * <br>
   * @param promise is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _actualFinalFourSearch(Promise<SearchList<FinalFour>> promise);

  public SearchList<FinalFour> getActualFinalFourSearch() {
    return actualFinalFourSearch;
  }

  public void setActualFinalFourSearch(SearchList<FinalFour> actualFinalFourSearch) {
    this.actualFinalFourSearch = actualFinalFourSearch;
  }
  public static SearchList<FinalFour> staticSetActualFinalFourSearch(SiteRequest siteRequest_, String o) {
    return null;
  }
  protected Future<SearchList<FinalFour>> actualFinalFourSearchPromise() {
    Promise<SearchList<FinalFour>> promise = Promise.promise();
    Promise<SearchList<FinalFour>> promise2 = Promise.promise();
    _actualFinalFourSearch(promise2);
    promise2.future().onSuccess(o -> {
      if(o != null && actualFinalFourSearch == null) {
        o.promiseDeepForClass(siteRequest_).onSuccess(a -> {
          setActualFinalFourSearch(o);
          promise.complete(o);
        }).onFailure(ex -> {
          promise.fail(ex);
        });
      } else {
        promise.complete(o);
      }
    }).onFailure(ex -> {
      promise.fail(ex);
    });
    return promise.future();
  }

	/////////////////////
  // actualFinalFour //
	/////////////////////


  /**
   *  The entity actualFinalFour
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonDeserialize(using = JsonObjectDeserializer.class)
  @JsonInclude(Include.NON_NULL)
  protected JsonObject actualFinalFour;

  /**
   * <br> The entity actualFinalFour
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.championship.Championship&fq=entiteVar_enUS_indexed_string:actualFinalFour">Find the entity actualFinalFour in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _actualFinalFour(Wrap<JsonObject> w);

  public JsonObject getActualFinalFour() {
    return actualFinalFour;
  }

  public void setActualFinalFour(JsonObject actualFinalFour) {
    this.actualFinalFour = actualFinalFour;
  }
  @JsonIgnore
  public void setActualFinalFour(String o) {
    this.actualFinalFour = Championship.staticSetActualFinalFour(siteRequest_, o);
  }
  public static JsonObject staticSetActualFinalFour(SiteRequest siteRequest_, String o) {
    if(o != null) {
        return new JsonObject(o);
    }
    return null;
  }
  protected Championship actualFinalFourInit() {
    Wrap<JsonObject> actualFinalFourWrap = new Wrap<JsonObject>().var("actualFinalFour");
    if(actualFinalFour == null) {
      _actualFinalFour(actualFinalFourWrap);
      Optional.ofNullable(actualFinalFourWrap.getO()).ifPresent(o -> {
        setActualFinalFour(o);
      });
    }
    return (Championship)this;
  }

  public static String staticSearchActualFinalFour(SiteRequest siteRequest_, JsonObject o) {
    return o.toString();
  }

  public static String staticSearchStrActualFinalFour(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqActualFinalFour(SiteRequest siteRequest_, String o) {
    return Championship.staticSearchActualFinalFour(siteRequest_, Championship.staticSetActualFinalFour(siteRequest_, o)).toString();
  }

	//////////////////////////////
  // actualChampionshipSearch //
	//////////////////////////////


  /**
   *  The entity actualChampionshipSearch
   *	 is defined as null before being initialized. 
   */
  @JsonIgnore
  @JsonInclude(Include.NON_NULL)
  protected SearchList<Championship> actualChampionshipSearch;

  /**
   * <br> The entity actualChampionshipSearch
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.championship.Championship&fq=entiteVar_enUS_indexed_string:actualChampionshipSearch">Find the entity actualChampionshipSearch in Solr</a>
   * <br>
   * @param promise is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _actualChampionshipSearch(Promise<SearchList<Championship>> promise);

  public SearchList<Championship> getActualChampionshipSearch() {
    return actualChampionshipSearch;
  }

  public void setActualChampionshipSearch(SearchList<Championship> actualChampionshipSearch) {
    this.actualChampionshipSearch = actualChampionshipSearch;
  }
  public static SearchList<Championship> staticSetActualChampionshipSearch(SiteRequest siteRequest_, String o) {
    return null;
  }
  protected Future<SearchList<Championship>> actualChampionshipSearchPromise() {
    Promise<SearchList<Championship>> promise = Promise.promise();
    Promise<SearchList<Championship>> promise2 = Promise.promise();
    _actualChampionshipSearch(promise2);
    promise2.future().onSuccess(o -> {
      if(o != null && actualChampionshipSearch == null) {
        o.promiseDeepForClass(siteRequest_).onSuccess(a -> {
          setActualChampionshipSearch(o);
          promise.complete(o);
        }).onFailure(ex -> {
          promise.fail(ex);
        });
      } else {
        promise.complete(o);
      }
    }).onFailure(ex -> {
      promise.fail(ex);
    });
    return promise.future();
  }

	////////////////////////
  // actualChampionship //
	////////////////////////


  /**
   *  The entity actualChampionship
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonDeserialize(using = JsonObjectDeserializer.class)
  @JsonInclude(Include.NON_NULL)
  protected JsonObject actualChampionship;

  /**
   * <br> The entity actualChampionship
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.championship.Championship&fq=entiteVar_enUS_indexed_string:actualChampionship">Find the entity actualChampionship in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _actualChampionship(Wrap<JsonObject> w);

  public JsonObject getActualChampionship() {
    return actualChampionship;
  }

  public void setActualChampionship(JsonObject actualChampionship) {
    this.actualChampionship = actualChampionship;
  }
  @JsonIgnore
  public void setActualChampionship(String o) {
    this.actualChampionship = Championship.staticSetActualChampionship(siteRequest_, o);
  }
  public static JsonObject staticSetActualChampionship(SiteRequest siteRequest_, String o) {
    if(o != null) {
        return new JsonObject(o);
    }
    return null;
  }
  protected Championship actualChampionshipInit() {
    Wrap<JsonObject> actualChampionshipWrap = new Wrap<JsonObject>().var("actualChampionship");
    if(actualChampionship == null) {
      _actualChampionship(actualChampionshipWrap);
      Optional.ofNullable(actualChampionshipWrap.getO()).ifPresent(o -> {
        setActualChampionship(o);
      });
    }
    return (Championship)this;
  }

  public static String staticSearchActualChampionship(SiteRequest siteRequest_, JsonObject o) {
    return o.toString();
  }

  public static String staticSearchStrActualChampionship(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqActualChampionship(SiteRequest siteRequest_, String o) {
    return Championship.staticSearchActualChampionship(siteRequest_, Championship.staticSetActualChampionship(siteRequest_, o)).toString();
  }

	///////////////
  // finalFour //
	///////////////


  /**
   *  The entity finalFour
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String finalFour;

  /**
   * <br> The entity finalFour
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.championship.Championship&fq=entiteVar_enUS_indexed_string:finalFour">Find the entity finalFour in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _finalFour(Wrap<String> w);

  public String getFinalFour() {
    return finalFour;
  }
  public void setFinalFour(String o) {
    this.finalFour = Championship.staticSetFinalFour(siteRequest_, o);
  }
  public static String staticSetFinalFour(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected Championship finalFourInit() {
    Wrap<String> finalFourWrap = new Wrap<String>().var("finalFour");
    if(finalFour == null) {
      _finalFour(finalFourWrap);
      Optional.ofNullable(finalFourWrap.getO()).ifPresent(o -> {
        setFinalFour(o);
      });
    }
    return (Championship)this;
  }

  public static String staticSearchFinalFour(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrFinalFour(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqFinalFour(SiteRequest siteRequest_, String o) {
    return Championship.staticSearchFinalFour(siteRequest_, Championship.staticSetFinalFour(siteRequest_, o)).toString();
  }

  public String sqlFinalFour() {
    return finalFour;
  }

  public static String staticJsonFinalFour(String finalFour) {
    return finalFour;
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.championship.Championship&fq=entiteVar_enUS_indexed_string:guesserId">Find the entity guesserId in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _guesserId(Wrap<String> w);

  public String getGuesserId() {
    return guesserId;
  }
  public void setGuesserId(String o) {
    this.guesserId = Championship.staticSetGuesserId(siteRequest_, o);
  }
  public static String staticSetGuesserId(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected Championship guesserIdInit() {
    Wrap<String> guesserIdWrap = new Wrap<String>().var("guesserId");
    if(guesserId == null) {
      _guesserId(guesserIdWrap);
      Optional.ofNullable(guesserIdWrap.getO()).ifPresent(o -> {
        setGuesserId(o);
      });
    }
    return (Championship)this;
  }

  public static String staticSearchGuesserId(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrGuesserId(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqGuesserId(SiteRequest siteRequest_, String o) {
    return Championship.staticSearchGuesserId(siteRequest_, Championship.staticSetGuesserId(siteRequest_, o)).toString();
  }

  public String sqlGuesserId() {
    return guesserId;
  }

  public static String staticJsonGuesserId(String guesserId) {
    return guesserId;
  }

	////////////////////
  // correctGuesses //
	////////////////////


  /**
   *  The entity correctGuesses
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonSerialize(using = ToStringSerializer.class)
  @JsonInclude(Include.NON_NULL)
  protected Integer correctGuesses;

  /**
   * <br> The entity correctGuesses
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.championship.Championship&fq=entiteVar_enUS_indexed_string:correctGuesses">Find the entity correctGuesses in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _correctGuesses(Wrap<Integer> w);

  public Integer getCorrectGuesses() {
    return correctGuesses;
  }

  public void setCorrectGuesses(Integer correctGuesses) {
    this.correctGuesses = correctGuesses;
  }
  @JsonIgnore
  public void setCorrectGuesses(String o) {
    this.correctGuesses = Championship.staticSetCorrectGuesses(siteRequest_, o);
  }
  public static Integer staticSetCorrectGuesses(SiteRequest siteRequest_, String o) {
    if(NumberUtils.isParsable(o))
      return Integer.parseInt(o);
    return null;
  }
  protected Championship correctGuessesInit() {
    Wrap<Integer> correctGuessesWrap = new Wrap<Integer>().var("correctGuesses");
    if(correctGuesses == null) {
      _correctGuesses(correctGuessesWrap);
      Optional.ofNullable(correctGuessesWrap.getO()).ifPresent(o -> {
        setCorrectGuesses(o);
      });
    }
    return (Championship)this;
  }

  public static Integer staticSearchCorrectGuesses(SiteRequest siteRequest_, Integer o) {
    return o;
  }

  public static String staticSearchStrCorrectGuesses(SiteRequest siteRequest_, Integer o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqCorrectGuesses(SiteRequest siteRequest_, String o) {
    return Championship.staticSearchCorrectGuesses(siteRequest_, Championship.staticSetCorrectGuesses(siteRequest_, o)).toString();
  }

  public Integer sqlCorrectGuesses() {
    return correctGuesses;
  }

  public static String staticJsonCorrectGuesses(Integer correctGuesses) {
    return Optional.ofNullable(correctGuesses).map(v -> v.toString()).orElse(null);
  }

	//////////////////////
  // incorrectGuesses //
	//////////////////////


  /**
   *  The entity incorrectGuesses
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonSerialize(using = ToStringSerializer.class)
  @JsonInclude(Include.NON_NULL)
  protected Integer incorrectGuesses;

  /**
   * <br> The entity incorrectGuesses
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.championship.Championship&fq=entiteVar_enUS_indexed_string:incorrectGuesses">Find the entity incorrectGuesses in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _incorrectGuesses(Wrap<Integer> w);

  public Integer getIncorrectGuesses() {
    return incorrectGuesses;
  }

  public void setIncorrectGuesses(Integer incorrectGuesses) {
    this.incorrectGuesses = incorrectGuesses;
  }
  @JsonIgnore
  public void setIncorrectGuesses(String o) {
    this.incorrectGuesses = Championship.staticSetIncorrectGuesses(siteRequest_, o);
  }
  public static Integer staticSetIncorrectGuesses(SiteRequest siteRequest_, String o) {
    if(NumberUtils.isParsable(o))
      return Integer.parseInt(o);
    return null;
  }
  protected Championship incorrectGuessesInit() {
    Wrap<Integer> incorrectGuessesWrap = new Wrap<Integer>().var("incorrectGuesses");
    if(incorrectGuesses == null) {
      _incorrectGuesses(incorrectGuessesWrap);
      Optional.ofNullable(incorrectGuessesWrap.getO()).ifPresent(o -> {
        setIncorrectGuesses(o);
      });
    }
    return (Championship)this;
  }

  public static Integer staticSearchIncorrectGuesses(SiteRequest siteRequest_, Integer o) {
    return o;
  }

  public static String staticSearchStrIncorrectGuesses(SiteRequest siteRequest_, Integer o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqIncorrectGuesses(SiteRequest siteRequest_, String o) {
    return Championship.staticSearchIncorrectGuesses(siteRequest_, Championship.staticSetIncorrectGuesses(siteRequest_, o)).toString();
  }

  public Integer sqlIncorrectGuesses() {
    return incorrectGuesses;
  }

  public static String staticJsonIncorrectGuesses(Integer incorrectGuesses) {
    return Optional.ofNullable(incorrectGuesses).map(v -> v.toString()).orElse(null);
  }

	//////////
  // year //
	//////////


  /**
   *  The entity year
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonSerialize(using = ToStringSerializer.class)
  @JsonInclude(Include.NON_NULL)
  protected Integer year;

  /**
   * <br> The entity year
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.championship.Championship&fq=entiteVar_enUS_indexed_string:year">Find the entity year in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _year(Wrap<Integer> w);

  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }
  @JsonIgnore
  public void setYear(String o) {
    this.year = Championship.staticSetYear(siteRequest_, o);
  }
  public static Integer staticSetYear(SiteRequest siteRequest_, String o) {
    if(NumberUtils.isParsable(o))
      return Integer.parseInt(o);
    return null;
  }
  protected Championship yearInit() {
    Wrap<Integer> yearWrap = new Wrap<Integer>().var("year");
    if(year == null) {
      _year(yearWrap);
      Optional.ofNullable(yearWrap.getO()).ifPresent(o -> {
        setYear(o);
      });
    }
    return (Championship)this;
  }

  public static Integer staticSearchYear(SiteRequest siteRequest_, Integer o) {
    return o;
  }

  public static String staticSearchStrYear(SiteRequest siteRequest_, Integer o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqYear(SiteRequest siteRequest_, String o) {
    return Championship.staticSearchYear(siteRequest_, Championship.staticSetYear(siteRequest_, o)).toString();
  }

  public Integer sqlYear() {
    return year;
  }

  public static String staticJsonYear(Integer year) {
    return Optional.ofNullable(year).map(v -> v.toString()).orElse(null);
  }

	///////////////
  // bracketId //
	///////////////


  /**
   *  The entity bracketId
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String bracketId;

  /**
   * <br> The entity bracketId
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.championship.Championship&fq=entiteVar_enUS_indexed_string:bracketId">Find the entity bracketId in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _bracketId(Wrap<String> w);

  public String getBracketId() {
    return bracketId;
  }
  public void setBracketId(String o) {
    this.bracketId = Championship.staticSetBracketId(siteRequest_, o);
  }
  public static String staticSetBracketId(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected Championship bracketIdInit() {
    Wrap<String> bracketIdWrap = new Wrap<String>().var("bracketId");
    if(bracketId == null) {
      _bracketId(bracketIdWrap);
      Optional.ofNullable(bracketIdWrap.getO()).ifPresent(o -> {
        setBracketId(o);
      });
    }
    return (Championship)this;
  }

  public static String staticSearchBracketId(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrBracketId(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqBracketId(SiteRequest siteRequest_, String o) {
    return Championship.staticSearchBracketId(siteRequest_, Championship.staticSetBracketId(siteRequest_, o)).toString();
  }

  public String sqlBracketId() {
    return bracketId;
  }

  public static String staticJsonBracketId(String bracketId) {
    return bracketId;
  }

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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.championship.Championship&fq=entiteVar_enUS_indexed_string:name">Find the entity name in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _name(Wrap<String> w);

  public String getName() {
    return name;
  }
  public void setName(String o) {
    this.name = Championship.staticSetName(siteRequest_, o);
  }
  public static String staticSetName(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected Championship nameInit() {
    Wrap<String> nameWrap = new Wrap<String>().var("name");
    if(name == null) {
      _name(nameWrap);
      Optional.ofNullable(nameWrap.getO()).ifPresent(o -> {
        setName(o);
      });
    }
    return (Championship)this;
  }

  public static String staticSearchName(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrName(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqName(SiteRequest siteRequest_, String o) {
    return Championship.staticSearchName(siteRequest_, Championship.staticSetName(siteRequest_, o)).toString();
  }

  public String sqlName() {
    return name;
  }

  public static String staticJsonName(String name) {
    return name;
  }

	//////////////////////
  // game1WinnerGuess //
	//////////////////////


  /**
   *  The entity game1WinnerGuess
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String game1WinnerGuess;

  /**
   * <br> The entity game1WinnerGuess
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.championship.Championship&fq=entiteVar_enUS_indexed_string:game1WinnerGuess">Find the entity game1WinnerGuess in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _game1WinnerGuess(Wrap<String> w);

  public String getGame1WinnerGuess() {
    return game1WinnerGuess;
  }
  public void setGame1WinnerGuess(String o) {
    this.game1WinnerGuess = Championship.staticSetGame1WinnerGuess(siteRequest_, o);
  }
  public static String staticSetGame1WinnerGuess(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected Championship game1WinnerGuessInit() {
    Wrap<String> game1WinnerGuessWrap = new Wrap<String>().var("game1WinnerGuess");
    if(game1WinnerGuess == null) {
      _game1WinnerGuess(game1WinnerGuessWrap);
      Optional.ofNullable(game1WinnerGuessWrap.getO()).ifPresent(o -> {
        setGame1WinnerGuess(o);
      });
    }
    return (Championship)this;
  }

  public static String staticSearchGame1WinnerGuess(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrGame1WinnerGuess(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqGame1WinnerGuess(SiteRequest siteRequest_, String o) {
    return Championship.staticSearchGame1WinnerGuess(siteRequest_, Championship.staticSetGame1WinnerGuess(siteRequest_, o)).toString();
  }

	/////////////////
  // game1Winner //
	/////////////////


  /**
   *  The entity game1Winner
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String game1Winner;

  /**
   * <br> The entity game1Winner
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.championship.Championship&fq=entiteVar_enUS_indexed_string:game1Winner">Find the entity game1Winner in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _game1Winner(Wrap<String> w);

  public String getGame1Winner() {
    return game1Winner;
  }
  public void setGame1Winner(String o) {
    this.game1Winner = Championship.staticSetGame1Winner(siteRequest_, o);
  }
  public static String staticSetGame1Winner(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected Championship game1WinnerInit() {
    Wrap<String> game1WinnerWrap = new Wrap<String>().var("game1Winner");
    if(game1Winner == null) {
      _game1Winner(game1WinnerWrap);
      Optional.ofNullable(game1WinnerWrap.getO()).ifPresent(o -> {
        setGame1Winner(o);
      });
    }
    return (Championship)this;
  }

  public static String staticSearchGame1Winner(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrGame1Winner(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqGame1Winner(SiteRequest siteRequest_, String o) {
    return Championship.staticSearchGame1Winner(siteRequest_, Championship.staticSetGame1Winner(siteRequest_, o)).toString();
  }

  public String sqlGame1Winner() {
    return game1Winner;
  }

  public static String staticJsonGame1Winner(String game1Winner) {
    return game1Winner;
  }

	////////////////
  // game1Loser //
	////////////////


  /**
   *  The entity game1Loser
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String game1Loser;

  /**
   * <br> The entity game1Loser
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.championship.Championship&fq=entiteVar_enUS_indexed_string:game1Loser">Find the entity game1Loser in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _game1Loser(Wrap<String> w);

  public String getGame1Loser() {
    return game1Loser;
  }
  public void setGame1Loser(String o) {
    this.game1Loser = Championship.staticSetGame1Loser(siteRequest_, o);
  }
  public static String staticSetGame1Loser(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected Championship game1LoserInit() {
    Wrap<String> game1LoserWrap = new Wrap<String>().var("game1Loser");
    if(game1Loser == null) {
      _game1Loser(game1LoserWrap);
      Optional.ofNullable(game1LoserWrap.getO()).ifPresent(o -> {
        setGame1Loser(o);
      });
    }
    return (Championship)this;
  }

  public static String staticSearchGame1Loser(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrGame1Loser(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqGame1Loser(SiteRequest siteRequest_, String o) {
    return Championship.staticSearchGame1Loser(siteRequest_, Championship.staticSetGame1Loser(siteRequest_, o)).toString();
  }

  public String sqlGame1Loser() {
    return game1Loser;
  }

  public static String staticJsonGame1Loser(String game1Loser) {
    return game1Loser;
  }

  //////////////
  // initDeep //
  //////////////

  public Future<ChampionshipGen<DEV>> promiseDeepChampionship(SiteRequest siteRequest_) {
    setSiteRequest_(siteRequest_);
    return promiseDeepChampionship();
  }

  public Future<ChampionshipGen<DEV>> promiseDeepChampionship() {
    Promise<ChampionshipGen<DEV>> promise = Promise.promise();
    Promise<Void> promise2 = Promise.promise();
    promiseChampionship(promise2);
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

  public Future<Void> promiseChampionship(Promise<Void> promise) {
    Future.future(a -> a.complete()).compose(a -> {
      Promise<Void> promise2 = Promise.promise();
      try {
        promise2.complete();
      } catch(Exception ex) {
        promise2.fail(ex);
      }
      return promise2.future();
    }).compose(a -> {
      Promise<Void> promise2 = Promise.promise();
      actualFinalFourSearchPromise().onSuccess(actualFinalFourSearch -> {
        promise2.complete();
      }).onFailure(ex -> {
        promise2.fail(ex);
      });
      return promise2.future();
    }).compose(a -> {
      Promise<Void> promise2 = Promise.promise();
      try {
        actualFinalFourInit();
        promise2.complete();
      } catch(Exception ex) {
        promise2.fail(ex);
      }
      return promise2.future();
    }).compose(a -> {
      Promise<Void> promise2 = Promise.promise();
      actualChampionshipSearchPromise().onSuccess(actualChampionshipSearch -> {
        promise2.complete();
      }).onFailure(ex -> {
        promise2.fail(ex);
      });
      return promise2.future();
    }).compose(a -> {
      Promise<Void> promise2 = Promise.promise();
      try {
        actualChampionshipInit();
        finalFourInit();
        guesserIdInit();
        correctGuessesInit();
        incorrectGuessesInit();
        yearInit();
        bracketIdInit();
        nameInit();
        game1WinnerGuessInit();
        game1WinnerInit();
        game1LoserInit();
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

  @Override public Future<? extends ChampionshipGen<DEV>> promiseDeepForClass(SiteRequest siteRequest_) {
    return promiseDeepChampionship(siteRequest_);
  }

  /////////////////
  // siteRequest //
  /////////////////

  public void siteRequestChampionship(SiteRequest siteRequest_) {
      super.siteRequestBaseModel(siteRequest_);
    if(actualFinalFourSearch != null)
      actualFinalFourSearch.setSiteRequest_(siteRequest_);
    if(actualChampionshipSearch != null)
      actualChampionshipSearch.setSiteRequest_(siteRequest_);
  }

  public void siteRequestForClass(SiteRequest siteRequest_) {
    siteRequestChampionship(siteRequest_);
  }

  /////////////
  // obtain //
  /////////////

  @Override public Object obtainForClass(String var) {
    String[] vars = StringUtils.split(var, ".");
    Object o = null;
    for(String v : vars) {
      if(o == null)
        o = obtainChampionship(v);
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
  public Object obtainChampionship(String var) {
    Championship oChampionship = (Championship)this;
    switch(var) {
      case "actualFinalFourSearch":
        return oChampionship.actualFinalFourSearch;
      case "actualFinalFour":
        return oChampionship.actualFinalFour;
      case "actualChampionshipSearch":
        return oChampionship.actualChampionshipSearch;
      case "actualChampionship":
        return oChampionship.actualChampionship;
      case "finalFour":
        return oChampionship.finalFour;
      case "guesserId":
        return oChampionship.guesserId;
      case "correctGuesses":
        return oChampionship.correctGuesses;
      case "incorrectGuesses":
        return oChampionship.incorrectGuesses;
      case "year":
        return oChampionship.year;
      case "bracketId":
        return oChampionship.bracketId;
      case "name":
        return oChampionship.name;
      case "game1WinnerGuess":
        return oChampionship.game1WinnerGuess;
      case "game1Winner":
        return oChampionship.game1Winner;
      case "game1Loser":
        return oChampionship.game1Loser;
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
        o = relateChampionship(v, val);
      else if(o instanceof BaseModel) {
        BaseModel baseModel = (BaseModel)o;
        o = baseModel.relateForClass(v, val);
      }
    }
    return o != null;
  }
  public Object relateChampionship(String var, Object val) {
    Championship oChampionship = (Championship)this;
    switch(var) {
      case "finalFour":
        if(oChampionship.getFinalFour() == null)
          oChampionship.setFinalFour(Optional.ofNullable(val).map(v -> v.toString()).orElse(null));
        if(!saves.contains("finalFour"))
          saves.add("finalFour");
        return val;
      case "guesserId":
        if(oChampionship.getGuesserId() == null)
          oChampionship.setGuesserId(Optional.ofNullable(val).map(v -> v.toString()).orElse(null));
        if(!saves.contains("guesserId"))
          saves.add("guesserId");
        return val;
      case "game1Winner":
        if(oChampionship.getGame1Winner() == null)
          oChampionship.setGame1Winner(Optional.ofNullable(val).map(v -> v.toString()).orElse(null));
        if(!saves.contains("game1Winner"))
          saves.add("game1Winner");
        return val;
      case "game1Loser":
        if(oChampionship.getGame1Loser() == null)
          oChampionship.setGame1Loser(Optional.ofNullable(val).map(v -> v.toString()).orElse(null));
        if(!saves.contains("game1Loser"))
          saves.add("game1Loser");
        return val;
      default:
        return super.relateBaseModel(var, val);
    }
  }

  ///////////////
  // staticSet //
  ///////////////

  public static Object staticSetForClass(String entityVar, SiteRequest siteRequest_, String v, Championship o) {
    return staticSetChampionship(entityVar,  siteRequest_, v, o);
  }
  public static Object staticSetChampionship(String entityVar, SiteRequest siteRequest_, String v, Championship o) {
    switch(entityVar) {
    case "actualFinalFour":
      return Championship.staticSetActualFinalFour(siteRequest_, v);
    case "actualChampionship":
      return Championship.staticSetActualChampionship(siteRequest_, v);
    case "finalFour":
      return Championship.staticSetFinalFour(siteRequest_, v);
    case "guesserId":
      return Championship.staticSetGuesserId(siteRequest_, v);
    case "correctGuesses":
      return Championship.staticSetCorrectGuesses(siteRequest_, v);
    case "incorrectGuesses":
      return Championship.staticSetIncorrectGuesses(siteRequest_, v);
    case "year":
      return Championship.staticSetYear(siteRequest_, v);
    case "bracketId":
      return Championship.staticSetBracketId(siteRequest_, v);
    case "name":
      return Championship.staticSetName(siteRequest_, v);
    case "game1WinnerGuess":
      return Championship.staticSetGame1WinnerGuess(siteRequest_, v);
    case "game1Winner":
      return Championship.staticSetGame1Winner(siteRequest_, v);
    case "game1Loser":
      return Championship.staticSetGame1Loser(siteRequest_, v);
      default:
        return BaseModel.staticSetBaseModel(entityVar,  siteRequest_, v, o);
    }
  }

  //////////////////
  // staticSearch //
  //////////////////

  public static Future<Championship> fqChampionship(SiteRequest siteRequest, String var, Object val) {
    Promise<Championship> promise = Promise.promise();
    try {
      if(val == null) {
        promise.complete();
      } else {
        SearchList<Championship> searchList = new SearchList<Championship>();
        searchList.setStore(true);
        searchList.q("*:*");
        searchList.setC(Championship.class);
        searchList.fq(String.format("%s:", Championship.varIndexedChampionship(var)) + SearchTool.escapeQueryChars(val.toString()));
        searchList.promiseDeepForClass(siteRequest).onSuccess(a -> {
          try {
            promise.complete(searchList.getList().stream().findFirst().orElse(null));
          } catch(Throwable ex) {
            LOG.error("Error while querying the championship bracket", ex);
            promise.fail(ex);
          }
        }).onFailure(ex -> {
          LOG.error("Error while querying the championship bracket", ex);
          promise.fail(ex);
        });
      }
    } catch(Throwable ex) {
      LOG.error("Error while querying the championship bracket", ex);
      promise.fail(ex);
    }
    return promise.future();
  }

  public static Object staticSearchForClass(String entityVar, SiteRequest siteRequest_, Object o) {
    return staticSearchChampionship(entityVar,  siteRequest_, o);
  }
  public static Object staticSearchChampionship(String entityVar, SiteRequest siteRequest_, Object o) {
    switch(entityVar) {
    case "actualFinalFour":
      return Championship.staticSearchActualFinalFour(siteRequest_, (JsonObject)o);
    case "actualChampionship":
      return Championship.staticSearchActualChampionship(siteRequest_, (JsonObject)o);
    case "finalFour":
      return Championship.staticSearchFinalFour(siteRequest_, (String)o);
    case "guesserId":
      return Championship.staticSearchGuesserId(siteRequest_, (String)o);
    case "correctGuesses":
      return Championship.staticSearchCorrectGuesses(siteRequest_, (Integer)o);
    case "incorrectGuesses":
      return Championship.staticSearchIncorrectGuesses(siteRequest_, (Integer)o);
    case "year":
      return Championship.staticSearchYear(siteRequest_, (Integer)o);
    case "bracketId":
      return Championship.staticSearchBracketId(siteRequest_, (String)o);
    case "name":
      return Championship.staticSearchName(siteRequest_, (String)o);
    case "game1WinnerGuess":
      return Championship.staticSearchGame1WinnerGuess(siteRequest_, (String)o);
    case "game1Winner":
      return Championship.staticSearchGame1Winner(siteRequest_, (String)o);
    case "game1Loser":
      return Championship.staticSearchGame1Loser(siteRequest_, (String)o);
      default:
        return BaseModel.staticSearchBaseModel(entityVar,  siteRequest_, o);
    }
  }

  ///////////////////
  // staticSearchStr //
  ///////////////////

  public static String staticSearchStrForClass(String entityVar, SiteRequest siteRequest_, Object o) {
    return staticSearchStrChampionship(entityVar,  siteRequest_, o);
  }
  public static String staticSearchStrChampionship(String entityVar, SiteRequest siteRequest_, Object o) {
    switch(entityVar) {
    case "actualFinalFour":
      return Championship.staticSearchStrActualFinalFour(siteRequest_, (String)o);
    case "actualChampionship":
      return Championship.staticSearchStrActualChampionship(siteRequest_, (String)o);
    case "finalFour":
      return Championship.staticSearchStrFinalFour(siteRequest_, (String)o);
    case "guesserId":
      return Championship.staticSearchStrGuesserId(siteRequest_, (String)o);
    case "correctGuesses":
      return Championship.staticSearchStrCorrectGuesses(siteRequest_, (Integer)o);
    case "incorrectGuesses":
      return Championship.staticSearchStrIncorrectGuesses(siteRequest_, (Integer)o);
    case "year":
      return Championship.staticSearchStrYear(siteRequest_, (Integer)o);
    case "bracketId":
      return Championship.staticSearchStrBracketId(siteRequest_, (String)o);
    case "name":
      return Championship.staticSearchStrName(siteRequest_, (String)o);
    case "game1WinnerGuess":
      return Championship.staticSearchStrGame1WinnerGuess(siteRequest_, (String)o);
    case "game1Winner":
      return Championship.staticSearchStrGame1Winner(siteRequest_, (String)o);
    case "game1Loser":
      return Championship.staticSearchStrGame1Loser(siteRequest_, (String)o);
      default:
        return BaseModel.staticSearchStrBaseModel(entityVar,  siteRequest_, o);
    }
  }

  //////////////////
  // staticSearchFq //
  //////////////////

  public static String staticSearchFqForClass(String entityVar, SiteRequest siteRequest_, String o) {
    return staticSearchFqChampionship(entityVar,  siteRequest_, o);
  }
  public static String staticSearchFqChampionship(String entityVar, SiteRequest siteRequest_, String o) {
    switch(entityVar) {
    case "actualFinalFour":
      return Championship.staticSearchFqActualFinalFour(siteRequest_, o);
    case "actualChampionship":
      return Championship.staticSearchFqActualChampionship(siteRequest_, o);
    case "finalFour":
      return Championship.staticSearchFqFinalFour(siteRequest_, o);
    case "guesserId":
      return Championship.staticSearchFqGuesserId(siteRequest_, o);
    case "correctGuesses":
      return Championship.staticSearchFqCorrectGuesses(siteRequest_, o);
    case "incorrectGuesses":
      return Championship.staticSearchFqIncorrectGuesses(siteRequest_, o);
    case "year":
      return Championship.staticSearchFqYear(siteRequest_, o);
    case "bracketId":
      return Championship.staticSearchFqBracketId(siteRequest_, o);
    case "name":
      return Championship.staticSearchFqName(siteRequest_, o);
    case "game1WinnerGuess":
      return Championship.staticSearchFqGame1WinnerGuess(siteRequest_, o);
    case "game1Winner":
      return Championship.staticSearchFqGame1Winner(siteRequest_, o);
    case "game1Loser":
      return Championship.staticSearchFqGame1Loser(siteRequest_, o);
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
          o = persistChampionship(v, val);
        else if(o instanceof BaseModel) {
          BaseModel oBaseModel = (BaseModel)o;
          o = oBaseModel.persistForClass(v, val);
        }
      }
    }
    return o != null;
  }
  public Object persistChampionship(String var, Object val) {
    String varLower = var.toLowerCase();
      if("finalfour".equals(varLower)) {
        if(val instanceof String) {
          setFinalFour((String)val);
        }
        saves.add("finalFour");
        return val;
      } else if("guesserid".equals(varLower)) {
        if(val instanceof String) {
          setGuesserId((String)val);
        }
        saves.add("guesserId");
        return val;
      } else if("correctguesses".equals(varLower)) {
        if(val instanceof Integer) {
          setCorrectGuesses((Integer)val);
        } else {
          setCorrectGuesses(val == null ? null : val.toString());
        }
        saves.add("correctGuesses");
        return val;
      } else if("incorrectguesses".equals(varLower)) {
        if(val instanceof Integer) {
          setIncorrectGuesses((Integer)val);
        } else {
          setIncorrectGuesses(val == null ? null : val.toString());
        }
        saves.add("incorrectGuesses");
        return val;
      } else if("year".equals(varLower)) {
        if(val instanceof Integer) {
          setYear((Integer)val);
        } else {
          setYear(val == null ? null : val.toString());
        }
        saves.add("year");
        return val;
      } else if("bracketid".equals(varLower)) {
        if(val instanceof String) {
          setBracketId((String)val);
        }
        saves.add("bracketId");
        return val;
      } else if("name".equals(varLower)) {
        if(val instanceof String) {
          setName((String)val);
        }
        saves.add("name");
        return val;
      } else if("game1winner".equals(varLower)) {
        if(val instanceof String) {
          setGame1Winner((String)val);
        }
        saves.add("game1Winner");
        return val;
      } else if("game1loser".equals(varLower)) {
        if(val instanceof String) {
          setGame1Loser((String)val);
        }
        saves.add("game1Loser");
        return val;
    } else {
      return super.persistBaseModel(var, val);
    }
  }

  /////////////
  // populate //
  /////////////

  @Override public void populateForClass(SolrResponse.Doc doc) {
    populateChampionship(doc);
  }
  public void populateChampionship(SolrResponse.Doc doc) {
    Championship oChampionship = (Championship)this;
    saves = Optional.ofNullable((ArrayList<String>)doc.get("saves_docvalues_strings")).orElse(new ArrayList<String>());
    if(saves != null) {

      if(saves.contains("actualFinalFour")) {
        String actualFinalFour = (String)doc.get("actualFinalFour_stored_string");
        if(actualFinalFour != null)
          oChampionship.setActualFinalFour(actualFinalFour);
      }

      if(saves.contains("actualChampionship")) {
        String actualChampionship = (String)doc.get("actualChampionship_stored_string");
        if(actualChampionship != null)
          oChampionship.setActualChampionship(actualChampionship);
      }

      String finalFour = (String)doc.get("finalFour_docvalues_string");
      if(finalFour != null)
        oChampionship.setFinalFour(finalFour);

      String guesserId = (String)doc.get("guesserId_docvalues_string");
      if(guesserId != null)
        oChampionship.setGuesserId(guesserId);

      if(saves.contains("correctGuesses")) {
        Integer correctGuesses = (Integer)doc.get("correctGuesses_docvalues_int");
        if(correctGuesses != null)
          oChampionship.setCorrectGuesses(correctGuesses);
      }

      if(saves.contains("incorrectGuesses")) {
        Integer incorrectGuesses = (Integer)doc.get("incorrectGuesses_docvalues_int");
        if(incorrectGuesses != null)
          oChampionship.setIncorrectGuesses(incorrectGuesses);
      }

      if(saves.contains("year")) {
        Integer year = (Integer)doc.get("year_docvalues_int");
        if(year != null)
          oChampionship.setYear(year);
      }

      if(saves.contains("bracketId")) {
        String bracketId = (String)doc.get("bracketId_docvalues_string");
        if(bracketId != null)
          oChampionship.setBracketId(bracketId);
      }

      if(saves.contains("name")) {
        String name = (String)doc.get("name_docvalues_string");
        if(name != null)
          oChampionship.setName(name);
      }

      if(saves.contains("game1WinnerGuess")) {
        String game1WinnerGuess = (String)doc.get("game1WinnerGuess_docvalues_string");
        if(game1WinnerGuess != null)
          oChampionship.setGame1WinnerGuess(game1WinnerGuess);
      }

      String game1Winner = (String)doc.get("game1Winner_docvalues_string");
      if(game1Winner != null)
        oChampionship.setGame1Winner(game1Winner);

      String game1Loser = (String)doc.get("game1Loser_docvalues_string");
      if(game1Loser != null)
        oChampionship.setGame1Loser(game1Loser);
    }

    super.populateBaseModel(doc);
  }

  public void indexChampionship(JsonObject doc) {
    if(actualFinalFour != null) {
      doc.put("actualFinalFour_stored_string", actualFinalFour.toString());
    }
    if(actualChampionship != null) {
      doc.put("actualChampionship_stored_string", actualChampionship.toString());
    }
    if(finalFour != null) {
      doc.put("finalFour_docvalues_string", finalFour);
    }
    if(guesserId != null) {
      doc.put("guesserId_docvalues_string", guesserId);
    }
    if(correctGuesses != null) {
      doc.put("correctGuesses_docvalues_int", correctGuesses);
    }
    if(incorrectGuesses != null) {
      doc.put("incorrectGuesses_docvalues_int", incorrectGuesses);
    }
    if(year != null) {
      doc.put("year_docvalues_int", year);
    }
    if(bracketId != null) {
      doc.put("bracketId_docvalues_string", bracketId);
    }
    if(name != null) {
      doc.put("name_docvalues_string", name);
    }
    if(game1WinnerGuess != null) {
      doc.put("game1WinnerGuess_docvalues_string", game1WinnerGuess);
    }
    if(game1Winner != null) {
      doc.put("game1Winner_docvalues_string", game1Winner);
    }
    if(game1Loser != null) {
      doc.put("game1Loser_docvalues_string", game1Loser);
    }
    super.indexBaseModel(doc);

	}

  public static String varStoredChampionship(String entityVar) {
    switch(entityVar) {
      case "actualFinalFour":
        return "actualFinalFour_stored_string";
      case "actualChampionship":
        return "actualChampionship_stored_string";
      case "finalFour":
        return "finalFour_docvalues_string";
      case "guesserId":
        return "guesserId_docvalues_string";
      case "correctGuesses":
        return "correctGuesses_docvalues_int";
      case "incorrectGuesses":
        return "incorrectGuesses_docvalues_int";
      case "year":
        return "year_docvalues_int";
      case "bracketId":
        return "bracketId_docvalues_string";
      case "name":
        return "name_docvalues_string";
      case "game1WinnerGuess":
        return "game1WinnerGuess_docvalues_string";
      case "game1Winner":
        return "game1Winner_docvalues_string";
      case "game1Loser":
        return "game1Loser_docvalues_string";
      default:
        return BaseModel.varStoredBaseModel(entityVar);
    }
  }

  public static String varIndexedChampionship(String entityVar) {
    switch(entityVar) {
      case "finalFour":
        return "finalFour_docvalues_string";
      case "guesserId":
        return "guesserId_docvalues_string";
      case "correctGuesses":
        return "correctGuesses_docvalues_int";
      case "incorrectGuesses":
        return "incorrectGuesses_docvalues_int";
      case "year":
        return "year_docvalues_int";
      case "bracketId":
        return "bracketId_docvalues_string";
      case "name":
        return "name_docvalues_string";
      case "game1WinnerGuess":
        return "game1WinnerGuess_docvalues_string";
      case "game1Winner":
        return "game1Winner_docvalues_string";
      case "game1Loser":
        return "game1Loser_docvalues_string";
      default:
        return BaseModel.varIndexedBaseModel(entityVar);
    }
  }

  public static String searchVarChampionship(String searchVar) {
    switch(searchVar) {
      case "finalFour_docvalues_string":
        return "finalFour";
      case "guesserId_docvalues_string":
        return "guesserId";
      case "correctGuesses_docvalues_int":
        return "correctGuesses";
      case "incorrectGuesses_docvalues_int":
        return "incorrectGuesses";
      case "year_docvalues_int":
        return "year";
      case "bracketId_docvalues_string":
        return "bracketId";
      case "name_docvalues_string":
        return "name";
      case "game1WinnerGuess_docvalues_string":
        return "game1WinnerGuess";
      case "game1Winner_docvalues_string":
        return "game1Winner";
      case "game1Loser_docvalues_string":
        return "game1Loser";
      default:
        return BaseModel.searchVarBaseModel(searchVar);
    }
  }

  public static String varSearchChampionship(String entityVar) {
    switch(entityVar) {
      default:
        return BaseModel.varSearchBaseModel(entityVar);
    }
  }

  public static String varSuggestedChampionship(String entityVar) {
    switch(entityVar) {
      default:
        return BaseModel.varSuggestedBaseModel(entityVar);
    }
  }

  /////////////
  // store //
  /////////////

  @Override public void storeForClass(SolrResponse.Doc doc) {
    storeChampionship(doc);
  }
  public void storeChampionship(SolrResponse.Doc doc) {
    Championship oChampionship = (Championship)this;
    SiteRequest siteRequest = oChampionship.getSiteRequest_();

    oChampionship.setActualFinalFour(Optional.ofNullable(doc.get("actualFinalFour_stored_string")).map(v -> v.toString()).orElse(null));
    oChampionship.setActualChampionship(Optional.ofNullable(doc.get("actualChampionship_stored_string")).map(v -> v.toString()).orElse(null));
    oChampionship.setFinalFour(Optional.ofNullable(doc.get("finalFour_docvalues_string")).map(v -> v.toString()).orElse(null));
    oChampionship.setGuesserId(Optional.ofNullable(doc.get("guesserId_docvalues_string")).map(v -> v.toString()).orElse(null));
    oChampionship.setCorrectGuesses(Optional.ofNullable(doc.get("correctGuesses_docvalues_int")).map(v -> v.toString()).orElse(null));
    oChampionship.setIncorrectGuesses(Optional.ofNullable(doc.get("incorrectGuesses_docvalues_int")).map(v -> v.toString()).orElse(null));
    oChampionship.setYear(Optional.ofNullable(doc.get("year_docvalues_int")).map(v -> v.toString()).orElse(null));
    oChampionship.setBracketId(Optional.ofNullable(doc.get("bracketId_docvalues_string")).map(v -> v.toString()).orElse(null));
    oChampionship.setName(Optional.ofNullable(doc.get("name_docvalues_string")).map(v -> v.toString()).orElse(null));
    oChampionship.setGame1WinnerGuess(Optional.ofNullable(doc.get("game1WinnerGuess_docvalues_string")).map(v -> v.toString()).orElse(null));
    oChampionship.setGame1Winner(Optional.ofNullable(doc.get("game1Winner_docvalues_string")).map(v -> v.toString()).orElse(null));
    oChampionship.setGame1Loser(Optional.ofNullable(doc.get("game1Loser_docvalues_string")).map(v -> v.toString()).orElse(null));

    super.storeBaseModel(doc);
  }

  //////////////////
  // apiRequest //
  //////////////////

  public void apiRequestChampionship() {
    ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(r -> r.getApiRequest_()).orElse(null);
    Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
    if(o != null && o instanceof Championship) {
      Championship original = (Championship)o;
      if(!Objects.equals(actualFinalFour, original.getActualFinalFour()))
        apiRequest.addVars("actualFinalFour");
      if(!Objects.equals(actualChampionship, original.getActualChampionship()))
        apiRequest.addVars("actualChampionship");
      if(!Objects.equals(finalFour, original.getFinalFour()))
        apiRequest.addVars("finalFour");
      if(!Objects.equals(guesserId, original.getGuesserId()))
        apiRequest.addVars("guesserId");
      if(!Objects.equals(correctGuesses, original.getCorrectGuesses()))
        apiRequest.addVars("correctGuesses");
      if(!Objects.equals(incorrectGuesses, original.getIncorrectGuesses()))
        apiRequest.addVars("incorrectGuesses");
      if(!Objects.equals(year, original.getYear()))
        apiRequest.addVars("year");
      if(!Objects.equals(bracketId, original.getBracketId()))
        apiRequest.addVars("bracketId");
      if(!Objects.equals(name, original.getName()))
        apiRequest.addVars("name");
      if(!Objects.equals(game1WinnerGuess, original.getGame1WinnerGuess()))
        apiRequest.addVars("game1WinnerGuess");
      if(!Objects.equals(game1Winner, original.getGame1Winner()))
        apiRequest.addVars("game1Winner");
      if(!Objects.equals(game1Loser, original.getGame1Loser()))
        apiRequest.addVars("game1Loser");
      super.apiRequestBaseModel();
    }
  }

  //////////////
  // toString //
  //////////////

  @Override public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(super.toString());
    sb.append(Optional.ofNullable(actualFinalFour).map(v -> "actualFinalFour: " + v + "\n").orElse(""));
    sb.append(Optional.ofNullable(actualChampionship).map(v -> "actualChampionship: " + v + "\n").orElse(""));
    sb.append(Optional.ofNullable(finalFour).map(v -> "finalFour: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(guesserId).map(v -> "guesserId: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(correctGuesses).map(v -> "correctGuesses: " + v + "\n").orElse(""));
    sb.append(Optional.ofNullable(incorrectGuesses).map(v -> "incorrectGuesses: " + v + "\n").orElse(""));
    sb.append(Optional.ofNullable(year).map(v -> "year: " + v + "\n").orElse(""));
    sb.append(Optional.ofNullable(bracketId).map(v -> "bracketId: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(name).map(v -> "name: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(game1WinnerGuess).map(v -> "game1WinnerGuess: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(game1Winner).map(v -> "game1Winner: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(game1Loser).map(v -> "game1Loser: \"" + v + "\"\n" ).orElse(""));
    return sb.toString();
  }

  public static final String CLASS_SIMPLE_NAME = "Championship";
  public static final String CLASS_CANONICAL_NAME = "org.computate.spinechamp.model.championship.Championship";
  public static final String CLASS_AUTH_RESOURCE = "CHAMPIONSHIP";
  public static final String CLASS_API_ADDRESS_Championship = "spine-champ-enUS-Championship";
  public static String getClassApiAddress() {
    return CLASS_API_ADDRESS_Championship;
  }
  public static final String VAR_actualFinalFourSearch = "actualFinalFourSearch";
  public static final String SET_actualFinalFourSearch = "setActualFinalFourSearch";
  public static final String VAR_actualFinalFour = "actualFinalFour";
  public static final String SET_actualFinalFour = "setActualFinalFour";
  public static final String VAR_actualChampionshipSearch = "actualChampionshipSearch";
  public static final String SET_actualChampionshipSearch = "setActualChampionshipSearch";
  public static final String VAR_actualChampionship = "actualChampionship";
  public static final String SET_actualChampionship = "setActualChampionship";
  public static final String VAR_finalFour = "finalFour";
  public static final String SET_finalFour = "setFinalFour";
  public static final String VAR_guesserId = "guesserId";
  public static final String SET_guesserId = "setGuesserId";
  public static final String VAR_correctGuesses = "correctGuesses";
  public static final String SET_correctGuesses = "setCorrectGuesses";
  public static final String VAR_incorrectGuesses = "incorrectGuesses";
  public static final String SET_incorrectGuesses = "setIncorrectGuesses";
  public static final String VAR_year = "year";
  public static final String SET_year = "setYear";
  public static final String VAR_bracketId = "bracketId";
  public static final String SET_bracketId = "setBracketId";
  public static final String VAR_name = "name";
  public static final String SET_name = "setName";
  public static final String VAR_game1WinnerGuess = "game1WinnerGuess";
  public static final String SET_game1WinnerGuess = "setGame1WinnerGuess";
  public static final String VAR_game1Winner = "game1Winner";
  public static final String SET_game1Winner = "setGame1Winner";
  public static final String VAR_game1Loser = "game1Loser";
  public static final String SET_game1Loser = "setGame1Loser";

  public static List<String> varsQForClass() {
    return Championship.varsQChampionship(new ArrayList<String>());
  }
  public static List<String> varsQChampionship(List<String> vars) {
    BaseModel.varsQBaseModel(vars);
    return vars;
  }

  public static List<String> varsFqForClass() {
    return Championship.varsFqChampionship(new ArrayList<String>());
  }
  public static List<String> varsFqChampionship(List<String> vars) {
    BaseModel.varsFqBaseModel(vars);
    return vars;
  }

  public static List<String> varsRangeForClass() {
    return Championship.varsRangeChampionship(new ArrayList<String>());
  }
  public static List<String> varsRangeChampionship(List<String> vars) {
    BaseModel.varsRangeBaseModel(vars);
    return vars;
  }

  public static final String DISPLAY_NAME_actualFinalFourSearch = "";
  public static final String DISPLAY_NAME_actualFinalFour = "Actual Sweet Sixteen bracket";
  public static final String DISPLAY_NAME_actualChampionshipSearch = "";
  public static final String DISPLAY_NAME_actualChampionship = "Actual Elite Eight bracket";
  public static final String DISPLAY_NAME_finalFour = "Final Four bracket";
  public static final String DISPLAY_NAME_guesserId = "guesser";
  public static final String DISPLAY_NAME_correctGuesses = "correct guesses";
  public static final String DISPLAY_NAME_incorrectGuesses = "incorrect guesses";
  public static final String DISPLAY_NAME_year = "year";
  public static final String DISPLAY_NAME_bracketId = "bracket ID";
  public static final String DISPLAY_NAME_name = "bracket name";
  public static final String DISPLAY_NAME_game1WinnerGuess = "game 1 guess";
  public static final String DISPLAY_NAME_game1Winner = "game 1 winner";
  public static final String DISPLAY_NAME_game1Loser = "game 1 loser";

  @Override
  public String idForClass() {
    return bracketId;
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
    return Championship.NameAdjectiveSingular_enUS;
  }

  @Override
  public String enUSStringFormatUrlEditPageForClass() {
    return "%s/en-us/edit/championship/%s";
  }

  public static String varJsonForClass(String var, Boolean patch) {
    return Championship.varJsonChampionship(var, patch);
  }
  public static String varJsonChampionship(String var, Boolean patch) {
    switch(var) {
    case VAR_actualFinalFourSearch:
      return patch ? SET_actualFinalFourSearch : VAR_actualFinalFourSearch;
    case VAR_actualFinalFour:
      return patch ? SET_actualFinalFour : VAR_actualFinalFour;
    case VAR_actualChampionshipSearch:
      return patch ? SET_actualChampionshipSearch : VAR_actualChampionshipSearch;
    case VAR_actualChampionship:
      return patch ? SET_actualChampionship : VAR_actualChampionship;
    case VAR_finalFour:
      return patch ? SET_finalFour : VAR_finalFour;
    case VAR_guesserId:
      return patch ? SET_guesserId : VAR_guesserId;
    case VAR_correctGuesses:
      return patch ? SET_correctGuesses : VAR_correctGuesses;
    case VAR_incorrectGuesses:
      return patch ? SET_incorrectGuesses : VAR_incorrectGuesses;
    case VAR_year:
      return patch ? SET_year : VAR_year;
    case VAR_bracketId:
      return patch ? SET_bracketId : VAR_bracketId;
    case VAR_name:
      return patch ? SET_name : VAR_name;
    case VAR_game1WinnerGuess:
      return patch ? SET_game1WinnerGuess : VAR_game1WinnerGuess;
    case VAR_game1Winner:
      return patch ? SET_game1Winner : VAR_game1Winner;
    case VAR_game1Loser:
      return patch ? SET_game1Loser : VAR_game1Loser;
    default:
      return BaseModel.varJsonBaseModel(var, patch);
    }
  }

  public static String displayNameForClass(String var) {
    return Championship.displayNameChampionship(var);
  }
  public static String displayNameChampionship(String var) {
    switch(var) {
    case VAR_actualFinalFourSearch:
      return DISPLAY_NAME_actualFinalFourSearch;
    case VAR_actualFinalFour:
      return DISPLAY_NAME_actualFinalFour;
    case VAR_actualChampionshipSearch:
      return DISPLAY_NAME_actualChampionshipSearch;
    case VAR_actualChampionship:
      return DISPLAY_NAME_actualChampionship;
    case VAR_finalFour:
      return DISPLAY_NAME_finalFour;
    case VAR_guesserId:
      return DISPLAY_NAME_guesserId;
    case VAR_correctGuesses:
      return DISPLAY_NAME_correctGuesses;
    case VAR_incorrectGuesses:
      return DISPLAY_NAME_incorrectGuesses;
    case VAR_year:
      return DISPLAY_NAME_year;
    case VAR_bracketId:
      return DISPLAY_NAME_bracketId;
    case VAR_name:
      return DISPLAY_NAME_name;
    case VAR_game1WinnerGuess:
      return DISPLAY_NAME_game1WinnerGuess;
    case VAR_game1Winner:
      return DISPLAY_NAME_game1Winner;
    case VAR_game1Loser:
      return DISPLAY_NAME_game1Loser;
    default:
      return BaseModel.displayNameBaseModel(var);
    }
  }

  public static String descriptionChampionship(String var) {
    if(var == null)
      return null;
    switch(var) {
    case VAR_actualFinalFour:
      return "The Sweet Sixteen bracket of this tournament";
    case VAR_actualChampionship:
      return "The Elite Eight bracket of this tournament";
    case VAR_finalFour:
      return "The Final Four bracket of this tournament";
    case VAR_guesserId:
      return "The ID of this guesser";
    case VAR_correctGuesses:
      return "The number of correct guesses in this Championship bracket";
    case VAR_incorrectGuesses:
      return "The number of incorrect guesses in this Championship bracket";
    case VAR_year:
      return "The year of the tournament";
    case VAR_bracketId:
      return "The ID of this bracket";
    case VAR_name:
      return "The name of this bracket";
      default:
        return BaseModel.descriptionBaseModel(var);
    }
  }

  public static String classSimpleNameChampionship(String var) {
    switch(var) {
    case VAR_actualFinalFourSearch:
      return "SearchList";
    case VAR_actualFinalFour:
      return "JsonObject";
    case VAR_actualChampionshipSearch:
      return "SearchList";
    case VAR_actualChampionship:
      return "JsonObject";
    case VAR_finalFour:
      return "String";
    case VAR_guesserId:
      return "String";
    case VAR_correctGuesses:
      return "Integer";
    case VAR_incorrectGuesses:
      return "Integer";
    case VAR_year:
      return "Integer";
    case VAR_bracketId:
      return "String";
    case VAR_name:
      return "String";
    case VAR_game1WinnerGuess:
      return "String";
    case VAR_game1Winner:
      return "String";
    case VAR_game1Loser:
      return "String";
      default:
        return BaseModel.classSimpleNameBaseModel(var);
    }
  }

  public static Integer htmColumnChampionship(String var) {
    switch(var) {
    case VAR_guesserId:
      return 0;
    case VAR_year:
      return 1;
      default:
        return BaseModel.htmColumnBaseModel(var);
    }
  }

  public static Integer htmRowChampionship(String var) {
    switch(var) {
    case VAR_finalFour:
      return 3;
    case VAR_guesserId:
      return 4;
    case VAR_correctGuesses:
      return 4;
    case VAR_incorrectGuesses:
      return 4;
    case VAR_year:
      return 4;
    case VAR_game1WinnerGuess:
      return 5;
    case VAR_game1Winner:
      return 5;
    case VAR_game1Loser:
      return 5;
      default:
        return BaseModel.htmRowBaseModel(var);
    }
  }

  public static Integer htmCellChampionship(String var) {
    switch(var) {
    case VAR_finalFour:
      return 0;
    case VAR_guesserId:
      return 0;
    case VAR_correctGuesses:
      return 1;
    case VAR_incorrectGuesses:
      return 2;
    case VAR_year:
      return 1;
    case VAR_game1WinnerGuess:
      return 0;
    case VAR_game1Winner:
      return 1;
    case VAR_game1Loser:
      return 2;
      default:
        return BaseModel.htmCellBaseModel(var);
    }
  }

  public static Integer lengthMinChampionship(String var) {
    switch(var) {
      default:
        return BaseModel.lengthMinBaseModel(var);
    }
  }

  public static Integer lengthMaxChampionship(String var) {
    switch(var) {
      default:
        return BaseModel.lengthMaxBaseModel(var);
    }
  }

  public static Integer maxChampionship(String var) {
    switch(var) {
      default:
        return BaseModel.maxBaseModel(var);
    }
  }

  public static Integer minChampionship(String var) {
    switch(var) {
      default:
        return BaseModel.minBaseModel(var);
    }
  }
}
