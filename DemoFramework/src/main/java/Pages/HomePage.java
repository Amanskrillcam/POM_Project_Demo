package Pages;

import Basepackage.BaseTest;
import Interface.HomePageInterface;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.TestUtilClass;

import java.time.Duration;


public class HomePage extends BaseTest implements HomePageInterface
{
    @FindBy(id = "menu_admin_viewAdminModule")
    WebElement admin;
    @FindBy(id = "menu_pim_viewPimModule")
    WebElement pim;
    @FindBy(id = "menu_leave_viewLeaveModule")
    WebElement leave;
    @FindBy(id = "menu_time_viewTimeModule")
    WebElement time;
    @FindBy(id = "menu_recruitment_viewRecruitmentModule")
    WebElement recruitment;
    @FindBy(id = "menu_pim_viewMyDetails")
    WebElement myinfo;
    @FindBy(id = "menu__Performance")
    WebElement performance;
    @FindBy(id = "menu_dashboard_index")
    WebElement dashboard;
    @FindBy(id = "menu_directory_viewDirectory")
    WebElement directory;
    @FindBy(id = "menu_maintenance_purgeEmployee")
    WebElement maintenance;
    @FindBy(id = "menu_buzz_viewBuzz")
    WebElement buzz;
    @FindBy(partialLinkText = "Welcome")
    WebElement Welcomebtn;
    @FindBy(partialLinkText = "Logout")
    WebElement logoutbtn;
    public HomePage()
    {
        PageFactory.initElements(driver,this);
    }

    public void validateAdminModule()
    {
        admin.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(TestUtilClass.IMPLI_WAIT));
    }
    public void validatePim()
    {
        pim.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(TestUtilClass.IMPLI_WAIT));
    }
    public void validateLeave ()
    {
        leave.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(TestUtilClass.IMPLI_WAIT));
    }
    public void validateTime ()
    {
        time.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(TestUtilClass.IMPLI_WAIT));
    }
    public void validateRecruitment ()
    {
        recruitment.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(TestUtilClass.IMPLI_WAIT));
    }
    public void validateMyinfo ()
    {
        myinfo.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(TestUtilClass.IMPLI_WAIT));
    }
    public void validatePerformance ()
    {
        performance.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(TestUtilClass.IMPLI_WAIT));
    }
    public void validateDashboard ()
    {
        dashboard.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(TestUtilClass.IMPLI_WAIT));
    }
    public void validateDirectory ()
    {
        directory.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(TestUtilClass.IMPLI_WAIT));
    }
    public void validateMaintenance ()
    {
        maintenance.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(TestUtilClass.IMPLI_WAIT));
    }
    public void validateBuzz ()
    {
        buzz.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(TestUtilClass.IMPLI_WAIT));
    }

    public void logout()
    {
        Welcomebtn.click();
        logoutbtn.click();
    }

}
