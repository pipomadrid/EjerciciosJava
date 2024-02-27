package EjerciciosComparaciones;


import java.util.Arrays;

public class EjercicioCompararArray {

    public static void main(String[] args) {
        int[] edades = {20,30,45,66,78,30,45,25,80};
        int[] edades2 ={20,30,45,66,78,30,45,25,80};
        int[] edades3 ={20,30,35,45,66,78,30,45,25,80};
        Arrays.sort(edades);
        Arrays.sort(edades2);
        Arrays.sort(edades3);
        Arrays.stream(edades).forEach(a-> System.out.print(a+", "));
        System.out.println(" ");
        Arrays.stream(edades2).forEach(a-> System.out.print(a+", "));
        System.out.println(" ");
        Arrays.stream(edades3).forEach(a-> System.out.print(a+", "));
        System.out.println(" ");
        System.out.println(Arrays.binarySearch(edades,60));
        System.out.println(Arrays.compare(edades,edades2));
        System.out.println(Arrays.mismatch(edades2,edades3));
    }

}
