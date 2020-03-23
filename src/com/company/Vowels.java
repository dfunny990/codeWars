package com.company;

public class Vowels {

    public static void Run() {

        System.out.println("### -----------------VOWELS---------------- ##");
        String input = getInput();
        int count = getCount(input);

        System.out.println(input+"--"+count);
    }

    private static String getInput() {
        return "Abracadabra";
    }

    public static int getCount(String str) {
        int vowelsCount = 0;
        for (int i = 0; i< str.length(); i++) {
            Character current = Character.toLowerCase(str.charAt(i));
            if (current.equals('a') || current.equals('e') || current.equals('i') || current.equals('o') || current.equals('u')){
                vowelsCount++;
            }
        }
        // your code here
        return vowelsCount;
    }
}
