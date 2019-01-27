package Com.pages;

import Com.Stepdefination.Driverclass;
import cucumber.api.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import static junit.framework.TestCase.assertEquals;

public class StepPage extends Driverclass {

    public void quiccheck(){
        driver.findElement(By.xpath("//*[@id=\"Homepage:j_id_id5\"]/div/main/div/div[1]/article/a")).click(); }
    public void ActualAbout(){

        String actual_about = driver.findElement(By.xpath("//*[@id=\"quickcheck-form-wrapper\"]/div[1]/fieldset/header/h2")).getText();
        String expect_about = "About you";
        assertEquals(expect_about,actual_about); }

    public void ActualWork(){
        String actual_Workfinace;
        String expected_workfinace = "Work & finances";
        actual_Workfinace = driver.findElement(By.xpath("//*[@id=\"quickcheck-form-wrapper\"]/div[2]/fieldset/header/h2")).getText();
        assertEquals(expected_workfinace,actual_Workfinace); }

    public void ActualWlive(){
        String actual_wrlive = driver.findElement(By.xpath("//*[@id=\"quickcheck-form-wrapper\"]/div[3]/fieldset/header/h2")).getText();
        String Expeted_wrlive = "Where you live";
        assertEquals(Expeted_wrlive,actual_wrlive); }

    public void ActualUrl(){
        String actual_url = driver.getCurrentUrl();
        String expeted_url = "https://www.capitalone.co.uk/creditcards/secure/find-my-card.jsf";
        assertEquals(expeted_url,actual_url); }

   public void Title(){new Select(driver.findElement(By.id("capitalone:smart-search-app:personal:cc_title"))).selectByValue("Miss"); }

   public void firstname(){driver.findElement(By.id("capitalone:smart-search-app:personal:cc_fname")).sendKeys("Mahesh");}

   public void lastname(){driver.findElement(By.id("capitalone:smart-search-app:personal:cc_sname")).sendKeys("Raja"); }

   public void email(){driver.findElement(By.id("capitalone:smart-search-app:personal:cc_email_address")).sendKeys("email@eamil.com");}

   public void dob(){
       new Select(driver.findElement(By.id("capitalone:smart-search-app:personal:cc_dob_day"))).selectByValue("5");
       new Select(driver.findElement(By.id("capitalone:smart-search-app:personal:cc_dob_month"))).selectByValue("3");
       new Select(driver.findElement(By.id("capitalone:smart-search-app:personal:cc_dob_year"))).selectByValue("1980"); }

   public void EmpStatus(){ new Select(driver.findElement(By.id("capitalone:smart-search-app:employment-info:cc_empstatus"))).selectByVisibleText("Employed"); }

   public void occupation(){ driver.findElement(By.name("capitalone:smart-search-app:employment-info:cc_occupation")).sendKeys("Technician");   }

   public void anulIncome(){driver.findElement(By.name("capitalone:smart-search-app:employment-info:cc_grossincome")).sendKeys("50000"); }

   public void clickbut(){driver.findElement(By.id("capitalone:smart-search-app:employment-info:cc_cash_advance")).click(); }

   public void residentstatus(){ new Select(driver.findElement(By.name("capitalone:smart-search-app:residential02:cc_residential_status"))).selectByVisibleText("Homeowner");    }

   public void addresstatus(){ new Select(driver.findElement(By.id("capitalone:smart-search-app:residential02:cc_curr_addr_years"))).selectByValue("5");}

   public void houseno(){ driver.findElement(By.name("capitalone:smart-search-app:AddressSearch:as_house_name")).sendKeys("114");}

   public void postcode(){driver.findElement(By.id("capitalone:smart-search-app:AddressSearch:as_postcode")).sendKeys("ha8 5px");}

//   public void findaddress(){driver.findElement(By.id("capitalone:smart-search-app:AddressSearch:asBeansearch")).click();}

   public void maunaladd(){driver.findElement(By.id("capitalone:smart-search-app:AddressSearch:asBeanmanual")).click();}

   public void flatno(){driver.findElement(By.id("capitalone:smart-search-app:AddressSearch:cc_curr_addr_flat")).sendKeys("Flat A");}

   public void housename(){driver.findElement(By.name("capitalone:smart-search-app:AddressSearch:cc_curr_addr_name")).sendKeys("Krishna");}

   public void housenum(){driver.findElement(By.xpath("//*[@id=\"capitalone:smart-search-app:AddressSearch:cc_curr_addr_num\"]")).sendKeys("114");}

   public void streetname(){driver.findElement(By.xpath("//*[@id=\"capitalone:smart-search-app:AddressSearch:cc_curr_addr_1_address\"]")).sendKeys("Reynolds Drive");}

   public void address2(){driver.findElement(By.id("capitalone:smart-search-app:AddressSearch:cc_curr_addr_2_address")).sendKeys("Edgware");}

   public void town_city(){driver.findElement(By.id("capitalone:smart-search-app:AddressSearch:cc_curr_addr_town")).sendKeys("London");}

   public void county(){driver.findElement(By.id("capitalone:smart-search-app:AddressSearch:cc_curr_addr_county")).sendKeys("middlesex");}

   public void postcode1(){driver.findElement(By.id("capitalone:smart-search-app:AddressSearch:cc_curr_addr_postcode")).sendKeys("HA8 5PX");}

   public void noworrieschcbox(){driver.findElement(By.id("capitalone:smart-search-app:gdpr_alert")).click();}

   public void smscheckbox(){driver.findElement(By.id("capitalone:smart-search-app:label_gdpr_subscribe")).click();}

   public void checknow(){driver.findElement(By.id("capitalone:smart-search-app:ccardApplicationSubmit")).click();}
}
