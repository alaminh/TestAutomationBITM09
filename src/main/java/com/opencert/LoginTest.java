package com.opencert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public static WebDriver driver;
    public static void main(String[] args)
    {
        launch_Browser();
        open_LoginPage();
        TC_001();
        TC_002();
        TC_003();
        TC_004();
        close_Browser();
    }
    public static void launch_Browser()
    {
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver1.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    public static void open_LoginPage()
    {
        driver.get("https://demo.opencart.com/index.php?route=account/login");
    }


    public static void TC_001()
    {
        WebElement Email=driver.findElement(By.id("input-email"));
        Email.sendKeys("test@test.com");


        WebElement password=driver.findElement(By.id("input-password"));
        password.sendKeys("123456789");

        WebElement LoginBtn=driver.findElement(By.cssSelector("#column-right > div > a:nth-child(1)"));
        LoginBtn.click();

        //logout

        WebElement Logout=driver.findElement(By.linkText("Logout"));
        Logout.click();

        WebElement LoginPage=driver.findElement(By.linkText("Login"));
        LoginPage.click();


    }
    public static void TC_002()
    {
        WebElement Email=driver.findElement(By.id("input-email"));
        Email.sendKeys("user101@gmail.com");


        WebElement password=driver.findElement(By.id("input-password"));
        password.sendKeys("123456");

        WebElement LoginBtn=driver.findElement(By.cssSelector("#column-right > div > a:nth-child(1)"));
        LoginBtn.click();

    }
    public static void TC_003()
    {
        WebElement Email=driver.findElement(By.id("input-email"));
        Email.sendKeys("user101@gmail.com");


        WebElement password=driver.findElement(By.id("input-password"));
        password.sendKeys("123456789");

        WebElement LoginBtn=driver.findElement(By.cssSelector("#column-right > div > a:nth-child(1)"));
        LoginBtn.click();

    }
    public static void TC_004()
    {
        WebElement Email=driver.findElement(By.id("input-email"));
        Email.sendKeys("test@test.com");


        WebElement password=driver.findElement(By.id("input-password"));
        password.sendKeys("123456");

        WebElement LoginBtn=driver.findElement(By.cssSelector("#column-right > div > a:nth-child(1)"));
        LoginBtn.click();
    }
    public static void close_Browser()
    {
        driver.close();
    }

}
