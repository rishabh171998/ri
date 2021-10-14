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

public class HomePage {
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
  public void testHomePage() throws Exception {
    driver.get("http://www.fund.bayer.us/#home-header");
    driver.findElement(By.linkText("Nourishing Healthy Starts")).click();
    driver.findElement(By.linkText("Operation Food Search")).click();
    driver.findElement(By.linkText("Fresh Rx Program")).click();
    driver.findElement(By.xpath("//div[@id='yui_3_17_2_1_1634188642007_93']/div")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=0 | ]]
    driver.findElement(By.xpath("//div[@id='movie_player']/div[25]/div[2]/div/button")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [selectFrame | relative=parent | ]]
    driver.findElement(By.linkText("Fair Shares CCSA")).click();
    driver.findElement(By.xpath("//img[@alt='Bayer Fund']")).click();
    driver.findElement(By.linkText("Transforming Learning")).click();
    driver.findElement(By.linkText("Idaho School for the Deaf and Blind")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    driver.findElement(By.linkText("Grants for rural schools")).click();
    driver.findElement(By.xpath("//img[@alt='Bayer Fund']")).click();
    driver.findElement(By.linkText("FIRST Team Neutrino 4-H")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | link=FIRST Team Neutrino 4-H | ]]
    driver.findElement(By.linkText("clicking here")).click();
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
