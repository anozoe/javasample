package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        App app = new App();
        int result = app.calc2int(2, 3, CalcInstructionType.ADD);
        System.out.println(result);
    }

    public int calc2int(int a, int b, CalcInstructionType type) {
        Calculate calculate = new Calculate();
        CalcResult output = calculate.calc(new Calc2IntDto(a, b), type);
        return output.getResult();
    }
}
