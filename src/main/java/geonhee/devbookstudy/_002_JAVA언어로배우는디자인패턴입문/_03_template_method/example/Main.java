package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._03_template_method.example;

public class Main {

    public static void main(String[] args) {
        AbstractDisplay display1 = new CharDisplay('H');
        AbstractDisplay display2 = new StringDisplay("Hello, world.");

        display1.display();
        display2.display();
    }
}
