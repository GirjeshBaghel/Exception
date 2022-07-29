package Exception;
import java.util.Scanner;
public class Throw_demo 
{
	int num;
	Scanner sc=new Scanner(System.in);

	public void even_odd() // even_odd method
	{
		try 
		{
			System.out.print("Enter a number : "); // taking a no from user
			num=sc.nextInt();
			check_demo(num); // check_demo method is calling
		}
		catch (ArithmeticException e) // catching an exception
		{
			System.out.println("Message = "+ e.getMessage());
		}
	}

	 void check_demo(int num2) // this method is calling by the even method
	 {
		 if(num2 %2==0) // logic of even no 
		 {
			 throw new ArithmeticException("It is an even Number ...."); // throwing a exception 
		 }
		 else // odd no exception printing
		 {
			 throw new ArithmeticException("It is odd"); // throwing a exception 
		 }
	}
	public static void main(String[] args) // main method 
	{
		// TODO Auto-generated method stub
		Throw_demo obj=new Throw_demo(); 
		obj.even_odd();
	}
}
