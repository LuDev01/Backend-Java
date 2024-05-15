package presencial;

public class ServicioProxy implements ServicioDescarga {
    private Usuario usuario;
    private TipoUsuario tipoUsuario;
    private Spotify spotify;
    @Override
    public void descargar(String cancion) {
        if (usuario.getTipoUsuario().equals(TipoUsuario.Premium)){
            spotify.descargar(cancion);
        }

    }
}
