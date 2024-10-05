package Main;

import Autos.Color;
import Autos.TipoDeAutomovil;
import Autos.TipoDeCombustible;
import Autos.Vehiculo;

public class Ejecutar2 {
    public static void main(String[] args) {
        int velact = 100;
        int aceleracion = 20;
        int desaceleracion = 50;

        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setMarca("Ford");
        vehiculo.setModelo("2018");
        vehiculo.setMotor(3);
        vehiculo.setPuertas(5);
        vehiculo.setAsientos(6);
        vehiculo.setVelMax(250);
        vehiculo.setVelAct(0);
        int aceleracion1 = vehiculo.getVelAct() + (velact + aceleracion);

        System.out.println("Marca = " + vehiculo.getMarca() );
        System.out.println("Modelo = " + vehiculo.getModelo() );
        System.out.println("Motor = " + vehiculo.getMotor() );
        System.out.println("Tipo de combustible = " + TipoDeCombustible.DIESEL);
        System.out.println("Tipo de automovil = " + TipoDeAutomovil.EJECUTIVO);
        System.out.println("Puertas = " + vehiculo.getPuertas() );
        System.out.println("Asientos = " + vehiculo.getAsientos() );
        System.out.println("Velocidad Maxima = " + vehiculo.getVelMax() + " Km/h");
        System.out.println("Color = " + Color.NEGRO);
        System.out.println("Velocidad actual = " + velact + " Km/h");
        System.out.println("Velocidad actual = " + aceleracion1 + " Km/h");

        while(aceleracion1 < vehiculo.getVelMax()){
            if(aceleracion1 < 0){
                aceleracion1 = 0;
                System.out.println("Velocidad actual = " + aceleracion1 + " Km/h");
                System.out.println("No se puede decrementar a una velocidad negativa");
                break;
            }else
                System.out.println("Velocidad actual = " + aceleracion1 + " Km/h");
                aceleracion1 = aceleracion1 - desaceleracion;



        }





    }



}
