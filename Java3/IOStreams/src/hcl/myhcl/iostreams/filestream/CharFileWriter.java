package hcl.myhcl.iostreams.filestream;

import java.io.FileWriter;
import java.io.IOException;

public class CharFileWriter {

	public static void main(String[] args) throws IOException {
		String data="samarpita,18,student";
		FileWriter fw=null;
		try {
			fw=new FileWriter("empchar.txt");
			//writes string to file
			fw.write(data);
			fw.flush();
			System.out.println("File created");
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			fw.close();
		}

	}

}
