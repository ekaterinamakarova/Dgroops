package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Main {

    WebDriver driver;
    public  Main(WebDriver driver){
        this.driver=driver;
    }

    private By card = By.cssSelector("a[class='jss193'] ");
    private By headline = By.cssSelector("h1[class='jss147 jss152 jss201']");
    private By hint=By.cssSelector("p[class='jss147 jss156 jss171 jss1291']");


    public void checking(){
        List<WebElement> cards = driver.findElements(card);
        Assert.assertEquals("7", cards.size());
        List<WebElement> titles = driver.findElements(headline);
        Assert.assertEquals("7",titles.size());
        Assert.assertEquals("Create Group",titles.get(0).getText());
        Assert.assertEquals("Manage Groups",titles.get(1).getText());
        Assert.assertEquals("Partners",titles.get(2).getText());
        Assert.assertEquals("Chat Center",titles.get(3).getText());
        Assert.assertEquals("Calendar Notes",titles.get(4).getText());
        Assert.assertEquals("Special Offers",titles.get(5).getText());
        Assert.assertEquals("Search",titles.get(6).getText());
        List<WebElement> hints = driver.findElements(hint);
        Assert.assertEquals("7", hints.size() );
        Assert.assertEquals("Create new request for a travel group",hints.get(0).getText());
        Assert.assertEquals("Access to the details of your active groups",hints.get(1).getText());
        Assert.assertEquals("Access to your contact details",hints.get(2).getText());
        Assert.assertEquals("Stay in contact with your partners",hints.get(3).getText());
        Assert.assertEquals("View your groups schedule and pin your daily tasks",hints.get(4).getText());
        Assert.assertEquals("View your groups schedule and pin your daily tasks",hints.get(5).getText());
        Assert.assertEquals("Search and compare offers from hotels",hints.get(6).getText());
        }
    }


