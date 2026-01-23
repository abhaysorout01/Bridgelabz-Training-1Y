import java.util.Scanner;

public class AbundentNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        int temp = number;
		int i;
        for(i = 1;i <temp;i++) {
			if(temp % i == 0) sum += i;
			}
        if (number < sum) {
            System.out.println("Abundent Number" + sum);
        } else {
            System.out.println("Not a Abundent Number" + sum);
        }
    }
}
