package pages;

	import java.awt.AWTException;import java.awt.Event;
	import java.awt.Robot;
	import java.awt.Toolkit;
	import java.awt.datatransfer.Clipboard;
	import java.awt.datatransfer.StringSelection;
	import java.awt.event.KeyEvent;
	import java.io.IOException;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;
	import baselibrary.BaseLibrary;


	public class RegisteringUser_Page extends BaseLibrary {
		
		public RegisteringUser_Page() {
			PageFactory.initElements(driver, this);
		}
		
		
		@FindBy(xpath = "//input[@id=\"emailAdd\"]")
		private WebElement emailid;
		@FindBy(xpath = "//input[@id=\"passwordField\"]")
		private WebElement password;
		@FindBy(xpath = "//input[@id=\"retypePassword\"]")
		private WebElement retypepassword;

		@FindBy(xpath = "//input[@id=\"mobNumber\"]")
		private WebElement mobileno;
		
		
		
		@FindBy(xpath = "//button[@class=\"ui-multiselect ui-widget ui-state-default ui-corner-all\"]")
		private WebElement jobfunction;
		@FindBy(xpath = "//span[text()=' Finance and Insurance']")
		private WebElement option;
		
		
		
		
		
		@FindBy(xpath = "//input[@id=\"cboWorkExpYear\"]")
		private WebElement year;
		@FindBy(xpath = "//input[@id=\"cboWorkExpMonth\"]")
		private WebElement month;
		
		
		@FindBy(xpath = "//select[@id=\"curLocation\"]")
		private WebElement worklocation;
		@FindBy(xpath = "//input[@placeholder=\"Type a Functional Area.\"]")
		private WebElement searchbar;
		
		
		@FindBy(xpath = "//li[@class=\"token-input-input-token-facebook\"]//input[@type=\"text\"]")
		private WebElement keyskills;

		@FindBy(xpath = "//*[@id=\"resumeFile_basic\"]")
		private WebElement uplodefile;
		
		
		
		@FindBy(xpath = "//button[text()='Continue >>']")
		private WebElement continues;
		
		public void DataProviderTest(String email,String password1,String password2, String mobile,String year1 ,String month1  ) throws InterruptedException, AWTException
		{
			Thread.sleep(1000);
		
			emailid.sendKeys(email);
			password.sendKeys(password1);
			retypepassword.sendKeys(password2);		
			mobileno.sendKeys(mobile);

			jobfunction.click();
			option.click();
			
			
			
			
			year.sendKeys(year1);
			month.sendKeys(month1);
			
			Select sel2=new Select(worklocation);
			sel2.selectByIndex(3);
			searchbar.sendKeys("acc");
			
			
			
			
			keyskills.sendKeys("Australia se lekar ameia-made in inda pyar soniya dil chahiye bs mand in india");
			
			
			
			
		
//			uplodefile.sendKeys("C:\\Users\\dell\\eclipse-workspace\\Maven_Project_practice\\textdata\\TestingBaba.docx");
	//uplodefile.click();
//			try {
//				StringSelection sel1=new StringSelection("C:\\Users\\dell\\eclipse-workspace\\14JulyNewAutomationbatch_Dharmendra\\testdata\\TestingBaba.docx");
//			    Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
//			    clipboard.setContents(sel1, null);
	//
//			
//				Robot robot=new Robot();
//		        robot.keyPress(KeyEvent.VK_ENTER);
//		        robot.keyRelease(KeyEvent.VK_ENTER);
//		        
//		        robot.keyPress(KeyEvent.VK_CONTROL);
//		        robot.keyPress(KeyEvent.VK_V);
//		        
//		        robot.keyRelease(KeyEvent.VK_V);
//		        robot.keyRelease(KeyEvent.VK_CONTROL);
//		        
//		        robot.keyPress(KeyEvent.VK_ENTER);
//		        robot.delay(250);
//		        robot.keyRelease(KeyEvent.VK_ENTER);	        
//		        
//			 } catch (Exception e) {	
//			 System.out.println("Issue in Filename" +e);	
//			 }

			
			Thread.sleep(1000);
			continues.click();
		}

	}
