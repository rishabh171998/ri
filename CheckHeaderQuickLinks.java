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

public class CheckHeaderQuickLinks {
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
  public void testCheckHeaderQuickLinks() throws Exception {
    driver.get("https://www.roundupreadycanola.com.au/about-us/");
    driver.findElement(By.linkText("About")).click();
    driver.findElement(By.linkText("Contact Us")).click();
    driver.findElement(By.id("a5bc758d-fcad-4c73-b2b6-04720fe0c543")).click();
    driver.findElement(By.id("a5bc758d-fcad-4c73-b2b6-04720fe0c543")).clear();
    driver.findElement(By.id("a5bc758d-fcad-4c73-b2b6-04720fe0c543")).sendKeys("Rishabh");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='here'])[1]/following::p[2]")).click();
    driver.findElement(By.id("b21405d1-9e27-47a7-a84f-46918da77cad")).click();
    driver.findElement(By.id("b21405d1-9e27-47a7-a84f-46918da77cad")).clear();
    driver.findElement(By.id("b21405d1-9e27-47a7-a84f-46918da77cad")).sendKeys("Bhanot");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Head Office:'])[1]/following::p[1]")).click();
    driver.findElement(By.id("bfa7df8f-c9ca-4a8f-e250-3211f21b33f6")).click();
    driver.findElement(By.id("bfa7df8f-c9ca-4a8f-e250-3211f21b33f6")).clear();
    driver.findElement(By.id("bfa7df8f-c9ca-4a8f-e250-3211f21b33f6")).sendKeys("rishabhbhanot10@gmail.com");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Contact Us'])[4]/following::div[8]")).click();
    driver.findElement(By.id("dbbd9ede-91eb-421f-b0a5-b86da0ffa42a")).click();
    driver.findElement(By.id("dbbd9ede-91eb-421f-b0a5-b86da0ffa42a")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | id=dbbd9ede-91eb-421f-b0a5-b86da0ffa42a | ]]
    driver.findElement(By.id("dbbd9ede-91eb-421f-b0a5-b86da0ffa42a")).clear();
    driver.findElement(By.id("dbbd9ede-91eb-421f-b0a5-b86da0ffa42a")).sendKeys("7838032156");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Contact Us'])[4]/following::div[6]")).click();
    driver.findElement(By.id("4d1ca355-e375-4f61-8f86-11fdd48b823f")).click();
    driver.findElement(By.id("4d1ca355-e375-4f61-8f86-11fdd48b823f")).clear();
    driver.findElement(By.id("4d1ca355-e375-4f61-8f86-11fdd48b823f")).sendKeys("201301");
    driver.findElement(By.xpath("//fieldset[@id='0d959c9d-e10d-4c7b-831e-55806cf64c35']/div/div/div[6]/div/div/button")).click();
    driver.findElement(By.xpath("//fieldset[@id='0d959c9d-e10d-4c7b-831e-55806cf64c35']/div/div/div[6]/div/div/div/ul/li[2]/a/span")).click();
    new Select(driver.findElement(By.id("21812e63-1b8a-48c1-ef64-74badb5ebdd6"))).selectByVisibleText("Business manager / owner");
    driver.findElement(By.id("bbd22fc4-17ee-4c25-8a02-42317af2eddd")).click();
    driver.findElement(By.id("bbd22fc4-17ee-4c25-8a02-42317af2eddd")).clear();
    driver.findElement(By.id("bbd22fc4-17ee-4c25-8a02-42317af2eddd")).sendKeys("test question");
    driver.findElement(By.xpath("//fieldset[@id='ed092954-c9db-46d8-86e2-ed105f34a71a']/div/div/div[2]/div/div/button/span")).click();
    driver.findElement(By.xpath("//fieldset[@id='ed092954-c9db-46d8-86e2-ed105f34a71a']/div/div/div[2]/div/div/div/ul/li[2]/a")).click();
    new Select(driver.findElement(By.id("56b0c90f-8e95-47d2-e394-e71acabc9bcd"))).selectByVisibleText("Phone");
    driver.findElement(By.xpath("//fieldset[@id='a6c835e7-5b88-4a2d-a8d0-e05273c0b6bc']/div/div/div/div/div[2]/label/span/span")).click();
    driver.findElement(By.xpath("//fieldset[@id='a6c835e7-5b88-4a2d-a8d0-e05273c0b6bc']/div/div/div/div/div/label/span/span")).click();
    driver.findElement(By.xpath("//fieldset[@id='a6c835e7-5b88-4a2d-a8d0-e05273c0b6bc']/div/div/div/div/div[3]/label/span/span")).click();
    driver.findElement(By.xpath("//fieldset[@id='a6c835e7-5b88-4a2d-a8d0-e05273c0b6bc']/div/div/div/div/div[3]/label/span/span")).click();
    driver.findElement(By.xpath("//fieldset[@id='a6c835e7-5b88-4a2d-a8d0-e05273c0b6bc']/div/div/div/div/div[2]/label/span/span")).click();
    driver.findElement(By.xpath("//fieldset[@id='a6c835e7-5b88-4a2d-a8d0-e05273c0b6bc']/div/div/div/div/div/label/span/span")).click();
    driver.findElement(By.xpath("//fieldset[@id='a6c835e7-5b88-4a2d-a8d0-e05273c0b6bc']/div/div/div/div/div[2]/label/span/span")).click();
    driver.findElement(By.xpath("//fieldset[@id='5ad0d40e-5358-484c-9f9a-edecfe9e1c3c']/div/div/div/div/label/span/span")).click();
    driver.findElement(By.name("__next")).click();
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
