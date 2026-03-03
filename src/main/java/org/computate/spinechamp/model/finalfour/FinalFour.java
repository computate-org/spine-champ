package org.computate.spinechamp.model.finalfour;

import java.time.ZonedDateTime;
import java.util.Optional;

import org.computate.search.wrap.Wrap;
import org.computate.spinechamp.model.BaseModel;
import org.computate.spinechamp.model.championship.Championship;
import org.computate.spinechamp.model.eliteeight.EliteEight;
import org.computate.vertx.search.list.SearchList;

import io.vertx.core.Promise;

/**
 * Order: 9
 * SqlOrder: 8
 * Description: A predicted tournament with 4 teams. 
 * AName: a final four bracket
 * Icon: <i class="fa-regular fa-buildings"></i>
 *
 * SearchPageUri: /en-us/search/final-four
 * EditPageUri: /en-us/edit/final-four/{bracketId}
 * ApiUri: /en-us/api/final-four
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
public class FinalFour extends FinalFourGen<BaseModel> {

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: Elite eight bracket
   * Description: The Elite Eight bracket of this tournament
   * HtmRow: 10
   * HtmCell: 0
   * HtmRowTitleOpen: earlier tournaments
   * Relate: EliteEight.finalFour
   **/
  protected void _eliteEight(Wrap<String> w) {
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
    w.o(String.format("%s's %s final four bracket", guesserId, year));
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

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: game 2 winner
   * HtmRow: 6
   * HtmCell: 0
   * HtmRowTitleOpen: game 2
   * Relate: Team.teamId
   **/
  protected void _game2Winner(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: game 2 loser
   * HtmRow: 6
   * HtmCell: 1
   * Relate: Team.teamId
   **/
  protected void _game2Loser(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: Championship bracket
   * Description: The Championship bracket of this tournament
   * HtmRow: 10
   * HtmCell: 0
   * HtmRowTitleOpen: later tournaments
   * Relate: Championship.finalFour
   **/
  protected void _championship(Wrap<String> w) {
  }
}
