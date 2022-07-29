package Exception;
import java.util.Scanner;

public class User_Define {
		
	public void excp() // excp method checking a no is greater than zero
	{
		try 
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a no : "); // taking a no from user
			int num = sc.nextInt();
			if(num >0) // no is greater than zero
			{
				throw new User_Exception("The no is greater then Zero"); 
			}
			else if(num == 0 || num < 0)	// no is less than zero			
			{
				throw new User_Exception("The no is lesser then Zero");
			}
		}
		catch(Exception e) // if exception is throw than catch block is catched 
		{
			System.out.println("Message : "+e.getMessage());
		}
	}
	public static void main(String[] args) // main method
	{
		User_Define ob = new User_Define(); 
		ob.excp();
	}
	
}
