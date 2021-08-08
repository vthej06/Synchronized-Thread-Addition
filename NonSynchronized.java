public class NonSynchronized extends Thread {
    public int Sum = 0;
    public void run(){
        for(int i = 0 ; i < 50 ; i++) {
            Sum += 1;
            System.out.println("non synchronized: " + Sum);
        }
        System.out.println("Final non synchronized: " + Sum);
    }

}
