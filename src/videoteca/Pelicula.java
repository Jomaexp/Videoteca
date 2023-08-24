/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoteca;

/**
 *Esta clase almacena los datos de una película
 * usando los siguientes atributos
 * <ul>
 * <li>titulo</li>
 * <li>anio</li>
 * <li>actor</li>
 * <li>director</li>
 * <li>genero</li>
 * <li>saga</li>
 * <li>hdd</li>
 * </ul>
 * @author José María Expósito Reyes
 * 
 */
public class Pelicula {
    
    private String titulo;
    private int anio;
    private String actor;
    private String director;
    private String genero;
    private String saga;
    private int hdd;

    public Pelicula() {
    }

    public Pelicula(String titulo, int anio, String actor, String director,
            String genero, String saga, int hdd) {
        this.titulo = titulo;
        this.anio = anio;
        this.actor = actor;
        this.director = director;
        this.genero = genero;
        this.saga = saga;
        this.hdd = hdd;
    }

    public Pelicula(String titulo) {
        this.titulo = titulo;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSaga() {
        return saga;
    }

    public void setSaga(String saga) {
        this.saga = saga;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }
    
    
    
    
    
}
