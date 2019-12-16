package User;

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

public class EditUser extends Reuse{
	public ExtentReports report=new ExtentReports("D:\\Reports\\EditUser.html");
	public ExtentTest logger =report.startTest("User");
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
		 WebElement section=driver.findElement(By.xpath("//*[text()='User']"));
		 jsx.executeScript("arguments[0].scrollIntoView(true);", section);
		 section.click();
		 String search="//*[text()='Add New']";
		 waitexplicit(search);	Thread.sleep(1000);
		 
		 //get section
		 
		 driver.findElement(By.xpath("(//*[@title='Edit'])[1]")).click();
		 String edit="//*[@id='userName']";
		 waitexplicit(edit);	Thread.sleep(5000);
		
		 driver.findElement(By.id("userEmail")).clear();Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[text()='Save']")).click(); Thread.sleep(5000);
		 File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(f1, new File("D:\\screenshots\\Without mandatory field user.jpg"));
		 if(driver.findElement(By.xpath("(//*[text()='Form is invalid, please fill highlighted fields.'])[1]")).isDisplayed())
		 {
			 logger.log(LogStatus.PASS,"Without mandatory field",logger.addScreenCapture("D:\\screenshots\\Without mandatory field user.jpg")); 
		 }
		 else
		 {
			 logger.log(LogStatus.FAIL,"Without mandatory field",logger.addScreenCapture("D:\\screenshots\\Without mandatory field user.jpg"));
		 }
		 //update 
		 
		 String sectiongeneratedupdate = RandomStringUtils.randomAlphabetic(6);
		 System.out.println(sectiongeneratedupdate);
		 Actions a=new Actions(driver);
		 WebElement checkbox=driver.findElement(By.xpath("(//*[@name='checkbox'])[1]"));
		 a.click(checkbox).build().perform();Thread.sleep(500);//unpublish
		 
		 driver.findElement(By.id("userEmail")).sendKeys(sectiongeneratedupdate+"@gmail.com");
		 File f3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(f3, new File("D:\\screenshots\\edituserNameupdate.jpg"));
		 logger.log(LogStatus.PASS,"Edituser",logger.addScreenCapture("D:\\screenshots\\edituserNameupdate.jpg"));
		 sectiongeneratedupdate=sectiongeneratedupdate.toLowerCase();
		 driver.findElement(By.xpath("//*[text()='Save']")).click();
		 
		 String searchsection1="(//*[@class='moc-code ng-binding'])[1]";
		 waitexplicit(searchsection1);
		 File f2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(f2, new File("D:\\screenshots\\edituserupdate1.jpg"));
		 String added=driver.findElement(By.xpath("(//*[@class='moc-code ng-binding'])[1]")).getText();
		 
		 
		 String addedperson=driver.findElement(By.xpath("(//*[@class='ng-binding'])[4]")).getText();
		 if(addedperson.equals(createdperson))
		 {
			 logger.log(LogStatus.PASS,"updated person display in search page",logger.addScreenCapture("D:\\screenshots\\edituserupdate1.jpg"));
			 
		 }
		 else
		 {
			 logger.log(LogStatus.FAIL,"updated person display in search page",logger.addScreenCapture("D:\\screenshots\\edituserupdate1.jpg"));
			 
		 }
		 
		 //get date
		 
		 DateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");
		 
		 //get current date time with Date()
		 Date date = new Date();
		 
		 // Now format the date
		 String date1= dateFormat.format(date);
		 
		 // Print the Date
		 System.out.println(date1);
		 String datetext=driver.findElement(By.xpath("(//*[@class='ng-binding'])[5]")).getText();
		 System.out.println(datetext);
		 if(datetext.contains(date1))
		 {
			 logger.log(LogStatus.PASS,"updatedDate display in search page",logger.addScreenCapture("D:\\screenshots\\edituserupdate1.jpg"));
			 
		 }
		 else
		 {
			 logger.log(LogStatus.FAIL,"updatedDate display in search page",logger.addScreenCapture("D:\\screenshots\\edituserupdate1.jpg"));
			 
		 }
		 //check email
		 driver.findElement(By.xpath("(//*[@title='Edit'])[1]")).click();
		 String editemai="//*[@id='userName']";
		 waitexplicit(editemai);	Thread.sleep(5000);
		 String emailvalue=driver.findElement(By.id("userEmail")).getAttribute("value");
		 File f21=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(f21, new File("D:\\screenshots\\edituserupdate1email.jpg"));
		 if(emailvalue.equals(sectiongeneratedupdate+"@gmail.com"))
		 {
			 logger.log(LogStatus.PASS,"Email updated",logger.addScreenCapture("D:\\screenshots\\edituserupdate1email.jpg")); 
		 }
		 else
		 {
			 logger.log(LogStatus.FAIL,"Email updated",logger.addScreenCapture("D:\\screenshots\\edituserupdate1email.jpg"));
		 }
	
		 report.endTest(logger);
		 report.flush();
		 driver.close();
	}
}
