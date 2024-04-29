package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._13_visitor.example;

public abstract class Entry implements Element {

    public abstract String getName();

    public abstract int getSize();

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}
