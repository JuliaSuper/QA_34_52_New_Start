package start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeWork2 {
    WebDriver driver = new ChromeDriver();

    @Test
    public void ilCarroXPathTest() {
        driver.get("https://ilcarro.web.app/registration?url=%2Fsearch");
        driver.manage().window().maximize();
        pause(3000);
        WebElement btnLetCarWork = driver.findElement
                (By.xpath("//div/a[@href='/let-car-work']"));
        btnLetCarWork.click();
        pause(3000);
        WebElement inputLocation = driver.findElement
                (By.xpath("//form/div[1]/input"));
        inputLocation.sendKeys("London,Downing Street, 10");
        pause(3000);
        // для закрытия кнопки Google Maps
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try {
            WebElement okButton = wait.until(
                    ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='OK']"))
            );
            okButton.click();
        } catch (Exception e){}
        WebElement inputCarManufacture = driver.findElement
                (By.xpath("//*[@formcontrolname=\"make\"]"));
//                (By.xpath("//*[text()='Manufacture']")); - это не сработало
        inputCarManufacture.sendKeys("Toyota");
        // //*[@formcontrolname="model"]
        WebElement btnSinqUp = driver.findElement
                (By.xpath("//*[text()=' Sign up ']"));
        btnSinqUp.click();
        WebElement inputName = driver.findElement
                (By.xpath("//*[@id='name']"));
        inputName.sendKeys("Juli");
        WebElement inputLastName = driver.findElement
                (By.xpath("//form/div[2]/input[1]"));
        inputLastName.sendKeys("Fox");
        WebElement inputEmail = driver.findElement
                (By.xpath("//form/div[3]/input[1]"));
        inputEmail.sendKeys("juli2026@gmail.com");
        WebElement inputPassword = driver.findElement
                (By.xpath("//*[contains(text(),'Password')]/../input"));
        inputPassword.sendKeys("J123a6S$");
        WebElement checkbox = driver.findElement
                (By.xpath("//form/div[5]//input"));
        System.out.println(checkbox.getTagName());
        WebElement btnYalla = driver.findElement
                (By.xpath("//*[text()=\'Y’alla!\']"));
        System.out.println(btnYalla.getTagName());
        pause(3000);
        pause(3000);
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
