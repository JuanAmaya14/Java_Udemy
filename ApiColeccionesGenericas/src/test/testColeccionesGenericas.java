package test;

import java.util.*;

public class testColeccionesGenericas {

    public static void main(String[] args) {
        
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("viernes");

        String elemento = miLista.get(0);

        //imprimir(miLista);

//        miLista.forEach(elemento -> {
//
//            System.out.println("elemento = " + elemento);
//
//        });

        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("viernes");
        miSet.add("Sabado");
        miSet.add("Domingo");
        //imprimir(miSet);

        Map<String,String> miMapa = new HashMap();
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Carlos");
        miMapa.put("valor3", "natalia");

        String elementoMapa = (String) miMapa.get("valor1");
        //System.out.println("elementoMapa = " + elementoMapa);

        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }

    public static void imprimir(Collection<String> collection){

        for(String elemento: collection){

            System.out.println("elemento = " + elemento);

        }

    }

    
}
