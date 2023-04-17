package com.bongin.adapter.exercise;

import java.io.IOException;

public class AdapterMain {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try{
            f.readFromFile("src/dir/adapter/file.txt");
            f.setValue("year","2004");
            f.setValue("month","4");
            f.setValue("day","21");
            f.writeToFile("src/dir/adapter/newfile.txt","this is comment");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
