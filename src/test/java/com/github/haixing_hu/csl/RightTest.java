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

import com.github.haixing_hu.csl.Rights;

/**
 * Unit test of the {@link Rights} class.
 *
 * @author Haixing Hu
 */
public class RightTest extends XmlSerializationTest<Rights>{

  private static final Map<Rights, String> TEST_DATA = new HashMap<Rights, String>();
  private static final List<Rights> FAIL_OBJECT = new ArrayList<Rights>();
  private static final List<String> FAIL_XML = new ArrayList<String>();

  static {
    TEST_DATA.put(new Rights(),
        "<rights></rights>");

    TEST_DATA.put(new Rights("hello world"),
        "<rights>hello world</rights>");

    TEST_DATA.put(new Rights("http://www.google.com", "hello world"),
        "<rights license='http://www.google.com'>hello world</rights>");
  }

  public RightTest() {
    super(Rights.class, TEST_DATA, FAIL_OBJECT, FAIL_XML);
  }
}
