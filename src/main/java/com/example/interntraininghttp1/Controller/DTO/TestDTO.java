package com.example.interntraininghttp1.Controller.DTO;

public class TestDTO {
    private int testId;
    private String name;
    private String address;
    private int testNum;

    public TestDTO() {
    }

    public TestDTO(int testId, String name, String address, int testNum) {
        this.testId = testId;
        this.name = name;
        this.address = address;
        this.testNum = testNum;
    }

    public int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTestNum() {
        return testNum;
    }

    public void setTestNum(int testNum) {
        this.testNum = testNum;
    }
}
