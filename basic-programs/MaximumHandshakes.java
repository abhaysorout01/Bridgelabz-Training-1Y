import java.util.Scanner;
public class MaximumHandshakes{
	public static void main(String[] args){	
	Scanner sc = new Scanner(System.in);
	System.out.println("Number of persons:");
	int persons = sc.nextInt();
	double handshakes = ((persons - 1) * persons ) / 2.0f;
	System.out.println("Maximum numbers of handshakes: " + handshakes);
		}
	}