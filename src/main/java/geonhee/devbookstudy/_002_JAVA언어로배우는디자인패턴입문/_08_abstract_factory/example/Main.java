package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._08_abstract_factory.example;

import geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._08_abstract_factory.example.factory.Factory;
import geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._08_abstract_factory.example.factory.Link;
import geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._08_abstract_factory.example.factory.Page;
import geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._08_abstract_factory.example.factory.Tray;

public class Main {

    public static void main(String[] args) {
        String filename = "list.html";
        String classname = "geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._08_abstract_factory.example.listfactory.ListFactory";

        Factory factory = Factory.getFactory(classname);

        Link blog1 = factory.createLink("Blog 1", "https://naver.com");
        Tray blogTray = factory.createTray("Blog site");
        blogTray.add(blog1);

        Page page = factory.createPage("Blog title", "geon");
        page.add(blogTray);
        page.output(filename);
    }
}
