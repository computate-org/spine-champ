package org.computate.spinechamp.model.guesser;

import org.computate.spinechamp.request.SiteRequest;
import org.computate.spinechamp.page.PageLayout;
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
import org.computate.vertx.search.list.SearchList;
import org.computate.spinechamp.model.guesser.Guesser;
import java.lang.String;
import org.computate.search.response.solr.SolrResponse.Stats;
import org.computate.search.response.solr.SolrResponse.FacetCounts;
import io.vertx.core.json.JsonObject;
import org.computate.vertx.serialize.vertx.JsonObjectDeserializer;
import java.lang.Integer;
import java.time.ZoneId;
import java.util.Locale;
import java.lang.Long;
import java.time.ZonedDateTime;
import java.time.ZoneOffset;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.math.BigDecimal;
import io.vertx.core.json.JsonArray;
import org.computate.vertx.serialize.vertx.JsonArrayDeserializer;
import java.lang.Void;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;

/**
 * <ol>
<h3>Suggestions that can generate more code for you: </h3> * </ol>
 * <li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these GuesserGenPage objects in a RESTful API. 
 * </li><li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class GuesserGenPageGen into the class GuesserGenPage. 
 * </li>
 * <h3>About the GuesserGenPage class and it's generated class GuesserGenPageGen&lt;PageLayout&gt;: </h3>extends GuesserGenPageGen
 * <p>
 * This Java class extends a generated Java class GuesserGenPageGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.guesser.GuesserGenPage">Find the class GuesserGenPage in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends GuesserGenPageGen<PageLayout>
 * <p>This <code>class GuesserGenPage extends GuesserGenPageGen&lt;PageLayout&gt;</code>, which means it extends a newly generated GuesserGenPageGen. 
 * The generated <code>class GuesserGenPageGen extends PageLayout</code> which means that GuesserGenPage extends GuesserGenPageGen which extends PageLayout. 
 * This generated inheritance is a powerful feature that allows a lot of boiler plate code to be created for you automatically while still preserving inheritance through the power of Java Generic classes. 
 * </p>
 * <h2>Api: true</h2>
 * <h2>ApiTag.enUS: true</h2>
 * <h2>ApiUri.enUS: null</h2>
 * <h2>Color: null</h2>
 * <h2>Indexed: true</h2>
 * <h2>{@inheritDoc}</h2>
 * <p>By adding a class comment "{@inheritDoc}", the GuesserGenPage class will inherit the helpful inherited class comments from the super class GuesserGenPageGen. 
 * </p>
 * <h2>Rows: null</h2>
 * <h2>Model: true</h2>
 * <h2>Page: true</h2>
 * <h2>SuperPage.enUS: null</h2>
 * <h2>Promise: true</h2>
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the GuesserGenPage Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * Delete the class GuesserGenPage in Solr: 
 * <pre>
 * curl -k 'https://solr.apps-crc.testing/solr/computate/update?commitWithin=1000&amp;overwrite=true&amp;wt=json' -X POST -H 'Content-type: text/xml' -u "admin:$(oc -n solr get secret/solr-solrcloud-security-bootstrap -o jsonpath={.data.admin} | base64 -d)" --data-raw '&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.guesser.GuesserGenPage&lt;/query&gt;&lt;/delete&gt;'
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
public abstract class GuesserGenPageGen<DEV> extends PageLayout {
  protected static final Logger LOG = LoggerFactory.getLogger(GuesserGenPage.class);

	////////////////////////
  // searchListGuesser_ //
	////////////////////////


  /**
   *  The entity searchListGuesser_
   *	 is defined as null before being initialized. 
   */
  @JsonIgnore
  @JsonInclude(Include.NON_NULL)
  protected SearchList<Guesser> searchListGuesser_;

  /**
   * <br> The entity searchListGuesser_
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.guesser.GuesserGenPage&fq=entiteVar_enUS_indexed_string:searchListGuesser_">Find the entity searchListGuesser_ in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _searchListGuesser_(Wrap<SearchList<Guesser>> w);

  public SearchList<Guesser> getSearchListGuesser_() {
    return searchListGuesser_;
  }

  public void setSearchListGuesser_(SearchList<Guesser> searchListGuesser_) {
    this.searchListGuesser_ = searchListGuesser_;
  }
  public static SearchList<Guesser> staticSetSearchListGuesser_(SiteRequest siteRequest_, String o) {
    return null;
  }
  protected GuesserGenPage searchListGuesser_Init() {
    Wrap<SearchList<Guesser>> searchListGuesser_Wrap = new Wrap<SearchList<Guesser>>().var("searchListGuesser_");
    if(searchListGuesser_ == null) {
      _searchListGuesser_(searchListGuesser_Wrap);
      Optional.ofNullable(searchListGuesser_Wrap.getO()).ifPresent(o -> {
        setSearchListGuesser_(o);
      });
    }
    return (GuesserGenPage)this;
  }

	/////////////////
  // listGuesser //
	/////////////////


  /**
   *  The entity listGuesser
   *	 It is constructed before being initialized with the constructor by default. 
   */
  @JsonProperty
  @JsonDeserialize(using = JsonArrayDeserializer.class)
  @JsonInclude(Include.NON_NULL)
  protected JsonArray listGuesser = new JsonArray();

  /**
   * <br> The entity listGuesser
   *  It is constructed before being initialized with the constructor by default. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.guesser.GuesserGenPage&fq=entiteVar_enUS_indexed_string:listGuesser">Find the entity listGuesser in Solr</a>
   * <br>
   * @param l is the entity already constructed. 
   **/
  protected abstract void _listGuesser(JsonArray l);

  public JsonArray getListGuesser() {
    return listGuesser;
  }

  public void setListGuesser(JsonArray listGuesser) {
    this.listGuesser = listGuesser;
  }
  @JsonIgnore
  public void setListGuesser(String o) {
    this.listGuesser = GuesserGenPage.staticSetListGuesser(siteRequest_, o);
  }
  public static JsonArray staticSetListGuesser(SiteRequest siteRequest_, String o) {
    if(o != null) {
        return new JsonArray(o);
    }
    return null;
  }
  protected GuesserGenPage listGuesserInit() {
    _listGuesser(listGuesser);
    return (GuesserGenPage)this;
  }

  public static String staticSearchListGuesser(SiteRequest siteRequest_, JsonArray o) {
    return o.toString();
  }

  public static String staticSearchStrListGuesser(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqListGuesser(SiteRequest siteRequest_, String o) {
    return GuesserGenPage.staticSearchListGuesser(siteRequest_, GuesserGenPage.staticSetListGuesser(siteRequest_, o)).toString();
  }

	/////////////////
  // resultCount //
	/////////////////


  /**
   *  The entity resultCount
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonSerialize(using = ToStringSerializer.class)
  @JsonInclude(Include.NON_NULL)
  protected Integer resultCount;

  /**
   * <br> The entity resultCount
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.guesser.GuesserGenPage&fq=entiteVar_enUS_indexed_string:resultCount">Find the entity resultCount in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _resultCount(Wrap<Integer> w);

  public Integer getResultCount() {
    return resultCount;
  }

  public void setResultCount(Integer resultCount) {
    this.resultCount = resultCount;
  }
  @JsonIgnore
  public void setResultCount(String o) {
    this.resultCount = GuesserGenPage.staticSetResultCount(siteRequest_, o);
  }
  public static Integer staticSetResultCount(SiteRequest siteRequest_, String o) {
    if(NumberUtils.isParsable(o))
      return Integer.parseInt(o);
    return null;
  }
  protected GuesserGenPage resultCountInit() {
    Wrap<Integer> resultCountWrap = new Wrap<Integer>().var("resultCount");
    if(resultCount == null) {
      _resultCount(resultCountWrap);
      Optional.ofNullable(resultCountWrap.getO()).ifPresent(o -> {
        setResultCount(o);
      });
    }
    return (GuesserGenPage)this;
  }

  public static Integer staticSearchResultCount(SiteRequest siteRequest_, Integer o) {
    return o;
  }

  public static String staticSearchStrResultCount(SiteRequest siteRequest_, Integer o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqResultCount(SiteRequest siteRequest_, String o) {
    return GuesserGenPage.staticSearchResultCount(siteRequest_, GuesserGenPage.staticSetResultCount(siteRequest_, o)).toString();
  }

	////////////
  // result //
	////////////


  /**
   *  The entity result
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected Guesser result;

  /**
   * <br> The entity result
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.guesser.GuesserGenPage&fq=entiteVar_enUS_indexed_string:result">Find the entity result in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _result(Wrap<Guesser> w);

  public Guesser getResult() {
    return result;
  }

  public void setResult(Guesser result) {
    this.result = result;
  }
  public static Guesser staticSetResult(SiteRequest siteRequest_, String o) {
    return null;
  }
  protected GuesserGenPage resultInit() {
    Wrap<Guesser> resultWrap = new Wrap<Guesser>().var("result");
    if(result == null) {
      _result(resultWrap);
      Optional.ofNullable(resultWrap.getO()).ifPresent(o -> {
        setResult(o);
      });
    }
    return (GuesserGenPage)this;
  }

	////////
  // pk //
	////////


  /**
   *  The entity pk
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonSerialize(using = ToStringSerializer.class)
  @JsonInclude(Include.NON_NULL)
  protected Long pk;

  /**
   * <br> The entity pk
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.guesser.GuesserGenPage&fq=entiteVar_enUS_indexed_string:pk">Find the entity pk in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _pk(Wrap<Long> w);

  public Long getPk() {
    return pk;
  }

  public void setPk(Long pk) {
    this.pk = pk;
  }
  @JsonIgnore
  public void setPk(String o) {
    this.pk = GuesserGenPage.staticSetPk(siteRequest_, o);
  }
  public static Long staticSetPk(SiteRequest siteRequest_, String o) {
    if(NumberUtils.isParsable(o))
      return Long.parseLong(o);
    return null;
  }
  protected GuesserGenPage pkInit() {
    Wrap<Long> pkWrap = new Wrap<Long>().var("pk");
    if(pk == null) {
      _pk(pkWrap);
      Optional.ofNullable(pkWrap.getO()).ifPresent(o -> {
        setPk(o);
      });
    }
    return (GuesserGenPage)this;
  }

  public static Long staticSearchPk(SiteRequest siteRequest_, Long o) {
    return o;
  }

  public static String staticSearchStrPk(SiteRequest siteRequest_, Long o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqPk(SiteRequest siteRequest_, String o) {
    return GuesserGenPage.staticSearchPk(siteRequest_, GuesserGenPage.staticSetPk(siteRequest_, o)).toString();
  }

	////////////
  // solrId //
	////////////


  /**
   *  The entity solrId
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String solrId;

  /**
   * <br> The entity solrId
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.guesser.GuesserGenPage&fq=entiteVar_enUS_indexed_string:solrId">Find the entity solrId in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _solrId(Wrap<String> w);

  public String getSolrId() {
    return solrId;
  }
  public void setSolrId(String o) {
    this.solrId = GuesserGenPage.staticSetSolrId(siteRequest_, o);
  }
  public static String staticSetSolrId(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected GuesserGenPage solrIdInit() {
    Wrap<String> solrIdWrap = new Wrap<String>().var("solrId");
    if(solrId == null) {
      _solrId(solrIdWrap);
      Optional.ofNullable(solrIdWrap.getO()).ifPresent(o -> {
        setSolrId(o);
      });
    }
    return (GuesserGenPage)this;
  }

  public static String staticSearchSolrId(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrSolrId(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqSolrId(SiteRequest siteRequest_, String o) {
    return GuesserGenPage.staticSearchSolrId(siteRequest_, GuesserGenPage.staticSetSolrId(siteRequest_, o)).toString();
  }

	////////////////////
  // pageUriGuesser //
	////////////////////


  /**
   *  The entity pageUriGuesser
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String pageUriGuesser;

  /**
   * <br> The entity pageUriGuesser
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.guesser.GuesserGenPage&fq=entiteVar_enUS_indexed_string:pageUriGuesser">Find the entity pageUriGuesser in Solr</a>
   * <br>
   * @param c is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _pageUriGuesser(Wrap<String> c);

  public String getPageUriGuesser() {
    return pageUriGuesser;
  }
  public void setPageUriGuesser(String o) {
    this.pageUriGuesser = GuesserGenPage.staticSetPageUriGuesser(siteRequest_, o);
  }
  public static String staticSetPageUriGuesser(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected GuesserGenPage pageUriGuesserInit() {
    Wrap<String> pageUriGuesserWrap = new Wrap<String>().var("pageUriGuesser");
    if(pageUriGuesser == null) {
      _pageUriGuesser(pageUriGuesserWrap);
      Optional.ofNullable(pageUriGuesserWrap.getO()).ifPresent(o -> {
        setPageUriGuesser(o);
      });
    }
    return (GuesserGenPage)this;
  }

  public static String staticSearchPageUriGuesser(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrPageUriGuesser(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqPageUriGuesser(SiteRequest siteRequest_, String o) {
    return GuesserGenPage.staticSearchPageUriGuesser(siteRequest_, GuesserGenPage.staticSetPageUriGuesser(siteRequest_, o)).toString();
  }

  //////////////
  // initDeep //
  //////////////

  public Future<GuesserGenPageGen<DEV>> promiseDeepGuesserGenPage(SiteRequest siteRequest_) {
    setSiteRequest_(siteRequest_);
    return promiseDeepGuesserGenPage();
  }

  public Future<GuesserGenPageGen<DEV>> promiseDeepGuesserGenPage() {
    Promise<GuesserGenPageGen<DEV>> promise = Promise.promise();
    Promise<Void> promise2 = Promise.promise();
    promiseGuesserGenPage(promise2);
    promise2.future().onSuccess(a -> {
      super.promiseDeepPageLayout(siteRequest_).onSuccess(b -> {
        promise.complete(this);
      }).onFailure(ex -> {
        promise.fail(ex);
      });
    }).onFailure(ex -> {
      promise.fail(ex);
    });
    return promise.future();
  }

  public Future<Void> promiseGuesserGenPage(Promise<Void> promise) {
    Future.future(a -> a.complete()).compose(a -> {
      Promise<Void> promise2 = Promise.promise();
      try {
        searchListGuesser_Init();
        listGuesserInit();
        resultCountInit();
        resultInit();
        pkInit();
        solrIdInit();
        pageUriGuesserInit();
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

  @Override public Future<? extends GuesserGenPageGen<DEV>> promiseDeepForClass(SiteRequest siteRequest_) {
    return promiseDeepGuesserGenPage(siteRequest_);
  }

  /////////////////
  // siteRequest //
  /////////////////

  public void siteRequestGuesserGenPage(SiteRequest siteRequest_) {
      super.siteRequestPageLayout(siteRequest_);
  }

  public void siteRequestForClass(SiteRequest siteRequest_) {
    siteRequestGuesserGenPage(siteRequest_);
  }

  /////////////
  // obtain //
  /////////////

  @Override public Object obtainForClass(String var) {
    String[] vars = StringUtils.split(var, ".");
    Object o = null;
    for(String v : vars) {
      if(o == null)
        o = obtainGuesserGenPage(v);
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
  public Object obtainGuesserGenPage(String var) {
    GuesserGenPage oGuesserGenPage = (GuesserGenPage)this;
    switch(var) {
      case "searchListGuesser_":
        return oGuesserGenPage.searchListGuesser_;
      case "listGuesser":
        return oGuesserGenPage.listGuesser;
      case "resultCount":
        return oGuesserGenPage.resultCount;
      case "result":
        return oGuesserGenPage.result;
      case "pk":
        return oGuesserGenPage.pk;
      case "solrId":
        return oGuesserGenPage.solrId;
      case "pageUriGuesser":
        return oGuesserGenPage.pageUriGuesser;
      default:
        return super.obtainPageLayout(var);
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
        o = relateGuesserGenPage(v, val);
      else if(o instanceof BaseModel) {
        BaseModel baseModel = (BaseModel)o;
        o = baseModel.relateForClass(v, val);
      }
    }
    return o != null;
  }
  public Object relateGuesserGenPage(String var, Object val) {
    GuesserGenPage oGuesserGenPage = (GuesserGenPage)this;
    switch(var) {
      default:
        return super.relatePageLayout(var, val);
    }
  }

  ///////////////
  // staticSet //
  ///////////////

  public static Object staticSetForClass(String entityVar, SiteRequest siteRequest_, String v, GuesserGenPage o) {
    return staticSetGuesserGenPage(entityVar,  siteRequest_, v, o);
  }
  public static Object staticSetGuesserGenPage(String entityVar, SiteRequest siteRequest_, String v, GuesserGenPage o) {
    switch(entityVar) {
    case "listGuesser":
      return GuesserGenPage.staticSetListGuesser(siteRequest_, v);
    case "resultCount":
      return GuesserGenPage.staticSetResultCount(siteRequest_, v);
    case "pk":
      return GuesserGenPage.staticSetPk(siteRequest_, v);
    case "solrId":
      return GuesserGenPage.staticSetSolrId(siteRequest_, v);
    case "pageUriGuesser":
      return GuesserGenPage.staticSetPageUriGuesser(siteRequest_, v);
      default:
        return PageLayout.staticSetPageLayout(entityVar,  siteRequest_, v, o);
    }
  }

  //////////////////
  // staticSearch //
  //////////////////

  public static Object staticSearchForClass(String entityVar, SiteRequest siteRequest_, Object o) {
    return staticSearchGuesserGenPage(entityVar,  siteRequest_, o);
  }
  public static Object staticSearchGuesserGenPage(String entityVar, SiteRequest siteRequest_, Object o) {
    switch(entityVar) {
    case "listGuesser":
      return GuesserGenPage.staticSearchListGuesser(siteRequest_, (JsonArray)o);
    case "resultCount":
      return GuesserGenPage.staticSearchResultCount(siteRequest_, (Integer)o);
    case "pk":
      return GuesserGenPage.staticSearchPk(siteRequest_, (Long)o);
    case "solrId":
      return GuesserGenPage.staticSearchSolrId(siteRequest_, (String)o);
    case "pageUriGuesser":
      return GuesserGenPage.staticSearchPageUriGuesser(siteRequest_, (String)o);
      default:
        return PageLayout.staticSearchPageLayout(entityVar,  siteRequest_, o);
    }
  }

  ///////////////////
  // staticSearchStr //
  ///////////////////

  public static String staticSearchStrForClass(String entityVar, SiteRequest siteRequest_, Object o) {
    return staticSearchStrGuesserGenPage(entityVar,  siteRequest_, o);
  }
  public static String staticSearchStrGuesserGenPage(String entityVar, SiteRequest siteRequest_, Object o) {
    switch(entityVar) {
    case "listGuesser":
      return GuesserGenPage.staticSearchStrListGuesser(siteRequest_, (String)o);
    case "resultCount":
      return GuesserGenPage.staticSearchStrResultCount(siteRequest_, (Integer)o);
    case "pk":
      return GuesserGenPage.staticSearchStrPk(siteRequest_, (Long)o);
    case "solrId":
      return GuesserGenPage.staticSearchStrSolrId(siteRequest_, (String)o);
    case "pageUriGuesser":
      return GuesserGenPage.staticSearchStrPageUriGuesser(siteRequest_, (String)o);
      default:
        return PageLayout.staticSearchStrPageLayout(entityVar,  siteRequest_, o);
    }
  }

  //////////////////
  // staticSearchFq //
  //////////////////

  public static String staticSearchFqForClass(String entityVar, SiteRequest siteRequest_, String o) {
    return staticSearchFqGuesserGenPage(entityVar,  siteRequest_, o);
  }
  public static String staticSearchFqGuesserGenPage(String entityVar, SiteRequest siteRequest_, String o) {
    switch(entityVar) {
    case "listGuesser":
      return GuesserGenPage.staticSearchFqListGuesser(siteRequest_, o);
    case "resultCount":
      return GuesserGenPage.staticSearchFqResultCount(siteRequest_, o);
    case "pk":
      return GuesserGenPage.staticSearchFqPk(siteRequest_, o);
    case "solrId":
      return GuesserGenPage.staticSearchFqSolrId(siteRequest_, o);
    case "pageUriGuesser":
      return GuesserGenPage.staticSearchFqPageUriGuesser(siteRequest_, o);
      default:
        return PageLayout.staticSearchFqPageLayout(entityVar,  siteRequest_, o);
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

  public static final String CLASS_SIMPLE_NAME = "GuesserGenPage";
  public static final String CLASS_CANONICAL_NAME = "org.computate.spinechamp.model.guesser.GuesserGenPage";
  public static final String CLASS_AUTH_RESOURCE = "";
  public static final String VAR_searchListGuesser_ = "searchListGuesser_";
  public static final String SET_searchListGuesser_ = "setSearchListGuesser_";
  public static final String VAR_listGuesser = "listGuesser";
  public static final String SET_listGuesser = "setListGuesser";
  public static final String VAR_resultCount = "resultCount";
  public static final String SET_resultCount = "setResultCount";
  public static final String VAR_result = "result";
  public static final String SET_result = "setResult";
  public static final String VAR_pk = "pk";
  public static final String SET_pk = "setPk";
  public static final String VAR_solrId = "solrId";
  public static final String SET_solrId = "setSolrId";
  public static final String VAR_pageUriGuesser = "pageUriGuesser";
  public static final String SET_pageUriGuesser = "setPageUriGuesser";

  public static final String DISPLAY_NAME_searchListGuesser_ = "";
  public static final String DISPLAY_NAME_listGuesser = "";
  public static final String DISPLAY_NAME_resultCount = "";
  public static final String DISPLAY_NAME_result = "";
  public static final String DISPLAY_NAME_pk = "";
  public static final String DISPLAY_NAME_solrId = "";
  public static final String DISPLAY_NAME_pageUriGuesser = "";

  public static String displayNameForClass(String var) {
    return GuesserGenPage.displayNameGuesserGenPage(var);
  }
  public static String displayNameGuesserGenPage(String var) {
    switch(var) {
    case VAR_searchListGuesser_:
      return DISPLAY_NAME_searchListGuesser_;
    case VAR_listGuesser:
      return DISPLAY_NAME_listGuesser;
    case VAR_resultCount:
      return DISPLAY_NAME_resultCount;
    case VAR_result:
      return DISPLAY_NAME_result;
    case VAR_pk:
      return DISPLAY_NAME_pk;
    case VAR_solrId:
      return DISPLAY_NAME_solrId;
    case VAR_pageUriGuesser:
      return DISPLAY_NAME_pageUriGuesser;
    default:
      return PageLayout.displayNamePageLayout(var);
    }
  }
}
