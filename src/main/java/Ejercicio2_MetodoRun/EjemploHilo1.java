package Ejercicio2_MetodoRun;

public class EjemploHilo1 {
  public static void main(String args[]){
      TestThread t1,t2,t3;
      //Creamos los threads
      t1=new TestThread("Thread 1",(int)(Math.random()*2000));
      t2=new TestThread("Thread 2",(int)(Math.random()*2000));
      t3=new TestThread("Thread 3",(int)(Math.random()*2000));
      
      //Arrancamos los threads
      t1.start();
      t2.start();
      t3.start();
      
      }  
}
