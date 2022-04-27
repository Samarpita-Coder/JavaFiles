package hcl.myhcl.iostreams.filestream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadBuffData {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("sample.txt");
		BufferedReader br = new BufferedReader(fr);
		File file = new File("sample.txt");
		char arr[]= new char[(int)file.length()];
		try {
			br.read(arr);
			System.out.println(arr);
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			br.close();
		}
		

	}

}
