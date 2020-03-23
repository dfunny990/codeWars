package com.company;

import java.util.ArrayList;
import java.util.List;

public class Isograms {

    public static void Run() {
        List<String> testInput = GetTestInput();
        for (String isogram : testInput) {
            if (isIsogram(isogram)) {
                System.out.println(isogram +"--true");
            }else {
                System.out.println(isogram +"--false");
            }
        }
    }

    public static boolean  isIsogram(String str) {

        List<Character> mappedChars = new ArrayList<>();
        if (str.length() == 0) {
            return true;
        }
        for (int i = 0; i < str.length(); ++i) {
            Character current = Character.toLowerCase(str.charAt(i));
            if (mappedChars.contains(current)) {
                return false;
            }
            mappedChars.add(current);
        }
        return true;
    }

    private static List<String> GetTestInput() {
        List<String> result = new ArrayList<>();
        result.add("Dermatoglyphics");
        result.add("isogram");
        result.add("moose");
        result.add("isIsogram");
        result.add("aba");
        result.add("moOse");
        result.add("thumbscrewjapingly");
        result.add("");
        return result;
    }
}
