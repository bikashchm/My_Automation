
package com.Linqx_BackEnd.pages;

import com.Linqx_BackEnd.utils.ElementUtils;
import com.Linqx_BackEnd.utils.ReadData;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateJobPage {

    private WebDriver driver;
    private ElementUtils elementUtils;

    public CreateJobPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath ="//input[@placeholder='Enter keyword']")
    private WebElement search;

    @FindBy(xpath = "//span[text()=' Jobs ']")
    private WebElement jobsSidebar;

    public void clickElementOnJobsSidebar() {
        try {
            elementUtils.clickElement(jobsSidebar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FindBy(xpath = "//span[text()=' Table ']")
    private WebElement table;

    public void clickElementOnTable() {
        try {
            elementUtils.clickElement(table);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FindBy(xpath = "//button[text()=' Create New Job']")
    private WebElement createNewJobButton;

    public void clickElementOnCreateNewJobButton() {
        try {
        	Thread.sleep(2000);
            elementUtils.clickElement(createNewJobButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FindBy(xpath = "//input[@formcontrolname='jobNumber']")
    private WebElement jobNumberField;

    public void enterJobNumber() {
        try {
//        	Thread.sleep(2000);
        	String jobNumber=ReadData.readdata("Job Number");
            elementUtils.clearAndSendKeys(jobNumberField, jobNumber);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FindBy(xpath = "//*[@formcontrolname='districtId']")
    private WebElement districtDropdown;

    public void selectDistrict() {
        try {
//        	Thread.sleep(2000);
        	String distname1=ReadData.readdata("districtname");
            elementUtils.selectOptionInDropdown(districtDropdown, distname1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FindBy(xpath = "//select[@formcontrolname='fleet']")
    private WebElement fleetDropdown;

    public void clickElementOnFleetDropdown() {
        try {
            elementUtils.clickElement(fleetDropdown);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectFleet() {
        try {
        	Thread.sleep(2000);
        	String fleet=ReadData.readdata("fleetname");
            elementUtils.selectOptionInDropdown(fleetDropdown, fleet);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FindBy(xpath = "//select[@formcontrolname='operator']")
    private WebElement serviceCompanyDropdown;

    public void clickElementOnServiceCompanyDropdown() {
        try {
        	Thread.sleep(2000);
            elementUtils.clickElement(serviceCompanyDropdown);     
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectServiceCompany() {
        try {
        	
        	//String serviceCompany=ReadData.readdata("Operator company1");
            //elementUtils.selectOptionInDropdown(serviceCompanyDropdown, serviceCompany);
            String sc=ReadData.readdata("service company");
            elementUtils.selectOptionInDropdown(serviceCompanyDropdown,sc);
        	//serviceCompanyDropdown.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FindBy(xpath = "//select[@formcontrolname='pad']")
    private WebElement padDropdown;

    public void clickElementOnPadDropdown() {
        try {
            elementUtils.clickElement(padDropdown);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectPad() {
        try {
        	Thread.sleep(3000);
        	String pad1=ReadData.readdata("padname");
            elementUtils.selectOptionInDropdown(padDropdown, pad1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FindBy(xpath = "//select[@formcontrolname='location']")
    private WebElement locationDropdown;

    public void clickElementOnLocationDropdown() {
        try {
            elementUtils.clickElement(locationDropdown);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectLocation() {
        try {
        	Thread.sleep(3000);
        	String location1=ReadData.readdata("locationname");
            elementUtils.selectOptionInDropdown(locationDropdown, location1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FindBy(xpath = "//select[@formcontrolname='targetStagesPerDay']")
    private WebElement targetStagesPerDayDropdown;

    public void selectTargetStagesPerDay() {
        try {
        	Thread.sleep(4000);
        	String totalStage=ReadData.readdata("Total stage");
            elementUtils.selectOptionInDropdown(targetStagesPerDayDropdown, totalStage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FindBy(xpath = "//input[@formcontrolname='targetDailyPumpTime']")
    private WebElement targetPumpTimePerDayField;

    public void enterTargetPumpTimePerDay() {
        try {
        	Thread.sleep(2000);
        	String targetPumpTimePerDay=ReadData.readdata("TargetPumpTimePerDay");
            elementUtils.clearAndSendKeys(targetPumpTimePerDayField, targetPumpTimePerDay);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FindBy(xpath = "//button[text()='Save Job']")
    private WebElement saveJobButton;

    public void clickElementOnSaveJobButton() {
        try {
            elementUtils.clickElement(saveJobButton);
            Thread.sleep(2000);
            driver.navigate().refresh();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FindBy(id = "jobSavedMessage")
    private WebElement jobSavedMessage;

    public boolean isJobSaved() {
        try {
        	String JobNumber1=ReadData.readdata("Job Number");
        	search.sendKeys(JobNumber1);
        	search.sendKeys(Keys.ENTER);
        	Thread.sleep(2000);
        	WebElement findname=driver.findElement(By.xpath("//td[normalize-space()='"+JobNumber1+"']"));
            return elementUtils.isElementDisplayed(findname);
          //  return elementUtils.isElementDisplayed(jobSavedMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

public void clickElementOnDistrictDropdown() {
    try {
    	
        elementUtils.clickElement(districtDropdown);
    } catch (Exception e) {
        // Log or handle the exception as needed
        e.printStackTrace();
        // Optionally, rethrow or handle failure in an appropriate way
    }
}

}