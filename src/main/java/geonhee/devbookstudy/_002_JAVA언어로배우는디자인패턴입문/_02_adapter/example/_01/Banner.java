package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._02_adapter.example._01;

public class Banner {

    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
