import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;

import java.net.MalformedURLException;

public class TestBase {
    public AndroidDriver driver; // объявляем драйвер, позволяет общаться с устройством
    public DriverFactory driverFactory = new DriverFactory();

    @Before
    public void setDriver() throws MalformedURLException {

        driver = driverFactory.setUp();

    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
