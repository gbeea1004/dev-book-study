package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._02_adapter.practice;

import java.io.IOException;

public interface FileIO {

    void readFromFile(String filename) throws IOException;

    void writeToFile(String filename) throws IOException;

    void setValue(String key, String value);

    String getValue(String key);
}
