import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class secondscen extends base {
public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = capabilities();
		
		/*Pada test ini yaitu mengharapkan akan terjadi error saat hanya mengisi salah satu input
		 */
		
		//Klik pada "First Number"
		driver.findElementById("com.example.kalkulator:id/text").click();
		
		//Mengosongkan inputan "First Number"
		driver.findElementById("com.example.kalkulator:id/text").sendKeys("");
		
		//Klik pada "Second Number"
		driver.findElementById("com.example.kalkulator:id/text1").click();
		
		//Mengisi input angka kedua
		driver.findElementById("com.example.kalkulator:id/text1").sendKeys("5");
		
		//Memilih salah satu operasi
		driver.findElementById("com.example.kalkulator:id/button").click();

	}
}
