package by.belstu.dimaKot;

public class Satellites {
    public String Name;
    public int Radius;
    public int DistanceToPlanet;
    public String PlanetName;

    @Override
    public String toString() {
        return '\n' + "Satellites{" +
                "Name='" + Name + '\'' +
                ", Radius=" + Radius +
                ", DistanceToPlanet=" + DistanceToPlanet +
                ", PlanetName='" + PlanetName + '\'' + '}';
    }
}
