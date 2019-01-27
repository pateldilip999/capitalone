package Com.Stepdefination;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driverclass {

   public static WebDriver driver;

        public void OpenBrowser(){

            String browser;
            browser = System.getProperty("browser");

            if(browser.equalsIgnoreCase("Chrome"))
            {
                ChromeDriverManager.getInstance().setup();
                driver = new ChromeDriver();
        }

            else if (browser.equalsIgnoreCase("Firefox"))
                {
                    FirefoxDriverManager.getInstance().setup();
                    driver = new FirefoxDriver();
                }
            else
                InternetExplorerDriverManager.getInstance().setup();
                driver = new InternetExplorerDriver();

            driver.get("https://www.capitalone.co.uk/");
            driver.manage().window().maximize();
        }

        public void CloseBrowser(){
         driver.quit(); }
}
