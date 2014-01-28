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
 * Unit test of the {@link Link} class.
 *
 * @author Haixing Hu
 */
public class LinkTest extends XmlSerializationTest<Link>{

  private static final Map<Link, String> TEST_DATA = new HashMap<Link, String>();
  private static final List<Link> FAIL_OBJECT = new ArrayList<Link>();
  private static final List<String> FAIL_XML = new ArrayList<String>();

  static {
    TEST_DATA.put(new Link(),
        "<link href='' rel=''/>");
    TEST_DATA.put(new Link("http://www.google.com", "self"),
        "<link href='http://www.google.com' rel='self'/>");
    TEST_DATA.put(new Link("http://www.yahoo.com", "document"),
        "<link href='http://www.yahoo.com' rel='document'/>");
  }

  public LinkTest() {
    super(Link.class, TEST_DATA, FAIL_OBJECT, FAIL_XML);
  }
}
