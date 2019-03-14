package by.yuliya.java.exception;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

public class DataReader {

    private static Logger logger = LogManager.getLogger();

    public static List<String> dataRead(String filePath){
        List<String> lines = null;
        try (FileReader reader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            lines = bufferedReader.lines().collect(Collectors.toList());
        } catch (IOException e) {
            logger.log(Level.FATAL, "File is not found", e);
        }
        return lines;
    }


}




