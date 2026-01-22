import java.util.Scanner;
public class NaturalNumberSum{
	public static void main(String[] args){	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number:");
	int a = sc.nextInt();
	double sum = ((a + 1) * a) / 2;   
	if(a > 0) {
		System.out.println("The sum of " + a + " natural numbers is " + sum);
		}
	else {
		System.out.println("The number " + a + " is not a natural number");
		}
	}
	}