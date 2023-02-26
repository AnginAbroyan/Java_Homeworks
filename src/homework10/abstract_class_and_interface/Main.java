package homework10.abstract_class_and_interface;

import homework10.abstract_class_and_interface.ex5.Elephant;
import homework10.abstract_class_and_interface.ex5.Tiger;

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


//        //Ex 5.
        Elephant el = new Elephant();
        Tiger tig = new Tiger();
        el.makeNoise();
        el.eatingHabits();
        tig.eatingHabits();
        tig.makeNoise();



    }
}
