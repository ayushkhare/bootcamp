package org.sephora.day1.oopConcepts;

// https://www.geeksforgeeks.org/four-main-object-oriented-programming-concepts-of-java/?ref=lbp

import java.util.Random;

/**
 * Compile vs Runtime Polymorphism
 */
public class PolymorphismExample {

}

/**
 * Runtime using method overriding
 */
class DeliveryBoy {

    public void deliver() {
        System.out.println("Delivering Item");
    }

    public static void main(String[] args) {
        DeliveryBoy deliveryBoy = getDeliveryBoy(); // Postman() or FoodDeliveryBoy()
        deliveryBoy.deliver();
    }

    private static DeliveryBoy getDeliveryBoy() {
        Random random = new Random(); // class used to generate random numbers
        int number = random.nextInt(5); // returns random number between 0(inclusive) & 5(exclusive)
        return number % 2 == 0 ? new Postman() : new FoodDeliveryBoy();
    }
}

class Postman extends DeliveryBoy {

    @Override
    public void deliver() {
        System.out.println("Delivering Letters");
    }
}

class FoodDeliveryBoy extends DeliveryBoy {
    @Override
    public void deliver() {
        System.out.println("Delivering Food");
    }
}

/**
 * Compile time using method overloading
 */
class Bus {
    public void speed() {
        // some implementation
    }

    public void speed(String accelerator) {
        // some implementation
    }

    public void speed(int accelerator) {
        // some implementation
    }

    public int speed(String accelerator, int speedUp) {
        return speedUp + 1;
    }
}
