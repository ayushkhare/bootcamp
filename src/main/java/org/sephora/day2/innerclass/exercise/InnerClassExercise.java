package org.sephora.day2.innerclass.exercise;

class ABC {

    class XYZ {
        int i = 111;
    }

    static class DEF {
        int j = 222;
    }

    public static void main(String[] args) {
        // Question 1: how do you access field i of "XYZ"?
        /**
         * Options:
         *
         * 1.new XYZ().i
         * 2.new ABC().new XYZ().i
         * 3.new ABC().i
         */
//        var option1 = new XYZ().i;
//        var option2 = new ABC().new XYZ().i;
//        var option3 = new ABC().i;

        // Question 2: how do you access field j of "DEF"?
        /**
         * Options:
         *
         * 1.new DEF().j;
         * 2.new ABC().new DEF().j;
         * 3.new ABC().j;
         */
//        var option1 = new DEF().j;
//        var option2 = new ABC().new DEF().j;
//        var option3 = new ABC().j;
    }
}
