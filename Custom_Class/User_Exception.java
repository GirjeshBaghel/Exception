package Exception;
// User_Exception class  
public class User_Exception extends Exception {

	User_Exception(String msg) // construtor calling by the another class
	{
		super(msg); // super method passing the message to parent class
	}
}
