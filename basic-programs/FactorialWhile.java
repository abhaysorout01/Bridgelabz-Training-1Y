import java.util.Scanner;
public class FactorialWhile{
	public static void main(String[] args){	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number:");
	int a = sc.nextInt();
	int factorial = 1;
	int i = 1;
	int a1 = a;
	while(a1 > 0) {
		factorial *= a1;
		a1--;
		}
	if(a >= 0) {
		System.out.println("The factorial of " + a + "  is " + factorial);
		}
	else {
		System.out.println("The number " + a + " is not a positive number");
		}
	}
	}