package org.computate.spinechamp.model.championship;

import java.time.ZonedDateTime;
import java.util.Optional;

import org.computate.search.wrap.Wrap;
import org.computate.spinechamp.model.BaseModel;
import org.computate.spinechamp.model.finalfour.FinalFour;
import org.computate.vertx.search.list.SearchList;

import io.vertx.core.Promise;

/**
 * Order: 10
 * SqlOrder: 7
 * Description: A predicted tournament with 2 teams. 
 * AName: a championship bracket
 * Icon: <i class="fa-regular fa-buildings"></i>
 *
 * SearchPageUri: /en-us/search/championship
 * EditPageUri: /en-us/edit/championship/{bracketId}
 * ApiUri: /en-us/api/championship
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
public class Championship extends ChampionshipGen<BaseModel> {

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: Final Four bracket
   * Description: The Final Four bracket of this tournament
   * HtmRow: 3
   * HtmCell: 0
   * HtmRowTitleOpen: later tournaments
   * Relate: FinalFour.championship
   **/
  protected void _finalFour(Wrap<String> w) {
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
    w.o(String.format("%s's %s championship bracket", guesserId, year));
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: game 1 winner
   * HtmRow: 5
   * HtmCell: 0
   * HtmRowTitleOpen: game 1
   * Relate: Team.teamId
   **/
  protected void _game1Winner(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: game 1 loser
   * HtmRow: 5
   * HtmCell: 1
   * Relate: Team.teamId
   **/
  protected void _game1Loser(Wrap<String> w) {
  }
}
