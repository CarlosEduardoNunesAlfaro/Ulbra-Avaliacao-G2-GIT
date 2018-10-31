package ProjFuncionarioV2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Funcionario objFunc = new Funcionario();
        String nome;
        long cpf;
        String endereco;
        double taxaVt;
        double salario;
        
        System.out.println("INforme os dados do funcionário");
        System.out.print("Nome: ");
        nome = leia.next();
        System.out.print("CPF: ");
        cpf = leia.nextLong();
        System.out.print("Endereço: ");
        leia.nextLine();
        endereco = leia.nextLine();
        System.out.print("Salário: ");
        salario = leia.nextDouble();
        
        objFunc.setCpf(cpf);
        objFunc.setEndereco(endereco);
        objFunc.setNome(nome);
        objFunc.setSalario(salario);
        
        System.out.println(objFunc);
        System.out.println("VT: "+objFunc.calcularVt());
        
        

    }

}
