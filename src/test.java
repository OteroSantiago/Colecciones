
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alumno Mañana
 */
public class test {
    public static void main(String[] args) {
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        
        for(Object elem: miLista){
            System.out.println("elem = "+elem);
        }
        imprimir(miLista);
       
        Map miMap = new HashMap();
        miMap.put("valor","Santiago");
        miMap.put("valor2","Javier");
        miMap.put("valor3","Luis");
        miMap.put("valor4","Manuel");
        
        String nombre = (String)miMap.get("valor3");
        System.out.println("nombre = "+nombre);
        
        imprimir(miMap.keySet());//Me devuelve todas las claves
        imprimir(miMap.values());//Me devuelve todos los valores de mi Map
      
    }
    public static void imprimir(Collection colection){
         colection.forEach(elem->{
            System.out.println("elem = "+elem);
        }); 
    }
}
