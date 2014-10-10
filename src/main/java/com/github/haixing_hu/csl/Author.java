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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import static com.github.haixing_hu.csl.util.Argument.requireNonNull;

/**
 * The model of authors of a CSL.
 *
 * @author Haixing Hu
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(propOrder={"name", "email", "uri"})
public final class Author {

  @XmlElement(required=true)
  private String name;

  @XmlElement
  private String email;

  @XmlElement
  private String uri;

  /**
   * Default constructs an {@link Author}.
   */
  public Author() {
    name = StringUtils.EMPTY;
    email = null;
    uri = null;
  }

  /**
   * Constructs an {@link Author}.
   *
   * @param name
   *    the name of the author.
   */
  public Author(final String name) {
    this.name = requireNonNull("name", name);
    email = null;
    uri = null;
  }

  /**
   * Constructs an {@link Author}.
   *
   * @param name
   *    the name of the author.
   * @param email
   *    the email of the author, which could be {@code null}.
   */
  public Author(final String name, @Nullable final String email) {
    this.name = requireNonNull("name", name);
    this.email = email;
    uri = null;
  }

  /**
   * Constructs an {@link Author}.
   *
   * @param name
   *    the name of the author.
   * @param email
   *    the email of the author, which could be {@code null}.
   * @param uri
   *    the URI of the author, which could be {@code null}.
   */
  public Author(final String name, @Nullable final String email,
      @Nullable final String uri) {
    this.name = requireNonNull("name", name);
    this.email = email;
    this.uri = uri;
  }

  /**
   * Gets the name.
   *
   * @return the name.
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the name.
   *
   * @param name
   *          the new name to set.
   */
  public void setName(final String name) {
    this.name = requireNonNull("name", name);
  }

  /**
   * Gets the email.
   *
   * @return the email.
   */
  public String getEmail() {
    return email;
  }

  /**
   * Sets the email.
   *
   * @param email
   *          the new email to set, which could be {@code null}.
   */
  public void setEmail(@Nullable final String email) {
    this.email = email;
  }

  /**
   * Gets the URI.
   *
   * @return the URI.
   */
  public String getUri() {
    return uri;
  }

  /**
   * Sets the URI.
   *
   * @param uri
   *          the new URI to set, which could be {@code null}.
   */
  public void setUri(@Nullable final String uri) {
    this.uri = uri;
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
