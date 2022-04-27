package hcl.myhcl.iostreams.filestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class CSVFormWrite {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("emp.txt");
		
		String str1="Samarpita,WB,Student\n";
		String str2="Priyanka,Bihar,Teacher\n";
		
		try {
			fos.write(str1.getBytes());
			fos.flush();
			fos.write(str2.getBytes());
			fos.flush();
			
			System.out.println("Data has been written.");
		}catch(Exception e) {
			System.out.println("Error"+e);
		}finally {
			fos.close();
		}

	}

}
