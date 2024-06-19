/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB5;

/**
 *
 * @author bibek
 */
class MyException extends Exception {
	public MyException(String s)
	{
		// Call constructor of parent Exception
		super(s);
	}
}

public class Assignment5_UserDefinedException {
	public static void main(String args[])
	{
		try {
			// Throw an exception
			throw new MyException("Error occured");
		}
		catch (MyException e) {
			System.out.println("Caught the error");

			// Print the caught error
			System.out.println(e);
		}
	}
}
