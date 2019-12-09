package ua.com.patterns.bridge.platform;

import java.io.File;

public class BinaryFileOperation implements FileOperation{

    @Override
    public File searchFile(String filePath) {
        System.out.println("Search Binary File ...");
        return null;
    }

    @Override
    public void storeFile(File file) {
        System.out.println("Store Binary File ...");
    }

    @Override
    public void copyFile(String pathFrom, String pathTo) {
        System.out.println("Copy Binary File ...");
    }

    @Override
    public void moveFile(String pathFrom, String pathTo) {
        System.out.println("Move Binary File ...");
    }
}
