package NoticeOrderReport;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_58_60_62 extends Reuse {

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
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Select All'])[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Save'])[1]")).click();
		 Thread.sleep(8000);
		 waitexplicit("//*[@class='pull-right resultsView resultsView-Results ng-binding']");	Thread.sleep(8000);
		 Thread.sleep(2000);
		 String OrderNo = driver.findElement(By.xpath("(//*[@class='content-Oder ng-binding'])")).getText();
		 OrderNum=OrderNo.replace("Order number : ", "");
		 System.out.println(OrderNum);
		 Thread.sleep(2000);
		 waitexplicit("(//*[text()='Close Order'])");	Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[text()='Close Order'])")).click();
		Thread.sleep(5000);
		waitexplicit("//*[text()='Logout']");	Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Logout']")).click();
		Thread.sleep(2000);
		
	}
	
	@Test
	public void tc_58_60_62() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"\\NoticeOrderreport\\"+"TC_58_60_62.html");
		logger =report.startTest("TC_58_60_62");
		
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
		waitexplicit("//*[text()='Reference Number']/following-sibling::div");
		
		 WebElement ReferenceNumber=driver.findElement(By.xpath("//*[text()='Reference Number']/following-sibling::div"));
		
		 String ReferenceNumber1=ReferenceNumber.getText();
		 System.out.println(ReferenceNumber1);

		 if(ReferenceNumber1.equals(""))
		 {
			 passscreenshot(driver, "NOR-TC_58", "TC-No : 58 - ReferenceNumber is displaying as blank when it is not given");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_58", "TC-No : 58 - ReferenceNumber is not displaying as blank when it is not given");
		 }
		
		 WebElement Resultno=driver.findElement(By.xpath("//*[text()='Result no']"));
		 WebElement Date=driver.findElement(By.xpath("(//*[text()='Date'])[2]"));
		 WebElement Combinations=driver.findElement(By.xpath("(//*[text()='Combinations'])[3]"));
		 WebElement Totalviewed=driver.findElement(By.xpath("(//*[text()='Total Viewed'])"));
		 WebElement NoticesSelected=driver.findElement(By.xpath("(//*[text()='Notices Selected'])[2]"));
		 WebElement CriticalNotices=driver.findElement(By.xpath("(//*[text()='Critical Notices'])[2]"));
		 WebElement ViewNotices=driver.findElement(By.xpath("(//*[text()='View Notices'])"));
		 
		 if(Resultno.isDisplayed() && Date.isDisplayed() && Combinations.isDisplayed() && Totalviewed.isDisplayed() && NoticesSelected.isDisplayed() && CriticalNotices.isDisplayed() && ViewNotices.isDisplayed())
		 {
			 passscreenshot(driver, "NOR-TC_60", "TC-No : 60 - Results grid headers are displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_60", "TC-No : 60 - Results grid headers are not displaying");
		 }
		 
		 SimpleDateFormat formatter = new SimpleDateFormat("dd MMM yyyy");  
		 Date date = new Date(); 
		 System.out.println(formatter.format(date));
		 
		 String Orderdate=driver.findElement(By.xpath("(//*[@class='ng-binding'])[12]")).getText();
		 System.out.println(Orderdate);
		 
		 if(Orderdate.contains(formatter.format(date)))
		 {
			 passscreenshot(driver, "NOR-TC_62", "TC-No : 62 - Order date is displaying correctly");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_62", "TC-No : 62 - Order date is not displaying correctly");
		 }
		 
		 report.endTest(logger);
		 report.flush();
		 //driver.close();
		}
}