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

public class FootBar {
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
  public void testFootBar() throws Exception {
    driver.get("http://www.fund.bayer.us/#home-header");
    driver.findElement(By.xpath("//div[@id='footerQuickLinkHeadingPrimary']/div/div/div/div/p")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Download the identity guide to get info on using our logo and other graphic elements.'])[1]/following::p[1]")).click();
    driver.findElement(By.id("yui_3_17_2_1_1634188780367_200")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_2 | ]]
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    driver.findElement(By.id("yui_3_17_2_1_1634188780367_219")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_3 | ]]
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    driver.findElement(By.xpath("//div[@id='yui_3_17_2_1_1634188780367_208']/div[3]")).click();
    driver.findElement(By.id("yui_3_17_2_1_1634188780367_231")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_3 | ]]
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
