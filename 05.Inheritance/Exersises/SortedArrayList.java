package Exersises;

import java.util.ArrayList;

public class SortedArrayList<AnyType extends Comparable<AnyType>> {
	
	private ArrayList<AnyType> elements;
	
	public SortedArrayList()
	{
		elements=new ArrayList<AnyType>();
	}
	
	public SortedArrayList(ArrayList<AnyType> arr)
	{
		this();
		
		//sort(arr);
		
		for(int i=0;i<arr.size();i++)
		{
			add(arr.get(i));
		}
		//elements.sort(null);
	}
	
	public AnyType get(int index)
	{
		if(index<0)
			throw new IllegalArgumentException("Index cannot be negative.");
		
		return elements.get(index);
	}
	
	public void remove(int index)
	{
		if(index<0)
			throw new IllegalArgumentException("Index cannot be negative.");
		elements.remove(index);
	}
	
	public int size()
	{
		return elements.size();
	}
	
	public void add(AnyType newElement)
	{
		
		for(int i=0;i<elements.size();i++)
		{
			if(newElement.compareTo(elements.get(i))<=0)
			{
				elements.add(i, newElement);
				return;
			}
		}
		elements.add(newElement);
	}
	
	public String toString()
	{
		String str="";
		for(int i=0;i<elements.size();i++)
		{
			str=str+" "+elements.get(i);
		}
		
		return str;
	}

	
	/*private void sort(ArrayList<AnyType> arr)
	{
		ArrayList<AnyType>  unsorted=new ArrayList<AnyType>();
		
		for(int i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i)+" added");
			unsorted.add(arr.get(i));
		}
		
		arr.clear();
		
		if(unsorted.size()!=0)
			arr.add(unsorted.get(0));
		
		for(int i=1;i<unsorted.size();i++)
		{
			for(int j=0;i<arr.size();j++)
			{
				if(arr.get(j).compareTo(unsorted.get(i))>0)
				{
					arr.add(j, unsorted.get(i));
					System.out.println("Element at position j : "+arr.get(j));
					break;
				}
			}
		}
		
		System.out.println("Size of arr at the end:"+arr.size());
		for(int i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i)+" there");
		}
		
	
	}
	*/

}
