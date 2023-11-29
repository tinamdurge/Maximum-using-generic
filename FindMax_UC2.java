import java.util.Scanner;

public class FindMax_UC2 {
	static Float  a,b,c;
	public void getInput() {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter First Value: ");
		a = s.nextFloat();

		System.out.print("Enter Second Value: ");
		b = s.nextFloat();

		System.out.print("Enter Third Value: ");
		c = s.nextFloat();

	}
	public Float testMaximum(Float x, Float y, Float z) {
		Float max = x;
		if(y.compareTo(max)>0) {
			max = y;
		}
		else if(z.compareTo(max)>0)
		{
			max = z;
		}
		return max;
	}

	public static void main(String[] args) {
		FindMax_UC2 u = new FindMax_UC2();
		Float max ;
		u.getInput();
		max = u.testMaximum(a, b, c);
		System.out.println("Maxmum value is : " + max);

	}
}