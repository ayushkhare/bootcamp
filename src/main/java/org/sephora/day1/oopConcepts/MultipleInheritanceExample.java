package org.sephora.day1.oopConcepts;

/**
 * Why are interfaces important?
 * <a href="https://methodpoet.com/why-are-interfaces-useful/#:~:text=Interfaces%20are%20useful%20in%20object,behavior%20specified%20by%20that%20interface">...</a>.
 */

public class MultipleInheritanceExample implements Interface1, Interface2 {


    public static void main(String[] args) {
        MultipleInheritanceExample example = new MultipleInheritanceExample();
        example.display();
        example.print();
    }

    @Override
    public void display() {
        /// implementation
    }

    @Override
    public void print() {

    }
}

class Another  implements Interface1, Interface2 {

    @Override
    public void display() {
        // another implementation
    }

    @Override
    public void print() {

    }
}

interface Interface1 {
    void display();
}

interface Interface2 {
    void print();
}
