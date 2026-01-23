import java.util.Scanner;
public class SalaryBonus{
	public static void main(String[] args){	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Service Years:");
	int y = sc.nextInt();
	System.out.println("Enter the Salary:");
	int sal = sc.nextInt();
	double bonus;
	if(y>5) bonus = 0.05f * sal;
	else bonus = 0 * sal;
	System.out.println("your bonus is: " + bonus);
	}
	}