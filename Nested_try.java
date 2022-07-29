package Exception;
import java.util.Scanner;
public class Nested_try {
	// global variable
	int num1,numn2,res,num2;
	Scanner sc=new Scanner(System.in);
	
	Nested_try() // constructor
	{
		try // try block to taking an exception
		{
			System.out.println("Enter two numbers"); // taking a two no from user
			num1=sc.nextInt();
			num2=sc.nextInt();
		
			res=num1/num2; // division a no here
			System.out.println("The div is="+res); // printing a result here
			try // nested try block
			{
				String demo=null; 
				System.out.println("Lenght="+demo.length());
			}
			catch(Exception e) // catching an exception
			{
				System.out.println("MSG="+e.getMessage());
			}
		}
		catch(ArithmeticException ae) // arithmethmetic exception is catched here only
		{
			System.out.println("The second no cannot be zero");
		}
		finally  // finally block run here
		{
			System.out.println("This is my finally block :)");
			
		}
		
	}
	
	public static void main(String[] args) // main method
	{
		// TODO Auto-generated method stub
		Nested_try obj=new Nested_try();
	}
}
