package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Before;
import pages.Appointment;
import setup.Setup;
import utils.Utils;

public class AppointmentSteps extends Utils {
    private Appointment appointment;
    Utils utils;

    @Before
    public void appointmentSetup(){
        appointment = new Appointment(driver);
    }
    @When("enter email and password")
    public void enterEmailAndPassword() throws InterruptedException {
        appointment.doLogin("test.user@mybexa.com","Bexa4all2024!");
    }

    @Given("user visits the url")
    public void userVisitsTheUrl() {
        driver.get("https://us.sureview.mybexa.dev/");
    }

    @And("click button signin")
    public void clickButtonSignin() throws InterruptedException {
        appointment.buttonSignin.click();
        Thread.sleep(3000);
    }

    @And("click buttonNo")
    public void clickButtonNo() throws InterruptedException {
        appointment.buttonNo.click();
        Thread.sleep(30000);
    }

    @Then("user will successfully login")
    public void userWillSuccessfullyLogin() {
        String url= driver.getCurrentUrl();
        Assert.assertTrue(url.contains("https://us.sureview.mybexa.dev/exams"));
    }

    @And("visit appointment page")
    public void visitAppointmentPage() throws InterruptedException {
        appointment.menuAppointments.click();
        Thread.sleep(15000);

    }

    @Given("user click boxIcon")
    public void userClickBoxIcon() throws InterruptedException {
        appointment.boxIcon.click();
        Thread.sleep(1000);

    }

    @And("select development and testing center name")
    public void selectDevelopmentAndTestingCenterName() throws InterruptedException {
        appointment= new Appointment(driver);
        appointment.centerDrpDwn.click();
        Thread.sleep(500);
        appointment.txtSearch.sendKeys("Development and testing");
        Thread.sleep(1000);
        appointment.developTestOpt.get(2).click();
        Thread.sleep(10000);

    }

    @And("click room button")
    public void clickRoomButton() throws InterruptedException {
        appointment= new Appointment(driver);
        appointment.selectRoomBtn.click();
        Thread.sleep(2000);
    }

    @And("select room name manual testing")
    public void selectRoomNameManualTesting() throws InterruptedException {
        appointment= new Appointment(driver);
        appointment.elemRoomNameManualTesting.click();
        Thread.sleep(2000);
    }

    @And("click add appointment button")
    public void clickAddAppointmentButton() throws InterruptedException {
        appointment=new Appointment(driver);
        appointment.addAppoinmentPlusBtn.click();
        Thread.sleep(1000);
    }

    @And("create an appointment")
    public void createAppointment() throws InterruptedException {
        appointment.centerDrpDwn.click();
        Thread.sleep(500);
        appointment.txtSearch.sendKeys("Development and testing");
        timeNap(2);
        appointment.developTestOpt.get(2).click();
        Thread.sleep(10000);
        appointment.selectRoomBtn.click();
        Thread.sleep(2000);
        appointment.elemRoomNameManualTesting.click();
        Thread.sleep(2000);
        Utils.scrollToElement(driver,appointment.addAppoinmentPlusBtn);
        Thread.sleep(2000);
        appointment.addAppoinmentPlusBtn.click();
        Thread.sleep(1000);
        appointment.txtPhoneNum.sendKeys("6675559999");
        Thread.sleep(2000);
        appointment.txtSearchCustomer.get(4).click();
        Thread.sleep(2000);
        appointment.txtSearchCustomer.get(4).sendKeys("Abu");
        Thread.sleep(10000);
        appointment.customerName.click();
        Thread.sleep(2000);
        appointment.checkBoxTextMsg.click();
        appointment.checkBoxTextMsg.click();
        Thread.sleep(1000);
        Utils.scrollToElement(driver,appointment.btnSave);
        Thread.sleep(1000);
        Assert.assertTrue(appointment.btnSave.isEnabled());
        appointment.btnSave.click();
        Thread.sleep(1000);
    }

    @And("cancel appointment")
    public void cancelAppointment() throws InterruptedException {
        appointment.centerDrpDwn.click();
        Thread.sleep(500);
        appointment.txtSearch.sendKeys("Development and testing");
        Thread.sleep(1000);
        appointment.developTestOpt.get(2).click();
        Thread.sleep(10000);
        appointment.selectRoomBtn.click();
        Thread.sleep(2000);
        appointment.elemRoomNameManualTesting.click();
        Thread.sleep(2000);
        appointment.appointmentWeek.click();
        Thread.sleep(1000);
        appointment.btnCancel.click();
        Thread.sleep(1000);
        appointment.btnYes.click();
        Thread.sleep(5000);

    }

    @Given("click input button")
    public void clickInputButton() throws InterruptedException {
        appointment.arryBtn.click();
        timeNap(1);

    }

    @And("select element global")
    public void selectElementGlobal() throws InterruptedException {
        appointment.globalBtn.click();
        timeNap(10);
    }

    @And("select account")
    public void selectAccount() throws InterruptedException {
        appointment.signout.click();
        timeNap(10);
    }

    @And("click solid button test user")
    public void clickSolidButtonTestUser() throws InterruptedException {
        appointment.testUserBtn.click();
        timeNap(1);
    }

    @And("select go to admin")
    public void selectGoToAdmin() throws InterruptedException {
        appointment.goToAdminBtn.click();
        timeNap(10);
    }

    @And("visit center page")
    public void visitCenterPage() throws InterruptedException {
        appointment.centerBtn.click();
        timeNap(2);
    }

    @And("view time schedule")
    public void viewTimeSchedule() throws InterruptedException {
        appointment.doTimeChecking();
        timeNap(2);
    }

    @And("click appointment button")
    public void clickAppointmentButton() throws InterruptedException {
        appointment.appointmentButton.click();
        timeNap(10);
    }

    @And("click calender view button")
    public void clickCalenderViewButton() throws InterruptedException {
        appointment.calendarViewBtn.click();
        timeNap(2);
    }

    @And("reset appointment")
    public void resetAppointment() throws InterruptedException {
        appointment.doReset();
    }

    @And("reschedule appointment")
    public void rescheduleAppointment() throws InterruptedException {
        appointment.centerDrpDwn.click();
        Thread.sleep(500);
        appointment.txtSearch.sendKeys("Development and testing");
        Thread.sleep(1000);
        appointment.developTestOpt.get(2).click();
        Thread.sleep(10000);
        appointment.selectRoomBtn.click();
        timeNap(2);
        appointment.elemRoomNameManualTesting.click();
        timeNap(2);
        appointment.addAppoinmentPlusBtn.click();
        Thread.sleep(2000);
        appointment.txtPhoneNum.sendKeys("6675559999");
        Thread.sleep(2000);
        appointment.txtSearchCustomer.get(4).click();
        Thread.sleep(1000);
        appointment.txtSearchCustomer.get(4).sendKeys("Abu");
        Thread.sleep(3000);
        appointment.customerName.click();
        Thread.sleep(2000);
        appointment.checkBoxTextMsg.click();
        appointment.checkBoxTextMsg.click();
        Thread.sleep(1000);
        appointment.emailCheckbox.click();
        Thread.sleep(1000);
        appointment.includeIntakeBtn.click();
        scrollToElement(driver, appointment.btnSave);
        Thread.sleep(1000);
        Assert.assertTrue(appointment.btnSave.isEnabled());
        appointment.btnSave.click();
        Thread.sleep(1000);
        appointment.appointmentWeek.click();
        Thread.sleep(1000);
        appointment.btnReschedule.click();
        Thread.sleep(5000);
        appointment.arryBtn2.click();
        Thread.sleep(1000);
        scrollToElement(driver, appointment.time230PM);
        Thread.sleep(1000);
        appointment.time230PM.click();
        Thread.sleep(1000);
        scrollToElement(driver, appointment.buttonReschedule);
        Thread.sleep(2000);
        appointment.closeBtn.click();
        Thread.sleep(2000);
        appointment.appointmentWeek.click();
        Thread.sleep(1000);
        appointment.btnCancel.click();
        Thread.sleep(1000);
        appointment.btnYes.click();
        Thread.sleep(3000);
    }

    @And("download today report")
    public void downloadTodayReport() throws InterruptedException {
        appointment.downloadTodayReport(driver);
    }

    @And("download this week report")
    public void downloadThisWeekReport() throws InterruptedException {
        appointment.downloadThisWeekReport(driver);
    }

    @And("download previous week report")
    public void downloadPreviousWeekReport() throws InterruptedException {
        appointment.downloadPreviousWeekReport(driver);
    }

    @And("download next week report")
    public void downloadNextWeekReport() throws InterruptedException {
        appointment.downloadNextWeekReport(driver);
    }

    @And("download this month report")
    public void downloadThisMonthReport() throws InterruptedException {
        appointment.downloadThisMonthReport(driver);
        
    }

    @And("download next month report")
    public void downloadNextMonthReport() throws InterruptedException {
        appointment.downloadNextMonthReport(driver);
    }

    @And("download previous month report")
    public void downloadPreviousMonthReport() throws InterruptedException {
        appointment.downloadPreviousMonthReport(driver);
    }

    @And("download quarter report")
    public void downloadQuarterMonthReport() throws InterruptedException {
        appointment.downloadQuarterMonthReport(driver);
    }

    @And("download custom date range report")
    public void downloadCustomDateRangeReport() throws InterruptedException {
        appointment.downloadCustomdateRangeReport(driver);

    }

    @And("download today excel report")
    public void downloadTodayExcelReport() throws InterruptedException {
        appointment.downloadTodayExcelReport(driver);
    }

    @And("download this week excel report")
    public void downloadThisWeekExcelReport() throws InterruptedException {
        appointment.downloadThisWeekExcelReport(driver);
    }

    @And("download this previous excel report")
    public void downloadThisPreviousExcelReport() throws InterruptedException {
        appointment.downloadThisPreviousExcelReport(driver);
    }

    @And("download this next excel report")
    public void downloadThisNextExcelReport() throws InterruptedException {
        appointment.downloadThisNextWeekExcelReport(driver);
    }

    @And("download this month excel report")
    public void downloadThisMonthExcelReport() throws InterruptedException {
        appointment.downloadThisMonthExcelReport(driver);
    }

    @And("download previous month excel report")
    public void downloadPreviousMonthExcelReport() throws InterruptedException {
        appointment.downloadPreviousMonthExcelReport(driver);
    }

    @And("download this quarter excel report")
    public void downloadThisQuarterExcelReport() throws InterruptedException {
        appointment.downloadThisQuarterExcelReport(driver);
    }

    @And("download next month excel report")
    public void downloadNextMonthExcelReport() throws InterruptedException {
        appointment.downloadNextMonthExcelReport(driver);
    }

//    @And("click on appointment button")
//    public void clickOnAppointmentButton() {
//        appointment.appointmentButton.click();
//    }
    @Given("click on appointment button")
    public void click_on_appointment_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
