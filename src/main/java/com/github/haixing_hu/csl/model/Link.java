/******************************************************************************
 *
 *    Copyright (c) 2013  Haixing Hu. All rights reserved.
 *
 ******************************************************************************/

package com.github.haixing_hu.csl.model;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

/**
 * The model of links of a CSL.
 *
 * @author Haixing Hu
 */
@Root
public class Link {

  /**
   * The "rel" value of a link, indicating the link is the URI of the current
   * style itself.
   */
  public static final String REL_SELF = "self";

  /**
   * The "rel" value of a link, indicating the link is the URI of the style from
   * which the current style is derived.
   */
  public static final String REL_TEMPLATE = "template";

  /**
   * The "rel" value of a link, indicating the link is the URI of the
   * documentation of the current style.
   */
  public static final String REL_DOCUMENTATION = "documentation";

  @Attribute
  private String href;

  @Attribute
  private String rel;

  /**
   * Default constructs a {@link Link}.
   */
  public Link() {
    href = StringUtils.EMPTY;
    rel = StringUtils.EMPTY;
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
  public void setHref(String href) {
    if (href == null) {
      throw new NullPointerException("href");
    }
    this.href = href;
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
  public void setRel(String rel) {
    if (rel == null) {
      throw new NullPointerException("rel");
    }
    this.rel = rel;
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
