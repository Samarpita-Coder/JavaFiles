package hcl.myhcl.iostreams.filestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;

public class CSVFormRead {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("emp.txt");
		try {
			System.out.println("File size: "+fis.available());
			String str=new String();
			int ind=0;
			byte byteData;
			char ch;
			
			do {
				byteData=(byte)fis.read();
				if(byteData==-1) {
					System.out.println("reached eof");
					System.out.println("Data is in str");
				}else {
					ch=(char)byteData;
					str=str+ch;
				}
			}while(byteData!=-1);
			
			//complete data stored in String str
			String arr[]=str.split("\n");
			System.out.println("First entry");
			System.out.println(arr[0]);
			System.out.println("Second entry");
			System.out.println(arr[1]);
			
			System.out.println("To further extract the information from the entries:");
			
			for(int i=0; i<arr.length; i++) {
				StringTokenizer st = new StringTokenizer(arr[i],",");
				while(st.hasMoreTokens()) {
					System.out.println(st.nextToken());
				}
			}
			
			
			
			
		}catch(Exception e) {
			System.out.println("Error"+e);
		}finally {
			fis.close();
		}
		
		
		
	}

}
