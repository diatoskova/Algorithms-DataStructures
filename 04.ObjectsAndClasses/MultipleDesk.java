package Examples;

import java.util.ArrayList;

public class MultipleDesk {

	ArrayList<Desk> desks;
	int numberOfDesks;
	
	MultipleDesk(int count)
	{
		desks=new ArrayList<Desk>();
		this.numberOfDesks=count;
		
		for(int i=0;i<this.numberOfDesks;i++)
		{
			desks.add(new Desk());
		}
	}
	
	public void shuffle()
	{
		for(int i=0;i<this.numberOfDesks;i++)
		{
			desks.get(i).shuffle();
		}
	}
	
	public int remainingNumberOfCards()
	{
		int num=0;
		for(int i=0;i<this.numberOfDesks;i++)
		{
			num+=this.desks.get(i).remainingNumberOfCards();
		}
		
		return num;
	}


	public PlayingCard deal()
	{
		PlayingCard p=null;
		
		for(int i=0;i<this.numberOfDesks;i++)
		{
			if(this.desks.get(i).remainingNumberOfCards()>0)
			{
				p=this.desks.get(i).deal();
				return p;
			}
		}
		return p;
	}


	public String toString()
	{
		String str="";
		
		for(int i=0;i<this.numberOfDesks;i++){
			str+= this.desks.get(i).toString();
		}
		
		
		return str;
	}

}
