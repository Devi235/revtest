package NoticeOrderReport;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_42_47_49_52 extends Reuse {

	public String OrderNum;
	
	@BeforeTest
	public void Orderplace() throws Exception {
		
		Launch();//driver launch
		Login();//open site
		UserLogin();//login as Independent user 
		 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Independent Search Address']")).click();
		Thread.sleep(3000);
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id='City']")).sendKeys("Hyderabad");
		 driver.findElement(By.xpath("//*[@id='postelcode']")).sendKeys("500003");
		 driver.findElement(By.xpath("//*[@id='locality']")).sendKeys("Banjarahills");
		 driver.findElement(By.xpath("//*[@id='StreetName']")).sendKeys("M L A Colony");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//*[text()='Search']")).click();
		 Thread.sleep(5000);
		 waitexplicit("(//*[@class='content-Oder ng-binding'])");
		 String OrderNo = driver.findElement(By.xpath("(//*[@class='content-Oder ng-binding'])")).getText();
		 OrderNum=OrderNo.replace("Order number : ", "");
		 System.out.println(OrderNum);
		 Thread.sleep(5000);
		 waitexplicit("(//*[text()='Close Order'])");	
		driver.findElement(By.xpath("(//*[text()='Close Order'])")).click();
		Thread.sleep(5000);
	}
	
	@Test
	public void tc_42_47_49_52() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"\\NoticeOrderreport\\"+"TC_42_47_49_52.html");
		logger =report.startTest("TC_42_47_49_52");
		
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
		
		 String ReferenceNO=driver.findElement(By.xpath("(//*[@class='ng-binding'])[5]")).getText();
		 System.out.println(ReferenceNO);
		
		 if(ReferenceNO.equals(""))
		 {
			 passscreenshot(driver, "NOR-TC_42", "TC-No : 42 - Reference Number is displaying as blank when it is not given");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_42", "TC-No : 42 - Reference Number is displaying when it is not given");
		 }
		
		 String Noticesselected=driver.findElement(By.xpath("(//*[@class='ng-binding'])[3]/following-sibling::td[6]")).getText();
		 System.out.println(Noticesselected);
		 int k = Integer.parseInt(Noticesselected);
		
		 if(k==0)
		 {
			 passscreenshot(driver, "NOR-TC_47", "TC-No : 47 - When no Notices selected than its count is displaying as zero");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_47", "TC-No : 47 - When no Notices selected than its count is not displaying as zero");
		 }
		
		 String Criticalnotices=driver.findElement(By.xpath("(//*[@class='ng-binding'])[9]")).getText();
		 System.out.println(Criticalnotices);
		 int l = Integer.parseInt(Criticalnotices);
		
		 if(l==0)
		 {
			 passscreenshot(driver, "NOR-TC_49", "TC-No : 49 - When no Critical Notices selected than its count is displaying as zero");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_49", "TC-No : 49 - When no Critical Notices selected than its count is not displaying as zero");
		 }
		 
		 //Notices not selected trying to download pdf
		 if(k==0)
		 {
			 try {
				 driver.findElement(By.xpath("(//*[@class='ng-binding'])[3]/following-sibling::td[6]")).click();
				 Thread.sleep(5000);
				 Screen s=new Screen();
				 Pattern PDF = new Pattern("D:\\Eclipsworkspace\\MTN\\PDF.PNG");
				 s.click(PDF);
				 failscreenshot(driver, "NOR-TC_52", "TC-No : 52 - PDF is getting downloaded when Notices not selected");
			 } catch (Exception e) {
				 passscreenshot(driver, "NOR-TC_52", "TC-No : 52 - PDF is not getting downloaded when Notices not selected");
		 }}
		 report.endTest(logger);
		 report.flush();
		 //driver.close();
		}
}