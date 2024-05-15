package clase;

public abstract class ControlCalidad {
    private ControlCalidad siguienteControl;

    public ControlCalidad getSiguienteControl() {
        return siguienteControl;
    }

    public void setSiguienteControl(ControlCalidad siguienteControl) {
        this.siguienteControl = siguienteControl;
    }
    public abstract String validar(Articulo articulo);
}
