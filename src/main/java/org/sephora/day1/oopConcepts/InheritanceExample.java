package org.sephora.day1.oopConcepts;

public class InheritanceExample {

    public static void main(String[] args) {
        Suzuki suzuki = new Suzuki("new", 2,true);
        System.out.println(suzuki.toString());
    }
}

class Bike {
    public String wheelStatus;
    public int noOfWheels;

    public Bike(String wheelStatus, int noOfWheels) {
        this.wheelStatus = wheelStatus;
        this.noOfWheels = noOfWheels;
    }

    public void applyBrake() {
        wheelStatus = "Stop";
        System.out.println("Stop the bike using break");
    }

    public String toString() {
        return ("No of wheels in bike " + noOfWheels + "\n" + "status of the wheels " + wheelStatus);
    }
}

class Suzuki extends Bike {

    public Boolean alloyWheel;

    public Suzuki(String wheelStatus, int noOfWheels, Boolean alloyWheel) {
        super(wheelStatus, noOfWheels);
        this.alloyWheel = alloyWheel;
    }

    public void setAlloyWheel(Boolean alloyWheel) {
        this.alloyWheel = alloyWheel;
    }

    public String toString() {
        return (super.toString() + "\nBike alloy wheel " + alloyWheel);
    }
}
