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

import javax.annotation.Nullable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import static com.github.haixinghu.csl.util.Argument.requireNonNull;

/**
 * The model of the category of the CSL.
 *
 * @author Haixing Hu
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType
public class Category {

  @XmlAttribute(name="citation-format")
  private CitationFormat citationFormat;

  @XmlAttribute
  private Field field;

  public Category() {
    citationFormat = null;
    field = null;
  }

  public Category(CitationFormat citationFormat) {
    this.citationFormat = requireNonNull("citationFormat", citationFormat);
    this.field = null;
  }

  public Category(Field field) {
    this.citationFormat = null;
    this.field = requireNonNull("field", field);
  }


  /**
   * Gets the citationFormat.
   *
   * @return the citationFormat.
   */
  public CitationFormat getCitationFormat() {
    return citationFormat;
  }

  /**
   * Sets the citationFormat.
   *
   * @param citationFormat
   *          the new citationFormat to set.
   */
  public void setCitationFormat(@Nullable CitationFormat citationFormat) {
    this.citationFormat = citationFormat;
  }

  /**
   * Gets the field.
   *
   * @return the field.
   */
  public Field getField() {
    return field;
  }

  /**
   * Sets the field.
   *
   * @param field
   *          the new field to set.
   */
  public void setField(@Nullable Field field) {
    this.field = field;
  }

  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }

  @Override
  public boolean equals(Object obj) {
    return EqualsBuilder.reflectionEquals(this, obj);
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }
}
