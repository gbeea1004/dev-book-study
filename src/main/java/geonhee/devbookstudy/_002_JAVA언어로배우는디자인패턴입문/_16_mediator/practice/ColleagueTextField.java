package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._16_mediator.practice;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class ColleagueTextField extends TextField implements TextListener, Colleague {

    private Mediator mediator;

    public ColleagueTextField(String text, int columns) {
        super(text, columns);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
        setBackground(enabled ? Color.WHITE : Color.LIGHT_GRAY);
    }

    @Override
    public void textValueChanged(TextEvent textEvent) {
        mediator.colleagueChanged();
    }
}
