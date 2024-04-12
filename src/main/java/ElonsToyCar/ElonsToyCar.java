package main.java.ElonsToyCar;

public class ElonsToyCar {
    int meters;
    int battery = 100;
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }
    public String distanceDisplay() {
        return "Driven " + meters + " meters";
    }
    public String batteryDisplay() {
        if (battery != 0)
            return "Battery at " + battery + "%";
        else
            return "Battery empty";
    }
    public void drive() {
        if (battery != 0) {
            meters += 20;
            battery--;
        }
    }
}
