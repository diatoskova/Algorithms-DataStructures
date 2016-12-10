package Examples;

public class TestTicket {

	public static void main(String[] args) {
		
		
		System.out.println("Ticket count at the beginning is: "+Ticket.getTicketCount());

		Ticket t1=new Ticket();
		Ticket t2=new Ticket();
		
		System.out.println("Ticket count is: "+Ticket.getTicketCount());
		
		System.out.println(t1.getSerial());
		System.out.println(t2.toString());
	}

}
