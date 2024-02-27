package org.sephora.day1.oopConcepts.exercise;

/**
 * <a href="https://www.geeksforgeeks.org/output-java-program-set-20-inheritance/">...</a>
 */
public class Exercise3 {

    static class Alpha {
        static String s = " ";

        protected Alpha() {
            s += "alpha ";
        }
    }

    static class SubAlpha extends Alpha {
        private SubAlpha() {
            s += "sub ";
        }
    }

    static class SubSubAlpha extends Alpha {
        public SubSubAlpha() {
            s += "subsub ";
        }
    }

    public static void main(String[] args) {
        var subSubAlpha = new SubSubAlpha();
        System.out.println(Alpha.s);
    }
}
