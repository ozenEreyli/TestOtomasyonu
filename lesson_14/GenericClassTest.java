package org.rd.ta.sample.lesson_14;

public class GenericClassTest {

    public static void main(String[] args) {
        GenericClass<Integer> intObject = new GenericClass<>(10);
        intObject.printGenericField();

        GenericClass<String> stringObject = new GenericClass<>("Merhaba Dünya!");
        stringObject.printGenericField();
    }
}
