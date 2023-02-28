package homework10.abstract_class_and_interface;

import homework10.abstract_class_and_interface.ex5.Elephant;
import homework10.abstract_class_and_interface.ex5.Mammals;
import homework10.abstract_class_and_interface.ex5.Tiger;
import homework10.abstract_class_and_interface.ex6.MBTAVehicles;
import homework10.abstract_class_and_interface.ex6.RightOfWay;
import homework10.abstract_class_and_interface.ex6.TypesVehicles;
import homework10.abstract_class_and_interface.ex7.A;
import homework10.abstract_class_and_interface.ex7.B;
import homework10.abstract_class_and_interface.ex7.Marks;
import homework10.abstract_class_and_interface.ex8.SubClass;
import homework10.abstract_class_and_interface.ex9.Cats;
import homework10.abstract_class_and_interface.ex9.Dogs;


public class Main {
    public static void main(String[] args) {


        //EX 1.
//        ChildOne first = new ChildOne();
//        ChildTwo second = new ChildTwo();
//        first.message();
//        second.message();


        //EX 2.
//        Circle aCircle = new Circle();
//        Triangle aTriangle = new Triangle();
//        Square aSquare = new Square();
//        aCircle.draw();
//        aCircle.erase();
//        aTriangle.draw();
//        aTriangle.erase();
//        aSquare.draw();
//        aSquare.erase();


        //EX 3.
//        MyClass obj = new MyClass();
//        obj.methOne();
//        obj.methTwo();


        //Ex 4.
//        ToTestInt obj = new ToTestInt();
//        System.out.println(obj.getObj().square(5));


        //Ex 5.


//        Elephant el = new Elephant();
//        Tiger tig = new Tiger();
//
//        el.makeNoise();
//        tig.makeNoise();
//
//        el.notMakingNoise();
//        tig.notMakingNoise();
//        System.out.println("Pause to see the result. ");
//        el.makeNoise();
//        tig.makeNoise();





        //Ex 6.
//        MBTAVehicles vehicles = new MBTAVehicles(TypesVehicles.BUS, RightOfWay.MIXED);
//        System.out.println(vehicles.rightOfWay + " right of ways for " + vehicles.typesVehicles);



        //EX. 7
//
//        A marksA = new A(100, 95, 70);
//        B marksB = new B(70, 70, 70, 70);
//        System.out.println(marksA.getPercentage());
//        System.out.println(marksB.getPercentage());


        //EX. 8
//        SubClass obj = new SubClass();
//        obj.aMethod();
//        obj.nonAbstractMethod();



        //EX. 9
        Cats aCat = new Cats();
        Dogs aDog = new Dogs();
        aCat.cats();
        aDog.dogs();
    }
}
