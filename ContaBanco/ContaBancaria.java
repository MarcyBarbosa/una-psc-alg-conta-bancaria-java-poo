import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        SistemaAcoes sistemaAcoes = new SistemaAcoes();

        System.out.println("Bem-vindo");
        
        System.out.println("Para criar sua conta bancaria, informe seu nome");
        sistemaAcoes.setNome(scanner.next());

        System.out.println("Informe numero da sua conta");
        sistemaAcoes.setNumeroConta(scanner.next());

        System.out.println("informe saldo inicial");
        sistemaAcoes.setSaldoInicial(scanner.nextDouble());
        
        System.out.println("Conta bancaria criada com sucesso");
    
        System.out.println("Por escolha uma das opções:\n 1-Depositar Valor\n 2-Sacar Valor \n 3-Obter saldo disponivel");
        sistemaAcoes.setOperacao(scanner.nextInt());



        switch (sistemaAcoes.getOperacao()) {
            case 1:
                System.out.println("Digite o valor do depósito:");
                sistemaAcoes.setDeposito(scanner.nextDouble());
                sistemaAcoes.depositar();
                System.out.printf("Depósito de R$%.2f realizado com sucesso.", sistemaAcoes.getDeposito());

                break;
            case 2: 
                System.out.println("Digite o valor do saque:");
                sistemaAcoes.setSaque(scanner.nextDouble());
                if (sistemaAcoes.getSaque() >= sistemaAcoes.getSaldo()) {
                System.out.println("Saldo insuficiente para realizar a operação");
                } 
                else if( (sistemaAcoes.getSaque()) >= 5000) {
                System.out.println("Valor do saque acima do permitido (R$5000,00)");
                } 
                else {
                sistemaAcoes.sacar();
                System.out.printf("Saque de R$%.2f realizado com sucesso", sistemaAcoes.getSaque());
                }

                break;

                case 3:
                System.out.print("O seu saldo atual é de R$" + sistemaAcoes.getSaldo());

                break;
            default:
                System.out.println("Operação inválida, tente novamente");
                
                break;
        }
        scanner.close();
    }
}
