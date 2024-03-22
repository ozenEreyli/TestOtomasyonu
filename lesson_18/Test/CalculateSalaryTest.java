package org.rd.lessons.lesson18;

import org.junit.Test;
import org.rd.ta.sample.lesson_18.CalculateSalary;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateSalaryTest {

    private final CalculateSalary calculateSalary = new CalculateSalary();

    @Test
    public void UnitTest(){
      assertEquals(9800, calculateSalary.Calculate(29));
    }
}
