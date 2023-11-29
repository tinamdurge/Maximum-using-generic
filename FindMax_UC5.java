import java.util.Scanner;

public class FindMax_UC5 <T extends Comparable<T>>{
	T first;
	T second;
	T third;
	public FindMax_UC5(T x, T y, T z) {
		this.first = x;
		this.second = y;
		this.third = z;
	}

	public T maximum()
	{
		return testMaximum(first, second, third);
	}
	public static <T extends Comparable<T>> T testMaximum (T x, T y, T z) {
		T max = x; 
		if(y.compareTo(max) > 0) 
		{
			max = y;  
		}
		if(z.compareTo(max) > 0) 
		{
			max = z; 
		}
		printMax (x, y, z, max);
		return max; 
	}

	public static <T> void printMax (T x, T y, T z, T max) {
		System.out.printf("Max of %s, %s and %s is %s\n", x, y, z, max);
	}
	public static void main(String args[]) { 
		Scanner s = new Scanner(System.in);
		int ans;
		do {
			System.out.println("1.Integers\n2.Float\n3.String\nSelect Your Choice: ");
			int ch = s.nextInt();
			switch(ch) {
			case 1:
			{
				System.out.print("Enter First Value: ");
				Integer first = s.nextInt();

				System.out.print("Enter Second Value: ");
				Integer second = s.nextInt();

				System.out.print("Enter Third Value: ");
				Integer third = s.nextInt();
				
				new FindMax_UC5(first, second, third).maximum();
				break;
			}				
			case 2:
			{
				System.out.print("Enter First Value: ");
				Float first = s.nextFloat();

				System.out.print("Enter Second Value: ");
				Float second = s.nextFloat();

				System.out.print("Enter Third Value: ");
				Float third = s.nextFloat();

				new FindMax_UC5(first, second, third).maximum();
				break;
			}
			case 3:
			{
				System.out.print("Enter First Value: ");
				String first = s.next();

				System.out.print("Enter Second Value: ");
				String second = s.next();

				System.out.print("Enter Third value ");
				String third = s.next();

				new FindMax_UC5(first, second, third).maximum();
				break;
			}
			default:
				System.out.println("Enter Choice Between 1 And 3");				
			}
			System.out.println("Do you want to continue ? press 1 for continue");
			ans = s.nextInt();
		}while(ans == 1);		

	}
}