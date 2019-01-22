package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {

    WebDriver driver;
    public  SignIn(WebDriver driver){
        this.driver=driver;
    }

    private By emailField = By.cssSelector("input[name='email']");
    private By passwordField = By.cssSelector("input[name='password']");
    private By singInButton = By.cssSelector("button[type='submit']");

    public void signin(String mail, String pass){
        WebElement email = driver.findElement(emailField);
        email.sendKeys(mail);
        WebElement password = driver.findElement(passwordField);
        password.sendKeys(pass);
        WebElement signIn = driver.findElement(singInButton);
        signIn.click();
    }
}
