import java.util.Scanner;
public class CountdownNumbersForLoop{
	public static void main(String[] args){	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number:");
	int a = sc.nextInt();   
	int i;
	for(i = a;i >= 1;i--) {
		System.out.println(i);
		}
	}
	}