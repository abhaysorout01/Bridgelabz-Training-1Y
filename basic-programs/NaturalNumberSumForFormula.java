import java.util.Scanner;
public class NaturalNumberSumForFormula{
	public static void main(String[] args){	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number:");
	int a = sc.nextInt();
	double sum = ((a + 1) * a) / 2;   
	double sumfor = 0;
	int i =0;
	for(i = 1;i <= a;i++) {
		sumfor += i;
		}
	if(a > 0) {
		System.out.println("The sum of " + a + " natural numbers using formula is " + sum);
		System.out.println("The sum of " + a + " natural numbers using for loop is " + sumfor);
		}
	else {
		System.out.println("The number " + a + " is not a natural number");
		}
	}
	}