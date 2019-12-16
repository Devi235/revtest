package User;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_311_to_314 extends Reuse {

	@Test
	public void tc_311_to_314() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"TC_311_to_314.html");
		logger =report.startTest("TC_311_to_314");
		
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
		
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[@class='ng-binding'])[60]/input")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[@class='ng-binding'])[61]/input")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[text()='Submit'])[2]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[2]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[@class='divdropDownFooter text-right'])[2]")).click();
		 Thread.sleep(2000);
		
		 if(driver.findElement(By.xpath("(//*[@class='ng-binding'])[60]/input")).isSelected() && driver.findElement(By.xpath("(//*[@class='ng-binding'])[61]/input")).isSelected())
		 {
			 passscreenshot(driver, "tc_311", "TC-No : 311,312 - Submit is clickable and Editios are able to select");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_311", "TC-No : 311,312 - Editios are not able to select when click on submit");
		 }
		 
		 Thread.sleep(2000);
		 String count=driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[2]")).getText();
		 Thread.sleep(1000);
		 String countrep=count.replace(" Edition(s) Selected", "");
		 Thread.sleep(1000);
		 System.out.println(countrep);
		 int counter=Integer.parseInt(countrep);
		 Thread.sleep(1000);
		 
		 if(counter==2)
		 {
			 passscreenshot(driver, "tc_313", "TC-No : 313 - Selected Editions count is displaying corectly");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_313", "TC-No : 313 - Selected Editions count is not displaying corectly");
		 }
		 
		 driver.findElement(By.xpath("(//*[@class='divdropDownFooter text-right'])[2]")).click();
		 Thread.sleep(1000);
		 waitexplicit("(//*[@class='ng-binding'])[61]/input");	
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[@class='ng-binding'])[61]/input")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//*[text()='News Paper']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[text()='Save']")).click();
		 Thread.sleep(5000);
		 waitexplicit("(//*[text()='Edit'])[1]");	
		 driver.findElement(By.xpath("(//*[text()='Edit'])[1]")).click();
		 Thread.sleep(4000);
		 waitexplicit(userName);Thread.sleep(4000);
		 jsx.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[2]")));
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[2]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[@class='divdropDownFooter text-right'])[2]")).click();
		 Thread.sleep(2000);
		
		 if(driver.findElement(By.xpath("(//*[@class='ng-binding'])[61]/input")).isSelected())
		 {
			 passscreenshot(driver, "tc_314", "TC-No : 314 - Results are not saving without clicking on submit");
		 }
		 else {
			 failscreenshot(driver, "tc_314", "TC-No : 314 - Results are saving without clicking on submit");
		}
		 
		 report.endTest(logger);
		 report.flush();
		 driver.close();
		}
}