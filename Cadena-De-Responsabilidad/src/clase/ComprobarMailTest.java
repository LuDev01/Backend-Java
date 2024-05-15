package clase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ComprobarMailTest {
    @Test
    public void mailASpam(){
         //DADO
        CompruebaMail laColmena=new CompruebaMail();
        Mail mail=new Mail("luisa.toro@dh.com","tecnico","Organizar las materias del bimestre");
        String respEsp="Movido a spam";
        //CUANDO
        String respActual=laColmena.disparadorCadena(mail);

        //ENTONCES
        Assertions.assertEquals(respEsp,respActual);
    }
}
