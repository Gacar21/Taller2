package Main;

import Planetas.Planeta;
import Planetas.TipodePlaneta;


public class Ejecutar {
    public static void main(String[] args) {
        Planeta tierra = new Planeta("tierra", 1, 1.08321E12, 5.9736E24, 149597871, "true");
        tierra.setDensidad(tierra.getMasa()/tierra.getVolumen());
         tierra.setDiametro((int) Math.pow((3*tierra.getVolumen())/(4*Math.PI),1.0/3) * 2);
        System.out.println("Nombre del planeta = " + tierra.getNombre());
        System.out.println("Cantidad de satelites = " + tierra.getSatelites());
        System.out.println("Masa del planeta = " + tierra.getMasa());
        System.out.println("Volumen del planeta = " + tierra.getVolumen());
        System.out.println("Diametro del planeta = " + tierra.getDiametro());
        System.out.println("Distancia al sol = " + tierra.getDistancia());


        if(tierra.getDiametro() <= tierra.getT() && tierra.getDiametro() >= tierra.getE()) {
            System.out.println("Tipo de planeta = : " + TipodePlaneta.TERRESTRE);
        }else
        if(tierra.getDiametro() <= tierra.getE() ){
            System.out.println("Tipo de planeta = " + TipodePlaneta.ENANO);
        }else {
            System.out.println("Tipo de planeta = " + TipodePlaneta.GASEOSO);

        }
        System.out.println("Es observable = " + tierra.getSee());
        tierra.setVista(tierra.getDistancia() >= tierra.getUA());
        System.out.println("Densidad del planeta = " + tierra.getDensidad());
        System.out.println("El planeta es exterior = " + tierra.isVista() );


        System.out.println(" ");

        Planeta jupiter = new Planeta("jupiter", 79, 1.4313E15, 1.899E27, 750000000, "true");

        jupiter.setDensidad(jupiter.getMasa()/jupiter.getVolumen());
        jupiter.setDiametro((int) Math.pow((3*jupiter.getVolumen())/(4*Math.PI),1.0/3) * 2);
        System.out.println("Nombre del planeta = " + jupiter.getNombre());
        System.out.println("Cantidad de satelites = " + jupiter.getSatelites());
        System.out.println("Masa del planeta = " + jupiter.getMasa());
        System.out.println("Volumen del planeta = " + jupiter.getVolumen());
        System.out.println("Diametro del planeta = " + jupiter.getDiametro());
        System.out.println("Distancia al sol = " + jupiter.getDistancia());
        jupiter.setVista(jupiter.getDistancia() >= jupiter.getUA());

        if(jupiter.getDiametro() <= jupiter.getT() && jupiter.getDiametro() >= jupiter.getE()) {
            System.out.println("Tipo de planeta = : " + TipodePlaneta.TERRESTRE);
        }else
        if(jupiter.getDiametro() <= jupiter.getE() ){
            System.out.println("Tipo de planeta = " + TipodePlaneta.ENANO);
        }else {
            System.out.println("Tipo de planeta = " + TipodePlaneta.GASEOSO);

        }
        System.out.println("Es observable = " + jupiter.getSee());
        System.out.println("Densidad del planeta = " + jupiter.getDensidad());
        System.out.println("El planeta es exterior = " + jupiter.isVista() );




    }
}
