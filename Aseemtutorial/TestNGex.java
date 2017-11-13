import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGex {

	@Test (priority=0)
	public void testReceiveMail()
	{
		System.out.println("Test receivemail");
		//System.out.println("TestCase one with theread ID:-" + Thread.currentThread().getId());
	}
	@Test (priority=2)
	public void testSendMail()
	{
		System.out.println("Test sendemail");
		//System.out.println("TestCase one with theread ID:-" + Thread.currentThread().getId());
	}
	@BeforeMethod
	public void Inbeforemethod()
	{
		System.out.println("Inbeforemethod");
		//System.out.println("TestCase one with theread ID:-" + Thread.currentThread().getId());
	}
	
	@AfterMethod
	public void Inaftermethod()
	{
		System.out.println("Inaftermethod");
		//System.out.println("TestCase one with theread ID:-" + Thread.currentThread().getId());
	}
	
	@BeforeTest
	public void Inbeforemethod1()
	{
		System.out.println("BeforeTest");
		//System.out.println("TestCase one with theread ID:-" + Thread.currentThread().getId());
	}
	
	@AfterTest
	public void Inaftermethod2()
	{
		System.out.println("AfterTest");
		//System.out.println("TestCase one with theread ID:-" + Thread.currentThread().getId());
	}
}
