package project1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.internal.BaseClassFinder;



public class LoginPage extends BaseClass {
	
	
	
		
	
	@BeforeMethod
	public static void launchBrowser()
	{
		System.setProperty(Key, Value);
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");	
	}
	@Test(priority=3)
	@Parameters({"username","password"})
	public static void Login(String username,String password) throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		un = driver.findElement(By.xpath("//input[@id='username']"));
		un.sendKeys(username);
		pw = driver.findElement(By.xpath("//input[@name='pwd']"));
		pw.sendKeys(password,Keys.ENTER);
	}

	@Test(priority=4,dependsOnMethods="Login",dependsOnGroups="login")
	public static void VerifyHomePage() throws InterruptedException
	{
		System.out.println("redirected to homepage");
		
	}
	@Test(priority=2,groups="login")
	public static void Verify() throws InterruptedException
	{
		System.out.println("to check logo in login page");
		
	}
	
	@Test(priority=1,groups="login")
	
	public static void test3()
	{
		System.out.println("to find all the links present in login page");
		
	}
	
	@AfterMethod
	public static void logout() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
	}
}
