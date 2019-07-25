package co.uk.safebear.utils;

import org.openqa.selenium.WebDriver;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Screenshots {
    public static String generateScreenShotFileName(){
        //create filename
        return new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date())+ ".png";
    }
    public static void capturescreenshot(WebDriver driver, String fileName) {}
}
