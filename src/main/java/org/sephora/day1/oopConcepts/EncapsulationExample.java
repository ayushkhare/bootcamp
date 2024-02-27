package org.sephora.day1.oopConcepts;

// https://www.geeksforgeeks.org/four-main-object-oriented-programming-concepts-of-java/?ref=lbp
public class EncapsulationExample {

    public static void main(String[] args) {
        Brand brand = new Brand();
        brand.setName("Sephora");
        System.out.println("Brand name = " + brand.getName());
    }
}

// Class which is fully encapsulated
class Brand {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
