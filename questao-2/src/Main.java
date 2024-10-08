import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a distância: ");
        double distancia = sc.nextDouble();
        System.out.println("Digite o tempo de espera: ");
        int tempoEspera = sc.nextInt();
        System.out.println("Digite a tarifa base: ");
        double tarifaBase = sc.nextDouble();
        System.out.println("Digite o fator de demanda R$ (1.0 = normal, 1.5 = pico): ");
        double fatorDemanda = sc.nextDouble();
        Corrida c = new Corrida(distancia, tempoEspera, tarifaBase, fatorDemanda);
        c.exibirDetalhesCorrida();
    }
}