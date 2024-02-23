package EstructuraCondicional;

import EstructuraSecuencial.ReadNumbers;

import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Condicional cd = new Condicional();
        //cd.parImpar(sc);
        //cd.negativePositive(sc);
        //cd.numberEquals(sc);
        //cd.multipleTen(sc);
        cd.compareNumbers(sc);
    }

    public void parImpar(Scanner sc) {
        String number;
        System.out.println("Introduce un número");
        do {
            number = sc.nextLine();
        } while (!ReadNumbers.IsInteger(number, "El número introducido no es válido"));
        if (Integer.parseInt(number) % 2 == 0) {
            System.out.println("El número " + number + " es par");
        } else System.out.println("El número " + number + " es impar");
    }

    public void negativePositive(Scanner sc) {
        String number;
        System.out.println("Introduce un número");
        do {
            number = sc.nextLine();
        } while (!ReadNumbers.IsInteger(number, "El número introducido no es válido"));
        if (Integer.parseInt(number) > 0) {
            System.out.println("El número " + number + " es positivo");
        } else System.out.println("El número " + number + " es negativo");
    }
    //leer dos números y comprueba si son iguales.
    public void numberEquals(Scanner sc) {
        String number1;
        String number2;
        do {
            System.out.println("Introduce el primer número");
            number1 = sc.nextLine();
            System.out.println("Introduce el segundo número");
            number2 = sc.nextLine();
        } while (!(ReadNumbers.IsInteger(number1, "El primer número introducido no es válido")
                && ReadNumbers.IsInteger(number2, "El segundo número introducido no es válido")));
        if (Integer.parseInt(number1) == Integer.parseInt(number2) ) {
            System.out.println("Son numeros iguales");
        } else System.out.println("Son numeros distintos");
    }
    //lee un número entero y muestra si el número es múltiplo de 10.
    public void multipleTen(Scanner sc) {
        String number;
        System.out.println("Introduce un número");
        do {
            number = sc.nextLine();
        } while (!ReadNumbers.IsInteger(number, "El número introducido no es válido"));
        if (Integer.parseInt(number)%10 ==0 ) {
            System.out.println("El número " + number + " es multiplo de 10");
        } else System.out.println("El número " + number + " no es multiplo de 10");
    }

    // Lee dos números y calcula cuál es el mayor.
    public void compareNumbers(Scanner sc) {
        String number1;
        String number2;
        do {
            System.out.println("Introduce el primer número");
            number1 = sc.nextLine();
            System.out.println("Introduce el segundo número");
            number2 = sc.nextLine();
        } while (!(ReadNumbers.IsInteger(number1, "El primer número introducido no es válido")
                && ReadNumbers.IsInteger(number2, "El segundo número introducido no es válido")));
        Integer IntUno= Integer.parseInt(number1);
        Integer IntDos= Integer.parseInt(number2);

        String result;
        if (IntUno.compareTo(IntDos) > 0) {
            result =  "El primer número es el mayor";
        } else if (IntUno.compareTo(IntDos) < 0) {
            result =  "El segundo número es el mayor";
        }else result = "Son iguales";
        System.out.println(result);

    }
}
