import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a filename that contains the exam scores:");
		Scanner sc=new Scanner(System.in);
		String scoresFile=sc.next();
		printGrades(scoresFile);
		sc.close();
	}
	
	public static void printGrades(String scoresFile){
		
		Scanner sc=null;
		char grade;
		int[] statistics=new int[5];
		ArrayList<String> fileInfo=new ArrayList<String>();
		Scanner f=null;
		PrintWriter scan1=null;
		
		try{
			sc=new Scanner(new FileReader(scoresFile));
			ArrayList<String> grades=new ArrayList<String>();
			
			while(sc.hasNextLine()){
				String line=sc.nextLine();
				String[] info=line.split(":");
				if(info.length!=5){
					System.out.print("Missing information about a student.");
					return;
				}
				grade=grade(info);
				grades.add(info[0]+" "+info[1]+" "+grade);
				fileInfo.add(info[0]+" "+info[1]+" "+info[2]+" "+info[3]+" "+info[4]+" "
			                  +totalPointsGenerous(info)+" "+grade);
				
				if(grade=='A')
					statistics[0]++;
				else if(grade=='B')
					statistics[1]++;
				else if(grade=='C')
					statistics[2]++;
				else if(grade=='D')
					statistics[3]++;
				else if(grade=='F')
					statistics[4]++;
				
			}
			
			for(int i=0;i<grades.size();i++){
				System.out.println(grades.get(i));
			}
			
			System.out.println("Enter a filename to save the scores:");
			f=new Scanner(System.in);
			String fileGrades=f.next();
			scan1=new PrintWriter( new FileWriter(fileGrades));
			scan1.print(""); //to clear the content of the file, if it is already existing
			
			for(int i=0;i<fileInfo.size();i++){
				scan1.println(fileInfo.get(i));
			}
			scan1.println("A "+statistics[0]);
			scan1.println("B "+statistics[1]);
			scan1.println("C "+statistics[2]);
			scan1.println("D "+statistics[3]);
			scan1.println("F "+statistics[4]);
			
			
		}
		catch(FileNotFoundException e){
			System.out.print(e);
		}
		catch(IOException e){
			System.out.print(e);
		}
		finally{
			if(sc!=null)
				sc.close();
			if(f!=null)
				f.close();
			if(scan1!=null)
				scan1.close();
		}
	}
	
	public static char grade(String[] info){
		char grade = 'F';
		
		
		
		double totalPoints=totalPointsGenerous(info);
		if(totalPoints>=90)
			grade='A';
		else if(totalPoints>=80)
			grade='B';
		else if(totalPoints>=70)
			grade='C';
		else if(totalPoints>=60)
			grade='D';
		else
			grade='F';
		
		return grade;
	}

	public static int totalPoints(String[] info){
		
		double points=Double.parseDouble(info[2])*0.2+Double.parseDouble(info[3])*
                      0.25+Double.parseDouble(info[4])*0.55;
		
		
		return (int)points;
	}
	
	public static int totalPointsGenerous(String[] info){
		double highest=0;
		double middle=0;
		double lowest=0;
		
		double a=Double.parseDouble(info[2]);
		double b=Double.parseDouble(info[3]);
		double c=Double.parseDouble(info[4]);
		
		highest=highest(a,b,c);
		lowest=lowest(a,b,c);
		middle=middle(a,b,c);
		
		
		double points=highest*0.45+middle*0.3+lowest*0.25;
		
		
		return (int)points;
	}
	public static double highest(double a,double b,double c){
		double max=c;
		
		if(a>max)
			max=a;
		if(b>max)
			max=b;
		
		return max;
	}
	public static double lowest(double a, double b,double c){
		double min=c;
		
		if(a<min)
			min=a;
		if(b<min)
			min=b;
		
		return min;
	}
	public static double middle(double a, double b, double c){
		
		double max=highest(a,b,c);
		double min=lowest(a,b,c);
		
		if(a<max && a>min)
			return a;
		else if(b<max && b>min)
			return b;
		else
			return c;
		
		
	}
}
