import java.util.Scanner;

public class CalculateBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the weight(in Kg) : ");
        double weight = sc.nextInt();

		System.out.print("Enter the height(in cm) : ");
        double heightcm = sc.nextInt();
		double heightm = heightcm/100.0;
        double BMI = weight / (heightm * heightm);
		
		if(BMI <= 18.4) System.out.print("Underweight");
		else if(BMI >= 18.5 && BMI <= 24.9) System.out.print("Normal");
		else if(BMI >= 25.0 && BMI <= 39.9) System.out.print("Overweight");
		else System.out.print("Obese");


    }
}
