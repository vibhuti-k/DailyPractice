import java.util.Scanner;
public class Main
{
    public static int sumArr(int[][] arr, int n, int m){
        int sum=0;
        for(int i=0; i<n; i++){
            for(int j=0; j < m; j++){
                sum += arr[i][j];
            }
        }
        return sum;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n;
	    System.out.print("Enter the number of rows in the array : ");
	    n = sc.nextInt();
	    int m;
	    System.out.print("Enter the number of column in the array : ");
	    m = sc.nextInt();
	    int[][] arr = new int[n][m];
	    System.out.println("Enter the values of array.");
	    for(int i=0; i < n; i++){
	        for(int j=0; j < m; j++){
	            System.out.print("Value : ");
	            arr[i][j] = sc.nextInt();
	        }
	    }
	    System.out.println("The sum of all the elements of the matrix is "+sumArr(arr,n,m)+".");
	}
}
