package homework10.inheritance;

import homework10.inheritance.ex4.Truck;

public class Main {

    public static void main(String[] args) {

        //EX1
//        Parent1 obj = new Child1();
//        obj.showMessage();


        //EX2
//        SubClass2 object1 = new SubClass2();

        //EX3
//        F obj1 = new F();
//        obj1.DisplayA();
//        obj1.DisplayB();
//        obj1.DisplayC();
//        obj1.DisplayD();
//        obj1.DisplayE();
//        obj1.DisplayF();


        //EX4
        Truck obj2 = new Truck(3, "ESS");
        System.out.println("Passenger count: " + obj2.getPassengerCount() + "\nEngine Type: " + obj2.getEngineType() +
                "\nCapacity: " + obj2.getCapacity());


    }
}
