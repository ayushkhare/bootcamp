package org.sephora.day2.innerclass;

/**
 * The purpose of nested classes is to group classes that belong together,
 * which makes your code more readable and maintainable.
 * Encapsulation: Inner classes can access private variables and methods of the outer class.
 * This helps to achieve encapsulation and improves code readability.
 *
 * Types of inner classes:
 * 1. Nested inner class
 * 2. Static inner class
 * 3. Method Local inner class
 * 4. Anonymous Inner class
 */
class OuterClass {

    private int x = 10;

    // inner classes can access variables of outer class, even "private" ones
    class InnerClass {
        private int y = 20;

        void changeValue(int value) {
            x = value;
        }
    }

    public static void main(String[] args) {
        var outerClass = new OuterClass();
        var innerClass = outerClass.new InnerClass();
        System.out.println(outerClass.x + " " + innerClass.y);
        innerClass.changeValue(30);
        System.out.println(outerClass.x + " " + innerClass.y);

    }
}
