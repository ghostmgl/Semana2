package Ejercicio3_MultiHilos;

public class DosThreads {

    public static void main(String[] a) {
        NoThread n = new NoThread();
        SiThread s = new SiThread();
        n.start();
        n.start();
    }
}
