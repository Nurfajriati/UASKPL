import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class third extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();
		
		/*Pada test ini yaitu mengharapkan dapat menghapus inputan
		 */
		
		//Klik pada "First Number"
		driver.findElementById("com.example.kalkulator:id/text").click();
		
		//Mengisi input
		driver.findElementById("com.example.kalkulator:id/text").sendKeys("10");
		
		//Klik pada "Second Number"
		driver.findElementById("com.example.kalkulator:id/text1").click();
		
		//Mengisi input angka kedua
		driver.findElementById("com.example.kalkulator:id/text1").sendKeys("5");
		
		//Menghapus inputan
		driver.findElementById("com.example.kalkulator:id/button5").click();

	}

}
