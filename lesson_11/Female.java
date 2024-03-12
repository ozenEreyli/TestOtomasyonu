package org.rd.ta.sample.lesson_11;

public class Female extends Person{
    public Female(String _name, String _surname, int _dateOfBirth) {
        super(_name, _surname, _dateOfBirth);
    }

    public void CalculateRetirementAge()
    {
        int retirementAge = RetirementAge();
        if(retirementAge >= 60)
        {
            System.out.println(name + " " + surname + ": Emekli olmaya hak kazanmış.");
        } else if(retirementAge < 60)
        {
            int retirementYear = 60 - retirementAge;
            System.out.println(name + " " + surname + ": Emekli olmaya " + retirementYear + " yılı kalmış.");
        }
    }
}
