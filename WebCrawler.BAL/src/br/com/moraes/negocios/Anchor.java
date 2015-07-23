package br.com.moraes.negocios;

import java.sql.Timestamp;

public class Anchor 
{
	private Domain domain;
	private String anchorHash;
	private String anchorUrl;
	private int scanStatus;
	private boolean activated;
	private Timestamp modified;
	private Timestamp created;

	// Construtores
	public Anchor(Domain domain, String anchorHash, String anchorUrl)
	{
		this.domain = domain;
		this.anchorHash = anchorHash;
		this.anchorUrl = anchorUrl;
	}
	
	public Anchor(Domain domain, String anchorHash, String anchorUrl, int scanStatus, boolean activated, Timestamp modified, Timestamp created)
	{
		this.domain = domain;
		this.anchorHash = anchorHash;
		this.anchorUrl = anchorUrl;
		this.scanStatus = scanStatus;
		this.activated = activated;
		this.modified = modified;
		this.created = created;
	}
	
	// Getters
	public Domain getDomain() {
		return domain;
	}
	public String getAnchorHash() {
		return anchorHash;
	}
	public String getAnchorUrl() {
		return anchorUrl;
	}
	public int getScanStatus() {
		return scanStatus;
	}
	public boolean isActivated() {
		return activated;
	}
	public Timestamp getModified() {
		return modified;
	}
	public Timestamp getCreated() {
		return created;	
	}
	
	
}
