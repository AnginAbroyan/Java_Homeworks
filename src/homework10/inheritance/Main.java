package homework10.inheritance;

import homework10.inheritance.ex1.Child;
import homework10.inheritance.ex1.Parent;
import homework10.inheritance.ex2.SubClass;
import homework10.inheritance.ex4.Truck;

public class Main {

    public static void main(String[] args) {

        //EX1
        Parent obj = new Child();
        obj.showMessage();


        //EX2
        SubClass object1 = new SubClass();




        //EX4
        Truck obj2 = new Truck(3, "ESS");
        System.out.println("Passenger count: " + obj2.getPassengerCount() + "\nEngine Type: " + obj2.getEngineType() +
                "\nCapacity: " + obj2.getCapacity());


    }
}
