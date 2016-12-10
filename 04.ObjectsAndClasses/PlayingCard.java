package Examples;


public class PlayingCard {

	private RANK rank;
	private SUIT suit;
	
	public PlayingCard()
	{
		this.rank=RANK.two;
		this.suit=SUIT.spades;
	}
	public PlayingCard(RANK rank,SUIT suit)
	{
		this.rank=rank;
		this.suit=suit;
	}
	
	public String toString()
	{
		return this.rank+" "+this.suit;
	}
}
