import java.util.Scanner;
class AverageOf3Numbers{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the first number:");
	int a = sc.nextInt();
	
	System.out.println("Enter the second number:");
	int b = sc.nextInt();
	
	System.out.println("Enter the third number:");
	int c = sc.nextInt();
	
	float d = (a + b + c)/3;
	
	
	System.out.println("Average Of 3 Numbers: "+ d);
		}
}