package main.java.NeedForSpeed;

public class NeedForSpeed {
    int speed;
    int batteryDrain;
    int distance;
    int battery;
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.distance = 0;
        this.battery = 100;
    }
    public boolean batteryDrained() {
        return battery <= 0;
    }
    public int distanceDriven() {
        return distance;
    }
    public void drive() {
        if (battery > 0) {
            this.distance += this.speed;
            battery -= batteryDrain;
        }
    }
    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}
class RaceTrack {
    int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }
    public boolean tryFinishTrack(NeedForSpeed car) {
        while (car.distanceDriven() < distance) {
            if (car.batteryDrained())
                return false;
            car.drive();
        }
        return true;
    }
}
