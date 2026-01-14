import java.util.Scanner;
public class KiloToMiles{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double km = sc.nextFloat();
	double miles = (float)km * 1.6f;
	System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
	}
}