package ua.com.patterns.bridge.platform;

import java.io.File;

public class TextFileOperation implements FileOperation {

    @Override
    public File searchFile(String filePath) {
        System.out.println("Search Text File ...");
        return null;
    }

    @Override
    public void storeFile(File file) {
        System.out.println("Store Text File ...");
    }

    @Override
    public void copyFile(String pathFrom, String pathTo) {
        System.out.println("Copy Text File ...");
    }

    @Override
    public void moveFile(String pathFrom, String pathTo) {
        System.out.println("Move Text File ...");
    }
}
