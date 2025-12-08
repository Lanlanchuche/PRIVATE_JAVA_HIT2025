
import java.util.Random;


public class Car implements Runnable{
    private String name;
    private double speed;
    private Random random = new Random();

    public Car() {
    }

    public Car(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }


    
    public void run() {
        try{
            int sleep;
            int broken;
            for (int i = 1; i <= 30; i++){
                sleep = random.nextInt((int)this.speed - 100 + 1) + 100;
                Thread.sleep(sleep);
                //10% no lop
                if(random.nextInt(100) <= 10){
                    throw new BrokenCarException("Xe " + this.name+ " bi no lop.");
                }
                System.out.println(this.name + " da chay duoc " + i + " km");
            }
        }
        catch(BrokenCarException bc){
            System.out.println(bc.getMessage());
            System.out.println("Xe " + this.name + " thua.");
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }

}
