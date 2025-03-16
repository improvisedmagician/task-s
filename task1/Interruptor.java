// Classe Interruptor
public class Interruptor {
    private boolean ligado;

    public Interruptor() {
        this.ligado = false;
    }

    public void pressionar() {
        this.ligado = !this.ligado;
    }

    public void verificarLampada() {
        if (this.ligado) {
            System.out.println("A luz está acesa");
        } else {
            System.out.println("A luz está apagada");
        }
    }
}
