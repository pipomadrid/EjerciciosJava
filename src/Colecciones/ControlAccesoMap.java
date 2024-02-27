package Colecciones;

import java.util.HashMap;
import java.util.Scanner;

public class ControlAccesoMap {

    public static void main(String[] args) {

        HashMap<String,String> userPassword = new HashMap<>();
        userPassword.put("Pedro","12345");
        userPassword.put("Juan","0123");

        Scanner sc = new Scanner(System.in);
        ControlAccesoMap cam = new ControlAccesoMap();

        while(!cam.access(userPassword,sc));

    }


    public String getUser(Scanner sc) {

        System.out.println("Introduzca su usuario o exit para salir");
        String name = sc.nextLine();
        return name;
    }

    public String getPassword(Scanner sc) {
        System.out.println("Introduzca su contraseña");
        String password = sc.nextLine();
        return password;

    }
    public boolean access(HashMap<String,String> userPwd,Scanner sc){
        String user = getUser(sc);
        if(user.equalsIgnoreCase("exit")) return true;
        String pwd = getPassword(sc);
        if(userPwd.containsKey(user) && userPwd.get(user).equals(pwd)) {
            System.out.println("Ha accedido al sistema");
            return true;
        }else{
            System.out.println("Acceso denegado");
            return false;
        }
    }
}
