package User;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_290_to_293 extends Reuse {

	@Test
	public void tc_290_to_293() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"TC_290_to_293.html");
		logger =report.startTest("TC_290_to_293");
		
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
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[1]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[@class='divdropDownFooter text-right'])[1]")).click();
		 Thread.sleep(1000);
		 waitexplicit("//*[@class='form-control searchField ng-valid ng-pristine ng-empty ng-touched']");	
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='divdropDownFooter text-right'])[1]")).click();
		 Thread.sleep(1000);
		 if (driver.findElement(By.xpath("(//*[@class='spnSelectall'])[1]/label/input")).isSelected()) {
			 driver.findElement(By.xpath("(//*[@class='spnSelectall'])[1]")).click();
			 Thread.sleep(1000);
		}
		 else {
			 driver.findElement(By.xpath("(//*[@class='spnSelectall'])[1]")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//*[@class='spnSelectall'])[1]")).click();
		}
		
		 waitexplicit("//*[@class='form-control searchField ng-valid ng-pristine ng-empty ng-touched']");
		 driver.findElement(By.xpath("//*[@class='form-control searchField ng-valid ng-pristine ng-empty ng-touched']")).sendKeys("amar ujala");		
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[@class='divdropDownFooter text-right'])[1]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[@class='ng-binding'])[3]/input")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[text()='Submit'])[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[2]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[@class='divdropDownFooter text-right'])[2]")).click();
		 Thread.sleep(2000);
		
		 if(driver.findElement(By.xpath("(//*[text()=' amar ujala physical-bambooflat-english'])")).isDisplayed())
		 {
			 passscreenshot(driver, "tc_290", "TC-No : 290,291 - Editions are displaying for selected Newspapers");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_290", "TC-No : 290,291 - Editions are displaying for selected Newspapers");
		 }
		 
		 driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[1]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[@class='divdropDownFooter text-right'])[1]")).click();
		 Thread.sleep(1000);
		 waitexplicit("//*[@class='form-control searchField ng-valid ng-touched ng-not-empty ng-dirty ng-valid-parse']");	
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@class='form-control searchField ng-valid ng-touched ng-not-empty ng-dirty ng-valid-parse']")).clear();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='ng-binding'])[4]/input")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[text()='Submit'])[1]")).click();
		 Thread.sleep(2000);
		 
		 String count=driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[1]")).getText();
		 Thread.sleep(1000);
		 String countrep=count.replace(" Newspaper(s) Selected", "");
		 Thread.sleep(1000);
		 System.out.println(countrep);
		 int counter=Integer.parseInt(countrep);
		 Thread.sleep(1000);
		 
		 if(counter==2)
		 {
			 passscreenshot(driver, "tc_292", "TC-No : 292 - Selected Newspapers count is displaying corectly");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_292", "TC-No : 292 - Selected Newspapers count is not displaying corectly");
		 }
		 
		 driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[1]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[@class='divdropDownFooter text-right'])[1]")).click();
		 Thread.sleep(1000);
		 waitexplicit("(//*[@class='ng-binding'])[4]");	
		 
		 driver.findElement(By.xpath("(//*[@class='ng-binding'])[4]/input")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[text()='Submit'])[1]")).click();
		 Thread.sleep(2000);

		 driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[1]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[@class='divdropDownFooter text-right'])[1]")).click();
		 Thread.sleep(1000);
		 waitexplicit("(//*[@class='spnSelectall'])[1]");	
		 
		 driver.findElement(By.xpath("(//*[@class='spnSelectall'])[1]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[@class='spnSelectall'])[1]")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//*[text()='News Paper']")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[2]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[@class='divdropDownFooter text-right'])[2]")).click();
		 Thread.sleep(1000);
		
		 try {
			 if(driver.findElement(By.xpath("(//*[text()=' amar ujala physical-bambooflat-english'])")).isDisplayed())
			 {
				 failscreenshot(driver, "tc_293", "TC-No : 293 - Results are saving without clicking on submit");
			 }
		} catch (Exception e) {
			 passscreenshot(driver, "tc_293", "TC-No : 293 - Results are not saving without clicking on submit");
		}
		 
		 
		 report.endTest(logger);
		 report.flush();
		 driver.close();
		}
}