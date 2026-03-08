package org.computate.spinechamp.model.finalfour;

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
import org.computate.spinechamp.model.eliteeight.EliteEight;
import org.computate.vertx.serialize.vertx.JsonObjectDeserializer;
import org.computate.spinechamp.model.finalfour.FinalFour;
import java.lang.String;
import org.computate.spinechamp.model.guesser.Guesser;
import java.lang.Integer;
import org.computate.spinechamp.model.team.Team;
import org.computate.spinechamp.model.championship.Championship;
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
 * <li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class FinalFourGen into the class FinalFour. 
 * </li><li>You can add a class comment "Rows: 100" if you wish the FinalFour API to return more or less than 10 records by default. 
 * In this case, the API will return 100 records from the API instead of 10 by default. 
 * Each API has built in pagination of the search records to ensure a user can query all the data a page at a time without running the application out of memory. 
 * </li>
 * <h3>About the FinalFour class and it's generated class FinalFourGen&lt;BaseModel&gt;: </h3>extends FinalFourGen
 * <p>
 * This Java class extends a generated Java class FinalFourGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.finalfour.FinalFour">Find the class FinalFour in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends FinalFourGen<BaseModel>
 * <p>This <code>class FinalFour extends FinalFourGen&lt;BaseModel&gt;</code>, which means it extends a newly generated FinalFourGen. 
 * The generated <code>class FinalFourGen extends BaseModel</code> which means that FinalFour extends FinalFourGen which extends BaseModel. 
 * This generated inheritance is a powerful feature that allows a lot of boiler plate code to be created for you automatically while still preserving inheritance through the power of Java Generic classes. 
 * </p>
 * <h2>Api: true</h2>
 * <p>This class contains a comment <b>"Api: true"</b>, which means this class will have Java Vert.x API backend code generated for these objects. 
 * </p>
 * <h2>ApiTag.enUS: true</h2>
 * <p>This class contains a comment <b>"ApiTag: final four brackets"</b>, which groups all of the OpenAPIs for FinalFour objects under the tag "final four brackets". 
 * </p>
 * <h2>ApiUri.enUS: /en-us/api/final-four</h2>
 * <p>This class contains a comment <b>"ApiUri: /en-us/api/final-four"</b>, which defines the base API URI for FinalFour objects as "/en-us/api/final-four" in the OpenAPI spec. 
 * </p>
 * <h2>Color: null</h2>
 * <h2>Indexed: true</h2>
 * <p>This class contains a comment <b>"Indexed: true"</b>, which means this class will be indexed in the search engine. 
 * Every protected void method that begins with "_" that is marked to be searched with a comment like "Indexed: true", "Stored: true", or "DocValues: true" will be indexed in the search engine. 
 * </p>
 * <h2>{@inheritDoc}</h2>
 * <p>By adding a class comment "{@inheritDoc}", the FinalFour class will inherit the helpful inherited class comments from the super class FinalFourGen. 
 * </p>
 * <h2>Rows: null</h2>
 * <h2>Order: 9</h2>
 * <p>This class contains a comment <b>"Order: 9"</b>, which means this class will be sorted by the given number 9 ascending when code that relates to multiple classes at the same time is generated. 
 * </p>
 * <h2>SqlOrder: 8</h2>
 * <p>This class contains a comment <b>"SqlOrder: 8"</b>, which means this class will be sorted by the given number 8 ascending when SQL code to create and drop the tables is generated. 
 * </p>
 * <h2>Model: true</h2>
 * <p>This class contains a comment <b>"Model: true"</b>, which means this class will be stored in the database. 
 * Every protected void method that begins with "_" that contains a "Persist: true" comment will be a persisted field in the database table. 
 * </p>
 * <h2>Page: true</h2>
 * <p>This class contains a comment <b>"Page: true"</b>, which means this class will have webpage code generated for these objects. 
 * Java Vert.x backend API code, Handlebars HTML template frontend code, and JavaScript code will all generated and can be extended. 
 * This creates a new Java class org.computate.spinechamp.model.finalfour.FinalFourPage. 
 * </p>
 * <h2>SuperPage.enUS: PageLayout</h2>
 * <p>This class contains a comment <b>"SuperPage.enUS: PageLayout"</b>, which identifies the Java super class of the page code by it's class simple name "PageLayout". 
 * This means that the newly created class org.computate.spinechamp.model.finalfour.FinalFourPage extends org.computate.spinechamp.page.PageLayout. 
 * </p>
 * <h2>Promise: true</h2>
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the FinalFour Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * <h2>AName.enUS: a final four bracket</h2>
 * <p>This class contains a comment <b>"AName.enUS: a final four bracket"</b>, which identifies the language context to describe a FinalFour as "a final four bracket". 
 * </p>
 * <p>
 * Delete the class FinalFour in Solr: 
 * <pre>
 * curl -k 'https://solr.apps-crc.testing/solr/computate/update?commitWithin=1000&amp;overwrite=true&amp;wt=json' -X POST -H 'Content-type: text/xml' -u "admin:$(oc -n solr get secret/solr-solrcloud-security-bootstrap -o jsonpath={.data.admin} | base64 -d)" --data-raw '&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.finalfour.FinalFour&lt;/query&gt;&lt;/delete&gt;'
 * </pre>
 * </p>
 * <p>
 * Delete  the package org.computate.spinechamp.model.finalfour in Solr: 
 * <pre>
 * curl -k 'https://solr.apps-crc.testing/solr/computate/update?commitWithin=1000&amp;overwrite=true&amp;wt=json' -X POST -H 'Content-type: text/xml' -u "admin:$(oc -n solr get secret/solr-solrcloud-security-bootstrap -o jsonpath={.data.admin} | base64 -d)" --data-raw '&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.spinechamp.model.finalfour&lt;/query&gt;&lt;/delete&gt;'
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
public abstract class FinalFourGen<DEV> extends BaseModel {
  protected static final Logger LOG = LoggerFactory.getLogger(FinalFour.class);

  public static final String Description_enUS = "A predicted tournament with 4 teams. ";
  public static final String AName_enUS = "a final four bracket";
  public static final String This_enUS = "this ";
  public static final String ThisName_enUS = "this final four bracket";
  public static final String A_enUS = "a ";
  public static final String TheName_enUS = "the final four bracket";
  public static final String SingularName_enUS = "final four bracket";
  public static final String PluralName_enUS = "final four brackets";
  public static final String NameActual_enUS = "current final four bracket";
  public static final String AllName_enUS = "all final four brackets";
  public static final String SearchAllNameBy_enUS = "search final four brackets by ";
  public static final String SearchAllName_enUS = "search final four brackets";
  public static final String Title_enUS = "final four brackets";
  public static final String ThePluralName_enUS = "the final four brackets";
  public static final String NoNameFound_enUS = "no final four bracket found";
  public static final String ApiUri_enUS = "/en-us/api/final-four";
  public static final String ApiUriSearchPage_enUS = "/en-us/search/final-four";
  public static final String ApiUriEditPage_enUS = "/en-us/edit/final-four/{bracketId}";
  public static final String OfName_enUS = "of final four bracket";
  public static final String ANameAdjective_enUS = "a final four bracket";
  public static final String NameAdjectiveSingular_enUS = "final four bracket";
  public static final String NameAdjectivePlural_enUS = "final four brackets";
  public static final String Search_enUS_OpenApiUri = "/en-us/api/final-four";
  public static final String Search_enUS_StringFormatUri = "/en-us/api/final-four";
  public static final String Search_enUS_StringFormatUrl = "%s/en-us/api/final-four";
  public static final String GET_enUS_OpenApiUri = "/en-us/api/final-four/{bracketId}";
  public static final String GET_enUS_StringFormatUri = "/en-us/api/final-four/%s";
  public static final String GET_enUS_StringFormatUrl = "%s/en-us/api/final-four/%s";
  public static final String PATCH_enUS_OpenApiUri = "/en-us/api/final-four";
  public static final String PATCH_enUS_StringFormatUri = "/en-us/api/final-four";
  public static final String PATCH_enUS_StringFormatUrl = "%s/en-us/api/final-four";
  public static final String POST_enUS_OpenApiUri = "/en-us/api/final-four";
  public static final String POST_enUS_StringFormatUri = "/en-us/api/final-four";
  public static final String POST_enUS_StringFormatUrl = "%s/en-us/api/final-four";
  public static final String DELETE_enUS_OpenApiUri = "/en-us/api/final-four/{bracketId}";
  public static final String DELETE_enUS_StringFormatUri = "/en-us/api/final-four/%s";
  public static final String DELETE_enUS_StringFormatUrl = "%s/en-us/api/final-four/%s";
  public static final String PUTImport_enUS_OpenApiUri = "/en-us/api/final-four-import";
  public static final String PUTImport_enUS_StringFormatUri = "/en-us/api/final-four-import";
  public static final String PUTImport_enUS_StringFormatUrl = "%s/en-us/api/final-four-import";
  public static final String SearchPage_enUS_OpenApiUri = "/en-us/search/final-four";
  public static final String SearchPage_enUS_StringFormatUri = "/en-us/search/final-four";
  public static final String SearchPage_enUS_StringFormatUrl = "%s/en-us/search/final-four";
  public static final String EditPage_enUS_OpenApiUri = "/en-us/edit/final-four/{bracketId}";
  public static final String EditPage_enUS_StringFormatUri = "/en-us/edit/final-four/%s";
  public static final String EditPage_enUS_StringFormatUrl = "%s/en-us/edit/final-four/%s";
  public static final String DELETEFilter_enUS_OpenApiUri = "/en-us/api/final-four";
  public static final String DELETEFilter_enUS_StringFormatUri = "/en-us/api/final-four";
  public static final String DELETEFilter_enUS_StringFormatUrl = "%s/en-us/api/final-four";

  public static final String Icon = "<i class=\"fa-regular fa-buildings\"></i>";

	////////////////////////////
  // actualEliteEightSearch //
	////////////////////////////


  /**
   *  The entity actualEliteEightSearch
   *	 is defined as null before being initialized. 
   */
  @JsonIgnore
  @JsonInclude(Include.NON_NULL)
  protected SearchList<EliteEight> actualEliteEightSearch;

  /**
   * <br> The entity actualEliteEightSearch
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.finalfour.FinalFour&fq=entiteVar_enUS_indexed_string:actualEliteEightSearch">Find the entity actualEliteEightSearch in Solr</a>
   * <br>
   * @param promise is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _actualEliteEightSearch(Promise<SearchList<EliteEight>> promise);

  public SearchList<EliteEight> getActualEliteEightSearch() {
    return actualEliteEightSearch;
  }

  public void setActualEliteEightSearch(SearchList<EliteEight> actualEliteEightSearch) {
    this.actualEliteEightSearch = actualEliteEightSearch;
  }
  public static SearchList<EliteEight> staticSetActualEliteEightSearch(SiteRequest siteRequest_, String o) {
    return null;
  }
  protected Future<SearchList<EliteEight>> actualEliteEightSearchPromise() {
    Promise<SearchList<EliteEight>> promise = Promise.promise();
    Promise<SearchList<EliteEight>> promise2 = Promise.promise();
    _actualEliteEightSearch(promise2);
    promise2.future().onSuccess(o -> {
      if(o != null && actualEliteEightSearch == null) {
        o.promiseDeepForClass(siteRequest_).onSuccess(a -> {
          setActualEliteEightSearch(o);
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

	//////////////////////
  // actualEliteEight //
	//////////////////////


  /**
   *  The entity actualEliteEight
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonDeserialize(using = JsonObjectDeserializer.class)
  @JsonInclude(Include.NON_NULL)
  protected JsonObject actualEliteEight;

  /**
   * <br> The entity actualEliteEight
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.finalfour.FinalFour&fq=entiteVar_enUS_indexed_string:actualEliteEight">Find the entity actualEliteEight in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _actualEliteEight(Wrap<JsonObject> w);

  public JsonObject getActualEliteEight() {
    return actualEliteEight;
  }

  public void setActualEliteEight(JsonObject actualEliteEight) {
    this.actualEliteEight = actualEliteEight;
  }
  @JsonIgnore
  public void setActualEliteEight(String o) {
    this.actualEliteEight = FinalFour.staticSetActualEliteEight(siteRequest_, o);
  }
  public static JsonObject staticSetActualEliteEight(SiteRequest siteRequest_, String o) {
    if(o != null) {
        return new JsonObject(o);
    }
    return null;
  }
  protected FinalFour actualEliteEightInit() {
    Wrap<JsonObject> actualEliteEightWrap = new Wrap<JsonObject>().var("actualEliteEight");
    if(actualEliteEight == null) {
      _actualEliteEight(actualEliteEightWrap);
      Optional.ofNullable(actualEliteEightWrap.getO()).ifPresent(o -> {
        setActualEliteEight(o);
      });
    }
    return (FinalFour)this;
  }

  public static String staticSearchActualEliteEight(SiteRequest siteRequest_, JsonObject o) {
    return o.toString();
  }

  public static String staticSearchStrActualEliteEight(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqActualEliteEight(SiteRequest siteRequest_, String o) {
    return FinalFour.staticSearchActualEliteEight(siteRequest_, FinalFour.staticSetActualEliteEight(siteRequest_, o)).toString();
  }

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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.finalfour.FinalFour&fq=entiteVar_enUS_indexed_string:actualFinalFourSearch">Find the entity actualFinalFourSearch in Solr</a>
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.finalfour.FinalFour&fq=entiteVar_enUS_indexed_string:actualFinalFour">Find the entity actualFinalFour in Solr</a>
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
    this.actualFinalFour = FinalFour.staticSetActualFinalFour(siteRequest_, o);
  }
  public static JsonObject staticSetActualFinalFour(SiteRequest siteRequest_, String o) {
    if(o != null) {
        return new JsonObject(o);
    }
    return null;
  }
  protected FinalFour actualFinalFourInit() {
    Wrap<JsonObject> actualFinalFourWrap = new Wrap<JsonObject>().var("actualFinalFour");
    if(actualFinalFour == null) {
      _actualFinalFour(actualFinalFourWrap);
      Optional.ofNullable(actualFinalFourWrap.getO()).ifPresent(o -> {
        setActualFinalFour(o);
      });
    }
    return (FinalFour)this;
  }

  public static String staticSearchActualFinalFour(SiteRequest siteRequest_, JsonObject o) {
    return o.toString();
  }

  public static String staticSearchStrActualFinalFour(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqActualFinalFour(SiteRequest siteRequest_, String o) {
    return FinalFour.staticSearchActualFinalFour(siteRequest_, FinalFour.staticSetActualFinalFour(siteRequest_, o)).toString();
  }

	////////////////
  // eliteEight //
	////////////////


  /**
   *  The entity eliteEight
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String eliteEight;

  /**
   * <br> The entity eliteEight
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.finalfour.FinalFour&fq=entiteVar_enUS_indexed_string:eliteEight">Find the entity eliteEight in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _eliteEight(Wrap<String> w);

  public String getEliteEight() {
    return eliteEight;
  }
  public void setEliteEight(String o) {
    this.eliteEight = FinalFour.staticSetEliteEight(siteRequest_, o);
  }
  public static String staticSetEliteEight(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected FinalFour eliteEightInit() {
    Wrap<String> eliteEightWrap = new Wrap<String>().var("eliteEight");
    if(eliteEight == null) {
      _eliteEight(eliteEightWrap);
      Optional.ofNullable(eliteEightWrap.getO()).ifPresent(o -> {
        setEliteEight(o);
      });
    }
    return (FinalFour)this;
  }

  public static String staticSearchEliteEight(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrEliteEight(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqEliteEight(SiteRequest siteRequest_, String o) {
    return FinalFour.staticSearchEliteEight(siteRequest_, FinalFour.staticSetEliteEight(siteRequest_, o)).toString();
  }

  public String sqlEliteEight() {
    return eliteEight;
  }

  public static String staticJsonEliteEight(String eliteEight) {
    return eliteEight;
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.finalfour.FinalFour&fq=entiteVar_enUS_indexed_string:guesserId">Find the entity guesserId in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _guesserId(Wrap<String> w);

  public String getGuesserId() {
    return guesserId;
  }
  public void setGuesserId(String o) {
    this.guesserId = FinalFour.staticSetGuesserId(siteRequest_, o);
  }
  public static String staticSetGuesserId(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected FinalFour guesserIdInit() {
    Wrap<String> guesserIdWrap = new Wrap<String>().var("guesserId");
    if(guesserId == null) {
      _guesserId(guesserIdWrap);
      Optional.ofNullable(guesserIdWrap.getO()).ifPresent(o -> {
        setGuesserId(o);
      });
    }
    return (FinalFour)this;
  }

  public static String staticSearchGuesserId(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrGuesserId(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqGuesserId(SiteRequest siteRequest_, String o) {
    return FinalFour.staticSearchGuesserId(siteRequest_, FinalFour.staticSetGuesserId(siteRequest_, o)).toString();
  }

  public String sqlGuesserId() {
    return guesserId;
  }

  public static String staticJsonGuesserId(String guesserId) {
    return guesserId;
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.finalfour.FinalFour&fq=entiteVar_enUS_indexed_string:year">Find the entity year in Solr</a>
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
    this.year = FinalFour.staticSetYear(siteRequest_, o);
  }
  public static Integer staticSetYear(SiteRequest siteRequest_, String o) {
    if(NumberUtils.isParsable(o))
      return Integer.parseInt(o);
    return null;
  }
  protected FinalFour yearInit() {
    Wrap<Integer> yearWrap = new Wrap<Integer>().var("year");
    if(year == null) {
      _year(yearWrap);
      Optional.ofNullable(yearWrap.getO()).ifPresent(o -> {
        setYear(o);
      });
    }
    return (FinalFour)this;
  }

  public static Integer staticSearchYear(SiteRequest siteRequest_, Integer o) {
    return o;
  }

  public static String staticSearchStrYear(SiteRequest siteRequest_, Integer o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqYear(SiteRequest siteRequest_, String o) {
    return FinalFour.staticSearchYear(siteRequest_, FinalFour.staticSetYear(siteRequest_, o)).toString();
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.finalfour.FinalFour&fq=entiteVar_enUS_indexed_string:bracketId">Find the entity bracketId in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _bracketId(Wrap<String> w);

  public String getBracketId() {
    return bracketId;
  }
  public void setBracketId(String o) {
    this.bracketId = FinalFour.staticSetBracketId(siteRequest_, o);
  }
  public static String staticSetBracketId(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected FinalFour bracketIdInit() {
    Wrap<String> bracketIdWrap = new Wrap<String>().var("bracketId");
    if(bracketId == null) {
      _bracketId(bracketIdWrap);
      Optional.ofNullable(bracketIdWrap.getO()).ifPresent(o -> {
        setBracketId(o);
      });
    }
    return (FinalFour)this;
  }

  public static String staticSearchBracketId(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrBracketId(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqBracketId(SiteRequest siteRequest_, String o) {
    return FinalFour.staticSearchBracketId(siteRequest_, FinalFour.staticSetBracketId(siteRequest_, o)).toString();
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.finalfour.FinalFour&fq=entiteVar_enUS_indexed_string:name">Find the entity name in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _name(Wrap<String> w);

  public String getName() {
    return name;
  }
  public void setName(String o) {
    this.name = FinalFour.staticSetName(siteRequest_, o);
  }
  public static String staticSetName(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected FinalFour nameInit() {
    Wrap<String> nameWrap = new Wrap<String>().var("name");
    if(name == null) {
      _name(nameWrap);
      Optional.ofNullable(nameWrap.getO()).ifPresent(o -> {
        setName(o);
      });
    }
    return (FinalFour)this;
  }

  public static String staticSearchName(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrName(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqName(SiteRequest siteRequest_, String o) {
    return FinalFour.staticSearchName(siteRequest_, FinalFour.staticSetName(siteRequest_, o)).toString();
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.finalfour.FinalFour&fq=entiteVar_enUS_indexed_string:game1WinnerGuess">Find the entity game1WinnerGuess in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _game1WinnerGuess(Wrap<String> w);

  public String getGame1WinnerGuess() {
    return game1WinnerGuess;
  }
  public void setGame1WinnerGuess(String o) {
    this.game1WinnerGuess = FinalFour.staticSetGame1WinnerGuess(siteRequest_, o);
  }
  public static String staticSetGame1WinnerGuess(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected FinalFour game1WinnerGuessInit() {
    Wrap<String> game1WinnerGuessWrap = new Wrap<String>().var("game1WinnerGuess");
    if(game1WinnerGuess == null) {
      _game1WinnerGuess(game1WinnerGuessWrap);
      Optional.ofNullable(game1WinnerGuessWrap.getO()).ifPresent(o -> {
        setGame1WinnerGuess(o);
      });
    }
    return (FinalFour)this;
  }

  public static String staticSearchGame1WinnerGuess(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrGame1WinnerGuess(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqGame1WinnerGuess(SiteRequest siteRequest_, String o) {
    return FinalFour.staticSearchGame1WinnerGuess(siteRequest_, FinalFour.staticSetGame1WinnerGuess(siteRequest_, o)).toString();
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.finalfour.FinalFour&fq=entiteVar_enUS_indexed_string:game1Winner">Find the entity game1Winner in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _game1Winner(Wrap<String> w);

  public String getGame1Winner() {
    return game1Winner;
  }
  public void setGame1Winner(String o) {
    this.game1Winner = FinalFour.staticSetGame1Winner(siteRequest_, o);
  }
  public static String staticSetGame1Winner(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected FinalFour game1WinnerInit() {
    Wrap<String> game1WinnerWrap = new Wrap<String>().var("game1Winner");
    if(game1Winner == null) {
      _game1Winner(game1WinnerWrap);
      Optional.ofNullable(game1WinnerWrap.getO()).ifPresent(o -> {
        setGame1Winner(o);
      });
    }
    return (FinalFour)this;
  }

  public static String staticSearchGame1Winner(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrGame1Winner(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqGame1Winner(SiteRequest siteRequest_, String o) {
    return FinalFour.staticSearchGame1Winner(siteRequest_, FinalFour.staticSetGame1Winner(siteRequest_, o)).toString();
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.finalfour.FinalFour&fq=entiteVar_enUS_indexed_string:game1Loser">Find the entity game1Loser in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _game1Loser(Wrap<String> w);

  public String getGame1Loser() {
    return game1Loser;
  }
  public void setGame1Loser(String o) {
    this.game1Loser = FinalFour.staticSetGame1Loser(siteRequest_, o);
  }
  public static String staticSetGame1Loser(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected FinalFour game1LoserInit() {
    Wrap<String> game1LoserWrap = new Wrap<String>().var("game1Loser");
    if(game1Loser == null) {
      _game1Loser(game1LoserWrap);
      Optional.ofNullable(game1LoserWrap.getO()).ifPresent(o -> {
        setGame1Loser(o);
      });
    }
    return (FinalFour)this;
  }

  public static String staticSearchGame1Loser(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrGame1Loser(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqGame1Loser(SiteRequest siteRequest_, String o) {
    return FinalFour.staticSearchGame1Loser(siteRequest_, FinalFour.staticSetGame1Loser(siteRequest_, o)).toString();
  }

  public String sqlGame1Loser() {
    return game1Loser;
  }

  public static String staticJsonGame1Loser(String game1Loser) {
    return game1Loser;
  }

	//////////////////////
  // game2WinnerGuess //
	//////////////////////


  /**
   *  The entity game2WinnerGuess
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String game2WinnerGuess;

  /**
   * <br> The entity game2WinnerGuess
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.finalfour.FinalFour&fq=entiteVar_enUS_indexed_string:game2WinnerGuess">Find the entity game2WinnerGuess in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _game2WinnerGuess(Wrap<String> w);

  public String getGame2WinnerGuess() {
    return game2WinnerGuess;
  }
  public void setGame2WinnerGuess(String o) {
    this.game2WinnerGuess = FinalFour.staticSetGame2WinnerGuess(siteRequest_, o);
  }
  public static String staticSetGame2WinnerGuess(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected FinalFour game2WinnerGuessInit() {
    Wrap<String> game2WinnerGuessWrap = new Wrap<String>().var("game2WinnerGuess");
    if(game2WinnerGuess == null) {
      _game2WinnerGuess(game2WinnerGuessWrap);
      Optional.ofNullable(game2WinnerGuessWrap.getO()).ifPresent(o -> {
        setGame2WinnerGuess(o);
      });
    }
    return (FinalFour)this;
  }

  public static String staticSearchGame2WinnerGuess(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrGame2WinnerGuess(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqGame2WinnerGuess(SiteRequest siteRequest_, String o) {
    return FinalFour.staticSearchGame2WinnerGuess(siteRequest_, FinalFour.staticSetGame2WinnerGuess(siteRequest_, o)).toString();
  }

	/////////////////
  // game2Winner //
	/////////////////


  /**
   *  The entity game2Winner
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String game2Winner;

  /**
   * <br> The entity game2Winner
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.finalfour.FinalFour&fq=entiteVar_enUS_indexed_string:game2Winner">Find the entity game2Winner in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _game2Winner(Wrap<String> w);

  public String getGame2Winner() {
    return game2Winner;
  }
  public void setGame2Winner(String o) {
    this.game2Winner = FinalFour.staticSetGame2Winner(siteRequest_, o);
  }
  public static String staticSetGame2Winner(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected FinalFour game2WinnerInit() {
    Wrap<String> game2WinnerWrap = new Wrap<String>().var("game2Winner");
    if(game2Winner == null) {
      _game2Winner(game2WinnerWrap);
      Optional.ofNullable(game2WinnerWrap.getO()).ifPresent(o -> {
        setGame2Winner(o);
      });
    }
    return (FinalFour)this;
  }

  public static String staticSearchGame2Winner(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrGame2Winner(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqGame2Winner(SiteRequest siteRequest_, String o) {
    return FinalFour.staticSearchGame2Winner(siteRequest_, FinalFour.staticSetGame2Winner(siteRequest_, o)).toString();
  }

  public String sqlGame2Winner() {
    return game2Winner;
  }

  public static String staticJsonGame2Winner(String game2Winner) {
    return game2Winner;
  }

	////////////////
  // game2Loser //
	////////////////


  /**
   *  The entity game2Loser
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String game2Loser;

  /**
   * <br> The entity game2Loser
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.finalfour.FinalFour&fq=entiteVar_enUS_indexed_string:game2Loser">Find the entity game2Loser in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _game2Loser(Wrap<String> w);

  public String getGame2Loser() {
    return game2Loser;
  }
  public void setGame2Loser(String o) {
    this.game2Loser = FinalFour.staticSetGame2Loser(siteRequest_, o);
  }
  public static String staticSetGame2Loser(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected FinalFour game2LoserInit() {
    Wrap<String> game2LoserWrap = new Wrap<String>().var("game2Loser");
    if(game2Loser == null) {
      _game2Loser(game2LoserWrap);
      Optional.ofNullable(game2LoserWrap.getO()).ifPresent(o -> {
        setGame2Loser(o);
      });
    }
    return (FinalFour)this;
  }

  public static String staticSearchGame2Loser(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrGame2Loser(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqGame2Loser(SiteRequest siteRequest_, String o) {
    return FinalFour.staticSearchGame2Loser(siteRequest_, FinalFour.staticSetGame2Loser(siteRequest_, o)).toString();
  }

  public String sqlGame2Loser() {
    return game2Loser;
  }

  public static String staticJsonGame2Loser(String game2Loser) {
    return game2Loser;
  }

	//////////////////
  // championship //
	//////////////////


  /**
   *  The entity championship
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String championship;

  /**
   * <br> The entity championship
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.finalfour.FinalFour&fq=entiteVar_enUS_indexed_string:championship">Find the entity championship in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _championship(Wrap<String> w);

  public String getChampionship() {
    return championship;
  }
  public void setChampionship(String o) {
    this.championship = FinalFour.staticSetChampionship(siteRequest_, o);
  }
  public static String staticSetChampionship(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected FinalFour championshipInit() {
    Wrap<String> championshipWrap = new Wrap<String>().var("championship");
    if(championship == null) {
      _championship(championshipWrap);
      Optional.ofNullable(championshipWrap.getO()).ifPresent(o -> {
        setChampionship(o);
      });
    }
    return (FinalFour)this;
  }

  public static String staticSearchChampionship(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrChampionship(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqChampionship(SiteRequest siteRequest_, String o) {
    return FinalFour.staticSearchChampionship(siteRequest_, FinalFour.staticSetChampionship(siteRequest_, o)).toString();
  }

  public String sqlChampionship() {
    return championship;
  }

  public static String staticJsonChampionship(String championship) {
    return championship;
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.finalfour.FinalFour&fq=entiteVar_enUS_indexed_string:correctGuesses">Find the entity correctGuesses in Solr</a>
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
    this.correctGuesses = FinalFour.staticSetCorrectGuesses(siteRequest_, o);
  }
  public static Integer staticSetCorrectGuesses(SiteRequest siteRequest_, String o) {
    if(NumberUtils.isParsable(o))
      return Integer.parseInt(o);
    return null;
  }
  protected FinalFour correctGuessesInit() {
    Wrap<Integer> correctGuessesWrap = new Wrap<Integer>().var("correctGuesses");
    if(correctGuesses == null) {
      _correctGuesses(correctGuessesWrap);
      Optional.ofNullable(correctGuessesWrap.getO()).ifPresent(o -> {
        setCorrectGuesses(o);
      });
    }
    return (FinalFour)this;
  }

  public static Integer staticSearchCorrectGuesses(SiteRequest siteRequest_, Integer o) {
    return o;
  }

  public static String staticSearchStrCorrectGuesses(SiteRequest siteRequest_, Integer o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqCorrectGuesses(SiteRequest siteRequest_, String o) {
    return FinalFour.staticSearchCorrectGuesses(siteRequest_, FinalFour.staticSetCorrectGuesses(siteRequest_, o)).toString();
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.finalfour.FinalFour&fq=entiteVar_enUS_indexed_string:incorrectGuesses">Find the entity incorrectGuesses in Solr</a>
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
    this.incorrectGuesses = FinalFour.staticSetIncorrectGuesses(siteRequest_, o);
  }
  public static Integer staticSetIncorrectGuesses(SiteRequest siteRequest_, String o) {
    if(NumberUtils.isParsable(o))
      return Integer.parseInt(o);
    return null;
  }
  protected FinalFour incorrectGuessesInit() {
    Wrap<Integer> incorrectGuessesWrap = new Wrap<Integer>().var("incorrectGuesses");
    if(incorrectGuesses == null) {
      _incorrectGuesses(incorrectGuessesWrap);
      Optional.ofNullable(incorrectGuessesWrap.getO()).ifPresent(o -> {
        setIncorrectGuesses(o);
      });
    }
    return (FinalFour)this;
  }

  public static Integer staticSearchIncorrectGuesses(SiteRequest siteRequest_, Integer o) {
    return o;
  }

  public static String staticSearchStrIncorrectGuesses(SiteRequest siteRequest_, Integer o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqIncorrectGuesses(SiteRequest siteRequest_, String o) {
    return FinalFour.staticSearchIncorrectGuesses(siteRequest_, FinalFour.staticSetIncorrectGuesses(siteRequest_, o)).toString();
  }

  //////////////
  // initDeep //
  //////////////

  public Future<FinalFourGen<DEV>> promiseDeepFinalFour(SiteRequest siteRequest_) {
    setSiteRequest_(siteRequest_);
    return promiseDeepFinalFour();
  }

  public Future<FinalFourGen<DEV>> promiseDeepFinalFour() {
    Promise<FinalFourGen<DEV>> promise = Promise.promise();
    Promise<Void> promise2 = Promise.promise();
    promiseFinalFour(promise2);
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

  public Future<Void> promiseFinalFour(Promise<Void> promise) {
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
      actualEliteEightSearchPromise().onSuccess(actualEliteEightSearch -> {
        promise2.complete();
      }).onFailure(ex -> {
        promise2.fail(ex);
      });
      return promise2.future();
    }).compose(a -> {
      Promise<Void> promise2 = Promise.promise();
      try {
        actualEliteEightInit();
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
        eliteEightInit();
        guesserIdInit();
        yearInit();
        bracketIdInit();
        nameInit();
        game1WinnerGuessInit();
        game1WinnerInit();
        game1LoserInit();
        game2WinnerGuessInit();
        game2WinnerInit();
        game2LoserInit();
        championshipInit();
        correctGuessesInit();
        incorrectGuessesInit();
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

  @Override public Future<? extends FinalFourGen<DEV>> promiseDeepForClass(SiteRequest siteRequest_) {
    return promiseDeepFinalFour(siteRequest_);
  }

  /////////////////
  // siteRequest //
  /////////////////

  public void siteRequestFinalFour(SiteRequest siteRequest_) {
      super.siteRequestBaseModel(siteRequest_);
    if(actualEliteEightSearch != null)
      actualEliteEightSearch.setSiteRequest_(siteRequest_);
    if(actualFinalFourSearch != null)
      actualFinalFourSearch.setSiteRequest_(siteRequest_);
  }

  public void siteRequestForClass(SiteRequest siteRequest_) {
    siteRequestFinalFour(siteRequest_);
  }

  /////////////
  // obtain //
  /////////////

  @Override public Object obtainForClass(String var) {
    String[] vars = StringUtils.split(var, ".");
    Object o = null;
    for(String v : vars) {
      if(o == null)
        o = obtainFinalFour(v);
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
  public Object obtainFinalFour(String var) {
    FinalFour oFinalFour = (FinalFour)this;
    switch(var) {
      case "actualEliteEightSearch":
        return oFinalFour.actualEliteEightSearch;
      case "actualEliteEight":
        return oFinalFour.actualEliteEight;
      case "actualFinalFourSearch":
        return oFinalFour.actualFinalFourSearch;
      case "actualFinalFour":
        return oFinalFour.actualFinalFour;
      case "eliteEight":
        return oFinalFour.eliteEight;
      case "guesserId":
        return oFinalFour.guesserId;
      case "year":
        return oFinalFour.year;
      case "bracketId":
        return oFinalFour.bracketId;
      case "name":
        return oFinalFour.name;
      case "game1WinnerGuess":
        return oFinalFour.game1WinnerGuess;
      case "game1Winner":
        return oFinalFour.game1Winner;
      case "game1Loser":
        return oFinalFour.game1Loser;
      case "game2WinnerGuess":
        return oFinalFour.game2WinnerGuess;
      case "game2Winner":
        return oFinalFour.game2Winner;
      case "game2Loser":
        return oFinalFour.game2Loser;
      case "championship":
        return oFinalFour.championship;
      case "correctGuesses":
        return oFinalFour.correctGuesses;
      case "incorrectGuesses":
        return oFinalFour.incorrectGuesses;
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
        o = relateFinalFour(v, val);
      else if(o instanceof BaseModel) {
        BaseModel baseModel = (BaseModel)o;
        o = baseModel.relateForClass(v, val);
      }
    }
    return o != null;
  }
  public Object relateFinalFour(String var, Object val) {
    FinalFour oFinalFour = (FinalFour)this;
    switch(var) {
      case "eliteEight":
        if(oFinalFour.getEliteEight() == null)
          oFinalFour.setEliteEight(Optional.ofNullable(val).map(v -> v.toString()).orElse(null));
        if(!saves.contains("eliteEight"))
          saves.add("eliteEight");
        return val;
      case "guesserId":
        if(oFinalFour.getGuesserId() == null)
          oFinalFour.setGuesserId(Optional.ofNullable(val).map(v -> v.toString()).orElse(null));
        if(!saves.contains("guesserId"))
          saves.add("guesserId");
        return val;
      case "game1Winner":
        if(oFinalFour.getGame1Winner() == null)
          oFinalFour.setGame1Winner(Optional.ofNullable(val).map(v -> v.toString()).orElse(null));
        if(!saves.contains("game1Winner"))
          saves.add("game1Winner");
        return val;
      case "game1Loser":
        if(oFinalFour.getGame1Loser() == null)
          oFinalFour.setGame1Loser(Optional.ofNullable(val).map(v -> v.toString()).orElse(null));
        if(!saves.contains("game1Loser"))
          saves.add("game1Loser");
        return val;
      case "game2Winner":
        if(oFinalFour.getGame2Winner() == null)
          oFinalFour.setGame2Winner(Optional.ofNullable(val).map(v -> v.toString()).orElse(null));
        if(!saves.contains("game2Winner"))
          saves.add("game2Winner");
        return val;
      case "game2Loser":
        if(oFinalFour.getGame2Loser() == null)
          oFinalFour.setGame2Loser(Optional.ofNullable(val).map(v -> v.toString()).orElse(null));
        if(!saves.contains("game2Loser"))
          saves.add("game2Loser");
        return val;
      case "championship":
        if(oFinalFour.getChampionship() == null)
          oFinalFour.setChampionship(Optional.ofNullable(val).map(v -> v.toString()).orElse(null));
        if(!saves.contains("championship"))
          saves.add("championship");
        return val;
      default:
        return super.relateBaseModel(var, val);
    }
  }

  ///////////////
  // staticSet //
  ///////////////

  public static Object staticSetForClass(String entityVar, SiteRequest siteRequest_, String v, FinalFour o) {
    return staticSetFinalFour(entityVar,  siteRequest_, v, o);
  }
  public static Object staticSetFinalFour(String entityVar, SiteRequest siteRequest_, String v, FinalFour o) {
    switch(entityVar) {
    case "actualEliteEight":
      return FinalFour.staticSetActualEliteEight(siteRequest_, v);
    case "actualFinalFour":
      return FinalFour.staticSetActualFinalFour(siteRequest_, v);
    case "eliteEight":
      return FinalFour.staticSetEliteEight(siteRequest_, v);
    case "guesserId":
      return FinalFour.staticSetGuesserId(siteRequest_, v);
    case "year":
      return FinalFour.staticSetYear(siteRequest_, v);
    case "bracketId":
      return FinalFour.staticSetBracketId(siteRequest_, v);
    case "name":
      return FinalFour.staticSetName(siteRequest_, v);
    case "game1WinnerGuess":
      return FinalFour.staticSetGame1WinnerGuess(siteRequest_, v);
    case "game1Winner":
      return FinalFour.staticSetGame1Winner(siteRequest_, v);
    case "game1Loser":
      return FinalFour.staticSetGame1Loser(siteRequest_, v);
    case "game2WinnerGuess":
      return FinalFour.staticSetGame2WinnerGuess(siteRequest_, v);
    case "game2Winner":
      return FinalFour.staticSetGame2Winner(siteRequest_, v);
    case "game2Loser":
      return FinalFour.staticSetGame2Loser(siteRequest_, v);
    case "championship":
      return FinalFour.staticSetChampionship(siteRequest_, v);
    case "correctGuesses":
      return FinalFour.staticSetCorrectGuesses(siteRequest_, v);
    case "incorrectGuesses":
      return FinalFour.staticSetIncorrectGuesses(siteRequest_, v);
      default:
        return BaseModel.staticSetBaseModel(entityVar,  siteRequest_, v, o);
    }
  }

  //////////////////
  // staticSearch //
  //////////////////

  public static Future<FinalFour> fqFinalFour(SiteRequest siteRequest, String var, Object val) {
    Promise<FinalFour> promise = Promise.promise();
    try {
      if(val == null) {
        promise.complete();
      } else {
        SearchList<FinalFour> searchList = new SearchList<FinalFour>();
        searchList.setStore(true);
        searchList.q("*:*");
        searchList.setC(FinalFour.class);
        searchList.fq(String.format("%s:", FinalFour.varIndexedFinalFour(var)) + SearchTool.escapeQueryChars(val.toString()));
        searchList.promiseDeepForClass(siteRequest).onSuccess(a -> {
          try {
            promise.complete(searchList.getList().stream().findFirst().orElse(null));
          } catch(Throwable ex) {
            LOG.error("Error while querying the final four bracket", ex);
            promise.fail(ex);
          }
        }).onFailure(ex -> {
          LOG.error("Error while querying the final four bracket", ex);
          promise.fail(ex);
        });
      }
    } catch(Throwable ex) {
      LOG.error("Error while querying the final four bracket", ex);
      promise.fail(ex);
    }
    return promise.future();
  }

  public static Object staticSearchForClass(String entityVar, SiteRequest siteRequest_, Object o) {
    return staticSearchFinalFour(entityVar,  siteRequest_, o);
  }
  public static Object staticSearchFinalFour(String entityVar, SiteRequest siteRequest_, Object o) {
    switch(entityVar) {
    case "actualEliteEight":
      return FinalFour.staticSearchActualEliteEight(siteRequest_, (JsonObject)o);
    case "actualFinalFour":
      return FinalFour.staticSearchActualFinalFour(siteRequest_, (JsonObject)o);
    case "eliteEight":
      return FinalFour.staticSearchEliteEight(siteRequest_, (String)o);
    case "guesserId":
      return FinalFour.staticSearchGuesserId(siteRequest_, (String)o);
    case "year":
      return FinalFour.staticSearchYear(siteRequest_, (Integer)o);
    case "bracketId":
      return FinalFour.staticSearchBracketId(siteRequest_, (String)o);
    case "name":
      return FinalFour.staticSearchName(siteRequest_, (String)o);
    case "game1WinnerGuess":
      return FinalFour.staticSearchGame1WinnerGuess(siteRequest_, (String)o);
    case "game1Winner":
      return FinalFour.staticSearchGame1Winner(siteRequest_, (String)o);
    case "game1Loser":
      return FinalFour.staticSearchGame1Loser(siteRequest_, (String)o);
    case "game2WinnerGuess":
      return FinalFour.staticSearchGame2WinnerGuess(siteRequest_, (String)o);
    case "game2Winner":
      return FinalFour.staticSearchGame2Winner(siteRequest_, (String)o);
    case "game2Loser":
      return FinalFour.staticSearchGame2Loser(siteRequest_, (String)o);
    case "championship":
      return FinalFour.staticSearchChampionship(siteRequest_, (String)o);
    case "correctGuesses":
      return FinalFour.staticSearchCorrectGuesses(siteRequest_, (Integer)o);
    case "incorrectGuesses":
      return FinalFour.staticSearchIncorrectGuesses(siteRequest_, (Integer)o);
      default:
        return BaseModel.staticSearchBaseModel(entityVar,  siteRequest_, o);
    }
  }

  ///////////////////
  // staticSearchStr //
  ///////////////////

  public static String staticSearchStrForClass(String entityVar, SiteRequest siteRequest_, Object o) {
    return staticSearchStrFinalFour(entityVar,  siteRequest_, o);
  }
  public static String staticSearchStrFinalFour(String entityVar, SiteRequest siteRequest_, Object o) {
    switch(entityVar) {
    case "actualEliteEight":
      return FinalFour.staticSearchStrActualEliteEight(siteRequest_, (String)o);
    case "actualFinalFour":
      return FinalFour.staticSearchStrActualFinalFour(siteRequest_, (String)o);
    case "eliteEight":
      return FinalFour.staticSearchStrEliteEight(siteRequest_, (String)o);
    case "guesserId":
      return FinalFour.staticSearchStrGuesserId(siteRequest_, (String)o);
    case "year":
      return FinalFour.staticSearchStrYear(siteRequest_, (Integer)o);
    case "bracketId":
      return FinalFour.staticSearchStrBracketId(siteRequest_, (String)o);
    case "name":
      return FinalFour.staticSearchStrName(siteRequest_, (String)o);
    case "game1WinnerGuess":
      return FinalFour.staticSearchStrGame1WinnerGuess(siteRequest_, (String)o);
    case "game1Winner":
      return FinalFour.staticSearchStrGame1Winner(siteRequest_, (String)o);
    case "game1Loser":
      return FinalFour.staticSearchStrGame1Loser(siteRequest_, (String)o);
    case "game2WinnerGuess":
      return FinalFour.staticSearchStrGame2WinnerGuess(siteRequest_, (String)o);
    case "game2Winner":
      return FinalFour.staticSearchStrGame2Winner(siteRequest_, (String)o);
    case "game2Loser":
      return FinalFour.staticSearchStrGame2Loser(siteRequest_, (String)o);
    case "championship":
      return FinalFour.staticSearchStrChampionship(siteRequest_, (String)o);
    case "correctGuesses":
      return FinalFour.staticSearchStrCorrectGuesses(siteRequest_, (Integer)o);
    case "incorrectGuesses":
      return FinalFour.staticSearchStrIncorrectGuesses(siteRequest_, (Integer)o);
      default:
        return BaseModel.staticSearchStrBaseModel(entityVar,  siteRequest_, o);
    }
  }

  //////////////////
  // staticSearchFq //
  //////////////////

  public static String staticSearchFqForClass(String entityVar, SiteRequest siteRequest_, String o) {
    return staticSearchFqFinalFour(entityVar,  siteRequest_, o);
  }
  public static String staticSearchFqFinalFour(String entityVar, SiteRequest siteRequest_, String o) {
    switch(entityVar) {
    case "actualEliteEight":
      return FinalFour.staticSearchFqActualEliteEight(siteRequest_, o);
    case "actualFinalFour":
      return FinalFour.staticSearchFqActualFinalFour(siteRequest_, o);
    case "eliteEight":
      return FinalFour.staticSearchFqEliteEight(siteRequest_, o);
    case "guesserId":
      return FinalFour.staticSearchFqGuesserId(siteRequest_, o);
    case "year":
      return FinalFour.staticSearchFqYear(siteRequest_, o);
    case "bracketId":
      return FinalFour.staticSearchFqBracketId(siteRequest_, o);
    case "name":
      return FinalFour.staticSearchFqName(siteRequest_, o);
    case "game1WinnerGuess":
      return FinalFour.staticSearchFqGame1WinnerGuess(siteRequest_, o);
    case "game1Winner":
      return FinalFour.staticSearchFqGame1Winner(siteRequest_, o);
    case "game1Loser":
      return FinalFour.staticSearchFqGame1Loser(siteRequest_, o);
    case "game2WinnerGuess":
      return FinalFour.staticSearchFqGame2WinnerGuess(siteRequest_, o);
    case "game2Winner":
      return FinalFour.staticSearchFqGame2Winner(siteRequest_, o);
    case "game2Loser":
      return FinalFour.staticSearchFqGame2Loser(siteRequest_, o);
    case "championship":
      return FinalFour.staticSearchFqChampionship(siteRequest_, o);
    case "correctGuesses":
      return FinalFour.staticSearchFqCorrectGuesses(siteRequest_, o);
    case "incorrectGuesses":
      return FinalFour.staticSearchFqIncorrectGuesses(siteRequest_, o);
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
          o = persistFinalFour(v, val);
        else if(o instanceof BaseModel) {
          BaseModel oBaseModel = (BaseModel)o;
          o = oBaseModel.persistForClass(v, val);
        }
      }
    }
    return o != null;
  }
  public Object persistFinalFour(String var, Object val) {
    String varLower = var.toLowerCase();
      if("eliteeight".equals(varLower)) {
        if(val instanceof String) {
          setEliteEight((String)val);
        }
        saves.add("eliteEight");
        return val;
      } else if("guesserid".equals(varLower)) {
        if(val instanceof String) {
          setGuesserId((String)val);
        }
        saves.add("guesserId");
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
      } else if("game2winner".equals(varLower)) {
        if(val instanceof String) {
          setGame2Winner((String)val);
        }
        saves.add("game2Winner");
        return val;
      } else if("game2loser".equals(varLower)) {
        if(val instanceof String) {
          setGame2Loser((String)val);
        }
        saves.add("game2Loser");
        return val;
      } else if("championship".equals(varLower)) {
        if(val instanceof String) {
          setChampionship((String)val);
        }
        saves.add("championship");
        return val;
    } else {
      return super.persistBaseModel(var, val);
    }
  }

  /////////////
  // populate //
  /////////////

  @Override public void populateForClass(SolrResponse.Doc doc) {
    populateFinalFour(doc);
  }
  public void populateFinalFour(SolrResponse.Doc doc) {
    FinalFour oFinalFour = (FinalFour)this;
    saves = Optional.ofNullable((ArrayList<String>)doc.get("saves_docvalues_strings")).orElse(new ArrayList<String>());
    if(saves != null) {

      if(saves.contains("actualEliteEight")) {
        String actualEliteEight = (String)doc.get("actualEliteEight_stored_string");
        if(actualEliteEight != null)
          oFinalFour.setActualEliteEight(actualEliteEight);
      }

      if(saves.contains("actualFinalFour")) {
        String actualFinalFour = (String)doc.get("actualFinalFour_stored_string");
        if(actualFinalFour != null)
          oFinalFour.setActualFinalFour(actualFinalFour);
      }

      String eliteEight = (String)doc.get("eliteEight_docvalues_string");
      if(eliteEight != null)
        oFinalFour.setEliteEight(eliteEight);

      String guesserId = (String)doc.get("guesserId_docvalues_string");
      if(guesserId != null)
        oFinalFour.setGuesserId(guesserId);

      if(saves.contains("year")) {
        Integer year = (Integer)doc.get("year_docvalues_int");
        if(year != null)
          oFinalFour.setYear(year);
      }

      if(saves.contains("bracketId")) {
        String bracketId = (String)doc.get("bracketId_docvalues_string");
        if(bracketId != null)
          oFinalFour.setBracketId(bracketId);
      }

      if(saves.contains("name")) {
        String name = (String)doc.get("name_docvalues_string");
        if(name != null)
          oFinalFour.setName(name);
      }

      if(saves.contains("game1WinnerGuess")) {
        String game1WinnerGuess = (String)doc.get("game1WinnerGuess_docvalues_string");
        if(game1WinnerGuess != null)
          oFinalFour.setGame1WinnerGuess(game1WinnerGuess);
      }

      String game1Winner = (String)doc.get("game1Winner_docvalues_string");
      if(game1Winner != null)
        oFinalFour.setGame1Winner(game1Winner);

      String game1Loser = (String)doc.get("game1Loser_docvalues_string");
      if(game1Loser != null)
        oFinalFour.setGame1Loser(game1Loser);

      if(saves.contains("game2WinnerGuess")) {
        String game2WinnerGuess = (String)doc.get("game2WinnerGuess_docvalues_string");
        if(game2WinnerGuess != null)
          oFinalFour.setGame2WinnerGuess(game2WinnerGuess);
      }

      String game2Winner = (String)doc.get("game2Winner_docvalues_string");
      if(game2Winner != null)
        oFinalFour.setGame2Winner(game2Winner);

      String game2Loser = (String)doc.get("game2Loser_docvalues_string");
      if(game2Loser != null)
        oFinalFour.setGame2Loser(game2Loser);

      String championship = (String)doc.get("championship_docvalues_string");
      if(championship != null)
        oFinalFour.setChampionship(championship);

      if(saves.contains("correctGuesses")) {
        Integer correctGuesses = (Integer)doc.get("correctGuesses_docvalues_int");
        if(correctGuesses != null)
          oFinalFour.setCorrectGuesses(correctGuesses);
      }

      if(saves.contains("incorrectGuesses")) {
        Integer incorrectGuesses = (Integer)doc.get("incorrectGuesses_docvalues_int");
        if(incorrectGuesses != null)
          oFinalFour.setIncorrectGuesses(incorrectGuesses);
      }
    }

    super.populateBaseModel(doc);
  }

  public void indexFinalFour(JsonObject doc) {
    if(actualEliteEight != null) {
      doc.put("actualEliteEight_stored_string", actualEliteEight.toString());
    }
    if(actualFinalFour != null) {
      doc.put("actualFinalFour_stored_string", actualFinalFour.toString());
    }
    if(eliteEight != null) {
      doc.put("eliteEight_docvalues_string", eliteEight);
    }
    if(guesserId != null) {
      doc.put("guesserId_docvalues_string", guesserId);
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
    if(game2WinnerGuess != null) {
      doc.put("game2WinnerGuess_docvalues_string", game2WinnerGuess);
    }
    if(game2Winner != null) {
      doc.put("game2Winner_docvalues_string", game2Winner);
    }
    if(game2Loser != null) {
      doc.put("game2Loser_docvalues_string", game2Loser);
    }
    if(championship != null) {
      doc.put("championship_docvalues_string", championship);
    }
    if(correctGuesses != null) {
      doc.put("correctGuesses_docvalues_int", correctGuesses);
    }
    if(incorrectGuesses != null) {
      doc.put("incorrectGuesses_docvalues_int", incorrectGuesses);
    }
    super.indexBaseModel(doc);

	}

  public static String varStoredFinalFour(String entityVar) {
    switch(entityVar) {
      case "actualEliteEight":
        return "actualEliteEight_stored_string";
      case "actualFinalFour":
        return "actualFinalFour_stored_string";
      case "eliteEight":
        return "eliteEight_docvalues_string";
      case "guesserId":
        return "guesserId_docvalues_string";
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
      case "game2WinnerGuess":
        return "game2WinnerGuess_docvalues_string";
      case "game2Winner":
        return "game2Winner_docvalues_string";
      case "game2Loser":
        return "game2Loser_docvalues_string";
      case "championship":
        return "championship_docvalues_string";
      case "correctGuesses":
        return "correctGuesses_docvalues_int";
      case "incorrectGuesses":
        return "incorrectGuesses_docvalues_int";
      default:
        return BaseModel.varStoredBaseModel(entityVar);
    }
  }

  public static String varIndexedFinalFour(String entityVar) {
    switch(entityVar) {
      case "eliteEight":
        return "eliteEight_docvalues_string";
      case "guesserId":
        return "guesserId_docvalues_string";
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
      case "game2WinnerGuess":
        return "game2WinnerGuess_docvalues_string";
      case "game2Winner":
        return "game2Winner_docvalues_string";
      case "game2Loser":
        return "game2Loser_docvalues_string";
      case "championship":
        return "championship_docvalues_string";
      case "correctGuesses":
        return "correctGuesses_docvalues_int";
      case "incorrectGuesses":
        return "incorrectGuesses_docvalues_int";
      default:
        return BaseModel.varIndexedBaseModel(entityVar);
    }
  }

  public static String searchVarFinalFour(String searchVar) {
    switch(searchVar) {
      case "eliteEight_docvalues_string":
        return "eliteEight";
      case "guesserId_docvalues_string":
        return "guesserId";
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
      case "game2WinnerGuess_docvalues_string":
        return "game2WinnerGuess";
      case "game2Winner_docvalues_string":
        return "game2Winner";
      case "game2Loser_docvalues_string":
        return "game2Loser";
      case "championship_docvalues_string":
        return "championship";
      case "correctGuesses_docvalues_int":
        return "correctGuesses";
      case "incorrectGuesses_docvalues_int":
        return "incorrectGuesses";
      default:
        return BaseModel.searchVarBaseModel(searchVar);
    }
  }

  public static String varSearchFinalFour(String entityVar) {
    switch(entityVar) {
      default:
        return BaseModel.varSearchBaseModel(entityVar);
    }
  }

  public static String varSuggestedFinalFour(String entityVar) {
    switch(entityVar) {
      default:
        return BaseModel.varSuggestedBaseModel(entityVar);
    }
  }

  /////////////
  // store //
  /////////////

  @Override public void storeForClass(SolrResponse.Doc doc) {
    storeFinalFour(doc);
  }
  public void storeFinalFour(SolrResponse.Doc doc) {
    FinalFour oFinalFour = (FinalFour)this;
    SiteRequest siteRequest = oFinalFour.getSiteRequest_();

    oFinalFour.setActualEliteEight(Optional.ofNullable(doc.get("actualEliteEight_stored_string")).map(v -> v.toString()).orElse(null));
    oFinalFour.setActualFinalFour(Optional.ofNullable(doc.get("actualFinalFour_stored_string")).map(v -> v.toString()).orElse(null));
    oFinalFour.setEliteEight(Optional.ofNullable(doc.get("eliteEight_docvalues_string")).map(v -> v.toString()).orElse(null));
    oFinalFour.setGuesserId(Optional.ofNullable(doc.get("guesserId_docvalues_string")).map(v -> v.toString()).orElse(null));
    oFinalFour.setYear(Optional.ofNullable(doc.get("year_docvalues_int")).map(v -> v.toString()).orElse(null));
    oFinalFour.setBracketId(Optional.ofNullable(doc.get("bracketId_docvalues_string")).map(v -> v.toString()).orElse(null));
    oFinalFour.setName(Optional.ofNullable(doc.get("name_docvalues_string")).map(v -> v.toString()).orElse(null));
    oFinalFour.setGame1WinnerGuess(Optional.ofNullable(doc.get("game1WinnerGuess_docvalues_string")).map(v -> v.toString()).orElse(null));
    oFinalFour.setGame1Winner(Optional.ofNullable(doc.get("game1Winner_docvalues_string")).map(v -> v.toString()).orElse(null));
    oFinalFour.setGame1Loser(Optional.ofNullable(doc.get("game1Loser_docvalues_string")).map(v -> v.toString()).orElse(null));
    oFinalFour.setGame2WinnerGuess(Optional.ofNullable(doc.get("game2WinnerGuess_docvalues_string")).map(v -> v.toString()).orElse(null));
    oFinalFour.setGame2Winner(Optional.ofNullable(doc.get("game2Winner_docvalues_string")).map(v -> v.toString()).orElse(null));
    oFinalFour.setGame2Loser(Optional.ofNullable(doc.get("game2Loser_docvalues_string")).map(v -> v.toString()).orElse(null));
    oFinalFour.setChampionship(Optional.ofNullable(doc.get("championship_docvalues_string")).map(v -> v.toString()).orElse(null));
    oFinalFour.setCorrectGuesses(Optional.ofNullable(doc.get("correctGuesses_docvalues_int")).map(v -> v.toString()).orElse(null));
    oFinalFour.setIncorrectGuesses(Optional.ofNullable(doc.get("incorrectGuesses_docvalues_int")).map(v -> v.toString()).orElse(null));

    super.storeBaseModel(doc);
  }

  //////////////////
  // apiRequest //
  //////////////////

  public void apiRequestFinalFour() {
    ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(r -> r.getApiRequest_()).orElse(null);
    Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
    if(o != null && o instanceof FinalFour) {
      FinalFour original = (FinalFour)o;
      if(!Objects.equals(actualEliteEight, original.getActualEliteEight()))
        apiRequest.addVars("actualEliteEight");
      if(!Objects.equals(actualFinalFour, original.getActualFinalFour()))
        apiRequest.addVars("actualFinalFour");
      if(!Objects.equals(eliteEight, original.getEliteEight()))
        apiRequest.addVars("eliteEight");
      if(!Objects.equals(guesserId, original.getGuesserId()))
        apiRequest.addVars("guesserId");
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
      if(!Objects.equals(game2WinnerGuess, original.getGame2WinnerGuess()))
        apiRequest.addVars("game2WinnerGuess");
      if(!Objects.equals(game2Winner, original.getGame2Winner()))
        apiRequest.addVars("game2Winner");
      if(!Objects.equals(game2Loser, original.getGame2Loser()))
        apiRequest.addVars("game2Loser");
      if(!Objects.equals(championship, original.getChampionship()))
        apiRequest.addVars("championship");
      if(!Objects.equals(correctGuesses, original.getCorrectGuesses()))
        apiRequest.addVars("correctGuesses");
      if(!Objects.equals(incorrectGuesses, original.getIncorrectGuesses()))
        apiRequest.addVars("incorrectGuesses");
      super.apiRequestBaseModel();
    }
  }

  //////////////
  // toString //
  //////////////

  @Override public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(super.toString());
    sb.append(Optional.ofNullable(actualEliteEight).map(v -> "actualEliteEight: " + v + "\n").orElse(""));
    sb.append(Optional.ofNullable(actualFinalFour).map(v -> "actualFinalFour: " + v + "\n").orElse(""));
    sb.append(Optional.ofNullable(eliteEight).map(v -> "eliteEight: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(guesserId).map(v -> "guesserId: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(year).map(v -> "year: " + v + "\n").orElse(""));
    sb.append(Optional.ofNullable(bracketId).map(v -> "bracketId: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(name).map(v -> "name: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(game1WinnerGuess).map(v -> "game1WinnerGuess: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(game1Winner).map(v -> "game1Winner: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(game1Loser).map(v -> "game1Loser: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(game2WinnerGuess).map(v -> "game2WinnerGuess: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(game2Winner).map(v -> "game2Winner: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(game2Loser).map(v -> "game2Loser: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(championship).map(v -> "championship: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(correctGuesses).map(v -> "correctGuesses: " + v + "\n").orElse(""));
    sb.append(Optional.ofNullable(incorrectGuesses).map(v -> "incorrectGuesses: " + v + "\n").orElse(""));
    return sb.toString();
  }

  public static final String CLASS_SIMPLE_NAME = "FinalFour";
  public static final String CLASS_CANONICAL_NAME = "org.computate.spinechamp.model.finalfour.FinalFour";
  public static final String CLASS_AUTH_RESOURCE = "FINALFOUR";
  public static final String CLASS_API_ADDRESS_FinalFour = "spine-champ-enUS-FinalFour";
  public static String getClassApiAddress() {
    return CLASS_API_ADDRESS_FinalFour;
  }
  public static final String VAR_actualEliteEightSearch = "actualEliteEightSearch";
  public static final String SET_actualEliteEightSearch = "setActualEliteEightSearch";
  public static final String VAR_actualEliteEight = "actualEliteEight";
  public static final String SET_actualEliteEight = "setActualEliteEight";
  public static final String VAR_actualFinalFourSearch = "actualFinalFourSearch";
  public static final String SET_actualFinalFourSearch = "setActualFinalFourSearch";
  public static final String VAR_actualFinalFour = "actualFinalFour";
  public static final String SET_actualFinalFour = "setActualFinalFour";
  public static final String VAR_eliteEight = "eliteEight";
  public static final String SET_eliteEight = "setEliteEight";
  public static final String VAR_guesserId = "guesserId";
  public static final String SET_guesserId = "setGuesserId";
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
  public static final String VAR_game2WinnerGuess = "game2WinnerGuess";
  public static final String SET_game2WinnerGuess = "setGame2WinnerGuess";
  public static final String VAR_game2Winner = "game2Winner";
  public static final String SET_game2Winner = "setGame2Winner";
  public static final String VAR_game2Loser = "game2Loser";
  public static final String SET_game2Loser = "setGame2Loser";
  public static final String VAR_championship = "championship";
  public static final String SET_championship = "setChampionship";
  public static final String VAR_correctGuesses = "correctGuesses";
  public static final String SET_correctGuesses = "setCorrectGuesses";
  public static final String VAR_incorrectGuesses = "incorrectGuesses";
  public static final String SET_incorrectGuesses = "setIncorrectGuesses";

  public static List<String> varsQForClass() {
    return FinalFour.varsQFinalFour(new ArrayList<String>());
  }
  public static List<String> varsQFinalFour(List<String> vars) {
    BaseModel.varsQBaseModel(vars);
    return vars;
  }

  public static List<String> varsFqForClass() {
    return FinalFour.varsFqFinalFour(new ArrayList<String>());
  }
  public static List<String> varsFqFinalFour(List<String> vars) {
    BaseModel.varsFqBaseModel(vars);
    return vars;
  }

  public static List<String> varsRangeForClass() {
    return FinalFour.varsRangeFinalFour(new ArrayList<String>());
  }
  public static List<String> varsRangeFinalFour(List<String> vars) {
    BaseModel.varsRangeBaseModel(vars);
    return vars;
  }

  public static final String DISPLAY_NAME_actualEliteEightSearch = "";
  public static final String DISPLAY_NAME_actualEliteEight = "Actual Elite Eight bracket";
  public static final String DISPLAY_NAME_actualFinalFourSearch = "";
  public static final String DISPLAY_NAME_actualFinalFour = "Actual Sweet Sixteen bracket";
  public static final String DISPLAY_NAME_eliteEight = "Elite eight bracket";
  public static final String DISPLAY_NAME_guesserId = "guesser";
  public static final String DISPLAY_NAME_year = "year";
  public static final String DISPLAY_NAME_bracketId = "bracket ID";
  public static final String DISPLAY_NAME_name = "bracket name";
  public static final String DISPLAY_NAME_game1WinnerGuess = "game 1 guess";
  public static final String DISPLAY_NAME_game1Winner = "game 1 winner";
  public static final String DISPLAY_NAME_game1Loser = "game 1 loser";
  public static final String DISPLAY_NAME_game2WinnerGuess = "game 2 guess";
  public static final String DISPLAY_NAME_game2Winner = "game 2 winner";
  public static final String DISPLAY_NAME_game2Loser = "game 2 loser";
  public static final String DISPLAY_NAME_championship = "Championship bracket";
  public static final String DISPLAY_NAME_correctGuesses = "correct guesses";
  public static final String DISPLAY_NAME_incorrectGuesses = "incorrect guesses";

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
    return FinalFour.NameAdjectiveSingular_enUS;
  }

  @Override
  public String enUSStringFormatUrlEditPageForClass() {
    return "%s/en-us/edit/final-four/%s";
  }

  public static String varJsonForClass(String var, Boolean patch) {
    return FinalFour.varJsonFinalFour(var, patch);
  }
  public static String varJsonFinalFour(String var, Boolean patch) {
    switch(var) {
    case VAR_actualEliteEightSearch:
      return patch ? SET_actualEliteEightSearch : VAR_actualEliteEightSearch;
    case VAR_actualEliteEight:
      return patch ? SET_actualEliteEight : VAR_actualEliteEight;
    case VAR_actualFinalFourSearch:
      return patch ? SET_actualFinalFourSearch : VAR_actualFinalFourSearch;
    case VAR_actualFinalFour:
      return patch ? SET_actualFinalFour : VAR_actualFinalFour;
    case VAR_eliteEight:
      return patch ? SET_eliteEight : VAR_eliteEight;
    case VAR_guesserId:
      return patch ? SET_guesserId : VAR_guesserId;
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
    case VAR_game2WinnerGuess:
      return patch ? SET_game2WinnerGuess : VAR_game2WinnerGuess;
    case VAR_game2Winner:
      return patch ? SET_game2Winner : VAR_game2Winner;
    case VAR_game2Loser:
      return patch ? SET_game2Loser : VAR_game2Loser;
    case VAR_championship:
      return patch ? SET_championship : VAR_championship;
    case VAR_correctGuesses:
      return patch ? SET_correctGuesses : VAR_correctGuesses;
    case VAR_incorrectGuesses:
      return patch ? SET_incorrectGuesses : VAR_incorrectGuesses;
    default:
      return BaseModel.varJsonBaseModel(var, patch);
    }
  }

  public static String displayNameForClass(String var) {
    return FinalFour.displayNameFinalFour(var);
  }
  public static String displayNameFinalFour(String var) {
    switch(var) {
    case VAR_actualEliteEightSearch:
      return DISPLAY_NAME_actualEliteEightSearch;
    case VAR_actualEliteEight:
      return DISPLAY_NAME_actualEliteEight;
    case VAR_actualFinalFourSearch:
      return DISPLAY_NAME_actualFinalFourSearch;
    case VAR_actualFinalFour:
      return DISPLAY_NAME_actualFinalFour;
    case VAR_eliteEight:
      return DISPLAY_NAME_eliteEight;
    case VAR_guesserId:
      return DISPLAY_NAME_guesserId;
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
    case VAR_game2WinnerGuess:
      return DISPLAY_NAME_game2WinnerGuess;
    case VAR_game2Winner:
      return DISPLAY_NAME_game2Winner;
    case VAR_game2Loser:
      return DISPLAY_NAME_game2Loser;
    case VAR_championship:
      return DISPLAY_NAME_championship;
    case VAR_correctGuesses:
      return DISPLAY_NAME_correctGuesses;
    case VAR_incorrectGuesses:
      return DISPLAY_NAME_incorrectGuesses;
    default:
      return BaseModel.displayNameBaseModel(var);
    }
  }

  public static String descriptionFinalFour(String var) {
    if(var == null)
      return null;
    switch(var) {
    case VAR_actualEliteEight:
      return "The Elite Eight bracket of this tournament";
    case VAR_actualFinalFour:
      return "The Sweet Sixteen bracket of this tournament";
    case VAR_eliteEight:
      return "The Elite Eight bracket of this tournament";
    case VAR_guesserId:
      return "The ID of this guesser";
    case VAR_year:
      return "The year of the tournament";
    case VAR_bracketId:
      return "The ID of this bracket";
    case VAR_name:
      return "The name of this bracket";
    case VAR_championship:
      return "The Championship bracket of this tournament";
    case VAR_correctGuesses:
      return "The number of correct guesses in this Championship bracket";
    case VAR_incorrectGuesses:
      return "The number of incorrect guesses in this Championship bracket";
      default:
        return BaseModel.descriptionBaseModel(var);
    }
  }

  public static String classSimpleNameFinalFour(String var) {
    switch(var) {
    case VAR_actualEliteEightSearch:
      return "SearchList";
    case VAR_actualEliteEight:
      return "JsonObject";
    case VAR_actualFinalFourSearch:
      return "SearchList";
    case VAR_actualFinalFour:
      return "JsonObject";
    case VAR_eliteEight:
      return "String";
    case VAR_guesserId:
      return "String";
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
    case VAR_game2WinnerGuess:
      return "String";
    case VAR_game2Winner:
      return "String";
    case VAR_game2Loser:
      return "String";
    case VAR_championship:
      return "String";
    case VAR_correctGuesses:
      return "Integer";
    case VAR_incorrectGuesses:
      return "Integer";
      default:
        return BaseModel.classSimpleNameBaseModel(var);
    }
  }

  public static Integer htmColumnFinalFour(String var) {
    switch(var) {
    case VAR_guesserId:
      return 0;
    case VAR_year:
      return 1;
      default:
        return BaseModel.htmColumnBaseModel(var);
    }
  }

  public static Integer htmRowFinalFour(String var) {
    switch(var) {
    case VAR_eliteEight:
      return 3;
    case VAR_guesserId:
      return 4;
    case VAR_year:
      return 4;
    case VAR_game1WinnerGuess:
      return 5;
    case VAR_game1Winner:
      return 5;
    case VAR_game1Loser:
      return 5;
    case VAR_game2WinnerGuess:
      return 6;
    case VAR_game2Winner:
      return 6;
    case VAR_game2Loser:
      return 6;
    case VAR_championship:
      return 10;
    case VAR_correctGuesses:
      return 4;
    case VAR_incorrectGuesses:
      return 4;
      default:
        return BaseModel.htmRowBaseModel(var);
    }
  }

  public static Integer htmCellFinalFour(String var) {
    switch(var) {
    case VAR_eliteEight:
      return 0;
    case VAR_guesserId:
      return 0;
    case VAR_year:
      return 1;
    case VAR_game1WinnerGuess:
      return 0;
    case VAR_game1Winner:
      return 1;
    case VAR_game1Loser:
      return 2;
    case VAR_game2WinnerGuess:
      return 0;
    case VAR_game2Winner:
      return 1;
    case VAR_game2Loser:
      return 2;
    case VAR_championship:
      return 0;
    case VAR_correctGuesses:
      return 2;
    case VAR_incorrectGuesses:
      return 3;
      default:
        return BaseModel.htmCellBaseModel(var);
    }
  }

  public static Integer lengthMinFinalFour(String var) {
    switch(var) {
      default:
        return BaseModel.lengthMinBaseModel(var);
    }
  }

  public static Integer lengthMaxFinalFour(String var) {
    switch(var) {
      default:
        return BaseModel.lengthMaxBaseModel(var);
    }
  }

  public static Integer maxFinalFour(String var) {
    switch(var) {
      default:
        return BaseModel.maxBaseModel(var);
    }
  }

  public static Integer minFinalFour(String var) {
    switch(var) {
      default:
        return BaseModel.minBaseModel(var);
    }
  }
}
