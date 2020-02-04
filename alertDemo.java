package abu;

//ALERT HANDLING

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertDemo 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\TR soft\\Selenium Jars\\chromedriver.exe");
		WebDriver myD = new ChromeDriver();
		myD.manage().window().maximize();
		myD.get("http://demo.automationtesting.in/Alerts.html");	
		myD.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		myD.switchTo().alert().accept();
		Thread.sleep(3000);
		myD.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		myD.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		myD.switchTo().alert().dismiss();
		Thread.sleep(3000);
		myD.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		myD.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		Thread.sleep(3000);
		myD.switchTo().alert().sendKeys("Thalaivaa");
		myD.switchTo().alert().accept();	
		
		Thread.sleep(5000);
		
		myD.close();

	}

}
