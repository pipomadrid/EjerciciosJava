package EstructuraRepetitiva;

import EstructuraSecuencial.ReadNumbers;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class EjerciciosWhile {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        EjerciciosWhile ew = new EjerciciosWhile();
        //ew.oneToHundred();
        //ew.oneToHundredDoWhile();
        //ew.oneToHundredFor();
        //ew.hundredToOne();
        //ew.hundredToOneDoWhile();
        //ew.hundredToOneFor();
        //ew.oneToNumberFor(sc);
        //ew.oneToNumberWhile(sc);
        //ew.oneToNumberDoWhile(sc);
        //ew.mayorToMinor(sc);
        ew.mayorToMinorOnlyEven(sc);
    }

    public void oneToHundred(){
        int x = 1;
        while(x <= 100){
            System.out.println(x);
            x++;
        }
    }
    public void oneToHundredDoWhile(){
        int x = 1;
        do{
            System.out.println(x);
            x++;

        }while(x<=100);
    }

    public void oneToHundredFor(){
       for(int i = 1;i <=100 ;i++){
           System.out.println(i);
       }
    }

    public void hundredToOne(){
        int x = 100;
        while(x > 0){
            System.out.println(x);
            x--;
        }
    }

    public void hundredToOneDoWhile(){
        int x = 100;
        do{
            System.out.println(x);
            x--;
        }
        while(x > 0);
    }

    public void hundredToOneFor(){
        for(int i = 100;i > 0 ;i--){
            System.out.println(i);
        }
    }

    public void oneToNumberFor(Scanner sc){
        System.out.println("Introduce un número");
        String numberStr;
        do{
            numberStr = sc.nextLine();
        }
        while(!ReadNumbers.IsInteger(numberStr,"El número introducido no es válido"));

        int numberInt = Integer.parseInt(numberStr);
        for(int x = 1 ;x <= numberInt;x++){
            System.out.println(x);
        }
    }
    public void oneToNumberWhile(Scanner sc){
        System.out.println("Introduce un número");
        String numberStr;
        do{
            numberStr = sc.nextLine();
        }
        while(!ReadNumbers.IsInteger(numberStr,"El número introducido no es válido"));

        int numberInt = Integer.parseInt(numberStr);
        int cont = 1;
        while(numberInt >= cont){
            System.out.println(cont);
            cont++;
        }
    }

    public void oneToNumberDoWhile(Scanner sc){
        int numberInt = ReadNumbers.checkAndGetImputNumbers(sc);
        int cont =1;
        do{
           System.out.println(cont);
           cont++;
       }
        while(numberInt >= cont);
    }

    public void mayorToMinor(Scanner sc){

        int number1 = ReadNumbers.checkAndGetImputNumbers(sc);
        int number2 = ReadNumbers.checkAndGetImputNumbers(sc);

        int mayor=0;
        int minor=0;

        if(number1 > number2){
            mayor = number1;
            minor = number2;
        } else if (number1 < number2) {
            mayor = number2;
            minor = number1;
        }else{
            System.out.println("Los numeros son iguales");
        }
        while(minor < mayor){
            System.out.println(minor);
            minor++;
        }
    }

    public void mayorToMinorOnlyEven(Scanner sc){

        int number1 = ReadNumbers.checkAndGetImputNumbers(sc);
        int number2 = ReadNumbers.checkAndGetImputNumbers(sc);

        int mayor=0;
        int minor=0;

        if(number1 > number2){
            mayor = number1;
            minor = number2;
        } else if (number1 < number2) {
            mayor = number2;
            minor = number1;
        }else{
            System.out.println("Los numeros son iguales");
        }
        while(minor < mayor){
            if(minor%2==0) System.out.println(minor);
            minor++;
        }
    }



}
