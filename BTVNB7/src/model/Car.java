package model;

import java.util.Random;

public class Car extends Thread {
    private String name;
    private int speed;
    private Random rd= new Random();
    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }
    public class BrokenCarException extends RuntimeException {
        public BrokenCarException(String message) {
            super(message);
            System.out.println(message);
        }
    }

    @Override
    public void run(){
        try {
            for (int km = 1; km <= 30 ; km++){
                if(rd.nextInt(100) < 10){
                    throw new BrokenCarException("Xe " + name + " bi no lop!\n");
                }
                int sleeptime = 100 + rd.nextInt(speed - 100 + 1);
                Thread.sleep(sleeptime);
                System.out.println(name + " da chay dc " + km + "km\n");
            }
            System.out.println(name + " da hoan thanh cuoc dau!\n");
        }
        catch (BrokenCarException e){
            System.out.println(e.getMessage());
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread c1 = new Thread( new Car("Car A",500));
        Thread c2 = new Thread(new Car("Car B",600));
        Thread c3 = new Thread(new Car("Car C",700));
        c1.start();
        c2.start();
        c3.start();
    }

}
