package project1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseClass {

	public static String Key="webdriver.chrome.driver";
	public static String Value="./driver/chromedriver.exe";
	
	public static WebDriver driver;
	public static Workbook workbook;
	public static String path=null;
	public static Sheet sheet;
	public static Row row;
	public static JavascriptExecutor jse;
	public static WebElement un=null;
	public static WebElement pw= null;
	
}
