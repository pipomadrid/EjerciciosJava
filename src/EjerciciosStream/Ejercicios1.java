package EjerciciosStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Ejercicios1 {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Cursos profesional de Java", 6.5f, 50, 200 ));
        cursos.add(new Curso("Cursos profesional de Python", 8.5f, 60, 800 ));
        cursos.add(new Curso("Cursos profesional de DB", 4.5f, 70, 700 ));
        cursos.add(new Curso("Cursos profesional de Android", 7.5f, 10, 400 ));
        cursos.add(new Curso("Cursos profesional de Escritura", 1.5f, 10, 300 ));

        List<Curso> cursosMoreFiveHours = cursos.stream().filter(a->a.getDuracion() > 5.0).collect(Collectors.toList());
        List<Curso> cursosLessTwoHours = cursos.stream().filter(a->a.getDuracion() < 2.0).collect(Collectors.toList());
        List<Curso> cursosMoresFifteeVideos = cursos.stream().filter(a->a.getVideos() > 50).collect(Collectors.toList());
        List<Curso> cursosThreeMoreDuration = cursos.stream().sorted((a,b)->(int) (b.getDuracion()-a.getDuracion())).limit(3).collect(Collectors.toList());
        OptionalDouble opt = cursos.stream().mapToDouble(Curso::getDuracion).average();
        Curso cursoMayorDuration = cursos.stream().max((a,b)-> (int) (a.getDuracion()-b.getDuracion())).get();
        List<String> cursosName = cursos.stream().map(Curso::getTitulo).collect(Collectors.toList());
        cursosName.forEach(System.out::println);
//        System.out.println(cursoMayorDuration.getTitulo());
      double average=opt.isPresent()?opt.getAsDouble():0.0;
//        System.out.println("Duración media " + average);

        List<Curso> cursosMoreThanAverageDuration = cursos.stream().filter(a->a.getDuracion() > average).collect(Collectors.toList());
       // cursosMoreThanAverageDuration.forEach(a-> System.out.println(a.getTitulo()));
        //cursosThreeMoreDuration.forEach(a-> System.out.println(a.getTitulo()));
        //cursos.stream().forEach(a-> System.out.println(a.getTitulo()+" " +a.getDuracion()));

    }

}


class Curso {

    private String titulo;
    private float duracion; //Expresada en horas
    private int videos; //cantidad de vídeos
    private int alumnos; //Cantidad de alumnos

    public Curso(String titulo, float duracion, int videos, int alumnos) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.videos = videos;
        this.alumnos = alumnos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public int getVideos() {
        return videos;
    }

    public void setVideos(int videos) {
        this.videos = videos;
    }

    public int getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(int alumnos) {
        this.alumnos = alumnos;
    }

}