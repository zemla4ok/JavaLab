package by.belstu.dimaKot;

import java.sql.Connection;
import java.sql.SQLException;

public interface IDAO {
    public Connection getConnection()throws SQLException;

    public IGenDAO<Planets, Integer> getPlanetsDAO(Connection connection);

    public IGenDAO<Satellites, Integer> getSatellitesDAO(Connection connection);
}
