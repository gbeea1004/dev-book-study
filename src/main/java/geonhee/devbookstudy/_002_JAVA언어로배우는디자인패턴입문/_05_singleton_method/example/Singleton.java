package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._05_singleton_method.example;

public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("인스턴스를 생성하였습니다.");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
