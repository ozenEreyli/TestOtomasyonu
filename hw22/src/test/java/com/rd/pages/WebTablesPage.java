package com.rd.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class WebTablesPage  extends BasePage{
    public WebTablesPage(String pageUrl)
    {
        super(pageUrl);
    }
    public SelenideElement FormWebTables = $(".show li:nth-of-type(4) > .text");
    public SelenideElement btnAdd = $("button#addNewRecordButton");
    public SelenideElement txtFirstName = $("input#firstName");
    public SelenideElement txtLastName = $("input#lastName");
    public SelenideElement txtEmail = $("input#userEmail");
    public SelenideElement txtAge = $("input#age");
    public SelenideElement txtSalary = $("input#salary");
    public SelenideElement txtDepartment = $("input#department");
    public SelenideElement btnSubmit = $("button#submit");
    public SelenideElement btnEdit = $("span#edit-record-4");

    public void AddEditForm()
    {
        FormWebTables.click();
        btnAdd.click();
        txtFirstName.setValue("Özen");
        txtLastName.setValue("Karaçakır");
        txtEmail.setValue("ozenkaracakir@gmail.com");
        txtAge.setValue("39");
        txtSalary.setValue("60000");
        txtDepartment.setValue("Yazılım");
        btnSubmit.click();
        sleep(2*10000);
        btnEdit.click();
        txtFirstName.setValue("Haktan");
        txtLastName.setValue("Ereyli");
        txtEmail.setValue("haktanereyli@gmail.com");
        txtAge.setValue("3");
        txtSalary.setValue("100000");
        txtDepartment.setValue("Tıp");
        btnSubmit.click();
        sleep(2*10000);

    }
}
