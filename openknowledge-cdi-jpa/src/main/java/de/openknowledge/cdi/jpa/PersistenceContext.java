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

package de.openknowledge.cdi.jpa;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.enterprise.util.Nonbinding;
import javax.inject.Qualifier;
import javax.persistence.PersistenceContextType;
import javax.persistence.PersistenceProperty;

/**
 * Qualifier to replace {@link javax.persistence.PersistenceContext} in CDI.
 *
 * @author Arne Limburg - open knowledge GmbH
 */
@Qualifier
@Retention(RUNTIME)
@Target({TYPE, FIELD, METHOD, PARAMETER})
public @interface PersistenceContext {

  String name() default "";

  String unitName() default "";

  PersistenceContextType type() default PersistenceContextType.TRANSACTION;

  @Nonbinding PersistenceProperty[] properties() default {};
}
