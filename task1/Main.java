public class Main {
    public static void main(String[] args) {
        // Criar duas pessoas distintas
        Pessoa pessoa1 = new Pessoa("Alice", 30, 1.65);
        Pessoa pessoa2 = new Pessoa("Bob", 25, 1.80);

        // Imprimir valores dos atributos
        System.out.println("Antes da alteração:");
        pessoa1.apresentar();
        pessoa2.apresentar();

        // Alterar valores dos atributos
        pessoa1.alterarNome("Alicia");
        pessoa2.alterarNome("Robert");

        // Imprimir valores dos atributos após alteração
        System.out.println("Depois da alteração:");
        pessoa1.apresentar();
        pessoa2.apresentar();
    }
}
