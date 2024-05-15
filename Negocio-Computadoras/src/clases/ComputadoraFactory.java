package clases;

import java.util.HashMap;
import java.util.Map;

public class ComputadoraFactory {
    private Map<String, Computadora>computadoraMap;
    private int contador=0;

    public ComputadoraFactory() {
        computadoraMap=new HashMap<>();
    }
    public Computadora getComputadora(int ram, int discoDuro){
        //PASO 1. Armar la clave
        String key="PC"+ram+discoDuro;

        //PASO 2. Verificar  si exite
        if (!computadoraMap.containsKey(key)){
            computadoraMap.put(key, new Computadora(ram,discoDuro));
            System.out.println("Computadora creada con éxito");
        }
        //PASO 3. Devolver o crear el objeto nuevo
        contador++;
        System.out.println("Computadoras re utilizadas: "+contador);
        return computadoraMap.get(key);

    }
}
