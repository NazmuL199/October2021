
package pageObject;

import base.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Profile_page extends Setup {

    public Profile_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        Setup.driver = driver;

    }

    // locators
    @FindBy(how = How.XPATH, using = "//*[@id=\"profile_form\"]/legend")
    public WebElement welcomeMsg;




    // Function
    public void actualmsg() {
        String exp = "Welcome to TalentTek";
        String act = welcomeMsg.getText();

        Assert.assertEquals(act, exp);


    }







}