package org.sephora.day1.variables;

public class InstanceVariable {

    public String name; // initialization not necessary for instance variables, for String it is null, for int it is 0

    public InstanceVariable(String name) {
        // How to differentiate between member and local variable with same name?
        // Using this keyword
        this.name = name;
    }

    public static void main(String[] args) {
        var instanceA = new InstanceVariable("Instance Variable A"); // create instance of InstanceVariable class
        System.out.println(instanceA.name); // instance variables can only be accessed by creating objects

        var instanceB = new InstanceVariable("Instance Variable B");
        System.out.println(instanceB.name);
    }
}
