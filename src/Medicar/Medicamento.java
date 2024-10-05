package Medicar;

public class Medicamento {
   private String nombre;
   private String fabricante;
   private String via;

    public Medicamento(String nombre, String fabricante, String via) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.via = via;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }


    public static class Posologia {

        private String usuarios;
        private int dosis;
        private int periodo;
        private String recomendaciones;


        public Posologia(String usuarios, int dosis, int periodo, String recomendaciones) {
            this.usuarios = usuarios;
            this.dosis = dosis;
            this.periodo = periodo;
            this.recomendaciones = recomendaciones;
        }

        public String getUsuarios() {
            return usuarios;
        }

        public void setUsuarios(String usuarios) {
            this.usuarios = usuarios;
        }

        public int getDosis() {
            return dosis;
        }

        public void setDosis(int dosis) {
            this.dosis = dosis;
        }

        public int getPeriodo() {
            return periodo;
        }

        public void setPeriodo(int periodo) {
            this.periodo = periodo;
        }

        public String getRecomendaciones() {
            return recomendaciones;
        }

        public void setRecomendaciones(String recomendaciones) {
            this.recomendaciones = recomendaciones;
        }


    }

}

