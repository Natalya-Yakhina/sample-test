import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverFactory {
    private AndroidDriver driver; // объявляем драйвер, позволяет общаться с устройством

    public AndroidDriver setUp() throws MalformedURLException { // объявляем настройки драйвера
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("ensureWebviewsHavePages", true);

        URL remoteUrl = new URL("http://localhost:4723/wd/hub"); // где находиться аппиум

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
    }
}
