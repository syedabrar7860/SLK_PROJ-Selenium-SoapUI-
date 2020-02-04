package abu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ProjectSel 
{

	public static String []food= {"100","200","300"};
	public static String []clothing= {"10","20","30"};
	public static String []shelter= {"50","75","100"};
	public static String []mPay= {"500","100","400"};
	public static String []mOther= {"50","20","10"};
	
	public static  WebDriver myD ;
	
	public static void work() throws Exception
	{
		
		myD.manage().window().maximize();
		myD.get("http://www.youcandealwithit.com/");
		Thread.sleep(10000);
		Actions act= new Actions(myD);
		act.moveToElement(myD.findElement((By.xpath("//*[@id=\"siteNav\"]/li[1]/a")))).build().perform();
		Thread.sleep(10000);
		myD.findElement(By.partialLinkText("Calculators & Resources")).click();
		Thread.sleep(10000);
		myD.findElement(By.xpath("//*[@id=\"mainContent\"]/ul/li[1]/a")).click();
		Thread.sleep(10000);
		myD.findElement(By.partialLinkText("Budget Calculator")).click();
		Thread.sleep(10000);
		
		for(int i=0;i<3;i++)
		{	
			myD.findElement(By.id("food")).sendKeys(food[i]);
			myD.findElement(By.id("clothing")).sendKeys(clothing[i]);
			myD.findElement(By.id("shelter")).sendKeys(shelter[i]);
			myD.findElement(By.id("monthlyPay")).sendKeys(mPay[i]);
			myD.findElement(By.id("monthlyOther")).sendKeys(mOther[i]);


			String mExpense = myD.findElement(By.id("totalMonthlyExpenses")).getAttribute("value");
			System.out.println("Monthly Expense is: "+ mExpense);
			String mIncome = myD.findElement(By.id("totalMonthlyIncome")).getAttribute("value");
			System.out.println("Monthly Income is: "+ mIncome);

			float expense=Float.parseFloat(mExpense);
			float income=Float.parseFloat(mIncome);

			if(expense>income)
			{
				System.out.println("Very Poor in Saving!!");
			}
			else
			{
				System.out.println("You are Warren Buffet");
			}


			System.out.println();
			myD.findElement(By.className("Reset")).click();

		}
		Thread.sleep(5000);
		myD.quit();
	}

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\TR soft\\Selenium Jars\\chromedriver.exe");
		myD= new ChromeDriver();
		work();

		
	}	


}


