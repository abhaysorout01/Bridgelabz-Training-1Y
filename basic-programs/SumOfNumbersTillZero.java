import java.util.Scanner;
public class SumOfNumbersTillZero{
	public static void main(String[] args){	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number:");
	int a = sc.nextInt();   
	int sum = 0;
	
	while(a != 0) {
		sum += a;
		a = sc.nextInt();
		}
	
	System.out.println("Sum of your entered numbers is " + sum);
	}
	}