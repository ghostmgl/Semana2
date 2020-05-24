package Ejercicio4_Applet;

import java.util.*;
import java.awt.*;
import java.applet.*;

public class Reloj extends Applet implements Runnable {

    Thread UnHilo;

    public void start() {
        if (UnHilo == null) {
            UnHilo = new Thread(this, "Reloj");
            UnHilo.start(); //Método start de la clase Thread
        }
    }

    @Override
    public void run() {
        while (true) {
            repaint();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        Date ahora = new Date();
        g.drawString(ahora.getHours() + ":"
                + ahora.getMinutes() + ":"
                + ahora.getSeconds(), 5, 10);
    }

    @Override
    public void stop() {
        UnHilo.stop();//Para el hilo
        UnHilo = null;
    }

}
