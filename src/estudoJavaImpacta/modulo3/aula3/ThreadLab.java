package estudoJavaImpacta.modulo3.aula3;

public class ThreadLab extends Thread {

    public ThreadLab (String name){
        super(name);

    }

    @Override
    public void run() {

        metodoAuxiliar();

    }


    public synchronized void metodoAuxiliar(){

        for(int i = 0; i < 10; i++){

            System.out.println(getName());

           /* try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println("Erro " + e.getMessage());
            }
           */
        }
    }


}



