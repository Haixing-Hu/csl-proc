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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import static com.github.haixing_hu.csl.util.Argument.requireNonNull;

/**
 * The model of links of a CSL.
 *
 * @author Haixing Hu
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(propOrder={"href", "rel"})
public final class Link {

  @XmlAttribute(required=true)
  private String href;

  @XmlAttribute(required=true)
  private String rel;

  /**
   * Default constructs a {@link Link}.
   */
  public Link() {
    href = StringUtils.EMPTY;
    rel = StringUtils.EMPTY;
  }

  /**
   * Constructs a {@link Link}.
   */
  public Link(final String href, final String rel) {
    this.href = requireNonNull("href", href);
    this.rel = requireNonNull("rel", rel);
  }

  /**
   * Gets the href.
   *
   * @return the href.
   */
  public String getHref() {
    return href;
  }

  /**
   * Sets the href.
   *
   * @param href
   *          the new href to set.
   */
  public void setHref(final String href) {
    this.href = requireNonNull("href", href);
  }

  /**
   * Gets the rel.
   *
   * @return the rel.
   */
  public String getRel() {
    return rel;
  }

  /**
   * Sets the rel.
   *
   * @param rel
   *          the new rel to set.
   */
  public void setRel(final String rel) {
    this.rel = requireNonNull("rel", rel);
  }

  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }

  @Override
  public boolean equals(final Object obj) {
    return EqualsBuilder.reflectionEquals(this, obj);
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }
}
