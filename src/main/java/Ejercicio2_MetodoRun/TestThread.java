package Ejercicio2_MetodoRun;
class TestThread extends Thread {
    private final String nombre;
    private final int retardo;
    //Contructor para almacenar nuestro nombre
    //y el retardo
    public TestThread(String s, int d){
      nombre=s;
      retardo=d;
      
    }

    @Override
    public void run(){
        //retrasamos la ejecución el tiempo especificado
        try{
            sleep(retardo);
            }
        catch(InterruptedException e){ }
        //Ahora imprimimos el nombre
        System.out.println("Hola mundo! " +nombre+""+retardo);
        
    }    

    void Start() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
