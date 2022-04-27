import java.io.IOException;

public class CharReader {

	public static void main(String[] args) throws IOException {
		//read char value:
		char ch= (char) System.in.read();
		//System.in.read returns int type
		System.out.println("You entered: "+ch);
		int ival=ch;
		System.out.println("int equilavent value of ch is: "+ival);
	}

}
