package br.com.moraes.negocios;

import java.sql.Timestamp;

/*
 * Esta classe irá guardar informações básicas de objetos de domínio
 * */

public class Domain 
{
	private String domainHash;
	private String domainURL;
	private String activated;
	private Timestamp modified;
	private Timestamp created;

	// Construtores
	
	public Domain(String domainHash, String domainURL) {
		super();
		this.domainHash = domainHash;
		this.domainURL = domainURL;
	}
	
	// Construtor será utilizado para trazer os dados do banco de dados
	public Domain(String domainHash, String domainURL, String activated,
			Timestamp modified, Timestamp created) {
		super();
		this.domainHash = domainHash;
		this.domainURL = domainURL;
		this.activated = activated;
		this.modified = modified;
		this.created = created;
	}
	
	// Getters
	// Não serão necessários os Setters, pois os dados serão inseridos pelos construtores
	public String getDomainHash() {
		return domainHash;
	}
	public String getDomainURL() {
		return domainURL;
	}
	public String getActivated() {
		return activated;
	}
	public Timestamp getModified() {
		return modified;
	}
	public Timestamp getCreated() {
		return created;
	}
	
	
}
