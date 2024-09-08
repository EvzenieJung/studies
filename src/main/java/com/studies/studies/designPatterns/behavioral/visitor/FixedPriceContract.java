package com.studies.studies.designPatterns.behavioral.visitor;

public class FixedPriceContract implements ReportElement {
    long costPerPYear;

    public FixedPriceContract(long costPerPYear) {
        this.costPerPYear = costPerPYear;
    }

    @Override
    public <R> R accept(ReportVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
