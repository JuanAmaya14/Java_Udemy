package manejoarchivos;

import java.io.*;

public class ManejoArchivos {

    public static void CrearArchivo(String nombreArchivo) {

        File archivo = new File(nombreArchivo);

        try {

            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se ha creado el archivo");

        } catch (FileNotFoundException ex) {

            ex.printStackTrace(System.out);

        }

    }

    public static void EscribirArchivo(String nombreArchivo, String contenido) {

        File archivo = new File(nombreArchivo);

        try {

            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha escrito el archivo");

        } catch (FileNotFoundException ex) {

            ex.printStackTrace(System.out);

        }

    }

    public static void AnexarArchivo(String nombreArchivo, String contenido) {

        File archivo = new File(nombreArchivo);

        try {

            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha anexado el archivo");

        } catch (FileNotFoundException ex) {

            ex.printStackTrace(System.out);

        } catch (IOException ex) {

            ex.printStackTrace(System.out);
        }

    }


    public static void LeerArchivo(String nombreArchivo) {

        var archivo = new File(nombreArchivo);

        try {

            var entrada = new BufferedReader(new FileReader(archivo));
            var lectura = entrada.readLine();
            while(lectura != null) {

                System.out.println("lectura = " + lectura);
                lectura = entrada.readLine();

            }
            entrada.close();

            } catch (FileNotFoundException ex) {

                ex.printStackTrace(System.out);

            } catch (IOException ex) {

                ex.printStackTrace(System.out);
            }


        }

    }

