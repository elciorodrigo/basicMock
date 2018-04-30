package br.com.simplemocke.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class RetornoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id; 
	
	@Column(name="protocolo")
	private String protocolo;
	
	@Column(name="json")
	private String json;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}

	public String getJson() {
		return json;
	}

	public void setJson(String json) {
		this.json = json;
	}

	public RetornoEntity(String protocolo, String json) {
		super();
		this.protocolo = protocolo;
		this.json = json;
	}

	public RetornoEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
