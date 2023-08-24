/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoteca;

import com.db4o.*;
import com.db4o.query.Query;

/**
 * Esta clase va a manejar la base de datos db4o de tipo Pelicula
 * Tendrá los siguientes atributos:
 * <ul>
 * <li> path: es de tipo String y sirve para introducir la ruta de la BDOO</li>
 * <li> db: es de tipo ObjectContainer para usar nuestra BDOO  </li>
 * </ul>
 * @author José María Expósito Reyes
 */
public class DbPeliculas {
    
    private String path="peliculas.yap";
    private ObjectContainer db;
    
    public DbPeliculas() {
    }
    
    /**
     * Este método sirve para insertar nuevas Películas en nuestra base de datos.
     * Recoge un objeto Película y lo introduce en la base de datos.
     * @param p 
     */
    public void altas (Pelicula p){
        db=Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),path);
        db.store(p);
        db.close();
    }
    
    /**
     * Este método elimina una película de la base de datos que coincida
     * con el título que se le ha pasado por argumento. 
     * @param titulo
     * @return cadena
     */
    public String bajas (String titulo){
        String cadena="";
        Pelicula obtenido;
        Pelicula p = new Pelicula(titulo);
        db=Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),path);
        ObjectSet<Pelicula> resultado = db.queryByExample(p);
        if (resultado.isEmpty()){
            cadena="No hay películas con ese título.";
        }else{
            obtenido = (Pelicula) resultado.next();
            db.delete(obtenido);
            cadena="La película con el título: "+ obtenido.getTitulo()+
                    " ha sido" + " borrada de la base de datos.";
        }
        db.close();
        return cadena;   
    }
    /**
     * Este método muestra en orden alfabético
     * todas las películas que existen en la BDOO. 
     * @return cadena
     */
    public String mostrar(){
        String cadena="";
        db=Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),path);
        Query q = db.query();
        q.constrain(Pelicula.class);
        q.descend("titulo").orderAscending();
        ObjectSet <Pelicula>resultado = q.execute();
        while (resultado.hasNext()){
            Pelicula p = (Pelicula) resultado.next();
            cadena = cadena +"Título: "+ p.getTitulo()+ System.lineSeparator()
                            +"Año: "+ p.getAnio()+ System.lineSeparator()
                            +"Actor: "+ p.getActor()+ System.lineSeparator()
                            +"Director: "+ p.getDirector()+ System.lineSeparator()
                            +"Género: "+ p.getGenero()+ System.lineSeparator()
                            +"Saga: "+ p.getSaga()+ System.lineSeparator()
                            +"HDD: "+ p.getHdd()+ System.lineSeparator()
                            +"----------------------------------------"+
                            "----------------------------------------"
                            +System.lineSeparator();
        }
        db.close();
        return cadena;
    }
    
    /**
     * Este método busca mediante un título pasado por parámetro si hay 
     * en la BD alguna película con ese título exacto. Si la hay, devuelve una
     * cadena con los datos de esa película, si no devuelve un mensaje advirtiendo
     * de ello.
     * @param titulo
     * @return cadena
     */
    public String buscartitulo(String titulo){
        Pelicula obtenido;
        String cadena="";
        Pelicula p = new Pelicula(titulo);
        db=Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),path);
        Query q = db.query();
        q.constrain(Pelicula.class);
        q.descend("titulo").constrain(titulo);
        q.descend("titulo").orderAscending();
        ObjectSet <Pelicula>resultado = q.execute();  
        if (resultado.isEmpty()){
            cadena = "No hay películas con ese título"+System.lineSeparator()+""
                    + " en la videoteca de Pepe.";
        }else{
            obtenido = (Pelicula) resultado.next();
            cadena= "Título: "+obtenido.getTitulo()+System.lineSeparator()+
                    "Año: "+obtenido.getAnio()+System.lineSeparator()+
                    "Actor: "+obtenido.getActor()+System.lineSeparator()+
                    "Director: "+obtenido.getDirector()+System.lineSeparator()+
                    "Género: "+obtenido.getGenero()+System.lineSeparator()+
                    "Saga: "+obtenido.getSaga()+System.lineSeparator()+
                    "HDD: "+obtenido.getHdd()+System.lineSeparator();
        }
        db.close();
        return cadena;
    }
    
    /**
     * Este método busca mediante un año pasado por parámetro si hay 
     * en la BD películas con ese año exacto. Si las hay, devuelve una
     * cadena con los datos de esas películas, si no devuelve un mensaje advirtiendo
     * de ello.
     * @param anio
     * @return cadena
     */
    
        public String buscaranio(int anio){
        Pelicula obtenido;
        String cadena="";
        db=Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),path);
        Query q = db.query();
        q.constrain(Pelicula.class);
        q.descend("anio").constrain(anio);
        q.descend("titulo").orderAscending();
        ObjectSet <Pelicula>resultado = q.execute();
        if (resultado.isEmpty()){
            cadena = "No hay películas con ese año "+System.lineSeparator()+
                    "en la videoteca de Pepe.";
        }else{
            while (resultado.hasNext()){
            obtenido = (Pelicula) resultado.next();
            cadena= cadena+ "Título: "+obtenido.getTitulo()+System.lineSeparator()+
                    "Año: "+obtenido.getAnio()+System.lineSeparator()+
                    "Actor: "+obtenido.getActor()+System.lineSeparator()+
                    "Director: "+obtenido.getDirector()+System.lineSeparator()+
                    "Género: "+obtenido.getGenero()+System.lineSeparator()+
                    "Saga: "+obtenido.getSaga()+System.lineSeparator()+
                    "HDD: "+obtenido.getHdd()+System.lineSeparator()
                    +"----------------------------------------"+
                    "----------------------------------------"
                    +System.lineSeparator();
            }
        }
        db.close();
        return cadena;
    }
        
     /**
     * Este método busca mediante un actor pasado por parámetro si hay 
     * en la BD películas con ese actor exacto. Si las hay, devuelve una
     * cadena con los datos de esas películas, si no devuelve un mensaje advirtiendo
     * de ello.
     * @param actor
     * @return cadena
     */
        
        public String buscaractor(String actor){
        Pelicula obtenido;
        String cadena="";
        db=Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),path);
        Query q = db.query();
        q.constrain(Pelicula.class);
        q.descend("actor").constrain(actor);
        q.descend("titulo").orderAscending();
        ObjectSet <Pelicula>resultado = q.execute();
        if (resultado.isEmpty()){
            cadena = "No hay películas con ese actor"+System.lineSeparator()+
                    "en la videoteca de Pepe.";
        }else{
            while (resultado.hasNext()){
            obtenido = (Pelicula) resultado.next();
            cadena= cadena+ "Título: "+obtenido.getTitulo()+System.lineSeparator()+
                    "Año: "+obtenido.getAnio()+System.lineSeparator()+
                    "Actor: "+obtenido.getActor()+System.lineSeparator()+
                    "Director: "+obtenido.getDirector()+System.lineSeparator()+
                    "Género: "+obtenido.getGenero()+System.lineSeparator()+
                    "Saga: "+obtenido.getSaga()+System.lineSeparator()+
                    "HDD: "+obtenido.getHdd()+System.lineSeparator()
                    +"----------------------------------------"+
                    "----------------------------------------"
                    +System.lineSeparator();
            }
        }
        db.close();
        return cadena;
       }
        
    /**
     * Este método busca mediante un director pasado por parámetro si hay 
     * en la BD películas con ese director exacto. Si las hay, devuelve una
     * cadena con los datos de esas películas, si no devuelve un mensaje advirtiendo
     * de ello.
     * @param director
     * @return cadena
     */
    
        public String buscardirector(String director){
        Pelicula obtenido;
        String cadena="";
        db=Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),path);
        Query q = db.query();
        q.constrain(Pelicula.class);
        q.descend("director").constrain(director);
        q.descend("titulo").orderAscending();
        ObjectSet <Pelicula>resultado = q.execute();
        if (resultado.isEmpty()){
            cadena = "No hay películas de ese director"+System.lineSeparator()+
                    "en la videoteca de Pepe.";
        }else{
            while (resultado.hasNext()){
            obtenido = (Pelicula) resultado.next();
            cadena= cadena+ "Título: "+obtenido.getTitulo()+System.lineSeparator()+
                    "Año: "+obtenido.getAnio()+System.lineSeparator()+
                    "Actor: "+obtenido.getActor()+System.lineSeparator()+
                    "Director: "+obtenido.getDirector()+System.lineSeparator()+
                    "Género: "+obtenido.getGenero()+System.lineSeparator()+
                    "Saga: "+obtenido.getSaga()+System.lineSeparator()+
                    "HDD: "+obtenido.getHdd()+System.lineSeparator()
                    +"----------------------------------------"+
                    "----------------------------------------"
                    +System.lineSeparator();
            }
        }
        db.close();
        return cadena;
    }    
        
    /**
     * Este método busca mediante un género pasado por parámetro si hay 
     * en la BD películas con ese género exacto. Si las hay, devuelve una
     * cadena con los datos de esas películas, si no devuelve un mensaje advirtiendo
     * de ello.
     * @param genero
     * @return cadena
     */
        
        public String buscargenero(String genero){
        Pelicula obtenido;
        String cadena="";
        db=Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),path);
        Query q = db.query();
        q.constrain(Pelicula.class);
        q.descend("genero").constrain(genero);
        q.descend("titulo").orderAscending();
        ObjectSet <Pelicula>resultado = q.execute();
        if (resultado.isEmpty()){
            cadena = "No hay películas de ese género"+System.lineSeparator()+
                    "en la videoteca de Pepe.";
        }else{
            while (resultado.hasNext()){
            obtenido = (Pelicula) resultado.next();
            cadena= cadena+ "Título: "+obtenido.getTitulo()+System.lineSeparator()+
                    "Año: "+obtenido.getAnio()+System.lineSeparator()+
                    "Actor: "+obtenido.getActor()+System.lineSeparator()+
                    "Director: "+obtenido.getDirector()+System.lineSeparator()+
                    "Género: "+obtenido.getGenero()+System.lineSeparator()+
                    "Saga: "+obtenido.getSaga()+System.lineSeparator()+
                    "HDD: "+obtenido.getHdd()+System.lineSeparator()
                    +"----------------------------------------"+
                    "----------------------------------------"
                    +System.lineSeparator();
            }
        }
        db.close();
        return cadena;
    }
        
    /**
     * Este método busca mediante una saga pasada por parámetro si hay 
     * en la BD películas de esa saga exacta. Si las hay, devuelve una
     * cadena con los datos de esas películas, si no devuelve un mensaje advirtiendo
     * de ello.
     * @param saga
     * @return cadena
     */
        
        public String buscarsaga(String saga){
        Pelicula obtenido;
        String cadena="";
        db=Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),path);
        Query q = db.query();
        q.constrain(Pelicula.class);
        q.descend("saga").constrain(saga);
        q.descend("titulo").orderAscending();
        ObjectSet <Pelicula>resultado = q.execute();
        if (resultado.isEmpty()){
            cadena = "No hay películas de esa saga"+System.lineSeparator()+
                    "en la videoteca de Pepe.";
        }else{
            while (resultado.hasNext()){
            obtenido = (Pelicula) resultado.next();
            cadena= cadena+ "Título: "+obtenido.getTitulo()+System.lineSeparator()+
                    "Año: "+obtenido.getAnio()+System.lineSeparator()+
                    "Actor: "+obtenido.getActor()+System.lineSeparator()+
                    "Director: "+obtenido.getDirector()+System.lineSeparator()+
                    "Género: "+obtenido.getGenero()+System.lineSeparator()+
                    "Saga: "+obtenido.getSaga()+System.lineSeparator()+
                    "HDD: "+obtenido.getHdd()+System.lineSeparator()
                    +"----------------------------------------"+
                    "----------------------------------------"
                    +System.lineSeparator();
            }
        }
        db.close();
        return cadena;
    }
        
    /**
     * Este método busca mediante un hdd pasado por parámetro si hay 
     * en la BD las películas contenidas en ese hdd. Si las hay, devuelve una
     * cadena con los datos de esas películas, si no devuelve un mensaje advirtiendo
     * de ello.
     * @param hdd
     * @return cadena
     */
        
        public String buscarhdd(int hdd){
        Pelicula obtenido;
        String cadena="";
        db=Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),path);
        Query q = db.query();
        q.constrain(Pelicula.class);
        q.descend("hdd").constrain(hdd);
        q.descend("titulo").orderAscending();
        ObjectSet <Pelicula>resultado = q.execute();
        if (resultado.isEmpty()){
            cadena = "No hay un disco duro con ese número"+System.lineSeparator()+
                    "en la videoteca de Pepe.";
        }else{
            while (resultado.hasNext()){
            obtenido = (Pelicula) resultado.next();
            cadena= cadena+ "Título: "+obtenido.getTitulo()+System.lineSeparator()+
                    "Año: "+obtenido.getAnio()+System.lineSeparator()+
                    "Actor: "+obtenido.getActor()+System.lineSeparator()+
                    "Director: "+obtenido.getDirector()+System.lineSeparator()+
                    "Género: "+obtenido.getGenero()+System.lineSeparator()+
                    "Saga: "+obtenido.getSaga()+System.lineSeparator()+
                    "HDD: "+obtenido.getHdd()+System.lineSeparator()
                    +"----------------------------------------"+
                    "----------------------------------------"
                    +System.lineSeparator();
            }
        }
        db.close();
        return cadena;
    }            
        
    /**
     * Este método modifica una Película de la BDOO siempre que exista una con
     * el mismo título que se le pasa por argumento. Se puede modificar su 
     * titulo, año, actor, director, género, saga y hdd.
     * @param titulo
     * @param anio
     * @param actor
     * @param director
     * @param genero
     * @param saga
     * @param hdd
     * @return 
     */
        
    public String modificar(String titulo, int anio, String actor, String director, 
            String genero,String saga, int hdd){
        String cadena;
        Pelicula obtenido;
        Pelicula p = new Pelicula(titulo);
        db=Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),path);
        ObjectSet<Pelicula> resultado = db.queryByExample(p);
        if (resultado.isEmpty()){
            cadena="No hay películas con el título introducido";
        }else{
            obtenido = (Pelicula) resultado.next();
            obtenido.setAnio(anio);
            obtenido.setActor(actor);
            obtenido.setDirector(director);
            obtenido.setGenero(genero);
            obtenido.setSaga(saga);
            obtenido.setHdd(hdd);
            db.store(obtenido);
            cadena="La película con el título "+obtenido.getTitulo()+
                    " ha sido modificada.";
        }
        db.close();
        return cadena;
        
    }
    
    
}
