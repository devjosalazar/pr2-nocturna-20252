package co.edu.uniquindio.programacion2.solid.o.old;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Coche> listaCoches = new ArrayList<>();
        listaCoches.add(new Coche("Renault"));
        listaCoches.add( new Coche("Audi"));
        listaCoches.add( new Coche("BMW"));
        listaCoches.add( new Coche("Mazda"));
        listaCoches.add( new Coche("Mazda3"));
        listaCoches.add( new Coche("Mazda4"));
        listaCoches.add( new Coche("Mazda5"));
        imprimirPrecioMedioCoche(listaCoches);
    }

    public static void imprimirPrecioMedioCoche(List<Coche> listaCoches){
        for (Coche coche : listaCoches) {
            if(coche.marca.equals("Renault")) System.out.println(18000);
            if(coche.marca.equals("Audi")) System.out.println(25000);
            if(coche.marca.equals("BMW")) System.out.println(35000);
            if(coche.marca.equals("Mazda")) System.out.println(35000);
            if(coche.marca.equals("Mazda3")) System.out.println(55000);
            if(coche.marca.equals("Mazda4")) System.out.println(65000);
            if(coche.marca.equals("Mazda5")) System.out.println(75000);
        }
    }
}
