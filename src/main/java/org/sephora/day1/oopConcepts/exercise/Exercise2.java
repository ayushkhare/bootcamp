package org.sephora.day1.oopConcepts.exercise;
//class Exercise2 {
//    static class Base {
//        public void show() {
//            System.out.println("Base::show() called");
//        }
//    }
//    static class Derived extends Base {
//        public void show() {
//            System.out.println("Derived::show() called");
//        }
//    }
//    public static void main(String[] args) {
//        Base b = new Derived();
//        b.show();
//    }
//}

/**
 * Question 2
 */
class Building {
    Building() {
        System.out.println("Geek-Building");
    }

    Building(String name) {
        this();
        System.out.println("Geek-building: String Constructor" + name);
    }
}

class House extends Building {
    House() {
        System.out.println("Geek-House ");
    }

    House(String name) {
        super(name);
        System.out.println("Geek-house: String Constructor" + name);
    }

    public static void main(String[] args) {
        new House("Geek");
//        new Building("Geek");
    }
}
