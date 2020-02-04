package abu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
{

	public static void main(String[] args) throws Exception 
	{

		System.setProperty("webdriver.chrome.driver", "D:\\TR soft\\Selenium Jars\\chromedriver.exe");
		WebDriver myD = new ChromeDriver();
		myD.manage().window().maximize();
		myD.get("https://www.amazon.com/");
		Thread.sleep(4000);
		myD.findElement(By.xpath("//*[contains(@id,'twotabs')]")).sendKeys("Puma Shoes for Men");
		
		myD.quit();

	}

}
