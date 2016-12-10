package Examples;

import java.io.*;
import java.util.*;

public class Reader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Double> arr=readNumbers();
		
		System.out.println("Sum: "+sum(arr));
		System.out.println("Sum: "+arithmeticMean(arr));
		System.out.println("Sum: "+harmonicMean(arr));
	}
	
	public static ArrayList<Double> readNumbers(){
		ArrayList<Double> arr=new ArrayList<Double>();
		
		Scanner sc=null;
		
		try
		{
			sc=new Scanner(new FileReader("rational.txt"));
			while(sc.hasNext())
			{
				String num=sc.nextLine();
				double number;
				
				if(num.length()==0)
				{
					throw new IllegalArgumentException("Zero-length string.");
				}
				int slashIndex=num.indexOf('/');
				
				if(slashIndex==-1){
					number=Double.parseDouble(num.trim());
					if(arr.contains(number)){
						continue;
					}
					else
					{
						arr.add(number);
					}
					
				}
				else
				{
					double numinator=Double.parseDouble(num.substring(0, slashIndex).trim());
					double denominator=Double.parseDouble(num.substring(slashIndex+1).trim());
					
					number=numinator/denominator;
					
					if(arr.contains(number)){
						continue;
					}
					arr.add(number);
				}
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.print(e);
		}
		finally
		{
			if(sc!=null)
				sc.close();
		}
		
		return arr;
	}

	public static double sum(ArrayList<Double> arr)
	{
		double sum=0;
		
		for(int i=0;i<arr.size();i++){
			sum+=arr.get(i);
		}
		
		return sum;
	}

	public static double arithmeticMean(ArrayList<Double> arr)
	{
		return sum(arr)/arr.size();
	}

	public static double harmonicMean(ArrayList<Double> arr)
	{
		double denom=0;
		for(int i=0;i<arr.size();i++){
			denom+=1/arr.get(i);
		}
		
		return arr.size()/denom;
	}
}
