package ProjFuncionarioV2;

public class Funcionario {

    private String nome;
    private long cpf;
    private String endereco;
    private final double TAXA_VT;
    private double salario;

    public Funcionario() {
        this.TAXA_VT = 0.06;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getTaxaVt() {
        return TAXA_VT;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double calcularVt(){
        return this.salario*this.TAXA_VT;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome
                + "\nCPF: " + cpf
                + "\nEndereco: " + endereco
                + "\nTaxa VT: " + TAXA_VT
                + "\nSalario: " + salario;
    }
    
    

}
