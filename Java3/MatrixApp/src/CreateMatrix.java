
public class CreateMatrix {

	public static void main(String[] args) {
		int k = 1;
		
		int arr[][] = new int[3][3];
		  
        // get the elements from user
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = k;
                k++;
            }
        }
        
     // display original matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
  

	}

}
