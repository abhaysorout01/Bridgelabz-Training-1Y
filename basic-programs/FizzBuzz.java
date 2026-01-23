import java.util.Scanner;
public class FizzBuzz{
	public static void main(String[] args){	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number:");
	int a = sc.nextInt();
	int i;
	if(a % 5 == 0 && a % 3 == 0) System.out.println("FizzBuzz");
	else if(a % 3 == 0) System.out.println("Fizz");
	else if(a % 5 == 0) System.out.println("Buzz");
	else {
		for(i = 1;i <= a;i++) {
			System.out.println(a);
		}
	}
	}
	}