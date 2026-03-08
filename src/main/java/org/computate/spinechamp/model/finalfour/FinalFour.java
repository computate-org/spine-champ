package org.computate.spinechamp.model.finalfour;

import java.time.ZonedDateTime;
import java.util.Optional;

import org.computate.search.wrap.Wrap;
import org.computate.spinechamp.model.BaseModel;
import org.computate.spinechamp.model.championship.Championship;
import org.computate.spinechamp.model.eliteeight.EliteEight;
import org.computate.vertx.search.list.SearchList;

import io.vertx.core.Promise;
import io.vertx.core.json.JsonObject;

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
   * Ignore: true
   */
  protected void _actualEliteEightSearch(Promise<SearchList<EliteEight>> promise) {
    SearchList<EliteEight> l = new SearchList<>();
    if(bracketId != null && guesserId != null && year != null) {
      l.setC(EliteEight.class);
      l.q("*:*");
      l.fq(String.format("guesserId_docvalues_string:%s", "results"));
      l.fq(String.format("year_docvalues_int:%s", year));
      l.setStore(true);
    }
    promise.complete(l);
  }

  /**
   * {@inheritDoc}
   * Stored: true
   * DisplayName: Actual Elite Eight bracket
   * Description: The Elite Eight bracket of this tournament
   **/
  protected void _actualEliteEight(Wrap<JsonObject> w) {
    w.o(Optional.ofNullable(actualEliteEightSearch.first()).map(o -> JsonObject.mapFrom(o)).orElse(null));
  }

  /**
   * Ignore: true
   */
  protected void _actualFinalFourSearch(Promise<SearchList<FinalFour>> promise) {
    SearchList<FinalFour> l = new SearchList<>();
    if(bracketId != null && guesserId != null && year != null) {
      l.setC(FinalFour.class);
      l.q("*:*");
      l.fq(String.format("guesserId_docvalues_string:%s", "results"));
      l.fq(String.format("year_docvalues_int:%s", year));
      l.setStore(true);
    }
    promise.complete(l);
  }

  /**
   * {@inheritDoc}
   * Stored: true
   * DisplayName: Actual Sweet Sixteen bracket
   * Description: The Sweet Sixteen bracket of this tournament
   **/
  protected void _actualFinalFour(Wrap<JsonObject> w) {
    w.o(Optional.ofNullable(actualFinalFourSearch.first()).map(o -> JsonObject.mapFrom(o)).orElse(null));
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: Elite eight bracket
   * Description: The Elite Eight bracket of this tournament
   * HtmRow: 3
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
   * DisplayName: game 1 guess
   * HtmRowTitleOpen: game 1
   * HtmRow: 5
   * HtmCell: 0
   * Modify: false
   **/
  protected void _game1WinnerGuess(Wrap<String> w) {
    String val = game1Winner == null ? "unknown" : Optional.ofNullable(actualFinalFour).map(o -> o.getString(FinalFour.VAR_game1Winner)).map(o -> o.equals(game1Winner) ? "correct" : "incorrect").orElse("unknown");
    if("correct".equals(val))
      w.o(String.format("Correct — %s wins, %s loses", Optional.ofNullable(actualFinalFour).map(p -> p.getString("game1Winner")).orElse(""), Optional.ofNullable(actualFinalFour).map(p -> p.getString("game1Loser")).orElse("")));
    else if("incorrect".equals(val))
      w.o(String.format("Incorrect — %s wins, %s loses", Optional.ofNullable(actualFinalFour).map(p -> p.getString("game1Winner")).orElse(""), Optional.ofNullable(actualFinalFour).map(p -> p.getString("game1Loser")).orElse("")));
    else 
      w.o(String.format("Choose between %s or %s", Optional.ofNullable(actualEliteEight).map(p -> p.getString("southGame1Winner")).orElse(""), Optional.ofNullable(actualEliteEight).map(p -> p.getString("westGame1Winner")).orElse("")));
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: game 1 winner
   * HtmRow: 5
   * HtmCell: 1
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
   * HtmCell: 2
   * Relate: Team.teamId
   **/
  protected void _game1Loser(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * DisplayName: game 2 guess
   * HtmRowTitleOpen: game 2
   * HtmRow: 6
   * HtmCell: 0
   * Modify: false
   **/
  protected void _game2WinnerGuess(Wrap<String> w) {
    String val = game2Winner == null ? "unknown" : Optional.ofNullable(actualFinalFour).map(o -> o.getString(FinalFour.VAR_game2Winner)).map(o -> o.equals(game2Winner) ? "correct" : "incorrect").orElse("unknown");
    if("correct".equals(val))
      w.o(String.format("Correct — %s wins, %s loses", Optional.ofNullable(actualFinalFour).map(p -> p.getString("game2Winner")).orElse(""), Optional.ofNullable(actualFinalFour).map(p -> p.getString("game2Loser")).orElse("")));
    else if("incorrect".equals(val))
      w.o(String.format("Incorrect — %s wins, %s loses", Optional.ofNullable(actualFinalFour).map(p -> p.getString("game2Winner")).orElse(""), Optional.ofNullable(actualFinalFour).map(p -> p.getString("game2Loser")).orElse("")));
    else 
      w.o(String.format("Choose between %s or %s", Optional.ofNullable(actualEliteEight).map(p -> p.getString("eastGame1Winner")).orElse(""), Optional.ofNullable(actualEliteEight).map(p -> p.getString("midwestGame1Winner")).orElse("")));
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: game 2 winner
   * HtmRow: 6
   * HtmCell: 1
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
   * HtmCell: 2
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

  /**
   * {@inheritDoc}
   * DocValues: true
   * DisplayName: correct guesses
   * Description: The number of correct guesses in this Championship bracket
   * HtmRow: 4
   * HtmCell: 2
   **/
  protected void _correctGuesses(Wrap<Integer> w) {
    Integer correct = 0;
    Integer incorrect = 0;

    if(Optional.ofNullable(game1WinnerGuess).map(guess -> guess.startsWith("Correct")).orElse(false))
      correct++;
    else if(Optional.ofNullable(game1WinnerGuess).map(guess -> guess.startsWith("Incorrect")).orElse(false))
      incorrect++;

    if(Optional.ofNullable(game2WinnerGuess).map(guess -> guess.startsWith("Correct")).orElse(false))
      correct++;
    else if(Optional.ofNullable(game2WinnerGuess).map(guess -> guess.startsWith("Incorrect")).orElse(false))
      incorrect++;

    setIncorrectGuesses(incorrect);
    w.o(correct);
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * DisplayName: incorrect guesses
   * Description: The number of incorrect guesses in this Championship bracket
   * HtmRow: 4
   * HtmCell: 3
   **/
  protected void _incorrectGuesses(Wrap<Integer> w) {
  }
}
