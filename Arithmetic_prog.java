package Exception;
import java.util.Scanner;

public class Arithmetic_prog {

	int num1,num2,res;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Arithmetic_prog obj=new Arithmetic_prog();
		obj.Div_pro();

	}
	public void Div_pro()
	{
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number :");
		num1=sc.nextInt();
		num2=sc.nextInt();
		res=num1/num2;
		System.out.println("The div is = "+res);
		res=num1+num2;
		System.out.println("The add is = "+res);
		}
		catch(Exception e)
		{
			//System.out.println("The MSG="+e.getMessage());
			System.out.println("The second no cannbot ne zero .   :)"+e.getMessage());
		}
	}

}
