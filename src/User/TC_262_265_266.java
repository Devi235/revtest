package User;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_262_265_266 extends Reuse {

	@Test
	public void tc_262_265_266() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"TC_262_265_266.html");
		logger =report.startTest("TC_262_265_266");
		
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
		 waitexplicit(search);	Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@class='form-control ng-pristine ng-untouched ng-valid ng-empty']")).sendKeys("testingcustomer");
		 driver.findElement(By.xpath("//*[text()='Search']")).click();
		 Thread.sleep(5000);
		 String UserName=driver.findElement(By.xpath("(//*[@class='moc-code ng-binding'])[1]")).getText();
		 System.out.println(UserName);
		 driver.findElement(By.xpath("(//*[text()='Edit'])[1]")).click();
		 Thread.sleep(4000);
		 String userName="//*[@id='userName']";
		 waitexplicit(userName);Thread.sleep(4000);
		 
		 ScrollDown(400);
		 
		 Thread.sleep(5000);
		 
		 WebElement DisplayNamecheckbox=driver.findElement(By.xpath("//*[text()='Display name field in search']/input"));
		 
		 if(DisplayNamecheckbox.isSelected())
		 {
			 passscreenshot(driver, "tc_262-1", "TC-No : 262 - Display Name checkbox is selected");
		 }
		 else
		 {
			 Thread.sleep(5000);
			 driver.findElement(By.xpath("//*[text()='Display name field in search']")).click();
			 Thread.sleep(2000);
			 if(driver.findElement(By.xpath("//*[text()='Display name field in search']/input")).isSelected())
			 {
				 passscreenshot(driver, "tc_262-1", "TC-No : 262 - Display Name checkbox is selected");
			 }
			 else {
				 failscreenshot(driver, "tc_262-1", "TC-No : 262 - Display Name checkbox is not selected");
			}
		 }
		 jsx.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//*[text()='Save']")));
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[text()='Save']")).click();
		 Thread.sleep(4000);
		 waitexplicit("//*[@class='form-control ng-pristine ng-untouched ng-valid ng-empty']");Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[text()='Logout']")).click();
		 Thread.sleep(5000);
		waitexplicit("//*[@name='userName']");	Thread.sleep(500);
		
		driver.findElement(By.xpath("//*[@name='userName']")).sendKeys(UserName);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("password");
		
		driver.findElement(By.xpath("//*[text()='Login']")).click();
		String logout="//*[@id='addressName']";
		waitexplicit(logout);	Thread.sleep(5000);
		
		if(driver.findElement(By.xpath("//*[@id='addressName']")).isDisplayed())
		 {
			 passscreenshot(driver, "tc_262-2", "TC-No : 262 - Name field is displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_262-2", "TC-No : 262 - Name field is not displaying");
		 }
		 
		driver.findElement(By.xpath("//*[text()='Logout']")).click();
		 Thread.sleep(2000);
		waitexplicit("//*[@name='userName']");	Thread.sleep(500);
		AdminLogin();//login as admin 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Masters ']")).click();
		 Thread.sleep(3000);
		 WebElement User1=driver.findElement(By.xpath("//*[text()='User']"));
		 jsx.executeScript("arguments[0].scrollIntoView(true);", User1);
		 User1.click();
		 String search1="//*[text()='Add New']";
		 waitexplicit(search1);	Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@class='form-control ng-pristine ng-untouched ng-valid ng-empty']")).sendKeys(UserName);
		 driver.findElement(By.xpath("//*[text()='Search']")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("(//*[text()='Edit'])[1]")).click();
		 waitexplicit(userName);Thread.sleep(5000);
		 
		 ScrollDown(400);
		 
		 Thread.sleep(5000);
		 
		 WebElement DisplayNamecheckbox1=driver.findElement(By.xpath("//*[text()='Display name field in search']/input"));
		 
		 if(DisplayNamecheckbox1.isSelected())
		 {
			 Thread.sleep(5000);
			 driver.findElement(By.xpath("//*[text()='Display name field in search']")).click();
			 Thread.sleep(5000);
			 if(!driver.findElement(By.xpath("//*[text()='Display name field in search']/input")).isSelected())
			 {
				 passscreenshot(driver, "tc_263-1", "TC-No : 263 - Display Name checkbox is not selected");
			 }
			 else {
				 failscreenshot(driver, "tc_263-1", "TC-No : 263 - Display Name checkbox is selected");
			}
		 }
		 else
		 {
			 passscreenshot(driver, "tc_263-1", "TC-No : 263 - Display Name checkbox is not selected");
		 }
		 
		 jsx.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//*[text()='Save']")));
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[text()='Save']")).click();
		 Thread.sleep(5000);
		 waitexplicit("//*[@class='form-control ng-pristine ng-untouched ng-valid ng-empty']");Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[text()='Logout']")).click();
		 Thread.sleep(5000);
		waitexplicit("//*[@name='userName']");	Thread.sleep(500);
		
		driver.findElement(By.xpath("//*[@name='userName']")).sendKeys(UserName);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("password");
		
		driver.findElement(By.xpath("//*[text()='Login']")).click();
		waitexplicit("//*[text()='Search Address']");	Thread.sleep(5000);
		
		try {
			if(driver.findElement(By.xpath("//*[@id='addressName']")).isDisplayed())
			 {
				 failscreenshot(driver, "tc_263-2", "TC-No : 262 - Name field is displaying");
			 }
		} catch (Exception e) {
			passscreenshot(driver, "tc_263-2", "TC-No : 262 - Name field is not displaying");
		}
		
		 report.endTest(logger);
		 report.flush();
		 driver.close();
		}
}