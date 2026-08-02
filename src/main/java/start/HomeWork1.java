package start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomeWork1 {
    WebDriver driver = new ChromeDriver();

    @Test
    public void phoneBookTests() {
        driver.get("https://telranedu.web.app/home");
        driver.manage().window().maximize();
        pause(2000);
        WebElement el1Home = driver.findElement
                (By.cssSelector("[aria-current='page']"));
        el1Home.click();
        pause(2000);
        WebElement el2About = driver.findElement
                (By.cssSelector("a[href='/about']"));
        el2About.click();
        pause(2000);
        WebElement el3About = driver.findElement
                (By.cssSelector("[class*='about_main']"));
        System.out.println(el3About.getTagName());
        WebElement el4Home = driver.findElement
                (By.cssSelector("a[href='/home']"));
        el4Home.click();
        pause(2000);
        WebElement el5Root = driver.findElement
                (By.cssSelector("*[id='root']"));
        el5Root.click();
        pause(2000);
        WebElement el6Root = driver.findElement
                (By.cssSelector("div#root.container"));
        System.out.println(el6Root.getTagName());
        WebElement el7Login = driver.findElement
                (By.cssSelector("[class='active']"));
        System.out.println(el7Login.getAttribute("class"));
        WebElement el8Login = driver.findElement
                (By.cssSelector("div a[href='/login']"));
        el8Login.click();
        WebElement el9Text = driver.findElement
                (By.linkText("HOME"));
        System.out.println(el9Text.getTagName());
        System.out.println(el9Text.getText());
        System.out.println(el9Text.getAttribute("href"));
        WebElement el10Logo = driver.findElement
                (By.tagName("div"));
        System.out.println(el10Logo.getTagName());

        driver.quit();
    }
    @Test
    public void ilCarroTest() {
        driver.get("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        pause(2000);
        WebElement element1Body = driver.findElement
                (By.cssSelector("app-navigator"));
        element1Body.click();
        pause(2000);
        WebElement element2Search = driver.findElement
                (By.cssSelector("[href='/search']"));
        element2Search.click();
        pause(2000);
        WebElement element3CarWork = driver.findElement
                (By.cssSelector("[ng-reflect-router-link='let-car-work']"));
        element3CarWork.click();
        pause(2000);
        WebElement element4TermsUse = driver.findElement
                (By.partialLinkText("Terms of use"));
        element4TermsUse.click();
        pause(2000);
        WebElement element5SingUp = driver.findElement
                (By.cssSelector("[ng-reflect-router-link='registration']"));
        System.out.println(element5SingUp.getTagName());
        driver.navigate().back();
        pause(2000);
        WebElement element6Log = driver.findElement
                (By.cssSelector("[href^='/login']"));
        System.out.println(element6Log.getAttribute("href"));
        pause(2000);
        WebElement element7Login = driver.findElement
                (By.cssSelector("[href^='/registration']"));
        System.out.println(element7Login.getTagName());
        driver.navigate().back();
        pause(2000);
        WebElement element8CarNow = driver.findElement
                (By.cssSelector("button[type='submit']"));
        element8CarNow.click();
        pause(2000);
        WebElement element9ButtonSubmit = driver.findElement
                (By.cssSelector("[type='submit']"));
        System.out.println(element9ButtonSubmit.getTagName());
        WebElement element10 = driver.findElement
                (By.cssSelector(".hide-div"));
        System.out.println(element10.getAttribute("class"));







        driver.quit();
    }
    public void  pause(int taim) {
        try {
            Thread.sleep(taim);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

