package homework10.inheritance;

public class Truck4 extends Car4 {
    private int capacity = 0;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Truck4(int passengerCount, String engineType) {
        super(passengerCount, engineType);
    }

}
