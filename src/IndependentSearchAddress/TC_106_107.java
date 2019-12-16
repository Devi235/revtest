package IndependentSearchAddress;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

	public class TC_106_107 extends Reuse {
	
	public String Newspapername = "business standard";
	public String Categoryname = "disinheritance";
	public String Edition = "business standard-delhi-english";
		
	@Test
	public void tc_106_107() throws Exception {
		
	report=new ExtentReports(ReportSavingPath+"\\IndependentSearchAddress\\"+"TC_106_107.html");
	logger =report.startTest("TC_106_107");
	
	Launch();//driver launch
	Login();//open site
	
	AdminLogin();	 //login as admin 
	
	driver.findElement(By.xpath("//*[text()='Search Notice']")).click();
	Thread.sleep(7000);
	Select Newspaper=new Select(driver.findElement(By.xpath("//*[@id='newsPaper']")));
	Thread.sleep(2000);
	Newspaper.selectByVisibleText(Newspapername);
	Thread.sleep(2000);
	Select edition=new Select(driver.findElement(By.xpath("//*[@id='edition']")));
	Thread.sleep(2000);
	edition.selectByVisibleText(Edition);
	Thread.sleep(2000);
	Select Category=new Select(driver.findElement(By.xpath("//*[@id='category']")));
	Thread.sleep(2000);
	Category.selectByVisibleText(Categoryname);
	Select status=new Select(driver.findElement(By.xpath("(//*[@id='status'])[1]")));
	status.selectByVisibleText("Published");	 
	driver.findElement(By.xpath("//*[text()='Search']")).click();
	Thread.sleep(8000);
	 
	String address = RandomStringUtils.randomAlphabetic(5);
	System.out.println(address);
	
	String Noticenumber= driver.findElement(By.xpath("(((//*[text()='Notice Number'])[2])/following::td)[1]")).getText();
	System.out.println("Noticenumber "+Noticenumber);
	 
	driver.findElement(By.xpath("(//*[text()='Edit'])[1]")).click();
	String keywordstab="//*[@id='tabLinks']//a[6]";
	waitexplicit(keywordstab);	Thread.sleep(10000);
	

	//click on address tab
	driver.findElement(By.xpath("//*[@id='tabLinks']//a[2]")).click();	Thread.sleep(5000);
	 
	
	Select State=new Select(driver.findElement(By.xpath("//*[@id='stateid0']")));
	State.selectByVisibleText("Telangana");	
	driver.findElement(By.id("districts_0")).clear();
	driver.findElement(By.id("locality_0")).clear();
	driver.findElement(By.id("landMark_0")).clear();
	driver.findElement(By.id("flatNumber_0")).clear();
	driver.findElement(By.id("plotno_0")).clear();
	driver.findElement(By.id("streetAddress_0")).clear();
	driver.findElement(By.xpath("//*[@id='postelcode_0']")).clear();
	driver.findElement(By.id("surveyNumber_0")).clear();
	driver.findElement(By.id("hissaNumber_0")).clear();
	driver.findElement(By.id("cstNumber_0")).clear();
	Thread.sleep(5000);
	driver.findElement(By.id("hissaNumber_0")).click();
	Thread.sleep(5000);
	Select City=new Select(driver.findElement(By.xpath("//*[@id='City0']")));
	City.selectByVisibleText("Secunderabad");	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='postelcode_0']")).sendKeys("500032");
	Thread.sleep(2000);
	driver.findElement(By.id("streetAddress_0")).sendKeys("Ramnagar");
	Thread.sleep(2000);
	driver.findElement(By.id("landMark_0")).sendKeys("Meeseva");
	driver.findElement(By.id("surveyNumber_0")).clear();
	driver.findElement(By.id("hissaNumber_0")).clear();
	driver.findElement(By.id("cstNumber_0")).clear();
	Thread.sleep(2000);
	driver.findElement(By.id("mapFromAddress0")).click();
	 
	Thread.sleep(5000);
	JavascriptExecutor je = (JavascriptExecutor) driver;
	je.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("(//*[text()='Next'])[2]")));
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//*[text()='Next'])[2]")).click();
	Thread.sleep(5000);
	String Next="//*[@id='pipersonName_0']";
	waitexplicit(Next);	Thread.sleep(2000);
	waitexplicit("//*[text()='Logout']");	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[text()='Logout']")).click();
	Thread.sleep(2000);
	String launch="//*[@name='userName']";
	waitexplicit(launch);	Thread.sleep(500);
	
	
	UserLogin();//login as Independent user 
	 
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[text()='Independent Search Address']")).click();
	Thread.sleep(3000);
	 driver.findElement(By.xpath("//*[@id='City']")).sendKeys("Secunderabad");
	 driver.findElement(By.xpath("//*[@id='postelcode']")).sendKeys("500032");
	 driver.findElement(By.xpath("//*[@id='locality']")).sendKeys("Meeseva");
	 driver.findElement(By.xpath("//*[@id='StreetName']")).sendKeys("Ramnagar");
	 Thread.sleep(1000);
	 
	 JavascriptExecutor jsx=(JavascriptExecutor)driver;
	 jsx.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("(//*[@class='form-control ng-pristine ng-untouched ng-valid ng-empty'])[1]")));
	 Thread.sleep(1000);
	 Select sel=new Select(driver.findElement(By.xpath("(//*[@class='form-control ng-pristine ng-untouched ng-valid ng-empty'])[1]")));
	 sel.selectByVisibleText("business standard");
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//*[text()='Search']")).click();
	 Thread.sleep(5000);
	 String close="(//*[text()='Close Order'])";
	 waitexplicit(close);	Thread.sleep(1000);
	 
	String NewspaperName = driver.findElement(By.xpath("(//*[@class='ng-binding'])[2]")).getText();
	String CategoryName = driver.findElement(By.xpath("(//*[@class='ng-binding'])[3]")).getText();
	 System.out.println(NewspaperName);
	 System.out.println(CategoryName);
	 if(NewspaperName.equals(Newspapername) && CategoryName.equals(Categoryname))
	 {
	 	 passscreenshot(driver, "tc_106", "TC-No : 106,107 - Newspaper name and Category are displayinng correctly");
	 }
	 else
	 {
	 	 failscreenshot(driver, "tc_106", "TC-No : 106,107 - Newspaper name and Category are displayinng correctly");
	 }
	 
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//*[text()='Close Order'])")).click();
	Thread.sleep(5000);
	 waitexplicit("(//*[text()='Search Address'])");	Thread.sleep(5000);
	 report.endTest(logger);
	 report.flush();
	 driver.close();
	 
	 	}
}
