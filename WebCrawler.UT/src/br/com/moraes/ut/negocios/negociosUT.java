package br.com.moraes.ut.negocios;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.com.moraes.negocios.*;

/*
 * 1. Vincular projeto para o qual quer testar
 * 2. Adicionar o jar do JUnit
 * */

public class negociosUT 
{

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test // Criar método de teste com base no nome do método a ser testado
	public void WebPageLoadFromWeb() 
	{
		// Definindo código Hash e URL 
		Domain domain = new Domain ("192004-2015", "http://www.jsoup.org/");
		Anchor anchor = new Anchor(domain, "192004-2015", "http://www.jsoup.org/");
		WebPage webPage = new WebPage(anchor);
		webPage.loadDocumentFromWeb();
		
		// Teste que retorna informações se houver falha
		assertTrue("Resultado do teste", webPage.getDocument() != null); // Passou no teste
	}

}
