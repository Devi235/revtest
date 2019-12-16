package NoticeOrderReport;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_70_to_74 extends Reuse {

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
		 waitexplicit("(//*[text()='Details'])[1]");	Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Details'])[1]")).click();
		 Thread.sleep(5000);
		 waitexplicit("(//*[@class='form-control ng-pristine ng-untouched ng-valid ng-not-empty'])[1]");	Thread.sleep(5000);
		 waitexplicit("(//*[@class='backBtn']/i)[2]");	Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='backBtn']/i)[2]")).click();
		 Thread.sleep(5000);
		 waitexplicit("(//*[text()='Details'])[2]");	Thread.sleep(5000);
		 driver.findElement(By.xpath("(//*[text()='Details'])[2]")).click();
		 Thread.sleep(5000);
		 waitexplicit("(//*[@class='form-control ng-pristine ng-untouched ng-valid ng-not-empty'])[1]");	Thread.sleep(5000);
		 waitexplicit("(//*[@class='backBtn']/i)[2]");	Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='backBtn']/i)[2]")).click();

		 Thread.sleep(5000);
		 waitexplicit("(//*[text()='Close Order'])");	Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[text()='Close Order'])")).click();
		Thread.sleep(5000);
		waitexplicit("//*[text()='Logout']");	Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Logout']")).click();
		Thread.sleep(2000);
		
	}
	
	@Test
	public void tc_70_to_74() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"\\NoticeOrderreport\\"+"TC_70_to_74.html");
		logger =report.startTest("TC_70_to_74");
		
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
		waitexplicit("(//*[text()='View'])[1]");
		
		WebElement noticesSelected1=driver.findElement(By.xpath("(//*[@class='ng-binding'])[14]"));
		String NoticesSelected1=noticesSelected1.getText();
		System.out.println(NoticesSelected1);
		
		 if(NoticesSelected1.equals("2") && driver.findElement(By.xpath("(//*[text()='View'])[1]")).isDisplayed())
		 {
			 passscreenshot(driver, "NOR-TC_70", "TC-No : 70 - When Notices are selected than view button is displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_70", "TC-No : 70 - When Notices are selected than view button is not displaying");
		 }
		
		driver.findElement(By.xpath("(//*[text()='View'])[1]")).click();
		Thread.sleep(5000);
		waitexplicit("//*[@class='content-Oder ng-binding']");
		if(driver.findElement(By.xpath("//*[@class='content-Oder ng-binding']")).isDisplayed())
		 {
			 passscreenshot(driver, "NOR-TC_71", "TC-No : 71 - When click on view button it is navigating to respective page");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_71", "TC-No : 71 - When click on view button it is unable to navigate to respective page");
		 }
		 
		WebElement OrderNumber=driver.findElement(By.xpath("//*[@class='content-Oder ng-binding']"));
		WebElement CombinationAddress=driver.findElement(By.xpath("//*[@class='content-Oder pull-left ng-binding']"));
		String SelectedAddress1=driver.findElement(By.xpath("(//*[text()='matched:'])[1]")).getText();
		System.out.println(SelectedAddress1);
		String SelectedAddress2=driver.findElement(By.xpath("(//*[text()='matched:'])[2]")).getText();
		System.out.println(SelectedAddress2);
		WebElement Map=driver.findElement(By.xpath("//*[@class='col-xs-12 col-sm-5 search-map-right padding-0']"));
		 
		if(OrderNumber.isDisplayed() && CombinationAddress.isDisplayed() && SelectedAddress1.contains("500003") && SelectedAddress2.contains("500003") && Map.isDisplayed())
		 {
			 passscreenshot(driver, "NOR-TC_72", "TC-No : 72 - OrderNumber,Combination Address,Selected Address and Map fields are displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_72", "TC-No : 72 - OrderNumber,Combination Address,Selected Address and Map fields are not displaying");
		 }
		 
		String OrderNumber1=OrderNumber.getText();
		String OrderNo=OrderNumber1.replace("Order number : ", "");
		System.out.println(OrderNo);
		 
		if(OrderNo.equals(OrderNum))
		 {
			 passscreenshot(driver, "NOR-TC_73", "TC-No : 73 - Order Number displaying correctly");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_73", "TC-No : 73 - Order Number not displaying correctly");
		 }
		 
		String Combinationaddress=CombinationAddress.getText();
		System.out.println(Combinationaddress);
		 
		if(Combinationaddress.contains("500003"))
		 {
			 passscreenshot(driver, "NOR-TC_74", "TC-No : 74 - Combination Address displaying correctly");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_74", "TC-No : 74 - Combination Address not displaying correctly");
		 }
		
		 report.endTest(logger);
		 report.flush();
		 driver.close();
		}
}