package by.belstu.dimaKot;

public class Planets {
    public String Name;
    public int Radius;
    public int Temperature;
    public String IsAtmosphere;
    public String IsLife;

    @Override
    public String toString(){
        return '\n' + "Planets{"+
                "Name='"+Name+'\''+
                ", Radius="+Radius+
                ", Temperature="+Temperature+
                ", IsAtmosphere='"+IsAtmosphere+'\''+
                ", IsLife='"+IsLife+'\''+'}';
    }
}
