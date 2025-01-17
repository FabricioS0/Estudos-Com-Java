public class Salary {

    public String name;
    public double salario;
    public double taxa;

    public double netSalary(double salarioLiq){
        salarioLiq = salario - taxa;
        return salarioLiq;
    }
    public double increaseSalary(double porcentagem, double newSalario){
        newSalario = (salario * porcentagem) / 100.0;
        return newSalario;
    }
}
