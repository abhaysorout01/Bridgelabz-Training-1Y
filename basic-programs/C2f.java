import java.util.Scanner;
class C2f{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the temperature in Celsius:");
	int a = sc.nextInt();
	float f = (a*9/5) + 32;
	System.out.println("Temperature in fahrenheit is:"+ f);
}
}	