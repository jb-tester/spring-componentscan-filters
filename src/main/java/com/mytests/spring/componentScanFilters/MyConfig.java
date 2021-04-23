package com.mytests.spring.componentScanFilters;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "com.mytests.spring.componentScanFilters.scannedComponents",
        includeFilters = {
                @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = CustomIncludedComponentAnnotation.class),
                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {CustomIncludedType1.class,
                        CustomIncludedType2.class}),
                @ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*[BAR]")
        }, 
        excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = ExcludedService.class),
        @ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*[FO]")
})
public class MyConfig {


}