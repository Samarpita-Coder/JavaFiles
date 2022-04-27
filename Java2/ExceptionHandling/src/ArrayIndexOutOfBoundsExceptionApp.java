
public class ArrayIndexOutOfBoundsExceptionApp {

	public static void main(String[] args) {
		int scores[]= {5,4,6,7};
		try{
			System.out.println(scores[4]);
		}catch(ArrayIndexOutOfBoundsException aioobExp) {
			System.out.println(aioobExp);
			System.err.println(aioobExp.getMessage());
		}

	}

}
