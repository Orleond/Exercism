package main.java.Leap;

public class Leap {

    boolean isLeapYear(int year) {
        return (year % 100 != 0 || year % 400 != 0) && year % 4 == 0;
    }
}
