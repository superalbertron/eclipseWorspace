package proyectmavenalberto.mavenselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumGoogle {
  public static void main(String[] args) {
    System.setProperty("webdriver.gecko.driver", "c:/geckodriver/geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    driver.get("http://www.google.com");
    WebElement searchBox = driver.findElement(By.name("q"));
    searchBox.sendKeys("Selenium");
    searchBox.submit();
    System.out.println(driver.getTitle());
    driver.quit();
  }
}