package com.Btrix24.step_definitions;

import com.Btrix24.utulities.Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TasksStepDefinition {

    Pages pages = new Pages();

    @Given("user on the landing page")
    public void user_on_the_landing_page() {
        pages.loginPage().goToLandingPage();
    }

    @Then("user logs into application with helpdesk{int}@cybertekschool.com and UserUser")
    public void user_logs_into_application_with_helpdesk_cybertekschool_com_and_UserUser(String username,String password) {

        System.out.println(username);
        System.out.println(password);
    }

    @Then("user navigate to {string}")
    public void user_navigate_to(String module) {

        pages.tasksPage().navigateToModule(module);

    }

    @Then("user clicks on new task")
    public void user_clicks_on_new_task() {

    }

    @Then("user enters {string}")
    public void user_enters(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user click {string}")
    public void user_click(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user verifies {string} is displayed")
    public void user_verifies_is_displayed(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user logs into application with marketing{int}@cybertekschool.com and UserUser")
    public void user_logs_into_application_with_marketing_cybertekschool_com_and_UserUser(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("user logs into application with hr{int}@cybertekschool.com and UserUser")
    public void user_logs_into_application_with_hr_cybertekschool_com_and_UserUser(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }


}
