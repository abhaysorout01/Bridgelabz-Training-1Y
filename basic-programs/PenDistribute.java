public class PenDistribute{
	public static void main(String[] args) {
	int NoOfPen = 14;
	int NoOfPerson = 3;
	int PenPerStudent = NoOfPen / NoOfPerson;
	int RemainingPen = NoOfPen % NoOfPerson;
	System.out.println("The Pen Per Student is " + PenPerStudent + " and the remaining pen not distributed is " + RemainingPen);
	}
}