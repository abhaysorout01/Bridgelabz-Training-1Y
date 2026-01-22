import java.util.Scanner;
public class SumOfNumbersTillZeroAndNegative{
	public static void main(String[] args){	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number:");
	int a = sc.nextInt();   
	int sum = 0;
	
	while(true) {
		sum += a;
		if(a > 0) {
			a = sc.nextInt();
		} else {
			break;
		}
		}
	
	System.out.println("Sum of your entered numbers is " + sum);
	}
	}