package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._11_composite.example;

public abstract class Border extends Display {

    protected Display display;

    protected Border(Display display) {
        this.display = display;
    }
}
