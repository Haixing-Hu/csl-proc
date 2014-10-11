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

import javax.annotation.Nullable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import static com.github.haixing_hu.csl.util.Argument.requireNonNull;

/**
 * Specifies the license under which the style file is released.
 *
 * @author Haixing Hu
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Rights {

  @XmlAttribute
  private String license;

  @XmlValue
  private String content;

  /**
   * Default constructs a {@link Rights} object.
   */
  public Rights() {
    license = null;
    content = StringUtils.EMPTY;
  }

  /**
   * Constructs a {@link Rights} object.
   *
   * @param content
   *    the content.
   */
  public Rights(String content) {
    this.license = null;
    this.content = requireNonNull("content", content);
  }

  /**
   * Constructs a {@link Rights} object.
   *
   * @param license
   *    the license, which could be {@code null}.
   * @param content
   *    the content.
   */
  public Rights(@Nullable String license, String content) {
    this.license = license;
    this.content = requireNonNull("content", content);
  }

  /**
   * Gets the license.
   *
   * @return the license.
   */
  public String getLicense() {
    return license;
  }

  /**
   * Sets the license.
   *
   * @param license
   *          the new license to set,  which could be {@code null}.
   */
  public void setLicense(@Nullable String license) {
    this.license = license;
  }

  /**
   * Gets the content.
   *
   * @return the content.
   */
  public String getContent() {
    return content;
  }

  /**
   * Sets the content.
   *
   * @param content
   *          the new content to set.
   */
  public void setContent(String content) {
    this.content = requireNonNull("content", content);
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
