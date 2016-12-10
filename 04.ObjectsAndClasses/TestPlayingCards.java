package Examples;

public class TestPlayingCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Desk d1=new Desk();
		
		d1.shuffle();
		

		//System.out.println(d1.toString());
			
		//for(int i=0;i<52;i++)
		//{
		//	System.out.println("Deal "+i+": "+d1.deal()+" (remaining: "+d1.remainingNumberOfCards()+")");
		//}
		
		MultipleDesk m1=new MultipleDesk(2);
		m1.shuffle();
		System.out.println(m1.toString());
	
		for(int i=0;i<52*m1.numberOfDesks;i++)
		{
			System.out.println("Deal "+i+": "+m1.deal()+" (remaining: "+m1.remainingNumberOfCards()+")");
		}
	}

}
