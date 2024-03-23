package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import setup.Setup;

public class Utils extends Setup {
    public static void scrollToElement(WebDriver driver, WebElement locator) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", locator);
    }
    public void timeNap(int seconds) throws InterruptedException {
        Thread.sleep(seconds * 1000);

    }
}
