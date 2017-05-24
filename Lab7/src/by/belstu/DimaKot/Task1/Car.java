package by.belstu.DimaKot.Task1;

import java.util.Random;

public class Car extends Thread {

    public String carName;
    Parking parking;
    Random random = new Random();

    public Car(int pCarName, Parking pParking) {
        this.carName = String.valueOf(pCarName);
        this.parking = pParking;
        System.out.println("Car " + this.carName + " sis come");
    }

    @Override
    public void run() {
        synchronized (parking) {
            if (parking.getFreePlace() == -1) {
                int waitingTime = random.nextInt(1000);
                System.out.println("Car " + this.getCarName() + " is waiting...");
                try{
                    parking.wait(waitingTime);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
        if(parking.getFreePlace() != -1){
            parking.setCar(this);
            parking.showParking();
            try{
                Thread.sleep(random.nextInt(3000));
            }
            catch(Exception e){
                e.printStackTrace();
            }

            parking.leaveCar(this);
            synchronized (parking){
                parking.notify();
            }
        }
        else{
            System.out.println("Car " + this.getCarName() + " left");
        }
    }

    public String getCarName(){
        return this.carName;
    }
}
