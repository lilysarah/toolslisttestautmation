package co.uk.safebear.pages.locators;

import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


@Data
public class ToolsPageLocators {
    private By successfulLoginMessage = By.xpath(".//body/div[@class= 'container']/p/b");

}
