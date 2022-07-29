package Exception;
import java.util.Scanner;
public class throws_demo 
{
	// global variable
	int size,i;
	Scanner sc=new Scanner(System.in);
	
	public void demo() throws Exception // demo method 
	{
		System.out.print("Enter a size : "); // entering a size from user
		size=sc.nextInt();
		if(size==0) // if user enter a zero than exception will be throw
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		int arr[]=new int[size]; // taking a array from user
		
		System.out.println("Enter "+size+" numbers");
		for(i=0;i<size;i++) // storing a array from user
		{
			arr[i]=sc.nextInt();
		} 
		System.out.println("The array num is :");
		for(i=0;i<size;i++) // printing an array
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) // main method
	{
		// if exception will be come than catch block handle the exception
		try { 
			throws_demo obj=new throws_demo();
			obj.demo();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
