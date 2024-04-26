package main.java.TwoFer;

public class Twofer {
    public String twofer(String name) {
        return "One for " + (name == null || name.trim().isEmpty() ? "you" : name) +", one for me.";
    }
}
