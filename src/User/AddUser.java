package User;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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

public  class  AddUser extends Reuse{
	public ExtentReports report=new ExtentReports("D:\\Reports\\AddUser.html");
	public ExtentTest logger =report.startTest("User");
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
	 Thread.sleep(3000);
	 JavascriptExecutor jsx=(JavascriptExecutor)driver;
	 WebElement section=driver.findElement(By.xpath("//*[text()='User']"));
	 jsx.executeScript("arguments[0].scrollIntoView(true);", section);
	 section.click();
	 String search="//*[text()='Add New']";
	 waitexplicit(search);	Thread.sleep(1000);
	 driver.findElement(By.xpath("//*[text()='Add New']")).click();
	 
	 String addsection="//*[@id='userName']";
	 waitexplicit(addsection);Thread.sleep(1000);
	 sectiongenerated = RandomStringUtils.randomAlphabetic(5);
	 System.out.println(sectiongenerated);
	 Actions a=new Actions(driver);
	 WebElement checkbox=driver.findElement(By.xpath("(//*[@name='checkbox'])[1]"));
	 a.click(checkbox).build().perform();Thread.sleep(500);
	 sectiongenerated=sectiongenerated.toLowerCase();
	 driver.findElement(By.id("userName")).sendKeys(sectiongenerated);
	 driver.findElement(By.id("userEmail")).sendKeys(sectiongenerated+"@gmail.com");
	 driver.findElement(By.id("firstName")).sendKeys(sectiongenerated);
	 driver.findElement(By.id("userGender")).click();
	 Thread.sleep(1000);
	 
	 a.sendKeys(Keys.DOWN,Keys.ENTER).build().perform();Thread.sleep(2000);
	 
	 driver.findElement(By.id("userRole")).click();
	 Thread.sleep(1000);
	 
	 a.sendKeys(Keys.DOWN,Keys.ENTER).build().perform();Thread.sleep(2000);
	 
	 driver.findElement(By.id("userPassword")).sendKeys(sectiongenerated);
	 Random random = new Random();
	 int x = random.nextInt(900) + 100;
	 
	 System.out.println(x);
	 driver.findElement(By.id("userMobile")).sendKeys("6000000"+x);
	 
	 driver.findElement(By.id("lastName")).sendKeys(sectiongenerated);
	 
	 driver.findElement(By.id("dobDate")).click();Thread.sleep(1000);
	 driver.findElement(By.xpath("(//*[text()='1'])[1]")).click();Thread.sleep(1000);
	 
	 driver.findElement(By.xpath("//*[text()='About user']//following-sibling::textarea")).sendKeys(sectiongenerated);
	 
	 File f3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(f3, new File("D:\\screenshots\\adduserName.jpg"));
	 logger.log(LogStatus.PASS,"Addpage",logger.addScreenCapture("D:\\screenshots\\adduserName.jpg"));
	 sectiongenerated=sectiongenerated.toLowerCase();
	 driver.findElement(By.xpath("//*[text()='Save']")).click();
	 
	 String searchsection="(//*[@class='moc-code ng-binding'])[1]";
	 waitexplicit(searchsection);
	 File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(f1, new File("D:\\screenshots\\searchuserName.jpg"));
	 String added=driver.findElement(By.xpath("(//*[@class='moc-code ng-binding'])[1]")).getText();
	 if(added.equals(sectiongenerated))
	 {
		 logger.log(LogStatus.PASS,"user display in search page",logger.addScreenCapture("D:\\screenshots\\searchuserName.jpg"));
		 
	 }
	 else
	 {
		 logger.log(LogStatus.FAIL,"user display in search page",logger.addScreenCapture("D:\\screenshots\\searchuserName.jpg"));
		 
	 }
     
	 String addedperson=driver.findElement(By.xpath("(//*[@class='ng-binding'])[2]")).getText();
	 if(addedperson.equals(createdperson))
	 {
		 logger.log(LogStatus.PASS,"Created person display in search page",logger.addScreenCapture("D:\\screenshots\\searchuserName.jpg"));
		 
	 }
	 else
	 {
		 logger.log(LogStatus.FAIL,"Created person display in search page",logger.addScreenCapture("D:\\screenshots\\searchuserName.jpg"));
		 
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
		 logger.log(LogStatus.PASS,"Date display in search page",logger.addScreenCapture("D:\\screenshots\\searchuserName.jpg"));
		 
	 }
	 else
	 {
		 logger.log(LogStatus.FAIL,"Date display in search page",logger.addScreenCapture("D:\\screenshots\\searchuserName.jpg"));
		 
	 }
	 driver.findElement(By.xpath("//*[text()='Logout']")).click();
	 String logout="//*[@name='userName']";
	 waitexplicit(logout);	Thread.sleep(1000);
	 
	 report.endTest(logger);
	 report.flush();
  }
  
  
  @Test(priority=1)
  public void loginuser() throws Exception {
	    driver.findElement(By.xpath("//*[@name='userName']")).sendKeys(sectiongenerated);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(sectiongenerated);
		
		driver.findElement(By.xpath("//*[text()='Login']")).click();
		String logout="//*[text()='Logout']";
		waitexplicit(logout);	Thread.sleep(1000);
		File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(f1, new File("D:\\screenshots\\loginusernew.jpg"));
		 if(driver.findElement(By.xpath(logout)).isDisplayed())
		 {
			 logger.log(LogStatus.PASS,"User Login",logger.addScreenCapture("D:\\screenshots\\loginusernew.jpg"));
			 
		 }
		 else
		 {
			 logger.log(LogStatus.FAIL,"User Login",logger.addScreenCapture("D:\\screenshots\\loginusernew.jpg"));
			 
		 }
		 report.endTest(logger);
		 report.flush();
		 driver.close();
  }
  
  
}
