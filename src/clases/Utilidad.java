package clases;
public class Utilidad {

    public void limpiarPantalla() {
        for(int i = 0; i < 30; i++){
            System.out.println();
        }
    }

    public void tiempoEspera(int miliseconds) {
        try {
            Thread.sleep(miliseconds);
        } catch(InterruptedException e) {
            System.out.println("Error en la interrupción");
        }

    }
}