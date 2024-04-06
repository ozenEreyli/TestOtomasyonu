package com.rd.steps;

import com.rd.common.PageManager;
import com.rd.utils.ScenarioContext;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class WebTablesPageSteps {

    PageManager pageManager = new PageManager();
    CommonSteps commonSteps = new CommonSteps();
    ScenarioContext scenarioContext = new ScenarioContext();

    @When("Enter {string},{string},{string},{},{},{string} fields")
    public void enter_fields(String firstName, String lastName, String email, int age, int salary, String department) {
        pageManager.webTablesPage.AddForm(firstName, lastName, email, age, salary, department);
    }

    @Then("Check fourth Record")
    public void checkFourthRecord() {
        assertThat(pageManager.webTablesPage.btnEdit.isDisplayed()).isTrue();
    }

    @But("fix Registration Form from table")
    public void fixRegistrationFormFromTable(DataTable dataTable) {
        String firstName=null;
        String lastName=null;
        String email=null;
        int age=0;
        int salary=0;
        String department=null;
        List<Map<String, String>> data = Collections.singletonList(dataTable.asMap());
        for (Map<String, String> form : data) {
            firstName = form.get("firstName");
            lastName = form.get("lastName");
            email = form.get("email");
            age = Integer.parseInt(form.get("age"));
            salary  = Integer.parseInt(form.get("salary"));
            department = form.get("department");

        }
        pageManager.webTablesPage.EditForm(firstName,lastName,email,age,salary,department);
    }

    @When("Get data from file and fill form")
    public void getDataFromFileAndFillForm() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Map<String, String>> formDatas = mapper.readValue(new FileReader("src/test/resources/datas/formData.json"), List.class);
        for (Map<String, String> formData : formDatas) {
            commonSteps.click_button("Add");
            pageManager.webTablesPage.AddForm(formData.get("firstName"), formData.get("lastName"), formData.get("email"), Integer.parseInt(formData.get("age")), Integer.parseInt(formData.get("salary")), formData.get("department"));
            commonSteps.click_button("Submit");
        }
    }

}
