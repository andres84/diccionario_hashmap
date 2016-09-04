package ejemplo2;

import java.util.*;

public class app {


    public static void main(String[] args) {
        
        
        HashMap<String, Empleado> personal = new HashMap();
        
        personal.put("001", new Empleado("sara"));
        personal.put("002", new Empleado("liliana"));
        personal.put("003", new Empleado("isabella"));
        personal.put("004", new Empleado("andres"));
        
        System.out.println(personal);
        
        //remover un objeto
        
        personal.remove("004");
        
        System.out.println(personal);
        
        //sustituir un objeto
        
        personal.put("004", new Empleado("Esteban"));
        
        System.out.println(personal);
        
        //metodo entrySet
        
        System.out.println(personal.entrySet());
        
        for(Map.Entry<String, Empleado> coleccion : personal.entrySet()){
            
            
            String clave = coleccion.getKey();
            Empleado valor = coleccion.getValue();
            
            System.out.println("Clave= " + clave + ", valor= " + valor);
            
        }
        
    }

    
}
//creacion clase empleado
class Empleado{
    
    private String nombre;
    private double sueldo;
    

    public Empleado(String nombre) {
        this.nombre = nombre;
        
        this.sueldo=2000;
    }
    
    @Override
    public String toString(){
        
        return "[Nombre=" + nombre + ", sueldo=" + sueldo + "]";
        
    }
    
}
