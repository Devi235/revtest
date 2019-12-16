package User;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_304_305 extends Reuse {

	@Test
	public void tc_304_305() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"TC_304_305.html");
		logger =report.startTest("TC_304_305");
		
		Launch();//driver launch
		Login();//open site
		AdminLogin();//login as admin 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Masters ']")).click();
		 Thread.sleep(3000);
		 JavascriptExecutor jsx=(JavascriptExecutor)driver;
		 WebElement Edition=driver.findElement(By.xpath("//*[text()='Edition']"));
		 jsx.executeScript("arguments[0].scrollIntoView(true);", Edition);
		 Edition.click();
		 String search="(//*[text()='Edition'])[2]";
		 waitexplicit(search);	
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@class='form-control ng-pristine ng-untouched ng-valid ng-empty']")).sendKeys("amar ujala");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[text()='Search']")).click();
		 Thread.sleep(4000);
		 waitexplicit("(//*[text()='Edit'])[1]");
		 driver.findElement(By.xpath("(//*[text()='Edit'])[1]")).click();
		 Thread.sleep(4000);
		 String userName="//*[text()='Edit Edition']";
		 waitexplicit(userName);Thread.sleep(4000);
		 if(driver.findElement(By.xpath("//*[@name='checkbox']")).isSelected())
		 {
			 driver.findElement(By.xpath("//*[@name='checkbox']")).click();
			 Thread.sleep(5000);
			 if(!driver.findElement(By.xpath("//*[@name='checkbox']")).isSelected())
			 {
				 passscreenshot(driver, "tc_305-1", "TC-No : 284 - Published checkbox is not selected");
			 }
			 else {
				 failscreenshot(driver, "tc_305-1", "TC-No : 284 - Published checkbox is selected");
			}
		 }
		 else
		 {
			 passscreenshot(driver, "tc_305-1", "TC-No : 284 - Published checkbox is not selected");
		 }
		 String Editionname=driver.findElement(By.xpath("//*[@id='cityName']")).getAttribute("value");
		 System.out.println(Editionname);
		 driver.findElement(By.xpath("//*[text()='Save']")).click();
		 Thread.sleep(5000);
		 waitexplicit("//*[text()='Search for Edition']");Thread.sleep(4000);
		 driver.findElement(By.xpath("//*[text()='Masters ']")).click();
		 Thread.sleep(5000);
		 WebElement User=driver.findElement(By.xpath("//*[text()='User']"));
		 jsx.executeScript("arguments[0].scrollIntoView(true);", User);
		 User.click();
		 Thread.sleep(5000);
		 String Add="(//*[text()='Edit'])[1]";
		 waitexplicit(Add);	
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Edit'])[1]")).click();
		 Thread.sleep(5000);
		 String userName1="//*[@id='userName']";
		 waitexplicit(userName1);Thread.sleep(5000);
		 jsx.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[1]")));
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='divdropDownFooter text-right'])[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()=' Select All'])[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()=' Select All'])[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='divdropDownFooter text-right'])[1]")).click();
		 Thread.sleep(2000);
		 waitexplicit("//*[@class='form-control searchField ng-valid ng-pristine ng-empty ng-touched']");	
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@class='form-control searchField ng-valid ng-pristine ng-empty ng-touched']")).sendKeys("amar ujala");
		 Thread.sleep(2000);
		 
		 if ( driver.findElement(By.xpath("//*[text()=' amar ujala']")).isDisplayed()) {
			 driver.findElement(By.xpath("//*[text()=' amar ujala']")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("(//*[text()='Submit'])[1]")).click();
			 Thread.sleep(2000);
		}
		 driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[2]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='divdropDownFooter text-right'])[2]")).click();
		 Thread.sleep(2000);
		 waitexplicit("//*[@class='form-control searchField ng-valid ng-pristine ng-empty ng-touched']");	
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@class='form-control searchField ng-valid ng-pristine ng-empty ng-touched']")).sendKeys(Editionname);
		 Thread.sleep(2000);
		 
		 try {
			 if(driver.findElement(By.xpath("//*[text()=' "+Editionname+"']")).isDisplayed())
			 {
				 failscreenshot(driver, "tc_305-2", "TC-No : 305 - Unpublished Edition is displaying");
			 }
		} catch (Exception e) {
			passscreenshot(driver, "tc_305-2", "TC-No : 305 - Unpublished Edition is not displaying");
		}
		 
		 
		 Thread.sleep(3000);
			driver.findElement(By.xpath("//*[text()='Masters ']")).click();
			 Thread.sleep(3000);
			 WebElement Edition1=driver.findElement(By.xpath("//*[text()='Edition']"));
			 jsx.executeScript("arguments[0].scrollIntoView(true);", Edition1);
			 Edition1.click();
			 String search1="(//*[text()='Edition'])[2]";
			 Thread.sleep(5000);
			 driver.findElement(By.xpath("//*[@class='form-control ng-pristine ng-untouched ng-valid ng-empty']")).sendKeys("amar ujala");
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//*[text()='Search']")).click();
			 Thread.sleep(4000);
			 waitexplicit("(//*[text()='Edit'])[1]");
			 driver.findElement(By.xpath("(//*[text()='Edit'])[1]")).click();
			 Thread.sleep(4000);
			 String userName2="//*[text()='Edit Edition']";
			 waitexplicit(userName2);Thread.sleep(4000);
			 if(!driver.findElement(By.xpath("//*[@name='checkbox']")).isSelected())
			 {
				 driver.findElement(By.xpath("//*[@class='checkbox']")).click();
				 Thread.sleep(5000);
				 if(driver.findElement(By.xpath("//*[@name='checkbox']")).isSelected())
				 {
					 passscreenshot(driver, "tc_304-1", "TC-No : 304 - Published checkbox is selected");
				 }
				 else {
					 failscreenshot(driver, "tc_304-1", "TC-No : 304 - Published checkbox is not selected");
				}
			 }
			 else
			 {
				 passscreenshot(driver, "tc_304-1", "TC-No : 304 - Published checkbox is selected");
			 }
			 
			 driver.findElement(By.xpath("//*[text()='Save']")).click();
			 Thread.sleep(5000);
			 waitexplicit("//*[text()='Search for Edition']");Thread.sleep(4000);
			 driver.findElement(By.xpath("//*[text()='Masters ']")).click();
			 Thread.sleep(3000);
			 WebElement User1=driver.findElement(By.xpath("//*[text()='User']"));
			 jsx.executeScript("arguments[0].scrollIntoView(true);", User1);
			 User1.click();
			 Thread.sleep(5000);
			 String Add1="//*[text()='Add New']";
			 waitexplicit(Add1);	
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("(//*[text()='Edit'])[1]")).click();
			 Thread.sleep(4000);
			 String userName3="//*[@id='userName']";
			 waitexplicit(userName3);Thread.sleep(4000);
			 jsx.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[1]")));
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[1]")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("(//*[@class='divdropDownFooter text-right'])[1]")).click();
			 Thread.sleep(2000);
			 waitexplicit("//*[@class='form-control searchField ng-valid ng-pristine ng-empty ng-touched']");	
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@class='form-control searchField ng-valid ng-pristine ng-empty ng-touched']")).sendKeys("amar ujala");
			 Thread.sleep(2000);
			 
			 if ( driver.findElement(By.xpath("//*[text()=' amar ujala']")).isDisplayed()) {
				 driver.findElement(By.xpath("//*[text()=' amar ujala']")).click();
				 Thread.sleep(2000);
				 driver.findElement(By.xpath("(//*[text()='Submit'])[1]")).click();
				 Thread.sleep(2000);
			}
			 driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[2]")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("(//*[@class='divdropDownFooter text-right'])[2]")).click();
			 Thread.sleep(2000);
			 waitexplicit("//*[@class='form-control searchField ng-valid ng-pristine ng-empty ng-touched']");	
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@class='form-control searchField ng-valid ng-pristine ng-empty ng-touched']")).sendKeys(Editionname);
			 Thread.sleep(2000);
			 
			 
			 try {
				 if(driver.findElement(By.xpath("//*[text()=' "+Editionname+"']")).isDisplayed())
				 {
					 passscreenshot(driver, "tc_305", "TC-No : 305 - Published Edition is displaying");
				 }
			} catch (Exception e) {
				failscreenshot(driver, "tc_305", "TC-No : 305 - Published Edition is not displaying");
			}
		 report.endTest(logger);
		 report.flush();
		 driver.close();
		}
}