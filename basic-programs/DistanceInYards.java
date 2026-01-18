import java.util.Scanner;
public class DistanceInYards{
	public static void main(String[] args){	
	Scanner sc = new Scanner(System.in);
	double feet = sc.nextDouble();
	double totalyards = feet / 3.0f;
	double totalmiles = totalyards / 1760.0f;
	int miles = (int) totalyards / 1760;
	double yards = (totalmiles - miles) * 1760.0f;
	System.out.println("The length in Miles is " + miles + " and yards is " + yards);
		}
	}