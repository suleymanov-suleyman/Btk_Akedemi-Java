import java.sql.*;

public class Main {

    public static void main(String[] args) {
        SqlDataBaseManager dataBaseManager = new SqlDataBaseManager();
        dataBaseManager.update("Ukraine 3", "name", 56);
        dataBaseManager.deleteRow(56);
        dataBaseManager.update("Ukraine", "name",55);
        dataBaseManager.update(39100000,"population",55);
        dataBaseManager.insert("Atlantis", "Ocean", "Atlantia",10000000,"Atlantia");
        dataBaseManager.deleteColumnValue("continent",54);
        dataBaseManager.deleteRow(58);
        dataBaseManager.deleteRow(57);
        dataBaseManager.update("Asia", "continent",54);
        dataBaseManager.showAllCountriesTable();
    }
}
