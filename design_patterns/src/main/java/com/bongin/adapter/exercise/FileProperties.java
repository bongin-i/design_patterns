package com.bongin.adapter.exercise;

import java.io.*;
import java.util.Properties;

public class FileProperties implements FileIO{

    private Properties properties;

    public FileProperties() {
        properties = new Properties();
    }

    @Override
    public void readFromFile(String filename) throws IOException {
        InputStream is = new FileInputStream(filename);
        properties.load(is);
    }

    @Override
    public void writeToFile(String filename,String header) throws IOException {
        OutputStream os = new FileOutputStream(filename);
        properties.store(os,header);
    }

    @Override
    public void setValue(String key, String value) {
        properties.setProperty(key,value);
    }

    @Override
    public String getValue(String key) {
        return properties.getProperty(key);
    }
}
