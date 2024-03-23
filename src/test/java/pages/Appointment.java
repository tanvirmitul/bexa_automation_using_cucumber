package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

import java.util.List;

public class Appointment {
    @FindBy(id = "i0116")
    public WebElement firstLast;
    @FindBy(xpath = "//input[@id='idSIButton9']")
    public WebElement buttonNext;

    @FindBy(xpath = "//input[@name='passwd']")
    public WebElement textPassword;

    @FindBy(xpath = "//input[@id='idSIButton9']")
    public WebElement buttonSignin;
    @FindBy(xpath = "//input[@id='idBtn_Back']")
    public WebElement buttonNo;
    @FindBy(xpath = "//span[@class='k-button-text']")
    public WebElement testUserBtn;
    @FindBy(xpath = "//span[@class='k-icon k-i-grid k-icon-24 colored-icon']")
    public WebElement boxIcon;
    @FindBy(xpath = "//span[normalize-space()='Appointments']")
    public WebElement appointmentButton;
    //    @FindBy(xpath = "(//button[@type='button'])[7]")
//    public WebElement centerDrpDwn;
    @FindBy(xpath = "(//button[@class='k-input-button k-button k-icon-button k-button-md k-button-solid k-button-solid-base'])[3]")
    public WebElement centerDrpDwn;
    @FindBy(xpath = "//input[@role='textbox']")
    public WebElement textBox;
    @FindBy(xpath = "//span[@class='k-treeview-leaf-text ng-tns-c149-155']")
    WebElement developTestBtn;
    @FindBy(xpath = "//button[@class='control-navigate next']")
    WebElement arrybutton;
    @FindBy(xpath = "(//span[contains(normalize-space(),'+ Appointment')])[10]")
    WebElement dateBtn;
    @FindBy(css = "[role=\"combobox\"]")
    List<WebElement> searchCustomer;
    @FindBy(xpath = "//span[normalize-space()='Nirab Test Prod 1']")
    WebElement nirabText;
    @FindBy(xpath = "//input[@placeholder='MRN']")
    WebElement mrnbText;
    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement saveBtn;


    ///timelocator
    @FindBy(xpath = "(//button[@type='button'])[1]")
    public
    WebElement arrayBtn;

    @FindBy(xpath = "//span[normalize-space()='Global']")
    public WebElement globalBtn;

    @FindBy(xpath = "//div[@data-bind='text: ((session.isSignedIn || session.isSamsungSso) && session.unsafe_fullName) || session.unsafe_displayName']")
    public WebElement signout;
    @FindBy(xpath = "//span[@class='k-button-text']")
    public WebElement textUserBtn;
    @FindBy(xpath = "//span[contains(text(),'Go to Admin')]")
    public WebElement goToAdminBtn;

    @FindBy(xpath = "//span[@class='k-icon k-i-grid k-icon-24 colored-icon']")
    WebElement boxBtn;
    @FindBy(xpath = "//span[normalize-space()='Centers']")
    public WebElement centerBtn;
    @FindBy(xpath = "//input[@role='textbox']")
    public WebElement txtSearch;

    @FindBy(xpath = "//button[normalize-space()='Filters']")
    WebElement filterBtn;
    @FindBy(className = "k-treeview-leaf")
    public List<WebElement> developTestOpt;
    @FindBy(xpath = "//button[@class='control-navigate next']")
    public WebElement arryBtn;
    @FindBy(xpath = "(//button[@class='control-navigate next'])[2]")
    public WebElement arryBtn2;
    @FindBy(xpath = "(//span[@class='title'][normalize-space()='+ Appointment'])[1]")
    public WebElement addAppoinmentPlusBtn;
    @FindBy(xpath = "(//span[@class='title'][normalize-space()='+ Appointment'])[1]")
    public WebElement workWeekAddAppointmentBtn;
    @FindBy(xpath = "(//div[@role='button'])[1]")
    public WebElement dayAppointmentBtn;
    @FindBy(xpath = "(//button[@class=\"k-input-button k-button k-icon-button k-button-md k-button-solid k-button-solid-base\"])[4]")
    public WebElement selectRoomBtn;
    @FindBy(xpath = "//button[normalize-space()='Reschedule']")
    public WebElement btnReschedule;
    @FindBy(xpath = "//span[normalize-space()='Room 1']")
    public WebElement room1Btn;
    @FindBy(xpath = "(//p[contains(text(),'2:30 PM')])[10]")
    public WebElement time230PM;
    @FindBy(xpath = "(//button[@type='button'])[4]")
    WebElement arrayTime;
    @FindBy(id = "phoneNumber")
    public WebElement txtPhoneNum;
    @FindBy(className = "appointment-week")
    public WebElement appointmentWeek;
    @FindBy(xpath = "(//input[@type='text'])[6]")
    public WebElement txtMRN;
    @FindBy(xpath = "//button[contains(normalize-space(),'Save')]")
    public WebElement btnSave;
    @FindBy(xpath = "//button[normalize-space()='Yes']")
    public WebElement btnYes;
    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    public WebElement btnCancel;
    @FindBy(xpath = "(//span[contains(text(),'Md Abu Bakar Siddik')])[1]")
    public WebElement customerName;
    @FindBy(className = "k-input-inner")
    public List<WebElement> txtSearchCustomer;
    @FindBy(xpath = "//span[normalize-space()='Alaska Standard Time (AKST): GMT-9']")
    WebElement alaksaStandardTimeBtn;
    @FindBy(xpath = "//input[@placeholder='Search Center']")
    WebElement searchBox;

    @FindBy(xpath = "//button[normalize-space()='Save & Close']")
    public WebElement saveAndCloseBtn;

    @FindBy(xpath = "//span[normalize-space()='Schedules']")
    public WebElement menuSchedule;
    @FindBy(xpath = "(//*[name()='svg'][@class='icon'])[81]")
    public WebElement calenderIcon;

    @FindBy(xpath = "//td[normalize-space()='Development and Testing']")
    WebElement developmentAndTestingBtn;

    @FindBy(xpath = "//span[contains(text(),'Go to Exams')]")
    public WebElement goToExamBtn;

    @FindBy(xpath = "//button[@class=\"button primary ng-star-inserted\"]")
    public WebElement appointmentPlusBtn;

    @FindBy(xpath = "//span[normalize-space()='Work Week']")
    public WebElement workWeekBtn;
    @FindBy(xpath = "//span[normalize-space()='Day']")
    public WebElement dayBtn;
    @FindBy(xpath = "(//span[@class=\"title\"])[1]")
    public WebElement dayAppointmentPlusBtn;
    @FindBy(xpath = "//span[@class='k-switch-thumb k-rounded-full']")
    public WebElement calendarViewBtn;
    @FindBy(xpath = "(//td[@role='gridcell'][normalize-space()='IU13 - Lancaster'])[2]")
    public WebElement centerSelectBtn;
    @FindBy(xpath = "(//span[@class='k-button-icon k-icon k-i-caret-alt-down'])[1]")
    public WebElement worldSelectDropdown;
    @FindBy(xpath = "//span[@class='k-list-item-text'][normalize-space()='North America']")
    public WebElement northAmerica;
    @FindBy(xpath = "//span[normalize-space()='Build Report']")
    WebElement buildReportBtn;
    @FindBy(xpath = "//input[@id='4']")
    public WebElement thisMonthBtn;
    @FindBy(xpath = "//button[normalize-space()='Preview']")
    public WebElement previewBtn;
    @FindBy(xpath = "//button[normalize-space()='Reset']")
    public WebElement resetBtn;
    @FindBy(xpath = "//button[@title='Close']")
    public WebElement closeBtn;

    @FindBy(xpath = "(//*[name()='use'])[453]")
    WebElement unavailableSlotBtn;
    @FindBy(xpath = "//button[normalize-space()='Yes']")
    WebElement yesBtn;
    @FindBy(xpath = "(//*[name()='use'])[124]")
    WebElement notAvailableBtn;
    @FindBy(xpath = "//button[contains(.,'Download PDF')]")
    WebElement btnDownloadPDF;
    @FindBy(xpath = "//input[@id='arrived']")
    WebElement checkBoxArrived;
    @FindBy(xpath = "//input[@id='cancelled']")
    WebElement checkBoxCancelled;
    @FindBy(xpath = "//input[@id='abandoned']")
    WebElement checkBoxAbandoned;
    @FindBy(xpath = "//input[@id='proposed']")
    WebElement checkBoxProposed;
    @FindBy(xpath = "//input[@id='pending']")
    WebElement checkBoxPending;
    @FindBy(xpath = "//input[@id='checkedIn']")
    WebElement checkBoxCheckedIn;
    @FindBy(xpath = "//input[@id='waitlist']")
    WebElement checkBoxWaitlist;
    @FindBy(xpath = "//input[@id='aborted']")
    WebElement checkBoxAborted;
    @FindBy(xpath = "//button[normalize-space()='Download Excel']")
    WebElement btnDownloadExcel;
    @FindBy(xpath = "//input[@id='6']")
    public WebElement previousMonthBtn;
    @FindBy(xpath = "//input[@id='7']")
    public WebElement thisQuarterBtn;
    @FindBy(xpath = "//input[@id='8']")
    public WebElement thisYearBtn;
    @FindBy(xpath = "//span[normalize-space()='Reschedule']")
    public WebElement buttonReschedule;
    @FindBy(xpath = "//input[@id='9']")
    public WebElement customDateRangeBtn;
    @FindBy(xpath = "//input[@id='10']")
    public WebElement allTimeBtn;
    @FindBy(xpath = "//input[@id='allowTextMessages']")
    public WebElement checkBoxTextMsg;
    @FindBy(xpath = "//span[normalize-space()='Appointments']")
    public WebElement menuAppointments;
    @FindBy(xpath = "//span[normalize-space()='Automation Testing']")
    public WebElement elemRoomNameManualTesting;
    @FindBy(xpath = "//input[@id='allowEmails']")
    public WebElement emailCheckbox;
    @FindBy(xpath = "(//kendo-switch[@role='switch'])[2]")
    public WebElement includeIntakeBtn;
    @FindBy(xpath = "//span[normalize-space()='Build Report']")
    public WebElement buttonBuildReport;
    @FindBy(xpath = "//input[@id='selectAll']")
    public WebElement selectAllCheckBox;
    @FindBy(xpath = "//input[@id='0']")
    public WebElement todayBtn;
    @FindBy(xpath = "//button[normalize-space()='Preview']")
    public WebElement buttonPreview;
    @FindBy(xpath = "//input[@id='1']")
    public WebElement thisWeekBtn;
    @FindBy(xpath = "//input[@id='2']")
    public WebElement previousWeekBtn;
    @FindBy(xpath = "//input[@id='3']")
    public WebElement nextWeekBtn;
    @FindBy(xpath = "//input[@id='4']")
    public WebElement buttonThisMonth;
    @FindBy(xpath = "//input[@id='5']")
    public WebElement nextMonthBtn;


    public Appointment(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void doLogin(String email, String password) throws InterruptedException {
        firstLast.sendKeys(email);
        Thread.sleep(3000);
        buttonNext.click();
        Thread.sleep(3000);
        textPassword.sendKeys(password);
        Thread.sleep(3000);
    }
    public void doTimeChecking() throws InterruptedException {
        searchBox.sendKeys("Development and Testing");
        Thread.sleep(5000);
        developmentAndTestingBtn.click();
        Thread.sleep(8000);
        arrayTime.click();
        Thread.sleep(5000);
        alaksaStandardTimeBtn.click();
        Thread.sleep(3000);
        saveAndCloseBtn.click();
        Thread.sleep(50000);
    }
    public void doReset() throws InterruptedException {
        buildReportBtn.click();
        Thread.sleep(5000);
        thisMonthBtn.click();
        Thread.sleep(1000);
        previewBtn.click();
        Thread.sleep(8000);
        resetBtn.click();
        Thread.sleep(2000);
        closeBtn.click();
        Thread.sleep(4000);
        calendarViewBtn.click();
        Thread.sleep(4000);
    }
    public void downloadTodayReport(WebDriver driver) throws InterruptedException {
        buttonBuildReport.click();
        Thread.sleep(2000);
        selectAllCheckBox.click();
        Thread.sleep(1000);
        todayBtn.click();
        Thread.sleep(1000);
        checkBoxArrived.click();
        checkBoxCancelled.click();
        checkBoxAbandoned.click();
        checkBoxProposed.click();
        checkBoxPending.click();
        checkBoxCheckedIn.click();
        Thread.sleep(1000);
        Utils.scrollToElement(driver,buttonPreview);
        Thread.sleep(2000);
        checkBoxWaitlist.click();
        Thread.sleep(1000);
        checkBoxAborted.click();
        Thread.sleep(2000);
        buttonPreview.click();
        Thread.sleep(8000);
        btnDownloadPDF.click();
    }
    public void downloadThisWeekReport(WebDriver driver) throws InterruptedException {
        buttonBuildReport.click();
        Thread.sleep(2000);
        selectAllCheckBox.click();
        Thread.sleep(1000);
        thisWeekBtn.click();
        Thread.sleep(1000);
        checkBoxArrived.click();
        checkBoxCancelled.click();
        checkBoxAbandoned.click();
        checkBoxProposed.click();
        checkBoxPending.click();
        checkBoxCheckedIn.click();
        Thread.sleep(1000);
        Utils.scrollToElement(driver,buttonPreview);
        Thread.sleep(2000);
        checkBoxWaitlist.click();
        Thread.sleep(1000);
        checkBoxAborted.click();
        Thread.sleep(2000);
        buttonPreview.click();
        Thread.sleep(8000);
        btnDownloadPDF.click();
    }
    public void downloadPreviousWeekReport(WebDriver driver) throws InterruptedException {
        buttonBuildReport.click();
        Thread.sleep(2000);
        selectAllCheckBox.click();
        Thread.sleep(1000);
        previousWeekBtn.click();
        Thread.sleep(1000);
        checkBoxArrived.click();
        checkBoxCancelled.click();
        checkBoxAbandoned.click();
        checkBoxProposed.click();
        checkBoxPending.click();
        checkBoxCheckedIn.click();
        Thread.sleep(1000);
        Utils.scrollToElement(driver,buttonPreview);
        Thread.sleep(2000);
        checkBoxWaitlist.click();
        Thread.sleep(1000);
        checkBoxAborted.click();
        Thread.sleep(2000);
        buttonPreview.click();
        Thread.sleep(8000);
        btnDownloadPDF.click();
    }
    public void downloadNextWeekReport(WebDriver driver) throws InterruptedException {
        buttonBuildReport.click();
        Thread.sleep(2000);
        selectAllCheckBox.click();
        Thread.sleep(1000);
        nextWeekBtn.click();
        Thread.sleep(1000);
        checkBoxArrived.click();
        checkBoxCancelled.click();
        checkBoxAbandoned.click();
        checkBoxProposed.click();
        checkBoxPending.click();
        checkBoxCheckedIn.click();
        Thread.sleep(1000);
        Utils.scrollToElement(driver,buttonPreview);
        Thread.sleep(2000);
        checkBoxWaitlist.click();
        Thread.sleep(1000);
        checkBoxAborted.click();
        Thread.sleep(2000);
        buttonPreview.click();
        Thread.sleep(8000);
        btnDownloadPDF.click();
    }
    public void downloadThisMonthReport(WebDriver driver) throws InterruptedException {
        buttonBuildReport.click();
        Thread.sleep(2000);
        selectAllCheckBox.click();
        Thread.sleep(1000);
        thisMonthBtn.click();
        Thread.sleep(1000);
        checkBoxArrived.click();
        checkBoxCancelled.click();
        checkBoxAbandoned.click();
        checkBoxProposed.click();
        checkBoxPending.click();
        checkBoxCheckedIn.click();
        Thread.sleep(1000);
        Utils.scrollToElement(driver,buttonPreview);
        Thread.sleep(2000);
        checkBoxWaitlist.click();
        Thread.sleep(1000);
        checkBoxAborted.click();
        Thread.sleep(2000);
        buttonPreview.click();
        Thread.sleep(8000);
        btnDownloadPDF.click();
    }
    public void downloadNextMonthReport(WebDriver driver) throws InterruptedException {
        buttonBuildReport.click();
        Thread.sleep(2000);
        selectAllCheckBox.click();
        Thread.sleep(1000);
        nextMonthBtn.click();
        Thread.sleep(1000);
        checkBoxArrived.click();
        checkBoxCancelled.click();
        checkBoxAbandoned.click();
        checkBoxProposed.click();
        checkBoxPending.click();
        checkBoxCheckedIn.click();
        Thread.sleep(1000);
        Utils.scrollToElement(driver,buttonPreview);
        Thread.sleep(2000);
        checkBoxWaitlist.click();
        Thread.sleep(1000);
        checkBoxAborted.click();
        Thread.sleep(2000);
        buttonPreview.click();
        Thread.sleep(8000);
        btnDownloadPDF.click();
    }
    public void downloadPreviousMonthReport(WebDriver driver) throws InterruptedException {
        buttonBuildReport.click();
        Thread.sleep(2000);
        selectAllCheckBox.click();
        Thread.sleep(1000);
        previousMonthBtn.click();
        Thread.sleep(1000);
        checkBoxArrived.click();
        checkBoxCancelled.click();
        checkBoxAbandoned.click();
        checkBoxProposed.click();
        checkBoxPending.click();
        checkBoxCheckedIn.click();
        Thread.sleep(1000);
        Utils.scrollToElement(driver,buttonPreview);
        Thread.sleep(2000);
        checkBoxWaitlist.click();
        Thread.sleep(1000);
        checkBoxAborted.click();
        Thread.sleep(2000);
        buttonPreview.click();
        Thread.sleep(8000);
        btnDownloadPDF.click();
    }
    public void downloadQuarterMonthReport(WebDriver driver) throws InterruptedException {
        buttonBuildReport.click();
        Thread.sleep(2000);
        selectAllCheckBox.click();
        Thread.sleep(1000);
        thisQuarterBtn.click();
        Thread.sleep(1000);
        checkBoxArrived.click();
        checkBoxCancelled.click();
        checkBoxAbandoned.click();
        checkBoxProposed.click();
        checkBoxPending.click();
        checkBoxCheckedIn.click();
        Thread.sleep(1000);
        Utils.scrollToElement(driver,buttonPreview);
        Thread.sleep(2000);
        checkBoxWaitlist.click();
        Thread.sleep(1000);
        checkBoxAborted.click();
        Thread.sleep(2000);
        buttonPreview.click();
        Thread.sleep(8000);
        btnDownloadPDF.click();
    }
    public void downloadCustomdateRangeReport(WebDriver driver) throws InterruptedException {
        buttonBuildReport.click();
        Thread.sleep(6000);
        selectAllCheckBox.click();
        Thread.sleep(1000);
        checkBoxArrived.click();
        checkBoxCancelled.click();
        checkBoxAbandoned.click();
        checkBoxProposed.click();
        checkBoxPending.click();
        checkBoxCheckedIn.click();
        Utils.scrollToElement(driver, buttonPreview);
        Thread.sleep(2000);
        checkBoxWaitlist.click();
        Thread.sleep(1000);
        checkBoxAborted.click();
        Thread.sleep(2000);
        customDateRangeBtn.click();
        Thread.sleep(3000);
        buttonPreview.click();
        Thread.sleep(7000);
        btnDownloadPDF.click();
    }
    public  void downloadTodayExcelReport(WebDriver driver) throws InterruptedException {
        buttonBuildReport.click();
        Thread.sleep(6000);
        selectAllCheckBox.click();
        Thread.sleep(1000);
        checkBoxArrived.click();
        checkBoxCancelled.click();
        checkBoxAbandoned.click();
        checkBoxProposed.click();
        checkBoxPending.click();
        checkBoxCheckedIn.click();
        Utils.scrollToElement(driver,buttonPreview);
        Thread.sleep(2000);
        checkBoxWaitlist.click();
        Thread.sleep(1000);
        checkBoxAborted.click();
        Thread.sleep(2000);
        todayBtn.click();
        Thread.sleep(2000);
        buttonPreview.click();
        Thread.sleep(10000);
        btnDownloadExcel.click();
        Thread.sleep(2000);

    }
    public  void downloadThisWeekExcelReport(WebDriver driver) throws InterruptedException {
        buttonBuildReport.click();
        Thread.sleep(6000);
        selectAllCheckBox.click();
        Thread.sleep(1000);
        checkBoxArrived.click();
        checkBoxCancelled.click();
        checkBoxAbandoned.click();
        checkBoxProposed.click();
        checkBoxPending.click();
        checkBoxCheckedIn.click();
        Utils.scrollToElement(driver,buttonPreview);
        Thread.sleep(2000);
        checkBoxWaitlist.click();
        Thread.sleep(1000);
        checkBoxAborted.click();
        Thread.sleep(2000);
        thisWeekBtn.click();
        Thread.sleep(2000);
        buttonPreview.click();
        Thread.sleep(10000);
        btnDownloadExcel.click();
        Thread.sleep(2000);

    }
    public  void downloadThisPreviousExcelReport(WebDriver driver) throws InterruptedException {
        buttonBuildReport.click();
        Thread.sleep(6000);
        selectAllCheckBox.click();
        Thread.sleep(1000);
        checkBoxArrived.click();
        checkBoxCancelled.click();
        checkBoxAbandoned.click();
        checkBoxProposed.click();
        checkBoxPending.click();
        checkBoxCheckedIn.click();
        Utils.scrollToElement(driver,buttonPreview);
        Thread.sleep(2000);
        checkBoxWaitlist.click();
        Thread.sleep(1000);
        checkBoxAborted.click();
        Thread.sleep(2000);
        previousWeekBtn.click();
        Thread.sleep(2000);
        buttonPreview.click();
        Thread.sleep(10000);
        btnDownloadExcel.click();
        Thread.sleep(2000);

    }
    public  void downloadThisNextWeekExcelReport(WebDriver driver) throws InterruptedException {
        buttonBuildReport.click();
        Thread.sleep(6000);
        selectAllCheckBox.click();
        Thread.sleep(1000);
        checkBoxArrived.click();
        checkBoxCancelled.click();
        checkBoxAbandoned.click();
        checkBoxProposed.click();
        checkBoxPending.click();
        checkBoxCheckedIn.click();
        Utils.scrollToElement(driver,buttonPreview);
        Thread.sleep(2000);
        checkBoxWaitlist.click();
        Thread.sleep(1000);
        checkBoxAborted.click();
        Thread.sleep(2000);
        nextWeekBtn.click();
        Thread.sleep(2000);
        buttonPreview.click();
        Thread.sleep(10000);
        btnDownloadExcel.click();
        Thread.sleep(2000);

    }
    public  void downloadThisMonthExcelReport(WebDriver driver) throws InterruptedException {
        buttonBuildReport.click();
        Thread.sleep(6000);
        selectAllCheckBox.click();
        Thread.sleep(1000);
        checkBoxArrived.click();
        checkBoxCancelled.click();
        checkBoxAbandoned.click();
        checkBoxProposed.click();
        checkBoxPending.click();
        checkBoxCheckedIn.click();
        Utils.scrollToElement(driver,buttonPreview);
        Thread.sleep(2000);
        checkBoxWaitlist.click();
        Thread.sleep(1000);
        checkBoxAborted.click();
        Thread.sleep(2000);
        thisMonthBtn.click();
        Thread.sleep(2000);
        buttonPreview.click();
        Thread.sleep(10000);
        btnDownloadExcel.click();
        Thread.sleep(2000);

    }
    public  void downloadPreviousMonthExcelReport(WebDriver driver) throws InterruptedException {
        buttonBuildReport.click();
        Thread.sleep(6000);
        selectAllCheckBox.click();
        Thread.sleep(1000);
        checkBoxArrived.click();
        checkBoxCancelled.click();
        checkBoxAbandoned.click();
        checkBoxProposed.click();
        checkBoxPending.click();
        checkBoxCheckedIn.click();
        Utils.scrollToElement(driver,buttonPreview);
        Thread.sleep(2000);
        checkBoxWaitlist.click();
        Thread.sleep(1000);
        checkBoxAborted.click();
        Thread.sleep(2000);
        previousMonthBtn.click();
        Thread.sleep(2000);
        buttonPreview.click();
        Thread.sleep(10000);
        btnDownloadExcel.click();
        Thread.sleep(2000);

    }
    public  void downloadThisQuarterExcelReport(WebDriver driver) throws InterruptedException {
        buttonBuildReport.click();
        Thread.sleep(6000);
        selectAllCheckBox.click();
        Thread.sleep(1000);
        checkBoxArrived.click();
        checkBoxCancelled.click();
        checkBoxAbandoned.click();
        checkBoxProposed.click();
        checkBoxPending.click();
        checkBoxCheckedIn.click();
        Utils.scrollToElement(driver,buttonPreview);
        Thread.sleep(2000);
        checkBoxWaitlist.click();
        Thread.sleep(1000);
        checkBoxAborted.click();
        Thread.sleep(2000);
        thisQuarterBtn.click();
        Thread.sleep(2000);
        buttonPreview.click();
        Thread.sleep(10000);
        btnDownloadExcel.click();
        Thread.sleep(2000);

    }
    public  void downloadNextMonthExcelReport(WebDriver driver) throws InterruptedException {
        buttonBuildReport.click();
        Thread.sleep(6000);
        selectAllCheckBox.click();
        Thread.sleep(1000);
        checkBoxArrived.click();
        checkBoxCancelled.click();
        checkBoxAbandoned.click();
        checkBoxProposed.click();
        checkBoxPending.click();
        checkBoxCheckedIn.click();
        Utils.scrollToElement(driver,buttonPreview);
        Thread.sleep(2000);
        checkBoxWaitlist.click();
        Thread.sleep(1000);
        checkBoxAborted.click();
        Thread.sleep(2000);
        nextMonthBtn.click();
        Thread.sleep(2000);
        buttonPreview.click();
        Thread.sleep(10000);
        btnDownloadExcel.click();
        Thread.sleep(2000);

    }
}
