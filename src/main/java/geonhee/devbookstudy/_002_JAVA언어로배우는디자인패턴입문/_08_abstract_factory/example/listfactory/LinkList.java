package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._08_abstract_factory.example.listfactory;

import geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._08_abstract_factory.example.factory.Link;

public class LinkList extends Link {

    public LinkList(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return " <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
