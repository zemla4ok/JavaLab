package by.belstu.dimaKot;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MyDAO_Planets implements IGenDAO<Planets, Integer> {
    private final Connection connection;

    public MyDAO_Planets(Connection connection){
        this.connection = connection;
    }

    public List<Planets> planetsWithLife() throws SQLException{
        Statement st = connection.createStatement();
        String sql = "SELECT * FROM Planets WHERE IsLife = 'Y';";
        PreparedStatement stm = connection.prepareStatement(sql);
        ResultSet rs = stm.executeQuery();
        List<Planets> list = new ArrayList<Planets>();
        while(rs.next()){
            Planets p = new Planets();
            p.Name = rs.getString("Name");
            p.IsLife = rs.getString("IsLife");
            p.IsAtmosphere = rs.getString("IsAtmosphere");
            p.Temperature = rs.getInt("Temperature");
            p.Radius = rs.getInt("Radius");
            list.add(p);
        }
        return list;
    }

    @Override
    public Planets read(String key) throws SQLException {
        String sql = "SELECT * FROM Planets WHERE Name = ?;";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setString(1, key);
        ResultSet rs = stm.executeQuery();
        rs.next();
        Planets p = new Planets();
        p.Name = rs.getString("Name");
        p.IsLife = rs.getString("IsLife");
        p.IsAtmosphere = rs.getString("IsAtmosphere");
        p.Temperature = rs.getInt("Temperature");
        p.Radius = rs.getInt("Radius");
        return p;
    }

    @Override
    public List<Planets> getAll() throws SQLException {
        Statement st = connection.createStatement();
        String sql = "SELECT * FROM Planets;";
        PreparedStatement stm = connection.prepareStatement(sql);
        ResultSet rs = stm.executeQuery();
        List<Planets> list = new ArrayList<Planets>();
        while(rs.next()){
            Planets p = new Planets();
            p.Name = rs.getString("Name");
            p.IsLife = rs.getString("IsLife");
            p.IsAtmosphere = rs.getString("IsAtmosphere");
            p.Temperature = rs.getInt("Temperature");
            p.Radius = rs.getInt("Radius");
            list.add(p);
        }
        return list;
    }
}
