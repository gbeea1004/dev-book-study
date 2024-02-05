package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._03_template_method.example;

public abstract class AbstractDisplay {

    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }

    public abstract void open();

    public abstract void print();

    public abstract void close();
}
