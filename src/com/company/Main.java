package com.company;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        File f = new File("src/com/company/saves.CSV");
        FileReader fr = new FileReader(f);
        BufferedReader bufferedReader = new BufferedReader(fr);
        ArrayList<Date> dates = new ArrayList<>();

        bufferedReader.readLine(); //skips first line


        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie Ihren Vornamen ein: ");
        //scanner.next
        System.out.println("Geben Sie Ihren Nachnamen ein: ");
        System.out.println("Geben Sie Ihren Spitznamen ein: ");
        System.out.println("Geben Sie Ihren Geburtstag ein: ");
        System.out.println("Geben Sie Ihre Telefonnummer ein: ");
    }
}
