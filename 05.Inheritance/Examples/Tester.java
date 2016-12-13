package Examples;

import java.math.BigInteger;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Base b=new Base();
		//Derived d=new Derived();
		
		//System.out.println(b.bPublic+b.bProtected+b.bPrivate+d.dPublic+d.dPrivate);
		
		String[] a=new String[3];
		Comparable[] b=new Comparable[3];
		
		a[0]="1";
		a[2]="2";
		a[1]="3";
		
		//b[0]=new BigInteger("20");
		//b[1]=new BigInteger("10");
		//b[2]=new BigInteger("30");
		
		System.out.println(min(a));
		
		System.out.println("-----");	
		System.out.println(max(a[0],a[1]));
		System.out.println("-----");
		
		sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("-----");
		
		//System.out.println(min(b));
		//sort(b);
		b=max2(a);
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		
	}
	
	
	public static <AnyType extends Comparable<AnyType>> AnyType min(AnyType[] arr)
	{
		int minIndex=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=null)
			{
				if(arr[i].compareTo(arr[minIndex])<0)
					minIndex=i;
			}
		}
		
		return arr[minIndex];
	}

	public static void sort(Comparable[] arr)
	{
		int len=arr.length;
		int count=0;
		Comparable[] sorted=new Comparable[len];
		
		while(count<len)
		{
			int minIndex=0;
			for(int i=0;i<len;i++)
			{
				if(arr[i]!=null)
				{
					minIndex=i;
					break;
				}
			}
			
			for(int i=0;i<len;i++)
			{
				if(arr[i]!=null)
				{
					if(arr[i].compareTo(arr[minIndex])<0)
						minIndex=i;
				}
			}
			
			sorted[count]=arr[minIndex];
			arr[minIndex]=null;
			count++;
		}
		
		//arr=null;
		
		for(int i=0;i<len;i++)
		{
			arr[i]=sorted[i];
		}
		
		
	}

	public static <AnyType> AnyType[] copy(AnyType[] arr)
	{
		AnyType[] copyArr=arr.clone();
		
		return copyArr;
	}

	public static Comparable[] max2(Comparable[] arr)
	{
		Comparable[] max2=new Comparable[2];
		int maxI1=0;
		int maxI2=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=null)
			{
				if(arr[i].compareTo(arr[maxI1])>0)
				{
					maxI1=i;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(i!=maxI1 && arr[i]!=null)
			{
				if(arr[i].compareTo(arr[maxI2])>0)
				{
					maxI2=i;
				}
			}
		}

		//max2=(AnyType[])new Object[2];
		max2[0]=arr[maxI1];
		max2[1]=arr[maxI2];
		
		return max2;
	}

	public static Comparable max(Comparable a, Comparable b)
	{
		if(a.compareTo(b)>0)
			return a;
		else
			return b;
	}
	

}
