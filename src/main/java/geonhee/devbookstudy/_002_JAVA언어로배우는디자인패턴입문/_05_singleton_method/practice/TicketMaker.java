package geonhee.devbookstudy._002_JAVA언어로배우는디자인패턴입문._05_singleton_method.practice;

public class TicketMaker {

    private static TicketMaker ticketMaker = new TicketMaker();

    private int ticket;

    private TicketMaker() {
        this.ticket = 1000;
    }

    public static TicketMaker getInstance() {
        return ticketMaker;
    }

    public synchronized int getNextTicketNumber() {
        return ticket++;
    }
}
