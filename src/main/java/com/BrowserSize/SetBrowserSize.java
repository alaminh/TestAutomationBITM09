package com.BrowserSize;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetBrowserSize {



    public static WebDriver driver;

    public static void main(String[] args) {
        //FirefoxConfig obj=new FirefoxConfig();
        //obj.testMethod1();
        launch_Chrome();
        setSizeTab();
        //Close_Chrome();
        //quit_Chrome();
        openURL();
    }

    public static void launch_Chrome()
    {
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver1.exe");
        driver = new ChromeDriver();

    }

    public static void openURL()
    {
        driver.get("https://google.com");
    }

    public static void setSizeTab()
    {
        driver.manage().window().setSize(new Dimension(768,500));
    }


    public static void Close_Chrome()
    {
        driver.close();
    }
    public static void quit_Chrome()
    {
        driver.quit();
    }

}
