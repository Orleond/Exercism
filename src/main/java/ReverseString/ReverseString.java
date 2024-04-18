package main.java.ReverseString;

public class ReverseString {

    String reverse(String inputString) {
        StringBuilder stringBuilder = new StringBuilder(inputString);
        return stringBuilder.reverse().toString();
    }

}
