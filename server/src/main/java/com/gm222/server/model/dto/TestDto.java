package com.gm222.server.model.dto;

public class TestDto <T> {
    private String testString;
    private T test;
    public TestDto(String testString, T test) {
        this.testString = testString;
        this.test = test;
    }
}
