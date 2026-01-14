import java.util.Scanner;

public class Height{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double heightcm = sc.nextDouble();
	double heightinch = 0.393701f * heightcm;
	int feet = (int)heightinch / 12;
	double reminches = heightinch % 12;
	System.out.println("Your Height in cm is " + heightcm + " while in feet is " + feet + " and inches is " + reminches);
	}
}