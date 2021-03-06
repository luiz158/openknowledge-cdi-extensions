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
package de.openknowledge.cdi.inject;

import javax.enterprise.event.Observes;
import javax.enterprise.inject.spi.AfterDeploymentValidation;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.inject.spi.Extension;

/**
 * This class provides static access to the {@link BeanManager}.
 *
 * @author Arne Limburg - open knowledge GmbH (arne.limburg@openknowledge.de)
 */
public class BeanManagerProvider implements Extension {

  private static BeanManager beanManager;

  public static BeanManager getBeanManager() {
    if (beanManager == null) {
      throw new IllegalStateException("No CDI context available");
    }
    return beanManager;
  }

  public void setBeanManager(@Observes AfterDeploymentValidation event, BeanManager beanManager) {
    BeanManagerProvider.beanManager = beanManager;
  }
}
