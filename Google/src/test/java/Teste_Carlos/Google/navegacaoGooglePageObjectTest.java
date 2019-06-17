package Teste_Carlos.Google;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import Pages.inicioPage;
import Pages.pesquisaPage;
import suporte.Web;

public class navegacaoGooglePageObjectTest {

	private WebDriver navegador;

	@Before
	public void setUp() {
		navegador = Web.createChrome();

	}

	@Test
	public void loginGoogle() throws InterruptedException {
		new inicioPage(navegador)
			.cliqueLogin()
			.informaLogin()
			.informaSenha();
	}
	
	@Test
	public void resultadoDaPesquisa() {
		new pesquisaPage(navegador)
		.pesquisaImagem();
	}
	
	
	
	@After
	public void tearDown() {
//		navegador.quit();
	}
}
