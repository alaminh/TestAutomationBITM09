package BrowserConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeConfig {

    public static WebDriver driver;

    public static void main(String[] args) {
        //FirefoxConfig obj=new FirefoxConfig();
        //obj.testMethod1();
        launch_Chrome();
        //Close_Chrome();
        quit_Chrome();
    }

    public static void launch_Chrome()
    {
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver1.exe");
        driver = new ChromeDriver();

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
