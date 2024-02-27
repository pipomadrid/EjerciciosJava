package EjerciciosJavaIO;

import java.io.*;

public class EjerciciosIO {

    public static void main(String[] args) {
          String path = "D:\\Pedro\\CURSOS\\testJava\\miArchivoPrueba1.txt";
//        try(FileWriter fw = new FileWriter(path,true);
//        BufferedWriter bw = new BufferedWriter(fw)) {
//            for(int i = 1;i<=100;i++){
//                bw.write(i+ " ");
//            }
//        }catch (IOException ex){
//            System.out.println("No existe el archivo");
//        }

        try(FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr)){

            String line;
            while ((line = br.readLine())!= null) {
                System.out.println(line);
            }

        }catch (IOException ex) {
            System.out.println("No existe el archivo");
        }

        File file = new File(path);
        try(FileInputStream fis = new FileInputStream(file)){

          byte [] res = new byte[(int) file.length()];
          fis.read(res);
          for(byte x :res) {
              System.out.println(x);
          }

        }catch (IOException ex) {
            System.out.println("No existe el archivo");
        }




    }

}
