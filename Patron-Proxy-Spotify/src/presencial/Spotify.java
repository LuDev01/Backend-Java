package presencial;

public class Spotify implements ServicioDescarga{
    @Override
    public void descargar(String cancion) {
        System.out.println("Descargando canción: "+ cancion);
    }
}
