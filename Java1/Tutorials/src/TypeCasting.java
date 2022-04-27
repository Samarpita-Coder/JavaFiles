//widening casting- smaller to larger type: byte>short>long>float>double (automatic)(values can go into these types)
//narrowing casting- opposite
public class TypeCasting {

	public static void main(String[] args) {
		//widening
		int mark=97;
		double marks=mark; //int to double-- when mark assigned to marks
		System.out.println(mark);
		System.out.println(marks);
		//narrowing
		double dmarks=97.67;
		int imarks=(int) dmarks;
		System.out.println(dmarks);
		System.out.println(imarks);
		
		
		
		

	}

}
