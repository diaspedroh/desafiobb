package br.com.bb.desafio.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataIndicatorDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty("indicator")
	private IndicatorDTO indicator;
	@JsonProperty("country")
	private CountryDTO country;
	@JsonProperty("countryiso3code")
	private String countryiso3code;
	@JsonProperty("date")
	private String date;
	@JsonProperty("value")
	private String value;
	@JsonProperty("unit")
	private String unit;
	@JsonProperty("obs_status")
	private String obsStatus;
	@JsonProperty("decimal")
	private String decimal;

	@JsonProperty("indicator")
	public IndicatorDTO getIndicator() {
		return indicator;
	}

	@JsonProperty("indicator")
	public void setIndicator(IndicatorDTO indicator) {
		this.indicator = indicator;
	}

	@JsonProperty("country")
	public CountryDTO getCountry() {
		return country;
	}

	@JsonProperty("country")
	public void setCountry(CountryDTO country) {
		this.country = country;
	}

	@JsonProperty("countryiso3code")
	public String getCountryiso3code() {
		return countryiso3code;
	}

	@JsonProperty("countryiso3code")
	public void setCountryiso3code(String countryiso3code) {
		this.countryiso3code = countryiso3code;
	}

	@JsonProperty("date")
	public String getDate() {
		return date;
	}

	@JsonProperty("date")
	public void setDate(String date) {
		this.date = date;
	}

	@JsonProperty("value")
	public Object getValue() {
		return value;
	}

	@JsonProperty("value")
	public void setValue(String value) {
		this.value = value;
	}

	@JsonProperty("unit")
	public String getUnit() {
		return unit;
	}

	@JsonProperty("unit")
	public void setUnit(String unit) {
		this.unit = unit;
	}

	@JsonProperty("obs_status")
	public String getObsStatus() {
		return obsStatus;
	}

	@JsonProperty("obs_status")
	public void setObsStatus(String obsStatus) {
		this.obsStatus = obsStatus;
	}

	@JsonProperty("decimal")
	public String getDecimal() {
		return decimal;
	}

	@JsonProperty("decimal")
	public void setDecimal(String decimal) {
		this.decimal = decimal;
	}

}