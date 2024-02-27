package Colecciones;

import java.util.ArrayDeque;
import java.util.Deque;

public class EjerciciosDeque {
    public static void main(String[] args) {
        Deque<String> compra = new ArrayDeque<>();
        compra.push("Lechuga");
        compra.push("Tomate");
        compra.push("Pan");
        compra.push("Leche");
        System.out.println(compra.add("hummus"));
        compra.forEach(System.out::println);
        compra.poll();
        compra.pollLast();
        System.out.println(" ");
        compra.forEach(System.out::println);
        System.out.println(" ");
        System.out.println(compra.element());
    }



}
