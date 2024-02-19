import java.util.Scanner;
public class Main
{
    public static int linearSearch(int[] arr, int n, int k){
        for(int i=0; i<n; i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
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
	    System.out.print("Enter the value to find : ");
	    int k = sc.nextInt();
	    System.out.println("The element is at the "+linearSearch(arr,n,k)+" index.");
	}
}
