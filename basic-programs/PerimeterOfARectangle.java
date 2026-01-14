import java.util.Scanner;
class PerimeterOfARectangle{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Length of the rectangle:");
	float l = sc.nextFloat();
	
	System.out.println("Enter the Breadth of the rectangle:");
	float b = sc.nextFloat();
	
	float a = (l + b) * 2;
	
	System.out.println("Perimeter Of A Rectangle: "+ a);
		}
}