package hcl.myhcl.iostreams.filestream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		FileOutputStream fop = new FileOutputStream("readme.txt"); //filename- file will be saved in the workspace only
		String str="JAVA";
		fop.write(str.getBytes()); //getBytes()- convert string to binary format
		fop.flush(); //ensures all characters are written
		fop.close();
		System.out.println("Data has been written");

	}

}
