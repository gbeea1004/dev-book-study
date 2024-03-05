package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._08_abstract_factory.example.factory;

public abstract class Item {

    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
