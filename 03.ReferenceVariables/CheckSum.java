import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;


public class CheckSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int sum=checksum();
		//System.out.println(sum);
		
		fileinfo();
	}
	
	public static int checksum(){
		
		int sum=0;
		Scanner fReader=null;
		Scanner sc=null;
		System.out.println("Enter a filename:");
		
		
		try{
			sc=new Scanner(System.in);
			String filename=sc.nextLine();
			fReader=new Scanner (new FileReader(filename));
			
			while(fReader.hasNextLine()){
				String line=fReader.nextLine();
				int lineLength=line.length();
				
				for(int i=0;i<lineLength;i++){
					sum+=line.charAt(i);
				}
			}
			
		}
		
		catch(IOException e){
			System.out.println(e);
		}
		
		finally{
			if(fReader!=null)
				fReader.close();
			if(sc!=null)
				sc.close();
		}
		
		
		
		return sum;
	}

public static void fileinfo(){
		
		int charNum=0,wordNum=0,lineNum=0;
		
		
		Scanner fReader=null;
		Scanner sc=null;
		System.out.println("Enter a filename:");
		
		
		try{
			sc=new Scanner(System.in);
			String filename=sc.nextLine();
			fReader=new Scanner (new FileReader(filename));
			
			while(fReader.hasNextLine()){
				lineNum++;
				
				String line=fReader.nextLine();
				String[] words=line.split("\\s");
				wordNum+=words.length;

				int len=words.length;
				
				for(int i=0;i<len;i++){
					charNum+=words[i].length();
				}
			}
			
			
			
		}
		
		catch(IOException e){
			System.out.println(e);
		}
		
		finally{
			if(fReader!=null)
				fReader.close();
			if(sc!=null)
				sc.close();
		}
		System.out.println("Number of characters: "+charNum);
		System.out.println("Number of words: "+wordNum);
		System.out.println("Number of lines: "+lineNum);
		
		
		
	}
}
