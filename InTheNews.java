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

public class InTheNews {
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
  public void testInTheNews() throws Exception {
    driver.get("http://www.fund.bayer.us/#home-header");
    driver.findElement(By.xpath("//article[@id='article-614b4e5539bf4c6246639113']/a/div/div/div[2]")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    driver.findElement(By.xpath("//article[@id='article-5e207cf36520195adfca4257']/a/div/h3")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_2 | ]]
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    driver.findElement(By.xpath("//article[@id='article-5e207d154301a9378dce11ae']/a/div/h3")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_3 | ]]
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    driver.findElement(By.xpath("//article[@id='article-60099a0b3f0c8f0e19f48b1f']/a/div/h3")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_4 | ]]
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    driver.findElement(By.xpath("//article[@id='article-5c5472770d9297839d62d3cc']/a/div/h3")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_5 | ]]
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    driver.findElement(By.xpath("//article[@id='article-5e207bebf8c3503a17347da5']/a/div/div/div[2]")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_6 | ]]
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
