package pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://angular.realworld.io/")
public class LoginPage extends PageObject {

    By BTN_LOGIN = By.xpath("/html/body/app-root/app-layout-header/nav/div/ul/li[2]/a");
    By TXT_USERNAME = By.xpath("//input[@placeholder='Email']");
    By TXT_PASSWORD = By.xpath("//input[@formcontrolname='password']");
    By BTN_SIGNIN = By.xpath("//button[@class='btn btn-lg btn-primary pull-xs-right']");
    By LBL_COMPARE_NAME = By.xpath("//*[text()=' mauricio ']");

    public By getLBL_COMPARE_NAME() {
        return LBL_COMPARE_NAME;
    }

    public void setLBL_COMPARE_NAME(By LBL_COMPARE_NAME) {
        this.LBL_COMPARE_NAME = LBL_COMPARE_NAME;
    }

    public By getBTN_LOGIN() {
        return BTN_LOGIN;
    }

    public void setBTN_LOGIN(By BTN_LOGIN) {
        this.BTN_LOGIN = BTN_LOGIN;
    }

    public By getTXT_USERNAME() {
        return TXT_USERNAME;
    }

    public void setTXT_USERNAME(By TXT_USERNAME) {
        this.TXT_USERNAME = TXT_USERNAME;
    }

    public By getTXT_PASSWORD() {
        return TXT_PASSWORD;
    }

    public void setTXT_PASSWORD(By TXT_PASSWORD) {
        this.TXT_PASSWORD = TXT_PASSWORD;
    }

    public By getBTN_SIGNIN() {
        return BTN_SIGNIN;
    }

    public void setBTN_SIGNIN(By BTN_SIGNIN) {
        this.BTN_SIGNIN = BTN_SIGNIN;
    }
}
