package br.com.moraes.negocios;

import java.sql.Timestamp;

/*
 * Esta classe ir� guardar informa��es b�sicas de objetos de dom�nio
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
	
	// Construtor ser� utilizado para trazer os dados do banco de dados
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
	// N�o ser�o necess�rios os Setters, pois os dados ser�o inseridos pelos construtores
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
