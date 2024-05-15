package clases;

public class Computadora {
    private int ram;
    private  int discoDuro;
    private static int  contador=0;

    public Computadora(int ram, int discoDuro) {
        this.ram = ram;
        this.discoDuro = discoDuro;
        contador++;
    }

    public int getRam() {
        return ram;
    }

    public int getDiscoDuro() {
        return discoDuro;
    }

    public static int getContador() {
        return contador;
    }
}
