package com.mytests.spring.componentScanFilters;

import java.lang.annotation.*;

/**
 * *******************************
 * annotation to mark the custom classes to include
 * *******************************
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented

public @interface CustomIncludedComponentAnnotation {
}
