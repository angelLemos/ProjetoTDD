package br.com.rsinet.hub_tdd.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TelaInicialPage {

	private WebDriver driver;
	private JavascriptExecutor js;

	@FindBy(how = How.ID, using = "menuUserLink")
	private WebElement lnkUser;

	@FindBy(how = How.LINK_TEXT, using = "CREATE NEW ACCOUNT")
	private WebElement lnkCriarNovaConta;

	@FindBy(how = How.ID, using = "miceTxt")
	private WebElement txtPesquisarProdutoTela;
	
	@FindBy(how = How.ID, using = "details_10")
	private WebElement txtSelecionaProdutoDaTela;

	@FindBy(how = How.ID, using = "menuSearch")
	private WebElement lnkClicarLupa;
	
	@FindBy(how = How.ID, using = "autoComplete")
	private WebElement txtInserirNomeProduto;

	public TelaInicialPage(WebDriver driver) {
		this.driver = driver;
	}
	

	public void clicarEmMenuUsuario() {
		lnkUser.click();
	}

	public void ClicarEmCriarNovaConta() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", lnkCriarNovaConta);
      
	}
	
	public void ClicaEmNotebookTelaInicial() {
		// clica em notebook da tela inicial, para verificar abertura de outro produto
		txtSelecionaProdutoDaTela.click();
	}

	public void ClicarProdutoTelaInicial() {
		// Seleciona o produto na tela incial
		txtPesquisarProdutoTela.click();
	}
	
	public void clicarNaLupa() throws InterruptedException {
		lnkClicarLupa.click();
	}

	public void inserirProduto(String nomeProduto) {
		txtInserirNomeProduto.sendKeys(nomeProduto);
		txtInserirNomeProduto.sendKeys(Keys.RETURN);

	}

}
