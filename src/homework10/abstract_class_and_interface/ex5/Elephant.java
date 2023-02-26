package homework10.abstract_class_and_interface.ex5;

public class Elephant extends Mammals{

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Elephants are trumpeting. ");
    }

    @Override
    public void eatingHabits() {
        super.eatingHabits();
        System.out.println("Elephants are eating vegetables. ");
    }
}
