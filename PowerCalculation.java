import java.util.Scanner;
class PowerCalculation{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Base of the number:");
	int a = sc.nextInt();
	
	System.out.println("Enter the exponent of the number:");
	int b = sc.nextInt();
	
	double ans = Math.pow(a,b);
	
	
	System.out.println("Calculated Number: "+ ans);
		}
}