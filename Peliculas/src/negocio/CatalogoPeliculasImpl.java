package negocio;

import Excepciones.AccesoDatosEx;
import datos.AccesoDatos;
import datos.AccesoDatosImpl;
import domain.Pelicula;

public class CatalogoPeliculasImpl implements CatalogoPeliculas{

    private final AccesoDatos datos;

    public CatalogoPeliculasImpl() {
        this.datos = new AccesoDatosImpl();
    }

    @Override
    public void agregarPelicula(String nombrePelicula) {

        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;
        try {
            anexar = datos.existe(NOMBRE_RECURSO);
            datos.escribir(pelicula, NOMBRE_RECURSO, anexar);
        } catch (AccesoDatosEx e) {

            System.out.println("Error de acceso a datos");
            e.printStackTrace(System.out);

        }

    }

    @Override
    public void listarPeliculas() {

        try {
            
            var peliculas = this.datos.listar(NOMBRE_RECURSO);
            for (var pelicula: peliculas) {

                System.out.println("pelicula = " + pelicula);
                
            }
            
        } catch (AccesoDatosEx e) {
            
            System.out.println("Error de acceso a datos");
            
            e.printStackTrace(System.out);
            
        }


    }

    @Override
    public void buscarPelicula(String buscar) {

        String resultado = null;
        try {

            resultado = this.datos.buscar(NOMBRE_RECURSO, buscar);
            
        } catch (AccesoDatosEx e) {

            System.out.println("Error de acceso a datos");

            e.printStackTrace(System.out);

        }

        System.out.println("resultado = " + resultado);

    }

    @Override
    public void iniciarArchivo() {

        try {
            if(this.datos.existe(NOMBRE_RECURSO)){

                datos.borrar(NOMBRE_RECURSO);
                datos.crear(NOMBRE_RECURSO);

            }else{

                datos.crear(NOMBRE_RECURSO);

            }
        } catch (AccesoDatosEx e) {
            System.out.println("Error al iniciar catalogo de peliculas");

            e.printStackTrace(System.out);
        }

    }
}
