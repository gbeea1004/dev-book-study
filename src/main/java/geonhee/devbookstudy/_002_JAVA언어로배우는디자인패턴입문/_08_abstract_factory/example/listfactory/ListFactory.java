package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._08_abstract_factory.example.listfactory;

import geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._08_abstract_factory.example.factory.Factory;
import geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._08_abstract_factory.example.factory.Link;
import geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._08_abstract_factory.example.factory.Page;
import geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._08_abstract_factory.example.factory.Tray;

public class ListFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new LinkList(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new LinkTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new LinkPage(title, author);
    }
}
