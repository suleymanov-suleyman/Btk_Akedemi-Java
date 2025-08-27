import java.sql.*;
import java.util.*;

public class SqlDataBaseManager {
    DbHelper helper = new DbHelper();

    public void deleteRow(int id) {
        try (Connection connection = helper.getConnection()){
            String sql = "DELETE FROM countries WHERE country_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            System.out.println("Row successfully deleted!");
        }catch (SQLException exception){
            helper.errorMessage(exception);
        }
    }

    public void deleteColumnValue(String columnValue, Integer id){
         try (Connection connection = helper.getConnection()){
             String sql = "UPDATE countries SET " + columnValue + " = NULL WHERE country_id = ?";
             PreparedStatement preparedStatement = connection.prepareStatement(sql);

             Map<String, Integer> columnTypes = Map.of(
                     "name", Types.VARCHAR,
                     "continent", Types.VARCHAR,
                     "region", Types.VARCHAR,
                     "population", Types.INTEGER,
                     "capital", Types.VARCHAR
             );
             List<String> allowedColumns = Arrays.asList("name", "continent", "region", "population", "capital");

             if (!allowedColumns.contains(columnValue)) {
                 throw new IllegalArgumentException("Wrong column name!");
             }

             preparedStatement.setInt(1,id);
             preparedStatement.executeUpdate();
             System.out.println("Column value successfully deleted!");

         }catch (SQLException exception) {
             helper.errorMessage(exception);
         }
    }
    public void update(Integer value, String column, int country_id)
    {
        try (Connection connection = helper.getConnection())
        {
            Map<String, Integer> columnTypes = Map.of(
                    "name", Types.VARCHAR,
                    "continent", Types.VARCHAR,
                    "region", Types.VARCHAR,
                    "population", Types.INTEGER,
                    "capital", Types.VARCHAR
            );
            List<String> allowedColumns = Arrays.asList("name", "continent", "region", "population", "capital");

            if (!allowedColumns.contains(column)) {
                throw new IllegalArgumentException("Wrong column name!");
            }
            String sql = "UPDATE countries SET " + column+ " = ? WHERE country_id = ?";

            int columnType = columnTypes.get(column);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setObject(1, value, columnType);
            preparedStatement.setInt(2, country_id);
            preparedStatement.executeUpdate();
            System.out.println("Values updated successfully");
        }catch (SQLException e)
        {
            helper.errorMessage(e);
        }
    }

    public void update(String value, String column, int country_id)
    {
        try (Connection connection = helper.getConnection())
        {
            Map<String, Integer> columnTypes = Map.of(
                    "name", Types.VARCHAR,
                    "continent", Types.VARCHAR,
                    "region", Types.VARCHAR,
                    "population", Types.INTEGER,
                    "capital", Types.VARCHAR
            );
            List<String> allowedColumns = Arrays.asList("name", "continent", "region", "population", "capital");

            if (!allowedColumns.contains(column)) {
                throw new IllegalArgumentException("Wrong column name!");
            }
            String sql = "UPDATE countries SET " + column+ "= ? WHERE country_id = ?";

            int columnType = columnTypes.get(column);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setObject(1, value, columnType);
            preparedStatement.setInt(2, country_id);
            preparedStatement.executeUpdate();
            System.out.println("Values Updated successfully");
        }catch (SQLException e)
        {
            helper.errorMessage(e);
        }
    }

    public void showAllCountriesTable()
    {
        try (Connection connection = helper.getConnection())
        {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM countries;");
            ArrayList<Country> countryArrayList = new ArrayList<>();
            while (resultSet.next())
            {
                countryArrayList.add(new Country(
                        resultSet.getString("country_id"),
                        resultSet.getString("name"),
                        resultSet.getString("continent"),
                        resultSet.getString("region"),
                        resultSet.getString("population"),
                        resultSet.getString("capital")));
            }
            for (Country country : countryArrayList)
            {
                System.out.println(
                        country.getCountry_id() + "|" +
                                country.getName() + "|" +
                                country.getContinent() + "|" +
                                country.getRegion() + "|" +
                                country.getPopulation() + "|" +
                                country.getCapital());
            }
        } catch (SQLException e)
        {
            helper.errorMessage(e);
        }
    }

    public void insert(String name, String continent, String region, Integer population, String capital) {
        try (Connection connection = helper.getConnection()) {
            String sql = "INSERT INTO countries (name, continent, region, population, capital) VALUES (?, ?, ?, ?, ?);";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, continent);
            preparedStatement.setString(3, region);
            preparedStatement.setInt(4, population);
            preparedStatement.setString(5, capital);
            preparedStatement.executeUpdate();
           System.out.println("Values successfully added to Table");
        } catch (SQLException e) {
            helper.errorMessage(e);
        }
    }
}
