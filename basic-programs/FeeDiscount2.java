import java.util.Scanner;

public class FeeDiscount2{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int oldFees = sc.nextInt();
	int discount = sc.nextInt();
	float discountP = (float)discount/100;
	float discountedFees = discountP * oldFees;
	float newFees = oldFees - discountedFees;
	System.out.println("The discount amount is " + discountedFees + " INR and final discounted fee is INR " + newFees);
	}
}