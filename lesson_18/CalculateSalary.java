package org.rd.ta.sample.lesson_18;


public class CalculateSalary {
    private static final double dailyRate=200;
    private static final double extraBonus=1000;

    public double Calculate(int daysWorked){
        double salary = daysWorked * dailyRate;

        if (daysWorked > 25)
        {
            int extraDays = daysWorked-25;
            double _extraBonus = extraDays*extraBonus;
            salary += _extraBonus;
        }

        return  salary;
    }

}
