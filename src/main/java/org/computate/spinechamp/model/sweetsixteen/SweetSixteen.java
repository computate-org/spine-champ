package org.computate.spinechamp.model.sweetsixteen;

import java.time.ZonedDateTime;
import java.util.Optional;

import org.computate.search.wrap.Wrap;
import org.computate.spinechamp.model.BaseModel;
import org.computate.spinechamp.model.eliteeight.EliteEight;
import org.computate.vertx.search.list.SearchList;

import io.vertx.core.Promise;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

/**
 * Order: 7
 * SqlOrder: 10
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
 *   SuperAdmin:
 *     POST:
 *     PATCH:
 *     GET:
 *     DELETE:
 *     Admin:
 *     SuperAdmin:
 **/
public class SweetSixteen extends SweetSixteenGen<BaseModel> {

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
   * DisplayName: South game 1 guess
   * HtmRowTitleOpen: South game 1
   * HtmRow: 5
   * HtmCell: 0
   * Modify: false
   **/
  protected void _southGame1WinnerGuess(Wrap<String> w) {
    String val = southGame1Winner == null ? "unknown" : Optional.ofNullable(actualSweetSixteen).map(o -> o.getString(SweetSixteen.VAR_southGame1Winner)).map(o -> o.equals(southGame1Winner) ? "correct" : "incorrect").orElse("unknown");
    if("correct".equals(val))
      w.o(String.format("Correct — %s wins, %s loses", Optional.ofNullable(actualSweetSixteen).map(p -> p.getString("southGame1Winner")).orElse(""), Optional.ofNullable(actualSweetSixteen).map(p -> p.getString("southGame1Loser")).orElse("")));
    else if("incorrect".equals(val))
      w.o(String.format("Incorrect — %s wins, %s loses", Optional.ofNullable(actualSweetSixteen).map(p -> p.getString("southGame1Winner")).orElse(""), Optional.ofNullable(actualSweetSixteen).map(p -> p.getString("southGame1Loser")).orElse("")));
    else 
      w.o("Unknown");
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: South game 1 winner
   * HtmRow: 5
   * HtmCell: 1
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
   * DisplayName: Actual South game 2 winner
   * HtmRowTitleOpen: South game 2
   * HtmRow: 6
   * HtmCell: 0
   * Modify: false
   **/
  protected void _southGame2WinnerGuess(Wrap<String> w) {
    String val = southGame2Winner == null ? "unknown" : Optional.ofNullable(actualSweetSixteen).map(o -> o.getString(SweetSixteen.VAR_southGame2Winner)).map(o -> o.equals(southGame2Winner) ? "correct" : "incorrect").orElse("unknown");
    if("correct".equals(val))
      w.o(String.format("Correct — %s wins, %s loses", Optional.ofNullable(actualSweetSixteen).map(p -> p.getString("southGame2Winner")).orElse(""), Optional.ofNullable(actualSweetSixteen).map(p -> p.getString("southGame2Loser")).orElse("")));
    else if("incorrect".equals(val))
      w.o(String.format("Incorrect — %s wins, %s loses", Optional.ofNullable(actualSweetSixteen).map(p -> p.getString("southGame2Winner")).orElse(""), Optional.ofNullable(actualSweetSixteen).map(p -> p.getString("southGame2Loser")).orElse("")));
    else 
      w.o("Unknown");
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: South game 2 winner
   * HtmRow: 6
   * HtmCell: 1
   * Relate: Team.teamId
   **/
  protected void _southGame2Winner(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: South game 2 loser
   * HtmRow: 6
   * HtmCell: 2
   * Relate: Team.teamId
   **/
  protected void _southGame2Loser(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * DisplayName: Actual West game 1 winner
   * HtmRowTitleOpen: West game 1
   * HtmRow: 7
   * HtmCell: 0
   * Modify: false
   **/
  protected void _westGame1WinnerGuess(Wrap<String> w) {
    String val = westGame1Winner == null ? "unknown" : Optional.ofNullable(actualSweetSixteen).map(o -> o.getString(SweetSixteen.VAR_westGame1Winner)).map(o -> o.equals(westGame1Winner) ? "correct" : "incorrect").orElse("unknown");
    if("correct".equals(val))
      w.o(String.format("Correct — %s wins, %s loses", Optional.ofNullable(actualSweetSixteen).map(p -> p.getString("westGame1Winner")).orElse(""), Optional.ofNullable(actualSweetSixteen).map(p -> p.getString("westGame1Loser")).orElse("")));
    else if("incorrect".equals(val))
      w.o(String.format("Incorrect — %s wins, %s loses", Optional.ofNullable(actualSweetSixteen).map(p -> p.getString("westGame1Winner")).orElse(""), Optional.ofNullable(actualSweetSixteen).map(p -> p.getString("westGame1Loser")).orElse("")));
    else 
      w.o("Unknown");
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: West game 1 winner
   * HtmRow: 7
   * HtmCell: 1
   * Relate: Team.teamId
   **/
  protected void _westGame1Winner(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: West game 1 loser
   * HtmRow: 7
   * HtmCell: 2
   * Relate: Team.teamId
   **/
  protected void _westGame1Loser(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * DisplayName: Actual West game 2 winner
   * HtmRowTitleOpen: West game 2
   * HtmRow: 8
   * HtmCell: 0
   * Modify: false
   **/
  protected void _westGame2WinnerGuess(Wrap<String> w) {
    String val = westGame2Winner == null ? "unknown" : Optional.ofNullable(actualSweetSixteen).map(o -> o.getString(SweetSixteen.VAR_westGame2Winner)).map(o -> o.equals(westGame2Winner) ? "correct" : "incorrect").orElse("unknown");
    if("correct".equals(val))
      w.o(String.format("Correct — %s wins, %s loses", Optional.ofNullable(actualSweetSixteen).map(p -> p.getString("westGame2Winner")).orElse(""), Optional.ofNullable(actualSweetSixteen).map(p -> p.getString("westGame2Loser")).orElse("")));
    else if("incorrect".equals(val))
      w.o(String.format("Incorrect — %s wins, %s loses", Optional.ofNullable(actualSweetSixteen).map(p -> p.getString("westGame2Winner")).orElse(""), Optional.ofNullable(actualSweetSixteen).map(p -> p.getString("westGame2Loser")).orElse("")));
    else 
      w.o("Unknown");
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: West game 2 winner
   * HtmRow: 8
   * HtmCell: 0
   * Relate: Team.teamId
   **/
  protected void _westGame2Winner(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: West game 2 loser
   * HtmRow: 8
   * HtmCell: 1
   * Relate: Team.teamId
   **/
  protected void _westGame2Loser(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * DisplayName: Actual East game 1 winner
   * HtmRowTitleOpen: East game 1
   * HtmRow: 9
   * HtmCell: 0
   * Modify: false
   **/
  protected void _eastGame1WinnerGuess(Wrap<String> w) {
    String val = eastGame1Winner == null ? "unknown" : Optional.ofNullable(actualSweetSixteen).map(o -> o.getString(SweetSixteen.VAR_eastGame1Winner)).map(o -> o.equals(eastGame1Winner) ? "correct" : "incorrect").orElse("unknown");
    if("correct".equals(val))
      w.o(String.format("Correct — %s wins, %s loses", Optional.ofNullable(actualSweetSixteen).map(p -> p.getString("eastGame1Winner")).orElse(""), Optional.ofNullable(actualSweetSixteen).map(p -> p.getString("eastGame1Loser")).orElse("")));
    else if("incorrect".equals(val))
      w.o(String.format("Incorrect — %s wins, %s loses", Optional.ofNullable(actualSweetSixteen).map(p -> p.getString("eastGame1Winner")).orElse(""), Optional.ofNullable(actualSweetSixteen).map(p -> p.getString("eastGame1Loser")).orElse("")));
    else 
      w.o("Unknown");
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: East game 1 winner
   * HtmRow: 9
   * HtmCell: 1
   * Relate: Team.teamId
   **/
  protected void _eastGame1Winner(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: East game 1 loser
   * HtmRow: 9
   * HtmCell: 2
   * Relate: Team.teamId
   **/
  protected void _eastGame1Loser(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * DisplayName: Actual East game 2 winner
   * HtmRowTitleOpen: East game 2
   * HtmRow: 10
   * HtmCell: 0
   * Modify: false
   **/
  protected void _eastGame2WinnerGuess(Wrap<String> w) {
    String val = eastGame2Winner == null ? "unknown" : Optional.ofNullable(actualSweetSixteen).map(o -> o.getString(SweetSixteen.VAR_eastGame2Winner)).map(o -> o.equals(eastGame2Winner) ? "correct" : "incorrect").orElse("unknown");
    if("correct".equals(val))
      w.o(String.format("Correct — %s wins, %s loses", Optional.ofNullable(actualSweetSixteen).map(p -> p.getString("eastGame2Winner")).orElse(""), Optional.ofNullable(actualSweetSixteen).map(p -> p.getString("eastGame2Loser")).orElse("")));
    else if("incorrect".equals(val))
      w.o(String.format("Incorrect — %s wins, %s loses", Optional.ofNullable(actualSweetSixteen).map(p -> p.getString("eastGame2Winner")).orElse(""), Optional.ofNullable(actualSweetSixteen).map(p -> p.getString("eastGame2Loser")).orElse("")));
    else 
      w.o("Unknown");
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: East game 2 winner
   * HtmRow: 10
   * HtmCell: 1
   * Relate: Team.teamId
   **/
  protected void _eastGame2Winner(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: East game 2 loser
   * HtmRow: 10
   * HtmCell: 2
   * Relate: Team.teamId
   **/
  protected void _eastGame2Loser(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * DisplayName: Actual Midwest game 1 winner
   * HtmRowTitleOpen: Midwest game 1
   * HtmRow: 11
   * HtmCell: 0
   * Modify: false
   **/
  protected void _midwestGame1WinnerGuess(Wrap<String> w) {
    String val = midwestGame1Winner == null ? "unknown" : Optional.ofNullable(actualSweetSixteen).map(o -> o.getString(SweetSixteen.VAR_midwestGame1Winner)).map(o -> o.equals(midwestGame1Winner) ? "correct" : "incorrect").orElse("unknown");
    if("correct".equals(val))
      w.o(String.format("Correct — %s wins, %s loses", Optional.ofNullable(actualSweetSixteen).map(p -> p.getString("midwestGame1Winner")).orElse(""), Optional.ofNullable(actualSweetSixteen).map(p -> p.getString("midwestGame1Loser")).orElse("")));
    else if("incorrect".equals(val))
      w.o(String.format("Incorrect — %s wins, %s loses", Optional.ofNullable(actualSweetSixteen).map(p -> p.getString("midwestGame1Winner")).orElse(""), Optional.ofNullable(actualSweetSixteen).map(p -> p.getString("midwestGame1Loser")).orElse("")));
    else 
      w.o("Unknown");
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: Midwest game 1 winner
   * HtmRow: 11
   * HtmCell: 1
   * Relate: Team.teamId
   **/
  protected void _midwestGame1Winner(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: Midwest game 1 loser
   * HtmRow: 11
   * HtmCell: 2
   * Relate: Team.teamId
   **/
  protected void _midwestGame1Loser(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * DisplayName: Actual Midwest game 2 winner
   * HtmRowTitleOpen: Midwest game 2
   * HtmRow: 12
   * HtmCell: 0
   * Modify: false
   **/
  protected void _midwestGame2WinnerGuess(Wrap<String> w) {
    String val = midwestGame2Winner == null ? "unknown" : Optional.ofNullable(actualSweetSixteen).map(o -> o.getString(SweetSixteen.VAR_midwestGame2Winner)).map(o -> o.equals(midwestGame2Winner) ? "correct" : "incorrect").orElse("unknown");
    if("correct".equals(val))
      w.o(String.format("Correct — %s wins, %s loses", Optional.ofNullable(actualSweetSixteen).map(p -> p.getString("midwestGame2Winner")).orElse(""), Optional.ofNullable(actualSweetSixteen).map(p -> p.getString("midwestGame2Loser")).orElse("")));
    else if("incorrect".equals(val))
      w.o(String.format("Incorrect — %s wins, %s loses", Optional.ofNullable(actualSweetSixteen).map(p -> p.getString("midwestGame2Winner")).orElse(""), Optional.ofNullable(actualSweetSixteen).map(p -> p.getString("midwestGame2Loser")).orElse("")));
    else 
      w.o("Unknown");
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: Midwest game 2 winner
   * HtmRow: 12
   * HtmCell: 1
   * Relate: Team.teamId
   **/
  protected void _midwestGame2Winner(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: Midwest game 2 loser
   * HtmRow: 12
   * HtmCell: 2
   * Relate: Team.teamId
   **/
  protected void _midwestGame2Loser(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: Elite Eight bracket
   * Description: The Elite Eight bracket of this tournament
   * HtmRow: 20
   * HtmCell: 0
   * HtmRowTitleOpen: later tournaments
   * Relate: EliteEight.sweetSixteen
   **/
  protected void _eliteEight(Wrap<String> w) {
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

    if(Optional.ofNullable(southGame2WinnerGuess).map(guess -> guess.startsWith("Correct")).orElse(false))
      correct++;
    else if(Optional.ofNullable(southGame2WinnerGuess).map(guess -> guess.startsWith("Incorrect")).orElse(false))
      incorrect++;

    if(Optional.ofNullable(westGame2WinnerGuess).map(guess -> guess.startsWith("Correct")).orElse(false))
      correct++;
    else if(Optional.ofNullable(westGame2WinnerGuess).map(guess -> guess.startsWith("Incorrect")).orElse(false))
      incorrect++;

    if(Optional.ofNullable(eastGame2WinnerGuess).map(guess -> guess.startsWith("Correct")).orElse(false))
      correct++;
    else if(Optional.ofNullable(eastGame2WinnerGuess).map(guess -> guess.startsWith("Incorrect")).orElse(false))
      incorrect++;

    if(Optional.ofNullable(midwestGame2WinnerGuess).map(guess -> guess.startsWith("Correct")).orElse(false))
      correct++;
    else if(Optional.ofNullable(midwestGame2WinnerGuess).map(guess -> guess.startsWith("Incorrect")).orElse(false))
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

  /**
   * {@inheritDoc}
   * Stored: true
   * DisplayName: correct guesses
   * Description: A chart of the number of correct guesses in this Championship bracket
   * HtmRow: 3
   * HtmCell: 2
   * Modify: false
   * wa-pie-chart:
   *   style: "height: 200px; "
   * div:
   *   class: wa-stack
   **/
  protected void _correctGuessesChart(Wrap<JsonObject> w) {
    w.o(new JsonObject()
      .put("data", new JsonObject()
        .put("labels", new JsonArray().add("correct").add("incorrect"))
        .put("datasets", new JsonArray()
          .add(new JsonObject()
            .put("label", "guesses")
            .put("data", new JsonArray().add(correctGuesses).add(incorrectGuesses))
          )
        )
      )
    );
  }
}
