/******************************************************************************
 *
 * Copyright (c) 2013  Haixing Hu
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
 ******************************************************************************/

package com.github.haixing_hu.csl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

import com.github.haixing_hu.csl.Author;
import com.github.haixing_hu.csl.Category;
import com.github.haixing_hu.csl.CitationFormat;
import com.github.haixing_hu.csl.Field;
import com.github.haixing_hu.csl.Info;
import com.github.haixing_hu.csl.Link;
import com.github.haixing_hu.csl.Rights;

/**
 * Unit test of the {@link Info} class.
 *
 * @author Haixing Hu
 */
public class InfoTest extends XmlSerializationTest<Info>{

  private static final Map<Info, String> TEST_DATA = new HashMap<Info, String>();
  private static final List<Info> FAIL_OBJECT = new ArrayList<Info>();
  private static final List<String> FAIL_XML = new ArrayList<String>();

  static {
    Info info = new Info();
    TEST_DATA.put(info,
          "<info>"
        + "<id></id>"
        + "<title></title>"
        + "<updated>1970-01-01T00:00:00Z</updated>"
        + "</info>");

    info = new Info();
    info.setId("http://www.google.com");
    TEST_DATA.put(info,
        "<info>"
      + "<id>http://www.google.com</id>"
      + "<title></title>"
      + "<updated>1970-01-01T00:00:00Z</updated>"
      + "</info>");

    info = new Info();
    info.setId("http://www.google.com");
    info.setTitle("the title");
    TEST_DATA.put(info,
        "<info>"
      + "<id>http://www.google.com</id>"
      + "<title>the title</title>"
      + "<updated>1970-01-01T00:00:00Z</updated>"
      + "</info>");


    info = new Info();
    info.setId("http://www.google.com");
    info.setTitle("the title");
    final Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    cal.clear();
    cal.set(2000, 0, 1);
    info.setUpdated(cal.getTime());
    TEST_DATA.put(info,
        "<info>"
      + "<id>http://www.google.com</id>"
      + "<title>the title</title>"
      + "<updated>2000-01-01T00:00:00Z</updated>"
      + "</info>");

    info = new Info();
    info.setTitle("Style Title");
    info.setId("http://www.zotero.org/styles/style-title");
    final List<Link> links = new ArrayList<Link>(1);
    links.add(new Link("http://www.zotero.org/styles/style-title",
                       "self"));
    info.setLinks(links);
    final List<Author> authors = new ArrayList<Author>(1);
    authors.add(new Author("Author Name",
                           "name@domain.com",
                           "http://www.domain.com/name"));
    info.setAuthors(authors);
    final List<Category> categories = new ArrayList<Category>(2);
    categories.add(new Category(CitationFormat.AUTHOR_DATE));
    categories.add(new Category(Field.ZOOLOGY));
    info.setCategories(categories);
    final TimeZone utc = TimeZone.getTimeZone("UTC");
    final Calendar updated = new GregorianCalendar(utc);
    updated.clear();
    updated.set(2008, 9, 29, 21, 1, 24);
    info.setUpdated(updated.getTime());
    final Rights rights = new Rights();
    rights.setLicense("http://creativecommons.org/licenses/by-sa/3.0/");
    rights.setContent("This work is licensed under a Creative Commons "
        + "Attribution-Share Alike 3.0 Unported License");
    info.setRights(rights);
    final String xml = "<info>"
    + "<title>Style Title</title>"
    + "<id>http://www.zotero.org/styles/style-title</id>"
    + "<link href=\"http://www.zotero.org/styles/style-title\" rel=\"self\"/>"
    + "<author>"
    + "<name>Author Name</name>"
    + "<email>name@domain.com</email>"
    + "<uri>http://www.domain.com/name</uri>"
    + "</author>"
    + "<category citation-format=\"author-date\"/>"
    + "<category field=\"zoology\"/>"
    + "<updated>2008-10-29T21:01:24Z</updated>"
    + "<rights license=\"http://creativecommons.org/licenses/by-sa/3.0/\">"
    + "This work is licensed under a Creative Commons Attribution-Share Alike "
    + "3.0 Unported License</rights>"
    + "</info>";
    TEST_DATA.put(info, xml);
  }

  public InfoTest() {
    super(Info.class, TEST_DATA, FAIL_OBJECT, FAIL_XML);
  }

}
