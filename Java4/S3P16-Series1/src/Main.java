import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=Integer.parseInt(sc.nextLine());
		int ct=0, n=0, i=1, j=1;
		while(n<a) {
			j=1;
			ct=0;
			while(j<=i) {
				if(i%j==0) {
					ct++;
				}
				j++;
			}
			if(ct==2) {
				System.out.print(i + " ");
				n++;
			}	
			i++;
		}
	}
}