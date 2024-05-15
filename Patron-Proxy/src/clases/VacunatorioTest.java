package clases;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Date;

public class VacunatorioTest {
    @Test
    public void casoCorrecto(){
        //DADO
        Persona persona=new Persona("Luchito",1224455,new Date(2024-1900,4,3),"Astrazeneca");
        VacunatorioProxy centro= new VacunatorioProxy();
        String respEsp= "vuelva cuando sea su turno.";

        //CUANDO
        String respAc= centro.vacunar(persona);

        //ENTONCES
        Assertions.assertEquals(respAc,respEsp);
    }

    @Test
    public void casocorrecto(){
        Persona persona= new Persona("Marianita",1224455,new Date(2024-1900,4,3),"Blazer");
        VacunatorioProxy centro= new VacunatorioProxy();
        String respEsp= "finalizado";

        //CUANDO
        String respAc= centro.vacunar(persona);

        //ENTONCES
        Assertions.assertEquals(respAc,respEsp);
    }
}
