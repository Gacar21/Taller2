package Planetas;

public enum TipodePlaneta {
    GASEOSO(50000),

    TERRESTRE(15000),

    ENANO(2400);

    final int numero;


    TipodePlaneta(int numero) {
        this.numero = numero;
    }
}
/* public Planeta(String nombre, int satelites, double volumen, double masa, int distancia, String see) {
        this.nombre = nombre;
        this.satelites = satelites;
        this.volumen = volumen;
        this.masa = masa;
        this.distancia = distancia;
        this.see = see;
    }*/