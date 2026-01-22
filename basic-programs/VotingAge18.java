import java.util.Scanner;
public class VotingAge18{
	public static void main(String[] args){	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number:");
	int age = sc.nextInt();  
	if(age >= 18) {
		System.out.println("The person's age is " + age + " and can vote.");
		}
	else {
		System.out.println("The person's age is " + age + " and cannot vote.");
		}
	}
	}