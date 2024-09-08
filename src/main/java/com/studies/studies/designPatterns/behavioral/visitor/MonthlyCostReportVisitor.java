package com.studies.studies.designPatterns.behavioral.visitor;

public class MonthlyCostReportVisitor implements ReportVisitor<Long> {

    @Override
    public Long visit(FixedPriceContract fixedPriceContract) {
        return fixedPriceContract.costPerPYear / 12;
    }

    @Override
    public Long visit(TimesAndMaterialsContract timesAndMaterialsContract) {
        return timesAndMaterialsContract.costPerHour * timesAndMaterialsContract.hours;
    }

    @Override
    public Long visit(SupportContract supportContract) {
        return supportContract.costPerMonth;
    }
}
