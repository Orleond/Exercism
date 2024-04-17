package main.java.GottaSnatchEmAll;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        return  !myCollection.containsAll(theirCollection) && !myCollection.isEmpty();
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> s = new HashSet<>();
        for (Set<String> collection : collections) {
            s.addAll(collection);
        }
        Set<String> s2 = new HashSet<>(s);
        for (String string : s) {
            for (int j = 0; j < collections.size(); j++) {
                if (!collections.get(j).contains(string))
                    s2.remove(string);
            }
        }
        return s2;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> collection = new HashSet<>();
        for (Set<String> strings : collections) {
            collection.addAll(strings);
        }
        return collection;
    }
}
