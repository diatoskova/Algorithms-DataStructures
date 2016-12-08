import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;


public class Ages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		youngestPerson();
		youngestPersonList();
	}
	
	public static void youngestPersonList(){
		Scanner sc=null;
		ArrayList<String> peopleAndAges=new ArrayList<String>();
		int minimalAge=1000;
		ArrayList<String> youngest=new ArrayList<String>();
		
		try{
			sc=new Scanner(new FileReader("ages.txt"));
			
			while(sc.hasNextLine()){
				peopleAndAges.add(sc.nextLine());
				//System.out.println(sc.nextLine()))
			}
			
			for(int i=0;i<peopleAndAges.size();i++){
				String[] personAge=peopleAndAges.get(i).split("\\s");
				if(personAge.length!=2){
					System.out.println("Missing info");
					return;
				}
				int age=Integer.parseInt(personAge[1]);
				
				if(age==minimalAge){
					youngest.add(personAge[0]);
				}
				if(age<minimalAge){
					minimalAge=age;
					youngest.clear();
					youngest.add(personAge[0]);
				}
			}
			
			if(youngest.size()==1)
				System.out.println("The youngest person is: "+youngest.get(0)+ "("+minimalAge+")");
			else{
				System.out.println("The youngest people are:");
				for(int i=0;i<youngest.size();i++){
					System.out.println(youngest.get(i)+" ("+minimalAge+")");
				}
			}
		}
		catch(FileNotFoundException e){
			System.out.print(e);
		}
		finally{
			if(sc!=null)
				sc.close();
		}
	}
	public static void youngestPerson(){
		
		Scanner sc=null;
		ArrayList<String> peopleAndAges=new ArrayList<String>();
		int minimalAge=1000;
		String youngest="none";
		
		try{
			sc=new Scanner(new FileReader("ages.txt"));
			
			while(sc.hasNextLine()){
				peopleAndAges.add(sc.nextLine());
				//System.out.println(sc.nextLine()))
			}
			
			for(int i=0;i<peopleAndAges.size();i++){
				String[] personAge=peopleAndAges.get(i).split("\\s");
				if(personAge.length!=2){
					System.out.println("Missing info");
					return;
				}
				int age=Integer.parseInt(personAge[1]);
				
				if(age<minimalAge){
					minimalAge=age;
					youngest=personAge[0];
				}
			}
			
			System.out.println("The youngest person is: "+youngest+ "("+minimalAge+")");
			
		}
		catch(FileNotFoundException e){
			System.out.print(e);
		}
		finally{
			if(sc!=null)
				sc.close();
		}
	}

}
