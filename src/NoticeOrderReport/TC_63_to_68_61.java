package NoticeOrderReport;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_63_to_68_61 extends Reuse {

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
	public void tc_63_to_68_61() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"\\NoticeOrderreport\\"+"TC_63_to_68_61.html");
		logger =report.startTest("TC_63_to_68_61");
		
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
		waitexplicit("(//*[@class='ng-binding'])[11]");
		
		String Resultno1=driver.findElement(By.xpath("(//*[@class='ng-binding'])[11]")).getText();
		String Resultno2=driver.findElement(By.xpath("(//*[@class='ng-binding'])[16]")).getText();
		
		 System.out.println(Resultno1);
		 System.out.println(Resultno2);
		
		 if(Resultno1.equals("1") && Resultno2.equals("2"))
		 {
			 passscreenshot(driver, "NOR-TC_61", "TC-No : 61 - Result numbers displaying correctly");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_61", "TC-No : 61 - Result numbers not displaying correctly");
		 }
		
		
		WebElement address1=driver.findElement(By.xpath("(//*[@class='spntblText ng-binding'])[1]"));
		WebElement address2=driver.findElement(By.xpath("(//*[@class='spntblText ng-binding'])[2]"));
		
		 String Address1=address1.getText();
		 System.out.println(Address1);
		 String Address2=address2.getText();
		 System.out.println(Address2);
		
		 if(Address1.contains("500003") && Address2.contains("645645"))
		 {
			 passscreenshot(driver, "NOR-TC_63", "TC-No : 63 - For selected Order Combinations are displaying correctly");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_63", "TC-No : 63 - For selected Order Combinations are not displaying correctly");
		 }
		 
		WebElement totalviewed1=driver.findElement(By.xpath("(//*[@class='ng-binding'])[13]"));
		WebElement totalviewed2=driver.findElement(By.xpath("(//*[@class='ng-binding'])[18]"));
		
		String Totalviewed1=totalviewed1.getText();
		System.out.println(Totalviewed1);
		String Totalviewed2=totalviewed2.getText();
		System.out.println(Totalviewed2);
		
		if(Totalviewed1.equals("2") && Totalviewed2.equals("0"))
		 {
			 passscreenshot(driver, "NOR-TC_64", "TC-No : 64 - For selected Order Total viewed count displaying correctly");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_64", "TC-No : 64 - For selected Order Total viewed count not displaying correctly");
		 }
		
		WebElement noticesSelected1=driver.findElement(By.xpath("(//*[@class='ng-binding'])[14]"));
		WebElement noticesSelected2=driver.findElement(By.xpath("(//*[@class='ng-binding'])[19]"));
		
		String NoticesSelected1=noticesSelected1.getText();
		System.out.println(NoticesSelected1);
		String NoticesSelected2=noticesSelected2.getText();
		System.out.println(NoticesSelected2);
		
		if(NoticesSelected1.equals("2") && NoticesSelected2.equals("1"))
		 {
			 passscreenshot(driver, "NOR-TC_65", "TC-No : 65 - For selected Order Notices Selected count displaying correctly");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_65", "TC-No : 65 - For selected Order Notices Selected count not displaying correctly");
		 }
		
		WebElement criticalNoticesSelected1=driver.findElement(By.xpath("(//*[@class='ng-binding'])[15]"));
		WebElement criticalNoticesSelected2=driver.findElement(By.xpath("(//*[@class='ng-binding'])[20]"));
		
		String CriticalNoticesSelected1=criticalNoticesSelected1.getText();
		System.out.println(CriticalNoticesSelected1);
		String CriticalNoticesSelected2=criticalNoticesSelected2.getText();
		System.out.println(CriticalNoticesSelected2);
		
		if(CriticalNoticesSelected1.equals("0") && CriticalNoticesSelected2.equals("1"))
		 {
			 passscreenshot(driver, "NOR-TC_66", "TC-No : 66 - For selected Order Critical Notices Selected count displaying correctly");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_66", "TC-No : 66 - For selected Order Critical Notices Selected count not displaying correctly");
		 }
		
		waitexplicit("(//*[@class='backBtn']/i)[1]");
		if(driver.findElement(By.xpath("(//*[@class='backBtn']/i)[1]")).isDisplayed())
		 {
			 passscreenshot(driver, "NOR-TC_67", "TC-No : 67 - Back button displayed in Combinations page");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_67", "TC-No : 67 - Back button not displaying in Combinations page");
		 }
		driver.findElement(By.xpath("(//*[@class='backBtn']/i)[1]")).click();
		Thread.sleep(2000);
		waitexplicit("(//*[text()='From Date*'])");
		if(driver.findElement(By.xpath("(//*[text()='From Date*'])")).isDisplayed())
		 {
			 passscreenshot(driver, "NOR-TC_68", "TC-No : 68 - Back button clickable and it is coming back from Combinations page");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_68", "TC-No : 68 - Back button not working");
		 }
		
		 report.endTest(logger);
		 report.flush();
		 driver.close();
		}
}