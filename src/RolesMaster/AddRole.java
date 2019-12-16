package RolesMaster;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Helper.Reuse;

public  class  AddRole extends Reuse{
	public ExtentReports report=new ExtentReports("D:\\Reports\\AddRole.html");
	public ExtentTest logger =report.startTest("Role");
	public static String sectiongenerated;
	public String createdperson="rajsamala";
  @BeforeTest
  public void f() throws Exception {
	  Launch();//driver launch
	  Login();//open site
	  adminLogin();	 //login as admin 
  }
  
  @Test(priority=0)
  public void addsection() throws Exception {
	 driver.findElement(By.xpath("//*[text()='Masters ']")).click();
	 Thread.sleep(1000);
	 JavascriptExecutor jsx=(JavascriptExecutor)driver;
	 WebElement section=driver.findElement(By.xpath("//*[text()='Roles']"));
	 jsx.executeScript("arguments[0].scrollIntoView(true);", section);
	 section.click();
	 String search="//*[text()='Add New']";
	 waitexplicit(search);	Thread.sleep(1000);
	 driver.findElement(By.xpath("//*[text()='Add New']")).click();
	 
	 String addsection="//*[@id='roleName']";
	 waitexplicit(addsection);Thread.sleep(1000);
	 sectiongenerated = RandomStringUtils.randomAlphabetic(6);
	 System.out.println(sectiongenerated);
	 Actions a=new Actions(driver);
	 WebElement checkbox=driver.findElement(By.xpath("(//*[@name='checkbox'])[1]"));
	 a.click(checkbox).build().perform();Thread.sleep(500);
	 
	 driver.findElement(By.id("roleName")).sendKeys(sectiongenerated);
	 File f3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(f3, new File("D:\\screenshots\\addrole.jpg"));
	 logger.log(LogStatus.PASS,"Addpage",logger.addScreenCapture("D:\\screenshots\\addrole.jpg"));
	 
	 driver.findElement(By.xpath("//*[text()='Save']")).click();
	 
	 String searchsection="(//*[@class='moc-code ng-binding'])[1]";
	 waitexplicit(searchsection);
	 File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(f1, new File("D:\\screenshots\\searchrole.jpg"));
	 String added=driver.findElement(By.xpath("(//*[@class='moc-code ng-binding'])[1]")).getText();
	 if(added.equals(sectiongenerated))
	 {
		 logger.log(LogStatus.PASS,"Role display in search page",logger.addScreenCapture("D:\\screenshots\\searchrole.jpg"));
		 
	 }
	 else
	 {
		 logger.log(LogStatus.FAIL,"Role display in search page",logger.addScreenCapture("D:\\screenshots\\searchrole.jpg"));
		 
	 }
     
	 String addedperson=driver.findElement(By.xpath("(//*[@class='ng-binding'])[2]")).getText();
	 if(addedperson.equals(createdperson))
	 {
		 logger.log(LogStatus.PASS,"Created person display in search page",logger.addScreenCapture("D:\\screenshots\\searchrole.jpg"));
		 
	 }
	 else
	 {
		 logger.log(LogStatus.FAIL,"Created person display in search page",logger.addScreenCapture("D:\\screenshots\\searchrole.jpg"));
		 
	 }
	 
	 //get date
	 
	 DateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");
	 
	 //get current date time with Date()
	 Date date = new Date();
	 
	 // Now format the date
	 String date1= dateFormat.format(date);
	 
	 // Print the Date
	 System.out.println(date1);
	 String datetext=driver.findElement(By.xpath("(//*[@class='ng-binding'])[3]")).getText();
	 System.out.println(datetext);
	 if(datetext.contains(date1))
	 {
		 logger.log(LogStatus.PASS,"Date display in search page",logger.addScreenCapture("D:\\screenshots\\searchrole.jpg"));
		 
	 }
	 else
	 {
		 logger.log(LogStatus.FAIL,"Date display in search page",logger.addScreenCapture("D:\\screenshots\\searchrole.jpg"));
		 
	 }
	 
	 report.endTest(logger);
	 report.flush();
	 driver.close();

  }
  
}
