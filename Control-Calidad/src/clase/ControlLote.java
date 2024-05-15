package clase;

public class ControlLote extends ControlCalidad{
    @Override
    public String validar(Articulo articulo) {
        if (articulo.getLote()>=1000 && articulo.getLote()<=2000){
            return ""

        }
        return getSiguienteControl().validar(articulo);
    }
}
