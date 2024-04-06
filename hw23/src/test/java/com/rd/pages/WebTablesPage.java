package com.rd.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class WebTablesPage extends BasePage{

    public SelenideElement fromWebTables = $(".show li:nth-of-type(4) > .text");
    public SelenideElement btnAdd = $("button#addNewRecordButton");
    public SelenideElement txtFirstName = $("input#firstName");
    public SelenideElement txtLastName = $("input#lastName");
    public SelenideElement txtEmail = $("input#userEmail");
    public SelenideElement txtAge = $("input#age");
    public SelenideElement txtSalary = $("input#salary");
    public SelenideElement txtDepartment = $("input#department");
    public SelenideElement btnSubmit = $("button#submit");
    public SelenideElement btnEdit = $("span#edit-record-4");

    public WebTablesPage(String pageUrl) {
        super(pageUrl);
    }
    public void AddForm(String firstName, String lastName, String email, int age, int salary, String department) {
        txtFirstName.setValue(firstName);
        txtLastName.setValue(lastName);
        txtEmail.setValue(email);
        txtAge.setValue(String.valueOf(age));
        txtSalary.setValue(String.valueOf(salary));
        txtDepartment.setValue(department);
    }
    public void EditForm(String firstName, String lastName, String email, int age, int salary, String department) {
        txtFirstName.setValue(firstName);
        txtLastName.setValue(lastName);
        txtEmail.setValue(email);
        txtAge.setValue(String.valueOf(age));
        txtSalary.setValue(String.valueOf(salary));
        txtDepartment.setValue(department);
    }
}
