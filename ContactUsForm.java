package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class ContactUsForm {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private JavascriptExecutor js;

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    System.setProperty("webdriver.gecko.driver", "Your gecko driver path");
    driver = new FirefoxDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    js = (JavascriptExecutor) driver;
  }

  @Test
  public void testContactUsForm() throws Exception {
    driver.get("http://www.fund.bayer.us/");
    driver.findElement(By.xpath("//div[@id='desktopNav']/nav/div/ul/li[5]/a/span")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=0 | ]]
    driver.findElement(By.id("txtName")).click();
    driver.findElement(By.id("txtName")).clear();
    driver.findElement(By.id("txtName")).sendKeys("Rishabh Bhanot");
    driver.findElement(By.id("txtEmail")).clear();
    driver.findElement(By.id("txtEmail")).sendKeys("rishabhbhanot10@gmail.com");
    driver.findElement(By.id("txtCompany/Organization")).clear();
    driver.findElement(By.id("txtCompany/Organization")).sendKeys("Cognizant  Technology Solutions  Ltd.");
    driver.findElement(By.id("txtCity")).clear();
    driver.findElement(By.id("txtCity")).sendKeys("Noida");
    driver.findElement(By.id("txtPhone")).clear();
    driver.findElement(By.id("txtPhone")).sendKeys("+917838032156");
    driver.findElement(By.id("txtState")).click();
    driver.findElement(By.id("txtPhone")).click();
    driver.findElement(By.xpath("//form[@id='frmForm1']/div")).click();
    driver.findElement(By.id("ddlCountry")).click();
    new Select(driver.findElement(By.id("ddlCountry"))).selectByVisibleText("United States");
    driver.findElement(By.id("txtPhone")).click();
    driver.findElement(By.id("txtPhone")).clear();
    driver.findElement(By.id("txtPhone")).sendKeys("7838032156");
    driver.findElement(By.id("txtState")).click();
    driver.findElement(By.id("txtState")).clear();
    driver.findElement(By.id("txtState")).sendKeys("Ohio");
    driver.findElement(By.id("ddlEligible Community")).click();
    new Select(driver.findElement(By.id("ddlEligible Community"))).selectByVisibleText("HI - Kunia-Oahu");
    driver.findElement(By.id("rdoReason1")).click();
    driver.findElement(By.xpath("//div[@id='categories']/p[2]")).click();
    driver.findElement(By.id("rdoReason2")).click();
    driver.findElement(By.id("ddlFocus")).click();
    new Select(driver.findElement(By.id("ddlFocus"))).selectByVisibleText("STEM Education");
    driver.findElement(By.id("txtMessage")).click();
    driver.findElement(By.id("txtMessage")).clear();
    driver.findElement(By.id("txtMessage")).sendKeys("test message");
    driver.findElement(By.id("btnSubmit")).click();
    driver.findElement(By.id("btnSubmit")).click();
    driver.findElement(By.id("btnSubmit")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | id=btnSubmit | ]]
    driver.findElement(By.id("btnSubmit")).click();
    driver.findElement(By.id("btnSubmit")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | id=btnSubmit | ]]
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
