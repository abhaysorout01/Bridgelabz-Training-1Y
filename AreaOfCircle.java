import java.util.Scanner;
class AreaOfCircle{
	public static void main(String[] args){
	System.out.println("Enter the radius of the circle:");
	Scanner sc = new Scanner(System.in);
	int r = sc.nextInt();
	float area = 3.14f * r * r;
	System.out.println("area of the circle: "+ area);
	}
	}