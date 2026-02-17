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
import java.lang.String;
import org.computate.spinechamp.model.guesser.Guesser;
import java.lang.Integer;
import org.computate.spinechamp.model.team.Team;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
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
        guesserIdInit();
        yearInit();
        bracketIdInit();
        nameInit();
        southGame1WinnerInit();
        southGame1LoserInit();
        southGame2WinnerInit();
        southGame2LoserInit();
        westGame1WinnerInit();
        westGame1LoserInit();
        westGame2WinnerInit();
        westGame2LoserInit();
        eastGame1WinnerInit();
        eastGame1LoserInit();
        eastGame2WinnerInit();
        eastGame2LoserInit();
        midwestGame1WinnerInit();
        midwestGame1LoserInit();
        midwestGame2WinnerInit();
        midwestGame2LoserInit();
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
      case "guesserId":
        return oSweetSixteen.guesserId;
      case "year":
        return oSweetSixteen.year;
      case "bracketId":
        return oSweetSixteen.bracketId;
      case "name":
        return oSweetSixteen.name;
      case "southGame1Winner":
        return oSweetSixteen.southGame1Winner;
      case "southGame1Loser":
        return oSweetSixteen.southGame1Loser;
      case "southGame2Winner":
        return oSweetSixteen.southGame2Winner;
      case "southGame2Loser":
        return oSweetSixteen.southGame2Loser;
      case "westGame1Winner":
        return oSweetSixteen.westGame1Winner;
      case "westGame1Loser":
        return oSweetSixteen.westGame1Loser;
      case "westGame2Winner":
        return oSweetSixteen.westGame2Winner;
      case "westGame2Loser":
        return oSweetSixteen.westGame2Loser;
      case "eastGame1Winner":
        return oSweetSixteen.eastGame1Winner;
      case "eastGame1Loser":
        return oSweetSixteen.eastGame1Loser;
      case "eastGame2Winner":
        return oSweetSixteen.eastGame2Winner;
      case "eastGame2Loser":
        return oSweetSixteen.eastGame2Loser;
      case "midwestGame1Winner":
        return oSweetSixteen.midwestGame1Winner;
      case "midwestGame1Loser":
        return oSweetSixteen.midwestGame1Loser;
      case "midwestGame2Winner":
        return oSweetSixteen.midwestGame2Winner;
      case "midwestGame2Loser":
        return oSweetSixteen.midwestGame2Loser;
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
    case "guesserId":
      return SweetSixteen.staticSetGuesserId(siteRequest_, v);
    case "year":
      return SweetSixteen.staticSetYear(siteRequest_, v);
    case "bracketId":
      return SweetSixteen.staticSetBracketId(siteRequest_, v);
    case "name":
      return SweetSixteen.staticSetName(siteRequest_, v);
    case "southGame1Winner":
      return SweetSixteen.staticSetSouthGame1Winner(siteRequest_, v);
    case "southGame1Loser":
      return SweetSixteen.staticSetSouthGame1Loser(siteRequest_, v);
    case "southGame2Winner":
      return SweetSixteen.staticSetSouthGame2Winner(siteRequest_, v);
    case "southGame2Loser":
      return SweetSixteen.staticSetSouthGame2Loser(siteRequest_, v);
    case "westGame1Winner":
      return SweetSixteen.staticSetWestGame1Winner(siteRequest_, v);
    case "westGame1Loser":
      return SweetSixteen.staticSetWestGame1Loser(siteRequest_, v);
    case "westGame2Winner":
      return SweetSixteen.staticSetWestGame2Winner(siteRequest_, v);
    case "westGame2Loser":
      return SweetSixteen.staticSetWestGame2Loser(siteRequest_, v);
    case "eastGame1Winner":
      return SweetSixteen.staticSetEastGame1Winner(siteRequest_, v);
    case "eastGame1Loser":
      return SweetSixteen.staticSetEastGame1Loser(siteRequest_, v);
    case "eastGame2Winner":
      return SweetSixteen.staticSetEastGame2Winner(siteRequest_, v);
    case "eastGame2Loser":
      return SweetSixteen.staticSetEastGame2Loser(siteRequest_, v);
    case "midwestGame1Winner":
      return SweetSixteen.staticSetMidwestGame1Winner(siteRequest_, v);
    case "midwestGame1Loser":
      return SweetSixteen.staticSetMidwestGame1Loser(siteRequest_, v);
    case "midwestGame2Winner":
      return SweetSixteen.staticSetMidwestGame2Winner(siteRequest_, v);
    case "midwestGame2Loser":
      return SweetSixteen.staticSetMidwestGame2Loser(siteRequest_, v);
      default:
        return BaseModel.staticSetBaseModel(entityVar,  siteRequest_, v, o);
    }
  }

  ////////////////
  // staticSearch //
  ////////////////

  public static Object staticSearchForClass(String entityVar, SiteRequest siteRequest_, Object o) {
    return staticSearchSweetSixteen(entityVar,  siteRequest_, o);
  }
  public static Object staticSearchSweetSixteen(String entityVar, SiteRequest siteRequest_, Object o) {
    switch(entityVar) {
    case "guesserId":
      return SweetSixteen.staticSearchGuesserId(siteRequest_, (String)o);
    case "year":
      return SweetSixteen.staticSearchYear(siteRequest_, (Integer)o);
    case "bracketId":
      return SweetSixteen.staticSearchBracketId(siteRequest_, (String)o);
    case "name":
      return SweetSixteen.staticSearchName(siteRequest_, (String)o);
    case "southGame1Winner":
      return SweetSixteen.staticSearchSouthGame1Winner(siteRequest_, (String)o);
    case "southGame1Loser":
      return SweetSixteen.staticSearchSouthGame1Loser(siteRequest_, (String)o);
    case "southGame2Winner":
      return SweetSixteen.staticSearchSouthGame2Winner(siteRequest_, (String)o);
    case "southGame2Loser":
      return SweetSixteen.staticSearchSouthGame2Loser(siteRequest_, (String)o);
    case "westGame1Winner":
      return SweetSixteen.staticSearchWestGame1Winner(siteRequest_, (String)o);
    case "westGame1Loser":
      return SweetSixteen.staticSearchWestGame1Loser(siteRequest_, (String)o);
    case "westGame2Winner":
      return SweetSixteen.staticSearchWestGame2Winner(siteRequest_, (String)o);
    case "westGame2Loser":
      return SweetSixteen.staticSearchWestGame2Loser(siteRequest_, (String)o);
    case "eastGame1Winner":
      return SweetSixteen.staticSearchEastGame1Winner(siteRequest_, (String)o);
    case "eastGame1Loser":
      return SweetSixteen.staticSearchEastGame1Loser(siteRequest_, (String)o);
    case "eastGame2Winner":
      return SweetSixteen.staticSearchEastGame2Winner(siteRequest_, (String)o);
    case "eastGame2Loser":
      return SweetSixteen.staticSearchEastGame2Loser(siteRequest_, (String)o);
    case "midwestGame1Winner":
      return SweetSixteen.staticSearchMidwestGame1Winner(siteRequest_, (String)o);
    case "midwestGame1Loser":
      return SweetSixteen.staticSearchMidwestGame1Loser(siteRequest_, (String)o);
    case "midwestGame2Winner":
      return SweetSixteen.staticSearchMidwestGame2Winner(siteRequest_, (String)o);
    case "midwestGame2Loser":
      return SweetSixteen.staticSearchMidwestGame2Loser(siteRequest_, (String)o);
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
    case "guesserId":
      return SweetSixteen.staticSearchStrGuesserId(siteRequest_, (String)o);
    case "year":
      return SweetSixteen.staticSearchStrYear(siteRequest_, (Integer)o);
    case "bracketId":
      return SweetSixteen.staticSearchStrBracketId(siteRequest_, (String)o);
    case "name":
      return SweetSixteen.staticSearchStrName(siteRequest_, (String)o);
    case "southGame1Winner":
      return SweetSixteen.staticSearchStrSouthGame1Winner(siteRequest_, (String)o);
    case "southGame1Loser":
      return SweetSixteen.staticSearchStrSouthGame1Loser(siteRequest_, (String)o);
    case "southGame2Winner":
      return SweetSixteen.staticSearchStrSouthGame2Winner(siteRequest_, (String)o);
    case "southGame2Loser":
      return SweetSixteen.staticSearchStrSouthGame2Loser(siteRequest_, (String)o);
    case "westGame1Winner":
      return SweetSixteen.staticSearchStrWestGame1Winner(siteRequest_, (String)o);
    case "westGame1Loser":
      return SweetSixteen.staticSearchStrWestGame1Loser(siteRequest_, (String)o);
    case "westGame2Winner":
      return SweetSixteen.staticSearchStrWestGame2Winner(siteRequest_, (String)o);
    case "westGame2Loser":
      return SweetSixteen.staticSearchStrWestGame2Loser(siteRequest_, (String)o);
    case "eastGame1Winner":
      return SweetSixteen.staticSearchStrEastGame1Winner(siteRequest_, (String)o);
    case "eastGame1Loser":
      return SweetSixteen.staticSearchStrEastGame1Loser(siteRequest_, (String)o);
    case "eastGame2Winner":
      return SweetSixteen.staticSearchStrEastGame2Winner(siteRequest_, (String)o);
    case "eastGame2Loser":
      return SweetSixteen.staticSearchStrEastGame2Loser(siteRequest_, (String)o);
    case "midwestGame1Winner":
      return SweetSixteen.staticSearchStrMidwestGame1Winner(siteRequest_, (String)o);
    case "midwestGame1Loser":
      return SweetSixteen.staticSearchStrMidwestGame1Loser(siteRequest_, (String)o);
    case "midwestGame2Winner":
      return SweetSixteen.staticSearchStrMidwestGame2Winner(siteRequest_, (String)o);
    case "midwestGame2Loser":
      return SweetSixteen.staticSearchStrMidwestGame2Loser(siteRequest_, (String)o);
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
    case "guesserId":
      return SweetSixteen.staticSearchFqGuesserId(siteRequest_, o);
    case "year":
      return SweetSixteen.staticSearchFqYear(siteRequest_, o);
    case "bracketId":
      return SweetSixteen.staticSearchFqBracketId(siteRequest_, o);
    case "name":
      return SweetSixteen.staticSearchFqName(siteRequest_, o);
    case "southGame1Winner":
      return SweetSixteen.staticSearchFqSouthGame1Winner(siteRequest_, o);
    case "southGame1Loser":
      return SweetSixteen.staticSearchFqSouthGame1Loser(siteRequest_, o);
    case "southGame2Winner":
      return SweetSixteen.staticSearchFqSouthGame2Winner(siteRequest_, o);
    case "southGame2Loser":
      return SweetSixteen.staticSearchFqSouthGame2Loser(siteRequest_, o);
    case "westGame1Winner":
      return SweetSixteen.staticSearchFqWestGame1Winner(siteRequest_, o);
    case "westGame1Loser":
      return SweetSixteen.staticSearchFqWestGame1Loser(siteRequest_, o);
    case "westGame2Winner":
      return SweetSixteen.staticSearchFqWestGame2Winner(siteRequest_, o);
    case "westGame2Loser":
      return SweetSixteen.staticSearchFqWestGame2Loser(siteRequest_, o);
    case "eastGame1Winner":
      return SweetSixteen.staticSearchFqEastGame1Winner(siteRequest_, o);
    case "eastGame1Loser":
      return SweetSixteen.staticSearchFqEastGame1Loser(siteRequest_, o);
    case "eastGame2Winner":
      return SweetSixteen.staticSearchFqEastGame2Winner(siteRequest_, o);
    case "eastGame2Loser":
      return SweetSixteen.staticSearchFqEastGame2Loser(siteRequest_, o);
    case "midwestGame1Winner":
      return SweetSixteen.staticSearchFqMidwestGame1Winner(siteRequest_, o);
    case "midwestGame1Loser":
      return SweetSixteen.staticSearchFqMidwestGame1Loser(siteRequest_, o);
    case "midwestGame2Winner":
      return SweetSixteen.staticSearchFqMidwestGame2Winner(siteRequest_, o);
    case "midwestGame2Loser":
      return SweetSixteen.staticSearchFqMidwestGame2Loser(siteRequest_, o);
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

      String southGame1Winner = (String)doc.get("southGame1Winner_docvalues_string");
      if(southGame1Winner != null)
        oSweetSixteen.setSouthGame1Winner(southGame1Winner);

      String southGame1Loser = (String)doc.get("southGame1Loser_docvalues_string");
      if(southGame1Loser != null)
        oSweetSixteen.setSouthGame1Loser(southGame1Loser);

      String southGame2Winner = (String)doc.get("southGame2Winner_docvalues_string");
      if(southGame2Winner != null)
        oSweetSixteen.setSouthGame2Winner(southGame2Winner);

      String southGame2Loser = (String)doc.get("southGame2Loser_docvalues_string");
      if(southGame2Loser != null)
        oSweetSixteen.setSouthGame2Loser(southGame2Loser);

      String westGame1Winner = (String)doc.get("westGame1Winner_docvalues_string");
      if(westGame1Winner != null)
        oSweetSixteen.setWestGame1Winner(westGame1Winner);

      String westGame1Loser = (String)doc.get("westGame1Loser_docvalues_string");
      if(westGame1Loser != null)
        oSweetSixteen.setWestGame1Loser(westGame1Loser);

      String westGame2Winner = (String)doc.get("westGame2Winner_docvalues_string");
      if(westGame2Winner != null)
        oSweetSixteen.setWestGame2Winner(westGame2Winner);

      String westGame2Loser = (String)doc.get("westGame2Loser_docvalues_string");
      if(westGame2Loser != null)
        oSweetSixteen.setWestGame2Loser(westGame2Loser);

      String eastGame1Winner = (String)doc.get("eastGame1Winner_docvalues_string");
      if(eastGame1Winner != null)
        oSweetSixteen.setEastGame1Winner(eastGame1Winner);

      String eastGame1Loser = (String)doc.get("eastGame1Loser_docvalues_string");
      if(eastGame1Loser != null)
        oSweetSixteen.setEastGame1Loser(eastGame1Loser);

      String eastGame2Winner = (String)doc.get("eastGame2Winner_docvalues_string");
      if(eastGame2Winner != null)
        oSweetSixteen.setEastGame2Winner(eastGame2Winner);

      String eastGame2Loser = (String)doc.get("eastGame2Loser_docvalues_string");
      if(eastGame2Loser != null)
        oSweetSixteen.setEastGame2Loser(eastGame2Loser);

      String midwestGame1Winner = (String)doc.get("midwestGame1Winner_docvalues_string");
      if(midwestGame1Winner != null)
        oSweetSixteen.setMidwestGame1Winner(midwestGame1Winner);

      String midwestGame1Loser = (String)doc.get("midwestGame1Loser_docvalues_string");
      if(midwestGame1Loser != null)
        oSweetSixteen.setMidwestGame1Loser(midwestGame1Loser);

      String midwestGame2Winner = (String)doc.get("midwestGame2Winner_docvalues_string");
      if(midwestGame2Winner != null)
        oSweetSixteen.setMidwestGame2Winner(midwestGame2Winner);

      String midwestGame2Loser = (String)doc.get("midwestGame2Loser_docvalues_string");
      if(midwestGame2Loser != null)
        oSweetSixteen.setMidwestGame2Loser(midwestGame2Loser);
    }

    super.populateBaseModel(doc);
  }

  public void indexSweetSixteen(JsonObject doc) {
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
    if(southGame1Winner != null) {
      doc.put("southGame1Winner_docvalues_string", southGame1Winner);
    }
    if(southGame1Loser != null) {
      doc.put("southGame1Loser_docvalues_string", southGame1Loser);
    }
    if(southGame2Winner != null) {
      doc.put("southGame2Winner_docvalues_string", southGame2Winner);
    }
    if(southGame2Loser != null) {
      doc.put("southGame2Loser_docvalues_string", southGame2Loser);
    }
    if(westGame1Winner != null) {
      doc.put("westGame1Winner_docvalues_string", westGame1Winner);
    }
    if(westGame1Loser != null) {
      doc.put("westGame1Loser_docvalues_string", westGame1Loser);
    }
    if(westGame2Winner != null) {
      doc.put("westGame2Winner_docvalues_string", westGame2Winner);
    }
    if(westGame2Loser != null) {
      doc.put("westGame2Loser_docvalues_string", westGame2Loser);
    }
    if(eastGame1Winner != null) {
      doc.put("eastGame1Winner_docvalues_string", eastGame1Winner);
    }
    if(eastGame1Loser != null) {
      doc.put("eastGame1Loser_docvalues_string", eastGame1Loser);
    }
    if(eastGame2Winner != null) {
      doc.put("eastGame2Winner_docvalues_string", eastGame2Winner);
    }
    if(eastGame2Loser != null) {
      doc.put("eastGame2Loser_docvalues_string", eastGame2Loser);
    }
    if(midwestGame1Winner != null) {
      doc.put("midwestGame1Winner_docvalues_string", midwestGame1Winner);
    }
    if(midwestGame1Loser != null) {
      doc.put("midwestGame1Loser_docvalues_string", midwestGame1Loser);
    }
    if(midwestGame2Winner != null) {
      doc.put("midwestGame2Winner_docvalues_string", midwestGame2Winner);
    }
    if(midwestGame2Loser != null) {
      doc.put("midwestGame2Loser_docvalues_string", midwestGame2Loser);
    }
    super.indexBaseModel(doc);

	}

  public static String varStoredSweetSixteen(String entityVar) {
    switch(entityVar) {
      case "guesserId":
        return "guesserId_docvalues_string";
      case "year":
        return "year_docvalues_int";
      case "bracketId":
        return "bracketId_docvalues_string";
      case "name":
        return "name_docvalues_string";
      case "southGame1Winner":
        return "southGame1Winner_docvalues_string";
      case "southGame1Loser":
        return "southGame1Loser_docvalues_string";
      case "southGame2Winner":
        return "southGame2Winner_docvalues_string";
      case "southGame2Loser":
        return "southGame2Loser_docvalues_string";
      case "westGame1Winner":
        return "westGame1Winner_docvalues_string";
      case "westGame1Loser":
        return "westGame1Loser_docvalues_string";
      case "westGame2Winner":
        return "westGame2Winner_docvalues_string";
      case "westGame2Loser":
        return "westGame2Loser_docvalues_string";
      case "eastGame1Winner":
        return "eastGame1Winner_docvalues_string";
      case "eastGame1Loser":
        return "eastGame1Loser_docvalues_string";
      case "eastGame2Winner":
        return "eastGame2Winner_docvalues_string";
      case "eastGame2Loser":
        return "eastGame2Loser_docvalues_string";
      case "midwestGame1Winner":
        return "midwestGame1Winner_docvalues_string";
      case "midwestGame1Loser":
        return "midwestGame1Loser_docvalues_string";
      case "midwestGame2Winner":
        return "midwestGame2Winner_docvalues_string";
      case "midwestGame2Loser":
        return "midwestGame2Loser_docvalues_string";
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
      case "southGame1Winner":
        return "southGame1Winner_docvalues_string";
      case "southGame1Loser":
        return "southGame1Loser_docvalues_string";
      case "southGame2Winner":
        return "southGame2Winner_docvalues_string";
      case "southGame2Loser":
        return "southGame2Loser_docvalues_string";
      case "westGame1Winner":
        return "westGame1Winner_docvalues_string";
      case "westGame1Loser":
        return "westGame1Loser_docvalues_string";
      case "westGame2Winner":
        return "westGame2Winner_docvalues_string";
      case "westGame2Loser":
        return "westGame2Loser_docvalues_string";
      case "eastGame1Winner":
        return "eastGame1Winner_docvalues_string";
      case "eastGame1Loser":
        return "eastGame1Loser_docvalues_string";
      case "eastGame2Winner":
        return "eastGame2Winner_docvalues_string";
      case "eastGame2Loser":
        return "eastGame2Loser_docvalues_string";
      case "midwestGame1Winner":
        return "midwestGame1Winner_docvalues_string";
      case "midwestGame1Loser":
        return "midwestGame1Loser_docvalues_string";
      case "midwestGame2Winner":
        return "midwestGame2Winner_docvalues_string";
      case "midwestGame2Loser":
        return "midwestGame2Loser_docvalues_string";
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
      case "southGame1Winner_docvalues_string":
        return "southGame1Winner";
      case "southGame1Loser_docvalues_string":
        return "southGame1Loser";
      case "southGame2Winner_docvalues_string":
        return "southGame2Winner";
      case "southGame2Loser_docvalues_string":
        return "southGame2Loser";
      case "westGame1Winner_docvalues_string":
        return "westGame1Winner";
      case "westGame1Loser_docvalues_string":
        return "westGame1Loser";
      case "westGame2Winner_docvalues_string":
        return "westGame2Winner";
      case "westGame2Loser_docvalues_string":
        return "westGame2Loser";
      case "eastGame1Winner_docvalues_string":
        return "eastGame1Winner";
      case "eastGame1Loser_docvalues_string":
        return "eastGame1Loser";
      case "eastGame2Winner_docvalues_string":
        return "eastGame2Winner";
      case "eastGame2Loser_docvalues_string":
        return "eastGame2Loser";
      case "midwestGame1Winner_docvalues_string":
        return "midwestGame1Winner";
      case "midwestGame1Loser_docvalues_string":
        return "midwestGame1Loser";
      case "midwestGame2Winner_docvalues_string":
        return "midwestGame2Winner";
      case "midwestGame2Loser_docvalues_string":
        return "midwestGame2Loser";
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

    oSweetSixteen.setGuesserId(Optional.ofNullable(doc.get("guesserId_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setYear(Optional.ofNullable(doc.get("year_docvalues_int")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setBracketId(Optional.ofNullable(doc.get("bracketId_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setName(Optional.ofNullable(doc.get("name_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setSouthGame1Winner(Optional.ofNullable(doc.get("southGame1Winner_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setSouthGame1Loser(Optional.ofNullable(doc.get("southGame1Loser_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setSouthGame2Winner(Optional.ofNullable(doc.get("southGame2Winner_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setSouthGame2Loser(Optional.ofNullable(doc.get("southGame2Loser_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setWestGame1Winner(Optional.ofNullable(doc.get("westGame1Winner_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setWestGame1Loser(Optional.ofNullable(doc.get("westGame1Loser_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setWestGame2Winner(Optional.ofNullable(doc.get("westGame2Winner_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setWestGame2Loser(Optional.ofNullable(doc.get("westGame2Loser_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setEastGame1Winner(Optional.ofNullable(doc.get("eastGame1Winner_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setEastGame1Loser(Optional.ofNullable(doc.get("eastGame1Loser_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setEastGame2Winner(Optional.ofNullable(doc.get("eastGame2Winner_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setEastGame2Loser(Optional.ofNullable(doc.get("eastGame2Loser_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setMidwestGame1Winner(Optional.ofNullable(doc.get("midwestGame1Winner_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setMidwestGame1Loser(Optional.ofNullable(doc.get("midwestGame1Loser_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setMidwestGame2Winner(Optional.ofNullable(doc.get("midwestGame2Winner_docvalues_string")).map(v -> v.toString()).orElse(null));
    oSweetSixteen.setMidwestGame2Loser(Optional.ofNullable(doc.get("midwestGame2Loser_docvalues_string")).map(v -> v.toString()).orElse(null));

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
      if(!Objects.equals(guesserId, original.getGuesserId()))
        apiRequest.addVars("guesserId");
      if(!Objects.equals(year, original.getYear()))
        apiRequest.addVars("year");
      if(!Objects.equals(bracketId, original.getBracketId()))
        apiRequest.addVars("bracketId");
      if(!Objects.equals(name, original.getName()))
        apiRequest.addVars("name");
      if(!Objects.equals(southGame1Winner, original.getSouthGame1Winner()))
        apiRequest.addVars("southGame1Winner");
      if(!Objects.equals(southGame1Loser, original.getSouthGame1Loser()))
        apiRequest.addVars("southGame1Loser");
      if(!Objects.equals(southGame2Winner, original.getSouthGame2Winner()))
        apiRequest.addVars("southGame2Winner");
      if(!Objects.equals(southGame2Loser, original.getSouthGame2Loser()))
        apiRequest.addVars("southGame2Loser");
      if(!Objects.equals(westGame1Winner, original.getWestGame1Winner()))
        apiRequest.addVars("westGame1Winner");
      if(!Objects.equals(westGame1Loser, original.getWestGame1Loser()))
        apiRequest.addVars("westGame1Loser");
      if(!Objects.equals(westGame2Winner, original.getWestGame2Winner()))
        apiRequest.addVars("westGame2Winner");
      if(!Objects.equals(westGame2Loser, original.getWestGame2Loser()))
        apiRequest.addVars("westGame2Loser");
      if(!Objects.equals(eastGame1Winner, original.getEastGame1Winner()))
        apiRequest.addVars("eastGame1Winner");
      if(!Objects.equals(eastGame1Loser, original.getEastGame1Loser()))
        apiRequest.addVars("eastGame1Loser");
      if(!Objects.equals(eastGame2Winner, original.getEastGame2Winner()))
        apiRequest.addVars("eastGame2Winner");
      if(!Objects.equals(eastGame2Loser, original.getEastGame2Loser()))
        apiRequest.addVars("eastGame2Loser");
      if(!Objects.equals(midwestGame1Winner, original.getMidwestGame1Winner()))
        apiRequest.addVars("midwestGame1Winner");
      if(!Objects.equals(midwestGame1Loser, original.getMidwestGame1Loser()))
        apiRequest.addVars("midwestGame1Loser");
      if(!Objects.equals(midwestGame2Winner, original.getMidwestGame2Winner()))
        apiRequest.addVars("midwestGame2Winner");
      if(!Objects.equals(midwestGame2Loser, original.getMidwestGame2Loser()))
        apiRequest.addVars("midwestGame2Loser");
      super.apiRequestBaseModel();
    }
  }

  //////////////
  // toString //
  //////////////

  @Override public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(super.toString());
    sb.append(Optional.ofNullable(guesserId).map(v -> "guesserId: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(year).map(v -> "year: " + v + "\n").orElse(""));
    sb.append(Optional.ofNullable(bracketId).map(v -> "bracketId: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(name).map(v -> "name: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(southGame1Winner).map(v -> "southGame1Winner: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(southGame1Loser).map(v -> "southGame1Loser: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(southGame2Winner).map(v -> "southGame2Winner: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(southGame2Loser).map(v -> "southGame2Loser: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(westGame1Winner).map(v -> "westGame1Winner: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(westGame1Loser).map(v -> "westGame1Loser: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(westGame2Winner).map(v -> "westGame2Winner: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(westGame2Loser).map(v -> "westGame2Loser: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(eastGame1Winner).map(v -> "eastGame1Winner: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(eastGame1Loser).map(v -> "eastGame1Loser: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(eastGame2Winner).map(v -> "eastGame2Winner: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(eastGame2Loser).map(v -> "eastGame2Loser: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(midwestGame1Winner).map(v -> "midwestGame1Winner: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(midwestGame1Loser).map(v -> "midwestGame1Loser: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(midwestGame2Winner).map(v -> "midwestGame2Winner: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(midwestGame2Loser).map(v -> "midwestGame2Loser: \"" + v + "\"\n" ).orElse(""));
    return sb.toString();
  }

  public static final String CLASS_SIMPLE_NAME = "SweetSixteen";
  public static final String CLASS_CANONICAL_NAME = "org.computate.spinechamp.model.sweetsixteen.SweetSixteen";
  public static final String CLASS_AUTH_RESOURCE = "SWEETSIXTEEN";
  public static final String CLASS_API_ADDRESS_SweetSixteen = "spine-champ-enUS-SweetSixteen";
  public static String getClassApiAddress() {
    return CLASS_API_ADDRESS_SweetSixteen;
  }
  public static final String VAR_guesserId = "guesserId";
  public static final String VAR_year = "year";
  public static final String VAR_bracketId = "bracketId";
  public static final String VAR_name = "name";
  public static final String VAR_southGame1Winner = "southGame1Winner";
  public static final String VAR_southGame1Loser = "southGame1Loser";
  public static final String VAR_southGame2Winner = "southGame2Winner";
  public static final String VAR_southGame2Loser = "southGame2Loser";
  public static final String VAR_westGame1Winner = "westGame1Winner";
  public static final String VAR_westGame1Loser = "westGame1Loser";
  public static final String VAR_westGame2Winner = "westGame2Winner";
  public static final String VAR_westGame2Loser = "westGame2Loser";
  public static final String VAR_eastGame1Winner = "eastGame1Winner";
  public static final String VAR_eastGame1Loser = "eastGame1Loser";
  public static final String VAR_eastGame2Winner = "eastGame2Winner";
  public static final String VAR_eastGame2Loser = "eastGame2Loser";
  public static final String VAR_midwestGame1Winner = "midwestGame1Winner";
  public static final String VAR_midwestGame1Loser = "midwestGame1Loser";
  public static final String VAR_midwestGame2Winner = "midwestGame2Winner";
  public static final String VAR_midwestGame2Loser = "midwestGame2Loser";

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

  public static final String DISPLAY_NAME_guesserId = "guesser";
  public static final String DISPLAY_NAME_year = "year";
  public static final String DISPLAY_NAME_bracketId = "bracket ID";
  public static final String DISPLAY_NAME_name = "bracket name";
  public static final String DISPLAY_NAME_southGame1Winner = "South game 1 winner";
  public static final String DISPLAY_NAME_southGame1Loser = "South game 1 loser";
  public static final String DISPLAY_NAME_southGame2Winner = "South game 2 winner";
  public static final String DISPLAY_NAME_southGame2Loser = "South game 2 loser";
  public static final String DISPLAY_NAME_westGame1Winner = "West game 1 winner";
  public static final String DISPLAY_NAME_westGame1Loser = "West game 1 loser";
  public static final String DISPLAY_NAME_westGame2Winner = "West game 2 winner";
  public static final String DISPLAY_NAME_westGame2Loser = "West game 2 loser";
  public static final String DISPLAY_NAME_eastGame1Winner = "East game 1 winner";
  public static final String DISPLAY_NAME_eastGame1Loser = "East game 1 loser";
  public static final String DISPLAY_NAME_eastGame2Winner = "East game 2 winner";
  public static final String DISPLAY_NAME_eastGame2Loser = "East game 2 loser";
  public static final String DISPLAY_NAME_midwestGame1Winner = "Midwest game 1 winner";
  public static final String DISPLAY_NAME_midwestGame1Loser = "Midwest game 1 loser";
  public static final String DISPLAY_NAME_midwestGame2Winner = "Midwest game 2 winner";
  public static final String DISPLAY_NAME_midwestGame2Loser = "Midwest game 2 loser";

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
  public String descriptionForClass() {
    return null;
  }

  @Override
  public String enUSStringFormatUrlEditPageForClass() {
    return "%s/en-us/edit/sweet-sixteen/%s";
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
    return SweetSixteen.displayNameSweetSixteen(var);
  }
  public static String displayNameSweetSixteen(String var) {
    switch(var) {
    case VAR_guesserId:
      return DISPLAY_NAME_guesserId;
    case VAR_year:
      return DISPLAY_NAME_year;
    case VAR_bracketId:
      return DISPLAY_NAME_bracketId;
    case VAR_name:
      return DISPLAY_NAME_name;
    case VAR_southGame1Winner:
      return DISPLAY_NAME_southGame1Winner;
    case VAR_southGame1Loser:
      return DISPLAY_NAME_southGame1Loser;
    case VAR_southGame2Winner:
      return DISPLAY_NAME_southGame2Winner;
    case VAR_southGame2Loser:
      return DISPLAY_NAME_southGame2Loser;
    case VAR_westGame1Winner:
      return DISPLAY_NAME_westGame1Winner;
    case VAR_westGame1Loser:
      return DISPLAY_NAME_westGame1Loser;
    case VAR_westGame2Winner:
      return DISPLAY_NAME_westGame2Winner;
    case VAR_westGame2Loser:
      return DISPLAY_NAME_westGame2Loser;
    case VAR_eastGame1Winner:
      return DISPLAY_NAME_eastGame1Winner;
    case VAR_eastGame1Loser:
      return DISPLAY_NAME_eastGame1Loser;
    case VAR_eastGame2Winner:
      return DISPLAY_NAME_eastGame2Winner;
    case VAR_eastGame2Loser:
      return DISPLAY_NAME_eastGame2Loser;
    case VAR_midwestGame1Winner:
      return DISPLAY_NAME_midwestGame1Winner;
    case VAR_midwestGame1Loser:
      return DISPLAY_NAME_midwestGame1Loser;
    case VAR_midwestGame2Winner:
      return DISPLAY_NAME_midwestGame2Winner;
    case VAR_midwestGame2Loser:
      return DISPLAY_NAME_midwestGame2Loser;
    default:
      return BaseModel.displayNameBaseModel(var);
    }
  }

  public static String descriptionSweetSixteen(String var) {
    if(var == null)
      return null;
    switch(var) {
    case VAR_guesserId:
      return "The ID of this guesser";
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

  public static String classSimpleNameSweetSixteen(String var) {
    switch(var) {
    case VAR_guesserId:
      return "String";
    case VAR_year:
      return "Integer";
    case VAR_bracketId:
      return "String";
    case VAR_name:
      return "String";
    case VAR_southGame1Winner:
      return "String";
    case VAR_southGame1Loser:
      return "String";
    case VAR_southGame2Winner:
      return "String";
    case VAR_southGame2Loser:
      return "String";
    case VAR_westGame1Winner:
      return "String";
    case VAR_westGame1Loser:
      return "String";
    case VAR_westGame2Winner:
      return "String";
    case VAR_westGame2Loser:
      return "String";
    case VAR_eastGame1Winner:
      return "String";
    case VAR_eastGame1Loser:
      return "String";
    case VAR_eastGame2Winner:
      return "String";
    case VAR_eastGame2Loser:
      return "String";
    case VAR_midwestGame1Winner:
      return "String";
    case VAR_midwestGame1Loser:
      return "String";
    case VAR_midwestGame2Winner:
      return "String";
    case VAR_midwestGame2Loser:
      return "String";
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
    case VAR_southGame1Winner:
      return 5;
    case VAR_southGame1Loser:
      return 5;
    case VAR_southGame2Winner:
      return 5;
    case VAR_southGame2Loser:
      return 5;
    case VAR_westGame1Winner:
      return 5;
    case VAR_westGame1Loser:
      return 5;
    case VAR_westGame2Winner:
      return 5;
    case VAR_westGame2Loser:
      return 5;
    case VAR_eastGame1Winner:
      return 5;
    case VAR_eastGame1Loser:
      return 5;
    case VAR_eastGame2Winner:
      return 5;
    case VAR_eastGame2Loser:
      return 5;
    case VAR_midwestGame1Winner:
      return 5;
    case VAR_midwestGame1Loser:
      return 5;
    case VAR_midwestGame2Winner:
      return 5;
    case VAR_midwestGame2Loser:
      return 5;
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
    case VAR_southGame1Winner:
      return 0;
    case VAR_southGame1Loser:
      return 1;
    case VAR_southGame2Winner:
      return 2;
    case VAR_southGame2Loser:
      return 3;
    case VAR_westGame1Winner:
      return 0;
    case VAR_westGame1Loser:
      return 1;
    case VAR_westGame2Winner:
      return 2;
    case VAR_westGame2Loser:
      return 3;
    case VAR_eastGame1Winner:
      return 0;
    case VAR_eastGame1Loser:
      return 1;
    case VAR_eastGame2Winner:
      return 2;
    case VAR_eastGame2Loser:
      return 3;
    case VAR_midwestGame1Winner:
      return 0;
    case VAR_midwestGame1Loser:
      return 1;
    case VAR_midwestGame2Winner:
      return 2;
    case VAR_midwestGame2Loser:
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
