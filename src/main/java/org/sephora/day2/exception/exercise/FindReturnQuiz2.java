package org.sephora.day2.exception.exercise;

public class FindReturnQuiz2 {
    static int anyMethod()
    {
//        int i = 0;
        try
        {
            return 10;
//            int r =0;
        }
        catch (Exception e)
        {
        return 20;
        }
//        finally
//        {
//
//        }
//        return 30;
//        System.out.println(i);
    }

    public static void main(String[] args)
    {
        System.out.println(anyMethod());
    }
}
