package main.java.BirdWatcher;

public class BirdWatcher {
    private final int[] birdsPerDay;
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }
    public int[] getLastWeek() {
        return new int[] {0, 2, 5, 3, 7, 8, 4};
    }
    public int getToday() {
        return birdsPerDay[birdsPerDay.length-1];
    }
    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1] = getToday() + 1;
    }
    public boolean hasDayWithoutBirds() {
        for (int birdsCount: birdsPerDay)
            if (birdsCount == 0) return true;
        return false;
    }
    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        if (numberOfDays > 7) numberOfDays = 7;
        for (int i = 0; i < numberOfDays; i++)
            sum += birdsPerDay[i];
        return sum;
    }
    public int getBusyDays() {
        int count = 0;
        for (int birdsCount: birdsPerDay)
            if (birdsCount >= 5)
                count++;
        return count;
    }
}
