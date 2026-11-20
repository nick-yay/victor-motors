package util;

import java.util.Scanner;

import model.Automovel;
import model.Caminhao;
import model.Moto;
import model.Veiculo;

public class VeiculoUtil {
    private static Scanner sc = new Scanner(System.in);

    public static Veiculo criarVeiculo() {
        while (true) {
            System.out.println(
                    "1 - Carro\n" +
                            "2 - Moto\n" +
                            "3 - Caminhão\n");
            var tipo = sc.next();
            Veiculo v;
            if (!tipo.equals("1") && !tipo.equals("2") && !tipo.equals("3")) {
                System.out.println("Opção inválida\n");
                continue;
            }

            System.out.println("Placa: ");
            var placa = sc.next();
            System.out.println("CRV: ");
            var crv = sc.next();
            System.out.println("Eixos: ");
            var eixos = sc.nextInt();
            System.out.println("Modelo: ");
            sc.nextLine();
            var modelo = sc.nextLine();
            System.out.println("Cor: ");
            var cor = sc.next();

            switch (tipo) {
                case "1":
                    v = new Automovel(placa, crv, eixos, modelo, cor);
                    break;
                case "2":
                    v = new Moto(placa, crv, eixos, modelo, cor);
                    break;
                case "3":
                    v = new Caminhao(placa, crv, eixos, modelo, cor);
                    break;

                default:
                    continue;
            }
            return v;
        }
    }

    public static Veiculo atualizarVeiculo(Veiculo v) {
        while (true) {
            System.out.println(
                    "1 - Carro\n" +
                            "2 - Moto\n" +
                            "3 - Caminhão\n");
            var tipo = sc.next();

            if (!tipo.equals("1") && !tipo.equals("2") && !tipo.equals("3")) {
                System.out.println("Opção inválida\n");
                continue;
            }

            System.out.println("\nDigite 0 nos campos que não quer alterar\n");

            System.out.println("Placa: ");
            var placa = sc.next();
            if (placa.equals("0")) {
                placa = v.getPlaca();
            }

            System.out.println("CRV: ");
            var crv = sc.next();
            if (crv.equals("0")) {
                crv = v.getCRV();
            }

            System.out.println("Eixos: ");
            var eixos = sc.nextInt();
            if (eixos == 0) {
                eixos = v.getEixos();
            }

            System.out.println("Modelo: ");
            sc.nextLine();
            var modelo = sc.nextLine();
            if (modelo.equals("0")) {
                modelo = v.getModelo();
            }

            System.out.println("Cor: ");
            var cor = sc.next();
            if (cor.equals("0")) {
                cor = v.getCor();
            }
            
            switch (tipo) {
                case "1":
                    v = new Automovel(placa, crv, eixos, modelo, cor);
                    break;
                case "2":
                    v = new Moto(placa, crv, eixos, modelo, cor);
                    break;
                case "3":
                    v = new Caminhao(placa, crv, eixos, modelo, cor);
                    break;

                default:
                    continue;
            }
            return v;
        }
    }
}
