package User;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_283_284 extends Reuse {

	@Test
	public void tc_283_284() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"TC_283_284.html");
		logger =report.startTest("TC_283_284");
		
		Launch();//driver launch
		Login();//open site
		AdminLogin();//login as admin 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Masters ']")).click();
		 Thread.sleep(3000);
		 JavascriptExecutor jsx=(JavascriptExecutor)driver;
		 WebElement Newspaper=driver.findElement(By.xpath("//*[text()='Newspaper']"));
		 jsx.executeScript("arguments[0].scrollIntoView(true);", Newspaper);
		 Newspaper.click();
		 String search="(//*[text()='News paper'])[1]";
		 waitexplicit(search);	
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("(//*[text()='Edit'])[1]")).click();
		 Thread.sleep(4000);
		 String userName="(//*[text()='Edit News paper'])[1]";
		 waitexplicit(userName);Thread.sleep(4000);
		 if(driver.findElement(By.xpath("//*[@name='checkbox']")).isSelected())
		 {
			 driver.findElement(By.xpath("//*[@name='checkbox']")).click();
			 Thread.sleep(5000);
			 if(!driver.findElement(By.xpath("//*[@name='checkbox']")).isSelected())
			 {
				 passscreenshot(driver, "tc_284-1", "TC-No : 284 - Published checkbox is not selected");
			 }
			 else {
				 failscreenshot(driver, "tc_284-1", "TC-No : 284 - Published checkbox is selected");
			}
		 }
		 else
		 {
			 passscreenshot(driver, "tc_284-1", "TC-No : 284 - Published checkbox is not selected");
		 }
		 String Newspapename=driver.findElement(By.name("newspaperName")).getAttribute("value");
		 System.out.println(Newspapename);
		 
		 driver.findElement(By.xpath("//*[text()='Save']")).click();
		 Thread.sleep(5000);
		 waitexplicit("//*[text()='Search News paper']");Thread.sleep(4000);
		 driver.findElement(By.xpath("//*[text()='Masters ']")).click();
		 Thread.sleep(3000);
		 WebElement User=driver.findElement(By.xpath("//*[text()='User']"));
		 jsx.executeScript("arguments[0].scrollIntoView(true);", User);
		 User.click();
		 Thread.sleep(5000);
		 String Add="//*[text()='Add New']";
		 waitexplicit(Add);	
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Edit'])[1]")).click();
		 Thread.sleep(4000);
		 String userName1="//*[@id='userName']";
		 waitexplicit(userName1);Thread.sleep(4000);
		 jsx.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[1]")));
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='divdropDownFooter text-right'])[1]")).click();
		 Thread.sleep(2000);
		 waitexplicit("//*[@class='form-control searchField ng-valid ng-pristine ng-empty ng-touched']");	
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@class='form-control searchField ng-valid ng-pristine ng-empty ng-touched']")).sendKeys(Newspapename);
		 Thread.sleep(2000);
		 try {
			 if(driver.findElement(By.xpath("//*[text()=' "+Newspapename+"']")).isDisplayed())
			 {
				 failscreenshot(driver, "tc_284-2", "TC-No : 284 - Unpublished Newspaper is displaying");
			 }
		} catch (Exception e) {
			passscreenshot(driver, "tc_284-2", "TC-No : 284 - Unpublished Newspaper is not displaying");
		}
		 
		 
		 driver.findElement(By.xpath("//*[text()='Masters ']")).click();
		 Thread.sleep(3000);
		 WebElement Newspaper1=driver.findElement(By.xpath("//*[text()='Newspaper']"));
		 jsx.executeScript("arguments[0].scrollIntoView(true);", Newspaper1);
		 Newspaper1.click();
		 waitexplicit(search);	
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@class='form-control ng-pristine ng-untouched ng-valid ng-empty']")).sendKeys(Newspapename);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[text()='Search']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("(//*[text()='Edit'])[1]")).click();
		 Thread.sleep(4000);
		 waitexplicit(userName);Thread.sleep(4000);
		 Thread.sleep(5000);
		 waitexplicit("(//*[text()='Edit News paper'])[1]");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@class='checkbox']")).click();
		 Thread.sleep(2000);
		 if(driver.findElement(By.xpath("//*[@name='checkbox']")).isSelected())
		 {
			 passscreenshot(driver, "tc_283-1", "TC-No : 283 - Published checkbox is selected");
		 }
		 else {
			 failscreenshot(driver, "tc_283-1", "TC-No : 283 - Published checkbox is not selected");
		}
		 driver.findElement(By.xpath("//*[text()='Save']")).click();
		 Thread.sleep(4000);
		 waitexplicit("//*[text()='Search News paper']");Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[text()='Masters ']")).click();
		 Thread.sleep(3000);
		 WebElement User1=driver.findElement(By.xpath("//*[text()='User']"));
		 jsx.executeScript("arguments[0].scrollIntoView(true);", User1);
		 User1.click();
		 String Add1="//*[text()='Add New']";
		 waitexplicit(Add1);	
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("(//*[text()='Edit'])[1]")).click();
		 Thread.sleep(4000);
		 String userName2="//*[@id='userName']";
		 waitexplicit(userName2);Thread.sleep(4000);
		 jsx.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[1]")));
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='divdropDownFooter text-right'])[1]")).click();
		 Thread.sleep(2000);
		 waitexplicit("//*[@class='form-control searchField ng-valid ng-pristine ng-empty ng-touched']");	
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@class='form-control searchField ng-valid ng-pristine ng-empty ng-touched']")).sendKeys(Newspapename);
		 Thread.sleep(2000);
		 try {
			 if(driver.findElement(By.xpath("//*[text()=' "+Newspapename+"']")).isDisplayed())
			 {
				 passscreenshot(driver, "tc_283-2", "TC-No : 283 - Published Newspaper is displaying");
			 }
		} catch (Exception e) {
			failscreenshot(driver, "tc_283-2", "TC-No : 283 - Published Newspaper is not displaying");
		}
		 report.endTest(logger);
		 report.flush();
		 //driver.close();
		}
}