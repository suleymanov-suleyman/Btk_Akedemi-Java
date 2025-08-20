public class Country {
    private String country_id;
    private String name;
    private String continent;
    private String region;
    private String population;
    private String capital;

    public Country (String country_id, String name, String continent, String region, String population, String capital) {
            this.country_id = country_id;
            this.name = name;
            this.continent = continent;
            this.region = region;
            this.population = population;
            this.capital = capital;
    }

    public String getCountry_id() {
        return country_id;
    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    public String getRegion() {
        return region;
    }

    public String getPopulation() {
        return population;
    }

    public String getCapital() {
        return capital;
    }
}
