package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Initial {

    WebDriver driver;
    public  Initial(WebDriver driver){
        this.driver=driver;
    }

    private By signUpInString = By.cssSelector("a[href='/welcome/sign-in']");

    public void toSignPage(){
        WebElement signStr = driver.findElement(signUpInString);
        signStr.click();
    }
}
