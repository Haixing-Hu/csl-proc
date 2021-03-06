/******************************************************************************
 *
 * Copyright (c) 2014  Haixing Hu
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
import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * The JAXB data type adapter for the {@link Type} enumeration.
 *
 * @author Haixing Hu
 */
public final class TypeXmlAdapter extends XmlAdapter<String, Type>{

  @Override
  public Type unmarshal(@Nullable final String str) throws Exception {
    if (str == null) {
      return null;
    }
    for (final Type type : Type.values()) {
      if (type.getName().equalsIgnoreCase(str)) {
        return type;
      }
    }
    throw new IllegalArgumentException("Unknown type: " + str);
  }

  @Override
  public String marshal(@Nullable final Type type) throws Exception {
    if (type == null) {
      return null;
    } else {
      return type.getName();
    }
  }

}
