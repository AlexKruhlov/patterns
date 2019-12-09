package ua.com.patterns.bridge.abstraction;

import java.io.File;

public interface FileAdministrator {

    File findFile(String filePath);

    void saveFile(File file);

    void copyFile(String fromFilePath, String toFilePath);
}
