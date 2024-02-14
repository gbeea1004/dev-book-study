package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._05_singleton_method.practice;

public enum Triple2 {

    ALPHA,
    BETA,
    GAMMA;

    public static Triple2 getInstance(String name) {
        return Triple2.valueOf(name);
    }
}
