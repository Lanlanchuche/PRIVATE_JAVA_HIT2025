
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Car c1 = new Car("Ferrari", 150);
        Car c2 = new Car("Porche", 200);
        Car c3 = new Car("Vinfast", 135);

        Thread thr1 = new Thread(c1);
        Thread thr2 = new Thread(c2);
        Thread thr3 = new Thread(c3);

        thr1.start();
        thr2.start();
        thr3.start();
    }
    
}
