import java.util.Scanner;

public class Calculator{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	int sum = num1 + num2;
	int sub = num1 - num2;
	if(sub<0) sub = -sub;
	int mul = num1 * num2;
	float div = (float)num1/num2;
	System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + num1 + " and " + num2 + " is " + sum + " ," + sub + ", " + mul + " and " + div);
	}
}