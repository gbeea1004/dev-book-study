package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._09_bridge.example;

public class Main {

    public static void main(String[] args) {
        Display display1 = new Display(new StringDisplayImpl("Hello 1"));
        Display display2 = new CountDisplay(new StringDisplayImpl("Hello 2"));
        CountDisplay display3 = new CountDisplay(new StringDisplayImpl("Hello 3"));

        display1.display();
        display2.display();
        display3.multiDisplay(5);
    }
}
