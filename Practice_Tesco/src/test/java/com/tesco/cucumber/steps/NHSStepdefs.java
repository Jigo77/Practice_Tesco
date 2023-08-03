package com.tesco.cucumber.steps;

import com.tesco.cucumber.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class NHSStepdefs {


    @Given("^I am on Home Page$")
    public void iAmOnHomePage() {
    }

    @And("^I accept cookies$")
    public void iAcceptCookies() {
        new HomePage().accept();
    }
    @And("^I click on help & Advise$")
    public void iClickOnHelpAdvise() {
        new HomePage().clickhelp();
    }
    @And("^I click on view question uder DBS$")
    public void iClickOnViewQuestionUderDBS() throws InterruptedException {
        //Thread.sleep(3000);
        new HomePage().clickquestion();
    }

    @And("^I print help & advise and verify$")
    public void iPrintHelpAdviseAndVerify() {
        new HomePage().printlist();
    }

    @Then("^I verifiy mandatory training$")
    public void iVerifiyMandatoryTraining() {
    }


}
