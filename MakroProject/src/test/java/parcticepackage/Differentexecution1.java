package parcticepackage;

import org.testng.annotations.Test;

public class Differentexecution1 {
	@Test
	public void createCustomerTest()
	{
		System.out.println("custmer account created successfully");
	}
	
	public void modifyCustomerTest()
	{
		System.out.println("modify customer successfully");
	}
	
	public void deleteCustomerTest()
	{
		System.out.println("deleted customer account successfully");
	}

}
