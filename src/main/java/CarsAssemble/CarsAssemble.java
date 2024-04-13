package main.java.CarsAssemble;

public class CarsAssemble {
    public static final int PRODUCED_CARS = 221;

    public double productionRatePerHour(int speed) {
        if (speed > 0 && speed < 5) return speed * PRODUCED_CARS;
        if (speed > 4 && speed < 9) return speed * PRODUCED_CARS * 0.9;
        if (speed == 9) return speed * PRODUCED_CARS * 0.8;
        if (speed == 10) return speed * PRODUCED_CARS * 0.77;
        return 0;
    }

    public int workingItemsPerMinute(int speed) {
        return (int)productionRatePerHour(speed) / 60;
    }
}
