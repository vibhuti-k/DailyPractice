import java.util.Scanner;
public class Main
{
    public static int sumArr(int[] arr, int n){
        int sum=0;
        for(int i=0; i<n; i++){
            sum += arr[i];
        }
        return sum;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n;
	    System.out.print("Enter the number of element in the array : ");
	    n = sc.nextInt();
	    int[] arr = new int[n];
	    System.out.println("Enter the values of array.");
	    for(int i=0; i < n; i++){
	        System.out.print("Value "+(i+1)+" : ");
	        arr[i] = sc.nextInt();
	    }
	    System.out.println("The sum of all the elements of the array is "+sumArr(arr,n)+".");
	}
}
