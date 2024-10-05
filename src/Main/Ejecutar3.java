package Main;

import Medicar.Medicamento;


public class Ejecutar3 {
    public static void main(String[] args) {
        Medicamento medica = new Medicamento("Aspirina", "Bayer", "Oral");
        Medicamento.Posologia poso = new Medicamento.Posologia("Adultos y mayores de 16 años",500,
                15,  "No debes tomar medicamento con el estomago vacio");

        System.out.println("Nombre del medicamento = " + medica.getNombre());
        System.out.println("Fabricante del medicamento = " + medica.getFabricante());
        System.out.println("Via de administracion = " + medica.getVia());
        System.out.println("Usuarios= " + poso.getUsuarios());
        System.out.println("Dosis= " + poso.getDosis());
        System.out.println("Periodo= " + poso.getPeriodo());
        System.out.println("Recomendaciones= " + poso.getRecomendaciones());



    }
}
