package hcl.myhcl.iostreams.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
//writing all kinds of data into file
public class StudentObjectWriter {

	public static void main(String[] args) throws IOException {
		Student[] stu = new Student[2];
		stu[0]=new Student("Samarpita","Lucknow",18,101);
		stu[1]=new Student("Priyanka","Sagar",19,102);
		
		FileOutputStream fos= new FileOutputStream("Student.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		try {
			for(int i=0; i<stu.length; i++) {
				oos.writeObject(stu[i]);
				oos.flush();
			}
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			oos.close();
		}
		
	}

}
