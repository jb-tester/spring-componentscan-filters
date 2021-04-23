package com.mytests.spring.componentScanFilters.scannedComponents;

import com.mytests.spring.componentScanFilters.CustomIncludedComponentAnnotation;
import com.mytests.spring.componentScanFilters.CustomIncludedType1;
import com.mytests.spring.componentScanFilters.CustomIncludedType2;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 23.04.2021.</p>
 * <p>Project: componentscan-filters</p>
 * *
 */
@CustomIncludedComponentAnnotation
public class MultipleIncludeFiltersMatch implements CustomIncludedType1 {
}
