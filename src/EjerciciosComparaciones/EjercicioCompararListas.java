package EjerciciosComparaciones;

import java.util.*;

public class EjercicioCompararListas {

    public static void main(String[] args) {
        List<TrabajadorComparable> trabajadorComparable = new ArrayList<>();
        trabajadorComparable.add(new TrabajadorComparable("Juan",32,"Informática"));
        trabajadorComparable.add(new TrabajadorComparable("Pedro",40,"Marketing"));
        trabajadorComparable.add(new TrabajadorComparable("Ana",25,"Admin"));
        trabajadorComparable.add(new TrabajadorComparable("Juan",50,"Recursos Humanos"));

        Collections.sort(trabajadorComparable);
        trabajadorComparable.forEach(a-> System.out.println(a.getName() +" " + a.getEdad()));


        List<TrabajadorComparator> trabajadorComparator = new ArrayList<>();
        trabajadorComparator.add(new TrabajadorComparator("Juan",32,"Informática"));
        trabajadorComparator.add(new TrabajadorComparator("Pedro",40,"Marketing"));
        trabajadorComparator.add(new TrabajadorComparator("Ana",25,"Admin"));
        trabajadorComparator.add(new TrabajadorComparator("Juan",50,"Recursos Humanos"));
        trabajadorComparator.sort(new Comparator<TrabajadorComparator>() {
            @Override
            public int compare(TrabajadorComparator o1, TrabajadorComparator o2) {
                if(o1.getName().compareTo(o2.getName()) ==0){
                    return o1.getEdad()- o2.getEdad();
                }else{
                    return o1.getName().compareTo(o2.getName());
                }
            }
        });

        trabajadorComparator.forEach(a-> System.out.println(a.getName() +" " + a.getEdad()+ " " + a.getDepartamento()));;
    }
}


class TrabajadorComparable implements Comparable<TrabajadorComparable>{
    private String name;
    private int edad;
    private String departamento;

    public TrabajadorComparable(String name,int edad,String departamento){
        this.name = name;
        this.edad = edad;
        this.departamento = departamento;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getName() {
        return name;
    }

    public int getEdad() {
        return edad;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public int compareTo(TrabajadorComparable tc) {
        if(this.getName().compareTo(tc.getName()) ==0){
            return this.getEdad()-tc.getEdad();
        }else{
            return this.getName().compareTo(tc.getName());
        }
    }
}
class TrabajadorComparator{
    private String name;
    private int edad;
    private String departamento;

    public TrabajadorComparator(String name,int edad,String departamento){
        this.name = name;
        this.edad = edad;
        this.departamento = departamento;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getName() {
        return name;
    }

    public int getEdad() {
        return edad;
    }

    public String getDepartamento() {
        return departamento;
    }
}


