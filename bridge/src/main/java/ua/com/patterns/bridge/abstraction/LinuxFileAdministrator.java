package ua.com.patterns.bridge.abstraction;

import ua.com.patterns.bridge.platform.FileOperation;

import java.io.File;

public class LinuxFileAdministrator implements FileAdministrator {
    private final FileOperation fileOperation;

    public LinuxFileAdministrator(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }

    public File findFile(String filePath) {
        System.out.println("Linux");
        return fileOperation.searchFile(filePath);
    }

    public void saveFile(File file) {
        System.out.println("Linux");
        fileOperation.storeFile(file);
    }

    public void copyFile(String fromFilePath, String toFilePath) {
        System.out.println("Linux");
        fileOperation.copyFile(fromFilePath, toFilePath);
    }
}
