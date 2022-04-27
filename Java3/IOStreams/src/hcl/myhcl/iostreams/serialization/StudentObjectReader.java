package hcl.myhcl.iostreams.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentObjectReader {

	public static void main(String[] args) throws IOException {
		Student stu[] = new Student[2];
		
		for(int i=0; i<stu.length;i++) {
			stu[i]=null;
		}
		FileInputStream fis = new FileInputStream("Student.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		try {
			for(int i = 0; i<stu.length; i++) {
				stu[i]= (Student) ois.readObject();
				System.out.println(stu[i].getAddress());
				System.out.println(stu[i].getRoll());
				System.out.println(stu[i].getName());
				System.out.println(stu[i].getAge());
			}
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			ois.close();
		}
	}

}
