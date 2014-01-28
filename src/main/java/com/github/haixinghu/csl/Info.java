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

import java.util.Date;
import java.util.List;

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

import static com.github.haixinghu.csl.util.Argument.requireNonNull;

/**
 * The model of meta information of a CSL.
 *
 * @author Haixing Hu
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType
public class Info {

  @XmlElement(required = true)
  private String title;

  @XmlElement(name = "title-short")
  private String titleShort;

  @XmlElement(required = true)
  private String id;

  @XmlElement
  private String summary;

  @XmlElement(name = "link")
  private List<Link> links;

  @XmlElement(name = "author")
  private List<Author> authors;

  @XmlElement(name = "contributor")
  private List<Author> contributors;

  @XmlElement(name = "category")
  private List<Category> categories;

  @XmlElement(name = "issn")
  private List<String> issns;

  @XmlElement(name = "eissn")
  private List<String> eissns;

  @XmlElement(name = "issnl")
  private List<String> issnls;

  @XmlElement
  private Rights rights;

  @XmlElement
  private Date published;

  @XmlElement(required = true)
  private Date updated;

  public Info() {
    id = StringUtils.EMPTY;
    title = StringUtils.EMPTY;
    titleShort = null;
    summary = null;
    authors = null;
    contributors = null;
    categories = null;
    issns = null;
    eissns = null;
    issnls = null;
    links = null;
    rights = null;
    published = null;
    updated = new Date(0);
  }

  /**
   * Gets the title.
   *
   * @return the title.
   */
  public String getTitle() {
    return title;
  }

  /**
   * Sets the title.
   *
   * @param title
   *          the new title to set.
   */
  public void setTitle(String title) {
    this.title = requireNonNull("title", title);
  }

  /**
   * Gets the titleShort.
   *
   * @return the titleShort.
   */
  public String getTitleShort() {
    return titleShort;
  }

  /**
   * Sets the titleShort.
   *
   * @param titleShort
   *          the new titleShort to set.
   */
  public void setTitleShort(@Nullable String titleShort) {
    this.titleShort = titleShort;
  }

  /**
   * Gets the id.
   *
   * @return the id.
   */
  public String getId() {
    return id;
  }

  /**
   * Sets the id.
   *
   * @param id
   *          the new id to set.
   */
  public void setId(String id) {
    this.id = requireNonNull("id", id);
  }

  /**
   * Gets the summary.
   *
   * @return the summary.
   */
  public String getSummary() {
    return summary;
  }

  /**
   * Sets the summary.
   *
   * @param summary
   *          the new summary to set.
   */
  public void setSummary(@Nullable String summary) {
    this.summary = summary;
  }

  /**
   * Gets the links.
   *
   * @return the links.
   */
  public List<Link> getLinks() {
    return links;
  }

  /**
   * Sets the links.
   *
   * @param links
   *          the new links to set.
   */
  public void setLinks(@Nullable List<Link> links) {
    this.links = links;
  }

  /**
   * Gets the authors.
   *
   * @return the authors.
   */
  public List<Author> getAuthors() {
    return authors;
  }

  /**
   * Sets the authors.
   *
   * @param authors
   *          the new authors to set.
   */
  public void setAuthors(@Nullable List<Author> authors) {
    this.authors = authors;
  }

  /**
   * Gets the contributors.
   *
   * @return the contributors.
   */
  public List<Author> getContributors() {
    return contributors;
  }

  /**
   * Sets the contributors.
   *
   * @param contributors
   *          the new contributors to set.
   */
  public void setContributors(@Nullable List<Author> contributors) {
    this.contributors = contributors;
  }

  /**
   * Gets the categories.
   *
   * @return the categories.
   */
  public List<Category> getCategories() {
    return categories;
  }

  /**
   * Sets the categories.
   *
   * @param categories
   *          the new categories to set.
   */
  public void setCategories(@Nullable List<Category> categories) {
    this.categories = categories;
  }

  /**
   * Gets the ISSNs.
   *
   * @return the ISSNs.
   */
  public List<String> getIssns() {
    return issns;
  }

  /**
   * Sets the ISSNs.
   *
   * @param issns
   *          the new ISSNs to set.
   */
  public void setIssns(@Nullable List<String> issns) {
    this.issns = issns;
  }

  /**
   * Gets the EISSNs.
   *
   * @return the EISSNs.
   */
  public List<String> getEissns() {
    return eissns;
  }

  /**
   * Sets the EISSNs.
   *
   * @param eissns
   *          the new EISSNs to set.
   */
  public void setEissns(@Nullable List<String> eissns) {
    this.eissns = eissns;
  }

  /**
   * Gets the ISSNLs.
   *
   * @return the ISSNLs.
   */
  public List<String> getIssnls() {
    return issnls;
  }

  /**
   * Sets the ISSNLs.
   *
   * @param issnls
   *          the new ISSNLs to set.
   */
  public void setIssnls(@Nullable List<String> issnls) {
    this.issnls = issnls;
  }

  /**
   * Gets the rights.
   *
   * @return the rights.
   */
  public Rights getRights() {
    return rights;
  }

  /**
   * Sets the rights.
   *
   * @param rights
   *          the new rights to set.
   */
  public void setRights(@Nullable Rights rights) {
    this.rights = rights;
  }

  /**
   * Gets the published.
   *
   * @return the published.
   */
  public Date getPublished() {
    return published;
  }

  /**
   * Sets the published.
   *
   * @param published
   *          the new published to set.
   */
  public void setPublished(@Nullable Date published) {
    this.published = published;
  }

  /**
   * Gets the updated.
   *
   * @return the updated.
   */
  public Date getUpdated() {
    return updated;
  }

  /**
   * Sets the updated.
   *
   * @param updated
   *          the new updated to set.
   */
  public void setUpdated(Date updated) {
    this.updated = requireNonNull("updated", updated);
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
