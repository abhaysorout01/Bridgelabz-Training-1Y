import java.util.Scanner;
public class TotalPrice{
	public static void main(String[] args){	
	Scanner sc = new Scanner(System.in);
	System.out.println("Unit price:");
	double unitprice = sc.nextDouble();
	System.out.println("Quantity:");
	double quantity = sc.nextDouble();
	double totalprice = unitprice * quantity;
	System.out.println("The total purchase price is INR " + totalprice + " if the quantity " + quantity + " and unit price is INR " + unitprice);
		}
	}