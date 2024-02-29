package org.sephora.day2.innerclass.exercise;

abstract class A
{
    {
        System.out.println(1);
    }

    static
    {
        System.out.println(2);
    }
}
public class MainClass
{
    public static void main(String[] args)
    {
        // when i run this method what will be printed
        // options
            // 1
            // 1 2
            // 2 1
            // 2
        A a = new A() { };
    }
}