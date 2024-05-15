package clases;

public class Cliente {
    public static void main(String[] args) {
        ComputadoraFactory fabricaPC= new ComputadoraFactory();
        Computadora pc1=fabricaPC.getComputadora(2,129);
        Computadora pc2=fabricaPC.getComputadora(3,128);
        Computadora pc3=fabricaPC.getComputadora(5,125);
        Computadora pc4=fabricaPC.getComputadora(2,129);
        Computadora pc5=fabricaPC.getComputadora(2,129);
        Computadora pc6=fabricaPC.getComputadora(2,500);
        Computadora pc7=fabricaPC.getComputadora(2,500);
        Computadora pc8=fabricaPC.getComputadora(2,500);
        Computadora pc9=fabricaPC.getComputadora(2,500);

        System.out.println("Computadoras creadas: "+Computadora.getContador());

    }
}
