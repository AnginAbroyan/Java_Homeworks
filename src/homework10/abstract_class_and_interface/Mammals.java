package homework10.abstract_class_and_interface;
//5.	Write a program suppose, it is required to build a project consisting of a number of classes, possibly using a
// large number of programmers. It is necessary to make sure that every class from which all other classes in the
// project will be inherited. Since any new classes in the project must inherit from the base class, programmers are
// not free to create a different interface. Therefore, it can be guaranteed that all the classes in the project will
// respond to the same debugging commands.
public abstract class Mammals {

    public abstract void makeNoise();
    public abstract void eatingHabits();

}

class Elephant extends Mammals{

    @Override
    public void makeNoise() {
        System.out.println("Elephants are trumpeting. ");
    }

    @Override
    public void eatingHabits() {
        System.out.println("Elephants are eating vegetables. ");
    }
}

class Tiger extends Mammals{

    @Override
    public void makeNoise() {
        System.out.println("Tigers are growling. ");
    }

    @Override
    public void eatingHabits() {
        System.out.println("Elephants are predators. ");
    }
}
