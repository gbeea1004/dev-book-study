package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._19_state.practice;

public interface State {

    void doClock(Context context, int hour);

    void doUse(Context context);

    void doAlarm(Context context);

    void doPhone(Context context);
}
