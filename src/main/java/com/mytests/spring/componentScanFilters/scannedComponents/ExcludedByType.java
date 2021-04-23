package com.mytests.spring.componentScanFilters.scannedComponents;

import com.mytests.spring.componentScanFilters.CustomIncludedType1;
import com.mytests.spring.componentScanFilters.CustomIncludedType2;
import com.mytests.spring.componentScanFilters.ExcludedService;

/**
 * *
 * matches both include (by type) filters and
 * exclude (by type) filter and thus excluded
 * *
 */
public class ExcludedByType implements CustomIncludedType1, CustomIncludedType2, ExcludedService {
    
}
