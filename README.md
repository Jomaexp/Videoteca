Este es un pequeño programa para crear una base de datos de películas en la que podamos tener organizados nuestros distintos discos duros y buscar en ellos.
La interfaz es simple pero efectiva. 
Todo se guarda en un fichero .yap 

Podremos:
Buscar - Añadir - Modificar y Borrar películas del fichero que contiene todo el listado.

Podremos Buscar por los distintos criterios de las películas "título", "Año", "Actor", "Saga", "Director", "Genero", "HDD".

Todo se ha documentado con JavaDoc para entender el funcionamiento.

La interfaz se ha hecho lo suficientemente amigable para que cualquiera pueda entenderla.
En la carpeta DIST tenemos todo lo necesario para ejecutar la aplicación y probarla sin necesidad de acceder a las otras, que son de desarrollo.

El funcionamiento es bastante básico. Se basa en el uso de una clase "Pelicula" que almacena los datos de una película. Luego la clase "DBPeliculas" va a realizar la conexión con la BD, que consta de un archivo local "peliculas.yap". Aparte de eso hará todas las operaciones de búsqueda, añadido, borrado, modificación y muestra.

Si se tiene dudas sobre el funcionamiento, en el javadoc se explica con detenimiento.
