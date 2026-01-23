import java.util.Scanner;
public class MultiplicationTable{
	public static void main(String[] args){	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number:");
	int a = sc.nextInt();
	int i;
	for(i = 6;i < 10;i++) {
		System.out.println(a + " X " + i + " = " + a*i);
	}
	}
	}