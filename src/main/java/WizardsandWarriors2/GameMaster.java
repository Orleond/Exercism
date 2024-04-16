package main.java.WizardsandWarriors2;

public class GameMaster {

    public String describe(Character character) {
        return String.format("You're a level %s %s with %s hit points.", character.getLevel(),
                character.getCharacterClass(), character.getHitPoints());
    }

    public String describe(Destination destination) {
        return String.format("You've arrived at %s, which has %s inhabitants.", destination.getName(),
                destination.getInhabitants());
    }

    public String describe(TravelMethod travelMethod) {
        String method;
        if (travelMethod.name().equals("HORSEBACK"))
            method = "on horseback";
        else
            method = "by walking";
        return String.format("You're traveling to your destination %s.", method);
    }

    public String describe(Character character, Destination destination, TravelMethod travelMethod) {
        return describe(character) + " " + describe(travelMethod) + " " + describe(destination);
    }

    public String describe(Character character, Destination destination) {
        return describe(character) + " You're traveling to your destination by walking. " + describe(destination);
    }
}
