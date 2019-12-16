package User;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_275_296_317 extends Reuse {

	@Test
	public void tc_275_296_317() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"TC_275_296_317.html");
		logger =report.startTest("TC_275_296_317");
		
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
		 driver.findElement(By.xpath("//*[text()='Add New']")).click();
		 Thread.sleep(4000);
		 String userName="//*[@id='userName']";
		 waitexplicit(userName);Thread.sleep(4000);
		 
		 Select s=new Select(driver.findElement(By.id("userRole")));
		 s.selectByVisibleText("IndependentCustomer");Thread.sleep(2000);
		 
		 ScrollDown(400);
		 jsx.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[1]")));
		 Thread.sleep(2000);
		 WebElement Newspaper=driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[1]"));
		 Thread.sleep(2000);
		 Select selectNewspaper = new Select(Newspaper);
		 WebElement optionNewspaper = selectNewspaper.getFirstSelectedOption();
		 String SelectedTextNewspaper = optionNewspaper.getText();
		 System.out.println(SelectedTextNewspaper);
		 
		 
		 if(SelectedTextNewspaper.equals("Select "))
		 {
			 passscreenshot(driver, "tc_275", "TC-No : 275 - By default Select is displaying in Newspaper dropdown");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_275", "TC-No : 275 - By default Select is not displaying in Newspaper dropdown");
		 }
		 
		 WebElement Editoin=driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[2]"));
		 Thread.sleep(2000);
		 Select selectEditoin = new Select(Editoin);
		 WebElement optionEditoin = selectEditoin.getFirstSelectedOption();
		 String SelectedTextEditoin = optionEditoin.getText();
		 System.out.println(SelectedTextEditoin);
		 
		 
		 if(SelectedTextEditoin.equals("Select "))
		 {
			 passscreenshot(driver, "tc_296", "TC-No : 296 - By default Select is displaying in Edition dropdown");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_296", "TC-No : 296 - By default Select is not displaying in Edition dropdown");
		 }
		 
		 WebElement Category=driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[1]"));
		 Thread.sleep(2000);
		 Select selectCategory = new Select(Category);
		 WebElement optionCategory = selectCategory.getFirstSelectedOption();
		 String SelectedTextCategory = optionCategory.getText();
		 System.out.println(SelectedTextCategory);
		 
		 
		 if(SelectedTextCategory.equals("Select "))
		 {
			 passscreenshot(driver, "tc_317", "TC-No : 317 - By default Select is displaying in Category dropdown");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_317", "TC-No : 317 - By default Select is not displaying in Category dropdown");
		 }
		 report.endTest(logger);
		 report.flush();
		//driver.close();
	}
}
