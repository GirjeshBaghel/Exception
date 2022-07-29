package Exception;
import java.util.Scanner;
public class Multiple_catch_block 
{
	// global variable
	int num1,numn2,res,num2;
	Scanner sc=new Scanner(System.in);
	public void use_of_multi() // this method is calling inside the main method
	{
		try
		{
			// taking a two no from user
			System.out.print("Enter two numbers : ");
			num1=sc.nextInt();
			num2=sc.nextInt();
		
			res=num1/num2;  // div a no
			System.out.println("The div is = " +res);
		
			int[] arr=new int[5]; // taking a from
		
			arr[8]=89; // array index passing variable
		
			System.out.println("The array is = "+arr[8]); // array printing here  
			String demo=null;
			System.out.println("Lenght = "+demo.length()); // string  length printing
		}
		
		// multiple catch block here 
		catch(ArithmeticException ae)
		{
			System.out.println("Second no cannot be zero");
		}
		catch(ArrayIndexOutOfBoundsException ar)
		{
			System.out.println("MSG = "+ar.getMessage());
		}
		catch(Exception e) // parent class of each exception
		{
			System.out.println("MSG = "+e.getMessage());
		}
	}
	
	public static void main(String[] args) // main method
	{
		// TODO Auto-generated method stub
		Multiple_catch_block obj=new Multiple_catch_block(); // object is creating here
		obj.use_of_multi();
	}
}
