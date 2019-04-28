package Task03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static char[] buffer;
    public static boolean isActive;
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        int counter = 2;
        while (true) {
            if (counter % 2 == 0) {
                thread1.start();
            }
            else{
                thread2.start();
            }
        }
    }
}
class  Thread1 extends Thread {
    @Override
    public void run() {
        try(FileInputStream fin=new FileInputStream("C://SomeDir//notes.txt");)
        {
            while (Main.isActive) {
                Main.buffer = new char[fin.available()];
                int i = -1;
                int j = 0;
                while ((i = fin.read()) != -1) {
                    System.out.print("Считанный смвол: " + (char) i);
                    Main.buffer[j] = (char) i;
                    j++;
                    Main.isActive = false;
                }
            }

        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
class Thread2 extends Thread {
    @Override
    public void run() {
        try(FileOutputStream fos=new FileOutputStream("C://SomeDir//notes.txt"))
        {
            for (int i = 0; i < Main.buffer.length; i++) {
                fos.write(Main.buffer[i]);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        System.out.println("The file has been written");
    }
}
