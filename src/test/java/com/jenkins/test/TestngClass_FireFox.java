package com.jenkins.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngClass_FireFox {
WebDriver driver;
	
	@BeforeSuite
	public void setup() throws InterruptedException {
	//WebDriverManager.chromedriver().setup();
		System.out.println("This is Before Suite");

	}
	
	@BeforeTest
	public void beforetest(){
		System.out.println("This is Before Test");
	}
	
	
	 @BeforeClass 
	 public void Maxwindow() throws InterruptedException { 
		 Thread.sleep(5000);
		 System.out.println("This is Before Class execution");
		 WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.xpath("//input[@name='txtUsername']"));
		username.sendKeys("Admin");
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.cssSelector("#txtPassword"));
		password.sendKeys("admin123");
		Thread.sleep(2000);
		WebElement login=driver.findElement(By.cssSelector("input[class='button']"));
		login.click();
		Thread.sleep(2000);
	 }
	 
	
	@BeforeMethod
	public void BeforeMethod() throws InterruptedException {
	System.out.println("This is BeforeMethod");
	}
	
	
	@Test(priority=0)
	public void Job_title() throws InterruptedException {
		WebElement Admin= driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"));
		Admin.click();
		WebElement jobs=driver.findElement(By.cssSelector("#menu_admin_Job"));
		jobs.click();
		WebElement jobsTitle=driver.findElement(By.xpath("//a[@id='menu_admin_viewJobTitleList']"));
		jobsTitle.click();
		WebElement addJob=driver.findElement(By.xpath("//input[@id='btnAdd']"));
		addJob.click();
		WebElement title=driver.findElement(By.cssSelector("#jobTitle_jobTitle"));
		title.sendKeys("Maveric Test Associate");
		WebElement description=driver.findElement(By.xpath("//textarea[@id='jobTitle_jobDescription']"));
		description.sendKeys("Automation Test Engg");
		WebElement save=driver.findElement(By.xpath("//input[@id='btnSave']"));
		save.click();
		System.out.println("Job_title has been executed");
		Thread.sleep(2000);
		
		}
	
	
	@Test(priority=1)
	public void paygrade() throws InterruptedException {
		
		WebElement Admin1= driver.findElement(By.xpath("//*[@id=\'menu_admin_viewAdminModule\']/b"));
		Admin1.click();
		WebElement job=driver.findElement(By.xpath("//*[@id=\'menu_admin_Job\']"));
		job.click();
		WebElement payscale= driver.findElement(By.xpath("//*[@id=\'menu_admin_viewPayGrades\']"));
		payscale.click();
		WebElement grade= driver.findElement(By.xpath("//a[contains(text(),'Grade 3')]"));
		grade.click();
		WebElement addbtn= driver.findElement(By.xpath("//input[@id='btnAddCurrency']"));
		addbtn.click();
		WebElement Currency=driver.findElement(By.xpath("//input[@id='payGradeCurrency_currencyName']"));
		Currency.sendKeys("DKK - Danish Krona");
		WebElement minimumsal = driver.findElement(By.xpath("//input[@id='payGradeCurrency_minSalary']"));
		minimumsal.sendKeys("42000.00");
		WebElement maximumsal = driver.findElement(By.xpath("//input[@id='payGradeCurrency_maxSalary']"));
		maximumsal.sendKeys("49000.00");
		WebElement savebtn= driver.findElement(By.cssSelector("#btnSaveCurrency"));
		savebtn.click();
		System.out.println("paygrade has been executed");
		Thread.sleep(2000);
	}
	
	@Test(priority=2)
	public void EmployeeStatus() {
		WebElement Admin2= driver.findElement(By.xpath("//*[@id=\'menu_admin_viewAdminModule\']/b"));
		Admin2.click();
		WebElement job1=driver.findElement(By.xpath("//*[@id=\'menu_admin_Job\']"));
		job1.click();
		WebElement empstatus= driver.findElement(By.cssSelector("#menu_admin_employmentStatus"));
		empstatus.click();
		WebElement addbutton=driver.findElement(By.xpath("//input[@id='btnAdd']"));
		addbutton.click();
		WebElement empname=driver.findElement(By.xpath("//input[@id='empStatus_name']"));
		empname.sendKeys("Full-Time Contract");
		WebElement savebtn2= driver.findElement(By.xpath("//input[@id='btnSave']"));
		savebtn2.click();
		System.out.println("EmployeeStatus has been executed");
	}
	@Test(priority=3)
	public void category() throws InterruptedException {
		WebElement Admin3= driver.findElement(By.xpath("//*[@id=\'menu_admin_viewAdminModule\']/b"));
		Admin3.click();
		WebElement job2=driver.findElement(By.xpath("//*[@id=\'menu_admin_Job\']"));
		job2.click();
		WebElement empcategory= driver.findElement(By.xpath("//a[@id='menu_admin_jobCategory']"));
		empcategory.click();
		WebElement addbutton1=driver.findElement(By.xpath("//input[@id='btnAdd']"));
		addbutton1.click();
		WebElement categoryname=driver.findElement(By.cssSelector("#jobCategory_name"));
		categoryname.sendKeys("Operatives");
		WebElement btnsave=driver.findElement(By.id("btnSave"));
		btnsave.click();
		System.out.println("category has been executed");
		Thread.sleep(2000);
	}
	
	@Test(priority=4)
	public void workshift() throws InterruptedException {
		WebElement Admin4= driver.findElement(By.xpath("//*[@id=\'menu_admin_viewAdminModule\']/b"));
		Admin4.click();
		WebElement job3=driver.findElement(By.xpath("//*[@id=\'menu_admin_Job\']"));
		job3.click();
		WebElement worktime= driver.findElement(By.cssSelector("#menu_admin_workShift"));
		worktime.click();
		WebElement workshiftbutton= driver.findElement(By.xpath("//input[@id='btnAdd']"));
		workshiftbutton.click();
		WebElement shiftname= driver.findElement(By.id("workShift_name"));
		shiftname.sendKeys("NormalTiming");
		WebElement hoursStarts = driver.findElement(By.id("workShift_workHours_from"));
		// hoursStarts.sendKeys("04:00");
		Select dropdown = new Select(hoursStarts);
		dropdown.selectByValue("04:00");
		WebElement hourends=driver.findElement(By.id("workShift_workHours_to"));
		Select dropdown1 = new Select(hourends);
		dropdown1.selectByValue("14:00");
		WebElement dummyemp= driver.findElement(By.xpath("//option[contains(text(),'Maggie Manning')]"));
		dummyemp.click();
		driver.findElement(By.xpath("//a[@id='btnAssignEmployee']")).click();
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		System.out.println("Workshift has been executed");
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("End of AfterMethod");
	}
	
	@AfterClass
	public void afterclass() throws InterruptedException {
		System.out.println("End of AfterClass");
		WebElement welcome=driver.findElement(By.cssSelector("#welcome"));
		welcome.click();
		
		WebElement logout=driver.findElement(By.xpath("//a[text()='Logout']"));
		logout.click();
		
		Thread.sleep(3000);		
		driver.close();
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("End of AfterTest");
	}
	@AfterSuite
	public void logout() throws InterruptedException {
		
		System.out.println("End of AfterSuite");
	}

}
