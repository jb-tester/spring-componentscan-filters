package com.mytests.spring.componentScanFilters.scannedComponents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * *
 * normal component included by default;
 * components included by filters are injected
 * *
 */
@Component
public class JustComponent {


    @Autowired(required = false)
    ExcludedByType excludedByType; // should find no candidates - ok
    @Autowired(required = false)
    private ExcludedByRegexFOO excludedByRegex; // should find no candidates


    private final CustomIncludedType1Impl includedType1;
    private final CustomIncludedType2Impl includedType2;
    private CustomCompoIncludedByAnno customCompoIncludedByAnno;
    private final MultipleIncludeFiltersMatch multipleIncludeFiltersMatch;
    private final IncludedByRegexBAR includedByRegex;

    public JustComponent(CustomIncludedType1Impl includedType1,
                         CustomCompoIncludedByAnno customCompoIncludedByAnno,
                         CustomIncludedType2Impl includedType2,
                         MultipleIncludeFiltersMatch multipleIncludeFiltersMatch,
                         IncludedByRegexBAR includedByRegex)   // autowiring error is shown
    {
        this.includedType1 = includedType1;
        this.customCompoIncludedByAnno = customCompoIncludedByAnno;
        this.includedType2 = includedType2;
        this.multipleIncludeFiltersMatch = multipleIncludeFiltersMatch;
        this.includedByRegex = includedByRegex;
    }
}
