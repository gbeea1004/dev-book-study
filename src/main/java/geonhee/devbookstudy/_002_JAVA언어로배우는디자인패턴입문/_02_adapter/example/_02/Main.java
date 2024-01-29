package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._02_adapter.example._02;

public class Main {

    public static void main(String[] args) {
        Print print = new PrintBanner("Hello");
        print.printWeak();
        print.printStrong();
    }
}
