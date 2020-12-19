package docker_grid;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class DockerStartStop 
{
    /**
     * Rigorous Test :-)
     * @throws IOException 
     * @throws InterruptedException 
     */
    @BeforeTest
    public void startDocker() throws IOException, InterruptedException
    {
    	Runtime.getRuntime().exec("cmd /c start docker_start.bat");
    	Thread.sleep(20000);
    }
    
    @AfterTest
    public void stopDocker() throws IOException, InterruptedException
    {
    	Runtime.getRuntime().exec("cmd /c start docker_stop.bat");
    	Thread.sleep(10000);
    	Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
    }
}
                