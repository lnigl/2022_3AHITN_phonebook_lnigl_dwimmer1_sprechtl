package com.company;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        File f = new File("src/com/company/saves.CSV");
        FileReader fr = new FileReader(f);
        BufferedReader bufferedReader = new BufferedReader(fr);
        ArrayList<Date> dates = new ArrayList<>();

        bufferedReader.readLine();


    }
}
