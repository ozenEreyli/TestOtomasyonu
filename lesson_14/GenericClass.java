package org.rd.ta.sample.lesson_14;

public class GenericClass<T> {
    private T genericField;

    public GenericClass(T genericField) {
        this.genericField = genericField;
    }
    public void printGenericField() {
        System.out.println("Generic Field Value: " + genericField);
    }
    public T getGenericField() {
        return genericField;
    }

    public void setGenericField(T genericField) {
        this.genericField = genericField;
    }

}

