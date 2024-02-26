package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._06_prototype.practice.framework;

public abstract class Product implements Cloneable {

    protected Product createCopy() {
        Product product = null;
        try {
            product = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.getStackTrace();
        }
        return product;
    }

    public abstract void use(String s);
}
