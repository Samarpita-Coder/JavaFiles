import java.util.Scanner;
public class InputFromUser {

	public static void main(String[] args) {
		Scanner scnr=new Scanner(System.in);
		//float scores[]= new float[10]; //size is 
		float prices[]= {1,2,3,4,5};
		int user;
		user=scnr.nextInt();
		float scores[]= new float[user];
		int i=0;
		System.out.println("Enter the elements:");
		while(i<user) {
			scores[i]= scnr.nextFloat();
			i++;
		}
		i=0;
		while(i<user) {
			System.out.println(scores[i]);
			i++;
		}
		//for-each loop: specially for arrays
		for(float a:scores) {
			System.out.println(a);
		}
		
		
	}

}
