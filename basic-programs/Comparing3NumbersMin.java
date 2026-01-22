import java.util.Scanner;
public class Comparing3NumbersMin{
	public static void main(String[] args){	
	Scanner sc = new Scanner(System.in);
	System.out.println("Number 1:");
	int a = sc.nextInt();
	System.out.println("Number 2:");
	int b = sc.nextInt();
	System.out.println("Number 3:");
	int c = sc.nextInt();
	if(a > b && a > c) {
		System.out.println("Is the first number the largest? Yes");
		System.out.println("Is the second number the largest? No");
		System.out.println("Is the third number the largest? No");
		}
	else if(b > c && b > a) {
		System.out.println("Is the first number the largest? No");
		System.out.println("Is the second number the largest? Yes");
		System.out.println("Is the third number the largest? No");
		}
	else if(c > b && c > a) {
		System.out.println("Is the first number the largest? No");
		System.out.println("Is the second number the largest? No");
		System.out.println("Is the third number the largest? Yes");
		}
	}
	}