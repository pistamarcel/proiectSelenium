
<<<<<<< HEAD
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.NoSuchElementException;
=======
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
>>>>>>> d03044b (primul commit)


public class MainSelenium {

<<<<<<< HEAD
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
=======
    public static void main(String[] args) {



//      driver.quit();
    }
    public static void windowHandler(){
        ChromeDriver driver=null;

        try {
            driver = getChromeDriverByManager();
            driver.get("https://demoqa.com/browser-windows");
            WebElement tabButton = driver.findElement(By.id("tabButton"));
            tabButton.click();

            String parentWindow = driver.getWindowHandle();
            Set<String> windowHandles = driver.getWindowHandles();

            for(String window : windowHandles){
                if(!window.equals(parentWindow)) {
                    driver.switchTo().window(window);
                    break;
                }
            }
            System.out.println(driver.findElement(By.id("sampleHeading")).getText());
            driver.close();

            driver.switchTo().window(parentWindow);
            driver.findElement(By.id("windowButton")).click();
            Set<String> windowHandles2 = driver.getWindowHandles();
            for(String window : windowHandles2){
                if(!window.equals(parentWindow)) {
                    driver.switchTo().window(window);
                    break;
                }
            }
            System.out.println(driver.findElement(By.id("sampleHeading")).getText());
            driver.close();

            System.out.println("Finish!");

        }finally {
            if (driver != null) {
                driver.quit();
                System.out.println("Am inchis driverul");
            }
        }
    }


    public static void radioButtons(){
        ChromeDriver driver = getChromeDriverByExecutable();
        driver.get("https://demoqa.com/radio-button");


        List<WebElement> labels=driver.findElements(By.cssSelector("label.custom-control-label"));
        WebElement yesLabel= labels.get(0);
        WebElement yesButton = driver.findElement(By.id("yesRadio"));
        yesButton.isEnabled();
        yesButton.isSelected();
        System.out.println("YesRadioButton  before click is enabled: " +yesButton.isEnabled() + " isSelected: " +yesButton.isSelected());

        driver.executeScript("arguments[0].click()", yesButton);
//        yesLabel.click();



        WebElement impressiveButton= driver.findElement(By.id("impressiveRadio"));
        WebElement impressiveLabel=labels.get(1);
        impressiveButton.isEnabled();
        impressiveButton.isSelected();
        System.out.println("ImpressiveRadioButton before click is enabled: " +impressiveButton.isEnabled() + " isSelected: " +impressiveButton.isSelected());


        driver.executeScript("arguments[0].click()", impressiveButton);
//        impressiveLabel.click();



        WebElement noButton= driver.findElement(By.id("noRadio"));
        WebElement noLabel=labels.get(2);
        noButton.isEnabled();
        noButton.isSelected();
        System.out.println("NoRadioButton before click is enabled: " +noButton.isEnabled()+ " isSelected: " +noButton.isSelected());
        driver.executeScript("arguments[0].click()", noButton);
//        noLabel.click();

        System.out.println("YesRadioButton  after click is enabled: " +yesButton.isEnabled() + " isSelected: " +yesButton.isSelected());
        System.out.println("ImpressiveRadioButton after click is enabled: " +impressiveButton.isEnabled() + " isSelected: " +impressiveButton.isSelected());
        System.out.println("NoRadioButton after click is enabled: " +noButton.isEnabled()+ " isSelected: " +noButton.isSelected());

    }


    public static void alerts() {
        ChromeDriver driver = getChromeDriverByExecutable();
        driver.get("https://demoqa.com/alerts");

//      WebElement firstButton = driver.findElement(By.id("alertButton"));
//      WebElement thirdButoon = driver.findElement(By.cssSelector("#confirmButton"));
        WebElement fourthButton = driver.findElement(By.cssSelector("#promtButton"));
//      firstButton.click();
//      thirdButoon.click();
        fourthButton.click();


        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Un text trimis din cod automat");
        alert.accept();
        fourthButton.click();
        alert.sendKeys("Text123q4rwe4");
        alert.dismiss();


    }



    public static void doubleClick(){
        ChromeDriver  driver=getChromeDriverByManager();
        driver.get("https://demoqa.com/buttons");
        WebElement doubleClick=driver.findElement(By.id("doubleClickBtn"));
        Actions act = new Actions(driver);
        act.doubleClick(doubleClick).perform();
        System.out.println(doubleClick.getText());
        System.out.println(driver.findElement(By.id("doubleClickMessage")).getText());



    }
    public static void rightClick(){
        ChromeDriver  driver=getChromeDriverByManager();
        driver.get("https://demoqa.com/buttons");
        WebElement rightClick=driver.findElement(By.id("rightClickBtn"));
        Actions act = new Actions(driver);
        act.contextClick(rightClick).perform();
        System.out.println(rightClick.getText());
        System.out.println(driver.findElement(By.id("rightClickMessage")).getText());

    }
    public static void simpleClick(){
        ChromeDriver  driver=getChromeDriverByManager();
        driver.get("https://demoqa.com/buttons");
        WebElement clickbtn = getButtonByText(driver, "Click Me");
        clickbtn.click();
        System.out.println(clickbtn.getText());
        System.out.println(driver.findElement(By.id("dynamicClickMessage")).getText());

    }
    private static WebElement getButtonByText(ChromeDriver driver, String text) {
        List<WebElement> buttons = driver.findElements(By.cssSelector("button.btn.btn-primary"));
        for (WebElement button : buttons) {
            if (text.equals(button.getText())) {
                return button;
            }
        }
        return buttons.get(0);
    }



    public static void actionClass() throws IOException{
        ChromeDriver driver=null;

        try{
            driver=getChromeDriverByManager();
            driver.get("https://demoqa.com");
            List<WebElement> cards = driver.findElements(By.cssSelector(".card"));
            WebElement sixthcard = cards.get(5);

            Actions actions = new Actions(driver);
            actions.moveToElement(sixthcard).build().perform();

            sixthcard.click();
            throw new NoSuchElementException("Exceptie custom");
        }catch (Exception e){
            System.out.println("Am intrat in ramura catch");
            if(driver != null){
                File file = driver.getScreenshotAs(OutputType.FILE);
                File destfile = new File("C:\\Users\\marce\\IdeaProjects\\poza.png");
                FileUtils.copyFile(file,destfile);
            }

        }finally {
            if(driver != null){
                driver.quit();
                System.out.println("Am inchis driverul");
            }
        }
        System.out.println("Finish");

    }



   public static ChromeDriver getChromeDriverByManager(){
      WebDriverManager.chromedriver().setup();
      ChromeDriver driver = new ChromeDriver();

       return  driver;
   }



   public static ChromeDriver getChromeDriverByExecutable(){
   System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
    return new ChromeDriver();
    }
}

>>>>>>> d03044b (primul commit)
