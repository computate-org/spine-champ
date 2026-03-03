package org.computate.spinechamp.model.eliteeight;

import java.time.ZonedDateTime;
import java.util.Optional;

import org.computate.search.wrap.Wrap;
import org.computate.spinechamp.model.BaseModel;
import org.computate.spinechamp.model.finalfour.FinalFour;
import org.computate.spinechamp.model.sweetsixteen.SweetSixteen;
import org.computate.vertx.search.list.SearchList;

import io.vertx.core.Promise;

/**
 * Order: 8
 * SqlOrder: 9
 * Description: A predicted tournament with 8 teams. 
 * AName: an elite eight bracket
 * Icon: <i class="fa-regular fa-buildings"></i>
 *
 * SearchPageUri: /en-us/search/elite-eight
 * EditPageUri: /en-us/edit/elite-eight/{bracketId}
 * ApiUri: /en-us/api/elite-eight
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
 *   SuperAdmin:
 *     POST:
 *     PATCH:
 *     GET:
 *     DELETE:
 *     Admin:
 *     SuperAdmin:
 **/
public class EliteEight extends EliteEightGen<BaseModel> {

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: Sweet Sixteen bracket
   * Description: The Sweet Sixteen bracket of this tournament
   * HtmRow: 3
   * HtmCell: 0
   * HtmRowTitleOpen: earlier tournaments
   * Relate: SweetSixteen.eliteEight
   **/
  protected void _sweetSixteen(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: guesser
   * Description: The ID of this guesser
   * HtmRow: 4
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
   * HtmRow: 4
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
    w.o(String.format("%s's %s elite eight bracket", guesserId, year));
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
   * DisplayName: West game 1 winner
   * HtmRow: 6
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
   * HtmRow: 6
   * HtmCell: 1
   * Relate: Team.teamId
   **/
  protected void _westGame1Loser(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: East game 1 winner
   * HtmRow: 7
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
   * HtmRow: 7
   * HtmCell: 1
   * Relate: Team.teamId
   **/
  protected void _eastGame1Loser(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: Midwest game 1 winner
   * HtmRow: 8
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
   * HtmRow: 8
   * HtmCell: 1
   * Relate: Team.teamId
   **/
  protected void _midwestGame1Loser(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: Final Four bracket
   * Description: The Final Four bracket of this tournament
   * HtmRow: 10
   * HtmCell: 0
   * HtmRowTitleOpen: later tournaments
   * Relate: FinalFour.eliteEight
   **/
  protected void _finalFour(Wrap<String> w) {
  }
}
