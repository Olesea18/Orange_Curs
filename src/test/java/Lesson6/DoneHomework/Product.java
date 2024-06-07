package Lesson6.DoneHomework;

public class Product {
    private String name;
    // Constructor
    public Product(String name) {
        this.name = name;
    }
    // Getter
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Product{name='" + name + "'}";
    }
}

