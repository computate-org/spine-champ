package org.computate.spinechamp.model.eliteeight;

import java.time.ZonedDateTime;
import java.util.Optional;

import org.computate.search.wrap.Wrap;
import org.computate.spinechamp.model.BaseModel;
import org.computate.spinechamp.model.finalfour.FinalFour;
import org.computate.spinechamp.model.sweetsixteen.SweetSixteen;
import org.computate.vertx.search.list.SearchList;

import io.vertx.core.Promise;
import io.vertx.core.json.JsonObject;

/**
 * Order: 8
 * SqlOrder: 9
 * Description: A predicted tournament with 8 teams. 
 * AName: an elite eight bracket
 * Icon: <i class="fa-thin fa-basketball-hoop"></i>
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
   * Ignore: true
   */
  protected void _actualSweetSixteenSearch(Promise<SearchList<SweetSixteen>> promise) {
    SearchList<SweetSixteen> l = new SearchList<>();
    if(bracketId != null && guesserId != null && year != null) {
      l.setC(SweetSixteen.class);
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
  protected void _actualSweetSixteen(Wrap<JsonObject> w) {
    w.o(Optional.ofNullable(actualSweetSixteenSearch.first()).map(o -> JsonObject.mapFrom(o)).orElse(null));
  }

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
   * DisplayName: South game 1 guess
   * HtmRowTitleOpen: South game 1
   * HtmRow: 5
   * HtmCell: 0
   * Modify: false
   **/
  protected void _southGame1WinnerGuess(Wrap<String> w) {
    String val = southGame1Winner == null ? "unknown" : Optional.ofNullable(actualEliteEight).map(o -> o.getString(EliteEight.VAR_southGame1Winner)).map(o -> o.equals(southGame1Winner) ? "correct" : "incorrect").orElse("unknown");
    if("correct".equals(val))
      w.o(String.format("Correct — %s wins, %s loses", Optional.ofNullable(actualEliteEight).map(p -> p.getString("southGame1Winner")).orElse(""), Optional.ofNullable(actualEliteEight).map(p -> p.getString("southGame1Loser")).orElse("")));
    else if("incorrect".equals(val))
      w.o(String.format("Incorrect — %s wins, %s loses", Optional.ofNullable(actualEliteEight).map(p -> p.getString("southGame1Winner")).orElse(""), Optional.ofNullable(actualEliteEight).map(p -> p.getString("southGame1Loser")).orElse("")));
    else 
      w.o(String.format("Choose between %s or %s", Optional.ofNullable(actualSweetSixteen).map(p -> p.getString("southGame1Winner")).orElse(""), Optional.ofNullable(actualSweetSixteen).map(p -> p.getString("southGame2Winner")).orElse("")));
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: South game 1 winner
   * HtmRow: 5
   * HtmCell: 1
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
   * HtmCell: 2
   * Relate: Team.teamId
   **/
  protected void _southGame1Loser(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * DisplayName: Actual West game 1 winner
   * HtmRowTitleOpen: West game 1
   * HtmRow: 6
   * HtmCell: 0
   * Modify: false
   **/
  protected void _westGame1WinnerGuess(Wrap<String> w) {
    String val = westGame1Winner == null ? "unknown" : Optional.ofNullable(actualEliteEight).map(o -> o.getString(EliteEight.VAR_westGame1Winner)).map(o -> o.equals(westGame1Winner) ? "correct" : "incorrect").orElse("unknown");
    if("correct".equals(val))
      w.o(String.format("Correct — %s wins, %s loses", Optional.ofNullable(actualEliteEight).map(p -> p.getString("westGame1Winner")).orElse(""), Optional.ofNullable(actualEliteEight).map(p -> p.getString("westGame1Loser")).orElse("")));
    else if("incorrect".equals(val))
      w.o(String.format("Incorrect — %s wins, %s loses", Optional.ofNullable(actualEliteEight).map(p -> p.getString("westGame1Winner")).orElse(""), Optional.ofNullable(actualEliteEight).map(p -> p.getString("westGame1Loser")).orElse("")));
    else 
      w.o(String.format("Choose between %s or %s", Optional.ofNullable(actualSweetSixteen).map(p -> p.getString("westGame1Winner")).orElse(""), Optional.ofNullable(actualSweetSixteen).map(p -> p.getString("westGame2Winner")).orElse("")));
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: West game 1 winner
   * HtmRow: 6
   * HtmCell: 1
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
   * HtmCell: 2
   * Relate: Team.teamId
   **/
  protected void _westGame1Loser(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * DisplayName: Actual East game 1 winner
   * HtmRowTitleOpen: East game 1
   * HtmRow: 7
   * HtmCell: 0
   * Modify: false
   **/
  protected void _eastGame1WinnerGuess(Wrap<String> w) {
    String val = eastGame1Winner == null ? "unknown" : Optional.ofNullable(actualEliteEight).map(o -> o.getString(EliteEight.VAR_eastGame1Winner)).map(o -> o.equals(eastGame1Winner) ? "correct" : "incorrect").orElse("unknown");
    if("correct".equals(val))
      w.o(String.format("Correct — %s wins, %s loses", Optional.ofNullable(actualEliteEight).map(p -> p.getString("eastGame1Winner")).orElse(""), Optional.ofNullable(actualEliteEight).map(p -> p.getString("eastGame1Loser")).orElse("")));
    else if("incorrect".equals(val))
      w.o(String.format("Incorrect — %s wins, %s loses", Optional.ofNullable(actualEliteEight).map(p -> p.getString("eastGame1Winner")).orElse(""), Optional.ofNullable(actualEliteEight).map(p -> p.getString("eastGame1Loser")).orElse("")));
    else 
      w.o(String.format("Choose between %s or %s", Optional.ofNullable(actualSweetSixteen).map(p -> p.getString("eastGame1Winner")).orElse(""), Optional.ofNullable(actualSweetSixteen).map(p -> p.getString("eastGame2Winner")).orElse("")));
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: East game 1 winner
   * HtmRow: 7
   * HtmCell: 1
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
   * HtmCell: 2
   * Relate: Team.teamId
   **/
  protected void _eastGame1Loser(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * DisplayName: Actual Midwest game 1 winner
   * HtmRowTitleOpen: Midwest game 1
   * HtmRow: 8
   * HtmCell: 0
   * Modify: false
   **/
  protected void _midwestGame1WinnerGuess(Wrap<String> w) {
    String val = midwestGame1Winner == null ? "unknown" : Optional.ofNullable(actualEliteEight).map(o -> o.getString(EliteEight.VAR_midwestGame1Winner)).map(o -> o.equals(midwestGame1Winner) ? "correct" : "incorrect").orElse("unknown");
    if("correct".equals(val))
      w.o(String.format("Correct — %s wins, %s loses", Optional.ofNullable(actualEliteEight).map(p -> p.getString("midwestGame1Winner")).orElse(""), Optional.ofNullable(actualEliteEight).map(p -> p.getString("midwestGame1Loser")).orElse("")));
    else if("incorrect".equals(val))
      w.o(String.format("Incorrect — %s wins, %s loses", Optional.ofNullable(actualEliteEight).map(p -> p.getString("midwestGame1Winner")).orElse(""), Optional.ofNullable(actualEliteEight).map(p -> p.getString("midwestGame1Loser")).orElse("")));
    else 
      w.o(String.format("Choose between %s or %s", Optional.ofNullable(actualSweetSixteen).map(p -> p.getString("midwestGame1Winner")).orElse(""), Optional.ofNullable(actualSweetSixteen).map(p -> p.getString("midwestGame2Winner")).orElse("")));
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: Midwest game 1 winner
   * HtmRow: 8
   * HtmCell: 1
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
   * HtmCell: 2
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

  /**
   * {@inheritDoc}
   * DocValues: true
   * DisplayName: correct guesses
   * Description: The number of correct guesses in this Championship bracket
   * HtmRow: 4
   * HtmCell: 2
   * Modify: false
   **/
  protected void _correctGuesses(Wrap<Integer> w) {
    Integer correct = 0;
    Integer incorrect = 0;

    if(Optional.ofNullable(southGame1WinnerGuess).map(guess -> guess.startsWith("Correct")).orElse(false))
      correct++;
    else if(Optional.ofNullable(southGame1WinnerGuess).map(guess -> guess.startsWith("Incorrect")).orElse(false))
      incorrect++;

    if(Optional.ofNullable(westGame1WinnerGuess).map(guess -> guess.startsWith("Correct")).orElse(false))
      correct++;
    else if(Optional.ofNullable(westGame1WinnerGuess).map(guess -> guess.startsWith("Incorrect")).orElse(false))
      incorrect++;

    if(Optional.ofNullable(eastGame1WinnerGuess).map(guess -> guess.startsWith("Correct")).orElse(false))
      correct++;
    else if(Optional.ofNullable(eastGame1WinnerGuess).map(guess -> guess.startsWith("Incorrect")).orElse(false))
      incorrect++;

    if(Optional.ofNullable(midwestGame1WinnerGuess).map(guess -> guess.startsWith("Correct")).orElse(false))
      correct++;
    else if(Optional.ofNullable(midwestGame1WinnerGuess).map(guess -> guess.startsWith("Incorrect")).orElse(false))
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
   * Modify: false
   **/
  protected void _incorrectGuesses(Wrap<Integer> w) {
  }
}
