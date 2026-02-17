package org.computate.spinechamp.model.guesser;

import org.computate.search.wrap.Wrap;
import org.computate.spinechamp.model.BaseModel;

/**
 * Order: 6
 * Description: a person guessing on a tournament. 
 * AName: a guesser
 * Icon: <i class="fa-regular fa-buildings"></i>
 * MenuDetails: guessers
 * MenuDetailsOpen: true
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
}
