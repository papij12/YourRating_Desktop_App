package com.Task3;

import java.io.IOException;
import java.util.logging.*;

public class Logs {
    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
private static void setupLogger(){
    LogManager.getLogManager().reset();
    LOGGER.setLevel(Level.ALL);
    try {
        FileHandler fileHandler = new FileHandler("myLogger.txt", true);
        fileHandler.setLevel(Level.FINE);
       LOGGER.addHandler(fileHandler);
    } catch (IOException e) {
        LOGGER.log(Level.SEVERE,"file logger not working",e);
    }

}
    public static void main(String[] args) {
Logs.setupLogger();
        LOGGER.info("My logger is working");
        LOGGER.info("My second test");
    }
}
