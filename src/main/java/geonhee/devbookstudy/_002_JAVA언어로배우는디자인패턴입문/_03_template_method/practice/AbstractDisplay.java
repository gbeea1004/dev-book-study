package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._03_template_method.practice;

public interface AbstractDisplay {

    default void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }

    void open();

    void print();

    void close();
}
