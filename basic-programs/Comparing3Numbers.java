import java.util.Scanner;
public class Comparing3Numbers{
	public static void main(String[] args){	
	Scanner sc = new Scanner(System.in);
	System.out.println("Number 1:");
	int a = sc.nextInt();
	System.out.println("Number 2:");
	int b = sc.nextInt();
	System.out.println("Number 3:");
	int c = sc.nextInt();
	if(a < b && a < c) {
		System.out.println("Is the first number the smallest? Yes");
		}
	else {
		System.out.println("Is the first number the smallest? No");
		}
	}
	}