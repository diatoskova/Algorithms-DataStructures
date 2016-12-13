package Exersises;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;


public class Compressor {

	private static final String Compressed_FILE="testfile.gz";
	private static final String FILE="testfile.txt";
	private static final String Output_FILE="outputfile.txt";
	
	 public static void main( String[] args ) throws IOException
	 {
		 Compressor gZip=new Compressor();
		 gZip.zip();
		 gZip.unzip();
	 }
	 
	 public void zip() throws IOException
	 {
		 byte[] buffer=new byte[1024];
		 GZIPOutputStream gzos=null;
		 FileInputStream in=null;
		 
		 try
		 {
			 gzos=new GZIPOutputStream(new FileOutputStream(Compressed_FILE));
			 
			 in=new FileInputStream(FILE);
			 
			 int len;
			 //reads buffer.length bytes from this input stream into an array of bytes
			 while( (len=in.read(buffer))>0 )
			 {
				 //writing an array of bytes to the compressed file
				 gzos.write(buffer,0,len);
			 }
			 
			 gzos.finish();
			
			 System.out.println("Done");
		 }
		 catch(IOException e)
		 {
			 e.printStackTrace();
		 }
		 finally
		 {
			 in.close();
			 gzos.close();
		 }
	 }

	 public void unzip()
	 {
		 byte[] buffer=new byte[1024];
		 try{
			 GZIPInputStream gzis=new GZIPInputStream(new FileInputStream(Compressed_FILE));
			 
			 FileOutputStream out=new FileOutputStream(Output_FILE);
			 
			 int len;
			 
			 while((len=gzis.read(buffer))>0)
			 {
				 out.write(buffer,0,len);
			 }
			 
			 gzis.close();
			 out.close();
			 
			 System.out.println("Done unzipping.");
		 }
		 catch(IOException e)
		 {
			 e.printStackTrace();
		 }
	 }

}
