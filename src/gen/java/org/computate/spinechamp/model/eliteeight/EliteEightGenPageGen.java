package org.computate.spinechamp.model.eliteeight;

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
import org.computate.spinechamp.model.eliteeight.EliteEight;
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
 * <li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these EliteEightGenPage objects in a RESTful API. 
 * </li><li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class EliteEightGenPageGen into the class EliteEightGenPage. 
 * </li>
 * <h3>About the EliteEightGenPage class and it's generated class EliteEightGenPageGen&lt;PageLayout&gt;: </h3>extends EliteEightGenPageGen
 * <p>
 * This Java class extends a generated Java class EliteEightGenPageGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.eliteeight.EliteEightGenPage">Find the class EliteEightGenPage in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends EliteEightGenPageGen<PageLayout>
 * <p>This <code>class EliteEightGenPage extends EliteEightGenPageGen&lt;PageLayout&gt;</code>, which means it extends a newly generated EliteEightGenPageGen. 
 * The generated <code>class EliteEightGenPageGen extends PageLayout</code> which means that EliteEightGenPage extends EliteEightGenPageGen which extends PageLayout. 
 * This generated inheritance is a powerful feature that allows a lot of boiler plate code to be created for you automatically while still preserving inheritance through the power of Java Generic classes. 
 * </p>
 * <h2>Api: true</h2>
 * <h2>ApiTag.enUS: true</h2>
 * <h2>ApiUri.enUS: null</h2>
 * <h2>Color: null</h2>
 * <h2>Indexed: true</h2>
 * <h2>{@inheritDoc}</h2>
 * <p>By adding a class comment "{@inheritDoc}", the EliteEightGenPage class will inherit the helpful inherited class comments from the super class EliteEightGenPageGen. 
 * </p>
 * <h2>Rows: null</h2>
 * <h2>Model: true</h2>
 * <h2>Page: true</h2>
 * <h2>SuperPage.enUS: null</h2>
 * <h2>Promise: true</h2>
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the EliteEightGenPage Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * Delete the class EliteEightGenPage in Solr: 
 * <pre>
 * curl -k 'https://solr.apps-crc.testing/solr/computate/update?commitWithin=1000&amp;overwrite=true&amp;wt=json' -X POST -H 'Content-type: text/xml' -u "admin:$(oc -n solr get secret/solr-solrcloud-security-bootstrap -o jsonpath={.data.admin} | base64 -d)" --data-raw '&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.eliteeight.EliteEightGenPage&lt;/query&gt;&lt;/delete&gt;'
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
public abstract class EliteEightGenPageGen<DEV> extends PageLayout {
  protected static final Logger LOG = LoggerFactory.getLogger(EliteEightGenPage.class);

	///////////////////////////
  // searchListEliteEight_ //
	///////////////////////////


  /**
   *  The entity searchListEliteEight_
   *	 is defined as null before being initialized. 
   */
  @JsonIgnore
  @JsonInclude(Include.NON_NULL)
  protected SearchList<EliteEight> searchListEliteEight_;

  /**
   * <br> The entity searchListEliteEight_
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.eliteeight.EliteEightGenPage&fq=entiteVar_enUS_indexed_string:searchListEliteEight_">Find the entity searchListEliteEight_ in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _searchListEliteEight_(Wrap<SearchList<EliteEight>> w);

  public SearchList<EliteEight> getSearchListEliteEight_() {
    return searchListEliteEight_;
  }

  public void setSearchListEliteEight_(SearchList<EliteEight> searchListEliteEight_) {
    this.searchListEliteEight_ = searchListEliteEight_;
  }
  public static SearchList<EliteEight> staticSetSearchListEliteEight_(SiteRequest siteRequest_, String o) {
    return null;
  }
  protected EliteEightGenPage searchListEliteEight_Init() {
    Wrap<SearchList<EliteEight>> searchListEliteEight_Wrap = new Wrap<SearchList<EliteEight>>().var("searchListEliteEight_");
    if(searchListEliteEight_ == null) {
      _searchListEliteEight_(searchListEliteEight_Wrap);
      Optional.ofNullable(searchListEliteEight_Wrap.getO()).ifPresent(o -> {
        setSearchListEliteEight_(o);
      });
    }
    return (EliteEightGenPage)this;
  }

	////////////////////
  // listEliteEight //
	////////////////////


  /**
   *  The entity listEliteEight
   *	 It is constructed before being initialized with the constructor by default. 
   */
  @JsonProperty
  @JsonDeserialize(using = JsonArrayDeserializer.class)
  @JsonInclude(Include.NON_NULL)
  protected JsonArray listEliteEight = new JsonArray();

  /**
   * <br> The entity listEliteEight
   *  It is constructed before being initialized with the constructor by default. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.eliteeight.EliteEightGenPage&fq=entiteVar_enUS_indexed_string:listEliteEight">Find the entity listEliteEight in Solr</a>
   * <br>
   * @param l is the entity already constructed. 
   **/
  protected abstract void _listEliteEight(JsonArray l);

  public JsonArray getListEliteEight() {
    return listEliteEight;
  }

  public void setListEliteEight(JsonArray listEliteEight) {
    this.listEliteEight = listEliteEight;
  }
  @JsonIgnore
  public void setListEliteEight(String o) {
    this.listEliteEight = EliteEightGenPage.staticSetListEliteEight(siteRequest_, o);
  }
  public static JsonArray staticSetListEliteEight(SiteRequest siteRequest_, String o) {
    if(o != null) {
        return new JsonArray(o);
    }
    return null;
  }
  protected EliteEightGenPage listEliteEightInit() {
    _listEliteEight(listEliteEight);
    return (EliteEightGenPage)this;
  }

  public static String staticSearchListEliteEight(SiteRequest siteRequest_, JsonArray o) {
    return o.toString();
  }

  public static String staticSearchStrListEliteEight(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqListEliteEight(SiteRequest siteRequest_, String o) {
    return EliteEightGenPage.staticSearchListEliteEight(siteRequest_, EliteEightGenPage.staticSetListEliteEight(siteRequest_, o)).toString();
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.eliteeight.EliteEightGenPage&fq=entiteVar_enUS_indexed_string:resultCount">Find the entity resultCount in Solr</a>
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
    this.resultCount = EliteEightGenPage.staticSetResultCount(siteRequest_, o);
  }
  public static Integer staticSetResultCount(SiteRequest siteRequest_, String o) {
    if(NumberUtils.isParsable(o))
      return Integer.parseInt(o);
    return null;
  }
  protected EliteEightGenPage resultCountInit() {
    Wrap<Integer> resultCountWrap = new Wrap<Integer>().var("resultCount");
    if(resultCount == null) {
      _resultCount(resultCountWrap);
      Optional.ofNullable(resultCountWrap.getO()).ifPresent(o -> {
        setResultCount(o);
      });
    }
    return (EliteEightGenPage)this;
  }

  public static Integer staticSearchResultCount(SiteRequest siteRequest_, Integer o) {
    return o;
  }

  public static String staticSearchStrResultCount(SiteRequest siteRequest_, Integer o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqResultCount(SiteRequest siteRequest_, String o) {
    return EliteEightGenPage.staticSearchResultCount(siteRequest_, EliteEightGenPage.staticSetResultCount(siteRequest_, o)).toString();
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
  protected EliteEight result;

  /**
   * <br> The entity result
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.eliteeight.EliteEightGenPage&fq=entiteVar_enUS_indexed_string:result">Find the entity result in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _result(Wrap<EliteEight> w);

  public EliteEight getResult() {
    return result;
  }

  public void setResult(EliteEight result) {
    this.result = result;
  }
  public static EliteEight staticSetResult(SiteRequest siteRequest_, String o) {
    return null;
  }
  protected EliteEightGenPage resultInit() {
    Wrap<EliteEight> resultWrap = new Wrap<EliteEight>().var("result");
    if(result == null) {
      _result(resultWrap);
      Optional.ofNullable(resultWrap.getO()).ifPresent(o -> {
        setResult(o);
      });
    }
    return (EliteEightGenPage)this;
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.eliteeight.EliteEightGenPage&fq=entiteVar_enUS_indexed_string:pk">Find the entity pk in Solr</a>
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
    this.pk = EliteEightGenPage.staticSetPk(siteRequest_, o);
  }
  public static Long staticSetPk(SiteRequest siteRequest_, String o) {
    if(NumberUtils.isParsable(o))
      return Long.parseLong(o);
    return null;
  }
  protected EliteEightGenPage pkInit() {
    Wrap<Long> pkWrap = new Wrap<Long>().var("pk");
    if(pk == null) {
      _pk(pkWrap);
      Optional.ofNullable(pkWrap.getO()).ifPresent(o -> {
        setPk(o);
      });
    }
    return (EliteEightGenPage)this;
  }

  public static Long staticSearchPk(SiteRequest siteRequest_, Long o) {
    return o;
  }

  public static String staticSearchStrPk(SiteRequest siteRequest_, Long o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqPk(SiteRequest siteRequest_, String o) {
    return EliteEightGenPage.staticSearchPk(siteRequest_, EliteEightGenPage.staticSetPk(siteRequest_, o)).toString();
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.eliteeight.EliteEightGenPage&fq=entiteVar_enUS_indexed_string:solrId">Find the entity solrId in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _solrId(Wrap<String> w);

  public String getSolrId() {
    return solrId;
  }
  public void setSolrId(String o) {
    this.solrId = EliteEightGenPage.staticSetSolrId(siteRequest_, o);
  }
  public static String staticSetSolrId(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected EliteEightGenPage solrIdInit() {
    Wrap<String> solrIdWrap = new Wrap<String>().var("solrId");
    if(solrId == null) {
      _solrId(solrIdWrap);
      Optional.ofNullable(solrIdWrap.getO()).ifPresent(o -> {
        setSolrId(o);
      });
    }
    return (EliteEightGenPage)this;
  }

  public static String staticSearchSolrId(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrSolrId(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqSolrId(SiteRequest siteRequest_, String o) {
    return EliteEightGenPage.staticSearchSolrId(siteRequest_, EliteEightGenPage.staticSetSolrId(siteRequest_, o)).toString();
  }

	///////////////////////
  // pageUriEliteEight //
	///////////////////////


  /**
   *  The entity pageUriEliteEight
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String pageUriEliteEight;

  /**
   * <br> The entity pageUriEliteEight
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.eliteeight.EliteEightGenPage&fq=entiteVar_enUS_indexed_string:pageUriEliteEight">Find the entity pageUriEliteEight in Solr</a>
   * <br>
   * @param c is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _pageUriEliteEight(Wrap<String> c);

  public String getPageUriEliteEight() {
    return pageUriEliteEight;
  }
  public void setPageUriEliteEight(String o) {
    this.pageUriEliteEight = EliteEightGenPage.staticSetPageUriEliteEight(siteRequest_, o);
  }
  public static String staticSetPageUriEliteEight(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected EliteEightGenPage pageUriEliteEightInit() {
    Wrap<String> pageUriEliteEightWrap = new Wrap<String>().var("pageUriEliteEight");
    if(pageUriEliteEight == null) {
      _pageUriEliteEight(pageUriEliteEightWrap);
      Optional.ofNullable(pageUriEliteEightWrap.getO()).ifPresent(o -> {
        setPageUriEliteEight(o);
      });
    }
    return (EliteEightGenPage)this;
  }

  public static String staticSearchPageUriEliteEight(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrPageUriEliteEight(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqPageUriEliteEight(SiteRequest siteRequest_, String o) {
    return EliteEightGenPage.staticSearchPageUriEliteEight(siteRequest_, EliteEightGenPage.staticSetPageUriEliteEight(siteRequest_, o)).toString();
  }

  //////////////
  // initDeep //
  //////////////

  public Future<EliteEightGenPageGen<DEV>> promiseDeepEliteEightGenPage(SiteRequest siteRequest_) {
    setSiteRequest_(siteRequest_);
    return promiseDeepEliteEightGenPage();
  }

  public Future<EliteEightGenPageGen<DEV>> promiseDeepEliteEightGenPage() {
    Promise<EliteEightGenPageGen<DEV>> promise = Promise.promise();
    Promise<Void> promise2 = Promise.promise();
    promiseEliteEightGenPage(promise2);
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

  public Future<Void> promiseEliteEightGenPage(Promise<Void> promise) {
    Future.future(a -> a.complete()).compose(a -> {
      Promise<Void> promise2 = Promise.promise();
      try {
        searchListEliteEight_Init();
        listEliteEightInit();
        resultCountInit();
        resultInit();
        pkInit();
        solrIdInit();
        pageUriEliteEightInit();
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

  @Override public Future<? extends EliteEightGenPageGen<DEV>> promiseDeepForClass(SiteRequest siteRequest_) {
    return promiseDeepEliteEightGenPage(siteRequest_);
  }

  /////////////////
  // siteRequest //
  /////////////////

  public void siteRequestEliteEightGenPage(SiteRequest siteRequest_) {
      super.siteRequestPageLayout(siteRequest_);
  }

  public void siteRequestForClass(SiteRequest siteRequest_) {
    siteRequestEliteEightGenPage(siteRequest_);
  }

  /////////////
  // obtain //
  /////////////

  @Override public Object obtainForClass(String var) {
    String[] vars = StringUtils.split(var, ".");
    Object o = null;
    for(String v : vars) {
      if(o == null)
        o = obtainEliteEightGenPage(v);
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
  public Object obtainEliteEightGenPage(String var) {
    EliteEightGenPage oEliteEightGenPage = (EliteEightGenPage)this;
    switch(var) {
      case "searchListEliteEight_":
        return oEliteEightGenPage.searchListEliteEight_;
      case "listEliteEight":
        return oEliteEightGenPage.listEliteEight;
      case "resultCount":
        return oEliteEightGenPage.resultCount;
      case "result":
        return oEliteEightGenPage.result;
      case "pk":
        return oEliteEightGenPage.pk;
      case "solrId":
        return oEliteEightGenPage.solrId;
      case "pageUriEliteEight":
        return oEliteEightGenPage.pageUriEliteEight;
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
        o = relateEliteEightGenPage(v, val);
      else if(o instanceof BaseModel) {
        BaseModel baseModel = (BaseModel)o;
        o = baseModel.relateForClass(v, val);
      }
    }
    return o != null;
  }
  public Object relateEliteEightGenPage(String var, Object val) {
    EliteEightGenPage oEliteEightGenPage = (EliteEightGenPage)this;
    switch(var) {
      default:
        return super.relatePageLayout(var, val);
    }
  }

  ///////////////
  // staticSet //
  ///////////////

  public static Object staticSetForClass(String entityVar, SiteRequest siteRequest_, String v, EliteEightGenPage o) {
    return staticSetEliteEightGenPage(entityVar,  siteRequest_, v, o);
  }
  public static Object staticSetEliteEightGenPage(String entityVar, SiteRequest siteRequest_, String v, EliteEightGenPage o) {
    switch(entityVar) {
    case "listEliteEight":
      return EliteEightGenPage.staticSetListEliteEight(siteRequest_, v);
    case "resultCount":
      return EliteEightGenPage.staticSetResultCount(siteRequest_, v);
    case "pk":
      return EliteEightGenPage.staticSetPk(siteRequest_, v);
    case "solrId":
      return EliteEightGenPage.staticSetSolrId(siteRequest_, v);
    case "pageUriEliteEight":
      return EliteEightGenPage.staticSetPageUriEliteEight(siteRequest_, v);
      default:
        return PageLayout.staticSetPageLayout(entityVar,  siteRequest_, v, o);
    }
  }

  //////////////////
  // staticSearch //
  //////////////////

  public static Object staticSearchForClass(String entityVar, SiteRequest siteRequest_, Object o) {
    return staticSearchEliteEightGenPage(entityVar,  siteRequest_, o);
  }
  public static Object staticSearchEliteEightGenPage(String entityVar, SiteRequest siteRequest_, Object o) {
    switch(entityVar) {
    case "listEliteEight":
      return EliteEightGenPage.staticSearchListEliteEight(siteRequest_, (JsonArray)o);
    case "resultCount":
      return EliteEightGenPage.staticSearchResultCount(siteRequest_, (Integer)o);
    case "pk":
      return EliteEightGenPage.staticSearchPk(siteRequest_, (Long)o);
    case "solrId":
      return EliteEightGenPage.staticSearchSolrId(siteRequest_, (String)o);
    case "pageUriEliteEight":
      return EliteEightGenPage.staticSearchPageUriEliteEight(siteRequest_, (String)o);
      default:
        return PageLayout.staticSearchPageLayout(entityVar,  siteRequest_, o);
    }
  }

  ///////////////////
  // staticSearchStr //
  ///////////////////

  public static String staticSearchStrForClass(String entityVar, SiteRequest siteRequest_, Object o) {
    return staticSearchStrEliteEightGenPage(entityVar,  siteRequest_, o);
  }
  public static String staticSearchStrEliteEightGenPage(String entityVar, SiteRequest siteRequest_, Object o) {
    switch(entityVar) {
    case "listEliteEight":
      return EliteEightGenPage.staticSearchStrListEliteEight(siteRequest_, (String)o);
    case "resultCount":
      return EliteEightGenPage.staticSearchStrResultCount(siteRequest_, (Integer)o);
    case "pk":
      return EliteEightGenPage.staticSearchStrPk(siteRequest_, (Long)o);
    case "solrId":
      return EliteEightGenPage.staticSearchStrSolrId(siteRequest_, (String)o);
    case "pageUriEliteEight":
      return EliteEightGenPage.staticSearchStrPageUriEliteEight(siteRequest_, (String)o);
      default:
        return PageLayout.staticSearchStrPageLayout(entityVar,  siteRequest_, o);
    }
  }

  //////////////////
  // staticSearchFq //
  //////////////////

  public static String staticSearchFqForClass(String entityVar, SiteRequest siteRequest_, String o) {
    return staticSearchFqEliteEightGenPage(entityVar,  siteRequest_, o);
  }
  public static String staticSearchFqEliteEightGenPage(String entityVar, SiteRequest siteRequest_, String o) {
    switch(entityVar) {
    case "listEliteEight":
      return EliteEightGenPage.staticSearchFqListEliteEight(siteRequest_, o);
    case "resultCount":
      return EliteEightGenPage.staticSearchFqResultCount(siteRequest_, o);
    case "pk":
      return EliteEightGenPage.staticSearchFqPk(siteRequest_, o);
    case "solrId":
      return EliteEightGenPage.staticSearchFqSolrId(siteRequest_, o);
    case "pageUriEliteEight":
      return EliteEightGenPage.staticSearchFqPageUriEliteEight(siteRequest_, o);
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

  public static final String CLASS_SIMPLE_NAME = "EliteEightGenPage";
  public static final String CLASS_CANONICAL_NAME = "org.computate.spinechamp.model.eliteeight.EliteEightGenPage";
  public static final String CLASS_AUTH_RESOURCE = "";
  public static final String VAR_searchListEliteEight_ = "searchListEliteEight_";
  public static final String SET_searchListEliteEight_ = "setSearchListEliteEight_";
  public static final String VAR_listEliteEight = "listEliteEight";
  public static final String SET_listEliteEight = "setListEliteEight";
  public static final String VAR_resultCount = "resultCount";
  public static final String SET_resultCount = "setResultCount";
  public static final String VAR_result = "result";
  public static final String SET_result = "setResult";
  public static final String VAR_pk = "pk";
  public static final String SET_pk = "setPk";
  public static final String VAR_solrId = "solrId";
  public static final String SET_solrId = "setSolrId";
  public static final String VAR_pageUriEliteEight = "pageUriEliteEight";
  public static final String SET_pageUriEliteEight = "setPageUriEliteEight";

  public static final String DISPLAY_NAME_searchListEliteEight_ = "";
  public static final String DISPLAY_NAME_listEliteEight = "";
  public static final String DISPLAY_NAME_resultCount = "";
  public static final String DISPLAY_NAME_result = "";
  public static final String DISPLAY_NAME_pk = "";
  public static final String DISPLAY_NAME_solrId = "";
  public static final String DISPLAY_NAME_pageUriEliteEight = "";

  public static String displayNameForClass(String var) {
    return EliteEightGenPage.displayNameEliteEightGenPage(var);
  }
  public static String displayNameEliteEightGenPage(String var) {
    switch(var) {
    case VAR_searchListEliteEight_:
      return DISPLAY_NAME_searchListEliteEight_;
    case VAR_listEliteEight:
      return DISPLAY_NAME_listEliteEight;
    case VAR_resultCount:
      return DISPLAY_NAME_resultCount;
    case VAR_result:
      return DISPLAY_NAME_result;
    case VAR_pk:
      return DISPLAY_NAME_pk;
    case VAR_solrId:
      return DISPLAY_NAME_solrId;
    case VAR_pageUriEliteEight:
      return DISPLAY_NAME_pageUriEliteEight;
    default:
      return PageLayout.displayNamePageLayout(var);
    }
  }
}
