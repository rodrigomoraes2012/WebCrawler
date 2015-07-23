package br.com.moraes.negocios;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebPage 
{
	private Anchor anchor;
	private String webPageHash;
	private int anchorParseStatus;
	private int emailParseStatus;
	private Document document;

	// Construtor para captura dos dados
	public WebPage (Anchor anchor)
	{
		this.anchor = anchor;
	}
	
	// JSoup carregando o html
	private void loadDocumentFromWeb()
	{
		try 
		{
			document = Jsoup.connect(anchor.getAnchorUrl()).get();  
		} catch (IOException e) 
		{
			e.printStackTrace();
		}	
	}
}
