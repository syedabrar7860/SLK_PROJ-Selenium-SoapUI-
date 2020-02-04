package abu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediffmailDemo 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\TR soft\\Selenium Jars\\chromedriver.exe");
		WebDriver myD = new ChromeDriver();
		myD.manage().window().maximize();
		myD.get("https://mail.rediff.com/cgi-bin/login.cgi");
		myD.findElement(By.id("login1")).sendKeys("syedabu1028@gmail.com");
		Thread.sleep(3000);
		myD.findElement(By.id("password")).sendKeys("abrar");

		myD.findElement(By.name("proceed")).click();
		System.out.println(myD.getTitle());

		Thread.sleep(5000);
		myD.quit();


	}

}



