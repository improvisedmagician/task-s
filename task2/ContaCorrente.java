public class ContaCorrente {
 double saldo;

public ContaCorrente(double saldoInicial) {
  saldo = saldoInicial;
}

public void definirSaldoInicial(double saldoInicial) {
saldo = saldoInicial;
}

public void depositar(double valor) {
    if (valor > 0) {
      saldo += valor;
    }
}

public void sacar(double valor) {
    if (valor > 0 && valor <= this.saldo) {
      saldo -= valor;
    
    }
}

public double getSaldo() {
    return saldo;
}
}

class TestarContaCorrente {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(2000);
        System.out.println("Saldo inicial: " + conta.getSaldo());
       conta.sacar(500); 
        System.out.println("Saldo saque: " + conta.getSaldo()); 
        conta.depositar(50);
        System.out.println("Saldo deposito: " + conta.getSaldo());

        System.out.println("Saldo total: " + conta.getSaldo());
        conta.sacar(600);
        System.out.println("Saldo saque: " + conta.getSaldo());
     
        System.out.println("Saldo total: " + conta.getSaldo());

    }
}
