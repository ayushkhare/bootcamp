package org.sephora.day2.innerclass;

/**
 * When to use static nested class?
 * If the nested class does not access any of the variables of the enclosing class, it can be made static.
 */
class OuterClassWithStatic {
    private int x = 10;

    // static nested class
    static class InnerClassStatic {
        private int z = 30;

        // cannot do this, since x is not static
//        void changeValue(int value) {
//            x = value;
//        }

        // The whole of using static inner class is
        // If the nested class does not access any of the variables of the enclosing class,
        // it can be made static.
    }

    public static void main(String[] args) {
        var outerClass = new OuterClassWithStatic();

        // just like static attributes and methods,
        // a static inner class does not have access to members of the outer class.
        var innerClassStatic = new OuterClassWithStatic.InnerClassStatic();
        System.out.println(outerClass.x + " " + new InnerClassStatic().z);
    }
}
