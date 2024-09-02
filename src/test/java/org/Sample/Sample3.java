package org.Sample;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Sample3 {
	@Test
	public void createUser()
	{
		System.out.println("User created!!");
	}
	@Test(enabled=false)
	public void modifiedUser()
	{
		System.out.println("User modified!!");
	}
	//@Ignore
	
	@Test(invocationCount=0)
	public void deleteUser()
	{
		System.out.println("User deleted!!");
	}
}
