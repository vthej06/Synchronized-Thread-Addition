public class SynchronizedAddingExample {
    public static void main(String[] args){
        Thread synchronizedAdding1 = new Synchronized();
        Thread synchronizedAdding2 = new Synchronized();
        Thread nonsynchronizedAdding1 = new NonSynchronized();
        Thread nonsynchronizedAdding2 = new NonSynchronized();

//If you want to check the synchronized output, comment out the non-synchronized lines, and vice versa for checking non-synchronized
            //nonsynchronizedAdding1.start();
            //nonsynchronizedAdding2.start();

            synchronizedAdding1.start();
            synchronizedAdding2.start();


    }
}
