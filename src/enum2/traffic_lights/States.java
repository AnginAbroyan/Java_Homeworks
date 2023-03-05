package enum2.traffic_lights;

public enum States {
    GREEN(10),
    YELLOW(2),
    RED(5);

    public int sec;

    States(int sec) {
        this.sec = sec;
    }
}


