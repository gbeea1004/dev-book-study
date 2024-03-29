package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._06_prototype.example;

import geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._06_prototype.example.framework.Product;

public class MessageBox implements Product {

    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        int decolen = 1 + s.length() + 1;
        for (int i = 0; i < decolen; i++) {
            System.out.print(decochar);
        }
        System.out.println();
        System.out.println(decochar + s + decochar);
        for (int i = 0; i < decolen; i++) {
            System.out.print(decochar);
        }
        System.out.println();
    }

    @Override
    public Product createCopy() {
        Product product = null;
        try {
            product = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.getStackTrace();
        }
        return product;
    }
}
