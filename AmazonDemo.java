package abu;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonDemo 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\TR soft\\Selenium Jars\\chromedriver.exe");
		WebDriver myD = new ChromeDriver();
		myD.manage().window().maximize();
		myD.get("https://www.amazon.com/");
		myD.findElement(By.id("twotabsearchtextbox")).sendKeys("Fossil watches for Men");
		myD.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		
		Thread.sleep(4000);
		myD.findElement(By.xpath("//*[text()='Fossil']")).click();
		Thread.sleep(2000);
		myD.findElement(By.xpath("//*[contains(text(),'Gen 4')]")).click();
		//myD.findElement(By.xpath("(//*[contains(text(),'Gen 5')])[2]")).click();
		Thread.sleep(3000);
		
		Actions act= new Actions(myD);
		act.moveToElement(myD.findElement((By.id("nav-link-accountList")))).build().perform();
		myD.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")).click();
		Thread.sleep(3000);
		
		myD.quit();

	}

}
