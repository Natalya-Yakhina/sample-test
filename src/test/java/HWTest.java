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

public class HWTest {

    private AndroidDriver driver; // объявляем драйвер, позволяет общаться с устройством

    @Before
    public void setUp() throws MalformedURLException { // объявляем настройки драйвера
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("ensureWebviewsHavePages", true);

        URL remoteUrl = new URL("http://localhost:4723/wd/hub"); // где находиться аппиум

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void sampleTest() {
        MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.Button[2]");
        el1.click();
        // написать проверку предварительно определив ID кнопки "Закрыть"
        MobileElement closeButton = (MobileElement) driver.findElementById("com.anydog.t2m.test:id/btnSubmit");
        closeButton.isDisplayed();
        // перед запуском привести приложение в исходное для теста состояние
        closeButton.click();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
