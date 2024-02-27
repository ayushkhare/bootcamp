package org.sephora.day2.innerclass;

interface Hello {
    void sayHello();

    void sayHelloInFrench();
}

public class AnonymousClassExample {

    // anonymous function
    static Hello hello = new Hello() {
        @Override
        public void sayHello() {
            System.out.println("Hello");
        }

        @Override
        public void sayHelloInFrench() {
            System.out.println("Bonjour");
        }
    };

    /**
     * The anonymous class expression consists of the following:
     * 1.The new operator
     *
     * 2.The name of an interface to implement.
     * In this example, the anonymous class is implementing the interface Hello.
     *
     *
     * 3. A body, which is a class declaration body.
     *
     */

    public static void main(String[] args) {
        hello.sayHello();
        hello.sayHelloInFrench();
    }
}
