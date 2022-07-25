package Exception;
import java.util.Scanner;
public class Throw_demo 
{
	int num;
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Throw_demo obj=new Throw_demo();
		obj.even_odd();
	}

	public void even_odd()
	{
		try
		{
			System.out.print("Enter a number : ");
			num=sc.nextInt();
			check_demo(num);
		}
		catch (ArithmeticException e)
		{
			System.out.println("MSG = "+ e.getMessage());
		}
	}

	 void check_demo(int num2) 
	 {
		// TODO Auto-generated method stub
		 if(num2 %2==0)
		 {
			 throw new ArithmeticException("It is an even Number ....");
		 }
		 else
		 {
			 throw new ArithmeticException("It is odd");
		 }
		
	}
}