package clases;

public class ApiCantidad {
    public int descuentoCantidad(int cantidad){
        if (cantidad<11){
            System.out.println("No aplica despuesto por cantidad");
            return 0;
        }

        return 15;
    }
}
