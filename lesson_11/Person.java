package org.rd.ta.sample.lesson_11;
import java.util.Calendar;
public class Person {
    String name;
    String surname;
    int dateOfBirth;
    public Person( String _name, String _surname, int _dateOfBirth)
    {
        this.name=_name;
        this.surname=_surname;
        this.dateOfBirth=_dateOfBirth;
    }

    public int RetirementAge(){
        Calendar nowDate = Calendar.getInstance();
        //System.out.println(nowDate.get(Calendar.YEAR));
        return nowDate.get(Calendar.YEAR) - this.dateOfBirth;
    }



}
