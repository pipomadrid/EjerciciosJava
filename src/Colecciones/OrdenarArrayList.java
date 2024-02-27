package Colecciones;

import EstructuraSecuencial.ReadNumbers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OrdenarArrayList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OrdenarArrayList oar = new OrdenarArrayList();
        //oar.getTenNumbers(sc);
        oar.getTenWords(sc);
    }

    public void getTenNumbers(Scanner sc){
        System.out.println("Introduce 10 números por teclado");
        List<Integer> tenNumbers = new ArrayList<>();

        for(int i = 0;i<10;i++){
            int number = ReadNumbers.checkAndGetImputNumbers(sc);
            tenNumbers.add(number);
        }
        tenNumbers.sort(Comparator.comparingInt(a -> a));
        tenNumbers.forEach(System.out::println);

    }

    public void getTenWords(Scanner sc){
        System.out.println("Introduce 10 palabras por teclado");
        List<String> tenWords = new ArrayList<>();

        for(int i = 1;i<=10;i++){
            System.out.println("Introduce la palabra " + i);
            String word = sc.nextLine();
            tenWords.add(word);
        }
        tenWords.sort(String::compareTo);
        tenWords.forEach(System.out::println);

    }
}
