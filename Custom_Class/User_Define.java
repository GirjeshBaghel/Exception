package Exception;

import java.util.Scanner;

public class User_Define {
	public static void main(String[] args)
	{
		User_Define ob = new User_Define();
		ob.excp();
	}
	
	public void excp()
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a no : ");
			int num = sc.nextInt();
			if(num >0)
			{
				throw new User_Exception("The no is greater then Zero");
			}
			else if(num == 0 || num < 0)				
			{
				throw new User_Exception("The no is lesser then Zero");
			}
		}
		catch(Exception e)
		{
			System.out.println("Message : "+e.getMessage());
		}
	}
}
