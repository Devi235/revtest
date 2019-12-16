package User;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_327_to_331 extends Reuse {

	@Test
	public void tc_327_to_331() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"TC_327_to_331.html");
		logger =report.startTest("TC_327_to_331");
		
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
		 WebElement first=driver.findElement(By.xpath("(//*[@class='ng-binding'])[69]/input"));
		 WebElement second=driver.findElement(By.xpath("(//*[@class='ng-binding'])[70]/input"));
		 
		 first.click();
		 Thread.sleep(1000);
		 if(first.isSelected())
		 {
			 passscreenshot(driver, "tc_327", "TC-No : 327 - Individual Category is selected");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_327", "TC-No : 327 - Individual Category is not selected");
		 }
		 second.click();
		 Thread.sleep(1000);
		 if(first.isSelected() && second.isSelected())
		 {
			 passscreenshot(driver, "tc_328", "TC-No : 328 - Individually Multiple Categories are selected");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_328", "TC-No : 328 - Individually Multiple Categories are not selected");
		 }
		 
		 first.click();
		 Thread.sleep(1000);
		 second.click();
		 Thread.sleep(1000);
		 if(!first.isSelected() && !second.isSelected())
		 {
			 passscreenshot(driver, "tc_329", "TC-No : 329 - Selected Categories are deselected");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_329", "TC-No : 329 - Selected Categories are failed to deselect");
		 }
		 
		 first.click();
		 Thread.sleep(1000);
		 second.click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[@class='divdropDownFooter text-right'])[3]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@class='form-control searchField ng-valid ng-pristine ng-empty ng-touched']")).sendKeys("corrigendum");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[text()='clear'])[3]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[3]")).click();
		 Thread.sleep(2000);
		 
		 waitexplicit("//*[@class='form-control searchField ng-valid ng-touched ng-not-empty ng-dirty ng-valid-parse']");
		 String search1=driver.findElement(By.xpath("//*[@class='form-control searchField ng-valid ng-touched ng-not-empty ng-dirty ng-valid-parse']")).getAttribute("value");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[@class='divdropDownFooter text-right'])[3]")).click();
		 Thread.sleep(1000);
		 if(!search1.equals("corrigendum"))
		 {
			 passscreenshot(driver, "tc_330", "TC-No :330,331 - Clear all is working");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_330", "TC-No : 330,331 - Clear all is not working");
		 }
		 report.endTest(logger);
		 report.flush();
		 driver.close();
		}
}