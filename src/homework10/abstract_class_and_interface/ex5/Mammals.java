package homework10.abstract_class_and_interface.ex5;
//5.	Write a program suppose, it is required to build a project consisting of a number of classes, possibly using a
// large number of programmers. It is necessary to make sure that every class from which all other classes in the
// project will be inherited. Since any new classes in the project must inherit from the base class, programmers are
// not free to create a different interface. Therefore, it can be guaranteed that all the classes in the project will
// respond to the same debugging commands.    enable, disable
public class Mammals {

    public void makeNoise(){
        System.out.println("Make noise");
    };
    public void eatingHabits(){
        System.out.println("Eating something");
    };

}

