package Pages;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;


public class Main {

    WebDriver driver;
    public  Main(WebDriver driver){
        this.driver=driver;
       PageFactory.initElements(driver,this);
    }

    @FindBy(css="main [id]") private List<WebElement> cards;
    @FindBy(css = "main [id] h1") private List<WebElement> titles;
    @FindBy(css = "main [id] p") private List<WebElement> hints;


    public void checking() throws InterruptedException {
        Thread.sleep(1000);
        ArrayList expectedList = new ArrayList();
        expectedList.add("Create Group");
        expectedList.add("Manage Groups");
        expectedList.add("Partners");
        expectedList.add("Chat Center");
        expectedList.add("Calendar Notes");
        expectedList.add("Special Offers");
        expectedList.add("Search Hotels");
        expectedList.add("Create new request for a travel group");
        expectedList.add("Access to the details of your active groups");
        expectedList.add("Access to your contact details");
        expectedList.add("Stay in contact with your partners");
        expectedList.add("View your groups schedule and pin your daily tasks");
        expectedList.add("View your groups schedule and pin your daily tasks");
        expectedList.add("Search and compare offers from hotels");
        ArrayList result = new ArrayList();
        for (WebElement we :titles) {
            result.add(we.getText());
        }
        for (WebElement we :hints) {
            result.add(we.getText());
        }
        Assert.assertEquals(7,cards.size());
        System.out.println(expectedList);
        System.out.println(result);
        Assert.assertEquals(expectedList, result);
        }


}



