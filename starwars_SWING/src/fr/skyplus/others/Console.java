package fr.skyplus.others;

import java.util.Scanner;

public class Console {

    public Console() {
    }

    public static void print(String text) {
        System.out.println(text);
    }

    public static Object input(String title) {
        Scanner inputString = new Scanner(System.in);
        print(title + " : ");
        Object data = inputString.next();
        return data;
    }

}
