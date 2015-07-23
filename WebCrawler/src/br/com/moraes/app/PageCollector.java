package br.com.moraes.app;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class PageCollector 
{
	public static void main(String[] args) 
	{
		
		/*
		 * 1. Importar org.jsoup.Jsoup e org.jsoup.nodes.Document 
		 * 2. Envolver em try catch
		 * 
		 * */
		
		try 
		{
			Document doc = Jsoup.connect("http://jsoup.com").get();  
			Elements links = doc.select("a"); // Selecionando a tag HTML
			System.out.println("Número de links: " + links.size() + "\n");
			for(Element e: links) // Importar  org.jsoup.nodes.Element
			{
					System.out.println(e.attr("abs:href")); //Imprime o conteúdo de um atributo da tag
			}
		} catch (IOException e) 
		{
			e.printStackTrace();
		}	
	}
}
