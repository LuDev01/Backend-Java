package clases;

public class Tarjeta {
    private int numero;
    private String banco;

    public Tarjeta(int numero, String banco) {
        this.numero = numero;
        this.banco = banco;
    }

    public int getNumero() {
        return numero;
    }

    public String getBanco() {
        return banco;
    }
}
