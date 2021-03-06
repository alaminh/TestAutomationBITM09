package com.DataPovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;




public class Registration_DP {

    public static WebDriver driver;

    @BeforeSuite
    public static void RunChrome(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/index.php?route=account/register");

    }
    @AfterSuite
    //public static void closeChrome(){ driver.quit(); }

    @DataProvider(name = "InValid-Registration")
    public Object[][] data(){
        Object[][] data=new Object[2][6];

        data[0][0]="Anwar_Hossain";
        data[0][1]="Alamin";
        data[0][2]="alamin01712834711@gmail.com";
        data[0][3]="01712834711";
        data[0][4]="000111222";
        data[0][5]="000111222";

        data[1][0]="Anwar_Hossain";
        data[1][1]="Alamin";
        data[1][2]="alamin01712834711@gmail.com";
        data[1][3]="01712AAA011";
        data[1][4]="000111222";
        data[1][5]="000111222";

        return data;
    }

    @Test(dataProvider = "InValid-Registration")
    public static void Register(String DP_Fname, String DP_Lname, String DP_Email, String DP_Number, String DP_Password, String DP_ConfirmPassword){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement fName=driver.findElement(By.id("input-firstname"));
        fName.clear();
        fName.sendKeys(DP_Fname);

        WebElement lName=driver.findElement(By.id("input-lastname"));
        lName.clear();
        lName.sendKeys(DP_Lname);

        WebElement email=driver.findElement(By.id("input-email"));
        email.clear();
        email.sendKeys(DP_Email);

        WebElement phone=driver.findElement(By.id("input-telephone"));
        phone.clear();
        phone.sendKeys(DP_Number);

        WebElement pass=driver.findElement(By.id("input-password"));
        pass.sendKeys(DP_Password);

        WebElement Cpass=driver.findElement(By.id("input-confirm"));
        Cpass.sendKeys(DP_ConfirmPassword);

        WebElement check=driver.findElement(By.name("agree"));
        check.click();

        WebElement regBtn=driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));
        regBtn.click();

        String expected="https://demo.opencart.com/index.php?route=account/success";
        String exact=driver.getCurrentUrl();

        if(expected.equals(exact)){
            System.out.println("Registration Success");
        }
        else {
            System.out.println("Registration Failed");

        }

    }

}
