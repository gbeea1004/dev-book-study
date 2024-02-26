package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._06_prototype.example;

import geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._06_prototype.example.framework.Product;

public class UnderlinePen implements Product {

    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        int ulen = s.length();
        System.out.println(s);
        for (int i = 0; i < ulen; i++) {
            System.out.print(ulchar);
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
