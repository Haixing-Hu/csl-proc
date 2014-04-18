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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.github.haixing_hu.csl.Category;
import com.github.haixing_hu.csl.CitationFormat;
import com.github.haixing_hu.csl.Field;

/**
 * The unit test of the {@link Category} class.
 *
 * @author Haixing Hu
 */
public class CategoryTest extends XmlSerializationTest<Category>{

  private static final Map<Category, String> TEST_DATA = new HashMap<Category, String>();
  private static final List<Category> FAIL_OBJECT = new ArrayList<Category>();
  private static final List<String> FAIL_XML = new ArrayList<String>();

  static {
    TEST_DATA.put(new Category(),
        "<category/>");
    TEST_DATA.put(new Category(CitationFormat.AUTHOR),
        "<category citation-format='author'/>");
    TEST_DATA.put(new Category(CitationFormat.AUTHOR_DATE),
        "<category citation-format='author-date'/>");
    TEST_DATA.put(new Category(CitationFormat.LABEL),
        "<category citation-format='label'/>");
    TEST_DATA.put(new Category(CitationFormat.NOTE),
        "<category citation-format='note'/>");
    TEST_DATA.put(new Category(CitationFormat.NUMERIC),
        "<category citation-format='numeric'/>");

    TEST_DATA.put(new Category(Field.ANTHROPOLOGY),
        "<category field='anthropology'/>");
    TEST_DATA.put(new Category(Field.ASTRONOMY),
        "<category field='astronomy'/>");
    TEST_DATA.put(new Category(Field.BIOLOGY),
        "<category field='biology'/>");
    TEST_DATA.put(new Category(Field.BOTANY),
        "<category field='botany'/>");
    TEST_DATA.put(new Category(Field.CHEMISTRY),
        "<category field='chemistry'/>");
    TEST_DATA.put(new Category(Field.COMMUNICATIONS),
        "<category field='communications'/>");
    TEST_DATA.put(new Category(Field.ENGINEERING),
        "<category field='engineering'/>");
    TEST_DATA.put(new Category(Field.GENERIC_BASE),
        "<category field='generic-base'/>");
    TEST_DATA.put(new Category(Field.GEOGRAPHY),
        "<category field='geography'/>");
    TEST_DATA.put(new Category(Field.GEOLOGY),
        "<category field='geology'/>");
    TEST_DATA.put(new Category(Field.HISTORY),
        "<category field='history'/>");
    TEST_DATA.put(new Category(Field.HUMANITIES),
        "<category field='humanities'/>");
    TEST_DATA.put(new Category(Field.LAW),
        "<category field='law'/>");
    TEST_DATA.put(new Category(Field.LINGUISTICS),
        "<category field='linguistics'/>");
    TEST_DATA.put(new Category(Field.LITERATURE),
        "<category field='literature'/>");
    TEST_DATA.put(new Category(Field.MATH),
        "<category field='math'/>");
    TEST_DATA.put(new Category(Field.MEDICINE),
        "<category field='medicine'/>");
    TEST_DATA.put(new Category(Field.PHILOSOPHY),
        "<category field='philosophy'/>");
    TEST_DATA.put(new Category(Field.PHYSICS),
        "<category field='physics'/>");
    TEST_DATA.put(new Category(Field.POLITICAL_SCIENCE),
        "<category field='political-science'/>");
    TEST_DATA.put(new Category(Field.PSYCHOLOGY),
        "<category field='psychology'/>");
    TEST_DATA.put(new Category(Field.SCIENCE),
        "<category field='science'/>");
    TEST_DATA.put(new Category(Field.SOCIAL_SCIENCE),
        "<category field='social-science'/>");
    TEST_DATA.put(new Category(Field.SOCIOLOGY),
        "<category field='sociology'/>");
    TEST_DATA.put(new Category(Field.THEOLOGY),
        "<category field='theology'/>");
    TEST_DATA.put(new Category(Field.ZOOLOGY),
        "<category field='zoology'/>");
  }

  public CategoryTest() {
    super(Category.class, TEST_DATA, FAIL_OBJECT, FAIL_XML);
  }

}
