package Ejercicio3_MultiHilos;

public class UnHilo {

    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println("Hilo: " + i);
        }
    }

    void start() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
