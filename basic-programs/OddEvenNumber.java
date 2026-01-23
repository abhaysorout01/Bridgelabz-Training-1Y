import java.util.Scanner;
public class OddEvenNumber{
	public static void main(String[] args){	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number:");
	int a = sc.nextInt();
	int i = 1;
	System.out.println("Odd Numbers: ");
	for(i = 1;i <= a;i++) {
		if(i % 2 != 0) {
			System.out.println(i);
			}
	}
	System.out.println("Even Numbers: ");
	for(i = 1;i <= a;i++) {
		if(i % 2 == 0) {
			System.out.println(i);
			}
	}
	}
	}