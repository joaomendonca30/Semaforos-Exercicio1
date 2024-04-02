package controller;

public class Carro extends Thread{

    private String nome;
    private Sentido sentido;

    public Carro(String nome, Sentido sentido) {
        this.nome = nome;
        this.sentido = sentido;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            synchronized (sentido) {
                System.out.println(nome + " está passando pelo cruzamento no sentido " + sentido);
                Thread.sleep(2000);
                System.out.println(nome + " atravessou o cruzamento no sentido " + sentido);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
