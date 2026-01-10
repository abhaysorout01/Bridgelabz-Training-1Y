import java.util.Scanner;
class KilometersToMiles{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the distance in kilometers:");
	int a = sc.nextInt();
	
	float d = a * 0.621371f;
	
	System.out.println("Distance in Miles: "+ d);
		}
}