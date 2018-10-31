package projcarro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Carro objCarro = new Carro();
        Carro objCarro2 = new Carro();

        String fabricante;
        String marca;
        String modelo;
        String tipo;
        int anoFabricacao;
        int potenciaCv;
        double valorAVista;
        double taxa;
        double consumoMedioKmLitro;
        double qtdDeCombustivel;
        int op1;
        int op2;
        double distancia;
        double valorLitro;
        double valorTotalAbastecido;

        System.out.println("::::Digite os dados do carro 1::::");
        System.out.print("Fabricante: ");
        fabricante = leia.next();
        System.out.print("Marca: ");
        marca = leia.next();
        System.out.print("Modelo: ");
        modelo = leia.next();
        System.out.print("Tipo: ");
        tipo = leia.next();
        System.out.print("Ano de Fabricação: ");
        anoFabricacao = leia.nextInt();
        System.out.print("Potência(CV): ");
        potenciaCv = leia.nextInt();
        System.out.print("Valor à vista: ");
        valorAVista = leia.nextDouble();
        System.out.print("Taxa: ");
        taxa = leia.nextDouble();
        System.out.print("Consumo médio de litros por KM: ");
        consumoMedioKmLitro = leia.nextDouble();
        System.out.print("Quantidade de combustível no tanque: ");
        qtdDeCombustivel = leia.nextDouble();

        objCarro.setFabricante(fabricante);
        objCarro.setMarca(marca);
        objCarro.setModelo(modelo);
        objCarro.setTipo(tipo);
        objCarro.setAnoFabricacao(anoFabricacao);
        objCarro.setPotenciaCv(potenciaCv);
        objCarro.setValorAvista(valorAVista);
        objCarro.setTaxa(taxa);
        objCarro.setConsumoMedioKmLitro(consumoMedioKmLitro);
        objCarro.setQtdDeCombustivel(qtdDeCombustivel);

        System.out.println("\f");

        System.out.println("::::Digite os dados do carro 2::::");
        System.out.print("Fabricante: ");
        fabricante = leia.next();
        System.out.print("Marca: ");
        marca = leia.next();
        System.out.print("Modelo: ");
        modelo = leia.next();
        System.out.print("Tipo: ");
        tipo = leia.next();
        System.out.print("Ano de Fabricação: ");
        anoFabricacao = leia.nextInt();
        System.out.print("Potência(CV): ");
        potenciaCv = leia.nextInt();
        System.out.print("Valor à vista: ");
        valorAVista = leia.nextDouble();
        System.out.print("Taxa: ");
        taxa = leia.nextDouble();
        System.out.print("Consumo médio de litros por KM: ");
        consumoMedioKmLitro = leia.nextDouble();
        System.out.print("Quantidade de combustível no tanque: ");
        qtdDeCombustivel = leia.nextDouble();

        objCarro2.setFabricante(fabricante);
        objCarro2.setMarca(marca);
        objCarro2.setModelo(modelo);
        objCarro2.setTipo(tipo);
        objCarro2.setAnoFabricacao(anoFabricacao);
        objCarro2.setPotenciaCv(potenciaCv);
        objCarro2.setValorAvista(valorAVista);
        objCarro2.setTaxa(taxa);
        objCarro2.setConsumoMedioKmLitro(consumoMedioKmLitro);
        objCarro2.setQtdDeCombustivel(qtdDeCombustivel);

        System.out.println("\f");

        do {
            System.out.println("Escolha uma das opções abaixo: ");
            System.out.println("1 - Gerenciar Carro 1");
            System.out.println("2 - Gerenciar Carro 2");
            System.out.println("0 - Sair");
            op1 = leia.nextInt();
            System.out.println("\f");

            switch (op1) {
                case 1:
                    do {
                        System.out.println("Dados do carro 1: " + objCarro);
                        System.out.println("1 - Calcular distância a percorrer");
                        System.out.println("2 - Calcular consumo");
                        System.out.println("3 - Abastecer");
                        System.out.println("0 - Voltar");
                        op2 = leia.nextInt();
                        System.out.println("\f");

                        switch (op2) {
                            case 1:
                                System.out.println("A distância a percorrer é: " + objCarro.calcularDistanciaAPercorrer());
                                System.out.println(":::::::::::::::::::");
                                break;
                            case 2:
                                System.out.println("Digite a distância: ");
                                distancia = leia.nextDouble();
                                System.out.println("Distancia a ser percorrida: " + objCarro.calcularConsumo(distancia));
                                System.out.println(":::::::::::::::::::");
                                break;
                            case 3:
                                System.out.println("Digite o valor do litro: ");
                                valorLitro = leia.nextDouble();
                                System.out.println("Digite o valor total abastecido: ");
                                valorTotalAbastecido = leia.nextDouble();
                                objCarro.abastecer(valorLitro, valorTotalAbastecido);
                                System.out.println("Abastecido!");
                                System.out.println(":::::::::::::::::::");
                                break;
                            case 0:
                                System.out.println("Voltando");
                                System.out.println(":::::::::::::::::::");
                            default:

                        }

                    } while (op2 != 0);
                    break;
                case 2:
                    do {
                        System.out.println("Dados do carro 2: " + objCarro2);
                        System.out.println("1 - Calcular distância a percorrer: ");
                        System.out.println("2 - Digite a distância para o calculo do consumo");
                        System.out.println("3 - Abastecer");
                        System.out.println("0 - Voltar");
                        op2 = leia.nextInt();
                        System.out.println("\f");

                        switch (op2) {
                            case 1:
                                System.out.println("A distância a percorrer é: " + objCarro2.calcularDistanciaAPercorrer());
                                System.out.println(":::::::::::::::::::");
                                break;
                            case 2:
                                System.out.println("Digite a distância: ");
                                distancia = leia.nextDouble();
                                System.out.println("Consumo: " + objCarro2.calcularConsumo(distancia));
                                System.out.println(":::::::::::::::::::");
                                break;
                            case 3:
                                System.out.println("Digite o valor do litro: ");
                                valorLitro = leia.nextDouble();
                                System.out.println("Digite o valor total abastecido: ");
                                valorTotalAbastecido = leia.nextDouble();
                                objCarro2.abastecer(valorLitro, valorTotalAbastecido);
                                System.out.println("Abastecido!");
                                System.out.println("Valor atual no tanque: ");
                                System.out.println(":::::::::::::::::::");
                                break;
                            case 0:
                                System.out.println("Voltando");
                                System.out.println(":::::::::::::::::::");
                            default:

                        }

                    } while (op2 != 0);
                    break;
            }
        } while (op1 != 0);

    }

}
