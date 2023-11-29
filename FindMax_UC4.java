import java.util.Scanner;

public class FindMax_UC4 <T extends Comparable<T>>  {
	T first;
	T second;
	T third;
	public FindMax_UC4(T x, T y, T z) {
		this.first = x;
		this.second = y;
		this.third = z;
	}
	public T maximum()
	{
		return testMaximum(first, second, third);
	}
	
	public static <T extends Comparable<T>> T testMaximum(T first, T second, T third) {
		T max = first;

		if(second.compareTo(max)>0) {
			max = second;
		}
		if(third.compareTo(max)>0)
		{
			max = third;
		}
		return max;

	}

	public static void main(String[] args) {
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
				
				System.out.println("Maximum  is : " + new FindMax_UC4(first, second, third).maximum());
				
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
				
				System.out.println("Maximum is : " + new FindMax_UC4(first, second, third).maximum());
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
				
				System.out.println("Maximum is : " + new FindMax_UC4(first, second, third).maximum());
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