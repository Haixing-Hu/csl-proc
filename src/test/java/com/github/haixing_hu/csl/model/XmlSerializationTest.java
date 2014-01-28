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

import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.stream.Format;

import static org.junit.Assert.assertEquals;

/**
 * The base class for the unit test of XML serialization of objects.
 *
 * @param <T>
 *    the object class under testing.
 * @author Haixing Hu
 */
public abstract class XmlSerializationTest<T> {

  /**
   * The class of the object under testing.
   */
  protected Class<T> clazz;

  /**
   * A map from the object to the corresponding XML serialization result.
   */
  protected Map<T, String> testData;


  public XmlSerializationTest(Class<T> clazz) {
    this.clazz = clazz;
    this.testData = new HashMap<T, String>();
  }

  /**
   * Generates the test data.
   */
  @Before
  public abstract void setUp() throws Exception;

  @Test
  public void testXmlSerialize() throws Exception {
    final Format format = new Format(4);  //  use 4 spaces for indent
    final Serializer sr = new Persister(format);
    for (final Map.Entry<T, String> entry : testData.entrySet()) {
      final T obj = entry.getKey();
      final String xml = entry.getValue();
      System.out.println("Testing XML serialize of:\n" + obj);
      final StringWriter writer = new StringWriter();
      sr.write(obj, writer);
      final String actual = writer.toString();
      System.out.println("Expected result is:\n" + xml);
      System.out.println("Actual result is:\n" + actual);
      assertEquals(xml, actual);
      System.out.println();
    }
  }

  @Test
  public void testXmlDeserialize() throws Exception {
    final Format format = new Format(4);  //  use 4 spaces for indent
    final Serializer sr = new Persister(format);
    for (final Map.Entry<T, String> entry : testData.entrySet()) {
      final T obj = entry.getKey();
      final String xml = entry.getValue();
      System.out.println("Testing XML deserialize of:\n" + xml);
      final StringReader reader = new StringReader(xml);
      final T actual = sr.read(clazz, reader);
      System.out.println("Expected result is:\n" + obj);
      System.out.println("Actual result is:\n" + actual);
      assertEquals(obj, actual);
      System.out.println();
    }
  }
}
