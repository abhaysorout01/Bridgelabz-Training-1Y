import java.util.Scanner;
public class SpringSeason{
	public static void main(String[] args){	
	Scanner sc = new Scanner(System.in);
	System.out.println("Date:");
	int date = sc.nextInt();
	System.out.println("Month:");
	int month = sc.nextInt();
	if(month == 3 && date >= 20 && date <= 31) {
		System.out.println("Spring Season");
		}
	else if(month == 4 && date >= 1 && date <= 30) {
		System.out.println("Spring Season");
		}
	else if(month == 5 && date >= 1 && date <= 31) {
		System.out.println("Spring Season");
		}
	else if(month == 6 && date >= 1 && date <= 20) {
		System.out.println("Spring Season");
		}
	else {
			System.out.println("Not a Spring Season");
	}
	}
	}