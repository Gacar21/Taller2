package Planetas;

public class Planeta {

    double T = 15000;
    double G =50000;
    double E = 2400;
   double UA = 3.4 * 149597871;
   private String nombre;
   private int satelites;
   private double masa;
   private double volumen;
   private int distancia;
   private boolean Vista = true;
   private int diametro = 0;
   private double densidad;
   private String see;

    public Planeta(){

    }


    public Planeta(String nombre, int satelites, double volumen, double masa, int distancia, String see) {
        this.nombre = nombre;
        this.satelites = satelites;
        this.volumen = volumen;
        this.masa = masa;
        this.distancia = distancia;
        this.see = see;


    }

    public double getT() {
        return T;
    }

    public void setT(double t) {
        T = t;
    }

    public double getG() {
        return G;
    }

    public void setG(double g) {
        G = g;
    }

    public double getE() {
        return E;
    }

    public void setE(double e) {
        E = e;
    }

    public double getUA() {
        return UA;
    }

    public void setUA(double UA) {
        this.UA = UA;
    }

    public String getSee() {
        return see;
    }

    public void setSee(String see) {
        this.see = see;
    }

    public double getDensidad() {
        return densidad;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }


    public void setDensidad(double densidad) {
        this.densidad = densidad;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }


   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public int getSatelites() {
      return satelites;
   }

   public void setSatelites(int satelites) {
      this.satelites = satelites;
   }

   public double getMasa() {
      return masa;
   }

   public void setMasa(double masa) {
      this.masa = masa;
   }


   public int getDistancia() {
      return distancia;
   }

   public void setDistancia(int distancia) {
      this.distancia = distancia;
   }

   public boolean isVista() {
      return Vista;
   }

   public void setVista(boolean vista) {
      Vista = vista;
   }



    public void getVista() {
    }
}
