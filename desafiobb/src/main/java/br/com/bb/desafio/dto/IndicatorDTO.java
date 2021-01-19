package br.com.bb.desafio.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IndicatorDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty("id")
	private Object id;
	@JsonProperty("value")
	private Object value;

	@JsonProperty("id")
	public Object getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(Object id) {
		this.id = id;
	}

	@JsonProperty("value")
	public Object getValue() {
		return value;
	}

	@JsonProperty("value")
	public void setValue(Object value) {
		this.value = value;
	}

}