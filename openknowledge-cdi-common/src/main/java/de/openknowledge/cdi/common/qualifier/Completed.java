package de.openknowledge.cdi.common.qualifier;

import javax.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author Jens Schumann - open knowledge GmbH
 * @version $Revision$
 */

@Qualifier
@Retention(RUNTIME)
@Target({ TYPE, METHOD, PARAMETER, FIELD })
public @interface Completed {
}
