package abu;

// FRAME HANDLING

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropDemo 
{
	public static void myPrint(String str)
	{
		System.out.println(str);
	}
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\TR soft\\Selenium Jars\\chromedriver.exe");
		WebDriver myD = new ChromeDriver();
		myD.manage().window().maximize();
		
		myD.get("https://jqueryui.com/droppable/");
		Thread.sleep(1000);
		//myD.switchTo().frame(0);
		//myD.switchTo().frame("Name or ID can be given directly");
		myD.switchTo().frame(myD.findElement(By.xpath("//iframe[@class='demo-frame']")));
		//myD.findElement(By.id("draggable")).getText();
		Thread.sleep(2000);
		WebElement  source= myD.findElement(By.id("draggable"));
		WebElement  dest= myD.findElement(By.id("droppable"));
		
		Actions act = new Actions(myD);
		act.dragAndDrop(source, dest).build().perform();
		Thread.sleep(1000);
		
		myD.switchTo().defaultContent();
		Thread.sleep(2000);
		
		myD.findElement(By.xpath("//*[@id=\"content\"]/div[3]/a")).click();
		
		//myD.close();

	}

}
