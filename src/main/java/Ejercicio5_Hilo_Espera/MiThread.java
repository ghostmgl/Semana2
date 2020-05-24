package Ejercicio5_Hilo_Espera;

class MiThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + "");
        }
    }

}

class Join1 {

    public static void main(String arg[]) throws InterruptedException {
        MiThread t = new MiThread();
        t.start();
        t.join();
        System.out.println("El Thread ha terminado");
    }
}
