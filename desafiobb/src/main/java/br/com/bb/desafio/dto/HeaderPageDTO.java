package br.com.bb.desafio.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HeaderPageDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("page")
	private Object page;
	@JsonProperty("pages")
	private Object pages;
	@JsonProperty("per_page")
	private Object perPage;
	@JsonProperty("total")
	private Object total;
	@JsonProperty("sourceid")
	private Object sourceId;
	@JsonProperty("lastupdated")
	private Object lastUpdated;

	@JsonProperty("page")
	public Object getPage() {
		return page;
	}

	@JsonProperty("page")
	public void setPage(Object page) {
		this.page = page;
	}

	@JsonProperty("pages")
	public Object getPages() {
		return pages;
	}

	@JsonProperty("pages")
	public void setPages(Object pages) {
		this.pages = pages;
	}

	@JsonProperty("per_page")
	public Object getPerPage() {
		return perPage;
	}

	@JsonProperty("per_page")
	public void setPerPage(Object perPage) {
		this.perPage = perPage;
	}

	@JsonProperty("total")
	public Object getTotal() {
		return total;
	}

	@JsonProperty("total")
	public void setTotal(Object total) {
		this.total = total;
	}

	@JsonProperty("sourceid")
	public Object getSourceId() {
		return sourceId;
	}

	@JsonProperty("sourceid")
	public void setSourceId(Object sourceId) {
		this.sourceId = sourceId;
	}

	@JsonProperty("lastupdated")
	public Object getLastUpdated() {
		return lastUpdated;
	}

	@JsonProperty("lastupdated")
	public void setLastUpdated(Object lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

}