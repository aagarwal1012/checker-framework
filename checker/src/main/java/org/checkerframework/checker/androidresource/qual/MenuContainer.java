package org.checkerframework.checker.androidresource.qual;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.SubtypeOf;

/**
 * Represents <i>Menu</i> inner class of resource class {@code R}. <br>
 * It is meant for internal use only. Programmers should rarely write this type.
 */
@SubtypeOf({ResourceTop.class})
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
public @interface MenuContainer {}
