import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        DbHelper helper = new DbHelper();
        ResultSet resultSet;
        Statement statement = null;
        try (Connection connection = helper.getConnection()) {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM countries;");
            ArrayList<Country> countryArrayList = new ArrayList<Country>();
            while (resultSet.next()) {
                countryArrayList.add(new Country(
                        resultSet.getString("country_id"),
                        resultSet.getString("name"),
                        resultSet.getString("continent"),
                        resultSet.getString("region"),
                        resultSet.getString("population"),
                        resultSet.getString("capital")));
            }
            for (Country country : countryArrayList) {
                System.out.println(
                    country.getCountry_id() + "|" +
                    country.getName() + "|" +
                    country.getContinent() + "|" +
                    country.getRegion() + "|" +
                    country.getPopulation() + "|" +
                    country.getCapital());
            }
        } catch (SQLException e) {
            helper.errorMessage(e);
        }
    }
}
