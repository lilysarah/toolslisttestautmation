package co.uk.safebear.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private static final String URL = System.getProperty("url", "http://toolslist.safebear.co.uk:8080");
    private static final String BROWSER = System.getProperty("browser", "chrome");

    public static String getUrl() {
        return URL;
    }

    public static WebDriver getDriver() {

        ChromeOptions chromeOptions;
        switch (BROWSER.toUpperCase()) {
            case ("CHROME_HEADLESS"):
                System.out.println(" Executing on CHROME HEADLESS");
                chromeOptions = new ChromeOptions();
                //set Chrome to run headlessly
                chromeOptions.addArguments("headless");
                //make sure the window size is large and masimissed
                //so nothing disappears off screen
                //(even in headless mode)
                chromeOptions.addArguments("window-size=1920,1080");
                chromeOptions.addArguments("start-maximized");
                //set up our ChromeDriver
                WebDriverManager.chromedriver().setup();
                //return the chromedriver with the chromeOptions set
                return new ChromeDriver(chromeOptions);
            case "Firefox":
                System.out.println(" Executing on FIREFOX");

                WebDriverManager.firefoxdriver().setup();

                return new FirefoxDriver();

            case "CHROME":
                //tell teh user which browser we're running our tests on
                System.out.println(" Executing on CHROME");

                //use 'Web Driver Manager' to setup our chromedriver
                WebDriverManager.chromedriver().setup();


                //Return our Driver
                return new ChromeDriver();


            default:
                throw new IllegalArgumentException("The Browser Type is Undefined");

        }

    }
}


