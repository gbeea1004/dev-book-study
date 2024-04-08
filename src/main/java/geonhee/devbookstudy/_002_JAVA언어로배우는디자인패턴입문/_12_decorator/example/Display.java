package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._12_decorator.example;

public abstract class Display {

    public void show() {
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }

    public abstract int getColumns();

    public abstract int getRows();

    public abstract String getRowText(int row);
}
