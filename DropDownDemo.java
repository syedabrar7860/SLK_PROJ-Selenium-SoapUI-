package abu;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\TR soft\\Selenium Jars\\chromedriver.exe");
		WebDriver myD = new ChromeDriver();
		myD.manage().window().maximize();
		myD.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		myD.findElement(By.xpath("//input[contains(@name,'name')]")).sendKeys("Joseph Vijay");
		Thread.sleep(2000);
		myD.findElement(By.xpath("//input[contains(@name,'login')]")).sendKeys("Thalapathy64@rediffmail.com");
		Thread.sleep(2000);
		myD.findElement(By.xpath("//input[contains(@name,'passwd')]")).sendKeys("vj7860*");
		Thread.sleep(2000);
		myD.findElement(By.xpath("//input[contains(@name,'confirm_passwd')]")).sendKeys("vj7860*");
		Thread.sleep(2000);
		myD.findElement(By.xpath("//input[contains(@name,'chk_altemail')]")).click();
		Thread.sleep(1000);
		myD.findElement(By.xpath("//input[(@type='radio' and @value='m')]")).click();
		Thread.sleep(2000);
		Select s = new Select (myD.findElement(By.id("country")));
		s.selectByValue("221");
		Thread.sleep(3000);
		s.selectByVisibleText("India");
		Thread.sleep(3000);
		Select c = new Select (myD.findElement(By.xpath("//select[contains(@name,'city')]")));
		c.selectByValue("Chennai");
		
		myD.findElement(By.xpath("//*[@src=\'https://register.rediff.com/utilities/newforgot/img/darrow_country.png\']")).click();
		Thread.sleep(3000);
		myD.findElement(By.xpath("//*[text()='USA / Canada (+1)']")).click();
		
		myD.close();
		
	
	}

}
