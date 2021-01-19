package br.com.bb.desafio.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataCountryDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty("id")
	private String id;
	@JsonProperty("iso2Code")
	private String iso2Code;
	@JsonProperty("name")
	private String name;
	@JsonProperty("region")
	private RegionDTO region;
	@JsonProperty("adminregion")
	private AdminRegionDTO adminRegion;
	@JsonProperty("incomeLevel")
	private IncomeLevel incomeLevel;
	@JsonProperty("lendingType")
	private LendingTypeDTO lendingType;
	@JsonProperty("capitalCity")
	private String capitalCity;
	@JsonProperty("longitude")
	private String longitude;
	@JsonProperty("latitude")
	private String latitude;

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

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("region")
	public RegionDTO getRegion() {
		return region;
	}

	@JsonProperty("region")
	public void setRegion(RegionDTO region) {
		this.region = region;
	}

	@JsonProperty("adminregion")
	public AdminRegionDTO getAdminRegion() {
		return adminRegion;
	}

	@JsonProperty("adminregion")
	public void setAdminRegion(AdminRegionDTO adminRegion) {
		this.adminRegion = adminRegion;
	}

	@JsonProperty("incomeLevel")
	public IncomeLevel getIncomeLevel() {
		return incomeLevel;
	}

	@JsonProperty("incomeLevel")
	public void setIncomeLevel(IncomeLevel incomeLevel) {
		this.incomeLevel = incomeLevel;
	}

	@JsonProperty("lendingType")
	public LendingTypeDTO getLendingType() {
		return lendingType;
	}

	@JsonProperty("lendingType")
	public void setLendingType(LendingTypeDTO lendingType) {
		this.lendingType = lendingType;
	}

	@JsonProperty("capitalCity")
	public String getCapitalCity() {
		return capitalCity;
	}

	@JsonProperty("capitalCity")
	public void setCapitalCity(String capitalCity) {
		this.capitalCity = capitalCity;
	}

	@JsonProperty("longitude")
	public String getLongitude() {
		return longitude;
	}

	@JsonProperty("longitude")
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	@JsonProperty("latitude")
	public String getLatitude() {
		return latitude;
	}

	@JsonProperty("latitude")
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

}