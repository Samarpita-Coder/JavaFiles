import java.util.StringTokenizer;
public class StringTokenizerApp {

	public static void main(String[] args) {
		String str = "Hello Sam";
		StringTokenizer st = new StringTokenizer(str);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		String s = "Hello, Sam";
		//delimiter
		StringTokenizer st2 = new StringTokenizer(s,",");
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
	}

}
