package abu;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;


public class syed 
{	
	public static String ux;
	
	public static WebDriver myD;
	 
	public static String func(String m) throws IOException
	{
		myD.manage().window().maximize();
		myD.get(m);
		System.out.println("Title is: " +myD.getTitle());
		System.out.println("URL is : "+myD.getCurrentUrl());
		ux = myD.getCurrentUrl();
		
		if(ux.equals(m))
		{
			return "TestCase Pass";
		}
		else
		{
			File scrFile = (File) ((TakesScreenshot)myD).getScreenshotAs(OutputType.FILE);
			Files.copy(scrFile, new File("C:\\Users\\slk\\Desktop\\Abrar\\TC_001.jpg"));
			return "TestCase Fail";
			
		}
		
	}
	public static String closeApp()
	{
		String Flag="FAIL";
		myD.close();
		Flag="closeApp TestCase Pass";
		return Flag;
	}
	public static String browserCall(String ch,String n) throws IOException
	{
		if(ch.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\TR soft\\Selenium Jars\\chromedriver.exe");
			myD = new ChromeDriver();
			String res=func(n);
			System.out.println(res);
			return "Browser TC Pass";
			
		}
		else if(ch.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","D:\\TR soft\\Selenium Jars\\geckodriver.exe");
		    myD = new FirefoxDriver();
			String res=func(n);
			System.out.println(res);
			return "Browser TC Pass";
		}
		else
		{
			System.out.println("Invalid input..");
			return "Browser TC Fail";
		}	
	}
	
}
