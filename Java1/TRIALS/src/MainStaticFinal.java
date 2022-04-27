//autoboxing- automatic conversion of primitive type into its corresponding wrapper class

public class MainStaticFinal {
	
	
	public static void main(String[] args) {
		System.out.println(StaticFinal.tollFreeNumber);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Float.MAX_EXPONENT);
		System.out.println(Double.MAX_EXPONENT);
		System.out.println(double.class);
		

		short num=1;
		//Integer s = num;	//here we have to type cast first
		Integer s = (int)num;//TYPECASTING
		//wrapper class will have corresponding value (type) only
		short num2=2;
		int s2 = num2;	//this is fine- because short value is smaller than int
		int abc=3;
		short abc2=abc;	//this is wrong....we have to typecast
		
		//autoboxing
		Integer n = 2;	//typecasting not needed...because value if of int type and can be stored in Integer wrapper class
		
		
	}

}
