package abu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class vtuDemo 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\TR soft\\Selenium Jars\\chromedriver.exe");
		WebDriver myD = new ChromeDriver();
		myD.manage().window().maximize();
		myD.get("https://www.softwarecertifications.org/");
		myD.findElement(By.xpath("//nav[@id='site-nav']/ul/li[4]/a")).click();
		Thread.sleep(5000);
		
		myD.quit();
		
		

	}

}
