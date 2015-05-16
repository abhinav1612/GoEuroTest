package com.goeuro.test.databean;

public class GoEuroCityDetails extends GoEuroDataBean{

	String _id;
	String key;
	String name;
	String fullName;
	String iata_airport_code;
	String type;
	String country;
	GeoPosition geo_position;
	String locationId;
	boolean inEurope;
	String countryCode;
	boolean coreCountry;
	String distance;
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getIata_airport_code() {
		return iata_airport_code;
	}
	public void setIata_airport_code(String iata_airport_code) {
		this.iata_airport_code = iata_airport_code;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public GeoPosition getGeo_position() {
		return geo_position;
	}
	public void setGeo_position(GeoPosition geo_position) {
		this.geo_position = geo_position;
	}
	public String getLocationId() {
		return locationId;
	}
	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}
	public boolean isInEurope() {
		return inEurope;
	}
	public void setInEurope(boolean inEurope) {
		this.inEurope = inEurope;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public boolean isCoreCountry() {
		return coreCountry;
	}
	public void setCoreCountry(boolean coreCountry) {
		this.coreCountry = coreCountry;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	@Override
	public String toString() {
		return "GoEuroCityDetails [_id=" + _id + ", key=" + key + ", name="
				+ name + ", geo_position=" + geo_position + ", inEurope="
				+ inEurope + ", countryCode=" + countryCode + "]";
	}

	
	
}
