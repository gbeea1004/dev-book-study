package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._12_decorator.practice;

import geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._12_decorator.example.Border;
import geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._12_decorator.example.Display;

public class UpDownBorder extends Border {

    private char text;

    public UpDownBorder(Display display, char ch) {
        super(display);
        this.text = ch;
    }

    @Override
    public int getColumns() {
        return display.getColumns();
    }

    @Override
    public int getRows() {
        return 1 + display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0 || row == display.getRows() + 1) {
            return makeLine(text, display.getColumns());
        }
        return display.getRowText(row - 1);
    }

    private String makeLine(char ch, int count) {
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < count; i++) {
            line.append(ch);
        }
        return line.toString();
    }
}
