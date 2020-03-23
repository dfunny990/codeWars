package com.company;

public class DubStep {

    public static void Run() {
        System.out.println("### ----------------DUBSTEP---------------- ##");
        String input = getInput();
        String result = SongDecoder(input);
        System.out.println(input+"--"+result);
        
    }

    private static String getInput() {
        return "RWUBWUBWUBLWUB";

    }

    public static String SongDecoder (String song)
    {
        return song.replace("WUB", " ").trim().replaceAll("( )+", " ");
    }
}
