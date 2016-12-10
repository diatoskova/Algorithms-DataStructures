package Examples;

import java.util.ArrayList;
import java.util.Random;

public class Desk {

	private PlayingCard[] cards;
	
	public Desk()
	{
		this.cards=new PlayingCard[52];
		
		this.cards[0]=new PlayingCard(RANK.two,SUIT.spades);
		this.cards[1]=new PlayingCard(RANK.three,SUIT.spades);
		this.cards[2]=new PlayingCard(RANK.four,SUIT.spades);
		this.cards[3]=new PlayingCard(RANK.five,SUIT.spades);
		this.cards[4]=new PlayingCard(RANK.six,SUIT.spades);
		this.cards[5]=new PlayingCard(RANK.seven,SUIT.spades);
		this.cards[6]=new PlayingCard(RANK.eight,SUIT.spades);
		this.cards[7]=new PlayingCard(RANK.nine,SUIT.spades);
		this.cards[8]=new PlayingCard(RANK.ten,SUIT.spades);
		this.cards[9]=new PlayingCard(RANK.jack,SUIT.spades);
		this.cards[10]=new PlayingCard(RANK.queen,SUIT.spades);
		this.cards[11]=new PlayingCard(RANK.king,SUIT.spades);
		this.cards[12]=new PlayingCard(RANK.ace,SUIT.spades);
		
		
		this.cards[13]=new PlayingCard(RANK.two,SUIT.diamonds);
		this.cards[14]=new PlayingCard(RANK.three,SUIT.diamonds);
		this.cards[15]=new PlayingCard(RANK.four,SUIT.diamonds);
		this.cards[16]=new PlayingCard(RANK.five,SUIT.diamonds);
		this.cards[17]=new PlayingCard(RANK.six,SUIT.diamonds);
		this.cards[18]=new PlayingCard(RANK.seven,SUIT.diamonds);
		this.cards[19]=new PlayingCard(RANK.eight,SUIT.diamonds);
		this.cards[20]=new PlayingCard(RANK.nine,SUIT.diamonds);
		this.cards[21]=new PlayingCard(RANK.ten,SUIT.diamonds);
		this.cards[22]=new PlayingCard(RANK.jack,SUIT.diamonds);
		this.cards[23]=new PlayingCard(RANK.queen,SUIT.diamonds);
		this.cards[24]=new PlayingCard(RANK.king,SUIT.diamonds);
		this.cards[25]=new PlayingCard(RANK.ace,SUIT.diamonds);
		
		this.cards[26]=new PlayingCard(RANK.two,SUIT.hearts);
		this.cards[27]=new PlayingCard(RANK.three,SUIT.hearts);
		this.cards[28]=new PlayingCard(RANK.four,SUIT.hearts);
		this.cards[29]=new PlayingCard(RANK.five,SUIT.hearts);
		this.cards[30]=new PlayingCard(RANK.six,SUIT.hearts);
		this.cards[31]=new PlayingCard(RANK.seven,SUIT.hearts);
		this.cards[32]=new PlayingCard(RANK.eight,SUIT.hearts);
		this.cards[33]=new PlayingCard(RANK.nine,SUIT.hearts);
		this.cards[34]=new PlayingCard(RANK.ten,SUIT.hearts);
		this.cards[35]=new PlayingCard(RANK.jack,SUIT.hearts);
		this.cards[36]=new PlayingCard(RANK.queen,SUIT.hearts);
		this.cards[37]=new PlayingCard(RANK.king,SUIT.hearts);
		this.cards[38]=new PlayingCard(RANK.ace,SUIT.hearts);
		
		this.cards[39]=new PlayingCard(RANK.two,SUIT.clubs);
		this.cards[40]=new PlayingCard(RANK.three,SUIT.clubs);
		this.cards[41]=new PlayingCard(RANK.four,SUIT.clubs);
		this.cards[42]=new PlayingCard(RANK.five,SUIT.clubs);
		this.cards[43]=new PlayingCard(RANK.six,SUIT.clubs);
		this.cards[44]=new PlayingCard(RANK.seven,SUIT.clubs);
		this.cards[45]=new PlayingCard(RANK.eight,SUIT.clubs);
		this.cards[46]=new PlayingCard(RANK.nine,SUIT.clubs);
		this.cards[47]=new PlayingCard(RANK.ten,SUIT.clubs);
		this.cards[48]=new PlayingCard(RANK.jack,SUIT.clubs);
		this.cards[49]=new PlayingCard(RANK.queen,SUIT.clubs);
		this.cards[50]=new PlayingCard(RANK.king,SUIT.clubs);
		this.cards[51]=new PlayingCard(RANK.ace,SUIT.clubs);
		
	}

	public void shuffle()
	{
		Random random=new Random();
		int rem=this.remainingNumberOfCards();
		
		int low=52-rem;
		int high=52;
		
		ArrayList<PlayingCard> temp=new ArrayList<PlayingCard>();
		
		while(temp.size()<rem)
		{
			
			int num=random.nextInt(high-low)+low;
			
			if(this.cards[num]!=null)
			{
				temp.add(cards[num]);
				this.cards[num]=null;
			}
			
		}
		
		for(int i=52-rem;i<52;i++)
		{
			this.cards[i]=temp.get(i);
		}
	}

	public PlayingCard deal()
	{
		PlayingCard p=null;
		int count=0;
		
		while(p!=null || count<52)
		{
			p=this.cards[count];
			
			if(p!=null){
				this.cards[count]=null;
				return p;
			}
			count++;
		}
		
		return p;
	}
	public String toString()
	{
		String str="";
		
		for(int i=0;i<cards.length;i++)
		{
			str+=cards[i].toString()+"\n";
		}
		
		return str;
	}

	public int remainingNumberOfCards()
	{
		int num=0;
		for(int i=0;i<52;i++)
		{
			if(this.cards[i]!=null)
				num++;
		}
		
		return num;
	}

	public boolean anyCards()
	{
		if(this.remainingNumberOfCards()>0)
			return true;
		return false;
	}
}
