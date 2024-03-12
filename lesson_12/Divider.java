package org.rd.ta.sample.lesson_12;

public class Divider {
    int dividend;
    int divisor;

    public Divider(int _dividend, int _divisor){
        this.dividend =_dividend;
        this.divisor = _divisor;
    }

    public void Divide()
    {
        double result = 0;
        try
        {
            result = this.dividend/this.divisor;
        }catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }finally {
            System.out.println("Result of Division: " + result);
        }
    }





}
