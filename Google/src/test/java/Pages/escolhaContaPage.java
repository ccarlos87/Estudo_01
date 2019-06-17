package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class escolhaContaPage extends BasePage {

	
	/*
	 * Essa page/método não funcionam na automação deste projeto devido rodar em anonimo
	 */
	
	
	public escolhaContaPage(WebDriver navegador) {
		super(navegador);
	}

	public informaSenhaPage informaLogin() {
		navegador.findElement(By.id("identifierId")).sendKeys("fredd19");
		navegador.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		return new informaSenhaPage(navegador);
	}

}
