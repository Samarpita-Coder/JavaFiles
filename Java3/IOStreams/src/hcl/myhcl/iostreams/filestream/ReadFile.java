package hcl.myhcl.iostreams.filestream;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("readme.txt");
		//every file has End OF File character as -1.
		byte byteData;
		do {
			byteData=(byte) fis.read();
			if(byteData==-1) {
				System.out.println("\nreached end of file");
			}else {
				System.out.println((char)byteData);
			}
		}while(byteData!=-1);
		fis.close();

	}

}
