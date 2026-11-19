import java.util.Scanner;

import model.Motorista;
import repository.MotoristaRepository;
import service.DocService;
import util.MotoristaUtil;

public class App {
    private static final Scanner sc = new Scanner(System.in);
    private static MotoristaRepository mR = new MotoristaRepository();
    public static void main(String[] args) throws Exception {
        while (true) {
            System.out.println("0 - Sair\n" + "1 - Cadastrar\n" + "2 - Consultar\n"
                    + "3 - Atualizar\n" + "4 - Deletar\n");
            var choice = sc.next();
            System.out.println();

            if (choice.equals("0")) {
                System.exit(0);
            } else if (!choice.equals("1") && !choice.equals("2") && !choice.equals("3") && !choice.equals("4")) {
                System.out.println("Opção invalida\n");
            } else {
                System.out.println(
                                "0 - Voltar\n" +
                                "1 - Motorista\n" +
                                "2 - Veiculo\n" +
                                "3 - Multa\n"
                            );
                var ent = sc.next();
                System.out.println();
                
                if (ent.equals("0")) {
                    continue;
                } else if (ent.equals("1")) {
                    switch (choice) {
                        case "1":
                            mR.save(MotoristaUtil.criarMotorista());
                            break;
                        case "2":
                            System.out.println(
                                    "1 - Consulta por CPF\n" +
                                            "2 - Consultar todos\n");
                            choice = sc.next();
                            if (choice.equals("1")) {
                                System.out.println(mR.findByCPF(DocService.formatarCPF()));
                            } else if (choice.equals("2")) {
                                System.out.println(mR.findAll());
                            }
                            break;
                        case "3":
                            System.out.println("Atualizar Dados de Motorista\n");
                            var mAntigo=mR.findByCPF(DocService.formatarCPF());
                            Motorista m=MotoristaUtil.atualizarMotorista(mAntigo);
                            System.out.println(m);
                            mR.update(mAntigo, m);
                            break;

                        case "4":
                            System.out.println("\nDeletar Motorista\n");
                            mR.removeByCPF(DocService.formatarCPF());
                            break;
                        default:
                            System.out.println("Opção inválida");
                            break;
                    }
                }
                if (ent.equals("2")) {
                    switch (choice) {
                        case "1":

                            break;
                        case "2":

                            break;
                        case "3":

                            break;

                        default:
                            System.out.println("Opção inválida");
                            break;
                    }
                }
                if (ent.equals("3")) {
                    switch (choice) {
                        case "1":

                            break;
                        case "2":

                            break;
                        case "3":

                            break;

                        default:
                            System.out.println("Opção inválida");
                            break;
                    }
                }
                if (ent.equals("4")) {
                    switch (choice) {
                        case "1":

                            break;
                        case "2":

                            break;
                        case "3":

                            break;

                        default:
                            System.out.println("Opção inválida");
                            break;
                    }
                }
            }
        }
    }
}
