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

public class CheckNavBar {
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
  public void testCheckNavBar() throws Exception {
    driver.get("https://www.roundupreadycanola.com.au/");
    driver.findElement(By.linkText("Products")).click();
    driver.findElement(By.linkText("Stewardship")).click();
    driver.findElement(By.linkText("Marketing your Canola")).click();
    driver.findElement(By.linkText("FAQs")).click();
    driver.findElement(By.xpath("//a[@id='bhFaqQuestion1']/i")).click();
    driver.findElement(By.xpath("//a[@id='bhFaqQuestion2']/i")).click();
    driver.findElement(By.xpath("//a[@id='bhFaqQuestion3']/i")).click();
    driver.findElement(By.xpath("//a[@id='bhFaqQuestion4']/i")).click();
    driver.findElement(By.xpath("//a[@id='bhFaqQuestion5']/i")).click();
    driver.findElement(By.xpath("//a[@id='bhFaqQuestion6']/i")).click();
    driver.findElement(By.xpath("//a[@id='bhFaqQuestion6']/i")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=//a[@id='bhFaqQuestion6']/i | ]]
    driver.findElement(By.xpath("//a[@id='bhFaqQuestion7']/i")).click();
    driver.findElement(By.xpath("//a[@id='bhFaqQuestion8']/i")).click();
    driver.findElement(By.linkText("Events")).click();
    driver.findElement(By.linkText("kapara.rdbk.com.au/landers/0edefe.html")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    driver.findElement(By.linkText("Register and listen here")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_2 | ]]
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
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
