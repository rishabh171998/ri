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

public class CarouselCheck {
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
  public void testCarouselCheck() throws Exception {
    driver.get("https://www.roundupreadycanola.com.au/");
    driver.findElement(By.xpath("//div[@id='heroCarousel']/ol/li[2]")).click();
    driver.findElement(By.xpath("//div[@id='heroCarousel']/ol/li[3]")).click();
    driver.findElement(By.xpath("//div[@id='heroCarousel']/ol/li[4]")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=//div[@id='heroCarousel']/ol/li[4] | ]]
    driver.findElement(By.xpath("//div[@id='heroCarousel']/ol/li")).click();
    driver.findElement(By.xpath("//div[@id='heroCarousel']/div/a")).click();
    driver.findElement(By.xpath("//img[@alt='See the difference']")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    driver.findElement(By.xpath("//img[@alt='brand_lockup.png']")).click();
    driver.findElement(By.xpath("//div[@id='heroCarousel']/ol/li[2]")).click();
    driver.findElement(By.linkText("Introducing TruFlex canola with Roundup Ready Technology")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_2 | ]]
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    driver.findElement(By.xpath("//div[@id='heroCarousel']/ol/li[3]")).click();
    driver.findElement(By.xpath("//div[@id='heroCarousel']/ol/li[3]")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=//div[@id='heroCarousel']/ol/li[3] | ]]
    driver.findElement(By.linkText("Find an upcoming event")).click();
    driver.findElement(By.linkText("Find an upcoming event")).click();
    driver.findElement(By.xpath("//img[@alt='brand_lockup.png']")).click();
    driver.findElement(By.xpath("//div[@id='heroCarousel']/ol/li[4]")).click();
    driver.findElement(By.linkText("Watch a video to hear first-hand experiences using Roundup Ready Technologies")).click();
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
