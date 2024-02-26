package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._07_builder.practice;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        FrameBuilder frameBuilder = new FrameBuilder();
        Director director = new Director(frameBuilder);
        director.construct();
        JFrame frame = frameBuilder.getFrameResult();
        frame.setVisible(true);
    }
}
