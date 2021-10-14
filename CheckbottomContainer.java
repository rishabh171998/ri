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

public class CheckbottomContainer {
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
  public void testCheckbottomContainer() throws Exception {
    driver.get("https://www.roundupreadycanola.com.au/");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Watch a video to hear first-hand experiences using Roundup Ready Technologies'])[1]/following::div[6]")).click();
    driver.findElement(By.linkText("2. Products")).click();
    driver.findElement(By.linkText("3. Using the systems")).click();
    driver.findElement(By.linkText("3. Using the systems")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | link=3. Using the systems | ]]
    driver.findElement(By.linkText("4. Marketing")).click();
    driver.findElement(By.linkText("GM Canola Market Wire")).click();
    driver.findElement(By.id("a5bc758d-fcad-4c73-b2b6-04720fe0c543")).click();
    driver.findElement(By.id("a5bc758d-fcad-4c73-b2b6-04720fe0c543")).clear();
    driver.findElement(By.id("a5bc758d-fcad-4c73-b2b6-04720fe0c543")).sendKeys("Rishabh");
    driver.findElement(By.id("b21405d1-9e27-47a7-a84f-46918da77cad")).clear();
    driver.findElement(By.id("b21405d1-9e27-47a7-a84f-46918da77cad")).sendKeys("Bhanot");
    driver.findElement(By.id("bfa7df8f-c9ca-4a8f-e250-3211f21b33f6")).clear();
    driver.findElement(By.id("bfa7df8f-c9ca-4a8f-e250-3211f21b33f6")).sendKeys("rishabhbhanot10@gmail.com");
    driver.findElement(By.id("dbbd9ede-91eb-421f-b0a5-b86da0ffa42a")).clear();
    driver.findElement(By.id("dbbd9ede-91eb-421f-b0a5-b86da0ffa42a")).sendKeys("+917838032156");
    driver.findElement(By.id("4d1ca355-e375-4f61-8f86-11fdd48b823f")).clear();
    driver.findElement(By.id("4d1ca355-e375-4f61-8f86-11fdd48b823f")).sendKeys("201301");
    driver.findElement(By.xpath("//fieldset[@id='0d959c9d-e10d-4c7b-831e-55806cf64c35']/div/div/div[6]/div/div/button/span")).click();
    driver.findElement(By.xpath("//fieldset[@id='0d959c9d-e10d-4c7b-831e-55806cf64c35']/div/div/div[6]/div/div/div/ul/li[3]/a")).click();
    new Select(driver.findElement(By.id("21812e63-1b8a-48c1-ef64-74badb5ebdd6"))).selectByVisibleText("Farm manager");
    driver.findElement(By.id("bbd22fc4-17ee-4c25-8a02-42317af2eddd")).click();
    driver.findElement(By.id("bbd22fc4-17ee-4c25-8a02-42317af2eddd")).clear();
    driver.findElement(By.id("bbd22fc4-17ee-4c25-8a02-42317af2eddd")).sendKeys("test question 2");
    driver.findElement(By.xpath("//fieldset[@id='ed092954-c9db-46d8-86e2-ed105f34a71a']/div/div/div[2]/div/div/button/span")).click();
    driver.findElement(By.xpath("//fieldset[@id='ed092954-c9db-46d8-86e2-ed105f34a71a']/div/div/div[2]/div/div/div/ul/li[2]/a")).click();
    new Select(driver.findElement(By.id("56b0c90f-8e95-47d2-e394-e71acabc9bcd"))).selectByVisibleText("Phone");
    driver.findElement(By.xpath("//fieldset[@id='a6c835e7-5b88-4a2d-a8d0-e05273c0b6bc']/div/div/div/div/div/label/span/span")).click();
    driver.findElement(By.xpath("//fieldset[@id='a6c835e7-5b88-4a2d-a8d0-e05273c0b6bc']/div/div/div/div/div[2]/label/span/span")).click();
    driver.findElement(By.xpath("//fieldset[@id='a6c835e7-5b88-4a2d-a8d0-e05273c0b6bc']/div/div/div/div/div[3]/label/span/span")).click();
    driver.findElement(By.xpath("//fieldset[@id='5ad0d40e-5358-484c-9f9a-edecfe9e1c3c']/div/div/div/div/label/span/span")).click();
    driver.findElement(By.name("__next")).click();
    driver.findElement(By.id("dbbd9ede-91eb-421f-b0a5-b86da0ffa42a")).click();
    driver.findElement(By.id("dbbd9ede-91eb-421f-b0a5-b86da0ffa42a")).clear();
    driver.findElement(By.id("dbbd9ede-91eb-421f-b0a5-b86da0ffa42a")).sendKeys("7838032156");
    driver.findElement(By.name("__next")).click();
    driver.findElement(By.xpath("//img[@alt='brand_lockup.png']")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Get the basics here'])[1]/following::div[3]")).click();
    driver.findElement(By.name("postcode")).click();
    driver.findElement(By.name("postcode")).clear();
    driver.findElement(By.name("postcode")).sendKeys("100001");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Enter a postcode to find your local store'])[1]/following::i[1]")).click();
    driver.findElement(By.xpath("//img[@alt='brand_lockup.png']")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Find a local TSP to purchase seed containing Roundup Ready Technologies'])[1]/following::div[4]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='®'])[1]/following::span[1]")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    driver.findElement(By.linkText("nuseed.com.au")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_2 | ]]
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Hyola® Battalion XC'])[1]/following::td[1]")).click();
    driver.findElement(By.linkText("pacificseeds.com.au")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_3 | ]]
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    driver.findElement(By.xpath("//a[contains(text(),'myseed.basf.com.au')]")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_4 | ]]
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    driver.findElement(By.linkText("cargill.com.au")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_5 | ]]
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='GT-53'])[1]/following::a[1]")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_6 | ]]
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    driver.findElement(By.linkText("seednet.com.au")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_7 | ]]
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    driver.findElement(By.linkText("pioneerseeds.com.au")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_8 | ]]
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='pioneerseeds.com.au'])[1]/following::div[7]")).click();
    driver.findElement(By.xpath("//img[@alt='brand_lockup.png']")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Find TruFlex and Roundup Ready canola varieties'])[1]/following::div[3]")).click();
    driver.findElement(By.xpath("//img[@alt='brand_lockup.png']")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='GM Canola Market Wire'])[1]/following::div[1]")).click();
    driver.findElement(By.xpath("//img[@alt='bayer_black.png']")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_9 | ]]
    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    driver.findElement(By.xpath("//img[@alt='brand_lockup.png']")).click();
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
