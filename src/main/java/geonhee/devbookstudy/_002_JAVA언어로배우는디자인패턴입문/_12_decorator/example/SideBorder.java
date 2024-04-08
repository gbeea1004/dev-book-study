package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._12_decorator.example;

public class SideBorder extends Border {

    private char borderChar;

    public SideBorder(Display display, char ch) {
        super(display);
        this.borderChar = ch;
    }

    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return borderChar + display.getRowText(row) + borderChar;
    }
}
