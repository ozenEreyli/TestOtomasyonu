package org.rd.ta.sample.lesson_15;

public class Product {
    private String name;
    private String description;
    private double price;

    public Product(String _name, String _description, double _price) {
        this.name = _name;
        this.description = _description;
        this.price = _price;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Price: " + price + " TL");
    }
    public static ProductBuilder builder() {
        return new ProductBuilder();
    }
    public static class ProductBuilder {
        private String name;
        private String description;
        private double price;


        public ProductBuilder name(String _name) {
            this.name = _name;
            return this;
        }

        public ProductBuilder description(String _description) {
            this.description = _description;
            return this;
        }

        public ProductBuilder price(double _price) {
            this.price = _price;
            return this;
        }
       public Product build() {
            return new Product(this.name, this.description, this.price);
        }
    }
}


