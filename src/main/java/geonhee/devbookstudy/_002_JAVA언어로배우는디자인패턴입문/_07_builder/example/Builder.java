package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._07_builder.example;

public abstract class Builder {

    public abstract void makeTitle(String title);

    public abstract void makeString(String string);

    public abstract void makeItems(String[] items);

    public abstract void close();
}
