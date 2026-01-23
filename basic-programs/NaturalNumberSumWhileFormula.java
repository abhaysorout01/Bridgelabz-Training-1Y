import java.util.Scanner;
public class NaturalNumberSumWhileFormula{
	public static void main(String[] args){	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number:");
	int a = sc.nextInt();
	double sum = ((a + 1) * a) / 2;   
	double sumwhile = 0;
	int a1 = a;
	while(a1>0){
		sumwhile += a1;
		a1--;
		}
	if(a > 0) {
		System.out.println("The sum of " + a + " natural numbers using formula is " + sum);
		System.out.println("The sum of " + a + " natural numbers using while loop is " + sumwhile);
		}
	else {
		System.out.println("The number " + a + " is not a natural number");
		}
	}
	}