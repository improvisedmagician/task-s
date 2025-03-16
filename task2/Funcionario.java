// Classe Funcionario
public class Funcionario {
    private String nome;
    private String sobrenome;
    private int horasTrabalhadas;
    private double valorPorHora;

    // Construtor
    public Funcionario(String nome, String sobrenome, int horasTrabalhadas, double valorPorHora, int i) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    // Método para retornar o nome completo
    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }

    // Método para calcular o salário
    public double calcularSalario() {
        return horasTrabalhadas * valorPorHora;
    }

    // Método para incrementar as horas trabalhadas
    public void incrementarHoras(int horas) {
        this.horasTrabalhadas += horas;
    }

    // Método getter para horasTrabalhadas
    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
}
