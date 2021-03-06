/*
 * Copyright open knowledge GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.openknowledge.cdi.common.spi;

import javax.enterprise.util.AnnotationLiteral;
import javax.inject.Named;

/**
 * A literal to instantiate the {@link Named} annotation.
 *
 * @author Arne Limburg - open knowledge GmbH
 */
public class NamedLiteral extends AnnotationLiteral<Named> implements Named {

  private String name;

  public NamedLiteral(String name) {
    this.name = name;
  }

  @Override
  public String value() {
    return this.name;
  }
}
