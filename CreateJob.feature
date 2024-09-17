
@feature_CreateJob
Feature: CreateJob

Background: User is on the Job Listing Page
    Given the user clicks on the jobs sidebar
    And the user clicks on the Table
    And the user clicks on the Create New Job button
    

@create-job-with-mandatory-data
Scenario: Create Job with Mandatory Data
    When the user enters Job Number into Job Number input field
    #And the user clicks on the District dropdown element
    And the user selects a districtname from the District dropdown list
    #And the user clicks on the Fleet dropdown
    And the user selects a fleetname from the Fleet dropdown
    #And the user clicks on the service company dropdown
    And the user selects a service company option from the service company dropdown
    #And the user clicks on the Pad dropdown
    And the user selects a padname option from the Pad dropdown
    #And the user clicks on the Location dropdown
    And the user selects a locationname option from the Location dropdown
    #And the user clicks and selects a total stage value from the Target stages per day dropdown
    And the user enters TargetPumpTimePerDay into Target Pump Time Per Day input field
    When the user clicks on the Save Job button
    Then the job Job Number should be saved 
