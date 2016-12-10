package Examples;

public class Ticket {

	private int serialNumber;
	private static int ticketCount;
	
	public Ticket(){
		serialNumber=++ticketCount;
	}
	
	public int getSerial(){
		return this.serialNumber;
	}
	
	public String toString(){
		return "Ticket #"+this.getSerial();
	}
	
	public static int getTicketCount(){
		return ticketCount;
	}
}
