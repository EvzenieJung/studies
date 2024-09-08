package com.studies.studies.designPatterns.behavioral.visitor;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        FixedPriceContract fixedPriceContract = new FixedPriceContract(10000);
        TimesAndMaterialsContract timesAndMaterialsContract = new TimesAndMaterialsContract(100, 10);
        SupportContract supportContract = new SupportContract(500);

        List<ReportElement> projects = List.of(fixedPriceContract, timesAndMaterialsContract, supportContract);
        MonthlyCostReportVisitor monthlyCostReportVisitor = new MonthlyCostReportVisitor();
        YearlyCostReportVisitor yearlyCostReportVisitor = new YearlyCostReportVisitor();

        long monthlyCost = 0;
        long yearlyCost = 0;
        for (ReportElement project : projects) {
            monthlyCost += project.accept(monthlyCostReportVisitor);
            yearlyCost += project.accept(yearlyCostReportVisitor);
        }

        System.out.println("Monthly cost is " + monthlyCost);
        System.out.println("Yearly cost is " + yearlyCost);
    }
}
