package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PhpWebapp {
	WebDriver driver;
  @BeforeMethod
  public void launch() {
	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://35.231.191.40:8081/");
  }
  @Test
  public void verifylogin() {
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.findElement(By.id("About Us")).click();
	  driver.findElement(By.id("PID-ab2-pg"));
  }
  
  @AfterMethod
  public void close() {
	  
  }
}