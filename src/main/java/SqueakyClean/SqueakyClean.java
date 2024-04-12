package main.java.SqueakyClean;

public class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder s = new StringBuilder(identifier);
        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ')
                s.replace(i, i+1, "_");
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-') {
                s.replace(i, i + 2, Character.toString(s.charAt(i + 1)).toUpperCase());
                i++;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0')
                s.replace(i, i + 1, "o");
            else if (s.charAt(i) == '1')
                s.replace(i, i + 1, "l");
            else if (s.charAt(i) == '3')
                s.replace(i, i + 1, "e");
            else if (s.charAt(i) == '4')
                s.replace(i, i + 1, "a");
            else if (s.charAt(i) == '7')
                s.replace(i, i + 1, "t");
        }
        for (int i = 0; i < s.length(); i++) {
            if (Character.toString(s.charAt(i)).matches("\\w"))
                s2.append(Character.toString(s.charAt(i)));
        }
        return s2.toString();
    }
}
