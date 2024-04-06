package com.rd.steps;

import com.codeborne.selenide.WebDriverRunner;
import com.rd.common.PageManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class CommonSteps {

    PageManager pageManager = new PageManager();

    @Given("open {string} page")
    public void open_page(String string) {
        open(string);
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    @Then("wait {int} seconds")
    public void wait_seconds(Integer int1) {
        sleep(int1 * 1000);
    }

    @When("click {string} button")
    public void click_button(String string) {
        switch (string) {
            case "Buttons" -> pageManager.elementsPage.btnButtons.click();
            case "Click Me" -> pageManager.elementsPage.btnClickMe.click();
            case "WebTables" -> pageManager.webTablesPage.fromWebTables.click();
            case "Add" -> pageManager.webTablesPage.btnAdd.click();
            case "Submit" -> pageManager.webTablesPage.btnSubmit.click();
            case "Edit" -> pageManager.webTablesPage.btnEdit.click();
            default -> {
            }
        }
    }

}
