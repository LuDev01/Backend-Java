package clases;

public class ApiTarjeta {
    public int descuentoTarjeta(Tarjeta tarjeta){
        if (tarjeta.getBanco().equalsIgnoreCase("star bank")){
        return 20;
        }
        return 0;
    }
}
