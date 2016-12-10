package Examples;

public class Polynomial {
	
	private int degree;
	private int[] coeff;
	
	public Polynomial(Polynomial p)
	{
		this.degree=p.degree;
		
		int len=p.coeff.length;
		coeff=new int[len];
		
		for(int i=0;i<len;i++)
		{
			this.coeff[i]=p.coeff[i];
		}
	}
	
	public Polynomial(String str)
	{
		int pos=str.indexOf('x');
		
		// 4
		if(pos<0)
		{
			this.degree=0;
			this.coeff=new int[1];
			this.coeff[0]=Integer.parseInt(str);
		}
		else
		{
			if(pos==str.length()-1)
			{
				this.degree=1;
				this.coeff=new int[degree];
				
				//x
				if(pos==0)
				{
					this.coeff[0]=1;
					
				}
				//3x
				else
				{
					
					this.coeff[0]=Integer.parseInt(str.substring(0, pos-1));   // ili pos ???????
				}
			}
			else
			{
				//3x+2 or x+2
				if(str.charAt(pos+1)!='^')
				{
					this.degree=2;
					this.coeff=new int[degree];
					
					//x+2
					if(pos==0)
					{
						coeff[1]=1;
						coeff[0]=Integer.parseInt(str.substring(pos+1, this.degree-1));
					}
					//3x+2
					else
					{
						coeff[1]=Integer.parseInt(str.substring(0,pos-1)); // ili pos ????????
						coeff[0]=Integer.parseInt(str.substring(pos+1));
					}
				}
				//x^2 + ...
				else
				{
					int endDegIndex;
					
					//x^2 + ..
					if(str.substring(pos+1).indexOf('+')>=0 && 
							str.substring(pos+1).indexOf('+')<str.substring(pos+1).indexOf('-'))
					{
						endDegIndex=str.substring(pos+1).indexOf('+');
						this.degree=Integer.parseInt(str.substring(pos+1, endDegIndex-1));
						this.coeff=new int[this.degree];
						//this.coeff[this.degree-1]=
						
						while(pos>-1)
						{
							
						}
					}
					//x^2 - ...
					else if(str.substring(pos+1).indexOf('-')>=0 && 
							str.substring(pos+1).indexOf('-')<str.substring(pos+1).indexOf('+'))
					{
						endDegIndex=str.substring(pos+1).indexOf('-');	
						this.degree=Integer.parseInt(str.substring(pos+1, endDegIndex-1));
						this.coeff=new int[this.degree];
					}
					//x^2
					else
					{
						this.degree=Integer.parseInt(str.substring(pos+1));
						this.coeff=new int[this.degree];
					}
				}
			}
		}
	}
	
	private int parse(String str)
	{
		int num=0;
		
		if(str.charAt(0)=='-')
		{
			num=Integer.parseInt(str.substring(1,str.length()-1));
			num=-num;
		}
		else if(str.charAt(0)=='+')
		{
			num=Integer.parseInt(str.substring(1,str.length()-1));
		}
		else
		{
			num=Integer.parseInt(str);
		}
		
		return num;
		
	}

}
