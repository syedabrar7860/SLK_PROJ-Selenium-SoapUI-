package abu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtubeDemo 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\TR soft\\Selenium Jars\\chromedriver.exe");
		WebDriver myD= new ChromeDriver();
		myD.manage().window().maximize();
		myD.get("https://www.youtube.com/");
		myD.findElement(By.id("search")).sendKeys("Jab Harry met Sejal songs");
		Thread.sleep(3000);
		myD.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(2000);
		myD.findElement(By.xpath("//*[contains(text(),'Safar Full Video')]")).click();
		Thread.sleep(2000);
		
		
		//myD.close();
		
		
		

	}

}
