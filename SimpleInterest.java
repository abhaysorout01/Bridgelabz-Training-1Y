import java.util.Scanner;
class SimpleInterest{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Principal:");
	float p = sc.nextFloat();
	
	System.out.println("Enter the Rate:");
	float r = sc.nextFloat();
	
	System.out.println("Enter the Time:");
	float t = sc.nextFloat();
	
	float s = (p * r * t)/100;
	
	System.out.println("Total Simple Interest: "+ s);
	}
	}