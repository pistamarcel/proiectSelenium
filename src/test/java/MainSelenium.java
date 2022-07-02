
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.NoSuchElementException;


public class MainSelenium {

    public static void main(String[] args)  {
   System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
   ChromeDriver driver = new ChromeDriver();

//        WebDriverManager.chromedriver().setup();
//       ChromeDriver driver= new ChromeDriver();
       driver.get("https://demoqa.com");
      List<WebElement> cards= driver.findElements(By.cssSelector(".card"));
      WebElement sixthcard=cards.get(5);

      Actions actions = new Actions(driver);
      actions.moveToElement(sixthcard).build().perform();

     sixthcard.click();
       System.out.println("Finish!");
       driver.quit();
    }
}
