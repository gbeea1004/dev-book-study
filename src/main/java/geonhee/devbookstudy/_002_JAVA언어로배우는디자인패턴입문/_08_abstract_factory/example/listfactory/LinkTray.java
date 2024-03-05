package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._08_abstract_factory.example.listfactory;

import geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._08_abstract_factory.example.factory.Item;
import geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._08_abstract_factory.example.factory.Tray;

public class LinkTray extends Tray {

    public LinkTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<li>\n");
        sb.append(caption);
        sb.append("\n<ul>\n");
        for (Item item : tray) {
            sb.append(item.makeHTML());
        }
        sb.append("</ul>\n");
        sb.append("</li>\n");
        return sb.toString();
    }
}
