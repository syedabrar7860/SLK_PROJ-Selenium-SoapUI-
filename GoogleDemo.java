package abu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDemo 
{

	public static String name= "testing";
	public static void main(String[] args) throws Exception
{
		System.setProperty("webdriver.chrome.driver", "D:\\TR soft\\Selenium Jars\\chromedriver.exe");
		WebDriver myD = new ChromeDriver();
		myD.manage().window().maximize();
		myD.get("https://www.google.com/");
		myD.findElement(By.name("q")).sendKeys(name);
		Thread.sleep(3000);
		myD.findElement(By.name("btnK")).click();
		System.out.println(myD.getTitle());
		String str1 =myD.findElement(By.id("resultStats")).getText();
		System.out.println(str1);
		String str =myD.findElement(By.name("q")).getAttribute("value");
		System.out.println(str);
		if (name.equals(str))
		{
			System.out.println("Success");
		}
		else
		{
			System.out.println("Failed");
		}
		
		myD.findElement(By.partialLinkText("images")).click();
		myD.findElement(By.partialLinkText("Testing Professionals")).click();
		
		Thread.sleep(10000);
		myD.quit();
		

	}

}
