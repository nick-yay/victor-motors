import java.util.Scanner;
import model.Moto;
import model.Motorista;
import model.Veiculo;

public class App {
    public static void main(String[] args) throws Exception {
        Motorista m=new Motorista(null, null, null, null, null);
        System.out.println(m.getCPF());
        Scanner scan = new Scanner(System.in);
        Veiculo moto = new Moto(scan.next(), scan.next(), scan.nextInt(), scan.next(), scan.next());
        System.out.println(moto);
    }
}
