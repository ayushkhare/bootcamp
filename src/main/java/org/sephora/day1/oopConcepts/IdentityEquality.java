package org.sephora.day1.oopConcepts;

public class IdentityEquality {

    public static void main(String[] args) {
        Car car1 = new Car("blue"); // object 1 in memory
        Car car2 = car1; // new reference for object 1 (not placed in memory)
        Car car3 = new Car("blue"); // object 2 in memory

        // Identity check with "=="
        System.out.println(car1 == car1); // true
        System.out.println(car1 == car2); // true
        System.out.println(car1 == car3); // false

        // Equality check with ".equals()"
        System.out.println(car1.equals(car1)); // true
        System.out.println(car1.equals(car2)); // true
        System.out.println(car1.equals(car3)); // ? // refer to equals method implementation
    }

    record Car(String color) {
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            Car other = (Car) obj;
            return this.color.equals(other.color);
        }
    }
}
