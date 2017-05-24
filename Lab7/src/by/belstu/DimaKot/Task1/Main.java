package by.belstu.DimaKot.Task1;

import java.util.Random;

public class Main {
    public static final int CARCOUT = 20;
    public static final int PARKINGSIZE = 5;

    public static void main(String[] args) {
        Parking parking = new Parking(PARKINGSIZE);
        Random rand = new Random();

        for (int i = 0; i < CARCOUT; i++) {
            (new Car(i, parking)).start();
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
