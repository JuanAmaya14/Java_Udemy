package datos;

import Excepciones.*;
import domain.Pelicula;

import java.io.*;
import java.util.*;

public class AccesoDatosImpl implements AccesoDatos{

    public AccesoDatosImpl() {
    }

    @Override
    public boolean existe(String nombreArchivo) {
        var archivo = new File(nombreArchivo);

        return archivo.exists();

    }

    @Override
    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx {
        var archivo = new File(nombreArchivo);

        List<Pelicula> peliculas = new ArrayList<>();
        try {

            var entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;

            linea = entrada.readLine();

            while(linea != null){

                var pelicula = new Pelicula(linea);
                peliculas.add(pelicula);
                linea = entrada.readLine();

            }
            entrada.close();
        } catch (FileNotFoundException e) {

            e.printStackTrace();
            throw new LecturaDatosEx("Excepcion al listar peliculas: " + e.getMessage());

        } catch (IOException e){

            throw new LecturaDatosEx("Excepcion al listar peliculas: " + e.getMessage());

        }

        return peliculas;

    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx {

        var archivo = new File(nombreArchivo);

        try {
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(pelicula.toString());
            salida.close();
            System.out.println("Se ha escrito la informacion en el archivo");
        } catch (IOException e) {

            e.printStackTrace();
            throw new EscrituraDatosEx("Excepcion al escribir peliculas: " + e.getMessage());

        }


    }

    @Override
    public String buscar(String buscar, String nombreArchivo) throws LecturaDatosEx {

        var archivo = new File(nombreArchivo);
        String resultado = null;

        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            var indice = 1;
            while (linea != null){

                if (buscar != null && buscar.equalsIgnoreCase(linea)){

                    resultado = "Pelicula " + linea + " encontrada en el indice " + indice;
                    break;
                }

                linea = entrada.readLine();
                indice++;
            }
            entrada.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new LecturaDatosEx("Excepcion al buscar peliculas: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            throw new LecturaDatosEx("Excepcion al buscar peliculas: " + e.getMessage());
        }

        return resultado;

    }

    @Override
    public void crear(String nombreArchivo) throws AccesoDatosEx {

        var archivo = new File(nombreArchivo);

        try {
            var salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Se ha creado el archivo");
        } catch (IOException e) {
            e.printStackTrace();
            throw new AccesoDatosEx("Excepcion al crear archivo: " + e.getMessage());
        }


    }

    @Override
    public void borrar(String nombreArchivo) {

        var archivo = new File(nombreArchivo);

        if(archivo.exists()){

            archivo.delete();
            System.out.println("Se ha borrado el archivo");

        }

    }
}
