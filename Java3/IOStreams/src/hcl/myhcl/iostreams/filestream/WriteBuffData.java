package hcl.myhcl.iostreams.filestream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteBuffData {

	public static void main(String[] args) throws IOException {
		String data="My name is Samarpita Mahadani.";
		FileWriter fw = new FileWriter("sample.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		try {
			bw.write(data);
			bw.flush();
			System.out.println("file created");
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			bw.close();
		}

	}

}
