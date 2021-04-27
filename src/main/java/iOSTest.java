import io.appium.java_client.ios.IOSDriver;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;

/**
 * Created by Khwanchanok D. 21/04/2021 AD.
 */

public class iOSTest {
    IOSDriver iosDriver;
    @Before
    public void setup() throws MalformedURLException{
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium-version","1.19.1");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "9.3");
        capabilities.setCapability("deviceName", "iPhone 6");
        capabilities.setCapability("app", "/Users/develop/Desktop/busdiv1/BusDi/ios/build/Build/Products/Debug-iphonesimulator/BusDi.app");
        iosDriver =new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
    }
}
