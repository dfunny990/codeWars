package com.company;

public class Vowels {

    public static void Run() {
        String input = getInput();
        getCount(input);
    }

    private static String getInput() {
        return "Abracadabra";
    }

    public static int getCount(String str) {
        int vowelsCount = 0;
        for (int i = 0; i< str.length(); i++) {
            Character current = str.charAt(i);
            if (current.equals('a') || current.equals('e') || current.equals('i') || current.equals('o') || current.equals('u')){
                vowelsCount++;
            }
        }
        // your code here
        return vowelsCount;
    }
}
