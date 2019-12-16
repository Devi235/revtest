package User;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_267_to_273 extends Reuse {

	@Test
	public void tc_267_to_273() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"TC_267_to_273.html");
		logger =report.startTest("TC_267_to_273");
		
		Launch();//driver launch
		Login();//open site
		AdminLogin();//login as admin 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Masters ']")).click();
		 Thread.sleep(3000);
		 JavascriptExecutor jsx=(JavascriptExecutor)driver;
		 WebElement User=driver.findElement(By.xpath("//*[text()='User']"));
		 jsx.executeScript("arguments[0].scrollIntoView(true);", User);
		 User.click();
		 String search="//*[text()='Add New']";
		 waitexplicit(search);	
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("(//*[text()='Edit'])[1]")).click();
		 Thread.sleep(4000);
		 String userName="//*[@id='userName']";
		 waitexplicit(userName);Thread.sleep(4000);
		 jsx.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//*[@id='TAT']")));
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id='TAT']")).clear();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[text()='TAT (In days)']")).click();
		 Thread.sleep(1000);
		 String TAT1=driver.findElement(By.xpath("//*[@id='TAT']")).getAttribute("placeholder");
		 System.out.println(TAT1);
		 if(TAT1.equals("Enter TAT"))
		 {
			 passscreenshot(driver, "tc_267_to_273_1", "TC-No : 268 - Water mark is displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_267_to_273_1", "TC-No : 268 - Water mark is displaying");
		 }
		 driver.findElement(By.xpath("//*[@id='TAT']")).sendKeys("abcde");
		 driver.findElement(By.xpath("//*[text()='TAT (In days)']")).click();
		 Thread.sleep(1000);
		 String TAT2=driver.findElement(By.xpath("//*[@id='TAT']")).getAttribute("value");
		 System.out.println(TAT2);
		 if(TAT2.equals(""))
		 {
			 passscreenshot(driver, "tc_267_to_273_2", "TC-No : 269 - TAT field is not accepting alphabets");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_267_to_273_2", "TC-No : 269 - TAT field is accepting alphabets");
		 }
		 driver.findElement(By.xpath("//*[@id='TAT']")).clear();
		 driver.findElement(By.xpath("//*[@id='TAT']")).sendKeys("!@!@@");
		 driver.findElement(By.xpath("//*[text()='TAT (In days)']")).click();
		 Thread.sleep(1000);
		 String TAT3=driver.findElement(By.xpath("//*[@id='TAT']")).getAttribute("value");
		 System.out.println(TAT3);
		 if(TAT3.equals(""))
		 {
			 passscreenshot(driver, "tc_267_to_273_3", "TC-No : 270 - TAT field is not accepting special characters");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_267_to_273_3", "TC-No : 270 - TAT field is accepting special characters");
		 }
		 driver.findElement(By.xpath("//*[@id='TAT']")).clear();
		 driver.findElement(By.xpath("//*[@id='TAT']")).sendKeys("28");
		 driver.findElement(By.xpath("//*[text()='TAT (In days)']")).click();
		 Thread.sleep(1000);
		 String TAT4=driver.findElement(By.xpath("//*[@id='TAT']")).getAttribute("value");
		 System.out.println(TAT4);
		 if(TAT4.equals("28"))
		 {
			 passscreenshot(driver, "tc_267_to_273_4", "TC-No : 271 - TAT field is accepting Numerics");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_267_to_273_4", "TC-No : 271 - TAT field is accepting Numerics");
		 }
		 
		 driver.findElement(By.xpath("//*[@id='TAT']")).click();
		 driver.findElement(By.xpath("//*[@id='TAT']")).sendKeys(Keys.ARROW_UP);
		 driver.findElement(By.xpath("//*[text()='TAT (In days)']")).click();
		 Thread.sleep(1000);
		 String TAT5=driver.findElement(By.xpath("//*[@id='TAT']")).getAttribute("value");
		 System.out.println(TAT5);
		 if(TAT5.equals("29"))
		 {
			 passscreenshot(driver, "tc_267_to_273_5", "TC-No : 272 - Scroll up is working");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_267_to_273_5", "TC-No : 272 - Scroll up is not working");
		 }
		
		 driver.findElement(By.xpath("//*[@id='TAT']")).click();
		 driver.findElement(By.xpath("//*[@id='TAT']")).sendKeys(Keys.ARROW_DOWN);
		 driver.findElement(By.xpath("//*[text()='TAT (In days)']")).click();
		 Thread.sleep(1000);
		 String TAT6=driver.findElement(By.xpath("//*[@id='TAT']")).getAttribute("value");
		 System.out.println(TAT6);
		 if(TAT6.equals("28"))
		 {
			 passscreenshot(driver, "tc_267_to_273_6", "TC-No : 272 - Scroll down is working");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_267_to_273_6", "TC-No : 272 - Scroll down is not working");
		 }
		 
		 driver.findElement(By.xpath("//*[@id='TAT']")).clear();
		 driver.findElement(By.xpath("//*[@id='TAT']")).sendKeys("-24");
		 driver.findElement(By.xpath("//*[text()='TAT (In days)']")).click();
		 jsx.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//*[text()='Save']")));
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[text()='Save']")).click();
		 Thread.sleep(8000);
		 
		 if(driver.findElement(By.xpath("")).isDisplayed())//error
		 {
			 passscreenshot(driver, "tc_267_to_273_7", "TC-No : 273 - Error message for negative number is displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_267_to_273_7", "TC-No : 273 - Error message for negative number is not displaying");
		 }
		 report.endTest(logger);
		 report.flush();
		 driver.close();
		}
}