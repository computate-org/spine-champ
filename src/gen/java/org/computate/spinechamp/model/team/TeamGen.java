package org.computate.spinechamp.model.team;

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
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.response.solr.SolrResponse;

/**
 * <ol>
<h3>Suggestions that can generate more code for you: </h3> * </ol>
 * <li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class TeamGen into the class Team. 
 * </li><li>You can add a class comment "Rows: 100" if you wish the Team API to return more or less than 10 records by default. 
 * In this case, the API will return 100 records from the API instead of 10 by default. 
 * Each API has built in pagination of the search records to ensure a user can query all the data a page at a time without running the application out of memory. 
 * </li>
 * <h3>About the Team class and it's generated class TeamGen&lt;BaseModel&gt;: </h3>extends TeamGen
 * <p>
 * This Java class extends a generated Java class TeamGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.team.Team">Find the class Team in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends TeamGen<BaseModel>
 * <p>This <code>class Team extends TeamGen&lt;BaseModel&gt;</code>, which means it extends a newly generated TeamGen. 
 * The generated <code>class TeamGen extends BaseModel</code> which means that Team extends TeamGen which extends BaseModel. 
 * This generated inheritance is a powerful feature that allows a lot of boiler plate code to be created for you automatically while still preserving inheritance through the power of Java Generic classes. 
 * </p>
 * <h2>Api: true</h2>
 * <p>This class contains a comment <b>"Api: true"</b>, which means this class will have Java Vert.x API backend code generated for these objects. 
 * </p>
 * <h2>ApiTag.enUS: true</h2>
 * <p>This class contains a comment <b>"ApiTag: teams"</b>, which groups all of the OpenAPIs for Team objects under the tag "teams". 
 * </p>
 * <h2>ApiUri.enUS: /en-us/api/team</h2>
 * <p>This class contains a comment <b>"ApiUri: /en-us/api/team"</b>, which defines the base API URI for Team objects as "/en-us/api/team" in the OpenAPI spec. 
 * </p>
 * <h2>Color: null</h2>
 * <h2>Indexed: true</h2>
 * <p>This class contains a comment <b>"Indexed: true"</b>, which means this class will be indexed in the search engine. 
 * Every protected void method that begins with "_" that is marked to be searched with a comment like "Indexed: true", "Stored: true", or "DocValues: true" will be indexed in the search engine. 
 * </p>
 * <h2>{@inheritDoc}</h2>
 * <p>By adding a class comment "{@inheritDoc}", the Team class will inherit the helpful inherited class comments from the super class TeamGen. 
 * </p>
 * <h2>Rows: null</h2>
 * <h2>Order: 5</h2>
 * <p>This class contains a comment <b>"Order: 5"</b>, which means this class will be sorted by the given number 5 ascending when code that relates to multiple classes at the same time is generated. 
 * </p>
 * <h2>SqlOrder: 5</h2>
 * <p>This class contains a comment <b>"SqlOrder: 5"</b>, which means this class will be sorted by the given number 5 ascending when SQL code to create and drop the tables is generated. 
 * </p>
 * <h2>Model: true</h2>
 * <p>This class contains a comment <b>"Model: true"</b>, which means this class will be stored in the database. 
 * Every protected void method that begins with "_" that contains a "Persist: true" comment will be a persisted field in the database table. 
 * </p>
 * <h2>Page: true</h2>
 * <p>This class contains a comment <b>"Page: true"</b>, which means this class will have webpage code generated for these objects. 
 * Java Vert.x backend API code, Handlebars HTML template frontend code, and JavaScript code will all generated and can be extended. 
 * This creates a new Java class org.computate.spinechamp.model.team.TeamPage. 
 * </p>
 * <h2>SuperPage.enUS: PageLayout</h2>
 * <p>This class contains a comment <b>"SuperPage.enUS: PageLayout"</b>, which identifies the Java super class of the page code by it's class simple name "PageLayout". 
 * This means that the newly created class org.computate.spinechamp.model.team.TeamPage extends org.computate.spinechamp.page.PageLayout. 
 * </p>
 * <h2>Promise: true</h2>
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the Team Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * <h2>AName.enUS: a team</h2>
 * <p>This class contains a comment <b>"AName.enUS: a team"</b>, which identifies the language context to describe a Team as "a team". 
 * </p>
 * <p>
 * Delete the class Team in Solr: 
 * <pre>
 * curl -k 'https://solr.apps-crc.testing/solr/computate/update?commitWithin=1000&amp;overwrite=true&amp;wt=json' -X POST -H 'Content-type: text/xml' -u "admin:$(oc -n solr get secret/solr-solrcloud-security-bootstrap -o jsonpath={.data.admin} | base64 -d)" --data-raw '&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.team.Team&lt;/query&gt;&lt;/delete&gt;'
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
public abstract class TeamGen<DEV> extends BaseModel {
  protected static final Logger LOG = LoggerFactory.getLogger(Team.class);

  public static final String Description_enUS = "A sports team. ";
  public static final String AName_enUS = "a team";
  public static final String This_enUS = "this ";
  public static final String ThisName_enUS = "this team";
  public static final String A_enUS = "a ";
  public static final String TheName_enUS = "the team";
  public static final String SingularName_enUS = "team";
  public static final String PluralName_enUS = "teams";
  public static final String NameActual_enUS = "current team";
  public static final String AllName_enUS = "all teams";
  public static final String SearchAllNameBy_enUS = "search teams by ";
  public static final String SearchAllName_enUS = "search teams";
  public static final String Title_enUS = "teams";
  public static final String ThePluralName_enUS = "the teams";
  public static final String NoNameFound_enUS = "no team found";
  public static final String ApiUri_enUS = "/en-us/api/team";
  public static final String ApiUriSearchPage_enUS = "/en-us/search/team";
  public static final String ApiUriEditPage_enUS = "/en-us/edit/team/{teamId}";
  public static final String OfName_enUS = "of team";
  public static final String ANameAdjective_enUS = "a team";
  public static final String NameAdjectiveSingular_enUS = "team";
  public static final String NameAdjectivePlural_enUS = "teams";
  public static final String Search_enUS_OpenApiUri = "/en-us/api/team";
  public static final String Search_enUS_StringFormatUri = "/en-us/api/team";
  public static final String Search_enUS_StringFormatUrl = "%s/en-us/api/team";
  public static final String GET_enUS_OpenApiUri = "/en-us/api/team/{teamId}";
  public static final String GET_enUS_StringFormatUri = "/en-us/api/team/%s";
  public static final String GET_enUS_StringFormatUrl = "%s/en-us/api/team/%s";
  public static final String PATCH_enUS_OpenApiUri = "/en-us/api/team";
  public static final String PATCH_enUS_StringFormatUri = "/en-us/api/team";
  public static final String PATCH_enUS_StringFormatUrl = "%s/en-us/api/team";
  public static final String POST_enUS_OpenApiUri = "/en-us/api/team";
  public static final String POST_enUS_StringFormatUri = "/en-us/api/team";
  public static final String POST_enUS_StringFormatUrl = "%s/en-us/api/team";
  public static final String DELETE_enUS_OpenApiUri = "/en-us/api/team/{teamId}";
  public static final String DELETE_enUS_StringFormatUri = "/en-us/api/team/%s";
  public static final String DELETE_enUS_StringFormatUrl = "%s/en-us/api/team/%s";
  public static final String PUTImport_enUS_OpenApiUri = "/en-us/api/team-import";
  public static final String PUTImport_enUS_StringFormatUri = "/en-us/api/team-import";
  public static final String PUTImport_enUS_StringFormatUrl = "%s/en-us/api/team-import";
  public static final String SearchPage_enUS_OpenApiUri = "/en-us/search/team";
  public static final String SearchPage_enUS_StringFormatUri = "/en-us/search/team";
  public static final String SearchPage_enUS_StringFormatUrl = "%s/en-us/search/team";
  public static final String EditPage_enUS_OpenApiUri = "/en-us/edit/team/{teamId}";
  public static final String EditPage_enUS_StringFormatUri = "/en-us/edit/team/%s";
  public static final String EditPage_enUS_StringFormatUrl = "%s/en-us/edit/team/%s";
  public static final String DELETEFilter_enUS_OpenApiUri = "/en-us/api/team";
  public static final String DELETEFilter_enUS_StringFormatUri = "/en-us/api/team";
  public static final String DELETEFilter_enUS_StringFormatUrl = "%s/en-us/api/team";

  public static final String Icon = "<i class=\"fa-regular fa-buildings\"></i>";

	////////////
  // region //
	////////////


  /**
   *  The entity region
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String region;

  /**
   * <br> The entity region
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.team.Team&fq=entiteVar_enUS_indexed_string:region">Find the entity region in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _region(Wrap<String> w);

  public String getRegion() {
    return region;
  }
  public void setRegion(String o) {
    this.region = Team.staticSetRegion(siteRequest_, o);
  }
  public static String staticSetRegion(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected Team regionInit() {
    Wrap<String> regionWrap = new Wrap<String>().var("region");
    if(region == null) {
      _region(regionWrap);
      Optional.ofNullable(regionWrap.getO()).ifPresent(o -> {
        setRegion(o);
      });
    }
    return (Team)this;
  }

  public static String staticSearchRegion(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrRegion(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqRegion(SiteRequest siteRequest_, String o) {
    return Team.staticSearchRegion(siteRequest_, Team.staticSetRegion(siteRequest_, o)).toString();
  }

  public String sqlRegion() {
    return region;
  }

  public static String staticJsonRegion(String region) {
    return region;
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
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.team.Team&fq=entiteVar_enUS_indexed_string:name">Find the entity name in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _name(Wrap<String> w);

  public String getName() {
    return name;
  }
  public void setName(String o) {
    this.name = Team.staticSetName(siteRequest_, o);
  }
  public static String staticSetName(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected Team nameInit() {
    Wrap<String> nameWrap = new Wrap<String>().var("name");
    if(name == null) {
      _name(nameWrap);
      Optional.ofNullable(nameWrap.getO()).ifPresent(o -> {
        setName(o);
      });
    }
    return (Team)this;
  }

  public static String staticSearchName(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrName(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqName(SiteRequest siteRequest_, String o) {
    return Team.staticSearchName(siteRequest_, Team.staticSetName(siteRequest_, o)).toString();
  }

  public String sqlName() {
    return name;
  }

  public static String staticJsonName(String name) {
    return name;
  }

	//////////////////
  // abbreviation //
	//////////////////


  /**
   *  The entity abbreviation
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String abbreviation;

  /**
   * <br> The entity abbreviation
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.team.Team&fq=entiteVar_enUS_indexed_string:abbreviation">Find the entity abbreviation in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _abbreviation(Wrap<String> w);

  public String getAbbreviation() {
    return abbreviation;
  }
  public void setAbbreviation(String o) {
    this.abbreviation = Team.staticSetAbbreviation(siteRequest_, o);
  }
  public static String staticSetAbbreviation(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected Team abbreviationInit() {
    Wrap<String> abbreviationWrap = new Wrap<String>().var("abbreviation");
    if(abbreviation == null) {
      _abbreviation(abbreviationWrap);
      Optional.ofNullable(abbreviationWrap.getO()).ifPresent(o -> {
        setAbbreviation(o);
      });
    }
    return (Team)this;
  }

  public static String staticSearchAbbreviation(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrAbbreviation(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqAbbreviation(SiteRequest siteRequest_, String o) {
    return Team.staticSearchAbbreviation(siteRequest_, Team.staticSetAbbreviation(siteRequest_, o)).toString();
  }

  public String sqlAbbreviation() {
    return abbreviation;
  }

  public static String staticJsonAbbreviation(String abbreviation) {
    return abbreviation;
  }

	/////////////////
  // displayName //
	/////////////////


  /**
   *  The entity displayName
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String displayName;

  /**
   * <br> The entity displayName
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.team.Team&fq=entiteVar_enUS_indexed_string:displayName">Find the entity displayName in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _displayName(Wrap<String> w);

  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String o) {
    this.displayName = Team.staticSetDisplayName(siteRequest_, o);
  }
  public static String staticSetDisplayName(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected Team displayNameInit() {
    Wrap<String> displayNameWrap = new Wrap<String>().var("displayName");
    if(displayName == null) {
      _displayName(displayNameWrap);
      Optional.ofNullable(displayNameWrap.getO()).ifPresent(o -> {
        setDisplayName(o);
      });
    }
    return (Team)this;
  }

  public static String staticSearchDisplayName(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrDisplayName(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqDisplayName(SiteRequest siteRequest_, String o) {
    return Team.staticSearchDisplayName(siteRequest_, Team.staticSetDisplayName(siteRequest_, o)).toString();
  }

  public String sqlDisplayName() {
    return displayName;
  }

  public static String staticJsonDisplayName(String displayName) {
    return displayName;
  }

	////////////
  // teamId //
	////////////


  /**
   *  The entity teamId
   *	 is defined as null before being initialized. 
   */
  @JsonProperty
  @JsonInclude(Include.NON_NULL)
  protected String teamId;

  /**
   * <br> The entity teamId
   *  is defined as null before being initialized. 
   * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.spinechamp.model.team.Team&fq=entiteVar_enUS_indexed_string:teamId">Find the entity teamId in Solr</a>
   * <br>
   * @param w is for wrapping a value to assign to this entity during initialization. 
   **/
  protected abstract void _teamId(Wrap<String> w);

  public String getTeamId() {
    return teamId;
  }
  public void setTeamId(String o) {
    this.teamId = Team.staticSetTeamId(siteRequest_, o);
  }
  public static String staticSetTeamId(SiteRequest siteRequest_, String o) {
    return o;
  }
  protected Team teamIdInit() {
    Wrap<String> teamIdWrap = new Wrap<String>().var("teamId");
    if(teamId == null) {
      _teamId(teamIdWrap);
      Optional.ofNullable(teamIdWrap.getO()).ifPresent(o -> {
        setTeamId(o);
      });
    }
    return (Team)this;
  }

  public static String staticSearchTeamId(SiteRequest siteRequest_, String o) {
    return o;
  }

  public static String staticSearchStrTeamId(SiteRequest siteRequest_, String o) {
    return o == null ? null : o.toString();
  }

  public static String staticSearchFqTeamId(SiteRequest siteRequest_, String o) {
    return Team.staticSearchTeamId(siteRequest_, Team.staticSetTeamId(siteRequest_, o)).toString();
  }

  public String sqlTeamId() {
    return teamId;
  }

  public static String staticJsonTeamId(String teamId) {
    return teamId;
  }

  //////////////
  // initDeep //
  //////////////

  public Future<TeamGen<DEV>> promiseDeepTeam(SiteRequest siteRequest_) {
    setSiteRequest_(siteRequest_);
    return promiseDeepTeam();
  }

  public Future<TeamGen<DEV>> promiseDeepTeam() {
    Promise<TeamGen<DEV>> promise = Promise.promise();
    Promise<Void> promise2 = Promise.promise();
    promiseTeam(promise2);
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

  public Future<Void> promiseTeam(Promise<Void> promise) {
    Future.future(a -> a.complete()).compose(a -> {
      Promise<Void> promise2 = Promise.promise();
      try {
        regionInit();
        nameInit();
        abbreviationInit();
        displayNameInit();
        teamIdInit();
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

  @Override public Future<? extends TeamGen<DEV>> promiseDeepForClass(SiteRequest siteRequest_) {
    return promiseDeepTeam(siteRequest_);
  }

  /////////////////
  // siteRequest //
  /////////////////

  public void siteRequestTeam(SiteRequest siteRequest_) {
      super.siteRequestBaseModel(siteRequest_);
  }

  public void siteRequestForClass(SiteRequest siteRequest_) {
    siteRequestTeam(siteRequest_);
  }

  /////////////
  // obtain //
  /////////////

  @Override public Object obtainForClass(String var) {
    String[] vars = StringUtils.split(var, ".");
    Object o = null;
    for(String v : vars) {
      if(o == null)
        o = obtainTeam(v);
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
  public Object obtainTeam(String var) {
    Team oTeam = (Team)this;
    switch(var) {
      case "region":
        return oTeam.region;
      case "name":
        return oTeam.name;
      case "abbreviation":
        return oTeam.abbreviation;
      case "displayName":
        return oTeam.displayName;
      case "teamId":
        return oTeam.teamId;
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
        o = relateTeam(v, val);
      else if(o instanceof BaseModel) {
        BaseModel baseModel = (BaseModel)o;
        o = baseModel.relateForClass(v, val);
      }
    }
    return o != null;
  }
  public Object relateTeam(String var, Object val) {
    Team oTeam = (Team)this;
    switch(var) {
      default:
        return super.relateBaseModel(var, val);
    }
  }

  ///////////////
  // staticSet //
  ///////////////

  public static Object staticSetForClass(String entityVar, SiteRequest siteRequest_, String v, Team o) {
    return staticSetTeam(entityVar,  siteRequest_, v, o);
  }
  public static Object staticSetTeam(String entityVar, SiteRequest siteRequest_, String v, Team o) {
    switch(entityVar) {
    case "region":
      return Team.staticSetRegion(siteRequest_, v);
    case "name":
      return Team.staticSetName(siteRequest_, v);
    case "abbreviation":
      return Team.staticSetAbbreviation(siteRequest_, v);
    case "displayName":
      return Team.staticSetDisplayName(siteRequest_, v);
    case "teamId":
      return Team.staticSetTeamId(siteRequest_, v);
      default:
        return BaseModel.staticSetBaseModel(entityVar,  siteRequest_, v, o);
    }
  }

  ////////////////
  // staticSearch //
  ////////////////

  public static Object staticSearchForClass(String entityVar, SiteRequest siteRequest_, Object o) {
    return staticSearchTeam(entityVar,  siteRequest_, o);
  }
  public static Object staticSearchTeam(String entityVar, SiteRequest siteRequest_, Object o) {
    switch(entityVar) {
    case "region":
      return Team.staticSearchRegion(siteRequest_, (String)o);
    case "name":
      return Team.staticSearchName(siteRequest_, (String)o);
    case "abbreviation":
      return Team.staticSearchAbbreviation(siteRequest_, (String)o);
    case "displayName":
      return Team.staticSearchDisplayName(siteRequest_, (String)o);
    case "teamId":
      return Team.staticSearchTeamId(siteRequest_, (String)o);
      default:
        return BaseModel.staticSearchBaseModel(entityVar,  siteRequest_, o);
    }
  }

  ///////////////////
  // staticSearchStr //
  ///////////////////

  public static String staticSearchStrForClass(String entityVar, SiteRequest siteRequest_, Object o) {
    return staticSearchStrTeam(entityVar,  siteRequest_, o);
  }
  public static String staticSearchStrTeam(String entityVar, SiteRequest siteRequest_, Object o) {
    switch(entityVar) {
    case "region":
      return Team.staticSearchStrRegion(siteRequest_, (String)o);
    case "name":
      return Team.staticSearchStrName(siteRequest_, (String)o);
    case "abbreviation":
      return Team.staticSearchStrAbbreviation(siteRequest_, (String)o);
    case "displayName":
      return Team.staticSearchStrDisplayName(siteRequest_, (String)o);
    case "teamId":
      return Team.staticSearchStrTeamId(siteRequest_, (String)o);
      default:
        return BaseModel.staticSearchStrBaseModel(entityVar,  siteRequest_, o);
    }
  }

  //////////////////
  // staticSearchFq //
  //////////////////

  public static String staticSearchFqForClass(String entityVar, SiteRequest siteRequest_, String o) {
    return staticSearchFqTeam(entityVar,  siteRequest_, o);
  }
  public static String staticSearchFqTeam(String entityVar, SiteRequest siteRequest_, String o) {
    switch(entityVar) {
    case "region":
      return Team.staticSearchFqRegion(siteRequest_, o);
    case "name":
      return Team.staticSearchFqName(siteRequest_, o);
    case "abbreviation":
      return Team.staticSearchFqAbbreviation(siteRequest_, o);
    case "displayName":
      return Team.staticSearchFqDisplayName(siteRequest_, o);
    case "teamId":
      return Team.staticSearchFqTeamId(siteRequest_, o);
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
          o = persistTeam(v, val);
        else if(o instanceof BaseModel) {
          BaseModel oBaseModel = (BaseModel)o;
          o = oBaseModel.persistForClass(v, val);
        }
      }
    }
    return o != null;
  }
  public Object persistTeam(String var, Object val) {
    String varLower = var.toLowerCase();
      if("region".equals(varLower)) {
        if(val instanceof String) {
          setRegion((String)val);
        }
        saves.add("region");
        return val;
      } else if("name".equals(varLower)) {
        if(val instanceof String) {
          setName((String)val);
        }
        saves.add("name");
        return val;
      } else if("abbreviation".equals(varLower)) {
        if(val instanceof String) {
          setAbbreviation((String)val);
        }
        saves.add("abbreviation");
        return val;
      } else if("displayname".equals(varLower)) {
        if(val instanceof String) {
          setDisplayName((String)val);
        }
        saves.add("displayName");
        return val;
      } else if("teamid".equals(varLower)) {
        if(val instanceof String) {
          setTeamId((String)val);
        }
        saves.add("teamId");
        return val;
    } else {
      return super.persistBaseModel(var, val);
    }
  }

  /////////////
  // populate //
  /////////////

  @Override public void populateForClass(SolrResponse.Doc doc) {
    populateTeam(doc);
  }
  public void populateTeam(SolrResponse.Doc doc) {
    Team oTeam = (Team)this;
    saves = Optional.ofNullable((ArrayList<String>)doc.get("saves_docvalues_strings")).orElse(new ArrayList<String>());
    if(saves != null) {

      if(saves.contains("region")) {
        String region = (String)doc.get("region_docvalues_string");
        if(region != null)
          oTeam.setRegion(region);
      }

      if(saves.contains("name")) {
        String name = (String)doc.get("name_docvalues_string");
        if(name != null)
          oTeam.setName(name);
      }

      if(saves.contains("abbreviation")) {
        String abbreviation = (String)doc.get("abbreviation_docvalues_string");
        if(abbreviation != null)
          oTeam.setAbbreviation(abbreviation);
      }

      if(saves.contains("displayName")) {
        String displayName = (String)doc.get("displayName_docvalues_string");
        if(displayName != null)
          oTeam.setDisplayName(displayName);
      }

      if(saves.contains("teamId")) {
        String teamId = (String)doc.get("teamId_docvalues_string");
        if(teamId != null)
          oTeam.setTeamId(teamId);
      }
    }

    super.populateBaseModel(doc);
  }

  public void indexTeam(JsonObject doc) {
    if(region != null) {
      doc.put("region_docvalues_string", region);
    }
    if(name != null) {
      doc.put("name_docvalues_string", name);
    }
    if(abbreviation != null) {
      doc.put("abbreviation_docvalues_string", abbreviation);
    }
    if(displayName != null) {
      doc.put("displayName_docvalues_string", displayName);
    }
    if(teamId != null) {
      doc.put("teamId_docvalues_string", teamId);
    }
    super.indexBaseModel(doc);

	}

  public static String varStoredTeam(String entityVar) {
    switch(entityVar) {
      case "region":
        return "region_docvalues_string";
      case "name":
        return "name_docvalues_string";
      case "abbreviation":
        return "abbreviation_docvalues_string";
      case "displayName":
        return "displayName_docvalues_string";
      case "teamId":
        return "teamId_docvalues_string";
      default:
        return BaseModel.varStoredBaseModel(entityVar);
    }
  }

  public static String varIndexedTeam(String entityVar) {
    switch(entityVar) {
      case "region":
        return "region_docvalues_string";
      case "name":
        return "name_docvalues_string";
      case "abbreviation":
        return "abbreviation_docvalues_string";
      case "displayName":
        return "displayName_docvalues_string";
      case "teamId":
        return "teamId_docvalues_string";
      default:
        return BaseModel.varIndexedBaseModel(entityVar);
    }
  }

  public static String searchVarTeam(String searchVar) {
    switch(searchVar) {
      case "region_docvalues_string":
        return "region";
      case "name_docvalues_string":
        return "name";
      case "abbreviation_docvalues_string":
        return "abbreviation";
      case "displayName_docvalues_string":
        return "displayName";
      case "teamId_docvalues_string":
        return "teamId";
      default:
        return BaseModel.searchVarBaseModel(searchVar);
    }
  }

  public static String varSearchTeam(String entityVar) {
    switch(entityVar) {
      default:
        return BaseModel.varSearchBaseModel(entityVar);
    }
  }

  public static String varSuggestedTeam(String entityVar) {
    switch(entityVar) {
      default:
        return BaseModel.varSuggestedBaseModel(entityVar);
    }
  }

  /////////////
  // store //
  /////////////

  @Override public void storeForClass(SolrResponse.Doc doc) {
    storeTeam(doc);
  }
  public void storeTeam(SolrResponse.Doc doc) {
    Team oTeam = (Team)this;
    SiteRequest siteRequest = oTeam.getSiteRequest_();

    oTeam.setRegion(Optional.ofNullable(doc.get("region_docvalues_string")).map(v -> v.toString()).orElse(null));
    oTeam.setName(Optional.ofNullable(doc.get("name_docvalues_string")).map(v -> v.toString()).orElse(null));
    oTeam.setAbbreviation(Optional.ofNullable(doc.get("abbreviation_docvalues_string")).map(v -> v.toString()).orElse(null));
    oTeam.setDisplayName(Optional.ofNullable(doc.get("displayName_docvalues_string")).map(v -> v.toString()).orElse(null));
    oTeam.setTeamId(Optional.ofNullable(doc.get("teamId_docvalues_string")).map(v -> v.toString()).orElse(null));

    super.storeBaseModel(doc);
  }

  //////////////////
  // apiRequest //
  //////////////////

  public void apiRequestTeam() {
    ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(r -> r.getApiRequest_()).orElse(null);
    Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
    if(o != null && o instanceof Team) {
      Team original = (Team)o;
      if(!Objects.equals(region, original.getRegion()))
        apiRequest.addVars("region");
      if(!Objects.equals(name, original.getName()))
        apiRequest.addVars("name");
      if(!Objects.equals(abbreviation, original.getAbbreviation()))
        apiRequest.addVars("abbreviation");
      if(!Objects.equals(displayName, original.getDisplayName()))
        apiRequest.addVars("displayName");
      if(!Objects.equals(teamId, original.getTeamId()))
        apiRequest.addVars("teamId");
      super.apiRequestBaseModel();
    }
  }

  //////////////
  // toString //
  //////////////

  @Override public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(super.toString());
    sb.append(Optional.ofNullable(region).map(v -> "region: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(name).map(v -> "name: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(abbreviation).map(v -> "abbreviation: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(displayName).map(v -> "displayName: \"" + v + "\"\n" ).orElse(""));
    sb.append(Optional.ofNullable(teamId).map(v -> "teamId: \"" + v + "\"\n" ).orElse(""));
    return sb.toString();
  }

  public static final String CLASS_SIMPLE_NAME = "Team";
  public static final String CLASS_CANONICAL_NAME = "org.computate.spinechamp.model.team.Team";
  public static final String CLASS_AUTH_RESOURCE = "TEAM";
  public static final String CLASS_API_ADDRESS_Team = "spine-champ-enUS-Team";
  public static String getClassApiAddress() {
    return CLASS_API_ADDRESS_Team;
  }
  public static final String VAR_region = "region";
  public static final String VAR_name = "name";
  public static final String VAR_abbreviation = "abbreviation";
  public static final String VAR_displayName = "displayName";
  public static final String VAR_teamId = "teamId";

  public static List<String> varsQForClass() {
    return Team.varsQTeam(new ArrayList<String>());
  }
  public static List<String> varsQTeam(List<String> vars) {
    BaseModel.varsQBaseModel(vars);
    return vars;
  }

  public static List<String> varsFqForClass() {
    return Team.varsFqTeam(new ArrayList<String>());
  }
  public static List<String> varsFqTeam(List<String> vars) {
    BaseModel.varsFqBaseModel(vars);
    return vars;
  }

  public static List<String> varsRangeForClass() {
    return Team.varsRangeTeam(new ArrayList<String>());
  }
  public static List<String> varsRangeTeam(List<String> vars) {
    BaseModel.varsRangeBaseModel(vars);
    return vars;
  }

  public static final String DISPLAY_NAME_region = "team region";
  public static final String DISPLAY_NAME_name = "team name";
  public static final String DISPLAY_NAME_abbreviation = "team abbreviation";
  public static final String DISPLAY_NAME_displayName = "team ID";
  public static final String DISPLAY_NAME_teamId = "team ID";

  @Override
  public String idForClass() {
    return teamId;
  }

  @Override
  public String titleForClass() {
    return objectTitle;
  }

  @Override
  public String nameForClass() {
    return displayName;
  }

  @Override
  public String classNameAdjectiveSingularForClass() {
    return Team.NameAdjectiveSingular_enUS;
  }

  @Override
  public String descriptionForClass() {
    return null;
  }

  @Override
  public String enUSStringFormatUrlEditPageForClass() {
    return "%s/en-us/edit/team/%s";
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
    return Team.displayNameTeam(var);
  }
  public static String displayNameTeam(String var) {
    switch(var) {
    case VAR_region:
      return DISPLAY_NAME_region;
    case VAR_name:
      return DISPLAY_NAME_name;
    case VAR_abbreviation:
      return DISPLAY_NAME_abbreviation;
    case VAR_displayName:
      return DISPLAY_NAME_displayName;
    case VAR_teamId:
      return DISPLAY_NAME_teamId;
    default:
      return BaseModel.displayNameBaseModel(var);
    }
  }

  public static String descriptionTeam(String var) {
    if(var == null)
      return null;
    switch(var) {
    case VAR_region:
      return "The region of this team";
    case VAR_name:
      return "The name of this team";
    case VAR_abbreviation:
      return "The abbreviation of this team";
    case VAR_displayName:
      return "The ID of this team";
    case VAR_teamId:
      return "The ID of this team";
      default:
        return BaseModel.descriptionBaseModel(var);
    }
  }

  public static String classSimpleNameTeam(String var) {
    switch(var) {
    case VAR_region:
      return "String";
    case VAR_name:
      return "String";
    case VAR_abbreviation:
      return "String";
    case VAR_displayName:
      return "String";
    case VAR_teamId:
      return "String";
      default:
        return BaseModel.classSimpleNameBaseModel(var);
    }
  }

  public static Integer htmColumnTeam(String var) {
    switch(var) {
    case VAR_region:
      return 1;
    case VAR_name:
      return 2;
    case VAR_abbreviation:
      return 3;
      default:
        return BaseModel.htmColumnBaseModel(var);
    }
  }

  public static Integer htmRowTeam(String var) {
    switch(var) {
    case VAR_region:
      return 3;
    case VAR_name:
      return 3;
    case VAR_abbreviation:
      return 3;
      default:
        return BaseModel.htmRowBaseModel(var);
    }
  }

  public static Integer htmCellTeam(String var) {
    switch(var) {
    case VAR_region:
      return 1;
    case VAR_name:
      return 2;
    case VAR_abbreviation:
      return 3;
      default:
        return BaseModel.htmCellBaseModel(var);
    }
  }

  public static Integer lengthMinTeam(String var) {
    switch(var) {
      default:
        return BaseModel.lengthMinBaseModel(var);
    }
  }

  public static Integer lengthMaxTeam(String var) {
    switch(var) {
      default:
        return BaseModel.lengthMaxBaseModel(var);
    }
  }

  public static Integer maxTeam(String var) {
    switch(var) {
      default:
        return BaseModel.maxBaseModel(var);
    }
  }

  public static Integer minTeam(String var) {
    switch(var) {
      default:
        return BaseModel.minBaseModel(var);
    }
  }
}
