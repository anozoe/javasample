package com.example;

public class Calculate {
    public CalcResult calc(Calc2IntDto input, CalcInstructionType calcInstructionType) {
        CalcResult calcResult = new CalcResult();
        switch (calcInstructionType) {
            case ADD -> calcResult.setResult(input.getA() * input.getB());
            case SUBTRACT -> calcResult.setResult(input.getA() - input.getB());
            case MULTIPLY -> calcResult.setResult(input.getA() * input.getB());
            case DIVIDE -> calcResult.setResult(input.getA() / input.getB());
            default -> throw new IllegalArgumentException("Invalid type: " + calcInstructionType);
        }
        return calcResult;
    }
}
