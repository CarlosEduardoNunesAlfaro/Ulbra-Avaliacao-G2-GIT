package projrevendaarraylist;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        Revenda rev1 = new Revenda();

        byte op;
        do {
            Carro objCar = new Carro();
            System.out.println("Escolha uma opção abaixo: ");
            System.out.println("1 - Cadastrar carro.");
            System.out.println("2 - Mostrar todos os carros.");
            System.out.println("3 - Mostrar quantidade de carros.");
            System.out.println("4 - Excluir tudo.");
            System.out.println("0 - Sair");
            System.out.print("Digite sua opção: ");

            op = leia.nextByte();
            switch (op) {
                case 1:
                    System.out.println("Informe os dados do carro:");
                    System.out.print("Marca: ");
                    objCar.setMarca(leia.next());
                    System.out.print("Modelo: ");
                    objCar.setModelo(leia.next());
                    System.out.print("Ano: ");
                    objCar.setAno(leia.nextInt());
                    rev1.getListaDeCarros().add(objCar);
                    break;
                case 2:
                    if (rev1.getListaDeCarros().isEmpty()) {
                        System.out.println("Não existem carros cadastrados.");
                        break;
                    }
                    System.out.println(rev1);
                    break;
                case 3:
                    if (rev1.getListaDeCarros().isEmpty()) {
                        System.out.println("Não existem carros cadastrados.");
                        break;
                    }
                    System.out.println("A quantidade de carros é: " + rev1.getListaDeCarros().size());
                    break;
                case 4:
                    if (rev1.getListaDeCarros().isEmpty()) {
                        System.out.println("Não existem carros cadastrados.");
                        break;
                    }
                    rev1.getListaDeCarros().clear();
                    System.out.println("Carros excluidos do sistema.");
                    break;
                case 0:
                    System.out.println("Sistema encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida!");

            }
        } while (op != 0);
    }

}
