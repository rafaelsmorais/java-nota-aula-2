public class Corrida {
    private double distancia;
    private int tempoEspera;
    private double tarifaBase;
    private double fatorDemanda;

    public Corrida(double distancia, int tempoEspera, double tarifaBase, double fatorDemanda) {
        this.distancia = distancia;
        this.tempoEspera = tempoEspera;
        this.tarifaBase = tarifaBase;
        this.fatorDemanda = fatorDemanda;
    }

    public double calcularValorCorrida() {
        return (distancia * 2) + (tempoEspera * 0.5) + tarifaBase * fatorDemanda;
    }

    public void exibirDetalhesCorrida() {
        System.out.println("Distância: " + distancia);
        System.out.println("Tempo de Espera: " + tempoEspera);
        System.out.println("Tarifa Base: " + tarifaBase);
        System.out.println("Fator de demanda: " + fatorDemanda);
        System.out.printf("Valor Final da Corrida: %.2f", this.calcularValorCorrida());
    }
}
