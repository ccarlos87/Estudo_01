package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage extends BasePage {

	public loginPage(WebDriver navegador) {
		super(navegador);
	}

	public escolhaContaPage escolhaOutraConta() {
		navegador.findElement(By.xpath("//div[@class='BHzsHc' and text()='Usar outra conta']")).click();

		return new escolhaContaPage(navegador);
	}

}
