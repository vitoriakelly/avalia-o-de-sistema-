public class MG1FilaServidorQuestao15 {

    public static void main(String[] args) {

        double lambda = 20.0;
        double tempoMedioMin = 2.4;
        double varianciaMin2 = 2.0;

        double tempoMedioHoras = tempoMedioMin / 60.0;
        double mu = 1.0 / tempoMedioHoras;
        double rho = lambda / mu;

        System.out.println("Modelo M/G/1");
        System.out.println();

        System.out.printf("lambda: %.2f clientes/h%n", lambda);
        System.out.printf("mu: %.2f clientes/h%n", mu);
        System.out.printf("rho: %.4f%n", rho);
        System.out.printf("utilizacao: %.2f%%%n", rho * 100.0);
        System.out.println();

        if (rho >= 1.0) {
            System.out.println("Sistema instavel.");
            return;
        }

        System.out.println("Sistema estavel.");
        System.out.println();

        double varianciaHoras2 = varianciaMin2 / 3600.0;
        double segundoMomento = varianciaHoras2 + Math.pow(tempoMedioHoras, 2);

        double Wq = (lambda * segundoMomento) / (2.0 * (1.0 - rho));
        double Lq = lambda * Wq;

        double W = Wq + tempoMedioHoras;
        double L = lambda * W;

        System.out.printf("tempo medio de servico: %.5f h%n", tempoMedioHoras);
        System.out.printf("variancia: %.6f h2%n", varianciaHoras2);
        System.out.printf("segundo momento E[S2]: %.6f h2%n", segundoMomento);
        System.out.println();

        System.out.printf("Wq: %.5f h%n", Wq);
        System.out.printf("Wq: %.2f min%n", Wq * 60.0);
        System.out.printf("Lq: %.3f clientes%n", Lq);
        System.out.printf("W: %.5f h%n", W);
        System.out.printf("W: %.2f min%n", W * 60.0);
        System.out.printf("L: %.3f clientes%n", L);
    }
}