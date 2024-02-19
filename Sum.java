import java.util.Scanner;
public class Main
{
    public static int sum(int a, int b){ return a+b;}
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a, b;
	    System.out.print("Enter the value of a : ");
	    a = sc.nextInt();
	    System.out.print("Enter the value of b : ");
	    b = sc.nextInt();
		System.out.println("The sum of a and b is "+sum(a,b)+".");
	}
}
