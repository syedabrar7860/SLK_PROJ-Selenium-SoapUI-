package abu;

//WINDOW HANDLING

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailDemo
{
	public static void myPrint(String vstr)
	{
		System.out.println(vstr);
	}
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\TR soft\\Selenium Jars\\chromedriver.exe");
		WebDriver myD = new ChromeDriver();
		myD.manage().window().maximize();
		
		myD.get("https://www.gmail.com");
		myPrint(myD.getTitle());
		Thread.sleep(3000);
		
		myD.findElement(By.linkText("Help")).click();
		myPrint(myD.getTitle());
		Thread.sleep(3000);
		
		Set<String> id= myD.getWindowHandles();
		Iterator<String> it=id.iterator();
		String vparent=it.next();
		String vchild=it.next();
		
		myD.switchTo().window(vchild);
		myPrint(myD.getTitle());
		
		Thread.sleep(3000);
		
		myD.findElement(By.partialLinkText("Community")).click();
		Thread.sleep(3000);
		
		myPrint(myD.getTitle());
		
		myD.quit();

	}

}
