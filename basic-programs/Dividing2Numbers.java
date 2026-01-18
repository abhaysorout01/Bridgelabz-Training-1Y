import java.util.Scanner;
public class Dividing2Numbers{
	public static void main(String[] args){	
	Scanner sc = new Scanner(System.in);
	System.out.println("Number 1:");
	int num1 = sc.nextInt();
	System.out.println("Number 2:");
	int num2 = sc.nextInt();
	int quotient = num1 / num2;
	int remainder  = num1 % num2;
	System.out.println("Quotient is " + quotient + " and remainder is " + remainder);
		}
	}