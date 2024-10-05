package Main;

import Animales.*;

import java.awt.print.Paper;

public class Ejecutar5 {
    public static void main(String[] args) {

        Animal[] animals = new Animal[4];
        animals[0] = new Leon();
        animals[1] = new Gato();
        animals[2] = new Perro();
        animals[3] = new Lobo();

       for (int i = 0; i < animals.length; i++) {
           System.out.println("Nombre cientifico = " + animals[i].getNombreCientifico());
           System.out.println("Sonido que emite = " + animals[i].getSonido());
           System.out.println("alimento que consume = " + animals[i].getAlimento());
           System.out.println("Habitad = " + animals[i].getHabitad());
           System.out.println(" ");
       }
    }
}
