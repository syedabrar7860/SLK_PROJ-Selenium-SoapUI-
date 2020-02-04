package abu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBDemo 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\TR soft\\Selenium Jars\\chromedriver.exe");
		WebDriver myD = new ChromeDriver();
		myD.manage().window().maximize();
		myD.get("https://www.facebook.com/");
		myD.findElement(By.id("email")).sendKeys("syedabu1028@gmail.com");
		myD.findElement(By.id("pass")).sendKeys("abrar");
		myD.findElement(By.id("u_0_b")).click();
		Thread.sleep(2000);
		myD.findElement(By.partialLinkText("Forgotten")).click();
		Thread.sleep(2000);
		myD.close();

	}

}
