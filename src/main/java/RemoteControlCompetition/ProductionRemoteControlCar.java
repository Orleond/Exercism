package main.java.RemoteControlCompetition;

class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int distance;
    private int numberOfVictories;

    public void drive() {
        distance += 10;
    }
    public int getDistanceTravelled() {
        return distance;
    }
    public int getNumberOfVictories() {
        return numberOfVictories;
    }
    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }
    @Override
    public int compareTo(ProductionRemoteControlCar o) {
        return o.numberOfVictories - this.getNumberOfVictories();
    }
}
