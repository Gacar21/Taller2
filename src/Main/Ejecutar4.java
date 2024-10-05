package Main;

import Herencia.CuentaAhorros;

public class Ejecutar4 {
    public static void main(String[] args) {

        CuentaAhorros cuenta = new CuentaAhorros(100000,0.10F);

        cuenta.setNumeroConsignaciones(50000);
        cuenta.setNumeroRetiros(70000);
        int NumT =0;
        float interes = cuenta.setTazaAnual(cuenta.getTazaAnual()/12);

        System.out.println("Ingresar saldo inicial = " + (int) cuenta.getSaldo());
        System.out.println("Ingresar Taza de intereses = " + cuenta.getTazaAnual());

        if(cuenta.getNumeroConsignaciones() > 0){
            System.out.println("Ingresar cantidad a consignar = " + cuenta.getNumeroConsignaciones());
             cuenta.setSaldo(cuenta.getNumeroConsignaciones() + (int) cuenta.getSaldo());

             NumT++;
        }else{
            System.out.println("No puedes ingresar un valor negativo");
        }

        System.out.println("Ingresar cantidad a retirar = " + cuenta.getNumeroRetiros());




            if(cuenta.getNumeroRetiros() < cuenta.getSaldo()){

                cuenta.setSaldo(cuenta.getSaldo() -  cuenta.getNumeroRetiros());
                float interesM = cuenta.getSaldo() * interes;
                System.out.println("Saldo = " + (interesM + cuenta.getSaldo()));
                NumT++;

            }else
                System.out.println("No tienes fondos suficientes para retirar");


                if(NumT > 4){
                    cuenta.setComisionMensual((NumT -4) * 1000);
                    System.out.println("Comision Mensual = " + cuenta.getComisionMensual());
                    System.out.println("numero de transacciones= " + NumT);
                }else
                    System.out.println("Comision Mensual = " + cuenta.getComisionMensual());
                    System.out.println("numero de transacciones= " + NumT);



    }
}
