public class TestarInterruptor {
    public static void main(String[] args) {
        Interruptor interruptor = new Interruptor();

        interruptor.pressionar();
        interruptor.verificarLampada();

        interruptor.pressionar();
        interruptor.verificarLampada();
    }
}