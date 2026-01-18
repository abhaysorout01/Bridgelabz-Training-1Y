import java.util.Scanner;
public class DoubleOpt{
	public static void main(String[] args){	
	Scanner sc = new Scanner(System.in);
	System.out.println("Number 1:");
	double a = sc.nextDouble();
	System.out.println("Number 2:");
	double b = sc.nextDouble();
	System.out.println("Number 3:");
	double c = sc.nextDouble();
	double op1 = a + b * c;
	double op2 = a * b + c;
	double op3 = c + a / b;
	double op4 = a % b + c;
	System.out.println("The results of Double Operations are " + op1 + ", " + op2 + ", " + op3 +" and " + op4);
		}
	}