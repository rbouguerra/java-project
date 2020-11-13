package part5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsKeyword {

	
	//FileNotFoundException changed by IOException bcz IOException is supper class
	public static void main(String[] args) throws IOException, InterruptedException {
		
		FileReader fr=null;
		fr=new FileReader("path to file/test.txt");
		
		BufferedReader bfr= new BufferedReader(fr);
		System.out.println(bfr.readLine());
		Thread.sleep(2000);
		
		

	}

}
