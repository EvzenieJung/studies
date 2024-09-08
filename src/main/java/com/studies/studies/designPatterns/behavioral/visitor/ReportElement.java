package com.studies.studies.designPatterns.behavioral.visitor;

public interface ReportElement {

    <R> R accept(ReportVisitor<R> visitor);
}
