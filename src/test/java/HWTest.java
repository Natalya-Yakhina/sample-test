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

public class HWTest extends TestBase {
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
}
