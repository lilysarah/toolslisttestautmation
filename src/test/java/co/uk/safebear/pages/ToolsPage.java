package co.uk.safebear.pages;

import co.uk.safebear.pages.locators.ToolsPageLocators;
import lombok.NonNull;
import org.openqa.selenium.WebDriver;

public class ToolsPage {
    ToolsPageLocators locators = new ToolsPageLocators();
    @NonNull
    WebDriver driver;

    public String getPageTitle() {
        return driver.getTitle();
    }
}
