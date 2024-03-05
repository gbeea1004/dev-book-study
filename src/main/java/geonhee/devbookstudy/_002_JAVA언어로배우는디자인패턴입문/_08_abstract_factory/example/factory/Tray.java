package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._08_abstract_factory.example.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Tray extends Item {

    protected List<Item> tray = new ArrayList<>();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }
}
