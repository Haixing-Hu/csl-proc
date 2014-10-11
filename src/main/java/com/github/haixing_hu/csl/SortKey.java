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

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * The model of sorting keys.
 *
 * @author Haixing Hu
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="key")
public final class SortKey {

  @XmlAttribute
  private String variable;

  @XmlAttribute
  private String macro;

  @XmlAttribute
  private SortDirection sort;

  @XmlAttribute(name = "names-min")
  private Integer namesMin;

  @XmlAttribute(name = "names-use-first")
  private Integer namesUseFirst;

  @XmlAttribute(name = "names-use-last")
  private Integer namesUseLast;

  public SortKey() {
    variable = null;
    macro = null;
    sort = null;
    namesMin = null;
    namesUseFirst = null;
    namesUseLast = null;
  }

  /**
   * Gets the variable.
   *
   * @return the variable.
   */
  public String getVariable() {
    return variable;
  }

  /**
   * Sets the variable.
   *
   * @param variable
   *          the new variable to set.
   */
  public void setVariable(@Nullable final String variable) {
    this.variable = variable;
  }

  /**
   * Gets the macro.
   *
   * @return the macro.
   */
  public String getMacro() {
    return macro;
  }

  /**
   * Sets the macro.
   *
   * @param macro
   *          the new macro to set.
   */
  public void setMacro(@Nullable final String macro) {
    this.macro = macro;
  }

  /**
   * Gets the sort.
   *
   * @return the sort.
   */
  public SortDirection getSort() {
    return sort;
  }

  /**
   * Sets the sort.
   *
   * @param sort
   *          the new sort to set.
   */
  public void setSort(@Nullable final SortDirection sort) {
    this.sort = sort;
  }

  /**
   * Gets the namesMin.
   *
   * @return the namesMin.
   */
  public Integer getNamesMin() {
    return namesMin;
  }

  /**
   * Sets the namesMin.
   *
   * @param namesMin
   *          the new namesMin to set.
   */
  public void setNamesMin(@Nullable final Integer namesMin) {
    this.namesMin = namesMin;
  }

  /**
   * Gets the namesUseFirst.
   *
   * @return the namesUseFirst.
   */
  public Integer getNamesUseFirst() {
    return namesUseFirst;
  }

  /**
   * Sets the namesUseFirst.
   *
   * @param namesUseFirst
   *          the new namesUseFirst to set.
   */
  public void setNamesUseFirst(@Nullable final Integer namesUseFirst) {
    this.namesUseFirst = namesUseFirst;
  }

  /**
   * Gets the namesUseLast.
   *
   * @return the namesUseLast.
   */
  public Integer getNamesUseLast() {
    return namesUseLast;
  }

  /**
   * Sets the namesUseLast.
   *
   * @param namesUseLast
   *          the new namesUseLast to set.
   */
  public void setNamesUseLast(@Nullable final Integer namesUseLast) {
    this.namesUseLast = namesUseLast;
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
