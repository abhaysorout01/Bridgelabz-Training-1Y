import java.util.Scanner;
public class AreaOfTriangle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int b = sc.nextInt();
		double area = 0.5f * h * b;
		System.out.println("Area of the triangle is " + area);
		}
	}