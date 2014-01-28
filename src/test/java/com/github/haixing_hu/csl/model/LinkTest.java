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

/**
 * Unit test of the {@link Link} class.
 *
 * @author Haixing Hu
 */
public class LinkTest extends XmlSerializationTest<Link> {

  public LinkTest() {
    super(Link.class);
  }

  @Override
  public void setUp() throws Exception {
    testData.clear();
    Link link = new Link();
    String xml = "<link href=\"\" rel=\"\"/>";
    testData.put(link, xml);

    link = new Link();
    link.setHref("http://www.google.com");
    xml = "<link href=\"http://www.google.com\" rel=\"\"/>";
    testData.put(link, xml);

    link = new Link();
    link.setRel(Link.REL_SELF);
    xml = "<link href=\"\" rel=\"self\"/>";
    testData.put(link, xml);

    link = new Link();
    link.setHref("http://www.google.com");
    link.setRel(Link.REL_TEMPLATE);
    xml = "<link href=\"http://www.google.com\" rel=\"template\"/>";
    testData.put(link, xml);
  }

}
