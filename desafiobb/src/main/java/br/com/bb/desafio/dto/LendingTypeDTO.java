package br.com.bb.desafio.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LendingTypeDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty("id")
	private String id;
	@JsonProperty("iso2Code")
	private String iso2Code;
	@JsonProperty("value")
	private String value;
	
	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("iso2Code")
	public String getIso2Code() {
		return iso2Code;
	}

	@JsonProperty("iso2Code")
	public void setIso2Code(String iso2Code) {
		this.iso2Code = iso2Code;
	}

	@JsonProperty("value")
	public String getValue() {
		return value;
	}

	@JsonProperty("value")
	public void setValue(String value) {
		this.value = value;
	}
	
	
}