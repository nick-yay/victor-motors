package util;

import java.util.Scanner;

import model.Genero;
import model.Motorista;
import service.DocService;

public class MotoristaUtil {
    private static final Scanner sc = new Scanner(System.in);
    

    public static Motorista criarMotorista() {

        System.out.println("Cadastro de motorista\n");

        System.out.print("Nome: ");
        var nome = sc.nextLine();

        System.out.print("Endereço: ");
        var endereco = sc.nextLine();

        Genero genero = null;
        while (genero == null) {
            System.out.print("Genero (M/F): ");
            var charGen = sc.next().toUpperCase();
            if (charGen.startsWith("M")) {
                genero = Genero.MASCULINO;
                break;
            } else if (charGen.startsWith("F")) {
                genero = Genero.FEMININO;
                break;
            }
            System.out.println("Entrada inválida");
        }

        System.out.print("CNH: ");
        var CNH = sc.next();
        Motorista m = new Motorista(nome, endereco, genero, CNH);
        System.out.println(m);
        return m;
    }

    public static Motorista atualizarMotorista(Motorista m){
        System.out.println("\nDigite 0 nos campos que não quer alterar\n");

        System.out.print("Nome: ");
        sc.nextLine();
        var nome = sc.nextLine();
        if (nome.equals("0")){
            nome=m.getNome();
        }
        var cpf=DocService.formatarCPF();
        if (cpf.equals("000.000.000-00")) {
            cpf=m.getCPF();
        }
        DocService.validarCPF(cpf);

        var rg=DocService.formatarRG();
        if (rg.equals("00.000.000-0")) {
            rg=m.getRG();
        }

        System.out.print("Endereço: ");
        var endereco = sc.nextLine();
        if (endereco.equals("0")){
            endereco=m.getEndereco();
        }

        Genero genero = null;
        while (genero == null) {
            System.out.print("Genero (M/F): ");
            var charGen = sc.next().toUpperCase();
            if (charGen.equals("0")){
                genero=m.getGenero();
                break;
            }
            if (charGen.startsWith("M")) {
                genero = Genero.MASCULINO;
                break;
            } else if (charGen.startsWith("F")) {
                genero = Genero.FEMININO;
                break;
            }
            System.out.println("Entrada inválida");
        }

        System.out.print("CNH: ");
        var CNH = sc.next();
        if (CNH.equals("0")){
            CNH=m.getCNH();
        }
        Motorista mNovo=new Motorista(nome, cpf, rg, endereco, genero, CNH);
        
        return mNovo;
    }
}
