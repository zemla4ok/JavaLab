package by.belstu.dimaKot;

import sun.dc.pr.PRError;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MyDAO_Sattelites implements IGenDAO<Satellites, Integer> {
    private final Connection connection;

    public MyDAO_Sattelites(Connection connection) {
        this.connection = connection;
    }

    public void updateRadiusByName(String name, int newRadius) throws SQLException {
        String sql = "UPDATE Satellites SET Radius = ? Where Name = ?";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setInt(1, newRadius);
        stm.setString(2, name);
        stm.executeUpdate();
    }

    public Satellites getWithMinRadius() throws SQLException {
        String sql = "SELECT TOP(1) * From Satellites ORDER BY Radius";
        PreparedStatement stm = connection.prepareStatement(sql);
        ResultSet rs = stm.executeQuery();
        rs.next();
        Satellites s = new Satellites();
        s.DistanceToPlanet = rs.getInt("DistanceToPlanet");
        s.Radius = rs.getInt("Radius");
        s.Name = rs.getString("Name");
        s.PlanetName = rs.getString("PlanetName");
        return s;
    }

    @Override
    public Satellites read(String key) throws SQLException {
        String sql = "SELECT * FROM Satellites WHERE NAME = ?;";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setString(1, key);
        ResultSet rs = stm.executeQuery();
        rs.next();
        Satellites s = new Satellites();
        s.DistanceToPlanet = rs.getInt("DistanceToPlanet");
        s.Radius = rs.getInt("Radius");
        s.Name = rs.getString("Name");
        s.PlanetName = rs.getString("PlanetName");
        return s;
    }

    @Override
    public List<Satellites> getAll() throws SQLException {
        String sql = "SELECT * FROM Satellites;";
        PreparedStatement stm = connection.prepareStatement(sql);
        ResultSet rs = stm.executeQuery();
        List<Satellites> list = new ArrayList<Satellites>();
        while (rs.next()) {
            Satellites s = new Satellites();
            s.DistanceToPlanet = rs.getInt("DistanceToPlanet");
            s.Radius = rs.getInt("Radius");
            s.Name = rs.getString("Name");
            s.PlanetName = rs.getString("PlanetName");
            list.add(s);
        }
        return list;
    }
}
