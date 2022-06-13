package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import readers.PropReader;

import java.util.List;
import java.util.Properties;

public class waits {

    public static void waitElementTillVisibilityByXpath(String name, WebDriver driver, Properties prop) {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PropReader.read(name, prop))));
   }
}
