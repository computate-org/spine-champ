package org.computate.spinechamp.model.eliteeight;

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
import com.fasterxml.jackson.databind.JsonDeserializer;
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
import org.computate.spinechamp.model.eliteeight.EliteEight;
import java.lang.String;
import org.computate.spinechamp.model.guesser.Guesser;
import java.lang.Integer;
import org.computate.spinechamp.model.team.Team;
import org.computate.spinechamp.model.finalfour.FinalFour;
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
 * <li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class EliteEightGen into the class EliteEight. 
 * </li><li>You can add a class comment "Rows: 100" if you wish the EliteEight API to return more or less than 10 records by default. 
 * In this case, the API will return 100 records from the API instead of 10 by default. 
 * Each API has built in pagination of the search records to ensure a user can query all the data a page at a time without running the application out of memory. 
 * </li>
 * <h3>About the EliteEight class and it's generated class EliteEightGen&lt;BaseModel&gt;: </h3>extends EliteEightGen
 * <p>
 * This Java class extends a generated Java class EliteEightGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.eliteeight.EliteEight">Find the class EliteEight in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends EliteEightGen<BaseModel>
 * <p>This <code>class EliteEight extends EliteEightGen&lt;BaseModel&gt;</code>, which means it extends a newly generated EliteEightGen. 
 * The generated <code>class EliteEightGen extends BaseModel</code> which means that EliteEight extends EliteEightGen which extends BaseModel. 
 * This generated inheritance is a powerful feature that allows a lot of boiler plate code to be created for you automatically while still preserving inheritance through the power of Java Generic classes. 
 * </p>
 * <h2>Api: true</h2>
 * <p>This class contains a comment <b>"Api: true"</b>, which means this class will have Java Vert.x API backend code generated for these objects. 
 * </p>
 * <h2>ApiTag.enUS: true</h2>
 * <p>This class contains a comment <b>"ApiTag: elite eight brackets"</b>, which groups all of the OpenAPIs for EliteEight objects under the tag "elite eight brackets". 
 * </p>
 * <h2>ApiUri.enUS: /en-us/api/elite-eight</h2>
 * <p>This class contains a comment <b>"ApiUri: /en-us/api/elite-eight"</b>, which defines the base API URI for EliteEight objects as "/en-us/api/elite-eight" in the OpenAPI spec. 
 * </p>
 * <h2>Color: null</h2>
 * <h2>Indexed: true</h2>
 * <p>This class contains a comment <b>"Indexed: true"</b>, which means this class will be indexed in the search engine. 
 * Every protected void method that begins with "_" that is marked to be searched with a comment like "Indexed: true", "Stored: true", or "DocValues: true" will be indexed in the search engine. 
 * </p>
 * <h2>{@inheritDoc}</h2>
 * <p>By adding a class comment "{@inheritDoc}", the EliteEight class will inherit the helpful inherited class comments from the super class EliteEightGen. 
 * </p>
 * <h2>Rows: null</h2>
 * <h2>Order: 8</h2>
 * <p>This class contains a comment <b>"Order: 8"</b>, which means this class will be sorted by the given number 8 ascending when code that relates to multiple classes at the same time is generated. 
 * </p>
 * <h2>SqlOrder: 9</h2>
 * <p>This class contains a comment <b>"SqlOrder: 9"</b>, which means this class will be sorted by the given number 9 ascending when SQL code to create and drop the tables is generated. 
 * </p>
 * <h2>Model: true</h2>
 * <p>This class contains a comment <b>"Model: true"</b>, which means this class will be stored in the database. 
 * Every protected void method that begins with "_" that contains a "Persist: true" comment will be a persisted field in the database table. 
 * </p>
 * <h2>Page: true</h2>
 * <p>This class contains a comment <b>"Page: true"</b>, which means this class will have webpage code generated for these objects. 
 * Java Vert.x backend API code, Handlebars HTML template frontend code, and JavaScript code will all generated and can be extended. 
 * This creates a new Java class org.computate.spinechamp.model.eliteeight.EliteEightPage. 
 * </p>
 * <h2>SuperPage.enUS: PageLayout</h2>
 * <p>This class contains a comment <b>"SuperPage.enUS: PageLayout"</b>, which identifies the Java super class of the page code by it's class simple name "PageLayout". 
 * This means that the newly created class org.computate.spinechamp.model.eliteeight.EliteEightPage extends org.computate.spinechamp.page.PageLayout. 
 * </p>
 * <h2>Promise: true</h2>
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the EliteEight Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * <h2>AName.enUS: an elite eight bracket</h2>
 * <p>This class contains a comment <b>"AName.enUS: an elite eight bracket"</b>, which identifies the language context to describe a EliteEight as "an elite eight bracket". 
 * </p>
 * <p>
 * Delete the class EliteEight in Solr: 
 * <pre>
 * curl -k 'https://solr.apps-crc.testing/solr/computate/update?commitWithin=1000&amp;overwrite=true&amp;wt=json' -X POST -H 'Content-type: text/xml' -u "admin:$(oc -n solr get secret/solr-solrcloud-security-bootstrap -o jsonpath={.data.admin} | base64 -d)" --data-raw '&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.eliteeight.EliteEight&lt;/query&gt;&lt;/delete&gt;'
 * </pre>
 * </p>
 * <p>
 * Delete  the package org.computate.spinechamp.model.eliteeight in Solr: 
 * <pre>
 * curl -k 'https://solr.apps-crc.testing/solr/computate/update?commitWithin=1000&amp;overwrite=true&amp;wt=json' -X POST -H 'Content-type: text/xml' -u "admin:$(oc -n solr get secret/solr-solrcloud-security-bootstrap -o jsonpath={.data.admin} | base64 -d)" --data-raw '&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:org.computate.spinechamp.model.eliteeight&lt;/query&gt;&lt;/delete&gt;'
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
public abstract class EliteEightGen<DEV> extends BaseModel {
  protected static final Logger LOG = LoggerFactory.getLogger(EliteEight.class);

  public static final String Description_enUS = "A predicted tournament with 8 teams. ";
  public static final String AName_enUS = "an elite eight bracket";
  public static final String This_enUS = "this ";
  public static final String ThisName_enUS = "this elite eight bracket";
  public static final String A_enUS = "a ";
  public static final String TheName_enUS = "theelite eight bracket";
  public static final String SingularName_enUS = "elite eight bracket";
  public static final String PluralName_enUS = "elite eight brackets";
  public static final String NameActual_enUS = "current elite eight bracket";
  public static final String AllName_enUS = "all elite eight brackets";
  public static final String SearchAllNameBy_enUS = "search elite eight brackets by ";
  public static final String SearchAllName_enUS = "search elite eight brackets";
  public static final String Title_enUS = "elite eight brackets";
  public static final String ThePluralName_enUS = "the elite eight brackets";
  public static final String NoNameFound_enUS = "no elite eight bracket found";
  public static final String ApiUri_enUS = "/en-us/api/elite-eight";
  public static final String ApiUriSearchPage_enUS = "/en-us/search/elite-eight";
  public static final String ApiUriEditPage_enUS = "/en-us/edit/elite-eight/{bracketId}";
  public static final String OfName_enUS = "of elite eight bracket";
  public static final String ANameAdjective_enUS = "an elite eight bracket";
  public static final String NameAdjectiveSingular_enUS = "elite eight bracket";
  public static final String NameAdjectivePlural_enUS = "elite eight brackets";
  public static final String Search_enUS_OpenApiUri = "/en-us/api/elite-eight";
  public static final String Search_enUS_StringFormatUri = "/en-us/api/elite-eight";
  public static final String Search_enUS_StringFormatUrl = "%s/en-us/api/elite-eight";
  public static final String GET_enUS_OpenApiUri = "/en-us/api/elite-eight/{bracketId}";
  public static final String GET_enUS_StringFormatUri = "/en-us/api/elite-eight/%s";
  public static final String GET_enUS_StringFormatUrl = "%s/en-us/api/elite-eight/%s";
  public static final String PATCH_enUS_OpenApiUri = "/en-us/api/elite-eight";
  public static final String PATCH_enUS_StringFormatUri = "/en-us/api/elite-eight";
  public static final String PATCH_enUS_StringFormatUrl = "%s/en-us/api/elite-eight";
  public static final String POST_enUS_OpenApiUri = "/en-us/api/elite-eight";
  public static final String POST_enUS_StringFormatUri = "/en-us/api/elite-eight";
  public static final String POST_enUS_StringFormatUrl = "%s/en-us/api/elite-eight";
  public static final String DELETE_enUS_OpenApiUri = "/en-us/api/elite-eight/{bracketId}";
  public static final String DELETE_enUS_StringFormatUri = "/en-us/api/elite-eight/%s";
  public static final String DELETE_enUS_StringFormatUrl = "%s/en-us/api/elite-eight/%s";
  public static final String PUTImport_enUS_OpenApiUri = "/en-us/api/elite-eight-import";
  public static final String PUTImport_enUS_StringFormatUri = "/en-us/api/elite-eight-import";
  public static final String PUTImport_enUS_StringFormatUrl = "%s/en-us/api/elite-eight-import";
  public static final String SearchPage_enUS_OpenApiUri = "/en-us/search/elite-eight";
  public static final String SearchPage_enUS_StringFormatUri = "/en-us/search/elite-eight";
  public static final String SearchPage_enUS_StringFormatUrl = "%s/en-us/search/elite-eight";
  public static final String EditPage_enUS_OpenApiUri = "/en-us/edit/elite-eight/{bracketId}";
  public static final String EditPage_enUS_StringFormatUri = "/en-us/edit/elite-eight/%s";
  public static final String EditPage_enUS_StringFormatUrl = "%s/en-us/edit/elite-eight/%s";
  public static final String DELETEFilter_enUS_OpenApiUri = "/en-us/api/elite-eight";
  public static final String DELETEFilter_enUS_StringFormatUri = "/en-us/api/elite-eight";
  public static final String DELETEFilter_enUS_StringFormatUrl = "%s/en-us/api/elite-eight";

  public static final String Icon = "<i class=\"fa-thin fa-basketball-hoop\"></i>";

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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.eliteeight.EliteEight&fq=entiteVar_enUS_indexed_string:actualSweetSixteenSearch">Find the entity actualSweetSixteenSearch in Solr</a>
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.eliteeight.EliteEight&fq=entiteVar_enUS_indexed_string:actualSweetSixteen">Find the entity actualSweetSixteen in Solr</a>
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
    this.actualSweetSixteen = EliteEight.staticSetActualSweetSixteen(siteRequest_, o);
  }
  public static JsonObject staticSetActualSweetSixteen(SiteRequest siteRequest_, String o) {
    if(o != null) {
        return new JsonObject(o);
    }
    return null;
  }
  protected EliteEight actualSweetSixteenInit() {
    Wrap<JsonObject> actualSweetSixteenWrap = new Wrap<JsonObject>().var("actualSweetSixteen");
    if(actualSweetSixteen == null) {
      _actualSweetSixteen(actualSweetSixteenWrap);
      Optional.ofNullable(actualSweetSixteenWrap.getO()).ifPresent(o -> {
        setActualSweetSixteen(o);
      });
    }
    return (EliteEight)this;
  }

  public static String staticSearchActualSweetSixteen(SiteRequest siteRequest_, JsonObject o) {
    return o.toString();
  }

  public static String staticSearchStrActualSweetSixteen(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqActualSweetSixteen(SiteRequest siteRequest_, String o) {
    return EliteEight.staticSearchActualSweetSixteen(siteRequest_, EliteEight.staticSetActualSweetSixteen(siteRequest_, o)).toString();
  }

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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.eliteeight.EliteEight&fq=entiteVar_enUS_indexed_string:actualEliteEightSearch">Find the entity actualEliteEightSearch in Solr</a>
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.eliteeight.EliteEight&fq=entiteVar_enUS_indexed_string:actualEliteEight">Find the entity actualEliteEight in Solr</a>
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
    this.actualEliteEight = EliteEight.staticSetActualEliteEight(siteRequest_, o);
  }
  public static JsonObject staticSetActualEliteEight(SiteRequest siteRequest_, String o) {
    if(o != null) {
        return new JsonObject(o);
    }
    return null;
  }
  protected EliteEight actualEliteEightInit() {
    Wrap<JsonObject> actualEliteEightWrap = new Wrap<JsonObject>().var("actualEliteEight");
    if(actualEliteEight == null) {
      _actualEliteEight(actualEliteEightWrap);
      Optional.ofNullable(actualEliteEightWrap.getO()).ifPresent(o -> {
        setActualEliteEight(o);
      });
    }
    return (EliteEight)this;
  }

  public static String staticSearchActualEliteEight(SiteRequest siteRequest_, JsonObject o) {
    return o.toString();
  }

  public static String staticSearchStrActualEliteEight(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqActualEliteEight(SiteRequest siteRequest_, String o) {
    return EliteEight.staticSearchActualEliteEight(siteRequest_, EliteEight.staticSetActualEliteEight(siteRequest_, o)).toString();
  }

	//////////////////
  // sweetSixteen //
	//////////////////


  /**
   *  The entity sweetSixteen
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String sweetSixteen;

  /**
   * <br> The entity sweetSixteen
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.eliteeight.EliteEight&fq=entiteVar_enUS_indexed_string:sweetSixteen">Find the entity sweetSixteen in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _sweetSixteen(Wrap<String> w);

  public String getSweetSixteen() {
    return sweetSixteen;
  }
  public void setSweetSixteen(String o) {
    this.sweetSixteen = EliteEight.staticSetSweetSixteen(siteRequest_, o);
  }
  public static String staticSetSweetSixteen(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected EliteEight sweetSixteenInit() {
    Wrap<String> sweetSixteenWrap = new Wrap<String>().var("sweetSixteen");
    if(sweetSixteen == null) {
      _sweetSixteen(sweetSixteenWrap);
      Optional.ofNullable(sweetSixteenWrap.getO()).ifPresent(o -> {
        setSweetSixteen(o);
      });
    }
    return (EliteEight)this;
  }

  public static String staticSearchSweetSixteen(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrSweetSixteen(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqSweetSixteen(SiteRequest siteRequest_, String o) {
    return EliteEight.staticSearchSweetSixteen(siteRequest_, EliteEight.staticSetSweetSixteen(siteRequest_, o)).toString();
  }

  public String sqlSweetSixteen() {
    return sweetSixteen;
  }

  public static String staticJsonSweetSixteen(String sweetSixteen) {
    return sweetSixteen;
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.eliteeight.EliteEight&fq=entiteVar_enUS_indexed_string:guesserId">Find the entity guesserId in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _guesserId(Wrap<String> w);

  public String getGuesserId() {
    return guesserId;
  }
  public void setGuesserId(String o) {
    this.guesserId = EliteEight.staticSetGuesserId(siteRequest_, o);
  }
  public static String staticSetGuesserId(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected EliteEight guesserIdInit() {
    Wrap<String> guesserIdWrap = new Wrap<String>().var("guesserId");
    if(guesserId == null) {
      _guesserId(guesserIdWrap);
      Optional.ofNullable(guesserIdWrap.getO()).ifPresent(o -> {
        setGuesserId(o);
      });
    }
    return (EliteEight)this;
  }

  public static String staticSearchGuesserId(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrGuesserId(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqGuesserId(SiteRequest siteRequest_, String o) {
    return EliteEight.staticSearchGuesserId(siteRequest_, EliteEight.staticSetGuesserId(siteRequest_, o)).toString();
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.eliteeight.EliteEight&fq=entiteVar_enUS_indexed_string:year">Find the entity year in Solr</a>
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
    this.year = EliteEight.staticSetYear(siteRequest_, o);
  }
  public static Integer staticSetYear(SiteRequest siteRequest_, String o) {
    if(NumberUtils.isParsable(o))
      return Integer.parseInt(o);
    return null;
  }
  protected EliteEight yearInit() {
    Wrap<Integer> yearWrap = new Wrap<Integer>().var("year");
    if(year == null) {
      _year(yearWrap);
      Optional.ofNullable(yearWrap.getO()).ifPresent(o -> {
        setYear(o);
      });
    }
    return (EliteEight)this;
  }

  public static Integer staticSearchYear(SiteRequest siteRequest_, Integer o) {
    return o;
  }

  public static String staticSearchStrYear(SiteRequest siteRequest_, Integer o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqYear(SiteRequest siteRequest_, String o) {
    return EliteEight.staticSearchYear(siteRequest_, EliteEight.staticSetYear(siteRequest_, o)).toString();
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.eliteeight.EliteEight&fq=entiteVar_enUS_indexed_string:bracketId">Find the entity bracketId in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _bracketId(Wrap<String> w);

  public String getBracketId() {
    return bracketId;
  }
  public void setBracketId(String o) {
    this.bracketId = EliteEight.staticSetBracketId(siteRequest_, o);
  }
  public static String staticSetBracketId(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected EliteEight bracketIdInit() {
    Wrap<String> bracketIdWrap = new Wrap<String>().var("bracketId");
    if(bracketId == null) {
      _bracketId(bracketIdWrap);
      Optional.ofNullable(bracketIdWrap.getO()).ifPresent(o -> {
        setBracketId(o);
      });
    }
    return (EliteEight)this;
  }

  public static String staticSearchBracketId(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrBracketId(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqBracketId(SiteRequest siteRequest_, String o) {
    return EliteEight.staticSearchBracketId(siteRequest_, EliteEight.staticSetBracketId(siteRequest_, o)).toString();
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.eliteeight.EliteEight&fq=entiteVar_enUS_indexed_string:name">Find the entity name in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _name(Wrap<String> w);

  public String getName() {
    return name;
  }
  public void setName(String o) {
    this.name = EliteEight.staticSetName(siteRequest_, o);
  }
  public static String staticSetName(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected EliteEight nameInit() {
    Wrap<String> nameWrap = new Wrap<String>().var("name");
    if(name == null) {
      _name(nameWrap);
      Optional.ofNullable(nameWrap.getO()).ifPresent(o -> {
        setName(o);
      });
    }
    return (EliteEight)this;
  }

  public static String staticSearchName(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrName(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqName(SiteRequest siteRequest_, String o) {
    return EliteEight.staticSearchName(siteRequest_, EliteEight.staticSetName(siteRequest_, o)).toString();
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.eliteeight.EliteEight&fq=entiteVar_enUS_indexed_string:southGame1WinnerGuess">Find the entity southGame1WinnerGuess in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _southGame1WinnerGuess(Wrap<String> w);

  public String getSouthGame1WinnerGuess() {
    return southGame1WinnerGuess;
  }
  public void setSouthGame1WinnerGuess(String o) {
    this.southGame1WinnerGuess = EliteEight.staticSetSouthGame1WinnerGuess(siteRequest_, o);
  }
  public static String staticSetSouthGame1WinnerGuess(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected EliteEight southGame1WinnerGuessInit() {
    Wrap<String> southGame1WinnerGuessWrap = new Wrap<String>().var("southGame1WinnerGuess");
    if(southGame1WinnerGuess == null) {
      _southGame1WinnerGuess(southGame1WinnerGuessWrap);
      Optional.ofNullable(southGame1WinnerGuessWrap.getO()).ifPresent(o -> {
        setSouthGame1WinnerGuess(o);
      });
    }
    return (EliteEight)this;
  }

  public static String staticSearchSouthGame1WinnerGuess(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrSouthGame1WinnerGuess(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqSouthGame1WinnerGuess(SiteRequest siteRequest_, String o) {
    return EliteEight.staticSearchSouthGame1WinnerGuess(siteRequest_, EliteEight.staticSetSouthGame1WinnerGuess(siteRequest_, o)).toString();
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.eliteeight.EliteEight&fq=entiteVar_enUS_indexed_string:southGame1Winner">Find the entity southGame1Winner in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _southGame1Winner(Wrap<String> w);

  public String getSouthGame1Winner() {
    return southGame1Winner;
  }
  public void setSouthGame1Winner(String o) {
    this.southGame1Winner = EliteEight.staticSetSouthGame1Winner(siteRequest_, o);
  }
  public static String staticSetSouthGame1Winner(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected EliteEight southGame1WinnerInit() {
    Wrap<String> southGame1WinnerWrap = new Wrap<String>().var("southGame1Winner");
    if(southGame1Winner == null) {
      _southGame1Winner(southGame1WinnerWrap);
      Optional.ofNullable(southGame1WinnerWrap.getO()).ifPresent(o -> {
        setSouthGame1Winner(o);
      });
    }
    return (EliteEight)this;
  }

  public static String staticSearchSouthGame1Winner(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrSouthGame1Winner(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqSouthGame1Winner(SiteRequest siteRequest_, String o) {
    return EliteEight.staticSearchSouthGame1Winner(siteRequest_, EliteEight.staticSetSouthGame1Winner(siteRequest_, o)).toString();
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.eliteeight.EliteEight&fq=entiteVar_enUS_indexed_string:southGame1Loser">Find the entity southGame1Loser in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _southGame1Loser(Wrap<String> w);

  public String getSouthGame1Loser() {
    return southGame1Loser;
  }
  public void setSouthGame1Loser(String o) {
    this.southGame1Loser = EliteEight.staticSetSouthGame1Loser(siteRequest_, o);
  }
  public static String staticSetSouthGame1Loser(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected EliteEight southGame1LoserInit() {
    Wrap<String> southGame1LoserWrap = new Wrap<String>().var("southGame1Loser");
    if(southGame1Loser == null) {
      _southGame1Loser(southGame1LoserWrap);
      Optional.ofNullable(southGame1LoserWrap.getO()).ifPresent(o -> {
        setSouthGame1Loser(o);
      });
    }
    return (EliteEight)this;
  }

  public static String staticSearchSouthGame1Loser(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrSouthGame1Loser(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqSouthGame1Loser(SiteRequest siteRequest_, String o) {
    return EliteEight.staticSearchSouthGame1Loser(siteRequest_, EliteEight.staticSetSouthGame1Loser(siteRequest_, o)).toString();
  }

  public String sqlSouthGame1Loser() {
    return southGame1Loser;
  }

  public static String staticJsonSouthGame1Loser(String southGame1Loser) {
    return southGame1Loser;
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.eliteeight.EliteEight&fq=entiteVar_enUS_indexed_string:westGame1WinnerGuess">Find the entity westGame1WinnerGuess in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _westGame1WinnerGuess(Wrap<String> w);

  public String getWestGame1WinnerGuess() {
    return westGame1WinnerGuess;
  }
  public void setWestGame1WinnerGuess(String o) {
    this.westGame1WinnerGuess = EliteEight.staticSetWestGame1WinnerGuess(siteRequest_, o);
  }
  public static String staticSetWestGame1WinnerGuess(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected EliteEight westGame1WinnerGuessInit() {
    Wrap<String> westGame1WinnerGuessWrap = new Wrap<String>().var("westGame1WinnerGuess");
    if(westGame1WinnerGuess == null) {
      _westGame1WinnerGuess(westGame1WinnerGuessWrap);
      Optional.ofNullable(westGame1WinnerGuessWrap.getO()).ifPresent(o -> {
        setWestGame1WinnerGuess(o);
      });
    }
    return (EliteEight)this;
  }

  public static String staticSearchWestGame1WinnerGuess(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrWestGame1WinnerGuess(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqWestGame1WinnerGuess(SiteRequest siteRequest_, String o) {
    return EliteEight.staticSearchWestGame1WinnerGuess(siteRequest_, EliteEight.staticSetWestGame1WinnerGuess(siteRequest_, o)).toString();
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.eliteeight.EliteEight&fq=entiteVar_enUS_indexed_string:westGame1Winner">Find the entity westGame1Winner in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _westGame1Winner(Wrap<String> w);

  public String getWestGame1Winner() {
    return westGame1Winner;
  }
  public void setWestGame1Winner(String o) {
    this.westGame1Winner = EliteEight.staticSetWestGame1Winner(siteRequest_, o);
  }
  public static String staticSetWestGame1Winner(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected EliteEight westGame1WinnerInit() {
    Wrap<String> westGame1WinnerWrap = new Wrap<String>().var("westGame1Winner");
    if(westGame1Winner == null) {
      _westGame1Winner(westGame1WinnerWrap);
      Optional.ofNullable(westGame1WinnerWrap.getO()).ifPresent(o -> {
        setWestGame1Winner(o);
      });
    }
    return (EliteEight)this;
  }

  public static String staticSearchWestGame1Winner(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrWestGame1Winner(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqWestGame1Winner(SiteRequest siteRequest_, String o) {
    return EliteEight.staticSearchWestGame1Winner(siteRequest_, EliteEight.staticSetWestGame1Winner(siteRequest_, o)).toString();
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.eliteeight.EliteEight&fq=entiteVar_enUS_indexed_string:westGame1Loser">Find the entity westGame1Loser in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _westGame1Loser(Wrap<String> w);

  public String getWestGame1Loser() {
    return westGame1Loser;
  }
  public void setWestGame1Loser(String o) {
    this.westGame1Loser = EliteEight.staticSetWestGame1Loser(siteRequest_, o);
  }
  public static String staticSetWestGame1Loser(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected EliteEight westGame1LoserInit() {
    Wrap<String> westGame1LoserWrap = new Wrap<String>().var("westGame1Loser");
    if(westGame1Loser == null) {
      _westGame1Loser(westGame1LoserWrap);
      Optional.ofNullable(westGame1LoserWrap.getO()).ifPresent(o -> {
        setWestGame1Loser(o);
      });
    }
    return (EliteEight)this;
  }

  public static String staticSearchWestGame1Loser(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrWestGame1Loser(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqWestGame1Loser(SiteRequest siteRequest_, String o) {
    return EliteEight.staticSearchWestGame1Loser(siteRequest_, EliteEight.staticSetWestGame1Loser(siteRequest_, o)).toString();
  }

  public String sqlWestGame1Loser() {
    return westGame1Loser;
  }

  public static String staticJsonWestGame1Loser(String westGame1Loser) {
    return westGame1Loser;
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.eliteeight.EliteEight&fq=entiteVar_enUS_indexed_string:eastGame1WinnerGuess">Find the entity eastGame1WinnerGuess in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _eastGame1WinnerGuess(Wrap<String> w);

  public String getEastGame1WinnerGuess() {
    return eastGame1WinnerGuess;
  }
  public void setEastGame1WinnerGuess(String o) {
    this.eastGame1WinnerGuess = EliteEight.staticSetEastGame1WinnerGuess(siteRequest_, o);
  }
  public static String staticSetEastGame1WinnerGuess(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected EliteEight eastGame1WinnerGuessInit() {
    Wrap<String> eastGame1WinnerGuessWrap = new Wrap<String>().var("eastGame1WinnerGuess");
    if(eastGame1WinnerGuess == null) {
      _eastGame1WinnerGuess(eastGame1WinnerGuessWrap);
      Optional.ofNullable(eastGame1WinnerGuessWrap.getO()).ifPresent(o -> {
        setEastGame1WinnerGuess(o);
      });
    }
    return (EliteEight)this;
  }

  public static String staticSearchEastGame1WinnerGuess(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrEastGame1WinnerGuess(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqEastGame1WinnerGuess(SiteRequest siteRequest_, String o) {
    return EliteEight.staticSearchEastGame1WinnerGuess(siteRequest_, EliteEight.staticSetEastGame1WinnerGuess(siteRequest_, o)).toString();
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.eliteeight.EliteEight&fq=entiteVar_enUS_indexed_string:eastGame1Winner">Find the entity eastGame1Winner in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _eastGame1Winner(Wrap<String> w);

  public String getEastGame1Winner() {
    return eastGame1Winner;
  }
  public void setEastGame1Winner(String o) {
    this.eastGame1Winner = EliteEight.staticSetEastGame1Winner(siteRequest_, o);
  }
  public static String staticSetEastGame1Winner(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected EliteEight eastGame1WinnerInit() {
    Wrap<String> eastGame1WinnerWrap = new Wrap<String>().var("eastGame1Winner");
    if(eastGame1Winner == null) {
      _eastGame1Winner(eastGame1WinnerWrap);
      Optional.ofNullable(eastGame1WinnerWrap.getO()).ifPresent(o -> {
        setEastGame1Winner(o);
      });
    }
    return (EliteEight)this;
  }

  public static String staticSearchEastGame1Winner(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrEastGame1Winner(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqEastGame1Winner(SiteRequest siteRequest_, String o) {
    return EliteEight.staticSearchEastGame1Winner(siteRequest_, EliteEight.staticSetEastGame1Winner(siteRequest_, o)).toString();
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.eliteeight.EliteEight&fq=entiteVar_enUS_indexed_string:eastGame1Loser">Find the entity eastGame1Loser in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _eastGame1Loser(Wrap<String> w);

  public String getEastGame1Loser() {
    return eastGame1Loser;
  }
  public void setEastGame1Loser(String o) {
    this.eastGame1Loser = EliteEight.staticSetEastGame1Loser(siteRequest_, o);
  }
  public static String staticSetEastGame1Loser(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected EliteEight eastGame1LoserInit() {
    Wrap<String> eastGame1LoserWrap = new Wrap<String>().var("eastGame1Loser");
    if(eastGame1Loser == null) {
      _eastGame1Loser(eastGame1LoserWrap);
      Optional.ofNullable(eastGame1LoserWrap.getO()).ifPresent(o -> {
        setEastGame1Loser(o);
      });
    }
    return (EliteEight)this;
  }

  public static String staticSearchEastGame1Loser(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrEastGame1Loser(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqEastGame1Loser(SiteRequest siteRequest_, String o) {
    return EliteEight.staticSearchEastGame1Loser(siteRequest_, EliteEight.staticSetEastGame1Loser(siteRequest_, o)).toString();
  }

  public String sqlEastGame1Loser() {
    return eastGame1Loser;
  }

  public static String staticJsonEastGame1Loser(String eastGame1Loser) {
    return eastGame1Loser;
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.eliteeight.EliteEight&fq=entiteVar_enUS_indexed_string:midwestGame1WinnerGuess">Find the entity midwestGame1WinnerGuess in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _midwestGame1WinnerGuess(Wrap<String> w);

  public String getMidwestGame1WinnerGuess() {
    return midwestGame1WinnerGuess;
  }
  public void setMidwestGame1WinnerGuess(String o) {
    this.midwestGame1WinnerGuess = EliteEight.staticSetMidwestGame1WinnerGuess(siteRequest_, o);
  }
  public static String staticSetMidwestGame1WinnerGuess(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected EliteEight midwestGame1WinnerGuessInit() {
    Wrap<String> midwestGame1WinnerGuessWrap = new Wrap<String>().var("midwestGame1WinnerGuess");
    if(midwestGame1WinnerGuess == null) {
      _midwestGame1WinnerGuess(midwestGame1WinnerGuessWrap);
      Optional.ofNullable(midwestGame1WinnerGuessWrap.getO()).ifPresent(o -> {
        setMidwestGame1WinnerGuess(o);
      });
    }
    return (EliteEight)this;
  }

  public static String staticSearchMidwestGame1WinnerGuess(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrMidwestGame1WinnerGuess(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqMidwestGame1WinnerGuess(SiteRequest siteRequest_, String o) {
    return EliteEight.staticSearchMidwestGame1WinnerGuess(siteRequest_, EliteEight.staticSetMidwestGame1WinnerGuess(siteRequest_, o)).toString();
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.eliteeight.EliteEight&fq=entiteVar_enUS_indexed_string:midwestGame1Winner">Find the entity midwestGame1Winner in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _midwestGame1Winner(Wrap<String> w);

  public String getMidwestGame1Winner() {
    return midwestGame1Winner;
  }
  public void setMidwestGame1Winner(String o) {
    this.midwestGame1Winner = EliteEight.staticSetMidwestGame1Winner(siteRequest_, o);
  }
  public static String staticSetMidwestGame1Winner(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected EliteEight midwestGame1WinnerInit() {
    Wrap<String> midwestGame1WinnerWrap = new Wrap<String>().var("midwestGame1Winner");
    if(midwestGame1Winner == null) {
      _midwestGame1Winner(midwestGame1WinnerWrap);
      Optional.ofNullable(midwestGame1WinnerWrap.getO()).ifPresent(o -> {
        setMidwestGame1Winner(o);
      });
    }
    return (EliteEight)this;
  }

  public static String staticSearchMidwestGame1Winner(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrMidwestGame1Winner(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqMidwestGame1Winner(SiteRequest siteRequest_, String o) {
    return EliteEight.staticSearchMidwestGame1Winner(siteRequest_, EliteEight.staticSetMidwestGame1Winner(siteRequest_, o)).toString();
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.eliteeight.EliteEight&fq=entiteVar_enUS_indexed_string:midwestGame1Loser">Find the entity midwestGame1Loser in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _midwestGame1Loser(Wrap<String> w);

  public String getMidwestGame1Loser() {
    return midwestGame1Loser;
  }
  public void setMidwestGame1Loser(String o) {
    this.midwestGame1Loser = EliteEight.staticSetMidwestGame1Loser(siteRequest_, o);
  }
  public static String staticSetMidwestGame1Loser(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected EliteEight midwestGame1LoserInit() {
    Wrap<String> midwestGame1LoserWrap = new Wrap<String>().var("midwestGame1Loser");
    if(midwestGame1Loser == null) {
      _midwestGame1Loser(midwestGame1LoserWrap);
      Optional.ofNullable(midwestGame1LoserWrap.getO()).ifPresent(o -> {
        setMidwestGame1Loser(o);
      });
    }
    return (EliteEight)this;
  }

  public static String staticSearchMidwestGame1Loser(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrMidwestGame1Loser(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqMidwestGame1Loser(SiteRequest siteRequest_, String o) {
    return EliteEight.staticSearchMidwestGame1Loser(siteRequest_, EliteEight.staticSetMidwestGame1Loser(siteRequest_, o)).toString();
  }

  public String sqlMidwestGame1Loser() {
    return midwestGame1Loser;
  }

  public static String staticJsonMidwestGame1Loser(String midwestGame1Loser) {
    return midwestGame1Loser;
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.eliteeight.EliteEight&fq=entiteVar_enUS_indexed_string:finalFour">Find the entity finalFour in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _finalFour(Wrap<String> w);

  public String getFinalFour() {
    return finalFour;
  }
  public void setFinalFour(String o) {
    this.finalFour = EliteEight.staticSetFinalFour(siteRequest_, o);
  }
  public static String staticSetFinalFour(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected EliteEight finalFourInit() {
    Wrap<String> finalFourWrap = new Wrap<String>().var("finalFour");
    if(finalFour == null) {
      _finalFour(finalFourWrap);
      Optional.ofNullable(finalFourWrap.getO()).ifPresent(o -> {
        setFinalFour(o);
      });
    }
    return (EliteEight)this;
  }

  public static String staticSearchFinalFour(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrFinalFour(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqFinalFour(SiteRequest siteRequest_, String o) {
    return EliteEight.staticSearchFinalFour(siteRequest_, EliteEight.staticSetFinalFour(siteRequest_, o)).toString();
  }

  public String sqlFinalFour() {
    return finalFour;
  }

  public static String staticJsonFinalFour(String finalFour) {
    return finalFour;
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.eliteeight.EliteEight&fq=entiteVar_enUS_indexed_string:correctGuesses">Find the entity correctGuesses in Solr</a>
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
    this.correctGuesses = EliteEight.staticSetCorrectGuesses(siteRequest_, o);
  }
  public static Integer staticSetCorrectGuesses(SiteRequest siteRequest_, String o) {
    if(NumberUtils.isParsable(o))
      return Integer.parseInt(o);
    return null;
  }
  protected EliteEight correctGuessesInit() {
    Wrap<Integer> correctGuessesWrap = new Wrap<Integer>().var("correctGuesses");
    if(correctGuesses == null) {
      _correctGuesses(correctGuessesWrap);
      Optional.ofNullable(correctGuessesWrap.getO()).ifPresent(o -> {
        setCorrectGuesses(o);
      });
    }
    return (EliteEight)this;
  }

  public static Integer staticSearchCorrectGuesses(SiteRequest siteRequest_, Integer o) {
    return o;
  }

  public static String staticSearchStrCorrectGuesses(SiteRequest siteRequest_, Integer o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqCorrectGuesses(SiteRequest siteRequest_, String o) {
    return EliteEight.staticSearchCorrectGuesses(siteRequest_, EliteEight.staticSetCorrectGuesses(siteRequest_, o)).toString();
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.eliteeight.EliteEight&fq=entiteVar_enUS_indexed_string:incorrectGuesses">Find the entity incorrectGuesses in Solr</a>
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
    this.incorrectGuesses = EliteEight.staticSetIncorrectGuesses(siteRequest_, o);
  }
  public static Integer staticSetIncorrectGuesses(SiteRequest siteRequest_, String o) {
    if(NumberUtils.isParsable(o))
      return Integer.parseInt(o);
    return null;
  }
  protected EliteEight incorrectGuessesInit() {
    Wrap<Integer> incorrectGuessesWrap = new Wrap<Integer>().var("incorrectGuesses");
    if(incorrectGuesses == null) {
      _incorrectGuesses(incorrectGuessesWrap);
      Optional.ofNullable(incorrectGuessesWrap.getO()).ifPresent(o -> {
        setIncorrectGuesses(o);
      });
    }
    return (EliteEight)this;
  }

  public static Integer staticSearchIncorrectGuesses(SiteRequest siteRequest_, Integer o) {
    return o;
  }

  public static String staticSearchStrIncorrectGuesses(SiteRequest siteRequest_, Integer o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqIncorrectGuesses(SiteRequest siteRequest_, String o) {
    return EliteEight.staticSearchIncorrectGuesses(siteRequest_, EliteEight.staticSetIncorrectGuesses(siteRequest_, o)).toString();
  }

  //////////////
  // initDeep //
  //////////////

  public Future<EliteEightGen<DEV>> promiseDeepEliteEight(SiteRequest siteRequest_) {
    setSiteRequest_(siteRequest_);
    return promiseDeepEliteEight();
  }

  public Future<EliteEightGen<DEV>> promiseDeepEliteEight() {
    Promise<EliteEightGen<DEV>> promise = Promise.promise();
    Promise<Void> promise2 = Promise.promise();
    promiseEliteEight(promise2);
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

  public Future<Void> promiseEliteEight(Promise<Void> promise) {
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
        sweetSixteenInit();
        guesserIdInit();
        yearInit();
        bracketIdInit();
        nameInit();
        southGame1WinnerGuessInit();
        southGame1WinnerInit();
        southGame1LoserInit();
        westGame1WinnerGuessInit();
        westGame1WinnerInit();
        westGame1LoserInit();
        eastGame1WinnerGuessInit();
        eastGame1WinnerInit();
        eastGame1LoserInit();
        midwestGame1WinnerGuessInit();
        midwestGame1WinnerInit();
        midwestGame1LoserInit();
        finalFourInit();
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

  @Override public Future<? extends EliteEightGen<DEV>> promiseDeepForClass(SiteRequest siteRequest_) {
    return promiseDeepEliteEight(siteRequest_);
  }

  /////////////////
  // siteRequest //
  /////////////////

  public void siteRequestEliteEight(SiteRequest siteRequest_) {
      super.siteRequestBaseModel(siteRequest_);
    if(actualSweetSixteenSearch != null)
      actualSweetSixteenSearch.setSiteRequest_(siteRequest_);
    if(actualEliteEightSearch != null)
      actualEliteEightSearch.setSiteRequest_(siteRequest_);
  }

  public void siteRequestForClass(SiteRequest siteRequest_) {
    siteRequestEliteEight(siteRequest_);
  }

  /////////////
  // obtain //
  /////////////

  @Override public Object obtainForClass(String var) {
    String[] vars = StringUtils.split(var, ".");
    Object o = null;
    for(String v : vars) {
      if(o == null)
        o = obtainEliteEight(v);
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
  public Object obtainEliteEight(String var) {
    EliteEight oEliteEight = (EliteEight)this;
    switch(var) {
      case "actualSweetSixteenSearch":
        return oEliteEight.actualSweetSixteenSearch;
      case "actualSweetSixteen":
        return oEliteEight.actualSweetSixteen;
      case "actualEliteEightSearch":
        return oEliteEight.actualEliteEightSearch;
      case "actualEliteEight":
        return oEliteEight.actualEliteEight;
      case "sweetSixteen":
        return oEliteEight.sweetSixteen;
      case "guesserId":
        return oEliteEight.guesserId;
      case "year":
        return oEliteEight.year;
      case "bracketId":
        return oEliteEight.bracketId;
      case "name":
        return oEliteEight.name;
      case "southGame1WinnerGuess":
        return oEliteEight.southGame1WinnerGuess;
      case "southGame1Winner":
        return oEliteEight.southGame1Winner;
      case "southGame1Loser":
        return oEliteEight.southGame1Loser;
      case "westGame1WinnerGuess":
        return oEliteEight.westGame1WinnerGuess;
      case "westGame1Winner":
        return oEliteEight.westGame1Winner;
      case "westGame1Loser":
        return oEliteEight.westGame1Loser;
      case "eastGame1WinnerGuess":
        return oEliteEight.eastGame1WinnerGuess;
      case "eastGame1Winner":
        return oEliteEight.eastGame1Winner;
      case "eastGame1Loser":
        return oEliteEight.eastGame1Loser;
      case "midwestGame1WinnerGuess":
        return oEliteEight.midwestGame1WinnerGuess;
      case "midwestGame1Winner":
        return oEliteEight.midwestGame1Winner;
      case "midwestGame1Loser":
        return oEliteEight.midwestGame1Loser;
      case "finalFour":
        return oEliteEight.finalFour;
      case "correctGuesses":
        return oEliteEight.correctGuesses;
      case "incorrectGuesses":
        return oEliteEight.incorrectGuesses;
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
        o = relateEliteEight(v, val);
      else if(o instanceof BaseModel) {
        BaseModel baseModel = (BaseModel)o;
        o = baseModel.relateForClass(v, val);
      }
    }
    return o != null;
  }
  public Object relateEliteEight(String var, Object val) {
    EliteEight oEliteEight = (EliteEight)this;
    switch(var) {
      case "sweetSixteen":
        if(oEliteEight.getSweetSixteen() == null)
          oEliteEight.setSweetSixteen(Optional.ofNullable(val).map(v -> v.toString()).orElse(null));
        if(!saves.contains("sweetSixteen"))
          saves.add("sweetSixteen");
        return val;
      case "guesserId":
        if(oEliteEight.getGuesserId() == null)
          oEliteEight.setGuesserId(Optional.ofNullable(val).map(v -> v.toString()).orElse(null));
        if(!saves.contains("guesserId"))
          saves.add("guesserId");
        return val;
      case "southGame1Winner":
        if(oEliteEight.getSouthGame1Winner() == null)
          oEliteEight.setSouthGame1Winner(Optional.ofNullable(val).map(v -> v.toString()).orElse(null));
        if(!saves.contains("southGame1Winner"))
          saves.add("southGame1Winner");
        return val;
      case "southGame1Loser":
        if(oEliteEight.getSouthGame1Loser() == null)
          oEliteEight.setSouthGame1Loser(Optional.ofNullable(val).map(v -> v.toString()).orElse(null));
        if(!saves.contains("southGame1Loser"))
          saves.add("southGame1Loser");
        return val;
      case "westGame1Winner":
        if(oEliteEight.getWestGame1Winner() == null)
          oEliteEight.setWestGame1Winner(Optional.ofNullable(val).map(v -> v.toString()).orElse(null));
        if(!saves.contains("westGame1Winner"))
          saves.add("westGame1Winner");
        return val;
      case "westGame1Loser":
        if(oEliteEight.getWestGame1Loser() == null)
          oEliteEight.setWestGame1Loser(Optional.ofNullable(val).map(v -> v.toString()).orElse(null));
        if(!saves.contains("westGame1Loser"))
          saves.add("westGame1Loser");
        return val;
      case "eastGame1Winner":
        if(oEliteEight.getEastGame1Winner() == null)
          oEliteEight.setEastGame1Winner(Optional.ofNullable(val).map(v -> v.toString()).orElse(null));
        if(!saves.contains("eastGame1Winner"))
          saves.add("eastGame1Winner");
        return val;
      case "eastGame1Loser":
        if(oEliteEight.getEastGame1Loser() == null)
          oEliteEight.setEastGame1Loser(Optional.ofNullable(val).map(v -> v.toString()).orElse(null));
        if(!saves.contains("eastGame1Loser"))
          saves.add("eastGame1Loser");
        return val;
      case "midwestGame1Winner":
        if(oEliteEight.getMidwestGame1Winner() == null)
          oEliteEight.setMidwestGame1Winner(Optional.ofNullable(val).map(v -> v.toString()).orElse(null));
        if(!saves.contains("midwestGame1Winner"))
          saves.add("midwestGame1Winner");
        return val;
      case "midwestGame1Loser":
        if(oEliteEight.getMidwestGame1Loser() == null)
          oEliteEight.setMidwestGame1Loser(Optional.ofNullable(val).map(v -> v.toString()).orElse(null));
        if(!saves.contains("midwestGame1Loser"))
          saves.add("midwestGame1Loser");
        return val;
      case "finalFour":
        if(oEliteEight.getFinalFour() == null)
          oEliteEight.setFinalFour(Optional.ofNullable(val).map(v -> v.toString()).orElse(null));
        if(!saves.contains("finalFour"))
          saves.add("finalFour");
        return val;
      default:
        return super.relateBaseModel(var, val);
    }
  }

  ///////////////
  // staticSet //
  ///////////////

  public static Object staticSetForClass(String entityVar, SiteRequest siteRequest_, String v, EliteEight o) {
    return staticSetEliteEight(entityVar,  siteRequest_, v, o);
  }
  public static Object staticSetEliteEight(String entityVar, SiteRequest siteRequest_, String v, EliteEight o) {
    switch(entityVar) {
    case "actualSweetSixteen":
      return EliteEight.staticSetActualSweetSixteen(siteRequest_, v);
    case "actualEliteEight":
      return EliteEight.staticSetActualEliteEight(siteRequest_, v);
    case "sweetSixteen":
      return EliteEight.staticSetSweetSixteen(siteRequest_, v);
    case "guesserId":
      return EliteEight.staticSetGuesserId(siteRequest_, v);
    case "year":
      return EliteEight.staticSetYear(siteRequest_, v);
    case "bracketId":
      return EliteEight.staticSetBracketId(siteRequest_, v);
    case "name":
      return EliteEight.staticSetName(siteRequest_, v);
    case "southGame1WinnerGuess":
      return EliteEight.staticSetSouthGame1WinnerGuess(siteRequest_, v);
    case "southGame1Winner":
      return EliteEight.staticSetSouthGame1Winner(siteRequest_, v);
    case "southGame1Loser":
      return EliteEight.staticSetSouthGame1Loser(siteRequest_, v);
    case "westGame1WinnerGuess":
      return EliteEight.staticSetWestGame1WinnerGuess(siteRequest_, v);
    case "westGame1Winner":
      return EliteEight.staticSetWestGame1Winner(siteRequest_, v);
    case "westGame1Loser":
      return EliteEight.staticSetWestGame1Loser(siteRequest_, v);
    case "eastGame1WinnerGuess":
      return EliteEight.staticSetEastGame1WinnerGuess(siteRequest_, v);
    case "eastGame1Winner":
      return EliteEight.staticSetEastGame1Winner(siteRequest_, v);
    case "eastGame1Loser":
      return EliteEight.staticSetEastGame1Loser(siteRequest_, v);
    case "midwestGame1WinnerGuess":
      return EliteEight.staticSetMidwestGame1WinnerGuess(siteRequest_, v);
    case "midwestGame1Winner":
      return EliteEight.staticSetMidwestGame1Winner(siteRequest_, v);
    case "midwestGame1Loser":
      return EliteEight.staticSetMidwestGame1Loser(siteRequest_, v);
    case "finalFour":
      return EliteEight.staticSetFinalFour(siteRequest_, v);
    case "correctGuesses":
      return EliteEight.staticSetCorrectGuesses(siteRequest_, v);
    case "incorrectGuesses":
      return EliteEight.staticSetIncorrectGuesses(siteRequest_, v);
      default:
        return BaseModel.staticSetBaseModel(entityVar,  siteRequest_, v, o);
    }
  }

  //////////////////
  // staticSearch //
  //////////////////

  public static Future<EliteEight> fqEliteEight(SiteRequest siteRequest, String var, Object val) {
    Promise<EliteEight> promise = Promise.promise();
    try {
      if(val == null) {
        promise.complete();
      } else {
        SearchList<EliteEight> searchList = new SearchList<EliteEight>();
        searchList.setStore(true);
        searchList.q("*:*");
        searchList.setC(EliteEight.class);
        searchList.fq(String.format("%s:", EliteEight.varIndexedEliteEight(var)) + SearchTool.escapeQueryChars(val.toString()));
        searchList.promiseDeepForClass(siteRequest).onSuccess(a -> {
          try {
            promise.complete(searchList.getList().stream().findFirst().orElse(null));
          } catch(Throwable ex) {
            LOG.error("Error while querying theelite eight bracket", ex);
            promise.fail(ex);
          }
        }).onFailure(ex -> {
          LOG.error("Error while querying theelite eight bracket", ex);
          promise.fail(ex);
        });
      }
    } catch(Throwable ex) {
      LOG.error("Error while querying theelite eight bracket", ex);
      promise.fail(ex);
    }
    return promise.future();
  }

  public static Object staticSearchForClass(String entityVar, SiteRequest siteRequest_, Object o) {
    return staticSearchEliteEight(entityVar,  siteRequest_, o);
  }
  public static Object staticSearchEliteEight(String entityVar, SiteRequest siteRequest_, Object o) {
    switch(entityVar) {
    case "actualSweetSixteen":
      return EliteEight.staticSearchActualSweetSixteen(siteRequest_, (JsonObject)o);
    case "actualEliteEight":
      return EliteEight.staticSearchActualEliteEight(siteRequest_, (JsonObject)o);
    case "sweetSixteen":
      return EliteEight.staticSearchSweetSixteen(siteRequest_, (String)o);
    case "guesserId":
      return EliteEight.staticSearchGuesserId(siteRequest_, (String)o);
    case "year":
      return EliteEight.staticSearchYear(siteRequest_, (Integer)o);
    case "bracketId":
      return EliteEight.staticSearchBracketId(siteRequest_, (String)o);
    case "name":
      return EliteEight.staticSearchName(siteRequest_, (String)o);
    case "southGame1WinnerGuess":
      return EliteEight.staticSearchSouthGame1WinnerGuess(siteRequest_, (String)o);
    case "southGame1Winner":
      return EliteEight.staticSearchSouthGame1Winner(siteRequest_, (String)o);
    case "southGame1Loser":
      return EliteEight.staticSearchSouthGame1Loser(siteRequest_, (String)o);
    case "westGame1WinnerGuess":
      return EliteEight.staticSearchWestGame1WinnerGuess(siteRequest_, (String)o);
    case "westGame1Winner":
      return EliteEight.staticSearchWestGame1Winner(siteRequest_, (String)o);
    case "westGame1Loser":
      return EliteEight.staticSearchWestGame1Loser(siteRequest_, (String)o);
    case "eastGame1WinnerGuess":
      return EliteEight.staticSearchEastGame1WinnerGuess(siteRequest_, (String)o);
    case "eastGame1Winner":
      return EliteEight.staticSearchEastGame1Winner(siteRequest_, (String)o);
    case "eastGame1Loser":
      return EliteEight.staticSearchEastGame1Loser(siteRequest_, (String)o);
    case "midwestGame1WinnerGuess":
      return EliteEight.staticSearchMidwestGame1WinnerGuess(siteRequest_, (String)o);
    case "midwestGame1Winner":
      return EliteEight.staticSearchMidwestGame1Winner(siteRequest_, (String)o);
    case "midwestGame1Loser":
      return EliteEight.staticSearchMidwestGame1Loser(siteRequest_, (String)o);
    case "finalFour":
      return EliteEight.staticSearchFinalFour(siteRequest_, (String)o);
    case "correctGuesses":
      return EliteEight.staticSearchCorrectGuesses(siteRequest_, (Integer)o);
    case "incorrectGuesses":
      return EliteEight.staticSearchIncorrectGuesses(siteRequest_, (Integer)o);
      default:
        return BaseModel.staticSearchBaseModel(entityVar,  siteRequest_, o);
    }
  }

  ///////////////////
  // staticSearchStr //
  ///////////////////

  public static String staticSearchStrForClass(String entityVar, SiteRequest siteRequest_, Object o) {
    return staticSearchStrEliteEight(entityVar,  siteRequest_, o);
  }
  public static String staticSearchStrEliteEight(String entityVar, SiteRequest siteRequest_, Object o) {
    switch(entityVar) {
    case "actualSweetSixteen":
      return EliteEight.staticSearchStrActualSweetSixteen(siteRequest_, (String)o);
    case "actualEliteEight":
      return EliteEight.staticSearchStrActualEliteEight(siteRequest_, (String)o);
    case "sweetSixteen":
      return EliteEight.staticSearchStrSweetSixteen(siteRequest_, (String)o);
    case "guesserId":
      return EliteEight.staticSearchStrGuesserId(siteRequest_, (String)o);
    case "year":
      return EliteEight.staticSearchStrYear(siteRequest_, (Integer)o);
    case "bracketId":
      return EliteEight.staticSearchStrBracketId(siteRequest_, (String)o);
    case "name":
      return EliteEight.staticSearchStrName(siteRequest_, (String)o);
    case "southGame1WinnerGuess":
      return EliteEight.staticSearchStrSouthGame1WinnerGuess(siteRequest_, (String)o);
    case "southGame1Winner":
      return EliteEight.staticSearchStrSouthGame1Winner(siteRequest_, (String)o);
    case "southGame1Loser":
      return EliteEight.staticSearchStrSouthGame1Loser(siteRequest_, (String)o);
    case "westGame1WinnerGuess":
      return EliteEight.staticSearchStrWestGame1WinnerGuess(siteRequest_, (String)o);
    case "westGame1Winner":
      return EliteEight.staticSearchStrWestGame1Winner(siteRequest_, (String)o);
    case "westGame1Loser":
      return EliteEight.staticSearchStrWestGame1Loser(siteRequest_, (String)o);
    case "eastGame1WinnerGuess":
      return EliteEight.staticSearchStrEastGame1WinnerGuess(siteRequest_, (String)o);
    case "eastGame1Winner":
      return EliteEight.staticSearchStrEastGame1Winner(siteRequest_, (String)o);
    case "eastGame1Loser":
      return EliteEight.staticSearchStrEastGame1Loser(siteRequest_, (String)o);
    case "midwestGame1WinnerGuess":
      return EliteEight.staticSearchStrMidwestGame1WinnerGuess(siteRequest_, (String)o);
    case "midwestGame1Winner":
      return EliteEight.staticSearchStrMidwestGame1Winner(siteRequest_, (String)o);
    case "midwestGame1Loser":
      return EliteEight.staticSearchStrMidwestGame1Loser(siteRequest_, (String)o);
    case "finalFour":
      return EliteEight.staticSearchStrFinalFour(siteRequest_, (String)o);
    case "correctGuesses":
      return EliteEight.staticSearchStrCorrectGuesses(siteRequest_, (Integer)o);
    case "incorrectGuesses":
      return EliteEight.staticSearchStrIncorrectGuesses(siteRequest_, (Integer)o);
      default:
        return BaseModel.staticSearchStrBaseModel(entityVar,  siteRequest_, o);
    }
  }

  //////////////////
  // staticSearchFq //
  //////////////////

  public static String staticSearchFqForClass(String entityVar, SiteRequest siteRequest_, String o) {
    return staticSearchFqEliteEight(entityVar,  siteRequest_, o);
  }
  public static String staticSearchFqEliteEight(String entityVar, SiteRequest siteRequest_, String o) {
    switch(entityVar) {
    case "actualSweetSixteen":
      return EliteEight.staticSearchFqActualSweetSixteen(siteRequest_, o);
    case "actualEliteEight":
      return EliteEight.staticSearchFqActualEliteEight(siteRequest_, o);
    case "sweetSixteen":
      return EliteEight.staticSearchFqSweetSixteen(siteRequest_, o);
    case "guesserId":
      return EliteEight.staticSearchFqGuesserId(siteRequest_, o);
    case "year":
      return EliteEight.staticSearchFqYear(siteRequest_, o);
    case "bracketId":
      return EliteEight.staticSearchFqBracketId(siteRequest_, o);
    case "name":
      return EliteEight.staticSearchFqName(siteRequest_, o);
    case "southGame1WinnerGuess":
      return EliteEight.staticSearchFqSouthGame1WinnerGuess(siteRequest_, o);
    case "southGame1Winner":
      return EliteEight.staticSearchFqSouthGame1Winner(siteRequest_, o);
    case "southGame1Loser":
      return EliteEight.staticSearchFqSouthGame1Loser(siteRequest_, o);
    case "westGame1WinnerGuess":
      return EliteEight.staticSearchFqWestGame1WinnerGuess(siteRequest_, o);
    case "westGame1Winner":
      return EliteEight.staticSearchFqWestGame1Winner(siteRequest_, o);
    case "westGame1Loser":
      return EliteEight.staticSearchFqWestGame1Loser(siteRequest_, o);
    case "eastGame1WinnerGuess":
      return EliteEight.staticSearchFqEastGame1WinnerGuess(siteRequest_, o);
    case "eastGame1Winner":
      return EliteEight.staticSearchFqEastGame1Winner(siteRequest_, o);
    case "eastGame1Loser":
      return EliteEight.staticSearchFqEastGame1Loser(siteRequest_, o);
    case "midwestGame1WinnerGuess":
      return EliteEight.staticSearchFqMidwestGame1WinnerGuess(siteRequest_, o);
    case "midwestGame1Winner":
      return EliteEight.staticSearchFqMidwestGame1Winner(siteRequest_, o);
    case "midwestGame1Loser":
      return EliteEight.staticSearchFqMidwestGame1Loser(siteRequest_, o);
    case "finalFour":
      return EliteEight.staticSearchFqFinalFour(siteRequest_, o);
    case "correctGuesses":
      return EliteEight.staticSearchFqCorrectGuesses(siteRequest_, o);
    case "incorrectGuesses":
      return EliteEight.staticSearchFqIncorrectGuesses(siteRequest_, o);
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
          o = persistEliteEight(v, val);
        else if(o instanceof BaseModel) {
          BaseModel oBaseModel = (BaseModel)o;
          o = oBaseModel.persistForClass(v, val);
        }
      }
    }
    return o != null;
  }
  public Object persistEliteEight(String var, Object val) {
    String varLower = var.toLowerCase();
      if("sweetsixteen".equals(varLower)) {
        if(val instanceof String) {
          setSweetSixteen((String)val);
        }
        saves.add("sweetSixteen");
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
      } else if("finalfour".equals(varLower)) {
        if(val instanceof String) {
          setFinalFour((String)val);
        }
        saves.add("finalFour");
        return val;
    } else {
      return super.persistBaseModel(var, val);
    }
  }

  /////////////
  // populate //
  /////////////

  @Override public void populateForClass(SolrResponse.Doc doc) {
    populateEliteEight(doc);
  }
  public void populateEliteEight(SolrResponse.Doc doc) {
    EliteEight oEliteEight = (EliteEight)this;
    saves = Optional.ofNullable((ArrayList<String>)doc.get("saves_docvalues_strings")).orElse(new ArrayList<String>());
    if(saves != null) {

      if(saves.contains("actualSweetSixteen")) {
        String actualSweetSixteen = (String)doc.get("actualSweetSixteen_stored_string");
        if(actualSweetSixteen != null)
          oEliteEight.setActualSweetSixteen(actualSweetSixteen);
      }

      if(saves.contains("actualEliteEight")) {
        String actualEliteEight = (String)doc.get("actualEliteEight_stored_string");
        if(actualEliteEight != null)
          oEliteEight.setActualEliteEight(actualEliteEight);
      }

      String sweetSixteen = (String)doc.get("sweetSixteen_docvalues_string");
      if(sweetSixteen != null)
        oEliteEight.setSweetSixteen(sweetSixteen);

      String guesserId = (String)doc.get("guesserId_docvalues_string");
      if(guesserId != null)
        oEliteEight.setGuesserId(guesserId);

      if(saves.contains("year")) {
        Integer year = (Integer)doc.get("year_docvalues_int");
        if(year != null)
          oEliteEight.setYear(year);
      }

      if(saves.contains("bracketId")) {
        String bracketId = (String)doc.get("bracketId_docvalues_string");
        if(bracketId != null)
          oEliteEight.setBracketId(bracketId);
      }

      if(saves.contains("name")) {
        String name = (String)doc.get("name_docvalues_string");
        if(name != null)
          oEliteEight.setName(name);
      }

      if(saves.contains("southGame1WinnerGuess")) {
        String southGame1WinnerGuess = (String)doc.get("southGame1WinnerGuess_docvalues_string");
        if(southGame1WinnerGuess != null)
          oEliteEight.setSouthGame1WinnerGuess(southGame1WinnerGuess);
      }

      String southGame1Winner = (String)doc.get("southGame1Winner_docvalues_string");
      if(southGame1Winner != null)
        oEliteEight.setSouthGame1Winner(southGame1Winner);

      String southGame1Loser = (String)doc.get("southGame1Loser_docvalues_string");
      if(southGame1Loser != null)
        oEliteEight.setSouthGame1Loser(southGame1Loser);

      if(saves.contains("westGame1WinnerGuess")) {
        String westGame1WinnerGuess = (String)doc.get("westGame1WinnerGuess_docvalues_string");
        if(westGame1WinnerGuess != null)
          oEliteEight.setWestGame1WinnerGuess(westGame1WinnerGuess);
      }

      String westGame1Winner = (String)doc.get("westGame1Winner_docvalues_string");
      if(westGame1Winner != null)
        oEliteEight.setWestGame1Winner(westGame1Winner);

      String westGame1Loser = (String)doc.get("westGame1Loser_docvalues_string");
      if(westGame1Loser != null)
        oEliteEight.setWestGame1Loser(westGame1Loser);

      if(saves.contains("eastGame1WinnerGuess")) {
        String eastGame1WinnerGuess = (String)doc.get("eastGame1WinnerGuess_docvalues_string");
        if(eastGame1WinnerGuess != null)
          oEliteEight.setEastGame1WinnerGuess(eastGame1WinnerGuess);
      }

      String eastGame1Winner = (String)doc.get("eastGame1Winner_docvalues_string");
      if(eastGame1Winner != null)
        oEliteEight.setEastGame1Winner(eastGame1Winner);

      String eastGame1Loser = (String)doc.get("eastGame1Loser_docvalues_string");
      if(eastGame1Loser != null)
        oEliteEight.setEastGame1Loser(eastGame1Loser);

      if(saves.contains("midwestGame1WinnerGuess")) {
        String midwestGame1WinnerGuess = (String)doc.get("midwestGame1WinnerGuess_docvalues_string");
        if(midwestGame1WinnerGuess != null)
          oEliteEight.setMidwestGame1WinnerGuess(midwestGame1WinnerGuess);
      }

      String midwestGame1Winner = (String)doc.get("midwestGame1Winner_docvalues_string");
      if(midwestGame1Winner != null)
        oEliteEight.setMidwestGame1Winner(midwestGame1Winner);

      String midwestGame1Loser = (String)doc.get("midwestGame1Loser_docvalues_string");
      if(midwestGame1Loser != null)
        oEliteEight.setMidwestGame1Loser(midwestGame1Loser);

      String finalFour = (String)doc.get("finalFour_docvalues_string");
      if(finalFour != null)
        oEliteEight.setFinalFour(finalFour);

      if(saves.contains("correctGuesses")) {
        Integer correctGuesses = (Integer)doc.get("correctGuesses_docvalues_int");
        if(correctGuesses != null)
          oEliteEight.setCorrectGuesses(correctGuesses);
      }

      if(saves.contains("incorrectGuesses")) {
        Integer incorrectGuesses = (Integer)doc.get("incorrectGuesses_docvalues_int");
        if(incorrectGuesses != null)
          oEliteEight.setIncorrectGuesses(incorrectGuesses);
      }
    }

    super.populateBaseModel(doc);
  }

  public void indexEliteEight(JsonObject doc) {
    if(actualSweetSixteen != null) {
      doc.put("actualSweetSixteen_stored_string", actualSweetSixteen.toString());
    }
    if(actualEliteEight != null) {
      doc.put("actualEliteEight_stored_string", actualEliteEight.toString());
    }
    if(sweetSixteen != null) {
      doc.put("sweetSixteen_docvalues_string", sweetSixteen);
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
    if(westGame1WinnerGuess != null) {
      doc.put("westGame1WinnerGuess_docvalues_string", westGame1WinnerGuess);
    }
    if(westGame1Winner != null) {
      doc.put("westGame1Winner_docvalues_string", westGame1Winner);
    }
    if(westGame1Loser != null) {
      doc.put("westGame1Loser_docvalues_string", westGame1Loser);
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
    if(midwestGame1WinnerGuess != null) {
      doc.put("midwestGame1WinnerGuess_docvalues_string", midwestGame1WinnerGuess);
    }
    if(midwestGame1Winner != null) {
      doc.put("midwestGame1Winner_docvalues_string", midwestGame1Winner);
    }
    if(midwestGame1Loser != null) {
      doc.put("midwestGame1Loser_docvalues_string", midwestGame1Loser);
    }
    if(finalFour != null) {
      doc.put("finalFour_docvalues_string", finalFour);
    }
    if(correctGuesses != null) {
      doc.put("correctGuesses_docvalues_int", correctGuesses);
    }
    if(incorrectGuesses != null) {
      doc.put("incorrectGuesses_docvalues_int", incorrectGuesses);
    }
    super.indexBaseModel(doc);

	}

  public static String varStoredEliteEight(String entityVar) {
    switch(entityVar) {
      case "actualSweetSixteen":
        return "actualSweetSixteen_stored_string";
      case "actualEliteEight":
        return "actualEliteEight_stored_string";
      case "sweetSixteen":
        return "sweetSixteen_docvalues_string";
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
      case "westGame1WinnerGuess":
        return "westGame1WinnerGuess_docvalues_string";
      case "westGame1Winner":
        return "westGame1Winner_docvalues_string";
      case "westGame1Loser":
        return "westGame1Loser_docvalues_string";
      case "eastGame1WinnerGuess":
        return "eastGame1WinnerGuess_docvalues_string";
      case "eastGame1Winner":
        return "eastGame1Winner_docvalues_string";
      case "eastGame1Loser":
        return "eastGame1Loser_docvalues_string";
      case "midwestGame1WinnerGuess":
        return "midwestGame1WinnerGuess_docvalues_string";
      case "midwestGame1Winner":
        return "midwestGame1Winner_docvalues_string";
      case "midwestGame1Loser":
        return "midwestGame1Loser_docvalues_string";
      case "finalFour":
        return "finalFour_docvalues_string";
      case "correctGuesses":
        return "correctGuesses_docvalues_int";
      case "incorrectGuesses":
        return "incorrectGuesses_docvalues_int";
      default:
        return BaseModel.varStoredBaseModel(entityVar);
    }
  }

  public static String varIndexedEliteEight(String entityVar) {
    switch(entityVar) {
      case "sweetSixteen":
        return "sweetSixteen_docvalues_string";
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
      case "westGame1WinnerGuess":
        return "westGame1WinnerGuess_docvalues_string";
      case "westGame1Winner":
        return "westGame1Winner_docvalues_string";
      case "westGame1Loser":
        return "westGame1Loser_docvalues_string";
      case "eastGame1WinnerGuess":
        return "eastGame1WinnerGuess_docvalues_string";
      case "eastGame1Winner":
        return "eastGame1Winner_docvalues_string";
      case "eastGame1Loser":
        return "eastGame1Loser_docvalues_string";
      case "midwestGame1WinnerGuess":
        return "midwestGame1WinnerGuess_docvalues_string";
      case "midwestGame1Winner":
        return "midwestGame1Winner_docvalues_string";
      case "midwestGame1Loser":
        return "midwestGame1Loser_docvalues_string";
      case "finalFour":
        return "finalFour_docvalues_string";
      case "correctGuesses":
        return "correctGuesses_docvalues_int";
      case "incorrectGuesses":
        return "incorrectGuesses_docvalues_int";
      default:
        return BaseModel.varIndexedBaseModel(entityVar);
    }
  }

  public static String searchVarEliteEight(String searchVar) {
    switch(searchVar) {
      case "sweetSixteen_docvalues_string":
        return "sweetSixteen";
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
      case "westGame1WinnerGuess_docvalues_string":
        return "westGame1WinnerGuess";
      case "westGame1Winner_docvalues_string":
        return "westGame1Winner";
      case "westGame1Loser_docvalues_string":
        return "westGame1Loser";
      case "eastGame1WinnerGuess_docvalues_string":
        return "eastGame1WinnerGuess";
      case "eastGame1Winner_docvalues_string":
        return "eastGame1Winner";
      case "eastGame1Loser_docvalues_string":
        return "eastGame1Loser";
      case "midwestGame1WinnerGuess_docvalues_string":
        return "midwestGame1WinnerGuess";
      case "midwestGame1Winner_docvalues_string":
        return "midwestGame1Winner";
      case "midwestGame1Loser_docvalues_string":
        return "midwestGame1Loser";
      case "finalFour_docvalues_string":
        return "finalFour";
      case "correctGuesses_docvalues_int":
        return "correctGuesses";
      case "incorrectGuesses_docvalues_int":
        return "incorrectGuesses";
      default:
        return BaseModel.searchVarBaseModel(searchVar);
    }
  }

  public static String varSearchEliteEight(String entityVar) {
    switch(entityVar) {
      default:
        return BaseModel.varSearchBaseModel(entityVar);
    }
  }

  public static String varSuggestedEliteEight(String entityVar) {
    switch(entityVar) {
      default:
        return BaseModel.varSuggestedBaseModel(entityVar);
    }
  }

  /////////////
  // store //
  /////////////

  @Override public void storeForClass(SolrResponse.Doc doc) {
    storeEliteEight(doc);
  }
  public void storeEliteEight(SolrResponse.Doc doc) {
    EliteEight oEliteEight = (EliteEight)this;
    SiteRequest siteRequest = oEliteEight.getSiteRequest_();

    oEliteEight.setActualSweetSixteen(Optional.ofNullable(doc.get("actualSweetSixteen_stored_string")).map(v -> v.toString()).orElse(null));
    oEliteEight.setActualEliteEight(Optional.ofNullable(doc.get("actualEliteEight_stored_string")).map(v -> v.toString()).orElse(null));
    oEliteEight.setSweetSixteen(Optional.ofNullable(doc.get("sweetSixteen_docvalues_string")).map(v -> v.toString()).orElse(null));
    oEliteEight.setGuesserId(Optional.ofNullable(doc.get("guesserId_docvalues_string")).map(v -> v.toString()).orElse(null));
    oEliteEight.setYear(Optional.ofNullable(doc.get("year_docvalues_int")).map(v -> v.toString()).orElse(null));
    oEliteEight.setBracketId(Optional.ofNullable(doc.get("bracketId_docvalues_string")).map(v -> v.toString()).orElse(null));
    oEliteEight.setName(Optional.ofNullable(doc.get("name_docvalues_string")).map(v -> v.toString()).orElse(null));
    oEliteEight.setSouthGame1WinnerGuess(Optional.ofNullable(doc.get("southGame1WinnerGuess_docvalues_string")).map(v -> v.toString()).orElse(null));
    oEliteEight.setSouthGame1Winner(Optional.ofNullable(doc.get("southGame1Winner_docvalues_string")).map(v -> v.toString()).orElse(null));
    oEliteEight.setSouthGame1Loser(Optional.ofNullable(doc.get("southGame1Loser_docvalues_string")).map(v -> v.toString()).orElse(null));
    oEliteEight.setWestGame1WinnerGuess(Optional.ofNullable(doc.get("westGame1WinnerGuess_docvalues_string")).map(v -> v.toString()).orElse(null));
    oEliteEight.setWestGame1Winner(Optional.ofNullable(doc.get("westGame1Winner_docvalues_string")).map(v -> v.toString()).orElse(null));
    oEliteEight.setWestGame1Loser(Optional.ofNullable(doc.get("westGame1Loser_docvalues_string")).map(v -> v.toString()).orElse(null));
    oEliteEight.setEastGame1WinnerGuess(Optional.ofNullable(doc.get("eastGame1WinnerGuess_docvalues_string")).map(v -> v.toString()).orElse(null));
    oEliteEight.setEastGame1Winner(Optional.ofNullable(doc.get("eastGame1Winner_docvalues_string")).map(v -> v.toString()).orElse(null));
    oEliteEight.setEastGame1Loser(Optional.ofNullable(doc.get("eastGame1Loser_docvalues_string")).map(v -> v.toString()).orElse(null));
    oEliteEight.setMidwestGame1WinnerGuess(Optional.ofNullable(doc.get("midwestGame1WinnerGuess_docvalues_string")).map(v -> v.toString()).orElse(null));
    oEliteEight.setMidwestGame1Winner(Optional.ofNullable(doc.get("midwestGame1Winner_docvalues_string")).map(v -> v.toString()).orElse(null));
    oEliteEight.setMidwestGame1Loser(Optional.ofNullable(doc.get("midwestGame1Loser_docvalues_string")).map(v -> v.toString()).orElse(null));
    oEliteEight.setFinalFour(Optional.ofNullable(doc.get("finalFour_docvalues_string")).map(v -> v.toString()).orElse(null));
    oEliteEight.setCorrectGuesses(Optional.ofNullable(doc.get("correctGuesses_docvalues_int")).map(v -> v.toString()).orElse(null));
    oEliteEight.setIncorrectGuesses(Optional.ofNullable(doc.get("incorrectGuesses_docvalues_int")).map(v -> v.toString()).orElse(null));

    super.storeBaseModel(doc);
  }

  //////////////////
  // apiRequest //
  //////////////////

  public void apiRequestEliteEight() {
    ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(r -> r.getApiRequest_()).orElse(null);
    Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
    if(o != null && o instanceof EliteEight) {
      EliteEight original = (EliteEight)o;
      if(!Objects.equals(actualSweetSixteen, original.getActualSweetSixteen()))
        apiRequest.addVars("actualSweetSixteen");
      if(!Objects.equals(actualEliteEight, original.getActualEliteEight()))
        apiRequest.addVars("actualEliteEight");
      if(!Objects.equals(sweetSixteen, original.getSweetSixteen()))
        apiRequest.addVars("sweetSixteen");
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
      if(!Objects.equals(westGame1WinnerGuess, original.getWestGame1WinnerGuess()))
        apiRequest.addVars("westGame1WinnerGuess");
      if(!Objects.equals(westGame1Winner, original.getWestGame1Winner()))
        apiRequest.addVars("westGame1Winner");
      if(!Objects.equals(westGame1Loser, original.getWestGame1Loser()))
        apiRequest.addVars("westGame1Loser");
      if(!Objects.equals(eastGame1WinnerGuess, original.getEastGame1WinnerGuess()))
        apiRequest.addVars("eastGame1WinnerGuess");
      if(!Objects.equals(eastGame1Winner, original.getEastGame1Winner()))
        apiRequest.addVars("eastGame1Winner");
      if(!Objects.equals(eastGame1Loser, original.getEastGame1Loser()))
        apiRequest.addVars("eastGame1Loser");
      if(!Objects.equals(midwestGame1WinnerGuess, original.getMidwestGame1WinnerGuess()))
        apiRequest.addVars("midwestGame1WinnerGuess");
      if(!Objects.equals(midwestGame1Winner, original.getMidwestGame1Winner()))
        apiRequest.addVars("midwestGame1Winner");
      if(!Objects.equals(midwestGame1Loser, original.getMidwestGame1Loser()))
        apiRequest.addVars("midwestGame1Loser");
      if(!Objects.equals(finalFour, original.getFinalFour()))
        apiRequest.addVars("finalFour");
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
    sb.append(Optional.ofNullable(actualEliteEight).map(v -> "actualEliteEight: " + v + "\n").orElse(""));
    sb.append(Optional.ofNullable(sweetSixteen).map(v -> "sweetSixteen: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(guesserId).map(v -> "guesserId: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(year).map(v -> "year: " + v + "\n").orElse(""));
    sb.append(Optional.ofNullable(bracketId).map(v -> "bracketId: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(name).map(v -> "name: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(southGame1WinnerGuess).map(v -> "southGame1WinnerGuess: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(southGame1Winner).map(v -> "southGame1Winner: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(southGame1Loser).map(v -> "southGame1Loser: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(westGame1WinnerGuess).map(v -> "westGame1WinnerGuess: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(westGame1Winner).map(v -> "westGame1Winner: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(westGame1Loser).map(v -> "westGame1Loser: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(eastGame1WinnerGuess).map(v -> "eastGame1WinnerGuess: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(eastGame1Winner).map(v -> "eastGame1Winner: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(eastGame1Loser).map(v -> "eastGame1Loser: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(midwestGame1WinnerGuess).map(v -> "midwestGame1WinnerGuess: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(midwestGame1Winner).map(v -> "midwestGame1Winner: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(midwestGame1Loser).map(v -> "midwestGame1Loser: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(finalFour).map(v -> "finalFour: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(correctGuesses).map(v -> "correctGuesses: " + v + "\n").orElse(""));
    sb.append(Optional.ofNullable(incorrectGuesses).map(v -> "incorrectGuesses: " + v + "\n").orElse(""));
    return sb.toString();
  }

  public static final String CLASS_SIMPLE_NAME = "EliteEight";
  public static final String CLASS_CANONICAL_NAME = "org.computate.spinechamp.model.eliteeight.EliteEight";
  public static final String CLASS_AUTH_RESOURCE = "ELITEEIGHT";
  public static final String CLASS_API_ADDRESS_EliteEight = "spine-champ-enUS-EliteEight";
  public static String getClassApiAddress() {
    return CLASS_API_ADDRESS_EliteEight;
  }
  public static final String VAR_actualSweetSixteenSearch = "actualSweetSixteenSearch";
  public static final String SET_actualSweetSixteenSearch = "setActualSweetSixteenSearch";
  public static final String VAR_actualSweetSixteen = "actualSweetSixteen";
  public static final String SET_actualSweetSixteen = "setActualSweetSixteen";
  public static final String VAR_actualEliteEightSearch = "actualEliteEightSearch";
  public static final String SET_actualEliteEightSearch = "setActualEliteEightSearch";
  public static final String VAR_actualEliteEight = "actualEliteEight";
  public static final String SET_actualEliteEight = "setActualEliteEight";
  public static final String VAR_sweetSixteen = "sweetSixteen";
  public static final String SET_sweetSixteen = "setSweetSixteen";
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
  public static final String VAR_westGame1WinnerGuess = "westGame1WinnerGuess";
  public static final String SET_westGame1WinnerGuess = "setWestGame1WinnerGuess";
  public static final String VAR_westGame1Winner = "westGame1Winner";
  public static final String SET_westGame1Winner = "setWestGame1Winner";
  public static final String VAR_westGame1Loser = "westGame1Loser";
  public static final String SET_westGame1Loser = "setWestGame1Loser";
  public static final String VAR_eastGame1WinnerGuess = "eastGame1WinnerGuess";
  public static final String SET_eastGame1WinnerGuess = "setEastGame1WinnerGuess";
  public static final String VAR_eastGame1Winner = "eastGame1Winner";
  public static final String SET_eastGame1Winner = "setEastGame1Winner";
  public static final String VAR_eastGame1Loser = "eastGame1Loser";
  public static final String SET_eastGame1Loser = "setEastGame1Loser";
  public static final String VAR_midwestGame1WinnerGuess = "midwestGame1WinnerGuess";
  public static final String SET_midwestGame1WinnerGuess = "setMidwestGame1WinnerGuess";
  public static final String VAR_midwestGame1Winner = "midwestGame1Winner";
  public static final String SET_midwestGame1Winner = "setMidwestGame1Winner";
  public static final String VAR_midwestGame1Loser = "midwestGame1Loser";
  public static final String SET_midwestGame1Loser = "setMidwestGame1Loser";
  public static final String VAR_finalFour = "finalFour";
  public static final String SET_finalFour = "setFinalFour";
  public static final String VAR_correctGuesses = "correctGuesses";
  public static final String SET_correctGuesses = "setCorrectGuesses";
  public static final String VAR_incorrectGuesses = "incorrectGuesses";
  public static final String SET_incorrectGuesses = "setIncorrectGuesses";

  public static List<String> varsQForClass() {
    return EliteEight.varsQEliteEight(new ArrayList<String>());
  }
  public static List<String> varsQEliteEight(List<String> vars) {
    BaseModel.varsQBaseModel(vars);
    return vars;
  }

  public static List<String> varsFqForClass() {
    return EliteEight.varsFqEliteEight(new ArrayList<String>());
  }
  public static List<String> varsFqEliteEight(List<String> vars) {
    BaseModel.varsFqBaseModel(vars);
    return vars;
  }

  public static List<String> varsRangeForClass() {
    return EliteEight.varsRangeEliteEight(new ArrayList<String>());
  }
  public static List<String> varsRangeEliteEight(List<String> vars) {
    BaseModel.varsRangeBaseModel(vars);
    return vars;
  }

  public static final String DISPLAY_NAME_actualSweetSixteenSearch = "";
  public static final String DISPLAY_NAME_actualSweetSixteen = "Actual Sweet Sixteen bracket";
  public static final String DISPLAY_NAME_actualEliteEightSearch = "";
  public static final String DISPLAY_NAME_actualEliteEight = "Actual Elite Eight bracket";
  public static final String DISPLAY_NAME_sweetSixteen = "Sweet Sixteen bracket";
  public static final String DISPLAY_NAME_guesserId = "guesser";
  public static final String DISPLAY_NAME_year = "year";
  public static final String DISPLAY_NAME_bracketId = "bracket ID";
  public static final String DISPLAY_NAME_name = "bracket name";
  public static final String DISPLAY_NAME_southGame1WinnerGuess = "South game 1 guess";
  public static final String DISPLAY_NAME_southGame1Winner = "South game 1 winner";
  public static final String DISPLAY_NAME_southGame1Loser = "South game 1 loser";
  public static final String DISPLAY_NAME_westGame1WinnerGuess = "Actual West game 1 winner";
  public static final String DISPLAY_NAME_westGame1Winner = "West game 1 winner";
  public static final String DISPLAY_NAME_westGame1Loser = "West game 1 loser";
  public static final String DISPLAY_NAME_eastGame1WinnerGuess = "Actual East game 1 winner";
  public static final String DISPLAY_NAME_eastGame1Winner = "East game 1 winner";
  public static final String DISPLAY_NAME_eastGame1Loser = "East game 1 loser";
  public static final String DISPLAY_NAME_midwestGame1WinnerGuess = "Actual Midwest game 1 winner";
  public static final String DISPLAY_NAME_midwestGame1Winner = "Midwest game 1 winner";
  public static final String DISPLAY_NAME_midwestGame1Loser = "Midwest game 1 loser";
  public static final String DISPLAY_NAME_finalFour = "Final Four bracket";
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
    return EliteEight.NameAdjectiveSingular_enUS;
  }

  @Override
  public String enUSStringFormatUrlEditPageForClass() {
    return "%s/en-us/edit/elite-eight/%s";
  }

  public static String varJsonForClass(String var, Boolean patch) {
    return EliteEight.varJsonEliteEight(var, patch);
  }
  public static String varJsonEliteEight(String var, Boolean patch) {
    switch(var) {
    case VAR_actualSweetSixteenSearch:
      return patch ? SET_actualSweetSixteenSearch : VAR_actualSweetSixteenSearch;
    case VAR_actualSweetSixteen:
      return patch ? SET_actualSweetSixteen : VAR_actualSweetSixteen;
    case VAR_actualEliteEightSearch:
      return patch ? SET_actualEliteEightSearch : VAR_actualEliteEightSearch;
    case VAR_actualEliteEight:
      return patch ? SET_actualEliteEight : VAR_actualEliteEight;
    case VAR_sweetSixteen:
      return patch ? SET_sweetSixteen : VAR_sweetSixteen;
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
    case VAR_westGame1WinnerGuess:
      return patch ? SET_westGame1WinnerGuess : VAR_westGame1WinnerGuess;
    case VAR_westGame1Winner:
      return patch ? SET_westGame1Winner : VAR_westGame1Winner;
    case VAR_westGame1Loser:
      return patch ? SET_westGame1Loser : VAR_westGame1Loser;
    case VAR_eastGame1WinnerGuess:
      return patch ? SET_eastGame1WinnerGuess : VAR_eastGame1WinnerGuess;
    case VAR_eastGame1Winner:
      return patch ? SET_eastGame1Winner : VAR_eastGame1Winner;
    case VAR_eastGame1Loser:
      return patch ? SET_eastGame1Loser : VAR_eastGame1Loser;
    case VAR_midwestGame1WinnerGuess:
      return patch ? SET_midwestGame1WinnerGuess : VAR_midwestGame1WinnerGuess;
    case VAR_midwestGame1Winner:
      return patch ? SET_midwestGame1Winner : VAR_midwestGame1Winner;
    case VAR_midwestGame1Loser:
      return patch ? SET_midwestGame1Loser : VAR_midwestGame1Loser;
    case VAR_finalFour:
      return patch ? SET_finalFour : VAR_finalFour;
    case VAR_correctGuesses:
      return patch ? SET_correctGuesses : VAR_correctGuesses;
    case VAR_incorrectGuesses:
      return patch ? SET_incorrectGuesses : VAR_incorrectGuesses;
    default:
      return BaseModel.varJsonBaseModel(var, patch);
    }
  }

  public static String displayNameForClass(String var) {
    return EliteEight.displayNameEliteEight(var);
  }
  public static String displayNameEliteEight(String var) {
    switch(var) {
    case VAR_actualSweetSixteenSearch:
      return DISPLAY_NAME_actualSweetSixteenSearch;
    case VAR_actualSweetSixteen:
      return DISPLAY_NAME_actualSweetSixteen;
    case VAR_actualEliteEightSearch:
      return DISPLAY_NAME_actualEliteEightSearch;
    case VAR_actualEliteEight:
      return DISPLAY_NAME_actualEliteEight;
    case VAR_sweetSixteen:
      return DISPLAY_NAME_sweetSixteen;
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
    case VAR_westGame1WinnerGuess:
      return DISPLAY_NAME_westGame1WinnerGuess;
    case VAR_westGame1Winner:
      return DISPLAY_NAME_westGame1Winner;
    case VAR_westGame1Loser:
      return DISPLAY_NAME_westGame1Loser;
    case VAR_eastGame1WinnerGuess:
      return DISPLAY_NAME_eastGame1WinnerGuess;
    case VAR_eastGame1Winner:
      return DISPLAY_NAME_eastGame1Winner;
    case VAR_eastGame1Loser:
      return DISPLAY_NAME_eastGame1Loser;
    case VAR_midwestGame1WinnerGuess:
      return DISPLAY_NAME_midwestGame1WinnerGuess;
    case VAR_midwestGame1Winner:
      return DISPLAY_NAME_midwestGame1Winner;
    case VAR_midwestGame1Loser:
      return DISPLAY_NAME_midwestGame1Loser;
    case VAR_finalFour:
      return DISPLAY_NAME_finalFour;
    case VAR_correctGuesses:
      return DISPLAY_NAME_correctGuesses;
    case VAR_incorrectGuesses:
      return DISPLAY_NAME_incorrectGuesses;
    default:
      return BaseModel.displayNameBaseModel(var);
    }
  }

  public static String descriptionEliteEight(String var) {
    if(var == null)
      return null;
    switch(var) {
    case VAR_actualSweetSixteen:
      return "The Sweet Sixteen bracket of this tournament";
    case VAR_actualEliteEight:
      return "The Elite Eight bracket of this tournament";
    case VAR_sweetSixteen:
      return "The Sweet Sixteen bracket of this tournament";
    case VAR_guesserId:
      return "The ID of this guesser";
    case VAR_year:
      return "The year of the tournament";
    case VAR_bracketId:
      return "The ID of this bracket";
    case VAR_name:
      return "The name of this bracket";
    case VAR_finalFour:
      return "The Final Four bracket of this tournament";
    case VAR_correctGuesses:
      return "The number of correct guesses in this Championship bracket";
    case VAR_incorrectGuesses:
      return "The number of incorrect guesses in this Championship bracket";
      default:
        return BaseModel.descriptionBaseModel(var);
    }
  }

  public static String classSimpleNameEliteEight(String var) {
    switch(var) {
    case VAR_actualSweetSixteenSearch:
      return "SearchList";
    case VAR_actualSweetSixteen:
      return "JsonObject";
    case VAR_actualEliteEightSearch:
      return "SearchList";
    case VAR_actualEliteEight:
      return "JsonObject";
    case VAR_sweetSixteen:
      return "String";
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
    case VAR_westGame1WinnerGuess:
      return "String";
    case VAR_westGame1Winner:
      return "String";
    case VAR_westGame1Loser:
      return "String";
    case VAR_eastGame1WinnerGuess:
      return "String";
    case VAR_eastGame1Winner:
      return "String";
    case VAR_eastGame1Loser:
      return "String";
    case VAR_midwestGame1WinnerGuess:
      return "String";
    case VAR_midwestGame1Winner:
      return "String";
    case VAR_midwestGame1Loser:
      return "String";
    case VAR_finalFour:
      return "String";
    case VAR_correctGuesses:
      return "Integer";
    case VAR_incorrectGuesses:
      return "Integer";
      default:
        return BaseModel.classSimpleNameBaseModel(var);
    }
  }

  public static Integer htmColumnEliteEight(String var) {
    switch(var) {
    case VAR_guesserId:
      return 0;
    case VAR_year:
      return 1;
      default:
        return BaseModel.htmColumnBaseModel(var);
    }
  }

  public static Integer htmRowEliteEight(String var) {
    switch(var) {
    case VAR_sweetSixteen:
      return 3;
    case VAR_guesserId:
      return 4;
    case VAR_year:
      return 4;
    case VAR_southGame1WinnerGuess:
      return 5;
    case VAR_southGame1Winner:
      return 5;
    case VAR_southGame1Loser:
      return 5;
    case VAR_westGame1WinnerGuess:
      return 6;
    case VAR_westGame1Winner:
      return 6;
    case VAR_westGame1Loser:
      return 6;
    case VAR_eastGame1WinnerGuess:
      return 7;
    case VAR_eastGame1Winner:
      return 7;
    case VAR_eastGame1Loser:
      return 7;
    case VAR_midwestGame1WinnerGuess:
      return 8;
    case VAR_midwestGame1Winner:
      return 8;
    case VAR_midwestGame1Loser:
      return 8;
    case VAR_finalFour:
      return 10;
    case VAR_correctGuesses:
      return 4;
    case VAR_incorrectGuesses:
      return 4;
      default:
        return BaseModel.htmRowBaseModel(var);
    }
  }

  public static Integer htmCellEliteEight(String var) {
    switch(var) {
    case VAR_sweetSixteen:
      return 0;
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
    case VAR_westGame1WinnerGuess:
      return 0;
    case VAR_westGame1Winner:
      return 1;
    case VAR_westGame1Loser:
      return 2;
    case VAR_eastGame1WinnerGuess:
      return 0;
    case VAR_eastGame1Winner:
      return 1;
    case VAR_eastGame1Loser:
      return 2;
    case VAR_midwestGame1WinnerGuess:
      return 0;
    case VAR_midwestGame1Winner:
      return 1;
    case VAR_midwestGame1Loser:
      return 2;
    case VAR_finalFour:
      return 0;
    case VAR_correctGuesses:
      return 2;
    case VAR_incorrectGuesses:
      return 3;
      default:
        return BaseModel.htmCellBaseModel(var);
    }
  }

  public static Integer lengthMinEliteEight(String var) {
    switch(var) {
      default:
        return BaseModel.lengthMinBaseModel(var);
    }
  }

  public static Integer lengthMaxEliteEight(String var) {
    switch(var) {
      default:
        return BaseModel.lengthMaxBaseModel(var);
    }
  }

  public static Integer maxEliteEight(String var) {
    switch(var) {
      default:
        return BaseModel.maxBaseModel(var);
    }
  }

  public static Integer minEliteEight(String var) {
    switch(var) {
      default:
        return BaseModel.minBaseModel(var);
    }
  }
}
