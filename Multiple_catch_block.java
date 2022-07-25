package Exception;

import java.util.Scanner;
public class Multiple_catch_block 
{
	int num1,numn2,res,num2;
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Multiple_catch_block obj=new Multiple_catch_block();
		obj.use_of_multi();
	}

	public void use_of_multi()
	{
		try
		{
			System.out.print("Enter two numbers : ");
			num1=sc.nextInt();
			num2=sc.nextInt();
		
			res=num1/num2;
			System.out.println("The div is = " +res);
		
			int[] arr=new int[5];
		
			arr[8]=89;
		
			System.out.println("The array is = "+arr[8]);
			String demo=null;
			System.out.println("Lenght = "+demo.length());
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Second no cannot be zero");
		}
		catch(ArrayIndexOutOfBoundsException ar)
		{
			System.out.println("MSG = "+ar.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("MSG = "+e.getMessage());
		}
	}
}