package com.studies.studies.designPatterns.behavioral.visitor;

public class TimesAndMaterialsContract implements ReportElement {

    long costPerHour;
    long hours;

    public TimesAndMaterialsContract(long costPerHour, long hours) {
        this.costPerHour = costPerHour;
        this.hours = hours;
    }

    @Override
    public <R> R accept(ReportVisitor<R> visitor) {
        return visitor.visit(this);
    }
}
