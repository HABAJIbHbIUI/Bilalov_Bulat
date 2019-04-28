package Homework_36;

public class UsingThread extends Thread {
    private static int [] randomArray;
    private static int sum;

    UsingThread(String name){
    }

    @Override
    public void run() {
        for (int i = 0; i <randomArray.length ; i++) {
            sum+=randomArray[i];
        }
        System.out.println(sum);
    }

    public static void createRandomArray() {
        randomArray = new int[500];
        for (int i = 0; i < randomArray.length ; i++) {
            randomArray[i] = (int) (Math.random() * 101);
        }
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Main thread started...");
        UsingThread.createRandomArray();
        for (int i = 1; i < 10; i++) {
            new UsingThread("Thread" + i).start();
        }
        System.out.println("Main thread finished...");
    }

}
