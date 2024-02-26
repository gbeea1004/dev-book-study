package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._07_builder.practice;

public interface Builder {

    void makeTitle(String title);

    void makeString(String string);

    void makeItems(String[] items);

    void close();
}
