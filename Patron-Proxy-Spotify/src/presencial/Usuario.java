package presencial;

public class Usuario {
    private String id;
    private String tipoUsuario;

    public Usuario(String id, String tipoUsuario) {
        this.id = id;
        this.tipoUsuario = tipoUsuario;
    }

    public String getId() {
        return id;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }
}
