package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class pesquisaPage extends BasePage {
	public pesquisaPage(WebDriver navegador) {
		super(navegador);
	}

	public pesquisaPage pesquisaImagem() {
		navegador.findElement(By.xpath("//input[@id='fakebox-input']")).sendKeys("Brasil" + Keys.ENTER);
		return new resultadoPesquisaPage(navegador);

	}

}
