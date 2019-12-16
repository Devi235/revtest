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

public class Editrole extends Reuse{
	public ExtentReports report=new ExtentReports("D:\\Reports\\Editrole.html");
	public ExtentTest logger =report.startTest("Roles");
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
		 
		 //get section
		 
		 driver.findElement(By.xpath("(//*[@title='Edit'])[1]")).click();
		 String edit="//*[text()='Edit Role']";
		 waitexplicit(edit);	Thread.sleep(5000);
		 String secname=driver.findElement(By.id("roleName")).getAttribute("value");
		 System.out.println(secname+"secname");
		 
		 JavascriptExecutor jsx2=(JavascriptExecutor)driver;
		 WebElement save2=driver.findElement(By.xpath("//*[text()='Cancel']"));
		 jsx2.executeScript("arguments[0].scrollIntoView(true);", save2);Thread.sleep(2000);
		 
         driver.findElement(By.xpath("//*[text()='Cancel']")).click();
		 
		 String searchsection="(//*[@class='moc-code ng-binding'])[1]";
		 waitexplicit(searchsection);
		 
		 driver.findElement(By.xpath("//*[@placeholder='Search by role name']")).sendKeys(secname);
		 driver.findElement(By.xpath("//*[text()='Search']")).click();
		 Thread.sleep(10000);
		 driver.findElement(By.xpath("(//*[@title='Edit'])[1]")).click();
		 String edit1="(//*[@name='roleName'])[1]";
		 waitexplicit(edit1);	Thread.sleep(5000);
		
		 WebElement name=driver.findElement(By.xpath("(//*[@name='roleName'])[1]"));
		 name.clear();
		 
		 Thread.sleep(2000);
		 System.out.println("test");
		 JavascriptExecutor jsx1=(JavascriptExecutor)driver;
		 WebElement save1=driver.findElement(By.xpath("//*[text()='Save']"));
		 jsx1.executeScript("arguments[0].scrollIntoView(true);", save1);Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//*[text()='Save']")).click(); Thread.sleep(5000);
		 File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(f1, new File("D:\\screenshots\\Without mandatory field role.jpg"));
		 if(driver.findElement(By.xpath("(//*[text()='Form is invalid, please fill highlighted fields.'])[1]")).isDisplayed())
		 {
			 logger.log(LogStatus.PASS,"Without mandatory field",logger.addScreenCapture("D:\\screenshots\\Without mandatory field role.jpg")); 
		 }
		 else
		 {
			 logger.log(LogStatus.FAIL,"Without mandatory field",logger.addScreenCapture("D:\\screenshots\\Without mandatory field role.jpg"));
		 }
		 report.endTest(logger);
		 report.flush();
	}
	
	@Test(priority=1)
	  public void editsection() throws Exception {
		//update 
		 
		 String sectiongeneratedupdate = RandomStringUtils.randomAlphabetic(6);
		 System.out.println(sectiongeneratedupdate);
		 Actions a=new Actions(driver);
		 Thread.sleep(2000);
		 WebElement checkbox=driver.findElement(By.xpath("(//*[@name='checkbox'])[1]"));
		 a.click(checkbox).build().perform();Thread.sleep(2000);//unpublish
		 
		 driver.findElement(By.id("roleName")).sendKeys(sectiongeneratedupdate);
		 File f3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(f3, new File("D:\\screenshots\\editroleupdate.jpg"));
		 logger.log(LogStatus.PASS,"Editrole",logger.addScreenCapture("D:\\screenshots\\editroleupdate.jpg"));
		
		 JavascriptExecutor jsx3=(JavascriptExecutor)driver;
		 WebElement save3=driver.findElement(By.xpath("//*[text()='Save']"));
		 jsx3.executeScript("arguments[0].scrollIntoView(true);", save3);Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//*[text()='Save']")).click();
		 
		 String searchsection1="(//*[@class='moc-code ng-binding'])[1]";
		 waitexplicit(searchsection1);
		 File f2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(f2, new File("D:\\screenshots\\editroleupdate1.jpg"));
		 String added=driver.findElement(By.xpath("(//*[@class='moc-code ng-binding'])[1]")).getText();
		 
		 if(added.equals(sectiongeneratedupdate))
		 {
			 logger.log(LogStatus.PASS,"Role updated in search page",logger.addScreenCapture("D:\\screenshots\\editroleupdate1.jpg"));
			 
		 }
		 else
		 {
			 logger.log(LogStatus.FAIL,"Role updated in search page",logger.addScreenCapture("D:\\screenshots\\editroleupdate1.jpg"));
			 
		 }
		 
		 String addedperson=driver.findElement(By.xpath("(//*[@class='ng-binding'])[4]")).getText();
		 if(addedperson.equals(createdperson))
		 {
			 logger.log(LogStatus.PASS,"updated person display in search page",logger.addScreenCapture("D:\\screenshots\\editroleupdate1.jpg"));
			 
		 }
		 else
		 {
			 logger.log(LogStatus.FAIL,"Created person display in search page",logger.addScreenCapture("D:\\screenshots\\editroleupdate1.jpg"));
			 
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
			 logger.log(LogStatus.PASS,"updatedDate display in search page",logger.addScreenCapture("D:\\screenshots\\editroleupdate1.jpg"));
			 
		 }
		 else
		 {
			 logger.log(LogStatus.FAIL,"updatedDate display in search page",logger.addScreenCapture("D:\\screenshots\\editroleupdate1.jpg"));
			 
		 }
		 report.endTest(logger);
		 report.flush();
		 driver.close();
	
	}
	
}
