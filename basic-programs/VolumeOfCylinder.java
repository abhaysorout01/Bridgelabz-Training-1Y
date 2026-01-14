import java.util.Scanner;
public class VolumeOfCylinder{
	public static void main(String[] args){
	System.out.println("Enter the radius of the cylinder");
	Scanner sc = new Scanner(System.in);
	int r = sc.nextInt();
	System.out.println("Enter the height of the cylinder");
	int h = sc.nextInt();
	float v = (22/7)f * r * r * h;
	System.out.println("Volume of the cylinder: "+v);
	}
	}