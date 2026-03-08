package org.computate.spinechamp.model.sweetsixteen;

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
import org.computate.spinechamp.model.sweetsixteen.SweetSixteen;
import org.computate.vertx.serialize.vertx.JsonObjectDeserializer;
import java.lang.String;
import org.computate.spinechamp.model.guesser.Guesser;
import java.lang.Integer;
import org.computate.spinechamp.model.team.Team;
import org.computate.spinechamp.model.eliteeight.EliteEight;
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
 * <li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class SweetSixteenGen into the class SweetSixteen. 
 * </li><li>You can add a class comment "Rows: 100" if you wish the SweetSixteen API to return more or less than 10 records by default. 
 * In this case, the API will return 100 records from the API instead of 10 by default. 
 * Each API has built in pagination of the search records to ensure a user can query all the data a page at a time without running the application out of memory. 
 * </li>
 * <h3>About the SweetSixteen class and it's generated class SweetSixteenGen&lt;BaseModel&gt;: </h3>extends SweetSixteenGen
 * <p>
 * This Java class extends a generated Java class SweetSixteenGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.sweetsixteen.SweetSixteen">Find the class SweetSixteen in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends SweetSixteenGen<BaseModel>
 * <p>This <code>class SweetSixteen extends SweetSixteenGen&lt;BaseModel&gt;</code>, which means it extends a newly generated SweetSixteenGen. 
 * The generated <code>class SweetSixteenGen extends BaseModel</code> which means that SweetSixteen extends SweetSixteenGen which extends BaseModel. 
 * This generated inheritance is a powerful feature that allows a lot of boiler plate code to be created for you automatically while still preserving inheritance through the power of Java Generic classes. 
 * </p>
 * <h2>Api: true</h2>
 * <p>This class contains a comment <b>"Api: true"</b>, which means this class will have Java Vert.x API backend code generated for these objects. 
 * </p>
 * <h2>ApiTag.enUS: true</h2>
 * <p>This class contains a comment <b>"ApiTag: sweet sixteen brackets"</b>, which groups all of the OpenAPIs for SweetSixteen objects under the tag "sweet sixteen brackets". 
 * </p>
 * <h2>ApiUri.enUS: /en-us/api/sweet-sixteen</h2>
 * <p>This class contains a comment <b>"ApiUri: /en-us/api/sweet-sixteen"</b>, which defines the base API URI for SweetSixteen objects as "/en-us/api/sweet-sixteen" in the OpenAPI spec. 
 * </p>
 * <h2>Color: null</h2>
 * <h2>Indexed: true</h2>
 * <p>This class contains a comment <b>"Indexed: true"</b>, which means this class will be indexed in the search engine. 
 * Every protected void method that begins with "_" that is marked to be searched with a comment like "Indexed: true", "Stored: true", or "DocValues: true" will be indexed in the search engine. 
 * </p>
 * <h2>{@inheritDoc}</h2>
 * <p>By adding a class comment "{@inheritDoc}", the SweetSixteen class will inherit the helpful inherited class comments from the super class SweetSixteenGen. 
 * </p>
 * <h2>Rows: null</h2>
 * <h2>Order: 7</h2>
 * <p>This class contains a comment <b>"Order: 7"</b>, which means this class will be sorted by the given number 7 ascending when code that relates to multiple classes at the same time is generated. 
 * </p>
 * <h2>SqlOrder: 10</h2>
 * <p>This class contains a comment <b>"SqlOrder: 10"</b>, which means this class will be sorted by the given number 10 ascending when SQL code to create and drop the tables is generated. 
 * </p>
 * <h2>Model: true</h2>
 * <p>This class contains a comment <b>"Model: true"</b>, which means this class will be stored in the database. 
 * Every protected void method that begins with "_" that contains a "Persist: true" comment will be a persisted field in the database table. 
 * </p>
 * <h2>Page: true</h2>
 * <p>This class contains a comment <b>"Page: true"</b>, which means this class will have webpage code generated for these objects. 
 * Java Vert.x backend API code, Handlebars HTML template frontend code, and JavaScript code will all generated and can be extended. 
 * This creates a new Java class org.computate.spinechamp.model.sweetsixteen.SweetSixteenPage. 
 * </p>
 * <h2>SuperPage.enUS: PageLayout</h2>
 * <p>This class contains a comment <b>"SuperPage.enUS: PageLayout"</b>, which identifies the Java super class of the page code by it's class simple name "PageLayout". 
 * This means that the newly created class org.computate.spinechamp.model.sweetsixteen.SweetSixteenPage extends org.computate.spinechamp.page.PageLayout. 
 * </p>
 * <h2>Promise: true</h2>
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the SweetSixteen Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * <h2>AName.enUS: a sweet sixteen bracket</h2>
 * <p>This class contains a comment <b>"AName.enUS: a sweet sixteen bracket"</b>, which identifies the language context to describe a SweetSixteen as "a sweet sixteen bracket". 
 * </p>
 * <p>
 * Delete the class SweetSixteen in Solr: 
 * <pre>
 * curl -k 'https://solr.apps-crc.testing/solr/computate/update?commitWithin=1000&amp;overwrite=true&amp;wt=json' -X POST -H 'Content-type: text/xml' -u "admin:$(oc -n solr get secret/solr-solrcloud-security-bootstrap -o jsonpath={.data.admin} | base64 -d)" --data-raw '&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.sweetsixteen.SweetSixteen&lt;/query&gt;&lt;/delete&gt;'
 * </pre>
 * </p>
 * <p>
 * Delete  the package org.computate.spinechamp.model.sweetsixteen in Solr: 
 * <pre>
 * curl -k 'https://solr.apps-crc.testing/solr/computate/update?commitWithin=1000&amp;overwrite=true&amp;wt=json' -X POST -H 'Content-type: text/xml' -u "admin:$(oc -n solr get secret/solr-solrcloud-security-bootstrap -o jsonpath={.data.admin} | base64 -d)" --data-raw '&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.spinechamp.model.sweetsixteen&lt;/query&gt;&lt;/delete&gt;'
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
public abstract class SweetSixteenGen<DEV> extends BaseModel {
  protected static final Logger LOG = LoggerFactory.getLogger(SweetSixteen.class);

  public static final String Description_enUS = "A predicted tournament with 16 teams. ";
  public static final String AName_enUS = "a sweet sixteen bracket";
  public static final String This_enUS = "this ";
  public static final String ThisName_enUS = "this sweet sixteen bracket";
  public static final String A_enUS = "a ";
  public static final String TheName_enUS = "the sweet sixteen bracket";
  public static final String SingularName_enUS = "sweet sixteen bracket";
  public static final String PluralName_enUS = "sweet sixteen brackets";
  public static final String NameActual_enUS = "current sweet sixteen bracket";
  public static final String AllName_enUS = "all sweet sixteen brackets";
  public static final String SearchAllNameBy_enUS = "search sweet sixteen brackets by ";
  public static final String SearchAllName_enUS = "search sweet sixteen brackets";
  public static final String Title_enUS = "sweet sixteen brackets";
  public static final String ThePluralName_enUS = "the sweet sixteen brackets";
  public static final String NoNameFound_enUS = "no sweet sixteen bracket found";
  public static final String ApiUri_enUS = "/en-us/api/sweet-sixteen";
  public static final String ApiUriSearchPage_enUS = "/en-us/search/sweet-sixteen";
  public static final String ApiUriEditPage_enUS = "/en-us/edit/sweet-sixteen/{bracketId}";
  public static final String OfName_enUS = "of sweet sixteen bracket";
  public static final String ANameAdjective_enUS = "a sweet sixteen bracket";
  public static final String NameAdjectiveSingular_enUS = "sweet sixteen bracket";
  public static final String NameAdjectivePlural_enUS = "sweet sixteen brackets";
  public static final String Search_enUS_OpenApiUri = "/en-us/api/sweet-sixteen";
  public static final String Search_enUS_StringFormatUri = "/en-us/api/sweet-sixteen";
  public static final String Search_enUS_StringFormatUrl = "%s/en-us/api/sweet-sixteen";
  public static final String GET_enUS_OpenApiUri = "/en-us/api/sweet-sixteen/{bracketId}";
  public static final String GET_enUS_StringFormatUri = "/en-us/api/sweet-sixteen/%s";
  public static final String GET_enUS_StringFormatUrl = "%s/en-us/api/sweet-sixteen/%s";
  public static final String PATCH_enUS_OpenApiUri = "/en-us/api/sweet-sixteen";
  public static final String PATCH_enUS_StringFormatUri = "/en-us/api/sweet-sixteen";
  public static final String PATCH_enUS_StringFormatUrl = "%s/en-us/api/sweet-sixteen";
  public static final String POST_enUS_OpenApiUri = "/en-us/api/sweet-sixteen";
  public static final String POST_enUS_StringFormatUri = "/en-us/api/sweet-sixteen";
  public static final String POST_enUS_StringFormatUrl = "%s/en-us/api/sweet-sixteen";
  public static final String DELETE_enUS_OpenApiUri = "/en-us/api/sweet-sixteen/{bracketId}";
  public static final String DELETE_enUS_StringFormatUri = "/en-us/api/sweet-sixteen/%s";
  public static final String DELETE_enUS_StringFormatUrl = "%s/en-us/api/sweet-sixteen/%s";
  public static final String PUTImport_enUS_OpenApiUri = "/en-us/api/sweet-sixteen-import";
  public static final String PUTImport_enUS_StringFormatUri = "/en-us/api/sweet-sixteen-import";
  public static final String PUTImport_enUS_StringFormatUrl = "%s/en-us/api/sweet-sixteen-import";
  public static final String SearchPage_enUS_OpenApiUri = "/en-us/search/sweet-sixteen";
  public static final String SearchPage_enUS_StringFormatUri = "/en-us/search/sweet-sixteen";
  public static final String SearchPage_enUS_StringFormatUrl = "%s/en-us/search/sweet-sixteen";
  public static final String EditPage_enUS_OpenApiUri = "/en-us/edit/sweet-sixteen/{bracketId}";
  public static final String EditPage_enUS_StringFormatUri = "/en-us/edit/sweet-sixteen/%s";
  public static final String EditPage_enUS_StringFormatUrl = "%s/en-us/edit/sweet-sixteen/%s";
  public static final String DELETEFilter_enUS_OpenApiUri = "/en-us/api/sweet-sixteen";
  public static final String DELETEFilter_enUS_StringFormatUri = "/en-us/api/sweet-sixteen";
  public static final String DELETEFilter_enUS_StringFormatUrl = "%s/en-us/api/sweet-sixteen";

  public static final String Icon = "<i class=\"fa-regular fa-buildings\"></i>";

	//////////////////////////////
  // actualSweetSixteenSearch //
	//////////////////////////////


  /**
   *  The entity actualSweetSixteenSearch
   *	 is defined as null before being initialized. 
   */
  @JsonIgnore
  @JsonInclude(Include.NON_NULL)
  protected SearchList<SweetSixteen> actualSweetSixteenSearch;

  /**
   * <br> The entity actualSweetSixteenSearch
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.sweetsixteen.SweetSixteen&fq=entiteVar_enUS_indexed_string:actualSweetSixteenSearch">Find the entity actualSweetSixteenSearch in Solr</a>
   * <br>
   * @param promise is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _actualSweetSixteenSearch(Promise<SearchList<SweetSixteen>> promise);

  public SearchList<SweetSixteen> getActualSweetSixteenSearch() {
    return actualSweetSixteenSearch;
  }

  public void setActualSweetSixteenSearch(SearchList<SweetSixteen> actualSweetSixteenSearch) {
    this.actualSweetSixteenSearch = actualSweetSixteenSearch;
  }
  public static SearchList<SweetSixteen> staticSetActualSweetSixteenSearch(SiteRequest siteRequest_, String o) {
    return null;
  }
  protected Future<SearchList<SweetSixteen>> actualSweetSixteenSearchPromise() {
    Promise<SearchList<SweetSixteen>> promise = Promise.promise();
    Promise<SearchList<SweetSixteen>> promise2 = Promise.promise();
    _actualSweetSixteenSearch(promise2);
    promise2.future().onSuccess(o -> {
      if(o != null && actualSweetSixteenSearch == null) {
        o.promiseDeepForClass(siteRequest_).onSuccess(a -> {
          setActualSweetSixteenSearch(o);
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
  // actualSweetSixteen //
	////////////////////////


  /**
   *  The entity actualSweetSixteen
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonDeserialize(using = JsonObjectDeserializer.class)
  @JsonInclude(Include.NON_NULL)
  protected JsonObject actualSweetSixteen;

  /**
   * <br> The entity actualSweetSixteen
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.sweetsixteen.SweetSixteen&fq=entiteVar_enUS_indexed_string:actualSweetSixteen">Find the entity actualSweetSixteen in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _actualSweetSixteen(Wrap<JsonObject> w);

  public JsonObject getActualSweetSixteen() {
    return actualSweetSixteen;
  }

  public void setActualSweetSixteen(JsonObject actualSweetSixteen) {
    this.actualSweetSixteen = actualSweetSixteen;
  }
  @JsonIgnore
  public void setActualSweetSixteen(String o) {
    this.actualSweetSixteen = SweetSixteen.staticSetActualSweetSixteen(siteRequest_, o);
  }
  public static JsonObject staticSetActualSweetSixteen(SiteRequest siteRequest_, String o) {
    if(o != null) {
        return new JsonObject(o);
    }
    return null;
  }
  protected SweetSixteen actualSweetSixteenInit() {
    Wrap<JsonObject> actualSweetSixteenWrap = new Wrap<JsonObject>().var("actualSweetSixteen");
    if(actualSweetSixteen == null) {
      _actualSweetSixteen(actualSweetSixteenWrap);
      Optional.ofNullable(actualSweetSixteenWrap.getO()).ifPresent(o -> {
        setActualSweetSixteen(o);
      });
    }
    return (SweetSixteen)this;
  }

  public static String staticSearchActualSweetSixteen(SiteRequest siteRequest_, JsonObject o) {
    return o.toString();
  }

  public static String staticSearchStrActualSweetSixteen(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqActualSweetSixteen(SiteRequest siteRequest_, String o) {
    return SweetSixteen.staticSearchActualSweetSixteen(siteRequest_, SweetSixteen.staticSetActualSweetSixteen(siteRequest_, o)).toString();
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.sweetsixteen.SweetSixteen&fq=entiteVar_enUS_indexed_string:guesserId">Find the entity guesserId in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _guesserId(Wrap<String> w);

  public String getGuesserId() {
    return guesserId;
  }
  public void setGuesserId(String o) {
    this.guesserId = SweetSixteen.staticSetGuesserId(siteRequest_, o);
  }
  public static String staticSetGuesserId(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected SweetSixteen guesserIdInit() {
    Wrap<String> guesserIdWrap = new Wrap<String>().var("guesserId");
    if(guesserId == null) {
      _guesserId(guesserIdWrap);
      Optional.ofNullable(guesserIdWrap.getO()).ifPresent(o -> {
        setGuesserId(o);
      });
    }
    return (SweetSixteen)this;
  }

  public static String staticSearchGuesserId(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrGuesserId(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqGuesserId(SiteRequest siteRequest_, String o) {
    return SweetSixteen.staticSearchGuesserId(siteRequest_, SweetSixteen.staticSetGuesserId(siteRequest_, o)).toString();
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.sweetsixteen.SweetSixteen&fq=entiteVar_enUS_indexed_string:year">Find the entity year in Solr</a>
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
    this.year = SweetSixteen.staticSetYear(siteRequest_, o);
  }
  public static Integer staticSetYear(SiteRequest siteRequest_, String o) {
    if(NumberUtils.isParsable(o))
      return Integer.parseInt(o);
    return null;
  }
  protected SweetSixteen yearInit() {
    Wrap<Integer> yearWrap = new Wrap<Integer>().var("year");
    if(year == null) {
      _year(yearWrap);
      Optional.ofNullable(yearWrap.getO()).ifPresent(o -> {
        setYear(o);
      });
    }
    return (SweetSixteen)this;
  }

  public static Integer staticSearchYear(SiteRequest siteRequest_, Integer o) {
    return o;
  }

  public static String staticSearchStrYear(SiteRequest siteRequest_, Integer o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqYear(SiteRequest siteRequest_, String o) {
    return SweetSixteen.staticSearchYear(siteRequest_, SweetSixteen.staticSetYear(siteRequest_, o)).toString();
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.sweetsixteen.SweetSixteen&fq=entiteVar_enUS_indexed_string:bracketId">Find the entity bracketId in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _bracketId(Wrap<String> w);

  public String getBracketId() {
    return bracketId;
  }
  public void setBracketId(String o) {
    this.bracketId = SweetSixteen.staticSetBracketId(siteRequest_, o);
  }
  public static String staticSetBracketId(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected SweetSixteen bracketIdInit() {
    Wrap<String> bracketIdWrap = new Wrap<String>().var("bracketId");
    if(bracketId == null) {
      _bracketId(bracketIdWrap);
      Optional.ofNullable(bracketIdWrap.getO()).ifPresent(o -> {
        setBracketId(o);
      });
    }
    return (SweetSixteen)this;
  }

  public static String staticSearchBracketId(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrBracketId(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqBracketId(SiteRequest siteRequest_, String o) {
    return SweetSixteen.staticSearchBracketId(siteRequest_, SweetSixteen.staticSetBracketId(siteRequest_, o)).toString();
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.sweetsixteen.SweetSixteen&fq=entiteVar_enUS_indexed_string:name">Find the entity name in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _name(Wrap<String> w);

  public String getName() {
    return name;
  }
  public void setName(String o) {
    this.name = SweetSixteen.staticSetName(siteRequest_, o);
  }
  public static String staticSetName(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected SweetSixteen nameInit() {
    Wrap<String> nameWrap = new Wrap<String>().var("name");
    if(name == null) {
      _name(nameWrap);
      Optional.ofNullable(nameWrap.getO()).ifPresent(o -> {
        setName(o);
      });
    }
    return (SweetSixteen)this;
  }

  public static String staticSearchName(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrName(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqName(SiteRequest siteRequest_, String o) {
    return SweetSixteen.staticSearchName(siteRequest_, SweetSixteen.staticSetName(siteRequest_, o)).toString();
  }

  public String sqlName() {
    return name;
  }

  public static String staticJsonName(String name) {
    return name;
  }

	///////////////////////////
  // southGame1WinnerGuess //
	///////////////////////////


  /**
   *  The entity southGame1WinnerGuess
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String southGame1WinnerGuess;

  /**
   * <br> The entity southGame1WinnerGuess
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.sweetsixteen.SweetSixteen&fq=entiteVar_enUS_indexed_string:southGame1WinnerGuess">Find the entity southGame1WinnerGuess in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _southGame1WinnerGuess(Wrap<String> w);

  public String getSouthGame1WinnerGuess() {
    return southGame1WinnerGuess;
  }
  public void setSouthGame1WinnerGuess(String o) {
    this.southGame1WinnerGuess = SweetSixteen.staticSetSouthGame1WinnerGuess(siteRequest_, o);
  }
  public static String staticSetSouthGame1WinnerGuess(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected SweetSixteen southGame1WinnerGuessInit() {
    Wrap<String> southGame1WinnerGuessWrap = new Wrap<String>().var("southGame1WinnerGuess");
    if(southGame1WinnerGuess == null) {
      _southGame1WinnerGuess(southGame1WinnerGuessWrap);
      Optional.ofNullable(southGame1WinnerGuessWrap.getO()).ifPresent(o -> {
        setSouthGame1WinnerGuess(o);
      });
    }
    return (SweetSixteen)this;
  }

  public static String staticSearchSouthGame1WinnerGuess(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrSouthGame1WinnerGuess(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqSouthGame1WinnerGuess(SiteRequest siteRequest_, String o) {
    return SweetSixteen.staticSearchSouthGame1WinnerGuess(siteRequest_, SweetSixteen.staticSetSouthGame1WinnerGuess(siteRequest_, o)).toString();
  }

	//////////////////////
  // southGame1Winner //
	//////////////////////


  /**
   *  The entity southGame1Winner
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String southGame1Winner;

  /**
   * <br> The entity southGame1Winner
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.sweetsixteen.SweetSixteen&fq=entiteVar_enUS_indexed_string:southGame1Winner">Find the entity southGame1Winner in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _southGame1Winner(Wrap<String> w);

  public String getSouthGame1Winner() {
    return southGame1Winner;
  }
  public void setSouthGame1Winner(String o) {
    this.southGame1Winner = SweetSixteen.staticSetSouthGame1Winner(siteRequest_, o);
  }
  public static String staticSetSouthGame1Winner(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected SweetSixteen southGame1WinnerInit() {
    Wrap<String> southGame1WinnerWrap = new Wrap<String>().var("southGame1Winner");
    if(southGame1Winner == null) {
      _southGame1Winner(southGame1WinnerWrap);
      Optional.ofNullable(southGame1WinnerWrap.getO()).ifPresent(o -> {
        setSouthGame1Winner(o);
      });
    }
    return (SweetSixteen)this;
  }

  public static String staticSearchSouthGame1Winner(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrSouthGame1Winner(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqSouthGame1Winner(SiteRequest siteRequest_, String o) {
    return SweetSixteen.staticSearchSouthGame1Winner(siteRequest_, SweetSixteen.staticSetSouthGame1Winner(siteRequest_, o)).toString();
  }

  public String sqlSouthGame1Winner() {
    return southGame1Winner;
  }

  public static String staticJsonSouthGame1Winner(String southGame1Winner) {
    return southGame1Winner;
  }

	/////////////////////
  // southGame1Loser //
	/////////////////////


  /**
   *  The entity southGame1Loser
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String southGame1Loser;

  /**
   * <br> The entity southGame1Loser
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.sweetsixteen.SweetSixteen&fq=entiteVar_enUS_indexed_string:southGame1Loser">Find the entity southGame1Loser in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _southGame1Loser(Wrap<String> w);

  public String getSouthGame1Loser() {
    return southGame1Loser;
  }
  public void setSouthGame1Loser(String o) {
    this.southGame1Loser = SweetSixteen.staticSetSouthGame1Loser(siteRequest_, o);
  }
  public static String staticSetSouthGame1Loser(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected SweetSixteen southGame1LoserInit() {
    Wrap<String> southGame1LoserWrap = new Wrap<String>().var("southGame1Loser");
    if(southGame1Loser == null) {
      _southGame1Loser(southGame1LoserWrap);
      Optional.ofNullable(southGame1LoserWrap.getO()).ifPresent(o -> {
        setSouthGame1Loser(o);
      });
    }
    return (SweetSixteen)this;
  }

  public static String staticSearchSouthGame1Loser(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrSouthGame1Loser(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqSouthGame1Loser(SiteRequest siteRequest_, String o) {
    return SweetSixteen.staticSearchSouthGame1Loser(siteRequest_, SweetSixteen.staticSetSouthGame1Loser(siteRequest_, o)).toString();
  }

  public String sqlSouthGame1Loser() {
    return southGame1Loser;
  }

  public static String staticJsonSouthGame1Loser(String southGame1Loser) {
    return southGame1Loser;
  }

	///////////////////////////
  // southGame2WinnerGuess //
	///////////////////////////


  /**
   *  The entity southGame2WinnerGuess
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String southGame2WinnerGuess;

  /**
   * <br> The entity southGame2WinnerGuess
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.sweetsixteen.SweetSixteen&fq=entiteVar_enUS_indexed_string:southGame2WinnerGuess">Find the entity southGame2WinnerGuess in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _southGame2WinnerGuess(Wrap<String> w);

  public String getSouthGame2WinnerGuess() {
    return southGame2WinnerGuess;
  }
  public void setSouthGame2WinnerGuess(String o) {
    this.southGame2WinnerGuess = SweetSixteen.staticSetSouthGame2WinnerGuess(siteRequest_, o);
  }
  public static String staticSetSouthGame2WinnerGuess(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected SweetSixteen southGame2WinnerGuessInit() {
    Wrap<String> southGame2WinnerGuessWrap = new Wrap<String>().var("southGame2WinnerGuess");
    if(southGame2WinnerGuess == null) {
      _southGame2WinnerGuess(southGame2WinnerGuessWrap);
      Optional.ofNullable(southGame2WinnerGuessWrap.getO()).ifPresent(o -> {
        setSouthGame2WinnerGuess(o);
      });
    }
    return (SweetSixteen)this;
  }

  public static String staticSearchSouthGame2WinnerGuess(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrSouthGame2WinnerGuess(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqSouthGame2WinnerGuess(SiteRequest siteRequest_, String o) {
    return SweetSixteen.staticSearchSouthGame2WinnerGuess(siteRequest_, SweetSixteen.staticSetSouthGame2WinnerGuess(siteRequest_, o)).toString();
  }

	//////////////////////
  // southGame2Winner //
	//////////////////////


  /**
   *  The entity southGame2Winner
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String southGame2Winner;

  /**
   * <br> The entity southGame2Winner
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.sweetsixteen.SweetSixteen&fq=entiteVar_enUS_indexed_string:southGame2Winner">Find the entity southGame2Winner in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _southGame2Winner(Wrap<String> w);

  public String getSouthGame2Winner() {
    return southGame2Winner;
  }
  public void setSouthGame2Winner(String o) {
    this.southGame2Winner = SweetSixteen.staticSetSouthGame2Winner(siteRequest_, o);
  }
  public static String staticSetSouthGame2Winner(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected SweetSixteen southGame2WinnerInit() {
    Wrap<String> southGame2WinnerWrap = new Wrap<String>().var("southGame2Winner");
    if(southGame2Winner == null) {
      _southGame2Winner(southGame2WinnerWrap);
      Optional.ofNullable(southGame2WinnerWrap.getO()).ifPresent(o -> {
        setSouthGame2Winner(o);
      });
    }
    return (SweetSixteen)this;
  }

  public static String staticSearchSouthGame2Winner(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrSouthGame2Winner(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqSouthGame2Winner(SiteRequest siteRequest_, String o) {
    return SweetSixteen.staticSearchSouthGame2Winner(siteRequest_, SweetSixteen.staticSetSouthGame2Winner(siteRequest_, o)).toString();
  }

  public String sqlSouthGame2Winner() {
    return southGame2Winner;
  }

  public static String staticJsonSouthGame2Winner(String southGame2Winner) {
    return southGame2Winner;
  }

	/////////////////////
  // southGame2Loser //
	/////////////////////


  /**
   *  The entity southGame2Loser
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String southGame2Loser;

  /**
   * <br> The entity southGame2Loser
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.sweetsixteen.SweetSixteen&fq=entiteVar_enUS_indexed_string:southGame2Loser">Find the entity southGame2Loser in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _southGame2Loser(Wrap<String> w);

  public String getSouthGame2Loser() {
    return southGame2Loser;
  }
  public void setSouthGame2Loser(String o) {
    this.southGame2Loser = SweetSixteen.staticSetSouthGame2Loser(siteRequest_, o);
  }
  public static String staticSetSouthGame2Loser(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected SweetSixteen southGame2LoserInit() {
    Wrap<String> southGame2LoserWrap = new Wrap<String>().var("southGame2Loser");
    if(southGame2Loser == null) {
      _southGame2Loser(southGame2LoserWrap);
      Optional.ofNullable(southGame2LoserWrap.getO()).ifPresent(o -> {
        setSouthGame2Loser(o);
      });
    }
    return (SweetSixteen)this;
  }

  public static String staticSearchSouthGame2Loser(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrSouthGame2Loser(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqSouthGame2Loser(SiteRequest siteRequest_, String o) {
    return SweetSixteen.staticSearchSouthGame2Loser(siteRequest_, SweetSixteen.staticSetSouthGame2Loser(siteRequest_, o)).toString();
  }

  public String sqlSouthGame2Loser() {
    return southGame2Loser;
  }

  public static String staticJsonSouthGame2Loser(String southGame2Loser) {
    return southGame2Loser;
  }

	//////////////////////////
  // westGame1WinnerGuess //
	//////////////////////////


  /**
   *  The entity westGame1WinnerGuess
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String westGame1WinnerGuess;

  /**
   * <br> The entity westGame1WinnerGuess
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.sweetsixteen.SweetSixteen&fq=entiteVar_enUS_indexed_string:westGame1WinnerGuess">Find the entity westGame1WinnerGuess in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _westGame1WinnerGuess(Wrap<String> w);

  public String getWestGame1WinnerGuess() {
    return westGame1WinnerGuess;
  }
  public void setWestGame1WinnerGuess(String o) {
    this.westGame1WinnerGuess = SweetSixteen.staticSetWestGame1WinnerGuess(siteRequest_, o);
  }
  public static String staticSetWestGame1WinnerGuess(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected SweetSixteen westGame1WinnerGuessInit() {
    Wrap<String> westGame1WinnerGuessWrap = new Wrap<String>().var("westGame1WinnerGuess");
    if(westGame1WinnerGuess == null) {
      _westGame1WinnerGuess(westGame1WinnerGuessWrap);
      Optional.ofNullable(westGame1WinnerGuessWrap.getO()).ifPresent(o -> {
        setWestGame1WinnerGuess(o);
      });
    }
    return (SweetSixteen)this;
  }

  public static String staticSearchWestGame1WinnerGuess(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrWestGame1WinnerGuess(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqWestGame1WinnerGuess(SiteRequest siteRequest_, String o) {
    return SweetSixteen.staticSearchWestGame1WinnerGuess(siteRequest_, SweetSixteen.staticSetWestGame1WinnerGuess(siteRequest_, o)).toString();
  }

	/////////////////////
  // westGame1Winner //
	/////////////////////


  /**
   *  The entity westGame1Winner
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String westGame1Winner;

  /**
   * <br> The entity westGame1Winner
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.sweetsixteen.SweetSixteen&fq=entiteVar_enUS_indexed_string:westGame1Winner">Find the entity westGame1Winner in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _westGame1Winner(Wrap<String> w);

  public String getWestGame1Winner() {
    return westGame1Winner;
  }
  public void setWestGame1Winner(String o) {
    this.westGame1Winner = SweetSixteen.staticSetWestGame1Winner(siteRequest_, o);
  }
  public static String staticSetWestGame1Winner(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected SweetSixteen westGame1WinnerInit() {
    Wrap<String> westGame1WinnerWrap = new Wrap<String>().var("westGame1Winner");
    if(westGame1Winner == null) {
      _westGame1Winner(westGame1WinnerWrap);
      Optional.ofNullable(westGame1WinnerWrap.getO()).ifPresent(o -> {
        setWestGame1Winner(o);
      });
    }
    return (SweetSixteen)this;
  }

  public static String staticSearchWestGame1Winner(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrWestGame1Winner(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqWestGame1Winner(SiteRequest siteRequest_, String o) {
    return SweetSixteen.staticSearchWestGame1Winner(siteRequest_, SweetSixteen.staticSetWestGame1Winner(siteRequest_, o)).toString();
  }

  public String sqlWestGame1Winner() {
    return westGame1Winner;
  }

  public static String staticJsonWestGame1Winner(String westGame1Winner) {
    return westGame1Winner;
  }

	////////////////////
  // westGame1Loser //
	////////////////////


  /**
   *  The entity westGame1Loser
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String westGame1Loser;

  /**
   * <br> The entity westGame1Loser
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.sweetsixteen.SweetSixteen&fq=entiteVar_enUS_indexed_string:westGame1Loser">Find the entity westGame1Loser in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _westGame1Loser(Wrap<String> w);

  public String getWestGame1Loser() {
    return westGame1Loser;
  }
  public void setWestGame1Loser(String o) {
    this.westGame1Loser = SweetSixteen.staticSetWestGame1Loser(siteRequest_, o);
  }
  public static String staticSetWestGame1Loser(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected SweetSixteen westGame1LoserInit() {
    Wrap<String> westGame1LoserWrap = new Wrap<String>().var("westGame1Loser");
    if(westGame1Loser == null) {
      _westGame1Loser(westGame1LoserWrap);
      Optional.ofNullable(westGame1LoserWrap.getO()).ifPresent(o -> {
        setWestGame1Loser(o);
      });
    }
    return (SweetSixteen)this;
  }

  public static String staticSearchWestGame1Loser(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrWestGame1Loser(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqWestGame1Loser(SiteRequest siteRequest_, String o) {
    return SweetSixteen.staticSearchWestGame1Loser(siteRequest_, SweetSixteen.staticSetWestGame1Loser(siteRequest_, o)).toString();
  }

  public String sqlWestGame1Loser() {
    return westGame1Loser;
  }

  public static String staticJsonWestGame1Loser(String westGame1Loser) {
    return westGame1Loser;
  }

	//////////////////////////
  // westGame2WinnerGuess //
	//////////////////////////


  /**
   *  The entity westGame2WinnerGuess
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String westGame2WinnerGuess;

  /**
   * <br> The entity westGame2WinnerGuess
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.sweetsixteen.SweetSixteen&fq=entiteVar_enUS_indexed_string:westGame2WinnerGuess">Find the entity westGame2WinnerGuess in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _westGame2WinnerGuess(Wrap<String> w);

  public String getWestGame2WinnerGuess() {
    return westGame2WinnerGuess;
  }
  public void setWestGame2WinnerGuess(String o) {
    this.westGame2WinnerGuess = SweetSixteen.staticSetWestGame2WinnerGuess(siteRequest_, o);
  }
  public static String staticSetWestGame2WinnerGuess(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected SweetSixteen westGame2WinnerGuessInit() {
    Wrap<String> westGame2WinnerGuessWrap = new Wrap<String>().var("westGame2WinnerGuess");
    if(westGame2WinnerGuess == null) {
      _westGame2WinnerGuess(westGame2WinnerGuessWrap);
      Optional.ofNullable(westGame2WinnerGuessWrap.getO()).ifPresent(o -> {
        setWestGame2WinnerGuess(o);
      });
    }
    return (SweetSixteen)this;
  }

  public static String staticSearchWestGame2WinnerGuess(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrWestGame2WinnerGuess(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqWestGame2WinnerGuess(SiteRequest siteRequest_, String o) {
    return SweetSixteen.staticSearchWestGame2WinnerGuess(siteRequest_, SweetSixteen.staticSetWestGame2WinnerGuess(siteRequest_, o)).toString();
  }

	/////////////////////
  // westGame2Winner //
	/////////////////////


  /**
   *  The entity westGame2Winner
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String westGame2Winner;

  /**
   * <br> The entity westGame2Winner
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.sweetsixteen.SweetSixteen&fq=entiteVar_enUS_indexed_string:westGame2Winner">Find the entity westGame2Winner in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _westGame2Winner(Wrap<String> w);

  public String getWestGame2Winner() {
    return westGame2Winner;
  }
  public void setWestGame2Winner(String o) {
    this.westGame2Winner = SweetSixteen.staticSetWestGame2Winner(siteRequest_, o);
  }
  public static String staticSetWestGame2Winner(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected SweetSixteen westGame2WinnerInit() {
    Wrap<String> westGame2WinnerWrap = new Wrap<String>().var("westGame2Winner");
    if(westGame2Winner == null) {
      _westGame2Winner(westGame2WinnerWrap);
      Optional.ofNullable(westGame2WinnerWrap.getO()).ifPresent(o -> {
        setWestGame2Winner(o);
      });
    }
    return (SweetSixteen)this;
  }

  public static String staticSearchWestGame2Winner(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrWestGame2Winner(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqWestGame2Winner(SiteRequest siteRequest_, String o) {
    return SweetSixteen.staticSearchWestGame2Winner(siteRequest_, SweetSixteen.staticSetWestGame2Winner(siteRequest_, o)).toString();
  }

  public String sqlWestGame2Winner() {
    return westGame2Winner;
  }

  public static String staticJsonWestGame2Winner(String westGame2Winner) {
    return westGame2Winner;
  }

	////////////////////
  // westGame2Loser //
	////////////////////


  /**
   *  The entity westGame2Loser
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String westGame2Loser;

  /**
   * <br> The entity westGame2Loser
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.sweetsixteen.SweetSixteen&fq=entiteVar_enUS_indexed_string:westGame2Loser">Find the entity westGame2Loser in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _westGame2Loser(Wrap<String> w);

  public String getWestGame2Loser() {
    return westGame2Loser;
  }
  public void setWestGame2Loser(String o) {
    this.westGame2Loser = SweetSixteen.staticSetWestGame2Loser(siteRequest_, o);
  }
  public static String staticSetWestGame2Loser(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected SweetSixteen westGame2LoserInit() {
    Wrap<String> westGame2LoserWrap = new Wrap<String>().var("westGame2Loser");
    if(westGame2Loser == null) {
      _westGame2Loser(westGame2LoserWrap);
      Optional.ofNullable(westGame2LoserWrap.getO()).ifPresent(o -> {
        setWestGame2Loser(o);
      });
    }
    return (SweetSixteen)this;
  }

  public static String staticSearchWestGame2Loser(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrWestGame2Loser(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqWestGame2Loser(SiteRequest siteRequest_, String o) {
    return SweetSixteen.staticSearchWestGame2Loser(siteRequest_, SweetSixteen.staticSetWestGame2Loser(siteRequest_, o)).toString();
  }

  public String sqlWestGame2Loser() {
    return westGame2Loser;
  }

  public static String staticJsonWestGame2Loser(String westGame2Loser) {
    return westGame2Loser;
  }

	//////////////////////////
  // eastGame1WinnerGuess //
	//////////////////////////


  /**
   *  The entity eastGame1WinnerGuess
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String eastGame1WinnerGuess;

  /**
   * <br> The entity eastGame1WinnerGuess
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.sweetsixteen.SweetSixteen&fq=entiteVar_enUS_indexed_string:eastGame1WinnerGuess">Find the entity eastGame1WinnerGuess in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _eastGame1WinnerGuess(Wrap<String> w);

  public String getEastGame1WinnerGuess() {
    return eastGame1WinnerGuess;
  }
  public void setEastGame1WinnerGuess(String o) {
    this.eastGame1WinnerGuess = SweetSixteen.staticSetEastGame1WinnerGuess(siteRequest_, o);
  }
  public static String staticSetEastGame1WinnerGuess(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected SweetSixteen eastGame1WinnerGuessInit() {
    Wrap<String> eastGame1WinnerGuessWrap = new Wrap<String>().var("eastGame1WinnerGuess");
    if(eastGame1WinnerGuess == null) {
      _eastGame1WinnerGuess(eastGame1WinnerGuessWrap);
      Optional.ofNullable(eastGame1WinnerGuessWrap.getO()).ifPresent(o -> {
        setEastGame1WinnerGuess(o);
      });
    }
    return (SweetSixteen)this;
  }

  public static String staticSearchEastGame1WinnerGuess(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrEastGame1WinnerGuess(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqEastGame1WinnerGuess(SiteRequest siteRequest_, String o) {
    return SweetSixteen.staticSearchEastGame1WinnerGuess(siteRequest_, SweetSixteen.staticSetEastGame1WinnerGuess(siteRequest_, o)).toString();
  }

	/////////////////////
  // eastGame1Winner //
	/////////////////////


  /**
   *  The entity eastGame1Winner
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String eastGame1Winner;

  /**
   * <br> The entity eastGame1Winner
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.sweetsixteen.SweetSixteen&fq=entiteVar_enUS_indexed_string:eastGame1Winner">Find the entity eastGame1Winner in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _eastGame1Winner(Wrap<String> w);

  public String getEastGame1Winner() {
    return eastGame1Winner;
  }
  public void setEastGame1Winner(String o) {
    this.eastGame1Winner = SweetSixteen.staticSetEastGame1Winner(siteRequest_, o);
  }
  public static String staticSetEastGame1Winner(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected SweetSixteen eastGame1WinnerInit() {
    Wrap<String> eastGame1WinnerWrap = new Wrap<String>().var("eastGame1Winner");
    if(eastGame1Winner == null) {
      _eastGame1Winner(eastGame1WinnerWrap);
      Optional.ofNullable(eastGame1WinnerWrap.getO()).ifPresent(o -> {
        setEastGame1Winner(o);
      });
    }
    return (SweetSixteen)this;
  }

  public static String staticSearchEastGame1Winner(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrEastGame1Winner(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqEastGame1Winner(SiteRequest siteRequest_, String o) {
    return SweetSixteen.staticSearchEastGame1Winner(siteRequest_, SweetSixteen.staticSetEastGame1Winner(siteRequest_, o)).toString();
  }

  public String sqlEastGame1Winner() {
    return eastGame1Winner;
  }

  public static String staticJsonEastGame1Winner(String eastGame1Winner) {
    return eastGame1Winner;
  }

	////////////////////
  // eastGame1Loser //
	////////////////////


  /**
   *  The entity eastGame1Loser
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String eastGame1Loser;

  /**
   * <br> The entity eastGame1Loser
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.sweetsixteen.SweetSixteen&fq=entiteVar_enUS_indexed_string:eastGame1Loser">Find the entity eastGame1Loser in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _eastGame1Loser(Wrap<String> w);

  public String getEastGame1Loser() {
    return eastGame1Loser;
  }
  public void setEastGame1Loser(String o) {
    this.eastGame1Loser = SweetSixteen.staticSetEastGame1Loser(siteRequest_, o);
  }
  public static String staticSetEastGame1Loser(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected SweetSixteen eastGame1LoserInit() {
    Wrap<String> eastGame1LoserWrap = new Wrap<String>().var("eastGame1Loser");
    if(eastGame1Loser == null) {
      _eastGame1Loser(eastGame1LoserWrap);
      Optional.ofNullable(eastGame1LoserWrap.getO()).ifPresent(o -> {
        setEastGame1Loser(o);
      });
    }
    return (SweetSixteen)this;
  }

  public static String staticSearchEastGame1Loser(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrEastGame1Loser(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqEastGame1Loser(SiteRequest siteRequest_, String o) {
    return SweetSixteen.staticSearchEastGame1Loser(siteRequest_, SweetSixteen.staticSetEastGame1Loser(siteRequest_, o)).toString();
  }

  public String sqlEastGame1Loser() {
    return eastGame1Loser;
  }

  public static String staticJsonEastGame1Loser(String eastGame1Loser) {
    return eastGame1Loser;
  }

	//////////////////////////
  // eastGame2WinnerGuess //
	//////////////////////////


  /**
   *  The entity eastGame2WinnerGuess
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String eastGame2WinnerGuess;

  /**
   * <br> The entity eastGame2WinnerGuess
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.sweetsixteen.SweetSixteen&fq=entiteVar_enUS_indexed_string:eastGame2WinnerGuess">Find the entity eastGame2WinnerGuess in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _eastGame2WinnerGuess(Wrap<String> w);

  public String getEastGame2WinnerGuess() {
    return eastGame2WinnerGuess;
  }
  public void setEastGame2WinnerGuess(String o) {
    this.eastGame2WinnerGuess = SweetSixteen.staticSetEastGame2WinnerGuess(siteRequest_, o);
  }
  public static String staticSetEastGame2WinnerGuess(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected SweetSixteen eastGame2WinnerGuessInit() {
    Wrap<String> eastGame2WinnerGuessWrap = new Wrap<String>().var("eastGame2WinnerGuess");
    if(eastGame2WinnerGuess == null) {
      _eastGame2WinnerGuess(eastGame2WinnerGuessWrap);
      Optional.ofNullable(eastGame2WinnerGuessWrap.getO()).ifPresent(o -> {
        setEastGame2WinnerGuess(o);
      });
    }
    return (SweetSixteen)this;
  }

  public static String staticSearchEastGame2WinnerGuess(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrEastGame2WinnerGuess(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqEastGame2WinnerGuess(SiteRequest siteRequest_, String o) {
    return SweetSixteen.staticSearchEastGame2WinnerGuess(siteRequest_, SweetSixteen.staticSetEastGame2WinnerGuess(siteRequest_, o)).toString();
  }

	/////////////////////
  // eastGame2Winner //
	/////////////////////


  /**
   *  The entity eastGame2Winner
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String eastGame2Winner;

  /**
   * <br> The entity eastGame2Winner
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.sweetsixteen.SweetSixteen&fq=entiteVar_enUS_indexed_string:eastGame2Winner">Find the entity eastGame2Winner in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _eastGame2Winner(Wrap<String> w);

  public String getEastGame2Winner() {
    return eastGame2Winner;
  }
  public void setEastGame2Winner(String o) {
    this.eastGame2Winner = SweetSixteen.staticSetEastGame2Winner(siteRequest_, o);
  }
  public static String staticSetEastGame2Winner(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected SweetSixteen eastGame2WinnerInit() {
    Wrap<String> eastGame2WinnerWrap = new Wrap<String>().var("eastGame2Winner");
    if(eastGame2Winner == null) {
      _eastGame2Winner(eastGame2WinnerWrap);
      Optional.ofNullable(eastGame2WinnerWrap.getO()).ifPresent(o -> {
        setEastGame2Winner(o);
      });
    }
    return (SweetSixteen)this;
  }

  public static String staticSearchEastGame2Winner(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrEastGame2Winner(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqEastGame2Winner(SiteRequest siteRequest_, String o) {
    return SweetSixteen.staticSearchEastGame2Winner(siteRequest_, SweetSixteen.staticSetEastGame2Winner(siteRequest_, o)).toString();
  }

  public String sqlEastGame2Winner() {
    return eastGame2Winner;
  }

  public static String staticJsonEastGame2Winner(String eastGame2Winner) {
    return eastGame2Winner;
  }

	////////////////////
  // eastGame2Loser //
	////////////////////


  /**
   *  The entity eastGame2Loser
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String eastGame2Loser;

  /**
   * <br> The entity eastGame2Loser
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.sweetsixteen.SweetSixteen&fq=entiteVar_enUS_indexed_string:eastGame2Loser">Find the entity eastGame2Loser in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _eastGame2Loser(Wrap<String> w);

  public String getEastGame2Loser() {
    return eastGame2Loser;
  }
  public void setEastGame2Loser(String o) {
    this.eastGame2Loser = SweetSixteen.staticSetEastGame2Loser(siteRequest_, o);
  }
  public static String staticSetEastGame2Loser(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected SweetSixteen eastGame2LoserInit() {
    Wrap<String> eastGame2LoserWrap = new Wrap<String>().var("eastGame2Loser");
    if(eastGame2Loser == null) {
      _eastGame2Loser(eastGame2LoserWrap);
      Optional.ofNullable(eastGame2LoserWrap.getO()).ifPresent(o -> {
        setEastGame2Loser(o);
      });
    }
    return (SweetSixteen)this;
  }

  public static String staticSearchEastGame2Loser(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrEastGame2Loser(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqEastGame2Loser(SiteRequest siteRequest_, String o) {
    return SweetSixteen.staticSearchEastGame2Loser(siteRequest_, SweetSixteen.staticSetEastGame2Loser(siteRequest_, o)).toString();
  }

  public String sqlEastGame2Loser() {
    return eastGame2Loser;
  }

  public static String staticJsonEastGame2Loser(String eastGame2Loser) {
    return eastGame2Loser;
  }

	/////////////////////////////
  // midwestGame1WinnerGuess //
	/////////////////////////////


  /**
   *  The entity midwestGame1WinnerGuess
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String midwestGame1WinnerGuess;

  /**
   * <br> The entity midwestGame1WinnerGuess
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.sweetsixteen.SweetSixteen&fq=entiteVar_enUS_indexed_string:midwestGame1WinnerGuess">Find the entity midwestGame1WinnerGuess in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _midwestGame1WinnerGuess(Wrap<String> w);

  public String getMidwestGame1WinnerGuess() {
    return midwestGame1WinnerGuess;
  }
  public void setMidwestGame1WinnerGuess(String o) {
    this.midwestGame1WinnerGuess = SweetSixteen.staticSetMidwestGame1WinnerGuess(siteRequest_, o);
  }
  public static String staticSetMidwestGame1WinnerGuess(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected SweetSixteen midwestGame1WinnerGuessInit() {
    Wrap<String> midwestGame1WinnerGuessWrap = new Wrap<String>().var("midwestGame1WinnerGuess");
    if(midwestGame1WinnerGuess == null) {
      _midwestGame1WinnerGuess(midwestGame1WinnerGuessWrap);
      Optional.ofNullable(midwestGame1WinnerGuessWrap.getO()).ifPresent(o -> {
        setMidwestGame1WinnerGuess(o);
      });
    }
    return (SweetSixteen)this;
  }

  public static String staticSearchMidwestGame1WinnerGuess(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrMidwestGame1WinnerGuess(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqMidwestGame1WinnerGuess(SiteRequest siteRequest_, String o) {
    return SweetSixteen.staticSearchMidwestGame1WinnerGuess(siteRequest_, SweetSixteen.staticSetMidwestGame1WinnerGuess(siteRequest_, o)).toString();
  }

	////////////////////////
  // midwestGame1Winner //
	////////////////////////


  /**
   *  The entity midwestGame1Winner
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String midwestGame1Winner;

  /**
   * <br> The entity midwestGame1Winner
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.sweetsixteen.SweetSixteen&fq=entiteVar_enUS_indexed_string:midwestGame1Winner">Find the entity midwestGame1Winner in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _midwestGame1Winner(Wrap<String> w);

  public String getMidwestGame1Winner() {
    return midwestGame1Winner;
  }
  public void setMidwestGame1Winner(String o) {
    this.midwestGame1Winner = SweetSixteen.staticSetMidwestGame1Winner(siteRequest_, o);
  }
  public static String staticSetMidwestGame1Winner(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected SweetSixteen midwestGame1WinnerInit() {
    Wrap<String> midwestGame1WinnerWrap = new Wrap<String>().var("midwestGame1Winner");
    if(midwestGame1Winner == null) {
      _midwestGame1Winner(midwestGame1WinnerWrap);
      Optional.ofNullable(midwestGame1WinnerWrap.getO()).ifPresent(o -> {
        setMidwestGame1Winner(o);
      });
    }
    return (SweetSixteen)this;
  }

  public static String staticSearchMidwestGame1Winner(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrMidwestGame1Winner(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqMidwestGame1Winner(SiteRequest siteRequest_, String o) {
    return SweetSixteen.staticSearchMidwestGame1Winner(siteRequest_, SweetSixteen.staticSetMidwestGame1Winner(siteRequest_, o)).toString();
  }

  public String sqlMidwestGame1Winner() {
    return midwestGame1Winner;
  }

  public static String staticJsonMidwestGame1Winner(String midwestGame1Winner) {
    return midwestGame1Winner;
  }

	///////////////////////
  // midwestGame1Loser //
	///////////////////////


  /**
   *  The entity midwestGame1Loser
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String midwestGame1Loser;

  /**
   * <br> The entity midwestGame1Loser
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.sweetsixteen.SweetSixteen&fq=entiteVar_enUS_indexed_string:midwestGame1Loser">Find the entity midwestGame1Loser in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _midwestGame1Loser(Wrap<String> w);

  public String getMidwestGame1Loser() {
    return midwestGame1Loser;
  }
  public void setMidwestGame1Loser(String o) {
    this.midwestGame1Loser = SweetSixteen.staticSetMidwestGame1Loser(siteRequest_, o);
  }
  public static String staticSetMidwestGame1Loser(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected SweetSixteen midwestGame1LoserInit() {
    Wrap<String> midwestGame1LoserWrap = new Wrap<String>().var("midwestGame1Loser");
    if(midwestGame1Loser == null) {
      _midwestGame1Loser(midwestGame1LoserWrap);
      Optional.ofNullable(midwestGame1LoserWrap.getO()).ifPresent(o -> {
        setMidwestGame1Loser(o);
      });
    }
    return (SweetSixteen)this;
  }

  public static String staticSearchMidwestGame1Loser(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrMidwestGame1Loser(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqMidwestGame1Loser(SiteRequest siteRequest_, String o) {
    return SweetSixteen.staticSearchMidwestGame1Loser(siteRequest_, SweetSixteen.staticSetMidwestGame1Loser(siteRequest_, o)).toString();
  }

  public String sqlMidwestGame1Loser() {
    return midwestGame1Loser;
  }

  public static String staticJsonMidwestGame1Loser(String midwestGame1Loser) {
    return midwestGame1Loser;
  }

	/////////////////////////////
  // midwestGame2WinnerGuess //
	/////////////////////////////


  /**
   *  The entity midwestGame2WinnerGuess
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String midwestGame2WinnerGuess;

  /**
   * <br> The entity midwestGame2WinnerGuess
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.sweetsixteen.SweetSixteen&fq=entiteVar_enUS_indexed_string:midwestGame2WinnerGuess">Find the entity midwestGame2WinnerGuess in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _midwestGame2WinnerGuess(Wrap<String> w);

  public String getMidwestGame2WinnerGuess() {
    return midwestGame2WinnerGuess;
  }
  public void setMidwestGame2WinnerGuess(String o) {
    this.midwestGame2WinnerGuess = SweetSixteen.staticSetMidwestGame2WinnerGuess(siteRequest_, o);
  }
  public static String staticSetMidwestGame2WinnerGuess(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected SweetSixteen midwestGame2WinnerGuessInit() {
    Wrap<String> midwestGame2WinnerGuessWrap = new Wrap<String>().var("midwestGame2WinnerGuess");
    if(midwestGame2WinnerGuess == null) {
      _midwestGame2WinnerGuess(midwestGame2WinnerGuessWrap);
      Optional.ofNullable(midwestGame2WinnerGuessWrap.getO()).ifPresent(o -> {
        setMidwestGame2WinnerGuess(o);
      });
    }
    return (SweetSixteen)this;
  }

  public static String staticSearchMidwestGame2WinnerGuess(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrMidwestGame2WinnerGuess(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqMidwestGame2WinnerGuess(SiteRequest siteRequest_, String o) {
    return SweetSixteen.staticSearchMidwestGame2WinnerGuess(siteRequest_, SweetSixteen.staticSetMidwestGame2WinnerGuess(siteRequest_, o)).toString();
  }

	////////////////////////
  // midwestGame2Winner //
	////////////////////////


  /**
   *  The entity midwestGame2Winner
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String midwestGame2Winner;

  /**
   * <br> The entity midwestGame2Winner
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.sweetsixteen.SweetSixteen&fq=entiteVar_enUS_indexed_string:midwestGame2Winner">Find the entity midwestGame2Winner in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _midwestGame2Winner(Wrap<String> w);

  public String getMidwestGame2Winner() {
    return midwestGame2Winner;
  }
  public void setMidwestGame2Winner(String o) {
    this.midwestGame2Winner = SweetSixteen.staticSetMidwestGame2Winner(siteRequest_, o);
  }
  public static String staticSetMidwestGame2Winner(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected SweetSixteen midwestGame2WinnerInit() {
    Wrap<String> midwestGame2WinnerWrap = new Wrap<String>().var("midwestGame2Winner");
    if(midwestGame2Winner == null) {
      _midwestGame2Winner(midwestGame2WinnerWrap);
      Optional.ofNullable(midwestGame2WinnerWrap.getO()).ifPresent(o -> {
        setMidwestGame2Winner(o);
      });
    }
    return (SweetSixteen)this;
  }

  public static String staticSearchMidwestGame2Winner(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrMidwestGame2Winner(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqMidwestGame2Winner(SiteRequest siteRequest_, String o) {
    return SweetSixteen.staticSearchMidwestGame2Winner(siteRequest_, SweetSixteen.staticSetMidwestGame2Winner(siteRequest_, o)).toString();
  }

  public String sqlMidwestGame2Winner() {
    return midwestGame2Winner;
  }

  public static String staticJsonMidwestGame2Winner(String midwestGame2Winner) {
    return midwestGame2Winner;
  }

	///////////////////////
  // midwestGame2Loser //
	///////////////////////


  /**
   *  The entity midwestGame2Loser
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String midwestGame2Loser;

  /**
   * <br> The entity midwestGame2Loser
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.sweetsixteen.SweetSixteen&fq=entiteVar_enUS_indexed_string:midwestGame2Loser">Find the entity midwestGame2Loser in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _midwestGame2Loser(Wrap<String> w);

  public String getMidwestGame2Loser() {
    return midwestGame2Loser;
  }
  public void setMidwestGame2Loser(String o) {
    this.midwestGame2Loser = SweetSixteen.staticSetMidwestGame2Loser(siteRequest_, o);
  }
  public static String staticSetMidwestGame2Loser(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected SweetSixteen midwestGame2LoserInit() {
    Wrap<String> midwestGame2LoserWrap = new Wrap<String>().var("midwestGame2Loser");
    if(midwestGame2Loser == null) {
      _midwestGame2Loser(midwestGame2LoserWrap);
      Optional.ofNullable(midwestGame2LoserWrap.getO()).ifPresent(o -> {
        setMidwestGame2Loser(o);
      });
    }
    return (SweetSixteen)this;
  }

  public static String staticSearchMidwestGame2Loser(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrMidwestGame2Loser(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqMidwestGame2Loser(SiteRequest siteRequest_, String o) {
    return SweetSixteen.staticSearchMidwestGame2Loser(siteRequest_, SweetSixteen.staticSetMidwestGame2Loser(siteRequest_, o)).toString();
  }

  public String sqlMidwestGame2Loser() {
    return midwestGame2Loser;
  }

  public static String staticJsonMidwestGame2Loser(String midwestGame2Loser) {
    return midwestGame2Loser;
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.sweetsixteen.SweetSixteen&fq=entiteVar_enUS_indexed_string:eliteEight">Find the entity eliteEight in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _eliteEight(Wrap<String> w);

  public String getEliteEight() {
    return eliteEight;
  }
  public void setEliteEight(String o) {
    this.eliteEight = SweetSixteen.staticSetEliteEight(siteRequest_, o);
  }
  public static String staticSetEliteEight(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected SweetSixteen eliteEightInit() {
    Wrap<String> eliteEightWrap = new Wrap<String>().var("eliteEight");
    if(eliteEight == null) {
      _eliteEight(eliteEightWrap);
      Optional.ofNullable(eliteEightWrap.getO()).ifPresent(o -> {
        setEliteEight(o);
      });
    }
    return (SweetSixteen)this;
  }

  public static String staticSearchEliteEight(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrEliteEight(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqEliteEight(SiteRequest siteRequest_, String o) {
    return SweetSixteen.staticSearchEliteEight(siteRequest_, SweetSixteen.staticSetEliteEight(siteRequest_, o)).toString();
  }

  public String sqlEliteEight() {
    return eliteEight;
  }

  public static String staticJsonEliteEight(String eliteEight) {
    return eliteEight;
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.sweetsixteen.SweetSixteen&fq=entiteVar_enUS_indexed_string:correctGuesses">Find the entity correctGuesses in Solr</a>
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
    this.correctGuesses = SweetSixteen.staticSetCorrectGuesses(siteRequest_, o);
  }
  public static Integer staticSetCorrectGuesses(SiteRequest siteRequest_, String o) {
    if(NumberUtils.isParsable(o))
      return Integer.parseInt(o);
    return null;
  }
  protected SweetSixteen correctGuessesInit() {
    Wrap<Integer> correctGuessesWrap = new Wrap<Integer>().var("correctGuesses");
    if(correctGuesses == null) {
      _correctGuesses(correctGuessesWrap);
      Optional.ofNullable(correctGuessesWrap.getO()).ifPresent(o -> {
        setCorrectGuesses(o);
      });
    }
    return (SweetSixteen)this;
  }

  public static Integer staticSearchCorrectGuesses(SiteRequest siteRequest_, Integer o) {
    return o;
  }

  public static String staticSearchStrCorrectGuesses(SiteRequest siteRequest_, Integer o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqCorrectGuesses(SiteRequest siteRequest_, String o) {
    return SweetSixteen.staticSearchCorrectGuesses(siteRequest_, SweetSixteen.staticSetCorrectGuesses(siteRequest_, o)).toString();
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.sweetsixteen.SweetSixteen&fq=entiteVar_enUS_indexed_string:incorrectGuesses">Find the entity incorrectGuesses in Solr</a>
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
    this.incorrectGuesses = SweetSixteen.staticSetIncorrectGuesses(siteRequest_, o);
  }
  public static Integer staticSetIncorrectGuesses(SiteRequest siteRequest_, String o) {
    if(NumberUtils.isParsable(o))
      return Integer.parseInt(o);
    return null;
  }
  protected SweetSixteen incorrectGuessesInit() {
    Wrap<Integer> incorrectGuessesWrap = new Wrap<Integer>().var("incorrectGuesses");
    if(incorrectGuesses == null) {
      _incorrectGuesses(incorrectGuessesWrap);
      Optional.ofNullable(incorrectGuessesWrap.getO()).ifPresent(o -> {
        setIncorrectGuesses(o);
      });
    }
    return (SweetSixteen)this;
  }

  public static Integer staticSearchIncorrectGuesses(SiteRequest siteRequest_, Integer o) {
    return o;
  }

  public static String staticSearchStrIncorrectGuesses(SiteRequest siteRequest_, Integer o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqIncorrectGuesses(SiteRequest siteRequest_, String o) {
    return SweetSixteen.staticSearchIncorrectGuesses(siteRequest_, SweetSixteen.staticSetIncorrectGuesses(siteRequest_, o)).toString();
  }

  //////////////
  // initDeep //
  //////////////

  public Future<SweetSixteenGen<DEV>> promiseDeepSweetSixteen(SiteRequest siteRequest_) {
    setSiteRequest_(siteRequest_);
    return promiseDeepSweetSixteen();
  }

  public Future<SweetSixteenGen<DEV>> promiseDeepSweetSixteen() {
    Promise<SweetSixteenGen<DEV>> promise = Promise.promise();
    Promise<Void> promise2 = Promise.promise();
    promiseSweetSixteen(promise2);
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

  public Future<Void> promiseSweetSixteen(Promise<Void> promise) {
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
      actualSweetSixteenSearchPromise().onSuccess(actualSweetSixteenSearch -> {
        promise2.complete();
      }).onFailure(ex -> {
        promise2.fail(ex);
      });
      return promise2.future();
    }).compose(a -> {
      Promise<Void> promise2 = Promise.promise();
      try {
        actualSweetSixteenInit();
        guesserIdInit();
        yearInit();
        bracketIdInit();
        nameInit();
        southGame1WinnerGuessInit();
        southGame1WinnerInit();
        southGame1LoserInit();
        southGame2WinnerGuessInit();
        southGame2WinnerInit();
        southGame2LoserInit();
        westGame1WinnerGuessInit();
        westGame1WinnerInit();
        westGame1LoserInit();
        westGame2WinnerGuessInit();
        westGame2WinnerInit();
        westGame2LoserInit();
        eastGame1WinnerGuessInit();
        eastGame1WinnerInit();
        eastGame1LoserInit();
        eastGame2WinnerGuessInit();
        eastGame2WinnerInit();
        eastGame2LoserInit();
        midwestGame1WinnerGuessInit();
        midwestGame1WinnerInit();
        midwestGame1LoserInit();
        midwestGame2WinnerGuessInit();
        midwestGame2WinnerInit();
        midwestGame2LoserInit();
        eliteEightInit();
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

  @Override public Future<? extends SweetSixteenGen<DEV>> promiseDeepForClass(SiteRequest siteRequest_) {
    return promiseDeepSweetSixteen(siteRequest_);
  }

  /////////////////
  // siteRequest //
  /////////////////

  public void siteRequestSweetSixteen(SiteRequest siteRequest_) {
      super.siteRequestBaseModel(siteRequest_);
    if(actualSweetSixteenSearch != null)
      actualSweetSixteenSearch.setSiteRequest_(siteRequest_);
  }

  public void siteRequestForClass(SiteRequest siteRequest_) {
    siteRequestSweetSixteen(siteRequest_);
  }

  /////////////
  // obtain //
  /////////////

  @Override public Object obtainForClass(String var) {
    String[] vars = StringUtils.split(var, ".");
    Object o = null;
    for(String v : vars) {
      if(o == null)
        o = obtainSweetSixteen(v);
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
  public Object obtainSweetSixteen(String var) {
    SweetSixteen oSweetSixteen = (SweetSixteen)this;
    switch(var) {
      case "actualSweetSixteenSearch":
        return oSweetSixteen.actualSweetSixteenSearch;
      case "actualSweetSixteen":
        return oSweetSixteen.actualSweetSixteen;
      case "guesserId":
        return oSweetSixteen.guesserId;
      case "year":
        return oSweetSixteen.year;
      case "bracketId":
        return oSweetSixteen.bracketId;
      case "name":
        return oSweetSixteen.name;
      case "southGame1WinnerGuess":
        return oSweetSixteen.southGame1WinnerGuess;
      case "southGame1Winner":
        return oSweetSixteen.southGame1Winner;
      case "southGame1Loser":
        return oSweetSixteen.southGame1Loser;
      case "southGame2WinnerGuess":
        return oSweetSixteen.southGame2WinnerGuess;
      case "southGame2Winner":
        return oSweetSixteen.southGame2Winner;
      case "southGame2Loser":
        return oSweetSixteen.southGame2Loser;
      case "westGame1WinnerGuess":
        return oSweetSixteen.westGame1WinnerGuess;
      case "westGame1Winner":
        return oSweetSixteen.westGame1Winner;
      case "westGame1Loser":
        return oSweetSixteen.westGame1Loser;
      case "westGame2WinnerGuess":
        return oSweetSixteen.westGame2WinnerGuess;
      case "westGame2Winner":
        return oSweetSixteen.westGame2Winner;
      case "westGame2Loser":
        return oSweetSixteen.westGame2Loser;
      case "eastGame1WinnerGuess":
        return oSweetSixteen.eastGame1WinnerGuess;
      case "eastGame1Winner":
        return oSweetSixteen.eastGame1Winner;
      case "eastGame1Loser":
        return oSweetSixteen.eastGame1Loser;
      case "eastGame2WinnerGuess":
        return oSweetSixteen.eastGame2WinnerGuess;
      case "eastGame2Winner":
        return oSweetSixteen.eastGame2Winner;
      case "eastGame2Loser":
        return oSweetSixteen.eastGame2Loser;
      case "midwestGame1WinnerGuess":
        return oSweetSixteen.midwestGame1WinnerGuess;
      case "midwestGame1Winner":
        return oSweetSixteen.midwestGame1Winner;
      case "midwestGame1Loser":
        return oSweetSixteen.midwestGame1Loser;
      case "midwestGame2WinnerGuess":
        return oSweetSixteen.midwestGame2WinnerGuess;
      case "midwestGame2Winner":
        return oSweetSixteen.midwestGame2Winner;
      case "midwestGame2Loser":
        return oSweetSixteen.midwestGame2Loser;
      case "eliteEight":
        return oSweetSixteen.eliteEight;
      case "correctGuesses":
        return oSweetSixteen.correctGuesses;
      case "incorrectGuesses":
        return oSweetSixteen.incorrectGuesses;
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
        o = relateSweetSixteen(v, val);
      else if(o instanceof BaseModel) {
        BaseModel baseModel = (BaseModel)o;
        o = baseModel.relateForClass(v, val);
      }
    }
    return o != null;
  }
  public Object relateSweetSixteen(String var, Object val) {
    SweetSixteen oSweetSixteen = (SweetSixteen)this;
    switch(var) {
      case "guesserId":
        if(oSweetSixteen.getGuesserId() == null)
          oSweetSixteen.setGuesserId(Optional.ofNullable(val).map(v -> v.toString()).orElse(null));
        if(!saves.contains("guesserId"))
          saves.add("guesserId");
        return val;
      case "southGame1Winner":
        if(oSweetSixteen.getSouthGame1Winner() == null)
          oSweetSixteen.setSouthGame1Winner(Optional.ofNullable(val).map(v -> v.toString()).orElse(null));
        if(!saves.contains("southGame1Winner"))
          saves.add("southGame1Winner");
        return val;
      case "southGame1Loser":
        if(oSweetSixteen.getSouthGame1Loser() == null)
          oSweetSixteen.setSouthGame1Loser(Optional.ofNullable(val).map(v -> v.toString()).orElse(null));
        if(!saves.contains("southGame1Loser"))
          saves.add("southGame1Loser");
        return val;
      case "southGame2Winner":
        if(oSweetSixteen.getSouthGame2Winner() == null)
          oSweetSixteen.setSouthGame2Winner(Optional.ofNullable(val).map(v -> v.toString()).orElse(null));
        if(!saves.contains("southGame2Winner"))
          saves.add("southGame2Winner");
        return val;
      case "southGame2Loser":
        if(oSweetSixteen.getSouthGame2Loser() == null)
          oSweetSixteen.setSouthGame2Loser(Optional.ofNullable(val).map(v -> v.toString()).orElse(null));
        if(!saves.contains("southGame2Loser"))
          saves.add("southGame2Loser");
        return val;
      case "westGame1Winner":
        if(oSweetSixteen.getWestGame1Winner() == null)
          oSweetSixteen.setWestGame1Winner(Optional.ofNullable(val).map(v -> v.toString()).orElse(null));
        if(!saves.contains("westGame1Winner"))
          saves.add("westGame1Winner");
        return val;
      case "westGame1Loser":
        if(oSweetSixteen.getWestGame1Loser() == null)
          oSweetSixteen.setWestGame1Loser(Optional.ofNullable(val).map(v -> v.toString()).orElse(null));
        if(!saves.contains("westGame1Loser"))
          saves.add("westGame1Loser");
        return val;
      case "westGame2Winner":
        if(oSweetSixteen.getWestGame2Winner() == null)
          oSweetSixteen.setWestGame2Winner(Optional.ofNullable(val).map(v -> v.toString()).orElse(null));
        if(!saves.contains("westGame2Winner"))
          saves.add("westGame2Winner");
        return val;
      case "westGame2Loser":
        if(oSweetSixteen.getWestGame2Loser() == null)
          oSweetSixteen.setWestGame2Loser(Optional.ofNullable(val).map(v -> v.toString()).orElse(null));
        if(!saves.contains("westGame2Loser"))
          saves.add("westGame2Loser");
        return val;
      case "eastGame1Winner":
        if(oSweetSixteen.getEastGame1Winner() == null)
          oSweetSixteen.setEastGame1Winner(Optional.ofNullable(val).map(v -> v.toString()).orElse(null));
        if(!saves.contains("eastGame1Winner"))
          saves.add("eastGame1Winner");
        return val;
      case "eastGame1Loser":
        if(oSweetSixteen.getEastGame1Loser() == null)
          oSweetSixteen.setEastGame1Loser(Optional.ofNullable(val).map(v -> v.toString()).orElse(null));
        if(!saves.contains("eastGame1Loser"))
          saves.add("eastGame1Loser");
        return val;
      case "eastGame2Winner":
        if(oSweetSixteen.getEastGame2Winner() == null)
          oSweetSixteen.setEastGame2Winner(Optional.ofNullable(val).map(v -> v.toString()).orElse(null));
        if(!saves.contains("eastGame2Winner"))
          saves.add("eastGame2Winner");
        return val;
      case "eastGame2Loser":
        if(oSweetSixteen.getEastGame2Loser() == null)
          oSweetSixteen.setEastGame2Loser(Optional.ofNullable(val).map(v -> v.toString()).orElse(null));
        if(!saves.contains("eastGame2Loser"))
          saves.add("eastGame2Loser");
        return val;
      case "midwestGame1Winner":
        if(oSweetSixteen.getMidwestGame1Winner() == null)
          oSweetSixteen.setMidwestGame1Winner(Optional.ofNullable(val).map(v -> v.toString()).orElse(null));
        if(!saves.contains("midwestGame1Winner"))
          saves.add("midwestGame1Winner");
        return val;
      case "midwestGame1Loser":
        if(oSweetSixteen.getMidwestGame1Loser() == null)
          oSweetSixteen.setMidwestGame1Loser(Optional.ofNullable(val).map(v -> v.toString()).orElse(null));
        if(!saves.contains("midwestGame1Loser"))
          saves.add("midwestGame1Loser");
        return val;
      case "midwestGame2Winner":
        if(oSweetSixteen.getMidwestGame2Winner() == null)
          oSweetSixteen.setMidwestGame2Winner(Optional.ofNullable(val).map(v -> v.toString()).orElse(null));
        if(!saves.contains("midwestGame2Winner"))
          saves.add("midwestGame2Winner");
        return val;
      case "midwestGame2Loser":
        if(oSweetSixteen.getMidwestGame2Loser() == null)
          oSweetSixteen.setMidwestGame2Loser(Optional.ofNullable(val).map(v -> v.toString()).orElse(null));
        if(!saves.contains("midwestGame2Loser"))
          saves.add("midwestGame2Loser");
        return val;
      case "eliteEight":
        if(oSweetSixteen.getEliteEight() == null)
          oSweetSixteen.setEliteEight(Optional.ofNullable(val).map(v -> v.toString()).orElse(null));
        if(!saves.contains("eliteEight"))
          saves.add("eliteEight");
        return val;
      default:
        return super.relateBaseModel(var, val);
    }
  }

  ///////////////
  // staticSet //
  ///////////////

  public static Object staticSetForClass(String entityVar, SiteRequest siteRequest_, String v, SweetSixteen o) {
    return staticSetSweetSixteen(entityVar,  siteRequest_, v, o);
  }
  public static Object staticSetSweetSixteen(String entityVar, SiteRequest siteRequest_, String v, SweetSixteen o) {
    switch(entityVar) {
    case "actualSweetSixteen":
      return SweetSixteen.staticSetActualSweetSixteen(siteRequest_, v);
    case "guesserId":
      return SweetSixteen.staticSetGuesserId(siteRequest_, v);
    case "year":
      return SweetSixteen.staticSetYear(siteRequest_, v);
    case "bracketId":
      return SweetSixteen.staticSetBracketId(siteRequest_, v);
    case "name":
      return SweetSixteen.staticSetName(siteRequest_, v);
    case "southGame1WinnerGuess":
      return SweetSixteen.staticSetSouthGame1WinnerGuess(siteRequest_, v);
    case "southGame1Winner":
      return SweetSixteen.staticSetSouthGame1Winner(siteRequest_, v);
    case "southGame1Loser":
      return SweetSixteen.staticSetSouthGame1Loser(siteRequest_, v);
    case "southGame2WinnerGuess":
      return SweetSixteen.staticSetSouthGame2WinnerGuess(siteRequest_, v);
    case "southGame2Winner":
      return SweetSixteen.staticSetSouthGame2Winner(siteRequest_, v);
    case "southGame2Loser":
      return SweetSixteen.staticSetSouthGame2Loser(siteRequest_, v);
    case "westGame1WinnerGuess":
      return SweetSixteen.staticSetWestGame1WinnerGuess(siteRequest_, v);
    case "westGame1Winner":
      return SweetSixteen.staticSetWestGame1Winner(siteRequest_, v);
    case "westGame1Loser":
      return SweetSixteen.staticSetWestGame1Loser(siteRequest_, v);
    case "westGame2WinnerGuess":
      return SweetSixteen.staticSetWestGame2WinnerGuess(siteRequest_, v);
    case "westGame2Winner":
      return SweetSixteen.staticSetWestGame2Winner(siteRequest_, v);
    case "westGame2Loser":
      return SweetSixteen.staticSetWestGame2Loser(siteRequest_, v);
    case "eastGame1WinnerGuess":
      return SweetSixteen.staticSetEastGame1WinnerGuess(siteRequest_, v);
    case "eastGame1Winner":
      return SweetSixteen.staticSetEastGame1Winner(siteRequest_, v);
    case "eastGame1Loser":
      return SweetSixteen.staticSetEastGame1Loser(siteRequest_, v);
    case "eastGame2WinnerGuess":
      return SweetSixteen.staticSetEastGame2WinnerGuess(siteRequest_, v);
    case "eastGame2Winner":
      return SweetSixteen.staticSetEastGame2Winner(siteRequest_, v);
    case "eastGame2Loser":
      return SweetSixteen.staticSetEastGame2Loser(siteRequest_, v);
    case "midwestGame1WinnerGuess":
      return SweetSixteen.staticSetMidwestGame1WinnerGuess(siteRequest_, v);
    case "midwestGame1Winner":
      return SweetSixteen.staticSetMidwestGame1Winner(siteRequest_, v);
    case "midwestGame1Loser":
      return SweetSixteen.staticSetMidwestGame1Loser(siteRequest_, v);
    case "midwestGame2WinnerGuess":
      return SweetSixteen.staticSetMidwestGame2WinnerGuess(siteRequest_, v);
    case "midwestGame2Winner":
      return SweetSixteen.staticSetMidwestGame2Winner(siteRequest_, v);
    case "midwestGame2Loser":
      return SweetSixteen.staticSetMidwestGame2Loser(siteRequest_, v);
    case "eliteEight":
      return SweetSixteen.staticSetEliteEight(siteRequest_, v);
    case "correctGuesses":
      return SweetSixteen.staticSetCorrectGuesses(siteRequest_, v);
    case "incorrectGuesses":
      return SweetSixteen.staticSetIncorrectGuesses(siteRequest_, v);
      default:
        return BaseModel.staticSetBaseModel(entityVar,  siteRequest_, v, o);
    }
  }

  //////////////////
  // staticSearch //
  //////////////////

  public static Future<SweetSixteen> fqSweetSixteen(SiteRequest siteRequest, String var, Object val) {
    Promise<SweetSixteen> promise = Promise.promise();
    try {
      if(val == null) {
        promise.complete();
      } else {
        SearchList<SweetSixteen> searchList = new SearchList<SweetSixteen>();
        searchList.setStore(true);
        searchList.q("*:*");
        searchList.setC(SweetSixteen.class);
        searchList.fq(String.format("%s:", SweetSixteen.varIndexedSweetSixteen(var)) + SearchTool.escapeQueryChars(val.toString()));
        searchList.promiseDeepForClass(siteRequest).onSuccess(a -> {
          try {
            promise.complete(searchList.getList().stream().findFirst().orElse(null));
          } catch(Throwable ex) {
            LOG.error("Error while querying the sweet sixteen bracket", ex);
            promise.fail(ex);
          }
        }).onFailure(ex -> {
          LOG.error("Error while querying the sweet sixteen bracket", ex);
          promise.fail(ex);
        });
      }
    } catch(Throwable ex) {
      LOG.error("Error while querying the sweet sixteen bracket", ex);
      promise.fail(ex);
    }
    return promise.future();
  }

  public static Object staticSearchForClass(String entityVar, SiteRequest siteRequest_, Object o) {
    return staticSearchSweetSixteen(entityVar,  siteRequest_, o);
  }
  public static Object staticSearchSweetSixteen(String entityVar, SiteRequest siteRequest_, Object o) {
    switch(entityVar) {
    case "actualSweetSixteen":
      return SweetSixteen.staticSearchActualSweetSixteen(siteRequest_, (JsonObject)o);
    case "guesserId":
      return SweetSixteen.staticSearchGuesserId(siteRequest_, (String)o);
    case "year":
      return SweetSixteen.staticSearchYear(siteRequest_, (Integer)o);
    case "bracketId":
      return SweetSixteen.staticSearchBracketId(siteRequest_, (String)o);
    case "name":
      return SweetSixteen.staticSearchName(siteRequest_, (String)o);
    case "southGame1WinnerGuess":
      return SweetSixteen.staticSearchSouthGame1WinnerGuess(siteRequest_, (String)o);
    case "southGame1Winner":
      return SweetSixteen.staticSearchSouthGame1Winner(siteRequest_, (String)o);
    case "southGame1Loser":
      return SweetSixteen.staticSearchSouthGame1Loser(siteRequest_, (String)o);
    case "southGame2WinnerGuess":
      return SweetSixteen.staticSearchSouthGame2WinnerGuess(siteRequest_, (String)o);
    case "southGame2Winner":
      return SweetSixteen.staticSearchSouthGame2Winner(siteRequest_, (String)o);
    case "southGame2Loser":
      return SweetSixteen.staticSearchSouthGame2Loser(siteRequest_, (String)o);
    case "westGame1WinnerGuess":
      return SweetSixteen.staticSearchWestGame1WinnerGuess(siteRequest_, (String)o);
    case "westGame1Winner":
      return SweetSixteen.staticSearchWestGame1Winner(siteRequest_, (String)o);
    case "westGame1Loser":
      return SweetSixteen.staticSearchWestGame1Loser(siteRequest_, (String)o);
    case "westGame2WinnerGuess":
      return SweetSixteen.staticSearchWestGame2WinnerGuess(siteRequest_, (String)o);
    case "westGame2Winner":
      return SweetSixteen.staticSearchWestGame2Winner(siteRequest_, (String)o);
    case "westGame2Loser":
      return SweetSixteen.staticSearchWestGame2Loser(siteRequest_, (String)o);
    case "eastGame1WinnerGuess":
      return SweetSixteen.staticSearchEastGame1WinnerGuess(siteRequest_, (String)o);
    case "eastGame1Winner":
      return SweetSixteen.staticSearchEastGame1Winner(siteRequest_, (String)o);
    case "eastGame1Loser":
      return SweetSixteen.staticSearchEastGame1Loser(siteRequest_, (String)o);
    case "eastGame2WinnerGuess":
      return SweetSixteen.staticSearchEastGame2WinnerGuess(siteRequest_, (String)o);
    case "eastGame2Winner":
      return SweetSixteen.staticSearchEastGame2Winner(siteRequest_, (String)o);
    case "eastGame2Loser":
      return SweetSixteen.staticSearchEastGame2Loser(siteRequest_, (String)o);
    case "midwestGame1WinnerGuess":
      return SweetSixteen.staticSearchMidwestGame1WinnerGuess(siteRequest_, (String)o);
    case "midwestGame1Winner":
      return SweetSixteen.staticSearchMidwestGame1Winner(siteRequest_, (String)o);
    case "midwestGame1Loser":
      return SweetSixteen.staticSearchMidwestGame1Loser(siteRequest_, (String)o);
    case "midwestGame2WinnerGuess":
      return SweetSixteen.staticSearchMidwestGame2WinnerGuess(siteRequest_, (String)o);
    case "midwestGame2Winner":
      return SweetSixteen.staticSearchMidwestGame2Winner(siteRequest_, (String)o);
    case "midwestGame2Loser":
      return SweetSixteen.staticSearchMidwestGame2Loser(siteRequest_, (String)o);
    case "eliteEight":
      return SweetSixteen.staticSearchEliteEight(siteRequest_, (String)o);
    case "correctGuesses":
      return SweetSixteen.staticSearchCorrectGuesses(siteRequest_, (Integer)o);
    case "incorrectGuesses":
      return SweetSixteen.staticSearchIncorrectGuesses(siteRequest_, (Integer)o);
      default:
        return BaseModel.staticSearchBaseModel(entityVar,  siteRequest_, o);
    }
  }

  ///////////////////
  // staticSearchStr //
  ///////////////////

  public static String staticSearchStrForClass(String entityVar, SiteRequest siteRequest_, Object o) {
    return staticSearchStrSweetSixteen(entityVar,  siteRequest_, o);
  }
  public static String staticSearchStrSweetSixteen(String entityVar, SiteRequest siteRequest_, Object o) {
    switch(entityVar) {
    case "actualSweetSixteen":
      return SweetSixteen.staticSearchStrActualSweetSixteen(siteRequest_, (String)o);
    case "guesserId":
      return SweetSixteen.staticSearchStrGuesserId(siteRequest_, (String)o);
    case "year":
      return SweetSixteen.staticSearchStrYear(siteRequest_, (Integer)o);
    case "bracketId":
      return SweetSixteen.staticSearchStrBracketId(siteRequest_, (String)o);
    case "name":
      return SweetSixteen.staticSearchStrName(siteRequest_, (String)o);
    case "southGame1WinnerGuess":
      return SweetSixteen.staticSearchStrSouthGame1WinnerGuess(siteRequest_, (String)o);
    case "southGame1Winner":
      return SweetSixteen.staticSearchStrSouthGame1Winner(siteRequest_, (String)o);
    case "southGame1Loser":
      return SweetSixteen.staticSearchStrSouthGame1Loser(siteRequest_, (String)o);
    case "southGame2WinnerGuess":
      return SweetSixteen.staticSearchStrSouthGame2WinnerGuess(siteRequest_, (String)o);
    case "southGame2Winner":
      return SweetSixteen.staticSearchStrSouthGame2Winner(siteRequest_, (String)o);
    case "southGame2Loser":
      return SweetSixteen.staticSearchStrSouthGame2Loser(siteRequest_, (String)o);
    case "westGame1WinnerGuess":
      return SweetSixteen.staticSearchStrWestGame1WinnerGuess(siteRequest_, (String)o);
    case "westGame1Winner":
      return SweetSixteen.staticSearchStrWestGame1Winner(siteRequest_, (String)o);
    case "westGame1Loser":
      return SweetSixteen.staticSearchStrWestGame1Loser(siteRequest_, (String)o);
    case "westGame2WinnerGuess":
      return SweetSixteen.staticSearchStrWestGame2WinnerGuess(siteRequest_, (String)o);
    case "westGame2Winner":
      return SweetSixteen.staticSearchStrWestGame2Winner(siteRequest_, (String)o);
    case "westGame2Loser":
      return SweetSixteen.staticSearchStrWestGame2Loser(siteRequest_, (String)o);
    case "eastGame1WinnerGuess":
      return SweetSixteen.staticSearchStrEastGame1WinnerGuess(siteRequest_, (String)o);
    case "eastGame1Winner":
      return SweetSixteen.staticSearchStrEastGame1Winner(siteRequest_, (String)o);
    case "eastGame1Loser":
      return SweetSixteen.staticSearchStrEastGame1Loser(siteRequest_, (String)o);
    case "eastGame2WinnerGuess":
      return SweetSixteen.staticSearchStrEastGame2WinnerGuess(siteRequest_, (String)o);
    case "eastGame2Winner":
      return SweetSixteen.staticSearchStrEastGame2Winner(siteRequest_, (String)o);
    case "eastGame2Loser":
      return SweetSixteen.staticSearchStrEastGame2Loser(siteRequest_, (String)o);
    case "midwestGame1WinnerGuess":
      return SweetSixteen.staticSearchStrMidwestGame1WinnerGuess(siteRequest_, (String)o);
    case "midwestGame1Winner":
      return SweetSixteen.staticSearchStrMidwestGame1Winner(siteRequest_, (String)o);
    case "midwestGame1Loser":
      return SweetSixteen.staticSearchStrMidwestGame1Loser(siteRequest_, (String)o);
    case "midwestGame2WinnerGuess":
      return SweetSixteen.staticSearchStrMidwestGame2WinnerGuess(siteRequest_, (String)o);
    case "midwestGame2Winner":
      return SweetSixteen.staticSearchStrMidwestGame2Winner(siteRequest_, (String)o);
    case "midwestGame2Loser":
      return SweetSixteen.staticSearchStrMidwestGame2Loser(siteRequest_, (String)o);
    case "eliteEight":
      return SweetSixteen.staticSearchStrEliteEight(siteRequest_, (String)o);
    case "correctGuesses":
      return SweetSixteen.staticSearchStrCorrectGuesses(siteRequest_, (Integer)o);
    case "incorrectGuesses":
      return SweetSixteen.staticSearchStrIncorrectGuesses(siteRequest_, (Integer)o);
      default:
        return BaseModel.staticSearchStrBaseModel(entityVar,  siteRequest_, o);
    }
  }

  //////////////////
  // staticSearchFq //
  //////////////////

  public static String staticSearchFqForClass(String entityVar, SiteRequest siteRequest_, String o) {
    return staticSearchFqSweetSixteen(entityVar,  siteRequest_, o);
  }
  public static String staticSearchFqSweetSixteen(String entityVar, SiteRequest siteRequest_, String o) {
    switch(entityVar) {
    case "actualSweetSixteen":
      return SweetSixteen.staticSearchFqActualSweetSixteen(siteRequest_, o);
    case "guesserId":
      return SweetSixteen.staticSearchFqGuesserId(siteRequest_, o);
    case "year":
      return SweetSixteen.staticSearchFqYear(siteRequest_, o);
    case "bracketId":
      return SweetSixteen.staticSearchFqBracketId(siteRequest_, o);
    case "name":
      return SweetSixteen.staticSearchFqName(siteRequest_, o);
    case "southGame1WinnerGuess":
      return SweetSixteen.staticSearchFqSouthGame1WinnerGuess(siteRequest_, o);
    case "southGame1Winner":
      return SweetSixteen.staticSearchFqSouthGame1Winner(siteRequest_, o);
    case "southGame1Loser":
      return SweetSixteen.staticSearchFqSouthGame1Loser(siteRequest_, o);
    case "southGame2WinnerGuess":
      return SweetSixteen.staticSearchFqSouthGame2WinnerGuess(siteRequest_, o);
    case "southGame2Winner":
      return SweetSixteen.staticSearchFqSouthGame2Winner(siteRequest_, o);
    case "southGame2Loser":
      return SweetSixteen.staticSearchFqSouthGame2Loser(siteRequest_, o);
    case "westGame1WinnerGuess":
      return SweetSixteen.staticSearchFqWestGame1WinnerGuess(siteRequest_, o);
    case "westGame1Winner":
      return SweetSixteen.staticSearchFqWestGame1Winner(siteRequest_, o);
    case "westGame1Loser":
      return SweetSixteen.staticSearchFqWestGame1Loser(siteRequest_, o);
    case "westGame2WinnerGuess":
      return SweetSixteen.staticSearchFqWestGame2WinnerGuess(siteRequest_, o);
    case "westGame2Winner":
      return SweetSixteen.staticSearchFqWestGame2Winner(siteRequest_, o);
    case "westGame2Loser":
      return SweetSixteen.staticSearchFqWestGame2Loser(siteRequest_, o);
    case "eastGame1WinnerGuess":
      return SweetSixteen.staticSearchFqEastGame1WinnerGuess(siteRequest_, o);
    case "eastGame1Winner":
      return SweetSixteen.staticSearchFqEastGame1Winner(siteRequest_, o);
    case "eastGame1Loser":
      return SweetSixteen.staticSearchFqEastGame1Loser(siteRequest_, o);
    case "eastGame2WinnerGuess":
      return SweetSixteen.staticSearchFqEastGame2WinnerGuess(siteRequest_, o);
    case "eastGame2Winner":
      return SweetSixteen.staticSearchFqEastGame2Winner(siteRequest_, o);
    case "eastGame2Loser":
      return SweetSixteen.staticSearchFqEastGame2Loser(siteRequest_, o);
    case "midwestGame1WinnerGuess":
      return SweetSixteen.staticSearchFqMidwestGame1WinnerGuess(siteRequest_, o);
    case "midwestGame1Winner":
      return SweetSixteen.staticSearchFqMidwestGame1Winner(siteRequest_, o);
    case "midwestGame1Loser":
      return SweetSixteen.staticSearchFqMidwestGame1Loser(siteRequest_, o);
    case "midwestGame2WinnerGuess":
      return SweetSixteen.staticSearchFqMidwestGame2WinnerGuess(siteRequest_, o);
    case "midwestGame2Winner":
      return SweetSixteen.staticSearchFqMidwestGame2Winner(siteRequest_, o);
    case "midwestGame2Loser":
      return SweetSixteen.staticSearchFqMidwestGame2Loser(siteRequest_, o);
    case "eliteEight":
      return SweetSixteen.staticSearchFqEliteEight(siteRequest_, o);
    case "correctGuesses":
      return SweetSixteen.staticSearchFqCorrectGuesses(siteRequest_, o);
    case "incorrectGuesses":
      return SweetSixteen.staticSearchFqIncorrectGuesses(siteRequest_, o);
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
          o = persistSweetSixteen(v, val);
        else if(o instanceof BaseModel) {
          BaseModel oBaseModel = (BaseModel)o;
          o = oBaseModel.persistForClass(v, val);
        }
      }
    }
    return o != null;
  }
  public Object persistSweetSixteen(String var, Object val) {
    String varLower = var.toLowerCase();
      if("guesserid".equals(varLower)) {
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
      } else if("southgame1winner".equals(varLower)) {
        if(val instanceof String) {
          setSouthGame1Winner((String)val);
        }
        saves.add("southGame1Winner");
        return val;
      } else if("southgame1loser".equals(varLower)) {
        if(val instanceof String) {
          setSouthGame1Loser((String)val);
        }
        saves.add("southGame1Loser");
        return val;
      } else if("southgame2winner".equals(varLower)) {
        if(val instanceof String) {
          setSouthGame2Winner((String)val);
        }
        saves.add("southGame2Winner");
        return val;
      } else if("southgame2loser".equals(varLower)) {
        if(val instanceof String) {
          setSouthGame2Loser((String)val);
        }
        saves.add("southGame2Loser");
        return val;
      } else if("westgame1winner".equals(varLower)) {
        if(val instanceof String) {
          setWestGame1Winner((String)val);
        }
        saves.add("westGame1Winner");
        return val;
      } else if("westgame1loser".equals(varLower)) {
        if(val instanceof String) {
          setWestGame1Loser((String)val);
        }
        saves.add("westGame1Loser");
        return val;
      } else if("westgame2winner".equals(varLower)) {
        if(val instanceof String) {
          setWestGame2Winner((String)val);
        }
        saves.add("westGame2Winner");
        return val;
      } else if("westgame2loser".equals(varLower)) {
        if(val instanceof String) {
          setWestGame2Loser((String)val);
        }
        saves.add("westGame2Loser");
        return val;
      } else if("eastgame1winner".equals(varLower)) {
        if(val instanceof String) {
          setEastGame1Winner((String)val);
        }
        saves.add("eastGame1Winner");
        return val;
      } else if("eastgame1loser".equals(varLower)) {
        if(val instanceof String) {
          setEastGame1Loser((String)val);
        }
        saves.add("eastGame1Loser");
        return val;
      } else if("eastgame2winner".equals(varLower)) {
        if(val instanceof String) {
          setEastGame2Winner((String)val);
        }
        saves.add("eastGame2Winner");
        return val;
      } else if("eastgame2loser".equals(varLower)) {
        if(val instanceof String) {
          setEastGame2Loser((String)val);
        }
        saves.add("eastGame2Loser");
        return val;
      } else if("midwestgame1winner".equals(varLower)) {
        if(val instanceof String) {
          setMidwestGame1Winner((String)val);
        }
        saves.add("midwestGame1Winner");
        return val;
      } else if("midwestgame1loser".equals(varLower)) {
        if(val instanceof String) {
          setMidwestGame1Loser((String)val);
        }
        saves.add("midwestGame1Loser");
        return val;
      } else if("midwestgame2winner".equals(varLower)) {
        if(val instanceof String) {
          setMidwestGame2Winner((String)val);
        }
        saves.add("midwestGame2Winner");
        return val;
      } else if("midwestgame2loser".equals(varLower)) {
        if(val instanceof String) {
          setMidwestGame2Loser((String)val);
        }
        saves.add("midwestGame2Loser");
        return val;
      } else if("eliteeight".equals(varLower)) {
        if(val instanceof String) {
          setEliteEight((String)val);
        }
        saves.add("eliteEight");
        return val;
    } else {
      return super.persistBaseModel(var, val);
    }
  }

  /////////////
  // populate //
  /////////////

  @Override public void populateForClass(SolrResponse.Doc doc) {
    populateSweetSixteen(doc);
  }
  public void populateSweetSixteen(SolrResponse.Doc doc) {
    SweetSixteen oSweetSixteen = (SweetSixteen)this;
    saves = Optional.ofNullable((ArrayList<String>)doc.get("saves_docvalues_strings")).orElse(new ArrayList<String>());
    if(saves != null) {

      if(saves.contains("actualSweetSixteen")) {
        String actualSweetSixteen = (String)doc.get("actualSweetSixteen_stored_string");
        if(actualSweetSixteen != null)
          oSweetSixteen.setActualSweetSixteen(actualSweetSixteen);
      }

      String guesserId = (String)doc.get("guesserId_docvalues_string");
      if(guesserId != null)
        oSweetSixteen.setGuesserId(guesserId);

      if(saves.contains("year")) {
        Integer year = (Integer)doc.get("year_docvalues_int");
        if(year != null)
          oSweetSixteen.setYear(year);
      }

      if(saves.contains("bracketId")) {
        String bracketId = (String)doc.get("bracketId_docvalues_string");
        if(bracketId != null)
          oSweetSixteen.setBracketId(bracketId);
      }

      if(saves.contains("name")) {
        String name = (String)doc.get("name_docvalues_string");
        if(name != null)
          oSweetSixteen.setName(name);
      }

      if(saves.contains("southGame1WinnerGuess")) {
        String southGame1WinnerGuess = (String)doc.get("southGame1WinnerGuess_docvalues_string");
        if(southGame1WinnerGuess != null)
          oSweetSixteen.setSouthGame1WinnerGuess(southGame1WinnerGuess);
      }

      String southGame1Winner = (String)doc.get("southGame1Winner_docvalues_string");
      if(southGame1Winner != null)
        oSweetSixteen.setSouthGame1Winner(southGame1Winner);

      String southGame1Loser = (String)doc.get("southGame1Loser_docvalues_string");
      if(southGame1Loser != null)
        oSweetSixteen.setSouthGame1Loser(southGame1Loser);

      if(saves.contains("southGame2WinnerGuess")) {
        String southGame2WinnerGuess = (String)doc.get("southGame2WinnerGuess_docvalues_string");
        if(southGame2WinnerGuess != null)
          oSweetSixteen.setSouthGame2WinnerGuess(southGame2WinnerGuess);
      }

      String southGame2Winner = (String)doc.get("southGame2Winner_docvalues_string");
      if(southGame2Winner != null)
        oSweetSixteen.setSouthGame2Winner(southGame2Winner);

      String southGame2Loser = (String)doc.get("southGame2Loser_docvalues_string");
      if(southGame2Loser != null)
        oSweetSixteen.setSouthGame2Loser(southGame2Loser);

      if(saves.contains("westGame1WinnerGuess")) {
        String westGame1WinnerGuess = (String)doc.get("westGame1WinnerGuess_docvalues_string");
        if(westGame1WinnerGuess != null)
          oSweetSixteen.setWestGame1WinnerGuess(westGame1WinnerGuess);
      }

      String westGame1Winner = (String)doc.get("westGame1Winner_docvalues_string");
      if(westGame1Winner != null)
        oSweetSixteen.setWestGame1Winner(westGame1Winner);

      String westGame1Loser = (String)doc.get("westGame1Loser_docvalues_string");
      if(westGame1Loser != null)
        oSweetSixteen.setWestGame1Loser(westGame1Loser);

      if(saves.contains("westGame2WinnerGuess")) {
        String westGame2WinnerGuess = (String)doc.get("westGame2WinnerGuess_docvalues_string");
        if(westGame2WinnerGuess != null)
          oSweetSixteen.setWestGame2WinnerGuess(westGame2WinnerGuess);
      }

      String westGame2Winner = (String)doc.get("westGame2Winner_docvalues_string");
      if(westGame2Winner != null)
        oSweetSixteen.setWestGame2Winner(westGame2Winner);

      String westGame2Loser = (String)doc.get("westGame2Loser_docvalues_string");
      if(westGame2Loser != null)
        oSweetSixteen.setWestGame2Loser(westGame2Loser);

      if(saves.contains("eastGame1WinnerGuess")) {
        String eastGame1WinnerGuess = (String)doc.get("eastGame1WinnerGuess_docvalues_string");
        if(eastGame1WinnerGuess != null)
          oSweetSixteen.setEastGame1WinnerGuess(eastGame1WinnerGuess);
      }

      String eastGame1Winner = (String)doc.get("eastGame1Winner_docvalues_string");
      if(eastGame1Winner != null)
        oSweetSixteen.setEastGame1Winner(eastGame1Winner);

      String eastGame1Loser = (String)doc.get("eastGame1Loser_docvalues_string");
      if(eastGame1Loser != null)
        oSweetSixteen.setEastGame1Loser(eastGame1Loser);

      if(saves.contains("eastGame2WinnerGuess")) {
        String eastGame2WinnerGuess = (String)doc.get("eastGame2WinnerGuess_docvalues_string");
        if(eastGame2WinnerGuess != null)
          oSweetSixteen.setEastGame2WinnerGuess(eastGame2WinnerGuess);
      }

      String eastGame2Winner = (String)doc.get("eastGame2Winner_docvalues_string");
      if(eastGame2Winner != null)
        oSweetSixteen.setEastGame2Winner(eastGame2Winner);

      String eastGame2Loser = (String)doc.get("eastGame2Loser_docvalues_string");
      if(eastGame2Loser != null)
        oSweetSixteen.setEastGame2Loser(eastGame2Loser);

      if(saves.contains("midwestGame1WinnerGuess")) {
        String midwestGame1WinnerGuess = (String)doc.get("midwestGame1WinnerGuess_docvalues_string");
        if(midwestGame1WinnerGuess != null)
          oSweetSixteen.setMidwestGame1WinnerGuess(midwestGame1WinnerGuess);
      }

      String midwestGame1Winner = (String)doc.get("midwestGame1Winner_docvalues_string");
      if(midwestGame1Winner != null)
        oSweetSixteen.setMidwestGame1Winner(midwestGame1Winner);

      String midwestGame1Loser = (String)doc.get("midwestGame1Loser_docvalues_string");
      if(midwestGame1Loser != null)
        oSweetSixteen.setMidwestGame1Loser(midwestGame1Loser);

      if(saves.contains("midwestGame2WinnerGuess")) {
        String midwestGame2WinnerGuess = (String)doc.get("midwestGame2WinnerGuess_docvalues_string");
        if(midwestGame2WinnerGuess != null)
          oSweetSixteen.setMidwestGame2WinnerGuess(midwestGame2WinnerGuess);
      }

      String midwestGame2Winner = (String)doc.get("midwestGame2Winner_docvalues_string");
      if(midwestGame2Winner != null)
        oSweetSixteen.setMidwestGame2Winner(midwestGame2Winner);

      String midwestGame2Loser = (String)doc.get("midwestGame2Loser_docvalues_string");
      if(midwestGame2Loser != null)
        oSweetSixteen.setMidwestGame2Loser(midwestGame2Loser);

      String eliteEight = (String)doc.get("eliteEight_docvalues_string");
      if(eliteEight != null)
        oSweetSixteen.setEliteEight(eliteEight);

      if(saves.contains("correctGuesses")) {
        Integer correctGuesses = (Integer)doc.get("correctGuesses_docvalues_int");
        if(correctGuesses != null)
          oSweetSixteen.setCorrectGuesses(correctGuesses);
      }

      if(saves.contains("incorrectGuesses")) {
        Integer incorrectGuesses = (Integer)doc.get("incorrectGuesses_docvalues_int");
        if(incorrectGuesses != null)
          oSweetSixteen.setIncorrectGuesses(incorrectGuesses);
      }
    }

    super.populateBaseModel(doc);
  }

  public void indexSweetSixteen(JsonObject doc) {
    if(actualSweetSixteen != null) {
      doc.put("actualSweetSixteen_stored_string", actualSweetSixteen.toString());
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
    if(southGame1WinnerGuess != null) {
      doc.put("southGame1WinnerGuess_docvalues_string", southGame1WinnerGuess);
    }
    if(southGame1Winner != null) {
      doc.put("southGame1Winner_docvalues_string", southGame1Winner);
    }
    if(southGame1Loser != null) {
      doc.put("southGame1Loser_docvalues_string", southGame1Loser);
    }
    if(southGame2WinnerGuess != null) {
      doc.put("southGame2WinnerGuess_docvalues_string", southGame2WinnerGuess);
    }
    if(southGame2Winner != null) {
      doc.put("southGame2Winner_docvalues_string", southGame2Winner);
    }
    if(southGame2Loser != null) {
      doc.put("southGame2Loser_docvalues_string", southGame2Loser);
    }
    if(westGame1WinnerGuess != null) {
      doc.put("westGame1WinnerGuess_docvalues_string", westGame1WinnerGuess);
    }
    if(westGame1Winner != null) {
      doc.put("westGame1Winner_docvalues_string", westGame1Winner);
    }
    if(westGame1Loser != null) {
      doc.put("westGame1Loser_docvalues_string", westGame1Loser);
    }
    if(westGame2WinnerGuess != null) {
      doc.put("westGame2WinnerGuess_docvalues_string", westGame2WinnerGuess);
    }
    if(westGame2Winner != null) {
      doc.put("westGame2Winner_docvalues_string", westGame2Winner);
    }
    if(westGame2Loser != null) {
      doc.put("westGame2Loser_docvalues_string", westGame2Loser);
    }
    if(eastGame1WinnerGuess != null) {
      doc.put("eastGame1WinnerGuess_docvalues_string", eastGame1WinnerGuess);
    }
    if(eastGame1Winner != null) {
      doc.put("eastGame1Winner_docvalues_string", eastGame1Winner);
    }
    if(eastGame1Loser != null) {
      doc.put("eastGame1Loser_docvalues_string", eastGame1Loser);
    }
    if(eastGame2WinnerGuess != null) {
      doc.put("eastGame2WinnerGuess_docvalues_string", eastGame2WinnerGuess);
    }
    if(eastGame2Winner != null) {
      doc.put("eastGame2Winner_docvalues_string", eastGame2Winner);
    }
    if(eastGame2Loser != null) {
      doc.put("eastGame2Loser_docvalues_string", eastGame2Loser);
    }
    if(midwestGame1WinnerGuess != null) {
      doc.put("midwestGame1WinnerGuess_docvalues_string", midwestGame1WinnerGuess);
    }
    if(midwestGame1Winner != null) {
      doc.put("midwestGame1Winner_docvalues_string", midwestGame1Winner);
    }
    if(midwestGame1Loser != null) {
      doc.put("midwestGame1Loser_docvalues_string", midwestGame1Loser);
    }
    if(midwestGame2WinnerGuess != null) {
      doc.put("midwestGame2WinnerGuess_docvalues_string", midwestGame2WinnerGuess);
    }
    if(midwestGame2Winner != null) {
      doc.put("midwestGame2Winner_docvalues_string", midwestGame2Winner);
    }
    if(midwestGame2Loser != null) {
      doc.put("midwestGame2Loser_docvalues_string", midwestGame2Loser);
    }
    if(eliteEight != null) {
      doc.put("eliteEight_docvalues_string", eliteEight);
    }
    if(correctGuesses != null) {
      doc.put("correctGuesses_docvalues_int", correctGuesses);
    }
    if(incorrectGuesses != null) {
      doc.put("incorrectGuesses_docvalues_int", incorrectGuesses);
    }
    super.indexBaseModel(doc);

	}

  public static String varStoredSweetSixteen(String entityVar) {
    switch(entityVar) {
      case "actualSweetSixteen":
        return "actualSweetSixteen_stored_string";
      case "guesserId":
        return "guesserId_docvalues_string";
      case "year":
        return "year_docvalues_int";
      case "bracketId":
        return "bracketId_docvalues_string";
      case "name":
        return "name_docvalues_string";
      case "southGame1WinnerGuess":
        return "southGame1WinnerGuess_docvalues_string";
      case "southGame1Winner":
        return "southGame1Winner_docvalues_string";
      case "southGame1Loser":
        return "southGame1Loser_docvalues_string";
      case "southGame2WinnerGuess":
        return "southGame2WinnerGuess_docvalues_string";
      case "southGame2Winner":
        return "southGame2Winner_docvalues_string";
      case "southGame2Loser":
        return "southGame2Loser_docvalues_string";
      case "westGame1WinnerGuess":
        return "westGame1WinnerGuess_docvalues_string";
      case "westGame1Winner":
        return "westGame1Winner_docvalues_string";
      case "westGame1Loser":
        return "westGame1Loser_docvalues_string";
      case "westGame2WinnerGuess":
        return "westGame2WinnerGuess_docvalues_string";
      case "westGame2Winner":
        return "westGame2Winner_docvalues_string";
      case "westGame2Loser":
        return "westGame2Loser_docvalues_string";
      case "eastGame1WinnerGuess":
        return "eastGame1WinnerGuess_docvalues_string";
      case "eastGame1Winner":
        return "eastGame1Winner_docvalues_string";
      case "eastGame1Loser":
        return "eastGame1Loser_docvalues_string";
      case "eastGame2WinnerGuess":
        return "eastGame2WinnerGuess_docvalues_string";
      case "eastGame2Winner":
        return "eastGame2Winner_docvalues_string";
      case "eastGame2Loser":
        return "eastGame2Loser_docvalues_string";
      case "midwestGame1WinnerGuess":
        return "midwestGame1WinnerGuess_docvalues_string";
      case "midwestGame1Winner":
        return "midwestGame1Winner_docvalues_string";
      case "midwestGame1Loser":
        return "midwestGame1Loser_docvalues_string";
      case "midwestGame2WinnerGuess":
        return "midwestGame2WinnerGuess_docvalues_string";
      case "midwestGame2Winner":
        return "midwestGame2Winner_docvalues_string";
      case "midwestGame2Loser":
        return "midwestGame2Loser_docvalues_string";
      case "eliteEight":
        return "eliteEight_docvalues_string";
      case "correctGuesses":
        return "correctGuesses_docvalues_int";
      case "incorrectGuesses":
        return "incorrectGuesses_docvalues_int";
      default:
        return BaseModel.varStoredBaseModel(entityVar);
    }
  }

  public static String varIndexedSweetSixteen(String entityVar) {
    switch(entityVar) {
      case "guesserId":
        return "guesserId_docvalues_string";
      case "year":
        return "year_docvalues_int";
      case "bracketId":
        return "bracketId_docvalues_string";
      case "name":
        return "name_docvalues_string";
      case "southGame1WinnerGuess":
        return "southGame1WinnerGuess_docvalues_string";
      case "southGame1Winner":
        return "southGame1Winner_docvalues_string";
      case "southGame1Loser":
        return "southGame1Loser_docvalues_string";
      case "southGame2WinnerGuess":
        return "southGame2WinnerGuess_docvalues_string";
      case "southGame2Winner":
        return "southGame2Winner_docvalues_string";
      case "southGame2Loser":
        return "southGame2Loser_docvalues_string";
      case "westGame1WinnerGuess":
        return "westGame1WinnerGuess_docvalues_string";
      case "westGame1Winner":
        return "westGame1Winner_docvalues_string";
      case "westGame1Loser":
        return "westGame1Loser_docvalues_string";
      case "westGame2WinnerGuess":
        return "westGame2WinnerGuess_docvalues_string";
      case "westGame2Winner":
        return "westGame2Winner_docvalues_string";
      case "westGame2Loser":
        return "westGame2Loser_docvalues_string";
      case "eastGame1WinnerGuess":
        return "eastGame1WinnerGuess_docvalues_string";
      case "eastGame1Winner":
        return "eastGame1Winner_docvalues_string";
      case "eastGame1Loser":
        return "eastGame1Loser_docvalues_string";
      case "eastGame2WinnerGuess":
        return "eastGame2WinnerGuess_docvalues_string";
      case "eastGame2Winner":
        return "eastGame2Winner_docvalues_string";
      case "eastGame2Loser":
        return "eastGame2Loser_docvalues_string";
      case "midwestGame1WinnerGuess":
        return "midwestGame1WinnerGuess_docvalues_string";
      case "midwestGame1Winner":
        return "midwestGame1Winner_docvalues_string";
      case "midwestGame1Loser":
        return "midwestGame1Loser_docvalues_string";
      case "midwestGame2WinnerGuess":
        return "midwestGame2WinnerGuess_docvalues_string";
      case "midwestGame2Winner":
        return "midwestGame2Winner_docvalues_string";
      case "midwestGame2Loser":
        return "midwestGame2Loser_docvalues_string";
      case "eliteEight":
        return "eliteEight_docvalues_string";
      case "correctGuesses":
        return "correctGuesses_docvalues_int";
      case "incorrectGuesses":
        return "incorrectGuesses_docvalues_int";
      default:
        return BaseModel.varIndexedBaseModel(entityVar);
    }
  }

  public static String searchVarSweetSixteen(String searchVar) {
    switch(searchVar) {
      case "guesserId_docvalues_string":
        return "guesserId";
      case "year_docvalues_int":
        return "year";
      case "bracketId_docvalues_string":
        return "bracketId";
      case "name_docvalues_string":
        return "name";
      case "southGame1WinnerGuess_docvalues_string":
        return "southGame1WinnerGuess";
      case "southGame1Winner_docvalues_string":
        return "southGame1Winner";
      case "southGame1Loser_docvalues_string":
        return "southGame1Loser";
      case "southGame2WinnerGuess_docvalues_string":
        return "southGame2WinnerGuess";
      case "southGame2Winner_docvalues_string":
        return "southGame2Winner";
      case "southGame2Loser_docvalues_string":
        return "southGame2Loser";
      case "westGame1WinnerGuess_docvalues_string":
        return "westGame1WinnerGuess";
      case "westGame1Winner_docvalues_string":
        return "westGame1Winner";
      case "westGame1Loser_docvalues_string":
        return "westGame1Loser";
      case "westGame2WinnerGuess_docvalues_string":
        return "westGame2WinnerGuess";
      case "westGame2Winner_docvalues_string":
        return "westGame2Winner";
      case "westGame2Loser_docvalues_string":
        return "westGame2Loser";
      case "eastGame1WinnerGuess_docvalues_string":
        return "eastGame1WinnerGuess";
      case "eastGame1Winner_docvalues_string":
        return "eastGame1Winner";
      case "eastGame1Loser_docvalues_string":
        return "eastGame1Loser";
      case "eastGame2WinnerGuess_docvalues_string":
        return "eastGame2WinnerGuess";
      case "eastGame2Winner_docvalues_string":
        return "eastGame2Winner";
      case "eastGame2Loser_docvalues_string":
        return "eastGame2Loser";
      case "midwestGame1WinnerGuess_docvalues_string":
        return "midwestGame1WinnerGuess";
      case "midwestGame1Winner_docvalues_string":
        return "midwestGame1Winner";
      case "midwestGame1Loser_docvalues_string":
        return "midwestGame1Loser";
      case "midwestGame2WinnerGuess_docvalues_string":
        return "midwestGame2WinnerGuess";
      case "midwestGame2Winner_docvalues_string":
        return "midwestGame2Winner";
      case "midwestGame2Loser_docvalues_string":
        return "midwestGame2Loser";
      case "eliteEight_docvalues_string":
        return "eliteEight";
      case "correctGuesses_docvalues_int":
        return "correctGuesses";
      case "incorrectGuesses_docvalues_int":
        return "incorrectGuesses";
      default:
        return BaseModel.searchVarBaseModel(searchVar);
    }
  }

  public static String varSearchSweetSixteen(String entityVar) {
    switch(entityVar) {
      default:
        return BaseModel.varSearchBaseModel(entityVar);
    }
  }

  public static String varSuggestedSweetSixteen(String entityVar) {
    switch(entityVar) {
      default:
        return BaseModel.varSuggestedBaseModel(entityVar);
    }
  }

  /////////////
  // store //
  /////////////

  @Override public void storeForClass(SolrResponse.Doc doc) {
    storeSweetSixteen(doc);
  }
  public void storeSweetSixteen(SolrResponse.Doc doc) {
    SweetSixteen oSweetSixteen = (SweetSixteen)this;
    SiteRequest siteRequest = oSweetSixteen.getSiteRequest_();

    oSweetSixteen.setActualSweetSixteen(Optional.ofNullable(doc.get("actualSweetSixteen_stored_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setGuesserId(Optional.ofNullable(doc.get("guesserId_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setYear(Optional.ofNullable(doc.get("year_docvalues_int")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setBracketId(Optional.ofNullable(doc.get("bracketId_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setName(Optional.ofNullable(doc.get("name_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setSouthGame1WinnerGuess(Optional.ofNullable(doc.get("southGame1WinnerGuess_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setSouthGame1Winner(Optional.ofNullable(doc.get("southGame1Winner_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setSouthGame1Loser(Optional.ofNullable(doc.get("southGame1Loser_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setSouthGame2WinnerGuess(Optional.ofNullable(doc.get("southGame2WinnerGuess_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setSouthGame2Winner(Optional.ofNullable(doc.get("southGame2Winner_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setSouthGame2Loser(Optional.ofNullable(doc.get("southGame2Loser_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setWestGame1WinnerGuess(Optional.ofNullable(doc.get("westGame1WinnerGuess_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setWestGame1Winner(Optional.ofNullable(doc.get("westGame1Winner_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setWestGame1Loser(Optional.ofNullable(doc.get("westGame1Loser_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setWestGame2WinnerGuess(Optional.ofNullable(doc.get("westGame2WinnerGuess_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setWestGame2Winner(Optional.ofNullable(doc.get("westGame2Winner_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setWestGame2Loser(Optional.ofNullable(doc.get("westGame2Loser_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setEastGame1WinnerGuess(Optional.ofNullable(doc.get("eastGame1WinnerGuess_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setEastGame1Winner(Optional.ofNullable(doc.get("eastGame1Winner_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setEastGame1Loser(Optional.ofNullable(doc.get("eastGame1Loser_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setEastGame2WinnerGuess(Optional.ofNullable(doc.get("eastGame2WinnerGuess_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setEastGame2Winner(Optional.ofNullable(doc.get("eastGame2Winner_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setEastGame2Loser(Optional.ofNullable(doc.get("eastGame2Loser_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setMidwestGame1WinnerGuess(Optional.ofNullable(doc.get("midwestGame1WinnerGuess_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setMidwestGame1Winner(Optional.ofNullable(doc.get("midwestGame1Winner_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setMidwestGame1Loser(Optional.ofNullable(doc.get("midwestGame1Loser_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setMidwestGame2WinnerGuess(Optional.ofNullable(doc.get("midwestGame2WinnerGuess_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setMidwestGame2Winner(Optional.ofNullable(doc.get("midwestGame2Winner_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setMidwestGame2Loser(Optional.ofNullable(doc.get("midwestGame2Loser_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setEliteEight(Optional.ofNullable(doc.get("eliteEight_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setCorrectGuesses(Optional.ofNullable(doc.get("correctGuesses_docvalues_int")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setIncorrectGuesses(Optional.ofNullable(doc.get("incorrectGuesses_docvalues_int")).map(v -> v.toString()).orElse(null));

    super.storeBaseModel(doc);
  }

  //////////////////
  // apiRequest //
  //////////////////

  public void apiRequestSweetSixteen() {
    ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(r -> r.getApiRequest_()).orElse(null);
    Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
    if(o != null && o instanceof SweetSixteen) {
      SweetSixteen original = (SweetSixteen)o;
      if(!Objects.equals(actualSweetSixteen, original.getActualSweetSixteen()))
        apiRequest.addVars("actualSweetSixteen");
      if(!Objects.equals(guesserId, original.getGuesserId()))
        apiRequest.addVars("guesserId");
      if(!Objects.equals(year, original.getYear()))
        apiRequest.addVars("year");
      if(!Objects.equals(bracketId, original.getBracketId()))
        apiRequest.addVars("bracketId");
      if(!Objects.equals(name, original.getName()))
        apiRequest.addVars("name");
      if(!Objects.equals(southGame1WinnerGuess, original.getSouthGame1WinnerGuess()))
        apiRequest.addVars("southGame1WinnerGuess");
      if(!Objects.equals(southGame1Winner, original.getSouthGame1Winner()))
        apiRequest.addVars("southGame1Winner");
      if(!Objects.equals(southGame1Loser, original.getSouthGame1Loser()))
        apiRequest.addVars("southGame1Loser");
      if(!Objects.equals(southGame2WinnerGuess, original.getSouthGame2WinnerGuess()))
        apiRequest.addVars("southGame2WinnerGuess");
      if(!Objects.equals(southGame2Winner, original.getSouthGame2Winner()))
        apiRequest.addVars("southGame2Winner");
      if(!Objects.equals(southGame2Loser, original.getSouthGame2Loser()))
        apiRequest.addVars("southGame2Loser");
      if(!Objects.equals(westGame1WinnerGuess, original.getWestGame1WinnerGuess()))
        apiRequest.addVars("westGame1WinnerGuess");
      if(!Objects.equals(westGame1Winner, original.getWestGame1Winner()))
        apiRequest.addVars("westGame1Winner");
      if(!Objects.equals(westGame1Loser, original.getWestGame1Loser()))
        apiRequest.addVars("westGame1Loser");
      if(!Objects.equals(westGame2WinnerGuess, original.getWestGame2WinnerGuess()))
        apiRequest.addVars("westGame2WinnerGuess");
      if(!Objects.equals(westGame2Winner, original.getWestGame2Winner()))
        apiRequest.addVars("westGame2Winner");
      if(!Objects.equals(westGame2Loser, original.getWestGame2Loser()))
        apiRequest.addVars("westGame2Loser");
      if(!Objects.equals(eastGame1WinnerGuess, original.getEastGame1WinnerGuess()))
        apiRequest.addVars("eastGame1WinnerGuess");
      if(!Objects.equals(eastGame1Winner, original.getEastGame1Winner()))
        apiRequest.addVars("eastGame1Winner");
      if(!Objects.equals(eastGame1Loser, original.getEastGame1Loser()))
        apiRequest.addVars("eastGame1Loser");
      if(!Objects.equals(eastGame2WinnerGuess, original.getEastGame2WinnerGuess()))
        apiRequest.addVars("eastGame2WinnerGuess");
      if(!Objects.equals(eastGame2Winner, original.getEastGame2Winner()))
        apiRequest.addVars("eastGame2Winner");
      if(!Objects.equals(eastGame2Loser, original.getEastGame2Loser()))
        apiRequest.addVars("eastGame2Loser");
      if(!Objects.equals(midwestGame1WinnerGuess, original.getMidwestGame1WinnerGuess()))
        apiRequest.addVars("midwestGame1WinnerGuess");
      if(!Objects.equals(midwestGame1Winner, original.getMidwestGame1Winner()))
        apiRequest.addVars("midwestGame1Winner");
      if(!Objects.equals(midwestGame1Loser, original.getMidwestGame1Loser()))
        apiRequest.addVars("midwestGame1Loser");
      if(!Objects.equals(midwestGame2WinnerGuess, original.getMidwestGame2WinnerGuess()))
        apiRequest.addVars("midwestGame2WinnerGuess");
      if(!Objects.equals(midwestGame2Winner, original.getMidwestGame2Winner()))
        apiRequest.addVars("midwestGame2Winner");
      if(!Objects.equals(midwestGame2Loser, original.getMidwestGame2Loser()))
        apiRequest.addVars("midwestGame2Loser");
      if(!Objects.equals(eliteEight, original.getEliteEight()))
        apiRequest.addVars("eliteEight");
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
    sb.append(Optional.ofNullable(actualSweetSixteen).map(v -> "actualSweetSixteen: " + v + "\n").orElse(""));
    sb.append(Optional.ofNullable(guesserId).map(v -> "guesserId: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(year).map(v -> "year: " + v + "\n").orElse(""));
    sb.append(Optional.ofNullable(bracketId).map(v -> "bracketId: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(name).map(v -> "name: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(southGame1WinnerGuess).map(v -> "southGame1WinnerGuess: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(southGame1Winner).map(v -> "southGame1Winner: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(southGame1Loser).map(v -> "southGame1Loser: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(southGame2WinnerGuess).map(v -> "southGame2WinnerGuess: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(southGame2Winner).map(v -> "southGame2Winner: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(southGame2Loser).map(v -> "southGame2Loser: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(westGame1WinnerGuess).map(v -> "westGame1WinnerGuess: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(westGame1Winner).map(v -> "westGame1Winner: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(westGame1Loser).map(v -> "westGame1Loser: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(westGame2WinnerGuess).map(v -> "westGame2WinnerGuess: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(westGame2Winner).map(v -> "westGame2Winner: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(westGame2Loser).map(v -> "westGame2Loser: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(eastGame1WinnerGuess).map(v -> "eastGame1WinnerGuess: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(eastGame1Winner).map(v -> "eastGame1Winner: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(eastGame1Loser).map(v -> "eastGame1Loser: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(eastGame2WinnerGuess).map(v -> "eastGame2WinnerGuess: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(eastGame2Winner).map(v -> "eastGame2Winner: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(eastGame2Loser).map(v -> "eastGame2Loser: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(midwestGame1WinnerGuess).map(v -> "midwestGame1WinnerGuess: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(midwestGame1Winner).map(v -> "midwestGame1Winner: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(midwestGame1Loser).map(v -> "midwestGame1Loser: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(midwestGame2WinnerGuess).map(v -> "midwestGame2WinnerGuess: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(midwestGame2Winner).map(v -> "midwestGame2Winner: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(midwestGame2Loser).map(v -> "midwestGame2Loser: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(eliteEight).map(v -> "eliteEight: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(correctGuesses).map(v -> "correctGuesses: " + v + "\n").orElse(""));
    sb.append(Optional.ofNullable(incorrectGuesses).map(v -> "incorrectGuesses: " + v + "\n").orElse(""));
    return sb.toString();
  }

  public static final String CLASS_SIMPLE_NAME = "SweetSixteen";
  public static final String CLASS_CANONICAL_NAME = "org.computate.spinechamp.model.sweetsixteen.SweetSixteen";
  public static final String CLASS_AUTH_RESOURCE = "SWEETSIXTEEN";
  public static final String CLASS_API_ADDRESS_SweetSixteen = "spine-champ-enUS-SweetSixteen";
  public static String getClassApiAddress() {
    return CLASS_API_ADDRESS_SweetSixteen;
  }
  public static final String VAR_actualSweetSixteenSearch = "actualSweetSixteenSearch";
  public static final String SET_actualSweetSixteenSearch = "setActualSweetSixteenSearch";
  public static final String VAR_actualSweetSixteen = "actualSweetSixteen";
  public static final String SET_actualSweetSixteen = "setActualSweetSixteen";
  public static final String VAR_guesserId = "guesserId";
  public static final String SET_guesserId = "setGuesserId";
  public static final String VAR_year = "year";
  public static final String SET_year = "setYear";
  public static final String VAR_bracketId = "bracketId";
  public static final String SET_bracketId = "setBracketId";
  public static final String VAR_name = "name";
  public static final String SET_name = "setName";
  public static final String VAR_southGame1WinnerGuess = "southGame1WinnerGuess";
  public static final String SET_southGame1WinnerGuess = "setSouthGame1WinnerGuess";
  public static final String VAR_southGame1Winner = "southGame1Winner";
  public static final String SET_southGame1Winner = "setSouthGame1Winner";
  public static final String VAR_southGame1Loser = "southGame1Loser";
  public static final String SET_southGame1Loser = "setSouthGame1Loser";
  public static final String VAR_southGame2WinnerGuess = "southGame2WinnerGuess";
  public static final String SET_southGame2WinnerGuess = "setSouthGame2WinnerGuess";
  public static final String VAR_southGame2Winner = "southGame2Winner";
  public static final String SET_southGame2Winner = "setSouthGame2Winner";
  public static final String VAR_southGame2Loser = "southGame2Loser";
  public static final String SET_southGame2Loser = "setSouthGame2Loser";
  public static final String VAR_westGame1WinnerGuess = "westGame1WinnerGuess";
  public static final String SET_westGame1WinnerGuess = "setWestGame1WinnerGuess";
  public static final String VAR_westGame1Winner = "westGame1Winner";
  public static final String SET_westGame1Winner = "setWestGame1Winner";
  public static final String VAR_westGame1Loser = "westGame1Loser";
  public static final String SET_westGame1Loser = "setWestGame1Loser";
  public static final String VAR_westGame2WinnerGuess = "westGame2WinnerGuess";
  public static final String SET_westGame2WinnerGuess = "setWestGame2WinnerGuess";
  public static final String VAR_westGame2Winner = "westGame2Winner";
  public static final String SET_westGame2Winner = "setWestGame2Winner";
  public static final String VAR_westGame2Loser = "westGame2Loser";
  public static final String SET_westGame2Loser = "setWestGame2Loser";
  public static final String VAR_eastGame1WinnerGuess = "eastGame1WinnerGuess";
  public static final String SET_eastGame1WinnerGuess = "setEastGame1WinnerGuess";
  public static final String VAR_eastGame1Winner = "eastGame1Winner";
  public static final String SET_eastGame1Winner = "setEastGame1Winner";
  public static final String VAR_eastGame1Loser = "eastGame1Loser";
  public static final String SET_eastGame1Loser = "setEastGame1Loser";
  public static final String VAR_eastGame2WinnerGuess = "eastGame2WinnerGuess";
  public static final String SET_eastGame2WinnerGuess = "setEastGame2WinnerGuess";
  public static final String VAR_eastGame2Winner = "eastGame2Winner";
  public static final String SET_eastGame2Winner = "setEastGame2Winner";
  public static final String VAR_eastGame2Loser = "eastGame2Loser";
  public static final String SET_eastGame2Loser = "setEastGame2Loser";
  public static final String VAR_midwestGame1WinnerGuess = "midwestGame1WinnerGuess";
  public static final String SET_midwestGame1WinnerGuess = "setMidwestGame1WinnerGuess";
  public static final String VAR_midwestGame1Winner = "midwestGame1Winner";
  public static final String SET_midwestGame1Winner = "setMidwestGame1Winner";
  public static final String VAR_midwestGame1Loser = "midwestGame1Loser";
  public static final String SET_midwestGame1Loser = "setMidwestGame1Loser";
  public static final String VAR_midwestGame2WinnerGuess = "midwestGame2WinnerGuess";
  public static final String SET_midwestGame2WinnerGuess = "setMidwestGame2WinnerGuess";
  public static final String VAR_midwestGame2Winner = "midwestGame2Winner";
  public static final String SET_midwestGame2Winner = "setMidwestGame2Winner";
  public static final String VAR_midwestGame2Loser = "midwestGame2Loser";
  public static final String SET_midwestGame2Loser = "setMidwestGame2Loser";
  public static final String VAR_eliteEight = "eliteEight";
  public static final String SET_eliteEight = "setEliteEight";
  public static final String VAR_correctGuesses = "correctGuesses";
  public static final String SET_correctGuesses = "setCorrectGuesses";
  public static final String VAR_incorrectGuesses = "incorrectGuesses";
  public static final String SET_incorrectGuesses = "setIncorrectGuesses";

  public static List<String> varsQForClass() {
    return SweetSixteen.varsQSweetSixteen(new ArrayList<String>());
  }
  public static List<String> varsQSweetSixteen(List<String> vars) {
    BaseModel.varsQBaseModel(vars);
    return vars;
  }

  public static List<String> varsFqForClass() {
    return SweetSixteen.varsFqSweetSixteen(new ArrayList<String>());
  }
  public static List<String> varsFqSweetSixteen(List<String> vars) {
    BaseModel.varsFqBaseModel(vars);
    return vars;
  }

  public static List<String> varsRangeForClass() {
    return SweetSixteen.varsRangeSweetSixteen(new ArrayList<String>());
  }
  public static List<String> varsRangeSweetSixteen(List<String> vars) {
    BaseModel.varsRangeBaseModel(vars);
    return vars;
  }

  public static final String DISPLAY_NAME_actualSweetSixteenSearch = "";
  public static final String DISPLAY_NAME_actualSweetSixteen = "Actual Sweet Sixteen bracket";
  public static final String DISPLAY_NAME_guesserId = "guesser";
  public static final String DISPLAY_NAME_year = "year";
  public static final String DISPLAY_NAME_bracketId = "bracket ID";
  public static final String DISPLAY_NAME_name = "bracket name";
  public static final String DISPLAY_NAME_southGame1WinnerGuess = "South game 1 guess";
  public static final String DISPLAY_NAME_southGame1Winner = "South game 1 winner";
  public static final String DISPLAY_NAME_southGame1Loser = "South game 1 loser";
  public static final String DISPLAY_NAME_southGame2WinnerGuess = "Actual South game 2 winner";
  public static final String DISPLAY_NAME_southGame2Winner = "South game 2 winner";
  public static final String DISPLAY_NAME_southGame2Loser = "South game 2 loser";
  public static final String DISPLAY_NAME_westGame1WinnerGuess = "Actual West game 1 winner";
  public static final String DISPLAY_NAME_westGame1Winner = "West game 1 winner";
  public static final String DISPLAY_NAME_westGame1Loser = "West game 1 loser";
  public static final String DISPLAY_NAME_westGame2WinnerGuess = "Actual West game 2 winner";
  public static final String DISPLAY_NAME_westGame2Winner = "West game 2 winner";
  public static final String DISPLAY_NAME_westGame2Loser = "West game 2 loser";
  public static final String DISPLAY_NAME_eastGame1WinnerGuess = "Actual East game 1 winner";
  public static final String DISPLAY_NAME_eastGame1Winner = "East game 1 winner";
  public static final String DISPLAY_NAME_eastGame1Loser = "East game 1 loser";
  public static final String DISPLAY_NAME_eastGame2WinnerGuess = "Actual East game 2 winner";
  public static final String DISPLAY_NAME_eastGame2Winner = "East game 2 winner";
  public static final String DISPLAY_NAME_eastGame2Loser = "East game 2 loser";
  public static final String DISPLAY_NAME_midwestGame1WinnerGuess = "Actual Midwest game 1 winner";
  public static final String DISPLAY_NAME_midwestGame1Winner = "Midwest game 1 winner";
  public static final String DISPLAY_NAME_midwestGame1Loser = "Midwest game 1 loser";
  public static final String DISPLAY_NAME_midwestGame2WinnerGuess = "Actual Midwest game 2 winner";
  public static final String DISPLAY_NAME_midwestGame2Winner = "Midwest game 2 winner";
  public static final String DISPLAY_NAME_midwestGame2Loser = "Midwest game 2 loser";
  public static final String DISPLAY_NAME_eliteEight = "Elite Eight bracket";
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
    return SweetSixteen.NameAdjectiveSingular_enUS;
  }

  @Override
  public String enUSStringFormatUrlEditPageForClass() {
    return "%s/en-us/edit/sweet-sixteen/%s";
  }

  public static String varJsonForClass(String var, Boolean patch) {
    return SweetSixteen.varJsonSweetSixteen(var, patch);
  }
  public static String varJsonSweetSixteen(String var, Boolean patch) {
    switch(var) {
    case VAR_actualSweetSixteenSearch:
      return patch ? SET_actualSweetSixteenSearch : VAR_actualSweetSixteenSearch;
    case VAR_actualSweetSixteen:
      return patch ? SET_actualSweetSixteen : VAR_actualSweetSixteen;
    case VAR_guesserId:
      return patch ? SET_guesserId : VAR_guesserId;
    case VAR_year:
      return patch ? SET_year : VAR_year;
    case VAR_bracketId:
      return patch ? SET_bracketId : VAR_bracketId;
    case VAR_name:
      return patch ? SET_name : VAR_name;
    case VAR_southGame1WinnerGuess:
      return patch ? SET_southGame1WinnerGuess : VAR_southGame1WinnerGuess;
    case VAR_southGame1Winner:
      return patch ? SET_southGame1Winner : VAR_southGame1Winner;
    case VAR_southGame1Loser:
      return patch ? SET_southGame1Loser : VAR_southGame1Loser;
    case VAR_southGame2WinnerGuess:
      return patch ? SET_southGame2WinnerGuess : VAR_southGame2WinnerGuess;
    case VAR_southGame2Winner:
      return patch ? SET_southGame2Winner : VAR_southGame2Winner;
    case VAR_southGame2Loser:
      return patch ? SET_southGame2Loser : VAR_southGame2Loser;
    case VAR_westGame1WinnerGuess:
      return patch ? SET_westGame1WinnerGuess : VAR_westGame1WinnerGuess;
    case VAR_westGame1Winner:
      return patch ? SET_westGame1Winner : VAR_westGame1Winner;
    case VAR_westGame1Loser:
      return patch ? SET_westGame1Loser : VAR_westGame1Loser;
    case VAR_westGame2WinnerGuess:
      return patch ? SET_westGame2WinnerGuess : VAR_westGame2WinnerGuess;
    case VAR_westGame2Winner:
      return patch ? SET_westGame2Winner : VAR_westGame2Winner;
    case VAR_westGame2Loser:
      return patch ? SET_westGame2Loser : VAR_westGame2Loser;
    case VAR_eastGame1WinnerGuess:
      return patch ? SET_eastGame1WinnerGuess : VAR_eastGame1WinnerGuess;
    case VAR_eastGame1Winner:
      return patch ? SET_eastGame1Winner : VAR_eastGame1Winner;
    case VAR_eastGame1Loser:
      return patch ? SET_eastGame1Loser : VAR_eastGame1Loser;
    case VAR_eastGame2WinnerGuess:
      return patch ? SET_eastGame2WinnerGuess : VAR_eastGame2WinnerGuess;
    case VAR_eastGame2Winner:
      return patch ? SET_eastGame2Winner : VAR_eastGame2Winner;
    case VAR_eastGame2Loser:
      return patch ? SET_eastGame2Loser : VAR_eastGame2Loser;
    case VAR_midwestGame1WinnerGuess:
      return patch ? SET_midwestGame1WinnerGuess : VAR_midwestGame1WinnerGuess;
    case VAR_midwestGame1Winner:
      return patch ? SET_midwestGame1Winner : VAR_midwestGame1Winner;
    case VAR_midwestGame1Loser:
      return patch ? SET_midwestGame1Loser : VAR_midwestGame1Loser;
    case VAR_midwestGame2WinnerGuess:
      return patch ? SET_midwestGame2WinnerGuess : VAR_midwestGame2WinnerGuess;
    case VAR_midwestGame2Winner:
      return patch ? SET_midwestGame2Winner : VAR_midwestGame2Winner;
    case VAR_midwestGame2Loser:
      return patch ? SET_midwestGame2Loser : VAR_midwestGame2Loser;
    case VAR_eliteEight:
      return patch ? SET_eliteEight : VAR_eliteEight;
    case VAR_correctGuesses:
      return patch ? SET_correctGuesses : VAR_correctGuesses;
    case VAR_incorrectGuesses:
      return patch ? SET_incorrectGuesses : VAR_incorrectGuesses;
    default:
      return BaseModel.varJsonBaseModel(var, patch);
    }
  }

  public static String displayNameForClass(String var) {
    return SweetSixteen.displayNameSweetSixteen(var);
  }
  public static String displayNameSweetSixteen(String var) {
    switch(var) {
    case VAR_actualSweetSixteenSearch:
      return DISPLAY_NAME_actualSweetSixteenSearch;
    case VAR_actualSweetSixteen:
      return DISPLAY_NAME_actualSweetSixteen;
    case VAR_guesserId:
      return DISPLAY_NAME_guesserId;
    case VAR_year:
      return DISPLAY_NAME_year;
    case VAR_bracketId:
      return DISPLAY_NAME_bracketId;
    case VAR_name:
      return DISPLAY_NAME_name;
    case VAR_southGame1WinnerGuess:
      return DISPLAY_NAME_southGame1WinnerGuess;
    case VAR_southGame1Winner:
      return DISPLAY_NAME_southGame1Winner;
    case VAR_southGame1Loser:
      return DISPLAY_NAME_southGame1Loser;
    case VAR_southGame2WinnerGuess:
      return DISPLAY_NAME_southGame2WinnerGuess;
    case VAR_southGame2Winner:
      return DISPLAY_NAME_southGame2Winner;
    case VAR_southGame2Loser:
      return DISPLAY_NAME_southGame2Loser;
    case VAR_westGame1WinnerGuess:
      return DISPLAY_NAME_westGame1WinnerGuess;
    case VAR_westGame1Winner:
      return DISPLAY_NAME_westGame1Winner;
    case VAR_westGame1Loser:
      return DISPLAY_NAME_westGame1Loser;
    case VAR_westGame2WinnerGuess:
      return DISPLAY_NAME_westGame2WinnerGuess;
    case VAR_westGame2Winner:
      return DISPLAY_NAME_westGame2Winner;
    case VAR_westGame2Loser:
      return DISPLAY_NAME_westGame2Loser;
    case VAR_eastGame1WinnerGuess:
      return DISPLAY_NAME_eastGame1WinnerGuess;
    case VAR_eastGame1Winner:
      return DISPLAY_NAME_eastGame1Winner;
    case VAR_eastGame1Loser:
      return DISPLAY_NAME_eastGame1Loser;
    case VAR_eastGame2WinnerGuess:
      return DISPLAY_NAME_eastGame2WinnerGuess;
    case VAR_eastGame2Winner:
      return DISPLAY_NAME_eastGame2Winner;
    case VAR_eastGame2Loser:
      return DISPLAY_NAME_eastGame2Loser;
    case VAR_midwestGame1WinnerGuess:
      return DISPLAY_NAME_midwestGame1WinnerGuess;
    case VAR_midwestGame1Winner:
      return DISPLAY_NAME_midwestGame1Winner;
    case VAR_midwestGame1Loser:
      return DISPLAY_NAME_midwestGame1Loser;
    case VAR_midwestGame2WinnerGuess:
      return DISPLAY_NAME_midwestGame2WinnerGuess;
    case VAR_midwestGame2Winner:
      return DISPLAY_NAME_midwestGame2Winner;
    case VAR_midwestGame2Loser:
      return DISPLAY_NAME_midwestGame2Loser;
    case VAR_eliteEight:
      return DISPLAY_NAME_eliteEight;
    case VAR_correctGuesses:
      return DISPLAY_NAME_correctGuesses;
    case VAR_incorrectGuesses:
      return DISPLAY_NAME_incorrectGuesses;
    default:
      return BaseModel.displayNameBaseModel(var);
    }
  }

  public static String descriptionSweetSixteen(String var) {
    if(var == null)
      return null;
    switch(var) {
    case VAR_actualSweetSixteen:
      return "The Sweet Sixteen bracket of this tournament";
    case VAR_guesserId:
      return "The ID of this guesser";
    case VAR_year:
      return "The year of the tournament";
    case VAR_bracketId:
      return "The ID of this bracket";
    case VAR_name:
      return "The name of this bracket";
    case VAR_eliteEight:
      return "The Elite Eight bracket of this tournament";
    case VAR_correctGuesses:
      return "The number of correct guesses in this Championship bracket";
    case VAR_incorrectGuesses:
      return "The number of incorrect guesses in this Championship bracket";
      default:
        return BaseModel.descriptionBaseModel(var);
    }
  }

  public static String classSimpleNameSweetSixteen(String var) {
    switch(var) {
    case VAR_actualSweetSixteenSearch:
      return "SearchList";
    case VAR_actualSweetSixteen:
      return "JsonObject";
    case VAR_guesserId:
      return "String";
    case VAR_year:
      return "Integer";
    case VAR_bracketId:
      return "String";
    case VAR_name:
      return "String";
    case VAR_southGame1WinnerGuess:
      return "String";
    case VAR_southGame1Winner:
      return "String";
    case VAR_southGame1Loser:
      return "String";
    case VAR_southGame2WinnerGuess:
      return "String";
    case VAR_southGame2Winner:
      return "String";
    case VAR_southGame2Loser:
      return "String";
    case VAR_westGame1WinnerGuess:
      return "String";
    case VAR_westGame1Winner:
      return "String";
    case VAR_westGame1Loser:
      return "String";
    case VAR_westGame2WinnerGuess:
      return "String";
    case VAR_westGame2Winner:
      return "String";
    case VAR_westGame2Loser:
      return "String";
    case VAR_eastGame1WinnerGuess:
      return "String";
    case VAR_eastGame1Winner:
      return "String";
    case VAR_eastGame1Loser:
      return "String";
    case VAR_eastGame2WinnerGuess:
      return "String";
    case VAR_eastGame2Winner:
      return "String";
    case VAR_eastGame2Loser:
      return "String";
    case VAR_midwestGame1WinnerGuess:
      return "String";
    case VAR_midwestGame1Winner:
      return "String";
    case VAR_midwestGame1Loser:
      return "String";
    case VAR_midwestGame2WinnerGuess:
      return "String";
    case VAR_midwestGame2Winner:
      return "String";
    case VAR_midwestGame2Loser:
      return "String";
    case VAR_eliteEight:
      return "String";
    case VAR_correctGuesses:
      return "Integer";
    case VAR_incorrectGuesses:
      return "Integer";
      default:
        return BaseModel.classSimpleNameBaseModel(var);
    }
  }

  public static Integer htmColumnSweetSixteen(String var) {
    switch(var) {
    case VAR_guesserId:
      return 0;
    case VAR_year:
      return 1;
      default:
        return BaseModel.htmColumnBaseModel(var);
    }
  }

  public static Integer htmRowSweetSixteen(String var) {
    switch(var) {
    case VAR_guesserId:
      return 3;
    case VAR_year:
      return 3;
    case VAR_southGame1WinnerGuess:
      return 5;
    case VAR_southGame1Winner:
      return 5;
    case VAR_southGame1Loser:
      return 5;
    case VAR_southGame2WinnerGuess:
      return 6;
    case VAR_southGame2Winner:
      return 6;
    case VAR_southGame2Loser:
      return 6;
    case VAR_westGame1WinnerGuess:
      return 7;
    case VAR_westGame1Winner:
      return 7;
    case VAR_westGame1Loser:
      return 7;
    case VAR_westGame2WinnerGuess:
      return 8;
    case VAR_westGame2Winner:
      return 8;
    case VAR_westGame2Loser:
      return 8;
    case VAR_eastGame1WinnerGuess:
      return 9;
    case VAR_eastGame1Winner:
      return 9;
    case VAR_eastGame1Loser:
      return 9;
    case VAR_eastGame2WinnerGuess:
      return 10;
    case VAR_eastGame2Winner:
      return 10;
    case VAR_eastGame2Loser:
      return 10;
    case VAR_midwestGame1WinnerGuess:
      return 11;
    case VAR_midwestGame1Winner:
      return 11;
    case VAR_midwestGame1Loser:
      return 11;
    case VAR_midwestGame2WinnerGuess:
      return 12;
    case VAR_midwestGame2Winner:
      return 12;
    case VAR_midwestGame2Loser:
      return 12;
    case VAR_eliteEight:
      return 20;
    case VAR_correctGuesses:
      return 4;
    case VAR_incorrectGuesses:
      return 4;
      default:
        return BaseModel.htmRowBaseModel(var);
    }
  }

  public static Integer htmCellSweetSixteen(String var) {
    switch(var) {
    case VAR_guesserId:
      return 0;
    case VAR_year:
      return 1;
    case VAR_southGame1WinnerGuess:
      return 0;
    case VAR_southGame1Winner:
      return 1;
    case VAR_southGame1Loser:
      return 2;
    case VAR_southGame2WinnerGuess:
      return 0;
    case VAR_southGame2Winner:
      return 1;
    case VAR_southGame2Loser:
      return 2;
    case VAR_westGame1WinnerGuess:
      return 0;
    case VAR_westGame1Winner:
      return 1;
    case VAR_westGame1Loser:
      return 2;
    case VAR_westGame2WinnerGuess:
      return 0;
    case VAR_westGame2Winner:
      return 0;
    case VAR_westGame2Loser:
      return 1;
    case VAR_eastGame1WinnerGuess:
      return 0;
    case VAR_eastGame1Winner:
      return 1;
    case VAR_eastGame1Loser:
      return 2;
    case VAR_eastGame2WinnerGuess:
      return 0;
    case VAR_eastGame2Winner:
      return 1;
    case VAR_eastGame2Loser:
      return 2;
    case VAR_midwestGame1WinnerGuess:
      return 0;
    case VAR_midwestGame1Winner:
      return 1;
    case VAR_midwestGame1Loser:
      return 2;
    case VAR_midwestGame2WinnerGuess:
      return 0;
    case VAR_midwestGame2Winner:
      return 1;
    case VAR_midwestGame2Loser:
      return 2;
    case VAR_eliteEight:
      return 0;
    case VAR_correctGuesses:
      return 2;
    case VAR_incorrectGuesses:
      return 3;
      default:
        return BaseModel.htmCellBaseModel(var);
    }
  }

  public static Integer lengthMinSweetSixteen(String var) {
    switch(var) {
      default:
        return BaseModel.lengthMinBaseModel(var);
    }
  }

  public static Integer lengthMaxSweetSixteen(String var) {
    switch(var) {
      default:
        return BaseModel.lengthMaxBaseModel(var);
    }
  }

  public static Integer maxSweetSixteen(String var) {
    switch(var) {
      default:
        return BaseModel.maxBaseModel(var);
    }
  }

  public static Integer minSweetSixteen(String var) {
    switch(var) {
      default:
        return BaseModel.minBaseModel(var);
    }
  }
}
