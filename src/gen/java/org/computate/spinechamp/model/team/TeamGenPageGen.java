package org.computate.spinechamp.model.team;

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
import org.computate.spinechamp.model.team.Team;
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
 * <li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these TeamGenPage objects in a RESTful API. 
 * </li><li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class TeamGenPageGen into the class TeamGenPage. 
 * </li>
 * <h3>About the TeamGenPage class and it's generated class TeamGenPageGen&lt;PageLayout&gt;: </h3>extends TeamGenPageGen
 * <p>
 * This Java class extends a generated Java class TeamGenPageGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.team.TeamGenPage">Find the class TeamGenPage in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends TeamGenPageGen<PageLayout>
 * <p>This <code>class TeamGenPage extends TeamGenPageGen&lt;PageLayout&gt;</code>, which means it extends a newly generated TeamGenPageGen. 
 * The generated <code>class TeamGenPageGen extends PageLayout</code> which means that TeamGenPage extends TeamGenPageGen which extends PageLayout. 
 * This generated inheritance is a powerful feature that allows a lot of boiler plate code to be created for you automatically while still preserving inheritance through the power of Java Generic classes. 
 * </p>
 * <h2>Api: true</h2>
 * <h2>ApiTag.enUS: true</h2>
 * <h2>ApiUri.enUS: null</h2>
 * <h2>Color: null</h2>
 * <h2>Indexed: true</h2>
 * <h2>{@inheritDoc}</h2>
 * <p>By adding a class comment "{@inheritDoc}", the TeamGenPage class will inherit the helpful inherited class comments from the super class TeamGenPageGen. 
 * </p>
 * <h2>Rows: null</h2>
 * <h2>Model: true</h2>
 * <h2>Page: true</h2>
 * <h2>SuperPage.enUS: null</h2>
 * <h2>Promise: true</h2>
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the TeamGenPage Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * Delete the class TeamGenPage in Solr: 
 * <pre>
 * curl -k 'https://solr.apps-crc.testing/solr/computate/update?commitWithin=1000&amp;overwrite=true&amp;wt=json' -X POST -H 'Content-type: text/xml' -u "admin:$(oc -n solr get secret/solr-solrcloud-security-bootstrap -o jsonpath={.data.admin} | base64 -d)" --data-raw '&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.team.TeamGenPage&lt;/query&gt;&lt;/delete&gt;'
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
public abstract class TeamGenPageGen<DEV> extends PageLayout {
  protected static final Logger LOG = LoggerFactory.getLogger(TeamGenPage.class);

	/////////////////////
  // searchListTeam_ //
	/////////////////////


  /**
   *  The entity searchListTeam_
   *	 is defined as null before being initialized. 
   */
  @JsonIgnore
  @JsonInclude(Include.NON_NULL)
  protected SearchList<Team> searchListTeam_;

  /**
   * <br> The entity searchListTeam_
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.team.TeamGenPage&fq=entiteVar_enUS_indexed_string:searchListTeam_">Find the entity searchListTeam_ in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _searchListTeam_(Wrap<SearchList<Team>> w);

  public SearchList<Team> getSearchListTeam_() {
    return searchListTeam_;
  }

  public void setSearchListTeam_(SearchList<Team> searchListTeam_) {
    this.searchListTeam_ = searchListTeam_;
  }
  public static SearchList<Team> staticSetSearchListTeam_(SiteRequest siteRequest_, String o) {
    return null;
  }
  protected TeamGenPage searchListTeam_Init() {
    Wrap<SearchList<Team>> searchListTeam_Wrap = new Wrap<SearchList<Team>>().var("searchListTeam_");
    if(searchListTeam_ == null) {
      _searchListTeam_(searchListTeam_Wrap);
      Optional.ofNullable(searchListTeam_Wrap.getO()).ifPresent(o -> {
        setSearchListTeam_(o);
      });
    }
    return (TeamGenPage)this;
  }

	//////////////
  // listTeam //
	//////////////


  /**
   *  The entity listTeam
   *	 It is constructed before being initialized with the constructor by default. 
   */
  @JsonProperty
  @JsonDeserialize(using = JsonArrayDeserializer.class)
  @JsonInclude(Include.NON_NULL)
  protected JsonArray listTeam = new JsonArray();

  /**
   * <br> The entity listTeam
   *  It is constructed before being initialized with the constructor by default. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.team.TeamGenPage&fq=entiteVar_enUS_indexed_string:listTeam">Find the entity listTeam in Solr</a>
   * <br>
   * @param l is the entity already constructed. 
   **/
  protected abstract void _listTeam(JsonArray l);

  public JsonArray getListTeam() {
    return listTeam;
  }

  public void setListTeam(JsonArray listTeam) {
    this.listTeam = listTeam;
  }
  @JsonIgnore
  public void setListTeam(String o) {
    this.listTeam = TeamGenPage.staticSetListTeam(siteRequest_, o);
  }
  public static JsonArray staticSetListTeam(SiteRequest siteRequest_, String o) {
    if(o != null) {
        return new JsonArray(o);
    }
    return null;
  }
  protected TeamGenPage listTeamInit() {
    _listTeam(listTeam);
    return (TeamGenPage)this;
  }

  public static String staticSearchListTeam(SiteRequest siteRequest_, JsonArray o) {
    return o.toString();
  }

  public static String staticSearchStrListTeam(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqListTeam(SiteRequest siteRequest_, String o) {
    return TeamGenPage.staticSearchListTeam(siteRequest_, TeamGenPage.staticSetListTeam(siteRequest_, o)).toString();
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.team.TeamGenPage&fq=entiteVar_enUS_indexed_string:resultCount">Find the entity resultCount in Solr</a>
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
    this.resultCount = TeamGenPage.staticSetResultCount(siteRequest_, o);
  }
  public static Integer staticSetResultCount(SiteRequest siteRequest_, String o) {
    if(NumberUtils.isParsable(o))
      return Integer.parseInt(o);
    return null;
  }
  protected TeamGenPage resultCountInit() {
    Wrap<Integer> resultCountWrap = new Wrap<Integer>().var("resultCount");
    if(resultCount == null) {
      _resultCount(resultCountWrap);
      Optional.ofNullable(resultCountWrap.getO()).ifPresent(o -> {
        setResultCount(o);
      });
    }
    return (TeamGenPage)this;
  }

  public static Integer staticSearchResultCount(SiteRequest siteRequest_, Integer o) {
    return o;
  }

  public static String staticSearchStrResultCount(SiteRequest siteRequest_, Integer o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqResultCount(SiteRequest siteRequest_, String o) {
    return TeamGenPage.staticSearchResultCount(siteRequest_, TeamGenPage.staticSetResultCount(siteRequest_, o)).toString();
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
  protected Team result;

  /**
   * <br> The entity result
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.team.TeamGenPage&fq=entiteVar_enUS_indexed_string:result">Find the entity result in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _result(Wrap<Team> w);

  public Team getResult() {
    return result;
  }

  public void setResult(Team result) {
    this.result = result;
  }
  public static Team staticSetResult(SiteRequest siteRequest_, String o) {
    return null;
  }
  protected TeamGenPage resultInit() {
    Wrap<Team> resultWrap = new Wrap<Team>().var("result");
    if(result == null) {
      _result(resultWrap);
      Optional.ofNullable(resultWrap.getO()).ifPresent(o -> {
        setResult(o);
      });
    }
    return (TeamGenPage)this;
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.team.TeamGenPage&fq=entiteVar_enUS_indexed_string:pk">Find the entity pk in Solr</a>
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
    this.pk = TeamGenPage.staticSetPk(siteRequest_, o);
  }
  public static Long staticSetPk(SiteRequest siteRequest_, String o) {
    if(NumberUtils.isParsable(o))
      return Long.parseLong(o);
    return null;
  }
  protected TeamGenPage pkInit() {
    Wrap<Long> pkWrap = new Wrap<Long>().var("pk");
    if(pk == null) {
      _pk(pkWrap);
      Optional.ofNullable(pkWrap.getO()).ifPresent(o -> {
        setPk(o);
      });
    }
    return (TeamGenPage)this;
  }

  public static Long staticSearchPk(SiteRequest siteRequest_, Long o) {
    return o;
  }

  public static String staticSearchStrPk(SiteRequest siteRequest_, Long o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqPk(SiteRequest siteRequest_, String o) {
    return TeamGenPage.staticSearchPk(siteRequest_, TeamGenPage.staticSetPk(siteRequest_, o)).toString();
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.team.TeamGenPage&fq=entiteVar_enUS_indexed_string:solrId">Find the entity solrId in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _solrId(Wrap<String> w);

  public String getSolrId() {
    return solrId;
  }
  public void setSolrId(String o) {
    this.solrId = TeamGenPage.staticSetSolrId(siteRequest_, o);
  }
  public static String staticSetSolrId(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected TeamGenPage solrIdInit() {
    Wrap<String> solrIdWrap = new Wrap<String>().var("solrId");
    if(solrId == null) {
      _solrId(solrIdWrap);
      Optional.ofNullable(solrIdWrap.getO()).ifPresent(o -> {
        setSolrId(o);
      });
    }
    return (TeamGenPage)this;
  }

  public static String staticSearchSolrId(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrSolrId(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqSolrId(SiteRequest siteRequest_, String o) {
    return TeamGenPage.staticSearchSolrId(siteRequest_, TeamGenPage.staticSetSolrId(siteRequest_, o)).toString();
  }

	/////////////////
  // pageUriTeam //
	/////////////////


  /**
   *  The entity pageUriTeam
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String pageUriTeam;

  /**
   * <br> The entity pageUriTeam
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.team.TeamGenPage&fq=entiteVar_enUS_indexed_string:pageUriTeam">Find the entity pageUriTeam in Solr</a>
   * <br>
   * @param c is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _pageUriTeam(Wrap<String> c);

  public String getPageUriTeam() {
    return pageUriTeam;
  }
  public void setPageUriTeam(String o) {
    this.pageUriTeam = TeamGenPage.staticSetPageUriTeam(siteRequest_, o);
  }
  public static String staticSetPageUriTeam(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected TeamGenPage pageUriTeamInit() {
    Wrap<String> pageUriTeamWrap = new Wrap<String>().var("pageUriTeam");
    if(pageUriTeam == null) {
      _pageUriTeam(pageUriTeamWrap);
      Optional.ofNullable(pageUriTeamWrap.getO()).ifPresent(o -> {
        setPageUriTeam(o);
      });
    }
    return (TeamGenPage)this;
  }

  public static String staticSearchPageUriTeam(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrPageUriTeam(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqPageUriTeam(SiteRequest siteRequest_, String o) {
    return TeamGenPage.staticSearchPageUriTeam(siteRequest_, TeamGenPage.staticSetPageUriTeam(siteRequest_, o)).toString();
  }

  //////////////
  // initDeep //
  //////////////

  public Future<TeamGenPageGen<DEV>> promiseDeepTeamGenPage(SiteRequest siteRequest_) {
    setSiteRequest_(siteRequest_);
    return promiseDeepTeamGenPage();
  }

  public Future<TeamGenPageGen<DEV>> promiseDeepTeamGenPage() {
    Promise<TeamGenPageGen<DEV>> promise = Promise.promise();
    Promise<Void> promise2 = Promise.promise();
    promiseTeamGenPage(promise2);
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

  public Future<Void> promiseTeamGenPage(Promise<Void> promise) {
    Future.future(a -> a.complete()).compose(a -> {
      Promise<Void> promise2 = Promise.promise();
      try {
        searchListTeam_Init();
        listTeamInit();
        resultCountInit();
        resultInit();
        pkInit();
        solrIdInit();
        pageUriTeamInit();
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

  @Override public Future<? extends TeamGenPageGen<DEV>> promiseDeepForClass(SiteRequest siteRequest_) {
    return promiseDeepTeamGenPage(siteRequest_);
  }

  /////////////////
  // siteRequest //
  /////////////////

  public void siteRequestTeamGenPage(SiteRequest siteRequest_) {
      super.siteRequestPageLayout(siteRequest_);
  }

  public void siteRequestForClass(SiteRequest siteRequest_) {
    siteRequestTeamGenPage(siteRequest_);
  }

  /////////////
  // obtain //
  /////////////

  @Override public Object obtainForClass(String var) {
    String[] vars = StringUtils.split(var, ".");
    Object o = null;
    for(String v : vars) {
      if(o == null)
        o = obtainTeamGenPage(v);
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
  public Object obtainTeamGenPage(String var) {
    TeamGenPage oTeamGenPage = (TeamGenPage)this;
    switch(var) {
      case "searchListTeam_":
        return oTeamGenPage.searchListTeam_;
      case "listTeam":
        return oTeamGenPage.listTeam;
      case "resultCount":
        return oTeamGenPage.resultCount;
      case "result":
        return oTeamGenPage.result;
      case "pk":
        return oTeamGenPage.pk;
      case "solrId":
        return oTeamGenPage.solrId;
      case "pageUriTeam":
        return oTeamGenPage.pageUriTeam;
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
        o = relateTeamGenPage(v, val);
      else if(o instanceof BaseModel) {
        BaseModel baseModel = (BaseModel)o;
        o = baseModel.relateForClass(v, val);
      }
    }
    return o != null;
  }
  public Object relateTeamGenPage(String var, Object val) {
    TeamGenPage oTeamGenPage = (TeamGenPage)this;
    switch(var) {
      default:
        return super.relatePageLayout(var, val);
    }
  }

  ///////////////
  // staticSet //
  ///////////////

  public static Object staticSetForClass(String entityVar, SiteRequest siteRequest_, String v, TeamGenPage o) {
    return staticSetTeamGenPage(entityVar,  siteRequest_, v, o);
  }
  public static Object staticSetTeamGenPage(String entityVar, SiteRequest siteRequest_, String v, TeamGenPage o) {
    switch(entityVar) {
    case "listTeam":
      return TeamGenPage.staticSetListTeam(siteRequest_, v);
    case "resultCount":
      return TeamGenPage.staticSetResultCount(siteRequest_, v);
    case "pk":
      return TeamGenPage.staticSetPk(siteRequest_, v);
    case "solrId":
      return TeamGenPage.staticSetSolrId(siteRequest_, v);
    case "pageUriTeam":
      return TeamGenPage.staticSetPageUriTeam(siteRequest_, v);
      default:
        return PageLayout.staticSetPageLayout(entityVar,  siteRequest_, v, o);
    }
  }

  ////////////////
  // staticSearch //
  ////////////////

  public static Object staticSearchForClass(String entityVar, SiteRequest siteRequest_, Object o) {
    return staticSearchTeamGenPage(entityVar,  siteRequest_, o);
  }
  public static Object staticSearchTeamGenPage(String entityVar, SiteRequest siteRequest_, Object o) {
    switch(entityVar) {
    case "listTeam":
      return TeamGenPage.staticSearchListTeam(siteRequest_, (JsonArray)o);
    case "resultCount":
      return TeamGenPage.staticSearchResultCount(siteRequest_, (Integer)o);
    case "pk":
      return TeamGenPage.staticSearchPk(siteRequest_, (Long)o);
    case "solrId":
      return TeamGenPage.staticSearchSolrId(siteRequest_, (String)o);
    case "pageUriTeam":
      return TeamGenPage.staticSearchPageUriTeam(siteRequest_, (String)o);
      default:
        return PageLayout.staticSearchPageLayout(entityVar,  siteRequest_, o);
    }
  }

  ///////////////////
  // staticSearchStr //
  ///////////////////

  public static String staticSearchStrForClass(String entityVar, SiteRequest siteRequest_, Object o) {
    return staticSearchStrTeamGenPage(entityVar,  siteRequest_, o);
  }
  public static String staticSearchStrTeamGenPage(String entityVar, SiteRequest siteRequest_, Object o) {
    switch(entityVar) {
    case "listTeam":
      return TeamGenPage.staticSearchStrListTeam(siteRequest_, (String)o);
    case "resultCount":
      return TeamGenPage.staticSearchStrResultCount(siteRequest_, (Integer)o);
    case "pk":
      return TeamGenPage.staticSearchStrPk(siteRequest_, (Long)o);
    case "solrId":
      return TeamGenPage.staticSearchStrSolrId(siteRequest_, (String)o);
    case "pageUriTeam":
      return TeamGenPage.staticSearchStrPageUriTeam(siteRequest_, (String)o);
      default:
        return PageLayout.staticSearchStrPageLayout(entityVar,  siteRequest_, o);
    }
  }

  //////////////////
  // staticSearchFq //
  //////////////////

  public static String staticSearchFqForClass(String entityVar, SiteRequest siteRequest_, String o) {
    return staticSearchFqTeamGenPage(entityVar,  siteRequest_, o);
  }
  public static String staticSearchFqTeamGenPage(String entityVar, SiteRequest siteRequest_, String o) {
    switch(entityVar) {
    case "listTeam":
      return TeamGenPage.staticSearchFqListTeam(siteRequest_, o);
    case "resultCount":
      return TeamGenPage.staticSearchFqResultCount(siteRequest_, o);
    case "pk":
      return TeamGenPage.staticSearchFqPk(siteRequest_, o);
    case "solrId":
      return TeamGenPage.staticSearchFqSolrId(siteRequest_, o);
    case "pageUriTeam":
      return TeamGenPage.staticSearchFqPageUriTeam(siteRequest_, o);
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

  public static final String CLASS_SIMPLE_NAME = "TeamGenPage";
  public static final String CLASS_CANONICAL_NAME = "org.computate.spinechamp.model.team.TeamGenPage";
  public static final String CLASS_AUTH_RESOURCE = "";
  public static final String VAR_searchListTeam_ = "searchListTeam_";
  public static final String VAR_listTeam = "listTeam";
  public static final String VAR_resultCount = "resultCount";
  public static final String VAR_result = "result";
  public static final String VAR_pk = "pk";
  public static final String VAR_solrId = "solrId";
  public static final String VAR_pageUriTeam = "pageUriTeam";

  public static final String DISPLAY_NAME_searchListTeam_ = "";
  public static final String DISPLAY_NAME_listTeam = "";
  public static final String DISPLAY_NAME_resultCount = "";
  public static final String DISPLAY_NAME_result = "";
  public static final String DISPLAY_NAME_pk = "";
  public static final String DISPLAY_NAME_solrId = "";
  public static final String DISPLAY_NAME_pageUriTeam = "";

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
    return TeamGenPage.displayNameTeamGenPage(var);
  }
  public static String displayNameTeamGenPage(String var) {
    switch(var) {
    case VAR_searchListTeam_:
      return DISPLAY_NAME_searchListTeam_;
    case VAR_listTeam:
      return DISPLAY_NAME_listTeam;
    case VAR_resultCount:
      return DISPLAY_NAME_resultCount;
    case VAR_result:
      return DISPLAY_NAME_result;
    case VAR_pk:
      return DISPLAY_NAME_pk;
    case VAR_solrId:
      return DISPLAY_NAME_solrId;
    case VAR_pageUriTeam:
      return DISPLAY_NAME_pageUriTeam;
    default:
      return PageLayout.displayNamePageLayout(var);
    }
  }

  public static String descriptionTeamGenPage(String var) {
    if(var == null)
      return null;
    switch(var) {
      default:
        return PageLayout.descriptionPageLayout(var);
    }
  }

  public static String classSimpleNameTeamGenPage(String var) {
    switch(var) {
    case VAR_searchListTeam_:
      return "SearchList";
    case VAR_listTeam:
      return "JsonArray";
    case VAR_resultCount:
      return "Integer";
    case VAR_result:
      return "Team";
    case VAR_pk:
      return "Long";
    case VAR_solrId:
      return "String";
    case VAR_pageUriTeam:
      return "String";
      default:
        return PageLayout.classSimpleNamePageLayout(var);
    }
  }

  public static Integer htmColumnTeamGenPage(String var) {
    switch(var) {
      default:
        return PageLayout.htmColumnPageLayout(var);
    }
  }

  public static Integer htmRowTeamGenPage(String var) {
    switch(var) {
      default:
        return PageLayout.htmRowPageLayout(var);
    }
  }

  public static Integer htmCellTeamGenPage(String var) {
    switch(var) {
      default:
        return PageLayout.htmCellPageLayout(var);
    }
  }

  public static Integer lengthMinTeamGenPage(String var) {
    switch(var) {
      default:
        return PageLayout.lengthMinPageLayout(var);
    }
  }

  public static Integer lengthMaxTeamGenPage(String var) {
    switch(var) {
      default:
        return PageLayout.lengthMaxPageLayout(var);
    }
  }

  public static Integer maxTeamGenPage(String var) {
    switch(var) {
      default:
        return PageLayout.maxPageLayout(var);
    }
  }

  public static Integer minTeamGenPage(String var) {
    switch(var) {
      default:
        return PageLayout.minPageLayout(var);
    }
  }
}
