import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class fourth extends base {
	public static void main(String[] args) throws MalformedURLException {
		
	AndroidDriver<AndroidElement> driver = capabilities();
	
	/*Pada test ini yaitu mengharapkan dapat berjalan sesuai keinginan jika ingin menginput lebih dari sekali atau terjadinya dua kali operasi
	 */
	
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
	
	//Memilih operasi delete
	driver.findElementById("com.example.kalkulator:id/button5").click();
	
	//Klik pada "First Number"
	driver.findElementById("com.example.kalkulator:id/text").click();
		
	//Mengisi input angka pertama
	driver.findElementById("com.example.kalkulator:id/text").sendKeys("2");
		
	//Klik pada "Second Number"
	driver.findElementById("com.example.kalkulator:id/text1").click();
		
	//Mengisi input angka kedua
	driver.findElementById("com.example.kalkulator:id/text1").sendKeys("5");
		
	//Memilih salah satu operasi
	driver.findElementById("com.example.kalkulator:id/button2").click();
	
}
}
