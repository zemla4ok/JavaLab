package by.belstu.dimaKot;

public class Main {

    public static void main(String[] args) {
        WorkWithSite worker = new WorkWithSite();
        worker.getLocalHost();
        worker.getByName("www.belstu.by");
        byte ip[] = {(byte)127,(byte)0,(byte)0,(byte)7};
        worker.getByAdress("Unknown",ip);
        worker.ReadHTML("http://www.tut.by");
        worker.getInfo("http://www.tut.by");
    }
}
