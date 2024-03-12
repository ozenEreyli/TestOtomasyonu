package org.rd.ta.sample.lesson_11;

public class PersonTest {
    public static void main(String[] args) {

        Female person1 = new Female("Özen", "Ereyli", 1985);

        person1.CalculateRetirementAge();

        Male person2 = new Male("Haktan", "Ereyli", 1958);

        person2.CalculateRetirementAge();
    }
}
