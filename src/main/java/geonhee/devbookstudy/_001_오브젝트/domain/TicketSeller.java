package geonhee.devbookstudy._001_오브젝트.domain;

public class TicketSeller {

  private TicketOffice ticketOffice;

  public TicketSeller(TicketOffice ticketOffice) {
    this.ticketOffice = ticketOffice;
  }

  public void sellTo(Audience audience) {
    ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
  }

  public TicketOffice getTicketOffice() {
    return ticketOffice;
  }
}
