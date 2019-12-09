package ua.com.patterns.bridge.platform;

import java.io.File;

public interface FileOperation {

    File searchFile(String filePath);

    void storeFile(File file);

    void copyFile(String pathFrom, String pathTo);

    void moveFile(String pathFrom, String pathTo);
}
