//static inner class belongs to the class, not the outer object
public class OuterClassAndStaticInnerClass {
	
	//we cannot access non static methods inside static inner class
	
	private static int outerX=2;

	
	static class StaticInnerClass {
		
		public static int innerX=3;
		
		public static void showX() {
			System.out.println(innerX+outerX);
	}
	
	}
}

