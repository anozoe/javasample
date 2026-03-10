package com.example;

public enum CalcInstructionType {
    ADD("加算"),
    SUBTRACT("減算"),
    MULTIPLY("乗算"),
    DIVIDE("除算");

    private final String name;

    private CalcInstructionType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
