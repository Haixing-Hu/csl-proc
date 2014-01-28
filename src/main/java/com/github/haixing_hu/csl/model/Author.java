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

import javax.annotation.Nullable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * The model of authors of a CSL.
 *
 * @author Haixing Hu
 */
@Root
public class Author {

  @Element
  private String name;

  @Element(required=false)
  private String email;

  @Element(required=false)
  private String uri;

  /**
   * Default constructs an {@link Author}.
   */
  public Author() {
    name = "anonymous";
    email = null;
    uri = null;
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
  public void setName(String name) {
    if (name == null) {
      throw new NullPointerException("name");
    }
    this.name = name;
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
   *          the new email to set.
   */
  public void setEmail(@Nullable String email) {
    this.email = email;
  }

  /**
   * Gets the uri.
   *
   * @return the uri.
   */
  public String getUri() {
    return uri;
  }

  /**
   * Sets the uri.
   *
   * @param uri
   *          the new uri to set.
   */
  public void setUri(@Nullable String uri) {
    this.uri = uri;
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
