package User;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_325_326 extends Reuse {

	@Test
	public void tc_325_326() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"TC_325_326.html");
		logger =report.startTest("TC_325_326");
		
		Launch();//driver launch
		Login();//open site
		AdminLogin();//login as admin 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Masters ']")).click();
		 Thread.sleep(3000);
		 JavascriptExecutor jsx=(JavascriptExecutor)driver;
		 WebElement NoticeCategory=driver.findElement(By.xpath("//*[text()='Notice Category']"));
		 jsx.executeScript("arguments[0].scrollIntoView(true);", NoticeCategory);
		 NoticeCategory.click();
		 String search="(//*[text()='Search for Notice Category'])";
		 waitexplicit(search);	
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@class='form-control ng-pristine ng-untouched ng-valid ng-empty']")).sendKeys("corrigendum");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[text()='Search']")).click();
		 Thread.sleep(4000);
		 waitexplicit("(//*[text()='Edit'])[1]");
		 driver.findElement(By.xpath("(//*[text()='Edit'])[1]")).click();
		 Thread.sleep(4000);
		 String userName="//*[text()='Edit Notice Category']";
		 waitexplicit(userName);Thread.sleep(4000);
		 if(driver.findElement(By.xpath("//*[@name='checkbox']")).isSelected())
		 {
			 driver.findElement(By.xpath("//*[@name='checkbox']")).click();
			 Thread.sleep(5000);
			 if(!driver.findElement(By.xpath("//*[@name='checkbox']")).isSelected())
			 {
				 passscreenshot(driver, "tc_326-1", "TC-No : 326 - Published checkbox is not selected");
			 }
			 else {
				 failscreenshot(driver, "tc_326-1", "TC-No : 326 - Published checkbox is selected");
			}
		 }
		 else
		 {
			 passscreenshot(driver, "tc_326-1", "TC-No : 326 - Published checkbox is not selected");
		 }
		 String categoryName=driver.findElement(By.id("categoryName")).getAttribute("value");
		 System.out.println(categoryName);
		 driver.findElement(By.xpath("//*[text()='Save']")).click();
		 Thread.sleep(5000);
		 waitexplicit("(//*[text()='Search for Notice Category'])");
		 Thread.sleep(4000);
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
		 waitexplicit(userName1);
		 Thread.sleep(8000);
		 jsx.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[3]")));
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[3]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='divdropDownFooter text-right'])[3]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()=' Select All'])[3]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()=' Select All'])[3]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='divdropDownFooter text-right'])[3]")).click();
		 Thread.sleep(2000);
		 waitexplicit("//*[@class='form-control searchField ng-valid ng-pristine ng-empty ng-touched']");	
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@class='form-control searchField ng-valid ng-pristine ng-empty ng-touched']")).sendKeys(categoryName);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='divdropDownFooter text-right'])[3]")).click();
		 Thread.sleep(4000);
		
		 try {
			 if(driver.findElement(By.xpath("//*[text()=' "+categoryName+"']")).isDisplayed())
			 {
				 failscreenshot(driver, "tc_326-2", "TC-No : 326 - Unpublished Category is displaying");
			 }
		} catch (Exception e) {
			passscreenshot(driver, "tc_326-2", "TC-No : 326 - Unpublished Category is not displaying");
		}
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[text()='Category']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[text()='Masters ']")).click();
		 Thread.sleep(3000);
		 WebElement NoticeCategory1=driver.findElement(By.xpath("//*[text()='Notice Category']"));
		 jsx.executeScript("arguments[0].scrollIntoView(true);", NoticeCategory1);
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//*[text()='Notice Category']")).click();Thread.sleep(2000);
		 String search1="(//*[text()='Search for Notice Category'])";
		 waitexplicit(search1);	
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@class='form-control ng-pristine ng-untouched ng-valid ng-empty']")).sendKeys(categoryName);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[text()='Search']")).click();
		 Thread.sleep(4000);
		 waitexplicit("(//*[text()='Edit'])[1]");
		 driver.findElement(By.xpath("(//*[text()='Edit'])[1]")).click();
		 Thread.sleep(4000);
		 String userName2="//*[text()='Edit Notice Category']";
		 waitexplicit(userName2);Thread.sleep(4000);
			 waitexplicit(userName2);Thread.sleep(4000);
			 if(!driver.findElement(By.xpath("//*[@name='checkbox']")).isSelected())
			 {
				 driver.findElement(By.xpath("//*[@class='checkbox']")).click();
				 Thread.sleep(5000);
				 if(driver.findElement(By.xpath("//*[@name='checkbox']")).isSelected())
				 {
					 passscreenshot(driver, "tc_325-1", "TC-No : 325 - Published checkbox is selected");
				 }
				 else {
					 failscreenshot(driver, "tc_325-1", "TC-No : 325 - Published checkbox is not selected");
				}
			 }
			 else
			 {
				 passscreenshot(driver, "tc_325-1", "TC-No : 325 - Published checkbox is selected");
			 }
			 
			 driver.findElement(By.xpath("//*[text()='Save']")).click();
			 Thread.sleep(5000);
			 waitexplicit("(//*[text()='Search for Notice Category'])");Thread.sleep(4000);
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
			 jsx.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[3]")));
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[3]")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("(//*[@class='divdropDownFooter text-right'])[3]")).click();
			 Thread.sleep(2000);
			 waitexplicit("//*[@class='form-control searchField ng-valid ng-pristine ng-empty ng-touched']");	
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@class='form-control searchField ng-valid ng-pristine ng-empty ng-touched']")).sendKeys(categoryName);
			 Thread.sleep(2000);
			 
			 try {
				 if(driver.findElement(By.xpath("//*[text()=' "+categoryName+"']")).isDisplayed())
				 {
					 passscreenshot(driver, "tc_325-2", "TC-No : 325 - Published Category is displaying");
				 }
			} catch (Exception e) {
				failscreenshot(driver, "tc_325-2", "TC-No : 325 - Published Category is not displaying");
			}
		 report.endTest(logger);
		 report.flush();
		 driver.close();
		}
}