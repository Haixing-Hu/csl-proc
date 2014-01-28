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
 * Unit test of the {@link Author} class.
 *
 * @author Haixing Hu
 */
public class AuthorTest extends XmlSerializationTest<Author> {

  public AuthorTest() {
    super(Author.class);
  }

  @Override
  public void setUp() {
    testData.clear();

    Author author = new Author();
    String xml = "<author>\n"
               + "    <name>anonymous</name>\n"
               + "</author>";
    testData.put(author, xml);

    author = new Author();
    author.setName("author1");
    xml = "<author>\n"
        + "    <name>author1</name>\n"
        + "</author>";
    testData.put(author, xml);

    author = new Author();
    author.setName("author2");
    author.setEmail("author2@gmail.com");
    xml = "<author>\n"
        + "    <name>author2</name>\n"
        + "    <email>author2@gmail.com</email>\n"
        + "</author>";
    testData.put(author, xml);

    author = new Author();
    author.setName("author3");
    author.setUri("http://www.google.com/author3");
    xml = "<author>\n"
        + "    <name>author3</name>\n"
        + "    <uri>http://www.google.com/author3</uri>\n"
        + "</author>";
    testData.put(author, xml);

    author = new Author();
    author.setName("author4");
    author.setEmail("author4@gmail.com");
    author.setUri("http://www.google.com/author4");
    xml = "<author>\n"
        + "    <name>author4</name>\n"
        + "    <email>author4@gmail.com</email>\n"
        + "    <uri>http://www.google.com/author4</uri>\n"
        + "</author>";
    testData.put(author, xml);
  }
}
