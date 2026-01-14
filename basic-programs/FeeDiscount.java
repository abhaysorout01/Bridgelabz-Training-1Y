public class FeeDiscount{
	public static void main(String[] args) {
	int oldFees = 125000;
	int discount = 10;
	float discountP = (float)discount/100;
	float discountedFees = discountP * oldFees;
	float newFees = oldFees - discountedFees;
	System.out.println("The discount amount is " + discountedFees + " INR and final discounted fee is INR " + newFees);
	}
}