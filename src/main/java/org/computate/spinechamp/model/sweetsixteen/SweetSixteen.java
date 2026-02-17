package org.computate.spinechamp.model.sweetsixteen;

import java.time.ZonedDateTime;
import java.util.Date;

import org.computate.search.wrap.Wrap;
import org.computate.spinechamp.model.BaseModel;

/**
 * Order: 7
 * Description: A predicted tournament with 16 teams. 
 * AName: a sweet sixteen bracket
 * Icon: <i class="fa-regular fa-buildings"></i>
 * MenuDetails: sports brackets
 * MenuDetailsOpen: true
 *
 * SearchPageUri: /en-us/search/sweet-sixteen
 * EditPageUri: /en-us/edit/sweet-sixteen/{bracketId}
 * ApiUri: /en-us/api/sweet-sixteen
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
public class SweetSixteen extends SweetSixteenGen<BaseModel> {

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: guesser
   * Description: The ID of this guesser
   * HtmRow: 3
   * HtmCell: 0
   * HtmColumn: 0
   * HtmRowTitleOpen: guesser details
   * Relate: Guesser.guesserId
   **/
  protected void _guesserId(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: year
   * Description: The year of the tournament
   * HtmRow: 3
   * HtmCell: 1
   * HtmColumn: 1
   **/
  protected void _year(Wrap<Integer> w) {
    w.o(ZonedDateTime.now().getYear());
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: bracket ID
   * Description: The ID of this bracket
   * VarId: true
   * Unique: true
   * Required: true
   **/
  protected void _bracketId(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: bracket name
   * Description: The name of this bracket
   * VarName: true
   **/
  protected void _name(Wrap<String> w) {
    w.o(String.format("%s's %s sweet sixteen bracket", guesserId, year));
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: South game 1 winner
   * HtmRow: 5
   * HtmCell: 0
   * HtmRowTitleOpen: South games
   * Relate: Team.teamId
   **/
  protected void _southGame1Winner(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: South game 1 loser
   * HtmRow: 5
   * HtmCell: 1
   * Relate: Team.teamId
   **/
  protected void _southGame1Loser(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: South game 2 winner
   * HtmRow: 5
   * HtmCell: 2
   * Relate: Team.teamId
   **/
  protected void _southGame2Winner(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: South game 2 loser
   * HtmRow: 5
   * HtmCell: 3
   * Relate: Team.teamId
   **/
  protected void _southGame2Loser(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: West game 1 winner
   * HtmRow: 5
   * HtmCell: 0
   * HtmRowTitleOpen: West games
   * Relate: Team.teamId
   **/
  protected void _westGame1Winner(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: West game 1 loser
   * HtmRow: 5
   * HtmCell: 1
   * Relate: Team.teamId
   **/
  protected void _westGame1Loser(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: West game 2 winner
   * HtmRow: 5
   * HtmCell: 2
   * Relate: Team.teamId
   **/
  protected void _westGame2Winner(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: West game 2 loser
   * HtmRow: 5
   * HtmCell: 3
   * Relate: Team.teamId
   **/
  protected void _westGame2Loser(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: East game 1 winner
   * HtmRow: 5
   * HtmCell: 0
   * HtmRowTitleOpen: East games
   * Relate: Team.teamId
   **/
  protected void _eastGame1Winner(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: East game 1 loser
   * HtmRow: 5
   * HtmCell: 1
   * Relate: Team.teamId
   **/
  protected void _eastGame1Loser(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: East game 2 winner
   * HtmRow: 5
   * HtmCell: 2
   * Relate: Team.teamId
   **/
  protected void _eastGame2Winner(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: East game 2 loser
   * HtmRow: 5
   * HtmCell: 3
   * Relate: Team.teamId
   **/
  protected void _eastGame2Loser(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: Midwest game 1 winner
   * HtmRow: 5
   * HtmCell: 0
   * HtmRowTitleOpen: Midwest games
   * Relate: Team.teamId
   **/
  protected void _midwestGame1Winner(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: Midwest game 1 loser
   * HtmRow: 5
   * HtmCell: 1
   * Relate: Team.teamId
   **/
  protected void _midwestGame1Loser(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: Midwest game 2 winner
   * HtmRow: 5
   * HtmCell: 2
   * Relate: Team.teamId
   **/
  protected void _midwestGame2Winner(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: Midwest game 2 loser
   * HtmRow: 5
   * HtmCell: 3
   * Relate: Team.teamId
   **/
  protected void _midwestGame2Loser(Wrap<String> w) {
  }
}
