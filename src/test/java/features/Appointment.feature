Feature: Login feature

  Background:login with valid credentials
    Given user visits the url
    When enter email and password
    And click button signin
    And click buttonNo
    Then user will successfully login

  @Release
  Scenario: Verify that user can successfully create an appointment
    Given user click boxIcon
    And visit appointment page
    And create an appointment

  @Release
  Scenario: Verify that user can successfully cancel this appointment
    Given user click boxIcon
    And visit appointment page
    And cancel appointment

  Scenario: Verify that user can successfully check time schedule
    Given click input button
    And select element global
    And select account
    And click solid button test user
    And select go to admin
    And user click boxIcon
    And visit center page
    And view time schedule

  Scenario: Verify that user can successfully check booking appointment details
    Given user click boxIcon
    And click on appointment button
    And click calender view button

  Scenario: Verify that user can successfully reset
    Given user click boxIcon
    And click appointment button
    And reset appointment

  Scenario: Verify that user can successfully reschedule appointment
    Given user click boxIcon
    And click appointment button
    And reschedule appointment

  Scenario: Verify that user can successfully download today pdf report
    Given user click boxIcon
    And click appointment button
    And download today report

  Scenario: Verify that user can successfully download this week pdf report
    Given user click boxIcon
    And click appointment button
    And download this week report

  Scenario: Verify that user can successfully download previous week pdf report
    Given user click boxIcon
    And click appointment button
    And download previous week report

  Scenario: Verify that user can successfully download next week pdf report
    Given user click boxIcon
    And click appointment button
    And download next week report

  Scenario: Verify that user can successfully download this month pdf report
    Given user click boxIcon
    And click appointment button
    And download this month report

  Scenario: Verify that user can successfully download next month pdf report
    Given user click boxIcon
    And click appointment button
    And download next month report

  Scenario: Verify that user can successfully download previous month pdf report
    Given user click boxIcon
    And click appointment button
    And download previous month report

  Scenario: Verify that user can successfully download quarter month pdf report
    Given user click boxIcon
    And click appointment button
    And download quarter report

  Scenario: Verify that user can successfully download custom date range month pdf report
    Given user click boxIcon
    And click appointment button
    And download custom date range report

  Scenario: Verify that user can successfully download today excel report
    Given user click boxIcon
    And click appointment button
    And download today excel report

  Scenario: Verify that user can successfully download this week excel report
    Given user click boxIcon
    And click appointment button
    And download this week excel report


  Scenario: Verify that user can successfully download previous week excel report
    Given user click boxIcon
    And click appointment button
    And download this previous excel report

  Scenario: Verify that user can successfully download next week excel report
    Given user click boxIcon
    And click appointment button
    And download this next excel report

  Scenario: Verify that user can successfully download this month excel report
    Given user click boxIcon
    And click appointment button
    And download this month excel report

  Scenario: Verify that user can successfully download next month excel report
    Given user click boxIcon
    And click appointment button
    And download next month excel report


  Scenario: Verify that user can successfully download previous month excel report
    Given user click boxIcon
    And click appointment button
    And download previous month excel report

  Scenario: Verify that user can successfully download this quarter excel report
    Given user click boxIcon
    And click appointment button
    And download this quarter excel report


































