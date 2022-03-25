import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestQa {

    @Test
    public void testQa() {

        System.setProperty("webdriver.chrome.driver", "C:\\QA\\chromedriver.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        ChromeOptions options = new ChromeOptions();
        setDefaultCapabilities(capabilities);
        capabilities.setCapability("chrome.switches", Collections.singletonList("--ignore-certificate-errors"));
        options.addArguments(Arrays.asList("allow-running-insecure-content", "ignore-certificate-errors"));
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);



        WebDriver driver = new ChromeDriver(capabilities);
        driver.manage().window().maximize();
driver.get("https://www.google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("yandex mail ");
        searchBox.sendKeys(Keys.ENTER);
        WebElement element = driver.findElement(By.xpath("//a[@href=\"https://mail.yandex.ru/\"]")); // поиск элемента
        element.click();
        WebElement element1 = driver.findElement(By.xpath("//a[@href=\"https://passport.yandex.ru/registration/mail?from=mail&require_hint=1&origin=hostroot_homer_reg_ru&retpath=https%3A%2F%2Fmail.yandex.ru%2F&backpath=https%3A%2F%2Fmail.yandex.ru%3Fnoretpath%3D1\"]"));
        element1.click();
        //registration
        WebElement element2 = driver.findElement(By.xpath("//input[@id=\"firstname\"]"));
        element2.sendKeys("test");
        WebElement element3 = driver.findElement(By.xpath("//input[@data-t=\"field:input-lastname\"]"));
        element3.sendKeys("test");
        WebElement element4 = driver.findElement(By.xpath("//input[@data-t=\"field:input-login\"]"));
        element4.sendKeys("t3st.testtest123");
        WebElement element5 = driver.findElement(By.xpath("//input[@autocomplete=\"new-password\"]"));
        element5.sendKeys("maks13@S123");
        WebElement element6 = driver.findElement(By.xpath("//input[@class=\"Textinput-Control\"]"));
        element6.sendKeys("maks13@S123");
        WebElement element7 = driver.findElement(By.xpath("//input[@data-t=\"field:input-phone\"]"));
        element7.sendKeys("+996550503036");
        WebElement element8 = driver.findElement(By.xpath("//button[@data-t=\"button:action\"]"));
        element8.click();


    }






    public void setDefaultCapabilities(DesiredCapabilities defaultCapabilities) {
    }

}

