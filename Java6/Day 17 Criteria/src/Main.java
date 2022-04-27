import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int user = sc.nextInt();
		int incr = 3;
		int inc=3;
		if(user%2==0) {
			int firstArr[] = new int[(user/2)];
			int secArr[] = new int[(user/2)];
			firstArr[0]=0;
			for(int i=1; i<(user/2); i++) {
				firstArr[i]=firstArr[i-1]+incr;
				incr=incr+2;
			}
			secArr[0]=2;
			for(int i=1; i<(user/2); i++) {
				secArr[i]=secArr[i-1]+inc;
				inc=inc+2;
			}
			for(int i=0; i<(user/2); i++) {
				System.out.print(firstArr[i]+" "+secArr[i]+" ");
			}
		}else {
			int firstArr[] = new int[(user/2)+1];
			int secArr[] = new int[(user/2)];
			firstArr[0]=0;
			for(int i=1; i<(user/2)+1; i++) {
				firstArr[i]=firstArr[i-1]+incr;
				incr=incr+2;
			}
			secArr[0]=2;
			for(int i=1; i<(user/2); i++) {
				secArr[i]=secArr[i-1]+inc;
				inc=inc+2;
			}
			for(int i=0; i<(user/2); i++) {
				System.out.print(firstArr[i]+" "+secArr[i]+" ");
			}
			System.out.print(firstArr[(firstArr.length)-1]);
			
		}
		
		
		
	}

}
