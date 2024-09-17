
package com.Linqx_BackEnd.stepdefinitions;

import com.Linqx_BackEnd.pages.CreateJobPage;
import org.openqa.selenium.WebDriver;
import com.Linqx_BackEnd.driverfactory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CreateJob extends DriverFactory {
  
    CreateJobPage createJobPage = new CreateJobPage(driver);

    @Given("the user clicks on the jobs sidebar")
    public void the_user_clicks_on_the_jobs_sidebar() {
        createJobPage.clickElementOnJobsSidebar(); 
    }

//     @And("the user clicks on the Table")
//     public void the_user_clicks_on_the_Table() {
//         createJobPage.clickElementOnTable();
//     }

    @And("the user clicks on the Create New Job button")
    public void the_user_clicks_on_the_Create_New_Job_button() {
        createJobPage.clickElementOnCreateNewJobButton();
    }

    @When("the user enters Job Number into Job Number input field")
    public void the_user_enters_into_Job_Number_input_field() {
        createJobPage.enterJobNumber();
    }

     @And("the user clicks on the District dropdown element")
     public void the_user_clicks_on_the_District_dropdown() {
         createJobPage.clickElementOnDistrictDropdown();
     }

    @And("the user selects a districtname from the District dropdown list")
    public void the_user_selects_a_from_the_District_dropdown_list() {
        createJobPage.selectDistrict();
    }

    @And("the user clicks on the Fleet dropdown")
    public void the_user_clicks_on_the_Fleet_dropdown() {
        createJobPage.clickElementOnFleetDropdown();
    }

    @And("the user selects a fleetname from the Fleet dropdown")
    public void the_user_selects_a_from_the_Fleet_dropdown() {
        createJobPage.selectFleet();
    }

    @And("the user clicks on the service company dropdown")
    public void the_user_clicks_on_the_service_company_dropdown() {
        createJobPage.clickElementOnServiceCompanyDropdown();
    }

    @And("the user selects a service company option from the service company dropdown")
    public void the_user_selects_a_option_from_the_service_company_dropdown() {
        createJobPage.selectServiceCompany();
    }

    @And("the user clicks on the Pad dropdown")
    public void the_user_clicks_on_the_Pad_dropdown() {
        createJobPage.clickElementOnPadDropdown();
    }

    @And("the user selects a padname option from the Pad dropdown")
    public void the_user_selects_a_option_from_the_Pad_dropdown() {
        createJobPage.selectPad();
    }

    @And("the user clicks on the Location dropdown")
    public void the_user_clicks_on_the_Location_dropdown() {
        createJobPage.clickElementOnLocationDropdown();
    }

    @And("the user selects a locationname option from the Location dropdown")
    public void the_user_selects_a_option_from_the_Location_dropdown() {
        createJobPage.selectLocation();
    }

    @And("the user clicks and selects a total stage value from the Target stages per day dropdown")
    public void the_user_clicks_and_selects_a_value_from_the_Target_stages_per_day_dropdown() {
        createJobPage.selectTargetStagesPerDay();
    }

    @And("the user enters TargetPumpTimePerDay into Target Pump Time Per Day input field")
    public void the_user_enters_into_Target_Pump_Time_Per_Day_input_field() {
        createJobPage.enterTargetPumpTimePerDay();
    }

    @When("the user clicks on the Save Job button")
    public void the_user_clicks_on_the_Save_Job_button() {
        createJobPage.clickElementOnSaveJobButton();
    }

    @Then("the job Job Number should be saved")
    public void the_job_should_be_saved() {   	
       Assert.assertTrue(createJobPage.isJobSaved());
    }
}
