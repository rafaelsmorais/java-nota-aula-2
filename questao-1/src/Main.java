import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scNextLine = new Scanner(System.in);
        System.out.println("Selecione tipo de conta [1-Corrente|2-Poupança]");
        int escolha = sc.nextInt();
        if (escolha == 1) {
            Corrente c = new Corrente();
            System.out.println("Digite nome do titular:");
            String titular = scNextLine.nextLine();
            c.setTitular(titular);
            boolean repetir = false;
            do {
                System.out.println("Escolha a operação que deseja realizar:");
                System.out.println("1 - Depositar");
                System.out.println("2 - Sacar");
                System.out.println("3 - Usar Cheque Especial");
                System.out.println("4 - Exibir Dados da Conta");
                int operacao = sc.nextInt();
                switch (operacao){
                    case 1:
                        System.out.println("Informe valor a ser depositado:");
                        double deposito = sc.nextDouble();
                        c.depositar(deposito);
                        c.exibirDados();
                        break;
                    case 2:
                        System.out.println("Informe valor a ser sacado:");
                        double saque = sc.nextDouble();
                        c.sacar(saque);
                        c.exibirDados();
                        break;
                    case 3:
                        c.usarChequeEspecial();
                        c.exibirDados();
                        break;
                    case 4:
                        c.exibirDados();
                        break;
                }
                System.out.println("Deseja realizar mais uma operação? [s|n]");
                String vaiRepetir = scNextLine.nextLine();
                if (vaiRepetir.equalsIgnoreCase("s")) {
                    repetir = true;
                } else if (vaiRepetir.equalsIgnoreCase("n")) {
                    repetir = false;
                }
            } while (repetir);
        } else if (escolha == 2) {
            Poupanca p = new Poupanca();
            System.out.println("Digite nome do titular:");
            String titular = scNextLine.nextLine();
            p.setTitular(titular);
            boolean repetir = false;
            do {
                System.out.println("Escolha a operação que deseja realizar:");
                System.out.println("1 - Depositar");
                System.out.println("2 - Sacar");
                System.out.println("3 - Calcular Rendimento");
                System.out.println("4 - Exibir Dados da Conta");
                int operacao = sc.nextInt();
                switch (operacao){
                    case 1:
                        System.out.println("Informe valor a ser depositado:");
                        double deposito = sc.nextDouble();
                        p.depositar(deposito);
                        p.exibirDados();
                        break;
                    case 2:
                        System.out.println("Informe valor a ser sacado:");
                        double saque = sc.nextDouble();
                        p.sacar(saque);
                        p.exibirDados();
                        break;
                    case 3:
                        System.out.println("Informe a taxa selic:");
                        double selic = sc.nextDouble();
                        p.setRendimento(selic);
                        System.out.println("Rendimento da poupança: " + p.getRendimento());
                        break;
                    case 4:
                        p.exibirDados();
                        break;
                }
                System.out.println("Deseja realizar mais uma operação? [s|n]");
                String vaiRepetir = scNextLine.nextLine();
                if (vaiRepetir.equalsIgnoreCase("s")) {
                    repetir = true;
                } else if (vaiRepetir.equalsIgnoreCase("n")) {
                    repetir = false;
                }
            } while (repetir);
        }
    }
}