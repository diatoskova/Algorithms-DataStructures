import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		copy("ages.txt","ages.txt");
		copy("ages.txt","ages-Copy.txt");
	}
	
	public static void copy(String file, String copy){
		
		if(file.equals(copy)){
			System.out.print("The two files cannot be the same(or have the same name)");
			return;
		}
		PrintWriter printer=null;
		Scanner sc=null;
		
		try{
			printer=new PrintWriter(new FileWriter(copy));
			sc=new Scanner(new FileReader(file));
			printer.print("");
			while(sc.hasNextLine()){
				printer.println(sc.nextLine());
			}
			
			
			System.out.print("Done.");
		}
		catch(FileNotFoundException e){
			System.out.print(e);
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			if(printer!=null)
				printer.close();
			if(sc!=null)
				sc.close();
		}
	}

}
