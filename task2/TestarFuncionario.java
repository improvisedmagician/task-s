public class TestarFuncionario {
    public static void main(String[] args) {
        
     
        Funcionario funcionario1 = new Funcionario("Luiz", "Silva", 10, 25,50);

      
        System.out.println("Nome completo: " + funcionario1.getNomeCompleto());

       
        System.out.println("Salário: " + funcionario1.calcularSalario());

        funcionario1.incrementarHoras(8);

        System.out.println("Horas trabalhadas: " + funcionario1.getHorasTrabalhadas());

        System.out.println("Salário: " + funcionario1.calcularSalario());
    }
}
