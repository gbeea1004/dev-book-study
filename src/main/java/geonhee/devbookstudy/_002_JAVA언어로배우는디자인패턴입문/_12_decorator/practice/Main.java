package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._12_decorator.practice;

import geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._12_decorator.example.Display;
import geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._12_decorator.example.FullBorder;
import geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._12_decorator.example.SideBorder;
import geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._12_decorator.example.StringDisplay;

public class Main {

    public static void main(String[] args) {
        Display b1 = new StringDisplay("Hello world");
        Display b2 = new UpDownBorder(b1, '-');
        Display b3 = new SideBorder(b2, '*');

        b1.show();
        b2.show();
        b3.show();

        Display b4 = new FullBorder(
                new UpDownBorder(
                        new SideBorder(
                                new UpDownBorder(
                                      new SideBorder(
                                              new StringDisplay("Hi"),
                                              '*'
                                      ),
                                        '='
                                ),
                                '|'
                        ),
                        '/'
                )
        );
        b4.show();
    }
}
