/*
 * Copyright (c) 2014  Haixing Hu
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.github.haixing_hu.csl;

/**
 * The enumeration of CSL types.
 *
 * @author Haixing Hu
 * @see <a href="http://citationstyles.org/downloads/specification.html#appendix-iii-types">CSL Types</a>
 */
public enum Type {
  ARTICLE("article"),

  ARTICLE_MAGAZINE("article-magazine"),

  ARTICLE_NEWSPAPER("article-newspaper"),

  ARTICLE_JOURNAL("article-journal"),

  BILL("bill"),

  BOOK("book"),

  BROADCAST("broadcast"),

  CHAPTER("chapter"),

  DATASET("dataset"),

  ENTRY("entry"),

  ENTRY_DICTIONARY("entry-dictionary"),

  ENTRY_ENCYCLOPEDIA("entry-encyclopedia"),

  FIGURE("figure"),

  GRAPHIC("graphic"),

  INTERVIEW("interview"),

  LEGISLATION("legislation"),

  LEGAL_CASE("legal_case"),

  MANUSCRIPT("manuscript"),

  MAP("map"),

  MOTION_PICTURE("motion_picture"),

  MUSICAL_SCORE("musical_score"),

  PAMPHLET("pamphlet"),

  PAPER_CONFERENCE("paper-conference"),

  PATENT("patent"),

  POST("post"),

  POST_WEBLOG("post-weblog"),

  PERSONAL_COMMUNICATION("personal_communication"),

  REPORT("report"),

  REVIEW("review"),

  REVIEW_BOOK("review-book"),

  SONG("song"),

  SPEECH("speech"),

  THESIS("thesis"),

  TREATY("treaty"),

  WEBPAGE("webpage");

  private final String name;

  private Type(final String name) {
    this.name = name;
  }

  /**
   * Gets the standard name of this type.
   *
   * @return the standard name of this type.
   */
  public String getName() {
    return name;
  }
}
