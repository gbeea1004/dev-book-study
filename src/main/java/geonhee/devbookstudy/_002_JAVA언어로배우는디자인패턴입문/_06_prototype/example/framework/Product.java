package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._06_prototype.example.framework;

public interface Product extends Cloneable {

    void use(String s);

    Product createCopy();
}
