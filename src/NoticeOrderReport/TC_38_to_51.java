package NoticeOrderReport;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_38_to_51 extends Reuse {

	public String OrderNum;
	public String Rfno;
	@BeforeTest
	public void Orderplace() throws Exception {
		
		Launch();//driver launch
		Login();//open site
		UserLogin();//login as Independent user 
		 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Independent Search Address']")).click();
		Thread.sleep(3000);
		 
		 Thread.sleep(2000);
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
		 
		WebElement ViewSelected = driver.findElement(By.xpath("(//*[text()='View Selected'])[1]"));
		
		ViewSelected.click();
		Thread.sleep(5000);
		waitexplicit("//*[@class='pull-right resultsView resultsView-Results ng-binding']");Thread.sleep(5000);
		
		Thread.sleep(2000);
		 waitexplicit("(//*[text()='Details'])[1]");	Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Details'])[1]")).click();
		 Thread.sleep(5000);
		 waitexplicit("(//*[@class='form-control ng-pristine ng-untouched ng-valid ng-not-empty'])[1]");	Thread.sleep(8000);
		 Thread.sleep(2000);
		 waitexplicit("(//*[@class='backBtn']/i)[2]");	Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='backBtn']/i)[2]")).click();
		 Thread.sleep(2000);
		 waitexplicit("(//*[text()='Details'])[2]");	Thread.sleep(5000);
		 driver.findElement(By.xpath("(//*[text()='Details'])[2]")).click();
		 Thread.sleep(5000);
		 waitexplicit("(//*[@class='form-control ng-pristine ng-untouched ng-valid ng-not-empty'])[1]");	Thread.sleep(8000);
		 Thread.sleep(2000);
		 waitexplicit("(//*[@class='backBtn']/i)[2]");	Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='backBtn']/i)[2]")).click();
		 Thread.sleep(2000);
		 waitexplicit("(//*[@class='backBtn']/i)[1]");	Thread.sleep(5000);
		 driver.findElement(By.xpath("(//*[@class='backBtn']/i)[1]")).click();
		 Thread.sleep(5000);
		 waitexplicit("(//*[@class='form-control temp-address-search ng-valid ng-valid-pattern ng-valid-maxlength ng-not-empty ng-dirty ng-valid-parse ng-touched'])[1]");	Thread.sleep(5000);
		 
		 
		 Thread.sleep(1000);
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
	}
	
	@Test
	public void tc_38_to_51() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"\\NoticeOrderreport\\"+"TC_38_to_51.html");
		logger =report.startTest("TC_38_to_51");
		
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
		driver.findElement(By.id("referenceNumber")).sendKeys(Rfno);
		driver.findElement(By.xpath("//*[@id='address']")).sendKeys("M L A Colony, Banjarahills, Hyderabad, 500003");
		driver.findElement(By.xpath("//*[text()='Search']")).click();
		Thread.sleep(2000);
		waitexplicit("//*[text()='Date']");
		
		WebElement Date=driver.findElement(By.xpath("//*[text()='Date']"));
		WebElement OrderNo=driver.findElement(By.xpath("//*[text()='Order No.']"));
		WebElement ReferenceNo=driver.findElement(By.xpath("//*[text()='Reference No.']"));
		WebElement Address=driver.findElement(By.xpath("(//*[text()='Address'])[2]"));
		WebElement Noofcombinations=driver.findElement(By.xpath("//*[text()='No.Of Combinations']"));
		WebElement TotalResultsReviewed=driver.findElement(By.xpath("//*[text()='Total Results Reviewed']"));
		WebElement NoticesSelected=driver.findElement(By.xpath("//*[text()='Notices Selected']"));
		WebElement CriticalNotices=driver.findElement(By.xpath("//*[text()='Critical Notices']"));
		WebElement Status=driver.findElement(By.xpath("(//*[text()='Status'])[2]"));
		
		if(Date.isDisplayed() && OrderNo.isDisplayed() && ReferenceNo.isDisplayed() && Address.isDisplayed() && Noofcombinations.isDisplayed() && TotalResultsReviewed.isDisplayed() && NoticesSelected.isDisplayed() && CriticalNotices.isDisplayed() && Status.isDisplayed())
		 {
			 passscreenshot(driver, "NOR-TC_38", "TC-No : 38 - Headers displayed for search results");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_38", "TC-No : 38 - Headers not displayed for search results");
		 }
		
		 SimpleDateFormat formatter = new SimpleDateFormat("dd MMM yyyy");  
		 Date date = new Date(); 
		 System.out.println(formatter.format(date));
		 
		 String Orderdate=driver.findElement(By.xpath("(//*[@class='ng-binding'])[3]")).getText();
		 System.out.println(Orderdate);
		 
		 if(Orderdate.contains(formatter.format(date)))
		 {
			 passscreenshot(driver, "NOR-TC_39", "TC-No : 39 - Order date is displaying correctly");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_39", "TC-No : 39 - Order date is not displaying correctly");
		 }
		 
		 String OrderNO=driver.findElement(By.xpath("(//*[@class='ng-binding'])[4]")).getText();
		 System.out.println(OrderNO);
		
		 if(OrderNO.equals(OrderNum))
		 {
			 passscreenshot(driver, "NOR-TC_40", "TC-No : 40 - Order Number is displaying correctly");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_40", "TC-No : 40 - Order Number is not displaying correctly");
		 }
		
		 String ReferenceNO=driver.findElement(By.xpath("(//*[@class='ng-binding'])[5]")).getText();
		 System.out.println(ReferenceNO);
		
		 if(ReferenceNO.equals(Rfno))
		 {
			 passscreenshot(driver, "NOR-TC_41", "TC-No : 41 - Reference Number is displaying correctly");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_41", "TC-No : 41 - Reference Number is not displaying correctly");
		 }
		
		
		 String OrderAddress=driver.findElement(By.xpath("(//*[@class='ng-binding'])[6]")).getText();
		 System.out.println(OrderAddress);
		
		 if(OrderAddress.equals("M L A Colony, Banjarahills, Hyderabad, 500003"))
		 {
			 passscreenshot(driver, "NOR-TC_43", "TC-No : 43 - Address is displaying correctly");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_43", "TC-No : 43 - Address is not displaying correctly");
		 }
		 
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
		 
		 String TotalResultsreviewed=driver.findElement(By.xpath("(//*[@class='ng-binding'])[8]")).getText();
		 System.out.println(TotalResultsreviewed);
		 int j = Integer.parseInt(TotalResultsreviewed);
		
		 if(j==2)
		 {
			 passscreenshot(driver, "NOR-TC_45", "TC-No : 45 - Total Results Reviewed displaying correctly");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_45", "TC-No : 45 - Total Results Reviewed not displaying correctly");
		 }
		 
		 String Noticesselected=driver.findElement(By.xpath("(//*[@class='ng-binding'])[3]/following-sibling::td[6]")).getText();
		 System.out.println(Noticesselected);
		 int k = Integer.parseInt(Noticesselected);
		
		 if(k==3)
		 {
			 passscreenshot(driver, "NOR-TC_46", "TC-No : 46 - Notices selected count displaying correctly");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_46", "TC-No : 46 - Notices selected count not displaying correctly");
		 }
		
		 String Criticalnotices=driver.findElement(By.xpath("(//*[@class='ng-binding'])[9]")).getText();
		 System.out.println(Criticalnotices);
		 int l = Integer.parseInt(Criticalnotices);
		
		 if(l==1)
		 {
			 passscreenshot(driver, "NOR-TC_48", "TC-No : 48 - Critical Notices count displaying correctly");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_48", "TC-No : 48 - Critical Notices count not displaying correctly");
		 }
		
		 String status=driver.findElement(By.xpath("(//*[@class='ng-binding'])[10]")).getText();
		 System.out.println(status);
		
		 if(status.equals("Completed"))
		 {
			 passscreenshot(driver, "NOR-TC_50", "TC-No : 50 - Order Status is displaying correctly");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_50", "TC-No : 50 - Order Status is not displaying correctly");
		 }
		 
		 //Notices selected trying to download pdf
		 if(k==3)
		 {
			 try {
				 driver.findElement(By.xpath("(//*[@class='ng-binding'])[3]/following-sibling::td[6]")).click();
				 Thread.sleep(5000);
				 Screen s=new Screen();
				 Pattern PDF = new Pattern("D:\\Eclipsworkspace\\MTN\\PDF.PNG");
				 s.click(PDF);
				 Thread.sleep(5000);
				 passscreenshot(driver, "NOR-TC_51", "TC-No : 51 - PDF is getting downloaded for selected Notices");
			 } catch (Exception e) {
			 failscreenshot(driver, "NOR-TC_51", "TC-No : 51 - PDF is not getting downloaded for selected Notices");
		 }}
		 report.endTest(logger);
		 report.flush();
		 driver.close();
		}
}