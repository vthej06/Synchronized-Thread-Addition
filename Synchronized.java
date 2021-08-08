public class Synchronized extends Thread {
    public int Sum = 0;
    public synchronized void run(){
        for(int i = 0 ; i < 50 ; i++) {
            Sum += 1;
            System.out.println("synchronized: " + Sum);

        }
        System.out.println("Final synchronized: " + Sum);
    }

}
