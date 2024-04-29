package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._13_visitor.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends Entry implements Iterable<Entry> {

    private String name;
    private List<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Entry entry : directory) {
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public Iterator<Entry> iterator() {
        return directory.iterator();
    }

    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }
}
