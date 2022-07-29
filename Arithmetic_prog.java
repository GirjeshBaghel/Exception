package Exception;
import java.util.Scanner;

public class Arithmetic_prog {

	int num1,num2,res; // global variable
	public static void main(String[] args) // main method 
	{
		// TODO Auto-generated method stub
		Arithmetic_prog obj=new Arithmetic_prog();
		obj.Div_pro(); // Div_pro method is calling

	}
	public void Div_pro() // div_pro method 
	{
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number :"); // taking a two no  from user
		num1=sc.nextInt();
		num2=sc.nextInt();
		res=num1/num2; // division a no here
		System.out.println("The div is = "+res);
		res=num1+num2; // addition a no here
		System.out.println("The add is = "+res);
		}
		catch(Exception e) // catch block to handle the exception
		{
			//System.out.println("The MSG="+e.getMessage());
			System.out.println("The second no cannbot ne zero .   :)"+e.getMessage());
		}
	}

}
