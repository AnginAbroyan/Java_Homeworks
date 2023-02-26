package homework10.abstract_class_and_interface.ex5;

public class Tiger extends Mammals{

    @Override
    public void makeNoise() {

        super.makeNoise();
        System.out.println("Tigers are growling. ");
    }

    @Override
    public void eatingHabits() {
        super.eatingHabits();
        System.out.println("Elephants are predators. ");
    }
}
