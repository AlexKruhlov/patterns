package ua.com.patterns.bridge;

import ua.com.patterns.bridge.abstraction.FileAdministrator;
import ua.com.patterns.bridge.abstraction.LinuxFileAdministrator;
import ua.com.patterns.bridge.abstraction.WindowsFileAdministrator;
import ua.com.patterns.bridge.platform.BinaryFileOperation;
import ua.com.patterns.bridge.platform.TextFileOperation;

public class App {

    public static void main(String[] args) {
        FileAdministrator windowsBinaryFileAdministrator = new WindowsFileAdministrator(new BinaryFileOperation());
        windowsBinaryFileAdministrator.findFile("");
        windowsBinaryFileAdministrator.saveFile(null);
        windowsBinaryFileAdministrator.copyFile("", "");
        System.out.println("=========================================\n");

        FileAdministrator windowsTextFileAdministrator = new WindowsFileAdministrator(new TextFileOperation());
        windowsTextFileAdministrator.findFile("");
        windowsTextFileAdministrator.saveFile(null);
        windowsTextFileAdministrator.copyFile("", "");
        System.out.println("=========================================\n");

        FileAdministrator linuxBinaryFileAdministrator = new LinuxFileAdministrator(new BinaryFileOperation());
        linuxBinaryFileAdministrator.findFile("");
        linuxBinaryFileAdministrator.saveFile(null);
        linuxBinaryFileAdministrator.copyFile("", "");
        System.out.println("=========================================\n");

        FileAdministrator linuxTextFileAdministrator = new LinuxFileAdministrator(new TextFileOperation());
        linuxTextFileAdministrator.findFile("");
        linuxTextFileAdministrator.saveFile(null);
        linuxTextFileAdministrator.copyFile("", "");
    }
}
