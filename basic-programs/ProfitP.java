public class ProfitP{
	public static void main(String[] args) {
	int costprice = 129;
	int sellingprice = 191;
	int profit = sellingprice - costprice;
	float profitP = (float) profit/costprice * 100;
	System.out.println("The Cost Price is 129 INR and Selling Price is 191 INR \nThe Profit is " + profit + " INR and the Profit Percentage is"+ profitP + "%");
	}
}