package org.sephora.day2.exception.exercise;

public class ExceptionHandlingQuiz1 {
    public static void main(String[] args)
    {
        try
        {
            int b = 0;
            System.out.println(1);

            int i = 100 / b;

            System.out.println(2);
        }
        catch (Exception e) // only one argument is passed java.lang.Exception of type Throwable
        {
            System.out.println(3);
        }
        System.out.println(4);
    }


}
