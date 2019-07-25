/**
 * Upstream version:
 * https://android.googlesource.com/platform/frameworks/base/+/master/core/java/android/annotation/AnyThread.java
 * This annotation is only included for testing purpose.
 */
package android.support.annotation;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.SOURCE;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(SOURCE)
@Target({METHOD, CONSTRUCTOR, TYPE, PARAMETER})
public @interface AnyThread {}
