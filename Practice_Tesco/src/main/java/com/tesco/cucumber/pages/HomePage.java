package com.tesco.cucumber.pages;

import com.tesco.cucumber.browserfactory.ManageBrowser;
import com.tesco.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(ManageBrowser.driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//a[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")
    WebElement acceptcookies;


    @CacheLookup
    @FindBy(xpath = "//div[@class='row h-100']/div/ul/li[6]/a")
    WebElement helpadvise;


    @CacheLookup
    @FindBy(xpath = "//div[@class='col-sm-4'][5]/div/div/button/a")
    WebElement clickquestions;



    static String dat;

    public void printlist() {
        int i;
        String dat1="Mandatory Training";
        for (i = 1; i < 15; i++) {
           // String data = driver.findElement(By.xpath("//div[@class='sidebar-navigation']/a[" + i +"]")).getText();
            dat = driver.findElement(By.xpath("//div[@class='sidebar-navigation']/a[" + i + "]")).getText();
            System.out.println(dat);

            if(dat.equals(dat1)){
                System.out.println("Verify  Mandatory Training");

            }
        }
        System.out.println(i);



    }


    public void accept() {
        clickOnElement(acceptcookies);
    }

    public void clickhelp() {

        clickOnElement(helpadvise);
    }

    public void clickquestion() {
        clickOnElement(clickquestions);
    }


}
