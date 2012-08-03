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

import java.lang.annotation.Annotation;

import javax.enterprise.inject.spi.AnnotatedCallable;
import javax.enterprise.inject.spi.AnnotatedParameter;

/**
 * This implementation can be used to modify the scanned annotations of a CDI bean during annotation-processing
 * in a CDI extension (i.e. add annotations). See {@link DelegatingAnnotatedCallable} for a detailed example.
 *
 * @author Arne Limburg - open knowledge GmbH
 */
public class DelegatingAnnotatedParameter<T> extends DelegatingAnnotated implements AnnotatedParameter<T> {

  private AnnotatedCallable<T> declaringCallable;
  private AnnotatedParameter<T> delegate;

  public DelegatingAnnotatedParameter(AnnotatedCallable<T> declaringAnnotatedCallable,
                                      AnnotatedParameter<T> delegateParameter,
                                      Annotation... additionalAnnotations) {
    super(delegateParameter, additionalAnnotations);
    declaringCallable = declaringAnnotatedCallable;
    delegate = delegateParameter;
  }

  @Override
  public int getPosition() {
    return delegate.getPosition();
  }

  @Override
  public AnnotatedCallable<T> getDeclaringCallable() {
    return declaringCallable;
  }
}
