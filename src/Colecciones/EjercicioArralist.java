package Colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class EjercicioArralist {
    int num=9;

    public static void main(String[] args) {

        Cliente client = new Cliente("Juan", "Juan@Gmail.com");
        client.addTelephone("6552569956");
        client.addTelephone("2586663312");
        client.addTelephone("2582555222");
        client.addTelephone("2586696322");

        var matchPhones = client.searchTelephone("258");
        matchPhones.forEach(System.out::println);

        System.out.println(client.getTelephone(0));

        client.addCompra("Hummus",5);
        client.addCompra("Lechuga",3);
        client.addCompra("Hummus",2);

        for(String product: client.getProductsNames()){
            System.out.println(product);
        }
        System.out.println(client.getTotalUnits());

        client.deleteProduct("Hummus");
        System.out.println(client.getTotalUnits());

    }
}

class Cliente{
    private String nombre;
    private String email;
    private ArrayList <String> phones;

    private HashMap<String,Integer> purchases;

    public Cliente(String nombre,String email) {
        this.email = email;
        this.nombre = nombre;
        phones  =new ArrayList<String>();
        purchases  = new HashMap<>();
    }
    public boolean addTelephone(String phone){
        if(!phones.contains(phone)){
            phones.add(phone);
            return true;
        }return false;
    }
    public String getTelephone(int index){
        if(index < phones.size()){
            return phones.get(index);
        }else return " ";
    }
    public ArrayList<String> searchTelephone(String number){
        var matchPhones = new ArrayList<String>();
       for(String phone:phones){
           if(phone.contains(number)){
               matchPhones.add(phone);
           }
       }
       return matchPhones;
    }

    public void addCompra(String product,int quantity){
        if(!purchases.containsKey(product)){
            purchases.put(product,quantity);
        }else{
            int oldValue = purchases.get(product);
            int newValue = oldValue + quantity;
            purchases.replace(product,newValue);
        }
    }

    public void deleteProduct(String product){
        purchases.remove(product);
    }

    public ArrayList<String> getProductsNames(){
        return new ArrayList(purchases.keySet());
    }

    public int getTotalUnits(){
        return  purchases.values().stream().mapToInt(a->a).sum();
    }

}
