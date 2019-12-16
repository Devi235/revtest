package User;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_332_to_335 extends Reuse {

	@Test
	public void tc_332_to_335() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"TC_332_to_335.html");
		logger =report.startTest("TC_332_to_335");
		
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
		 jsx.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[1]")));
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='divdropDownFooter text-right'])[1]")).click();
		 Thread.sleep(2000);
		 if (driver.findElement(By.xpath("(//*[text()=' Select All'])[1]/input")).isSelected()) {
			 driver.findElement(By.xpath("(//*[text()=' Select All'])[1]")).click();
			 Thread.sleep(2000);
		}
		 else {
			 driver.findElement(By.xpath("(//*[text()=' Select All'])[1]")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("(//*[text()=' Select All'])[1]")).click();
			 Thread.sleep(2000);
		}
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='ng-binding'])[3]/input")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Submit'])[1]")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[2]")).click();
		 Thread.sleep(2000);
		 if (driver.findElement(By.xpath("(//*[text()=' Select All'])[2]/input")).isSelected()) {
			 driver.findElement(By.xpath("(//*[text()=' Select All'])[2]")).click();
			 Thread.sleep(2000);
		}
		 else {
			 driver.findElement(By.xpath("(//*[text()=' Select All'])[2]")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("(//*[text()=' Select All'])[2]")).click();
			 Thread.sleep(2000);
		}
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='ng-binding'])[60]/input")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Submit'])[2]")).click();
		 Thread.sleep(2000);
		
		 driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[3]")).click();
		 Thread.sleep(2000);
		 if (driver.findElement(By.xpath("(//*[text()=' Select All'])[3]/input")).isSelected()) {
			 driver.findElement(By.xpath("(//*[text()=' Select All'])[3]")).click();
			 Thread.sleep(2000);
		}
		 else {
			 driver.findElement(By.xpath("(//*[text()=' Select All'])[3]")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("(//*[text()=' Select All'])[3]")).click();
			 Thread.sleep(2000);
		}
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='ng-binding'])[69]/input")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='ng-binding'])[70]/input")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[text()='Submit'])[3]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[3]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[@class='divdropDownFooter text-right'])[3]")).click();
		 Thread.sleep(2000);
		
		 if(driver.findElement(By.xpath("(//*[@class='ng-binding'])[69]/input")).isSelected() && driver.findElement(By.xpath("(//*[@class='ng-binding'])[70]/input")).isSelected())
		 {
			 passscreenshot(driver, "tc_332", "TC-No : 332,333 - Submit is clickable and Categories are able to select");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_332", "TC-No : 332,333 - Categories are not able to select when click on submit");
		 }
		 
		 Thread.sleep(2000);
		 String count=driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[3]")).getText();
		 Thread.sleep(1000);
		 String countrep=count.replace(" Category(s) Selected", "");
		 Thread.sleep(1000);
		 System.out.println(countrep);
		 int counter=Integer.parseInt(countrep);
		 Thread.sleep(2000);
		 
		 if(counter==2)
		 {
			 passscreenshot(driver, "tc_334", "TC-No : 334 - Selected Categories count is displaying corectly");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_334", "TC-No : 334 - Selected Categories count is not displaying corectly");
		 }
		 
		 driver.findElement(By.xpath("(//*[@class='divdropDownFooter text-right'])[3]")).click();
		 Thread.sleep(1000);
		 waitexplicit("(//*[@class='ng-binding'])[70]/input");	
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[@class='ng-binding'])[70]/input")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//*[text()='News Paper']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[text()='Save']")).click();
		 Thread.sleep(5000);
		 waitexplicit("(//*[text()='Edit'])[1]");	
		 driver.findElement(By.xpath("(//*[text()='Edit'])[1]")).click();
		 Thread.sleep(4000);
		 waitexplicit(userName);Thread.sleep(4000);
		 jsx.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[3]")));
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[3]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[@class='divdropDownFooter text-right'])[3]")).click();
		 Thread.sleep(2000);
		
		 if(driver.findElement(By.xpath("(//*[@class='ng-binding'])[70]/input")).isSelected())
		 {
			 passscreenshot(driver, "tc_335", "TC-No : 335 - Results are not saving without clicking on submit");
		 }
		 else {
			 failscreenshot(driver, "tc_335", "TC-No : 335 - Results are saving without clicking on submit");
		}
		 
		 report.endTest(logger);
		 report.flush();
		 //driver.close();
		}
}