package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._02_adapter.practice;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        FileIO fileIO = new FileProperties();
        try {
            fileIO.readFromFile("src/main/resources/file.txt");
            fileIO.setValue("width", "1024");
            fileIO.setValue("height", "512");
            fileIO.setValue("depth", "32");
            fileIO.writeToFile("src/main/resources/newfile.txt");
            System.out.println("newfile.txt is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
