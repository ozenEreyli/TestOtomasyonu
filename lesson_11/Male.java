package org.rd.ta.sample.lesson_11;

public class Male extends Person{
    public Male(String _name, String _surname, int _dateOfBirth) {
        super(_name, _surname, _dateOfBirth);
    }

    public void CalculateRetirementAge()
    {
        int retirementAge = RetirementAge();
        if(retirementAge >= 65)
        {
            System.out.println(name + " " + surname + ": Emekli olmaya hak kazanmış.");
        } else if(retirementAge < 65)
        {
            int retirementYear = 65 - retirementAge;
            System.out.println(name + " " + surname + ": Emekli olmaya " + retirementYear + " yılı kalmış.");
        }
    }
}
