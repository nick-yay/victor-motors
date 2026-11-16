import java.util.Scanner;
import model.Moto;
import model.Motorista;
import model.Veiculo;
import repository.AbstractRepository;
import repository.InterfaceTeste;

public class App {
    public static void main(String[] args) throws Exception {
       /*  Motorista m=new Motorista(null, null, null, null, null);
        System.out.println(m.getCPF());*/
        /*Scanner scan = new Scanner(System.in);
        Veiculo moto = new Moto(scan.next(), scan.next(), scan.nextInt(), scan.next(), scan.next());
        InterfaceTeste teste = new InterfaceTeste();
        teste.save(moto);
        teste.showAll();
        System.out.println(teste.findBy(r -> r.getCRLV().equals("2")));*/
        Scanner scan=new Scanner(System.in);
        InterfaceTeste teste=new InterfaceTeste();
        while (true) {
            System.out.println(
                "1 - Cadastrar Moto\n"+
                "2 - Achar todas as motos\n"
                +"0 - Sair"
            );
            var choice=scan.next();
            switch (choice) {
                case "1":
                    System.out.println("Cadastro de Motos:");
                    System.out.print("Placa: ");
                    var placa=scan.next();
                    System.out.print("CRLV: ");
                    var crlv=scan.next();
                    System.out.print("eixos: ");
                    var eixos=scan.nextInt();
                    System.out.print("modelo: ");
                    scan.nextLine();
                    var modelo=scan.nextLine();
                    System.out.print("cor: ");
                    var cor=scan.next();
                    Veiculo moto = new Moto(placa, crlv, eixos, modelo, cor);
                    teste.save(moto);
                    System.out.println();
                    break;
                
                case "2":
                    teste.showAll();
                    break;
                
                case "0":
                    System.exit(0);
                    break;
                default:
                    System.out.println("opção invalida");
                    break;
            }
        }
    }
}
