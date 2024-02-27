package org.sephora.day2.innerclass;

class Outer {

    void outerMethod() {

        System.out.println("outer method");
        class Inner {
            private void innerMethod() {
                System.out.println("inner method");
            }
        }

        var inner = new Inner();
        inner.innerMethod();
    }

    public static void main(String[] args) {
        var outer = new Outer();
        outer.outerMethod();
    }
}
