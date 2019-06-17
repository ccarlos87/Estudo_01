package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class informaSenhaPage extends BasePage {

	public informaSenhaPage(WebDriver navegador) {
		super(navegador);
	}

	public inicioPage informaSenha() throws InterruptedException {
		Thread.sleep(2000);
		navegador.findElement(By.xpath("//input[@type='password']")).sendKeys("**pampo2!@");
		Thread.sleep(2000);
		navegador.findElement(By.xpath("//span[@class='RveJvd snByac' and text()='Próxima']")).click();
		Thread.sleep(2000);
		return new inicioPage(navegador);
	}

}
