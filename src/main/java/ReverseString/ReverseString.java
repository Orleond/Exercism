package main.java.ReverseString;

import java.io.BufferedReader;

public class ReverseString {

    String reverse(String inputString) {
//        StringBuilder stringBuilder = new StringBuilder(inputString);
//        return stringBuilder.reverse().toString();
        StringBuilder stringBuilder = new StringBuilder(inputString);
        String temp;
        String temp2;
        for (int i = 0, j = stringBuilder.length() - 1; i < stringBuilder.length() / 2; i++, j--) {
                temp = String.valueOf(stringBuilder.charAt(i));
                temp2 = String.valueOf(stringBuilder.charAt(j));
                stringBuilder.replace(i, i + 1, temp2);
                stringBuilder.replace(j, j + 1, temp);
        }
        return stringBuilder.toString();
    }

}
