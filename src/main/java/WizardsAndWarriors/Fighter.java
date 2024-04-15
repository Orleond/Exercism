package main.java.WizardsAndWarriors;

public class Fighter {
    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {
    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 10 : 6;
    }

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }
}

class Wizard extends Fighter {
    boolean vulnerable = true;

    void prepareSpell() {
        vulnerable = false;
    }

    @Override
    boolean isVulnerable() {
        return vulnerable;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        return vulnerable ? 3 : 12;
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
}