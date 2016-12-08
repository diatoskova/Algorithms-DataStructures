import java.util.Scanner;
import java.io.IOException;

public class Suffix {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two strings on separate lines:");
		
		try{
			String str1=sc.nextLine();
			String str2=sc.nextLine();
			boolean suf=suffixOf(str1,str2);
			System.out.println("Is \""+str1+"\" suffix of \""+str2+"\": "+suf);
		}
		finally{
			if(sc!=null)
				sc.close();
		}
	}
	
	public static boolean suffixOf(String str1, String str2){
		
		int len1=str1.length();
		int len2=str2.length();
		
		if(len1>len2)
			return false;
		
		for(int i=0;i<=len1-1;i++){
			if(str2.charAt(len2-i)!=str1.charAt(len1-i))
				return false;
		}
		
		
		return true;
	}

}
