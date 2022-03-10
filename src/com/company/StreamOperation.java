package com.company;

import java.io.*;
import java.util.ArrayList;

/*
@autor  :  dwimmer1
     * @param    n String für den namen
     * @param    gn String für givename
     * @param    bd geburtsdatum
     * @param    p Telefonnummer
 */

public class StreamOperation {

    ArrayList<String> alist = new ArrayList<>();
    public void ToStream(FileWriter w, String line){

        try{
            String[] array = line.split(";");
            w.write(array.toString());
        }catch (Exception e){
            e.printStackTrace();
        }


    }
    public String fromStream(Reader r){
            String b = "";
        try {
            BufferedReader in = new BufferedReader(r);
            for (int i = 0; i < in.read(); i++) {
                System.out.println(in.readLine());
                b = in.readLine();


            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return b;

    }
}
