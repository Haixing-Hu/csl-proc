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

package com.github.haixing_hu.csl.model;

import java.net.URISyntaxException;


/**
 * The unit test of the {@link Right} class.
 *
 * @author Haixing Hu
 */
public class RightTest extends XmlSerializationTest<Right> {

  public RightTest() {
    super(Right.class);
  }

  @Override
  public void setUp() throws URISyntaxException {
    testData.clear();

    Right right = new Right();
    String xml = "<right></right>";
    testData.put(right, xml);

    right = new Right();
    right.setContent("some thing here");
    xml = "<right>"
        + "some thing here"
        + "</right>";
    testData.put(right, xml);

    right = new Right();
    right.setLicense("http://creativecommons.org/licenses/by-sa/3.0/");
    xml = "<right license=\"http://creativecommons.org/licenses/by-sa/3.0/\"></right>";
    testData.put(right, xml);

    right = new Right();
    right.setLicense("http://creativecommons.org/licenses/by-sa/3.0/");
    right.setContent("some thing here");
    xml = "<right license=\"http://creativecommons.org/licenses/by-sa/3.0/\">"
        + "some thing here"
        + "</right>";
    testData.put(right, xml);
  }

}
