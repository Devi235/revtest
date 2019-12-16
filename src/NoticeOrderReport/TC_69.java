package NoticeOrderReport;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_69 extends Reuse {

	public String OrderNum;
	public String Rfno;
	
	@BeforeTest
	public void Orderplace() throws Exception {
		
		Launch();//driver launch
		Login();//open site
		UserLogin();//login as User
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Independent Search Address']")).click();
		Thread.sleep(3000);
		waitexplicit("(//*[text()='Search Address'])");	Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//*[@id='City']")).sendKeys("Hyderabad");
		 driver.findElement(By.xpath("//*[@id='postelcode']")).sendKeys("500003");
		 driver.findElement(By.xpath("//*[@id='locality']")).sendKeys("Banjarahills");
		 driver.findElement(By.xpath("//*[@id='StreetName']")).sendKeys("M L A Colony");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[text()='Search']")).click();
		 Thread.sleep(5000);
		 String close="(//*[text()='Close Order'])";
		 waitexplicit(close);	Thread.sleep(1000);
		 String OrderNo = driver.findElement(By.xpath("(//*[@class='content-Oder ng-binding'])")).getText();
		 OrderNum=OrderNo.replace("Order number : ", "");
		 System.out.println(OrderNum);
		 waitexplicit("(//*[text()='Close Order'])");	Thread.sleep(5000);
		 driver.findElement(By.xpath("(//*[text()='Close Order'])")).click();
		 Thread.sleep(5000);
		 waitexplicit("//*[text()='Logout']");	Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[text()='Logout']")).click();
		 Thread.sleep(2000);
	}
	
	@Test
	public void tc_69() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"\\NoticeOrderreport\\"+"TC_69.html");
		logger =report.startTest("TC_69");
		
		String launch="//*[@name='userName']";
		waitexplicit(launch);	Thread.sleep(500);
		AdminLogin();//login as Admin
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[text()='Reports '])[1]")).click();
		Thread.sleep(3000);
		 
		JavascriptExecutor jsx=(JavascriptExecutor)driver;
		WebElement User=driver.findElement(By.xpath("(//*[text()='Notice Order Report'])[1]"));
		jsx.executeScript("arguments[0].scrollIntoView(true);", User);
		User.click();
		String search="(//*[text()='Notice Order Report'])[2]";
		waitexplicit(search);	
		Thread.sleep(2000);
		driver.findElement(By.id("orderNumber")).sendKeys(OrderNum);
		driver.findElement(By.xpath("//*[text()='Search']")).click();
		Thread.sleep(2000);
		waitexplicit("//*[text()='Date']");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()='Combinations'])[2]")).click();
		Thread.sleep(5000);
		
		
		WebElement noticesSelected1=driver.findElement(By.xpath("(//*[@class='ng-binding'])[14]"));
		String NoticesSelected1=noticesSelected1.getText();
		System.out.println(NoticesSelected1);
		
		 if(NoticesSelected1.equals("0"))
		 {
			 try {
				 if(driver.findElement(By.xpath("(//*[text()='View'])[1]")).isDisplayed())
				 {
					 failscreenshot(driver, "NOR-TC_70", "TC-No : 70 - When Notices are not selected than also view button is displaying");
				 }
			} catch (Exception e) {
			 passscreenshot(driver, "NOR-TC_70", "TC-No : 70 - When Notices are not selected than view button is not displaying");
		 }}
		
		 report.endTest(logger);
		 report.flush();
		 driver.close();
		}
}