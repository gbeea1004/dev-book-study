package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._06_prototype.example.framework;

import java.util.HashMap;
import java.util.Map;

public class Manager {

    private Map<String, Product> showcase = new HashMap<>();

    public void register(String name, Product prototype) {
        showcase.put(name, prototype);
    }

    public Product create(String prototypeName) {
        Product product = showcase.get(prototypeName);

        return product.createCopy();
    }
}
