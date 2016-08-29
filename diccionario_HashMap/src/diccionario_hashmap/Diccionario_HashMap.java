package diccionario_hashmap;

import java.util.HashMap;

public class Diccionario_HashMap {

    public static void main(String[] args) {

        
        //llaves de mapeo    
        HashMap diccionario = new HashMap();
        diccionario.put("1", "andres");
        diccionario.put("2", "sara");
        diccionario.put("3", "isabella");
        
        String contenido = diccionario.get("2").toString();
        System.out.println(contenido);
        
        boolean busqueda = diccionario.containsKey("1");//verificacion o busqueda de llave dentro del diccionario
        System.out.println(busqueda);
    }
    
}
