package Vieworders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TC_47 extends Reuse{
	public ExtentReports report=new ExtentReports(ReportSavingPath+"\\Vieworders\\"+"TC_47.html");
	public ExtentTest logger =report.startTest("TC_47");
	String OrderNo1;
	@Test(priority=0)
	public void OrderNumberGet() throws Exception {
		Launch();//driver launch
		Login();//open site
		UserLogin();//login as Independent user 
		Thread.sleep(3000);	
		try{
			if(driver.findElement(By.xpath("(//*[text()='Close Order'])[1]")).isDisplayed()){
				driver.findElement(By.xpath("(//*[text()='Close Order'])[1]")).click();
				Thread.sleep(8000);
			}}
			catch(Exception e)
			{
				
			}
			
		 driver.findElement(By.xpath("//*[@id='City']")).sendKeys("Hyderabad");
		 driver.findElement(By.xpath("//*[@id='postelcode']")).sendKeys("500003");
		 driver.findElement(By.xpath("//*[@id='locality']")).sendKeys("Banjarahills");
		 driver.findElement(By.xpath("//*[@id='StreetName']")).sendKeys("M L A Colony");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[text()='Search']")).click();
		 Thread.sleep(10000);
		 
		 String Ordernumber=driver.findElement(By.xpath("(//*[@class='content-Oder ng-binding'])[1]")).getText();
		 OrderNo1=Ordernumber.replace("Order number : ", "");
		 
		 driver.findElement(By.xpath("(//*[text()='select'])[1]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[text()='select'])[1]")).click();
		 Thread.sleep(1000);
		 Actions a=new Actions(driver);
		 
		 WebElement checkbox=driver.findElement(By.xpath("(//*[@name='checkbox'])[1]"));
		 a.click(checkbox).build().perform();
		 Thread.sleep(1000);//critical
		
		 
		 driver.findElement(By.xpath("(//*[text()='Save'])[1]")).click();
		 String wait="(//*[text()='Order saved successfully.'])[2]";
		 waitexplicit(wait);;
		 
		 Thread.sleep(7000);screenshot(ScreenshotSavingPath+"TC_47_01");
		 logger.log(LogStatus.PASS,"Order saved",logger.addScreenCapture(ScreenshotSavingPath+"TC_47_01"));

		 driver.findElement(By.xpath("(//*[text()='Close Order'])[1]")).click();
		 String wait1="(//*[text()='Order closed successfully.'])[2]";
		 waitexplicit(wait1);;
		 Thread.sleep(4000);
		 report.endTest(logger);
		 report.flush();   
	}
	
	@Test(priority=1)
	public void TC_47_view() throws Exception {
		
		driver.findElement(By.xpath("(//*[text()='View Orders'])[1]")).click();
		Thread.sleep(5000);
	
		driver.findElement(By.xpath("//*[@id='flatNumber']")).sendKeys(OrderNo1);
		driver.findElement(By.xpath("(//*[text()='Search'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[text()='View'])[1]")).click();
		String wait="(//*[@class='circlechart'])[1]";
		waitexplicit(wait);;
		Thread.sleep(5000);
		screenshot(ScreenshotSavingPath+"TC_47_02");
		logger.log(LogStatus.PASS,"Search results page",logger.addScreenCapture(ScreenshotSavingPath+"TC_47_02"));
		//get count
	    String counttext=	driver.findElement(By.xpath("(//*[@class='pull-right resultsView resultsView-Results ng-binding'])[1]")).getText();
	    counttext=counttext.replace(" Results Found", "");
	    System.out.println(counttext);
	    int n=Integer.parseInt(counttext);
		Actions a=new Actions(driver);
		WebElement details= driver.findElement(By.xpath("(//*[text()='Details'])[1]"));
		a.click(details).build().perform();
		 String wait1="(//*[text()='Cancel'])[1]";
		 waitexplicit(wait1);;Thread.sleep(4000);
		 
		 if(driver.findElement(By.xpath("//*[@name='checkbox2']")).isSelected())
		 {
			 driver.findElement(By.xpath("//*[@name='checkbox2']")).click();//unpublish selected
		 }
		 screenshot(ScreenshotSavingPath+"TC_47_03");
		 driver.findElement(By.xpath("(//*[text()='Save'])[2]")).click();
		 String wait12="(//*[text()='Order saved successfully.'])[3]";
		 waitexplicit(wait12);;Thread.sleep(4000);
		 logger.log(LogStatus.PASS,"Notice unpublished in details page",logger.addScreenCapture(ScreenshotSavingPath+"TC_47_03"));
		 driver.findElement(By.xpath("(//*[text()='Cancel'])[1]")).click();
		 String wait11="(//*[@class='circlechart'])[1]";
		 waitexplicit(wait11);;
		 Thread.sleep(5000);
		 screenshot(ScreenshotSavingPath+"TC_47_04");
		//get count
		    String counttext1=	driver.findElement(By.xpath("(//*[@class='pull-right resultsView resultsView-Results ng-binding'])[1]")).getText();
		    counttext1=counttext1.replace(" Results Found", "");
		    System.out.println(counttext1);
		    int n1=Integer.parseInt(counttext1);
		 if(n1==(n-1))
		 {
			 logger.log(LogStatus.PASS,"changes saved",logger.addScreenCapture(ScreenshotSavingPath+"TC_47_04"));
		 }
		 else
		 {
			 logger.log(LogStatus.FAIL,"changes save",logger.addScreenCapture(ScreenshotSavingPath+"TC_47_04")); 
		 }
		report.endTest(logger);
		report.flush();  
		driver.close();
	}
}
