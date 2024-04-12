package main.java.Lasagna;

public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }
    public int remainingMinutesInOven(int time) {
        return expectedMinutesInOven() - time;
    }
    public int preparationTimeInMinutes(int layer) {
        return layer * 2;
    }

    public int totalTimeInMinutes(int layer, int time) {
        return preparationTimeInMinutes(layer) + time;
    }
}
