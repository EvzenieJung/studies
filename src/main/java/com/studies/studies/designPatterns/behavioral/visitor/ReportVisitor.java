package com.studies.studies.designPatterns.behavioral.visitor;

public interface ReportVisitor<R> {

    public R visit(FixedPriceContract  fixedPriceContract);
    public R visit(TimesAndMaterialsContract timesAndMaterialsContract);
    public R visit(SupportContract supportContract);
}
