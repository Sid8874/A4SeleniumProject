package org.Sample;

import org.testng.annotations.Test;

public class Sample2 {

	@Test(priority=1,invocationCount=7)
	public void createUser()
	{
		System.out.println("User created!!");
	}
	@Test(priority=2,dependsOnMethods={"createUser"})
	public void modifiedUser()
	{
		System.out.println("User modified!!");
	}
	@Test(priority=3)
	public void deleteUser()
	{
		System.out.println("User deleted!!");
	}
}
