package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._19_state.example;

public interface Context {

    void setClock(int hour);

    void changeState(State state);

    void callSecurityCenter(String msg);

    void recordLog(String msg);
}
