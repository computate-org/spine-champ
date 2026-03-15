package org.computate.spinechamp.model.guesser;

import java.util.List;

import org.computate.search.wrap.Wrap;
import org.computate.spinechamp.model.BaseModel;

/**
 * Order: 6
 * Description: a person guessing on a tournament. 
 * AName: a guesser
 * Icon: <i class="{{ FONTAWESOME_STYLE }} fa-person"></i>
 *
 * SearchPageUri: /en-us/search/guesser
 * EditPageUri: /en-us/edit/guesser/{guesserId}
 * ApiUri: /en-us/api/guesser
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
public class Guesser extends GuesserGen<BaseModel> {

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: guesser name
   * Description: The name of this guesser
   * HtmRow: 3
   * HtmCell: 1
   * HtmColumn: 1
   * HtmRowTitleOpen: guesser details
   * Facet: true
   * VarName: true
   * Unique: true
   * Required: true
   **/
  protected void _name(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: guesser ID
   * Description: The ID of this guesser
   * VarId: true
   * Unique: true
   * Required: true
   **/
  protected void _guesserId(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: description
   * Description: A description of this guesser
   * HtmRow: 3
   * HtmCell: 4
   * Facet: true
   * HtmColumn: 3
   * VarDescription: true
   **/
  protected void _description(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * DisplayName: Sweet Sixteen brackets
   * Description: The Sweet Sixteen brackets of this guesser
   * HtmRow: 20
   * HtmCell: 0
   * HtmRowTitleOpen: brackets
   * Relate: SweetSixteen.guesserId
   **/
  protected void _sweetSixteenBrackets(List<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * DisplayName: Elite Eight brackets
   * Description: The Elite Eight brackets of this guesser
   * HtmRow: 20
   * HtmCell: 1
   * Relate: EliteEight.guesserId
   **/
  protected void _eliteEightBrackets(List<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * DisplayName: Final Four brackets
   * Description: The Final Four brackets of this guesser
   * HtmRow: 20
   * HtmCell: 2
   * Relate: FinalFour.guesserId
   **/
  protected void _finalFourBrackets(List<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * DisplayName: Championship brackets
   * Description: The Championship brackets of this guesser
   * HtmRow: 20
   * HtmCell: 3
   * Relate: Championship.guesserId
   **/
  protected void _championshipBrackets(List<String> w) {
  }
}
