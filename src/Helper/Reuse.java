package Helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reuse {
	public static WebDriver driver;
	public static FileInputStream fi;
	public Workbook wb;
	public Sheet rsh; 	
	public String loginadmin="rajsamala";
	//public String password="password";
	public String password="mtn@123";
	public String URL="http://mtn.revalweb.com/login";
	public static String ScreenshotSavingPath="D:\\MTN\\Screenshots\\";
	public static String ReportSavingPath="D:\\MTN\\Reports\\";
	public static ExtentReports report;
	public static ExtentTest logger;
	
		public void Launch() throws BiffException, IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();	  
		}
		public void waitexplicit(String e) throws Exception
		{
		   WebDriverWait wait = new WebDriverWait(driver, 120); 
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(e)));//Waits until element "e" appears
		}

		public void Login() throws Exception {
		
			driver.get(URL);
			String launch="//*[@name='userName']";
			waitexplicit(launch);	Thread.sleep(500);
		 
		}

		public void adminLogin() throws Exception {
	 
			Actions a=new Actions(driver);
			
			driver.findElement(By.xpath("//*[@name='userName']")).sendKeys(loginadmin);
			driver.findElement(By.xpath("//*[@name='password']")).sendKeys(password);
			
			driver.findElement(By.xpath("//*[text()='Login']")).click();
			String logout="(//*[text()='Search Address'])[1]";
			waitexplicit(logout);	Thread.sleep(1000);
		 
		}
		
		public void AdminLogin() throws Exception {
			 
			Actions a=new Actions(driver);
			
			driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("Rajeshk");
			driver.findElement(By.xpath("//*[@name='password']")).sendKeys("password");
			
			driver.findElement(By.xpath("//*[text()='Login']")).click();
			String logout="(//*[text()='Search Address'])[1]";
			waitexplicit(logout);	Thread.sleep(1000);
		 
		}
	
		public void UserLogin() throws Exception {
			 
			Actions a=new Actions(driver);
			
			driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("testingcustomer");
			driver.findElement(By.xpath("//*[@name='password']")).sendKeys("password");
			
			driver.findElement(By.xpath("//*[text()='Login']")).click();
			String logout="(//*[text()='Search Address'])[1]";
			waitexplicit(logout);	Thread.sleep(1000);
		 
		}
		public static void passscreenshot(WebDriver driver,String screenshotname,String data) throws IOException
	    {
	            File f1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	            FileUtils.copyFile(f1, new File(ScreenshotSavingPath+screenshotname+".jpg"));
	            
	            logger.log(LogStatus.PASS, data ,logger.addScreenCapture(ScreenshotSavingPath+screenshotname+".jpg"));
	            
	            report.endTest(logger);
	            report.flush();
	    }
	    public static void failscreenshot(WebDriver driver,String screenshotname,String data) throws IOException
	    {
	            File f1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	            FileUtils.copyFile(f1, new File(ScreenshotSavingPath+screenshotname+".jpg"));
	            
	            logger.log(LogStatus.FAIL, data ,logger.addScreenCapture(ScreenshotSavingPath+screenshotname+".jpg"));
	            
	            report.endTest(logger);
	            report.flush();
	    }
	    
	    public static void ScrollDown(int n){

			JavascriptExecutor jsd = (JavascriptExecutor) driver;
			jsd.executeScript("window.scrollBy(0,"+n+")");
		
		}
		public static void ScrollUp(int n){

			JavascriptExecutor jsu = (JavascriptExecutor) driver;
			jsu.executeScript("window.scrollBy(0,-"+n+")");
		
		}
		
		public static void screenshot(String e) throws IOException
		{
			 File f3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(f3, new File(e));
		}
}