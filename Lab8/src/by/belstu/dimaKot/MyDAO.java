package by.belstu.dimaKot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDAO implements IDAO {
    private String user = "admin";
    private String password = "admin";
    private String url = "jdbc:sqlserver://localhost;databaseName=cosmos";

    public MyDAO(){
        try{
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    @Override
    public IGenDAO<Planets, Integer> getPlanetsDAO(Connection connection) {
        return new MyDAO_Planets(connection);
    }

    @Override
    public IGenDAO<Satellites, Integer> getSatellitesDAO(Connection connection) {
        return new MyDAO_Sattelites(connection);
    }
}
