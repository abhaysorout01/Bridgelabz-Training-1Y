import java.util.Scanner;
public class DivisibleBy5{
	public static void main(String[] args){	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number:");
	int a = sc.nextInt();
	if(a % 5 == 0) {
		System.out.println("Is the number " + a + " divisible by 5? Yes");
		}
	else {
		System.out.println("Is the number " + a + " divisible by 5? No");
		}
	}
	}