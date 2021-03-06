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

import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.custommonkey.xmlunit.Diff;
import org.custommonkey.xmlunit.ElementNameAndTextQualifier;
import org.custommonkey.xmlunit.XMLAssert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

/**
 * The base class for testing the XML serialization of a CSL domain object.
 *
 * @param T
 *      the class under test.
 * @author Haixing Hu
 */
public abstract class XmlSerializationTest<T> {

  protected final Class<T> cls;
  protected final Map<T, String> testData;
  protected final List<T> failObject;
  protected final List<String> failXml;
  protected Logger logger;

  protected XmlSerializationTest(Class<T> cls, Map<T, String> testData,
      List<T> failObject, List<String> failXml) {
    this.cls = cls;
    this.testData = testData;
    this.failObject = failObject;
    this.failXml = failXml;
    this.logger = LoggerFactory.getLogger(this.getClass());
  }

  @Test
  public void testXmlMarshal() throws Exception {
    final JAXBContext context = JAXBContext.newInstance(cls);
    final Marshaller mr = context.createMarshaller();
    mr.setProperty("jaxb.fragment", Boolean.TRUE);
    for (final Map.Entry<T, String> entry : testData.entrySet()) {
      final T obj = entry.getKey();
      final String xml = entry.getValue();
      final StringWriter writer = new StringWriter();
      mr.marshal(obj, writer);
      final String actual = writer.toString();
      logger.debug("Object is:\n{}", obj);
      logger.debug("Expected XML is:\n{}", xml);
      logger.debug("Actual XML is:\n{}\n", actual);
      final Diff diff = new Diff(xml, actual);
      // we don't care about ordering
      diff.overrideElementQualifier(new ElementNameAndTextQualifier());
      XMLAssert.assertXMLEqual(diff, true);
    }
  }

  @Test
  public void testXmlUnmarshal() throws Exception {
    final JAXBContext context = JAXBContext.newInstance(cls);
    final Unmarshaller umr = context.createUnmarshaller();
    for (final Map.Entry<T, String> entry : testData.entrySet()) {
      final T obj = entry.getKey();
      final String xml = entry.getValue();
      final StringReader reader = new StringReader(xml);
      @SuppressWarnings("unchecked")
      final T actual = (T) umr.unmarshal(reader);
      logger.debug("XML is:\n{}", xml);
      logger.debug("Expecte object is:\n{}", obj);
      logger.debug("Actual object is:\n{}\n", actual);
      assertEquals(obj, actual);
    }
  }
}
