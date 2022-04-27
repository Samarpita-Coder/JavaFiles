package hcl.myhcl.iostreams.filestream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CharFileReader {

	public static void main(String[] args) throws IOException {
		FileReader fr=null;
		char arr[]=new char[100];
		try {
			fr=new FileReader("empchar.txt");
			//read char one by one and store in array
			fr.read(arr);
			long len=new File("empchar.txt").length();
			System.out.println("File size: "+len);
			System.out.println(arr);
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			fr.close();
		}

	}

}
