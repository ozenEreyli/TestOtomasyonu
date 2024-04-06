@webTables
Feature: WebTables this feature includes /WebTables tests

  Scenario: WebTables Tests First and must
    Given open "https://demoqa.com/webtables" page
    And click "Web Tables" button

  @formInput
  Scenario Outline: Fill a Registration Form (only 1 / multi) Record
    When click "Add" button
    When Enter '<txtFirstName>','<txtLastName>','<txtEmail>',<txtAge>,<txtSalary>,'<txtDepartment>' fields
    And wait 1 seconds
    And click "Submit" button
    And wait 1 seconds
    Examples:
      | txtFirstName | txtLastName | txtEmail         | txtAge | txtSalary | txtDepartment |
      | Özen         | Ereyli      | ozen@gmail.com   | 39     | 50000     | Software    |
      | Haktan       | Ereyli      | haktan@gmail.com | 3      | 100000    | DevOps      |

  Scenario: TC03 Check fourth Record
    Then Check fourth Record

  @formInput
  Scenario: Edit a Registration Form
    Then click "Edit" button
    But  fix Registration Form from table
      | firstName  | Serkan           |
      | lastName   | Ereyli           |
      | email      | serkan@gmail.com |
      | age        | 41               |
      | salary     | 35000            |
      | department | Electric         |
    And click "Submit" button
    And wait 1 seconds

  @formInput
  Scenario:Get Data From json File
    Given open "https://demoqa.com/webtables" page
    And click "Web Tables" button
    When Get data from file and fill form
    And wait 1 seconds
