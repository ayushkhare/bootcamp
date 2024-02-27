package org.sephora.day2.exception.exercise;

public class JavaExceptionHandlingQuiz3
{
    public static void main(String[] args)
    {
        String[] s = {"abc", "123", null, "xyz"};

        for (int i = 0; i < 6; i++)
        {
            try
            {
                int a = s[i].length() + Integer.parseInt(s[i]);
            }
            catch (NumberFormatException e)
            {
                System.out.println(1);
            }
            catch (NullPointerException e)
            {
                System.out.println(2);
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println(3);
            }
        }
    }
}