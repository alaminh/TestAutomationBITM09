package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class loginTest {

    public static WebDriver driver;

    @BeforeSuite
    public static void RunChrome(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/index.php?route=account/login");
    }
    @AfterSuite
    public static void closeChrome(){
        driver.quit();
    }

    @Test
    public static void TC01(){

        WebElement email=driver.findElement(By.id("input-email"));
        email.clear();
        email.sendKeys("user101@gmail.com");

        WebElement pass=driver.findElement(By.id("input-password"));
        pass.clear();
        pass.sendKeys("123456");

        WebElement loginBtn=driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        loginBtn.click();

        String expected="My Account";
        String actual=driver.getTitle();

        if(expected.equals(actual)){
            System.out.println("TC01 Passed");
        }
        else {
            System.out.println("TC01 Failed");
        }

        WebElement logout=driver.findElement(By.linkText("Logout"));
        logout.click();

        WebElement login=driver.findElement(By.linkText("Login"));
        login.click();
    }
    @Test
    public static void TC02(){

        WebElement email=driver.findElement(By.id("input-email"));
        email.clear();
        email.sendKeys("test@gmail.com");

        WebElement pass=driver.findElement(By.id("input-password"));
        pass.clear();
        pass.sendKeys("12345678");

        WebElement loginBtn=driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        loginBtn.click();

        String expected="Account Login";
        String actual=driver.getTitle();

        if(expected.equals(actual)){
            System.out.println("TC02 Passed");
        }
        else {
            System.out.println("TC02 Failed");
        }
    }
    @Test
    public static void TC03(){

        WebElement email=driver.findElement(By.id("input-email"));
        email.clear();
        email.sendKeys("user101@gmail.com");

        WebElement pass=driver.findElement(By.id("input-password"));
        pass.clear();
        pass.sendKeys("12345629");

        WebElement loginBtn=driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        loginBtn.click();

        String expected="Account Login";
        String actual=driver.getTitle();

        if(expected.equals(actual)){
            System.out.println("TC03 Passed");
        }
        else {
            System.out.println("TC03 Failed");
        }
    }
    @Test
    public static void TC04(){

        WebElement email=driver.findElement(By.id("input-email"));
        email.clear();
        email.sendKeys("test@gmail.com");

        WebElement pass=driver.findElement(By.id("input-password"));
        pass.clear();
        pass.sendKeys("1234123");

        WebElement loginBtn=driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        loginBtn.click();

        String expected="Account Login";
        String actual=driver.getTitle();

        if(expected.equals(actual)){
            System.out.println("TC04 Passed");
        }
        else {
            System.out.println("TC04 Failed");
        }
    }




}
