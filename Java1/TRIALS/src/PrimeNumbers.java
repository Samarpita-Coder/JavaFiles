import java.util.Scanner;
public class PrimeNumbers{
    public static void main(String[] args){    	     
           Scanner scnr=new Scanner(System.in);
           int user;
           user=scnr.nextInt();
           int cnt=0;
           int pnum=2;
           while(cnt<user) {
        	   int c=0;
        	   for(int div=2; div<pnum; div++) {
        		   if(pnum%div==0) {
        			   c=1;
        		   }
        	   }
        	   if (c==1) {
        		   System.out.print(pnum +" ");
        		   cnt++;
        	   }
           }
    }
}