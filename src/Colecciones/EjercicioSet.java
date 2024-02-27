package Colecciones;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class EjercicioSet {
    public static void main(String[] args) {
        HashSet<String> coches = new HashSet<>();
        coches.add("Renault");
        coches.add("Mercedes");
        coches.add("Seat");
        if(coches.contains("Seat")) {
            coches.remove("Seat");
            coches.add("SEAT");
        }
        System.out.println(coches);

        HashSet<String> cochesJapon = new HashSet<>();
        cochesJapon.add("Subaru");
        cochesJapon.add("Toyota");
        cochesJapon.add("Suzuki");

        coches.addAll(cochesJapon);
        coches.forEach(System.out::println);
        System.out.println(coches.size());

        HashSet<String> ciudadanos = new HashSet<>();
        ciudadanos.add("Ana");
        ciudadanos.add("Luis");
        ciudadanos.add("Pepe");
        ciudadanos.add("Sara");
        ciudadanos.add("Miguel");
        ciudadanos.add("Gabriel");
        ciudadanos.add("Raquel");

        HashSet<String> ciudadanosIbi = new HashSet<>();
        ciudadanosIbi.add("Luis");
        ciudadanosIbi.add("Gabriel");
        ciudadanosIbi.add("Sara");
        ciudadanos.add("Raquel");

        System.out.println("Ciudadanos" + ciudadanos);
        System.out.println("Ciudadanos con Ibi domiciliado" + ciudadanosIbi);

        Set<String> copia = new HashSet<>(ciudadanos);
        System.out.println(copia.containsAll(ciudadanosIbi));
        copia.removeAll(ciudadanosIbi);
        System.out.println(copia);
    }


}
