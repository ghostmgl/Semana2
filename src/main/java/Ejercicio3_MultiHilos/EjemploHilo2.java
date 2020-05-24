package Ejercicio3_MultiHilos;

public class EjemploHilo2 {

    public static void main(String a[]) {
        UnHilo t = new UnHilo();
        t.start();
        for (int i = 1; i < 10; i++) {
            System.out.println("Principal:" + i);
        }

    }

}
