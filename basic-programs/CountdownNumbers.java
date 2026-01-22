import java.util.Scanner;
public class CountdownNumbers{
	public static void main(String[] args){	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number:");
	int a = sc.nextInt();   
	while(a > 0) {
		System.out.println(a--);
		}
	}
	}