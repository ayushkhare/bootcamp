package org.sephora.day1.oopConcepts;

/**
 * To achieve total abstraction
 * Loose coupling
 * Multiple inheritance
 */
public class InterfaceExample implements Hello1, Hello2 { // to provide the implementation for interface use "implements" keyword
    @Override
    public void sayHello() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        InterfaceExample example = new InterfaceExample();
        example.sayHello();
        var another = new Another();
    }

    static class Another {

    }
}

//class InterfaceChild extends InterfaceExample {
//
////    @Override
////    public void sayHello() {
////        System.out.println("Hello child");
////    }
//
//    public static void main(String[] args) {
//        var child = new InterfaceChild();
//        child.sayHello();
//    }
//}

interface Hello1 {
    default void sayHello() {
        System.out.println("interface hello");
    }

//    void sayHello();
}

interface Hello2 {
    default void sayHello() {
        System.out.println("interface hello");
    }
}
