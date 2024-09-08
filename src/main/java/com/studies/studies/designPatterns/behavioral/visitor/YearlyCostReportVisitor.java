package com.studies.studies.designPatterns.behavioral.visitor;

public class YearlyCostReportVisitor implements ReportVisitor<Long> {

    @Override
    public Long visit(FixedPriceContract fixedPriceContract) {
        return fixedPriceContract.costPerPYear;
    }

    @Override
    public Long visit(TimesAndMaterialsContract timesAndMaterialsContract) {
        return timesAndMaterialsContract.costPerHour * timesAndMaterialsContract.hours * 12;
    }

    @Override
    public Long visit(SupportContract supportContract) {
        return supportContract.costPerMonth * 12;
    }
}
