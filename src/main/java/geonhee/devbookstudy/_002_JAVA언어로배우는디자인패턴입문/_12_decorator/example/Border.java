package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._12_decorator.example;

public abstract class Border extends Display {

    protected Display display;

    public Border(Display display) {
        this.display = display;
    }
}
