package Test;

public class TestArreglos {

    public static void main(String[] args) {

        int edades[] = new int[10];

        for (int i = 0; i < edades.length; i++){

            edades[i] = (int)(Math.random()*99+1);

        }

        for (int i = 0; i < edades.length; i++){

            System.out.println(edades[i]);
        }

        
    }

}
