package EstructuraSecuencial;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReadNumbers rb = new ReadNumbers();
        // rb.readTwoNumbers();
        // rb.readNameAndPrint();
        //rb.readNumberAndOperate(sc);
        //rb.celsiusToFahrenheit(sc);
        //rb.radiusToLengthAndArea(sc);
        rb.KilometerToMeter(sc);


    }

    //Comprueba si un un String introducido en un entero
    public static boolean IsInteger(String text,String message){
        int x;
        try{
            x = Integer.parseInt(text);
            return true;
        }catch (NumberFormatException ex){
            System.out.println("No se ha introducido el tipo de dato esperado");
            System.out.println(message);
            return false;
        }
    }

    //Solicita un número por pantalla, comprueba que sea válido y lo devuelve como entero
    public static int checkAndGetImputNumbers(Scanner sc){
        System.out.println("Introduce un número");
        String numberStr;
        do{
            numberStr = sc.nextLine();
        }
        while(!ReadNumbers.IsInteger(numberStr,"El número introducido no es válido"));
        return Integer.parseInt(numberStr);
    }



    public static boolean IsDouble(String text,String message){
        double x;
        try{
            x = Double.parseDouble(text);
            return true;
        }catch (NumberFormatException ex){
            System.out.println("No se ha introducido el tipo de dato esperado");
            System.out.println(message);
            return false;
        }

    }
    //Leer dos números enteros por teclado y los muestre por pantalla.
    public void readTwoNumbers(Scanner sc){
        System.out.println("Escribe un número por pantalla");
        String number = sc.next();
        System.out.println("Escribe un segundo número por pantalla");
        String number2 = sc.next();

        System.out.println("Los números elegidos son " + number + " y " + number2);
    }
    //leer un nombre y muestre por pantalla: “Buenos dias nombre_introducido”.
    public void readNameAndPrint(Scanner sc){
        System.out.println("Cuál es tu nombre?");
        String name = sc.next();
        System.out.println("Buenos días " + name );
    }
    //lee un número entero por teclado y obtiene y muestra por pantalla el doble y el triple de ese número.
    public void readNumberAndOperate(Scanner sc) {
        String number;
        System.out.println("Escribe un número por pantalla");
        do {
            number = sc.nextLine();
        } while (!ReadNumbers.IsInteger(number,"Introduce un número válido"));

        int doubleNum = Integer.parseInt(number) * 2;
        int tripleNum = Integer.parseInt(number) * 3;
        System.out.println("Doble " + doubleNum + " Triple "+ tripleNum);

    }
    //Leer una cantidad de grados centígrados y la pase a grados Fahrenheit
    public void celsiusToFahrenheit(Scanner sc){
        System.out.println("Indica la temperatura en grados Celsius");
        String cel;
        do{
            cel = sc.nextLine();
        }while(!ReadNumbers.IsInteger(cel,"Introduce una temperatura válida"));

        int fah = 32 + (9 * Integer.parseInt(cel)/5);
        System.out.println(cel + " grados Celsius equivalen a " + fah + " grados Fahrenheit" );

    }

    //lee por teclado el valor del radio de una circunferencia y calcula y muestra por pantalla la longitud y el área
    // de la circunferencia. Longitud de la circunferencia
    public void radiusToLengthAndArea(Scanner sc){
        System.out.println("Indica el radio de la circunferencia");
        String radius;
        do{
            radius = sc.nextLine();
        }while(!ReadNumbers.IsDouble(radius,"Introduce una número válido"));

        double longitud = (2 * Math.PI) * Double.parseDouble(radius);
        double area = Math.pow(Double.parseDouble(radius),2.0) * Math.PI;
        System.out.printf("El área es %.2f  y la longitud es %.2f%n",area ,longitud);
    }

    public void KilometerToMeter(Scanner sc){
        System.out.println("Introduce la velocidad en Km/h");
        String speedKm;
        do{
            speedKm = sc.nextLine();
        }while (!ReadNumbers.IsInteger(speedKm,"Introduce una velocidad válida"));
        double meterSg = (Double.parseDouble(
                speedKm) * 5)/ 18;
        System.out.printf(speedKm + " km/h equivalen a %.2f%n m/s",meterSg);
    }

}
