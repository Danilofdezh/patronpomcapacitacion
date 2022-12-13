package steps;

import io.vavr.control.Try;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import pageobjects.LoginPage;

public class LoginStep {
    LoginPage loginPage = new LoginPage();

    @Step
    public void openBrowser()
    {
        loginPage.open();
    }
    @Step
    public void clickLogin()
    {
        loginPage.getDriver().findElement(loginPage.getBTN_LOGIN()).click();
    }
    @Step
    public void enterCredentials() throws InterruptedException {
        loginPage.getDriver().findElement(loginPage.getTXT_USERNAME()).sendKeys("maob14@yopmail.com");
        try{ Thread.sleep(3000); } catch (InterruptedException e){ e.printStackTrace(); }
        loginPage.getDriver().findElement(loginPage.getTXT_PASSWORD()).sendKeys("1234");
        try{ Thread.sleep(3000); } catch (InterruptedException e){ e.printStackTrace(); }
    }
    @Step
    public void clickSignIn()
    {
        loginPage.getDriver().findElement(loginPage.getBTN_SIGNIN()).click();
        try{ Thread.sleep(3000); } catch (InterruptedException e){ e.printStackTrace(); }
    }

    @Step
    public void compareName(){
        Assert.assertThat(loginPage.getDriver().findElement(loginPage.getLBL_COMPARE_NAME())
                .isDisplayed(), Matchers.is(true));
    }


}
