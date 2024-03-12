package org.rd.ta.sample.lesson_12;

public class DividerTest {

    public static void main(String[] args){

        Divider divider1 = new Divider(10,2);
        Divider divider2 = new Divider(7,3);
        Divider divider3 = new Divider(5,0);

        divider1.Divide();
        divider2.Divide();
        divider3.Divide();
    }

}
