import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
public class firstscen extends base{
	
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = capabilities();
		
		//Klik pada "First Number"
		driver.findElementById("com.example.kalkulator:id/text").click();
		
		//Mengisi input angka pertama
		driver.findElementById("com.example.kalkulator:id/text").sendKeys("5");
		
		//Klik pada "Second Number"
		driver.findElementById("com.example.kalkulator:id/text1").click();
		
		//Mengisi input angka kedua
		driver.findElementById("com.example.kalkulator:id/text1").sendKeys("5");
		
		//Memilih salah satu operasi
		driver.findElementById("com.example.kalkulator:id/button").click();
		
	}

}
