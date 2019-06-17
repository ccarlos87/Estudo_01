package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class inicioPage extends BasePage {

	public inicioPage(WebDriver navegador) {
		super(navegador);
	}

	public escolhaContaPage cliqueLogin() {
		navegador.findElement(By.linkText("Fazer login")).click();
		return new escolhaContaPage(navegador);
	}

}
