import java.util.*;
class recursion{
    int fact(int n){
        if(n <= 1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
}

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    recursion rec = new recursion();
	    System.out.print("Enten the number to find factorial : ");
	    int n = sc.nextInt();
	    System.out.println("The factorial of "+n+" is "+rec.fact(n));
	}
}
