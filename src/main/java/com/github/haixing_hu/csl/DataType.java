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

/**
 * The enumeration of data types of variables.
 *
 * @see <a href='http://citationstyles.org/downloads/specification.html#appendix-iv-variables'>Variables</a>
 * @author Haixing Hu
 */
public enum DataType {

  /**
   * Indicates the values of the variable are strings.
   */
  STRING,

  /**
   * Indicates the values of the variable are integral numbers.
   */
  INTEGER,

  /**
   * Indicates the values of the variable are date.
   */
  DATE,

  /**
   * Indicates the values of the variable are names of people.
   */
  NAME,
}
