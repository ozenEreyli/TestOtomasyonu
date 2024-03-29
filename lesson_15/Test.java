package org.rd.ta.sample.lesson_15;

public class Test {


    public static void main(String[] args) {
            // Singleton Kullanımı
            Singleton singleton = Singleton.getInstance();
            singleton.showMessage();

            // Builder Kullanımı

            Product.builder().name("Kalem")
                    .description("Kırtasiye")
                    .price(20)
                    .build().displayInfo();
        }
}

