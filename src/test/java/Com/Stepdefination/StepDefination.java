package Com.Stepdefination;

import Com.pages.StepPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import static junit.framework.TestCase.assertEquals;

public class StepDefination extends Driverclass {

    StepPage SP = PageFactory.initElements(driver, StepPage.class);

    @Given("^I enter url as \"([^\"]*)\"$")
    public void iEnterUrlAs(String url) throws Throwable {
        System.out.println(url);
        OpenBrowser(); }

    @When("^I click on Quick check out now$")
    public void iClickOnQuickCheckOutNow() {
        SP.quiccheck();
    }

    @Then("^I should see text \"([^\"]*)\"$")
    public void iShouldSeeText(String aboutu) {
        SP.ActualAbout();
    }

    @And("^I should see textas \"([^\"]*)\"$")
    public void iShouldSeeTextas(String workfinace) throws Throwable {
        SP.ActualWork(); }

    @And("^I should see texta \"([^\"]*)\"$")
    public void iShouldSeeTexta(String wrlive) throws Throwable {
        SP.ActualWlive(); }

    @And("^I should see url as \"([^\"]*)\"$")
    public void iShouldSeeUrlAs(String arg0) throws Throwable {
        SP.ActualUrl(); }

    @When("^I clik title as \"([^\"]*)\"$")
    public void iClikTitleAs(String arg0) throws Throwable {
        SP.Title(); }

    @Given("^I enter firstname as \"([^\"]*)\"$")
    public void iEnterFirstnameAs(String arg0) throws Throwable {
        SP.firstname(); }

    @Given("^I enter lastname as \"([^\"]*)\"$")
    public void iEnterLastnameAs(String arg0) throws Throwable {
        SP.lastname(); }

    @And("^I enter email as \"([^\"]*)\"$")
    public void iEnterEmailAs(String arg0) throws Throwable {
        SP.email(); }

    @And("^I enter date of birth$")
    public void iEnterDateOfBirth() {
        SP.dob();
    }

    @When("^I click on employment status$")
    public void iClickOnEmploymentStatus() {
        SP.EmpStatus();
    }

    @Given("^I enter occupation$")
    public void iEnterOccupation() {
        SP.occupation();
    }

    @Given("^I enter yearly income$")
    public void iEnterYearlyIncome() {
        SP.anulIncome();
    }

    @When("^I click on yes button$")
    public void iClickOnYesButton() {
        SP.clickbut();
    }

    @When("^I click on resident as \"([^\"]*)\"$")
    public void iClickOnResidentAs(String arg0) throws Throwable {
        SP.residentstatus(); }

    @When("^I click on years of address \"([^\"]*)\"$")
    public void iClickOnYearsOfAddress(String arg0) throws Throwable {
        SP.addresstatus(); }

    @Given("^I enter house number as \"([^\"]*)\"$")
    public void iEnterHouseNumberAs(String houseno) throws Throwable {
        SP.houseno(); }

    @Given("^I enter postcode as \"([^\"]*)\"$")
    public void iEnterPostcodeAs(String arg0) throws Throwable {
        SP.postcode(); }

//    @When("^I click on find address$")
//    public void iClickOnFindAddress() {
//        SP.findaddress();
//    }

    //    @When("^I click on confirm address$")
//    public void iClickOnConfirmAddress() {
//        if (new Select(driver.findElement(By.id("capitalone:smart-search-app:addressPick:as_pick"))).selectByValue("als1005"));
//
//        else
//
//            (driver.findElement(By.xpath("//*[@id=\"quickcheck-form-wrapper\"]/div[3]/fieldset/div[6]/a")).click());
//
//    }

    @When("^I click on manual address button$")
    public void iClickOnManualAddressButton() {
        SP.maunaladd();
    }

    @Given("^I enter flat number as \"([^\"]*)\"$")
    public void iEnterFlatNumberAs(String flateno) throws Throwable {
        SP.flatno(); }

    @Given("^I enter House name as \"([^\"]*)\"$")
    public void iEnterHouseNameAs(String housename) {
        SP.housename();
    }

    @Given("^I enter housenumber as \"([^\"]*)\"$")
    public void iEnterHousenumberAs(String housenum)  {
        SP.housenum(); }

    @Given("^I enter street name as \"([^\"]*)\"$")
    public void iEnterStreetNameAs(String street) {
        SP.streetname(); }

    @Given("^I enter addressline as \"([^\"]*)\"$")
    public void iEnterAddresslineAs(String address)  {
        SP.address2(); }

    @Given("^I enter town as \"([^\"]*)\"$")
    public void iEnterTownAs(String town) throws Throwable {
        SP.town_city();}

    @Given("^I enter county as \"([^\"]*)\"$")
    public void iEnterCountyAs(String country) {
        SP.county(); }


    @Given("^I enter postcod as \"([^\"]*)\"$")
    public void iEnterPostcodAs(String postcode1)  {
        SP.postcode1(); }

    @When("^I click on checkbox noworris$")
    public void iClickOnCheckboxNoworris() {
        SP.noworrieschcbox(); }


    @When("^I click on checkbox sms$")
    public void iClickOnCheckboxSms() {
        SP.smscheckbox();    }


    @When("^I click on checknow button$")
    public void iClickOnChecknowButton() {
        SP.checknow();}
}