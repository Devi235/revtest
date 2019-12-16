package NoticeOrderReport;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_53_to_59 extends Reuse {

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
		 
		 Rfno=RandomStringUtils.randomNumeric(6);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id='refno']")).sendKeys(Rfno);
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
		 waitexplicit("(//*[@class='backBtn']/i)[1]");	Thread.sleep(5000);
		 driver.findElement(By.xpath("(//*[@class='backBtn']/i)[1]")).click();
		 Thread.sleep(5000);
		 waitexplicit("(//*[text()='Search Address'])");	Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@id='City']")).clear();
		 driver.findElement(By.xpath("//*[@id='postelcode']")).clear();
		 driver.findElement(By.xpath("//*[@id='locality']")).clear();
		 driver.findElement(By.xpath("//*[@id='StreetName']")).clear();
		 driver.findElement(By.xpath("//*[@id='City']")).sendKeys("Ahmedabad");
		 driver.findElement(By.xpath("//*[@id='postelcode']")).sendKeys("645645");
		 driver.findElement(By.xpath("//*[@id='StreetName']")).sendKeys("test street");
		 driver.findElement(By.xpath("//*[@id='buildingNumber']")).sendKeys("6789");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[text()='Search']")).click();
		 Thread.sleep(5000);
		 waitexplicit("(//*[text()='Select All'])[1]");	Thread.sleep(1000);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Select All'])[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Critical'])[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Save'])[1]")).click();
		 Thread.sleep(5000);
		 waitexplicit("(//*[text()='Close Order'])[2]");	Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[text()='Close Order'])[2]")).click();
		Thread.sleep(5000);
		waitexplicit("//*[text()='Logout']");	Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Logout']")).click();
		Thread.sleep(2000);
		
	}
	
	@Test
	public void tc_53_to_59() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"\\NoticeOrderreport\\"+"TC_53_to_59.html");
		logger =report.startTest("TC_53_to_59");
		
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
		
		String NoofCombinations=driver.findElement(By.xpath("(//*[@class='ng-binding'])[7]")).getText();
		System.out.println(NoofCombinations);
		int i = Integer.parseInt(NoofCombinations);
		
		 if(i==2)
		 {
			 passscreenshot(driver, "NOR-TC_44", "TC-No : 44 - No of Combinations displaying correctly");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_44", "TC-No : 44 - No of Combinations not displaying correctly");
		 }
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Combinations'])[2]")).click();
		 Thread.sleep(5000);
		waitexplicit("//*[text()='Order Number']");
		
		 if(driver.findElement(By.xpath("//*[text()='Order Number']")).isDisplayed())
		 {
			 passscreenshot(driver, "NOR-TC_53", "TC-No : 53 - It is navigating to Combinations page");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_53", "TC-No : 53 - unable to navigate to Combinations page");
		 }
		
		 WebElement OrderNumber=driver.findElement(By.xpath("//*[text()='Order Number']/following-sibling::div"));
		 WebElement ReferenceNumber=driver.findElement(By.xpath("//*[text()='Reference Number']/following-sibling::div"));
		 WebElement Address=driver.findElement(By.xpath("//*[text()='Address']/following-sibling::div"));
		
		 if(OrderNumber.isDisplayed() && ReferenceNumber.isDisplayed() && Address.isDisplayed())
		 {
			 passscreenshot(driver, "NOR-TC_54", "TC-No : 54 - OrderNumber,ReferenceNumber and Address fields are displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_54", "TC-No : 54 - OrderNumber,ReferenceNumber and Address fields are not displaying");
		 }
		
		 String OrderNumber1=OrderNumber.getText();
		 System.out.println(OrderNumber1);
		 String ReferenceNumber1=ReferenceNumber.getText();
		 System.out.println(ReferenceNumber1);
		 String Address1=Address.getText();
		 System.out.println(Address1);
		 
		 if(OrderNumber1.equals(OrderNum) && ReferenceNumber1.equals(Rfno) && Address1.contains("500003"))
		 {
			 passscreenshot(driver, "NOR-TC_55", "TC-No : 55,56,57,59 - OrderNumber,ReferenceNumber and Address fields are displaying correctly");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_55", "TC-No : 55,56,57,59 - OrderNumber,ReferenceNumber and Address fields are not displaying correctly");
		 }
		
		 report.endTest(logger);
		 report.flush();
		 driver.close();
		}
}