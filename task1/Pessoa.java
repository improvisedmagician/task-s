public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    // Construtor
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // Métodos void
    public void apresentar() {
        System.out.println("Nome: " + nome + ", Idade: " + idade + ", Altura: " + altura);
    }

    public void alterarNome(String novoNome) {
        this.nome = novoNome;
    }

    // Métodos com retorno
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }
}
