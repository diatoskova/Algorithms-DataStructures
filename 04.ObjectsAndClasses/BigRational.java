package Examples;

import java.math.BigInteger;

public class BigRational implements Comparable<BigRational> {

	public static final BigRational ZERO=new BigRational();
	public static final BigRational ONE=new BigRational("1");
	
	private BigInteger num;
	private BigInteger den;
	
	public BigRational()
	{
		this(BigInteger.ZERO);
	}
	
	public BigRational(BigInteger n)
	{
		this(n,BigInteger.ONE);
	}
	
	public BigRational(BigInteger n,BigInteger d)
	{
		this.num=n;
		this.den=d;
		
		check00();
		fixSigns();
		reduce();
	}
	
	public BigRational(String str)
	{
		if(str.length()==0)
		{
			throw new IllegalArgumentException("Zero-length string.");
		}
		
		//Check for "/"
		int slashIndex=str.indexOf('/');
		
		//if there is no slash in the string
		if(slashIndex==-1)
		{
			num=new BigInteger(str.trim());
			den=BigInteger.ONE;
		}
		else
		{
			num=new BigInteger(str.substring(0,slashIndex).trim());
			den=new BigInteger(str.substring(slashIndex+1).trim());
			
			check00();
			fixSigns();
			reduce();
		}
	}
	
	private void check00()
	{
		if(num.equals(BigInteger.ZERO) && den.equals(BigInteger.ZERO))
			throw new ArithmeticException("ZERO DIVIDE BY ZERO");
	}
	
	//minus sighns are not allowed
	private void fixSigns(){
		if(den.compareTo(BigInteger.ZERO)<0)
		{
			num=num.negate();
			den=den.negate();
		}
	}
	
	//check if numinator and denominator have some common devisor
	private void reduce()
	{
		if(den==BigInteger.ZERO || num==BigInteger.ZERO)
			return;
		else
		{
		BigInteger gcd=num.gcd(den);
		num=num.divide(gcd);
		den=den.divide(gcd);
		}
	}
	
	public BigRational add(BigRational other)
	{
		BigInteger numerator=num.multiply(other.den).add(other.num.multiply(den));
		BigInteger denominator=den.multiply(other.den);
		
		return new BigRational(numerator,denominator);
	}
	
	public BigRational substract(BigRational other)
	{
		return add(other.negate());
	}
	
	public BigRational negate()
	{
		return new BigRational(num.negate(),den);
	}
	public BigRational abs()
	{
		return new BigRational(num.abs(),den);
	}
	
	public BigRational multiply(BigRational other)
	{
		BigInteger nominator=num.multiply(other.num);
		BigInteger denominator=den.multiply(other.den);
		
		return new BigRational(nominator,denominator);
	}
	
	public BigRational divide(BigRational other)
	{
		BigInteger nominator=num.multiply(other.den);
		BigInteger denominator=den.multiply(other.num);
		
		return new BigRational(nominator,denominator);
	}
	
	public boolean equals(Object other)
	{
		if(!(other instanceof BigRational))
		{
			return false;
		}
		
		BigRational rhs=(BigRational)other;
		
		return (num.equals(rhs.num) && den.equals(rhs.den));
	}
	
	public String toString()
	{
		if(den.equals(BigInteger.ZERO))
		{
			if(num.compareTo(BigInteger.ZERO)<0)
			{
				return "-infinity";
			}
			else if(num.compareTo(BigInteger.ZERO)>0)
			{
				return "infinity";
			}
			else
			{
				return "indeterminate";
			}
				
		}
		if(den.equals(BigInteger.ONE))
		{
			return num.toString();
		}
		else
		{
			return num.toString()+"/"+den.toString();
		}
	}

	public BigRational pow(int exp)
	{
		BigRational result=new BigRational(num,den);
		
		if(exp<0)
		{
			throw new IllegalArgumentException("Power cannot be negative");
		}
		else if(exp==0)
		{
			return BigRational.ONE;
		}
		else
		{
			for(int i=0;i<exp-1;i++)
			{
				result=result.multiply(this);
			}
			return result;
		}
	}

	public BigInteger toBigInteger()
	{
		if(den!=BigInteger.ONE)
		{
			throw new IllegalArgumentException(
					"Cannot convert to BigInteger since denominator is different from 1");
		}
		else
		{
			return num;
		}
	}

	public int toInteger()
	{
		if(den!=BigInteger.ONE)
		{
			throw new IllegalArgumentException(
					"Cannot convert to integer since denominator is different from 1");
		}
		else
		{
			return Integer.parseInt(num.toString());
		}
	}

	@Override
	public int compareTo(BigRational o) {
		
		BigRational divided=this.divide(o);
		System.out.println("divided: "+divided.toString());
		//divided.reduce();
		
		if(divided.equals(BigRational.ONE)) //|| divided.toBigInteger()==BigInteger.ONE)
			return 0;
		else if(divided.num.compareTo(divided.den)>0)
			return 1;
		else return -1;

	}

}
