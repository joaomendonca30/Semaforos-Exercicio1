import controller.Carro;
import controller.Sentido;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("O carro 1", Sentido.NORTE_SUL);
        Carro carro2 = new Carro("O carro 2", Sentido.SUL_NORTE);
        Carro carro3 = new Carro("O carro 3", Sentido.LESTE_OESTE);
        Carro carro4 = new Carro("O carro 4", Sentido.OESTE_LESTE);

        carro1.start();
        carro2.start();
        carro3.start();
        carro4.start();
    }
}