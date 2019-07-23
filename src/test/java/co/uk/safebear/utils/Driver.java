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


