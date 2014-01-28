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

package com.github.haixinghu.csl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The unit test of the {@link Author} class.
 *
 * @author Haixing Hu
 */
public class AuthorTest extends XmlSerializationTest<Author>{

  private static final Map<Author, String> TEST_DATA = new HashMap<Author, String>();
  private static final List<Author> FAIL_OBJECT = new ArrayList<Author>();
  private static final List<String> FAIL_XML = new ArrayList<String>();

  static {
    TEST_DATA.put(new Author(),
        "<author><name></name></author>");
    TEST_DATA.put(new Author("tom"),
        "<author><name>tom</name></author>");
    TEST_DATA.put(new Author("tom", "tom@gmail.com"),
        "<author><name>tom</name><email>tom@gmail.com</email></author>");
    TEST_DATA.put(new Author("tom", "tom@gmail.com", "http://tom.google.com/"),
          "<author>"
        +   "<name>tom</name>"
        +   "<email>tom@gmail.com</email>"
        +   "<uri>http://tom.google.com/</uri>"
        + "</author>");
  }

  public AuthorTest() {
    super(Author.class, TEST_DATA, FAIL_OBJECT, FAIL_XML);
  }

}
