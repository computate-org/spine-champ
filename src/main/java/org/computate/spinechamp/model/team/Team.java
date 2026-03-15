package org.computate.spinechamp.model.team;

import org.computate.search.wrap.Wrap;
import org.computate.spinechamp.model.BaseModel;

/**
 * Order: 5
 * Description: A sports team. 
 * AName: a team
 * Icon: <i class="{{ FONTAWESOME_STYLE }} fa-person-basketball"></i>
 *
 * SearchPageUri: /en-us/search/team
 * EditPageUri: /en-us/edit/team/{teamId}
 * ApiUri: /en-us/api/team
 * ApiMethod:
 *   Search:
 *   GET:
 *   PATCH:
 *   POST:
 *   DELETE:
 *   PUTImport:
 * 
 * AuthGroup:
 *   Admin:
 *     POST:
 *     PATCH:
 *     GET:
 *     DELETE:
 **/
public class Team extends TeamGen<BaseModel> {

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: team region
   * Description: The region of this team
   * HtmRow: 3
   * HtmCell: 1
   * HtmColumn: 1
   * HtmRowTitleOpen: team details
   * Unique: true
   * Required: true
   * Facet: true
   **/
  protected void _region(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: team name
   * Description: The name of this team
   * HtmRow: 3
   * HtmCell: 2
   * HtmColumn: 2
   * Required: true
   * Facet: true
   **/
  protected void _name(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: team abbreviation
   * Description: The abbreviation of this team
   * HtmRow: 3
   * HtmCell: 3
   * HtmColumn: 3
   * Required: true
   * Facet: true
   **/
  protected void _abbreviation(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: team ID
   * Description: The ID of this team
   * VarName: true
   **/
  protected void _displayName(Wrap<String> w) {
    w.o(String.format("%s %s (%s)", region, name, abbreviation));
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: team ID
   * Description: The ID of this team
   * VarId: true
   * Unique: true
   * Required: true
   * Facet: true
   **/
  protected void _teamId(Wrap<String> w) {
    w.o(toId(abbreviation));
  }
}
