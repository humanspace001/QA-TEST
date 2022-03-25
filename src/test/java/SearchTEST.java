import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Arrays;
import java.util.Collections;

public class SearchTEST {


    @Test
    public void testSearch() {
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
        searchBox.sendKeys("Купить кофемашину bork c804");
        // the result is more than 10
        searchBox.submit();
}

    private void setDefaultCapabilities(DesiredCapabilities capabilities) {
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("browser_version", "80.0");
        capabilities.setCapability("os", "Windows");
        capabilities.setCapability("os_version", "11");
        capabilities.setCapability("resolution", "1280x1024");
        capabilities.setCapability("browserstack.debug", "true");
        capabilities.setCapability("build", "First build");
        capabilities.setCapability("name", "First test");
    }
}
