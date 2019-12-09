package ua.com.patterns.bridge.abstraction;

import ua.com.patterns.bridge.platform.FileOperation;

import java.io.File;

public class WindowsFileAdministrator implements FileAdministrator {
    private final FileOperation fileOperation;

    public WindowsFileAdministrator(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }

    public File findFile(String filePath) {
        System.out.println("Microsoft Windows");
        return fileOperation.searchFile(filePath);
    }

    public void saveFile(File file) {
        System.out.println("Microsoft Windows");
        fileOperation.storeFile(file);
    }

    public void copyFile(String fromFilePath, String toFilePath) {
        System.out.println("Microsoft Windows");
        fileOperation.copyFile(fromFilePath, toFilePath);
    }
}
