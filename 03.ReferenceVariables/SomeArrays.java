import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import javax.sound.sampled.Line;
public class SomeArrays {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//double [] arr={1.0, 1.5, 2.0, 2};
		
		/*System.out.println(sum(arr));
		System.out.println(average(arr));
		System.out.println(mode(arr));*/
		
		//String[] arrStr={"aa","bb","cc"};
		//reverse(arrStr);
		
		//ArrayList<String> arrListStr=new ArrayList<String>();
		//arrListStr.add("aa");
		//arrListStr.add("bb");
		//arrListStr.add("cc");
		//reverseArrayList(arrListStr);
		
		//int[] arrInt={1,5,6,22,7,1};
		//System.out.print(hasDuplicates(arrInt));
		
		//System.out.print(countChars("cCcajijfjsdC",'c'));
		//String[] s={"ac","bb","dfdfdfdfc",";;;c","ccC"};
		//System.out.print(countChars(s,'a'));
		//int[] arr0={3,5,2,2,6,2};
		/*int[][] arr1={ {1,2,3},
				       {2,3,4},
				       {3,4,5}};
		int[][] arr2={ {1,2,3},
			           {2,3,4},
			           {3,4,4}};*/
		
		//System.out.println(isIncreasing(arr1));
		//System.out.println(isIncreasing(arr2));
		
		//System.out.println(howMany(arr0,2));
		//System.out.println(howMany(arr2,2));
		
		//delimiter();
		//String[] str1={"char","abc","ca","c","ac"};
		//for(int i=0;i<startsWith(str1,'c').size();i++){
			//System.out.println(startsWith(str1,'c').get(i));
		//}
		//String str2="Some string with a lot of words";
		//String[] strArr=split(str2);
		//for(int i=0;i<strArr.length;i++)
		//	System.out.println(strArr[i]);
		
		/*String[] str3={"SOME","ABX","aaaF","gfgfg","Faa"};
		String[] strArr1=getLowerCase(str3);
		for(int i=0;i<strArr1.length;i++)
			System.out.println(strArr1[i]);
		
		String[] str4={"SOME","ABX","aaaF","gfgfg","Faa"};
		makeLowerCase(str4);
		for(int i=0;i<str4.length;i++)
			System.out.println(str4[i]);
			*/
		
		/*ArrayList<String> str5=new ArrayList<String>();
		str5.add("SOME");
		str5.add("TEXT");
		str5.add("innN");
		str5.add("Capital");
		
		ArrayList<String> strArr2=getLowerCase(str5);
		for(int i=0;i<strArr2.size();i++)
			System.out.println(strArr2.get(i));
		
		ArrayList<String> str6=new ArrayList<String>();
		str6.add("SOME");
		str6.add("TEXT");
		str6.add("innN");
		str6.add("Capital");
		
		makeLowerCase(str6);
		for(int i=0;i<str6.size();i++)
			System.out.println(str6.get(i));
			
		*/
		
		//doubleInfo();
		
		//matrixFileInfo();
	}
	
	public static double sum(double [] arr){
		double sum=0;
		int lengthOfArray=arr.length;
		
		for(int i=0;i<lengthOfArray;i++){
			sum+=arr[i];
		}
		
		return sum;
	}
	
	public static double sum(double[][] arr){
		double sum=0;
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				sum+=arr[i][j];
			}
		}
		
		
		return sum;
		
	}
	
	public static double average(double [] arr){
		double sum=0;
		int lengthOfArray=arr.length;
		
		for(int i=0;i<lengthOfArray;i++){
			sum+=arr[i];
		}
		
		return sum/lengthOfArray;
	}
	
	public static double average(double[][] arr){
		double sum=0;
		int numOfElements=0;
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				sum+=arr[i][j];
				numOfElements++;
			}
		}
		
		return sum/numOfElements;
	}

	
	public static double mode(double [] arr){
		
		int lengthOfArray=arr.length;
		int counter=0;
		int max=0;
		double mode=arr[0];
		
		for(int j=0;j<lengthOfArray;j++){
			
			for(int i=0;i<lengthOfArray;i++){
				if(arr[i]==arr[j])
					counter++;
			}
			
			if(counter>max){
				max=counter;
				mode=arr[j];
			}
			counter=0;
		}
		
		return mode;
	}
	
	public static double mode(double[][] arr){
		double mode=0;
		double counter=0,max=0;
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				double current=arr[i][j];
				counter=0;
				
				for(int m=0;m<arr.length;m++){
					for(int n=0;n<arr[m].length;n++){
						if(arr[m][n]==current)
							counter++;
					}
				}
				
				if(counter>max){
					max=counter;
					mode=current;
				}
			}
		}
		
		
		return mode;
	}
	//2.30
	public static void doubleInfo(){
		
		Scanner sc=null;
		
		try{
			sc=new Scanner(new FileReader("double1.txt"));
			
			ArrayList<Double> doubles=new ArrayList<Double>();
			while(sc.hasNext()){
				doubles.add(sc.nextDouble());
			}
			double[] arr=new double[doubles.size()];
			for(int i=0;i<doubles.size();i++){
				arr[i]=doubles.get(i);
			}
			System.out.println(sum(arr));
			System.out.println(average(arr));
			System.out.println(mode(arr));
		}
		catch(FileNotFoundException e){
			System.out.print(e);
		}
		finally{
			if(sc!=null)
				sc.close();
		}
		
	}
	
	public static void matrixFileInfo() throws IOException{
		Scanner sc=null;
		Scanner line=null;
		int rows=0,cols=0;
		
		try{
			sc=new Scanner(new FileReader("double2.txt"));

			while(sc.hasNext()){
				rows++;
				//line=new Scanner(sc.nextLine());
				//ArrayList<Double> numbers=new ArrayList<Double>();
			
				//while(line.hasNextDouble()){
				//	numbers.add(1.1);
				//}
				String str=sc.nextLine();
				String[] n=str.split("\\s");

				//System.out.println(numbers.size());
				if(cols!=0){
					if(cols!=n.length)
						throw new IOException("The matrix should be quadratic");
				}
				if(cols==0)
					cols=n.length;
				
			
				
				//line.close();
			}
			sc.close();
			Scanner newSc=new Scanner(new FileReader("double2.txt"));
			System.out.println(rows);
			System.out.println(cols);
			double[][] arr=new double[rows][cols];
			
			int counter=0;
			
			while(newSc.hasNext()){
				line=new Scanner(newSc.nextLine());
				
				for(int i=0;i<cols;i++){
					arr[counter][i]=line.nextDouble();
				}
				counter++;
				
				line.close();
			}
			
			newSc.close();
			
			System.out.println();
			System.out.println(sum(arr));
			System.out.println(average(arr));
			System.out.println(mode(arr));
		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}
		finally{
			if(sc!=null)
				sc.close();
			if(line!=null)
				line.close();
		}
	}
	public static void reverse(String[] arr){
		
		int length=arr.length;
		String[] newArr = new String[length];
		for(int i=0;i<length;i++){
			newArr[i]=arr[length-1-i];
		}
		
		for(int i=0;i<length;i++){
			arr[i]=newArr[i];
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}
	
	public static void reverseArrayList(ArrayList<String> arr){
		
		int length=arr.size();
		ArrayList<String> newArr=new ArrayList<String>();
		for(int i=0;i<length;i++){
			newArr.add(arr.get(length-1-i));
		}
		arr.clear();
		for(int i=0;i<length;i++){
			arr.add(newArr.get(i));
			System.out.print(arr.get(i)+" ");
		}
		System.out.println();
		
	}
	
	public static boolean hasDuplicates(int[] arr){
		
		int len=arr.length;
		
		for(int i=0;i<len-1;i++){
			for(int j=0;j<len;j++){
				if(i!=j && arr[i]==arr[j])
					return true;
			}
		}
		
		return false;
	}
	
	public static int countChars(String str,char ch){

		int count=0;
		ch=Character.toLowerCase(ch);
		
		for(int i=0;i<str.length();i++){
			char temp=Character.toLowerCase(str.charAt(i));
			if(temp==ch)
				count++;
		}
		
		return count;
	}
	
	public static int countChars(String[] str, char ch){
		int count=0;
		
		for(int i=0;i<str.length;i++){
			int strLen=str[i].length();
			for(int j=0;j<strLen;j++){
				if(str[i].charAt(j)==ch)
					count++;
			}
		}
		
		return count;
	}
	
	public static boolean isIncreasing(int[][] arr){
		
		for(int i=0;i<(arr.length);i++){
			for(int j=0;j<(arr[i].length);j++){
				if(i<arr.length-1 && arr[i][j]>=arr[i+1][j])
					return false;
				if(j<arr[i].length-1 && arr[i][j]>=arr[i][j+1])
					return false;
			}
		}
		
		return true;
	}
	
	public static int howMany(int[] arr,int val){
		int count=0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]==val)
				count++;
		}
		
		return count;
	}
	
	public static int howMany(int[][] arr,int val){

		int count=0;
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(arr[i][j]==val)
					count++;
			}
			
		}
		
		return count;
	}

	public static void delimiter(){
		Scanner scan=null;
		int x=0,y=0;
		
		System.out.println("Enter two integers separated by \",\"");
		
		try{
			scan=new Scanner(System.in);//.useDelimiter(",");
			scan.useDelimiter(",");
			/*String line=scan.nextLine();
			String[] linevector=line.split(",");
			x=Integer.parseInt(linevector[0]);
			y=Integer.parseInt(linevector[1]);
			System.out.println(x);
			System.out.println(y);
			*/
			
			if(scan.hasNext()){
				x=scan.nextInt();
				System.out.println(x);        //
				
				if(scan.hasNext()){
					y=scan.nextInt();
					System.out.println(y+" aaa");    //
					
					System.out.println("The max is:"+ Math.max(x, y));
				}
					
				
			}
			
			
		}
		finally{
			if(scan!=null)
				scan.close();
		}
	}

	public static ArrayList<String> startsWith(String[] arr, char ch){
		
		ArrayList<String> str=new ArrayList<String>();
		
		for(int i=0;i<arr.length;i++){
			if(arr[i].charAt(0)==ch){
				str.add(arr[i]);
			}
		}
		return str;
	}

	public static String[] split(String str){
		
		
		Scanner sc=new Scanner(str);
		ArrayList<String> array=new ArrayList<String>();
		while(sc.hasNext()){
			array.add(sc.next());
		}
		
		sc.close();	
		
		String[] arr=new String[array.size()];
		
		for(int i=0;i<arr.length;i++){
			arr[i]=array.get(i);
		}
		
		return arr;
		
	}

	public static String[] getLowerCase(String[] arr){
		
		int len=arr.length;
		String[] lower=new String[len];
		
		for(int i=0;i<len;i++){
			lower[i]=arr[i].toLowerCase();
		}
		
		return lower;
	}
	
	public static void makeLowerCase(String[] arr){
		
		int len=arr.length;
		
		for(int i=0;i<len;i++){
			arr[i]=arr[i].toLowerCase();
		}
	}

	public static ArrayList<String> getLowerCase(ArrayList<String> arr){
		
		int len=arr.size();
		ArrayList<String> lower=new ArrayList<String>();
		for(int i=0;i<len;i++){
			lower.add(arr.get(i).toLowerCase());
		}
		
		return lower;
	}

	public static void makeLowerCase(ArrayList<String> arr){
		
		int len=arr.size();
		
		for(int i=0;i<len;i++){
			arr.set(i, arr.get(i).toLowerCase());
		}
		
	}

	
}


