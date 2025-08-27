
package com.mycompany.countriesdbmanager;

/**
 *
 * @author suleymanov
 */
public class Country {
	private int country_id;
	private String name;
	private String continent;
	private String region;
	private int population;
	private String capital;

	public Country(int country_id, String name, String continent, String region, int population, String capital) {
		this.country_id = country_id;
		this.name = name;
		this.continent = continent;
		this.region = region;
		this.population = population;
		this.capital = capital;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public int getCountry_id() {
		return country_id;
	}

	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
}
